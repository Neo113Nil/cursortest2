package com.startapp.motiondetector;

/* loaded from: classes.dex */
public class AmortizedMaximum implements SignalProcessor, Valuable {
    private double amortized;
    private long maximumTime;
    private double maximumValue;
    private final double periodMillis;
    private final double periodMin;
    private final double periodScale;
    private final double periodZero;
    private final double weightMaximum;
    private final double weightNewValue;

    public AmortizedMaximum(double d3, double d4, double d5, double d6, double d7) {
        double d8 = d3 + d4;
        this.weightMaximum = d3 / d8;
        this.weightNewValue = d4 / d8;
        this.periodMillis = d5;
        this.periodMin = d6;
        this.periodScale = d7;
        this.periodZero = Utils.logisticalFunction(0.0d, d6, d7);
    }

    public static double calcImpact(long j3, long j4, double d3, double d4, double d5, double d6) {
        double max = Math.max(0L, j3 - j4) / d3;
        return d5 > 0.0d ? Utils.logisticalFunction0(max, d4, d5, d6) : d5 < 0.0d ? Utils.logisticalFunction1(max, d4, d5, d6) : Utils.logisticalFunction(max, d4, d5);
    }

    public void add(long j3, double d3) {
        double calcImpact = this.maximumValue * calcImpact(j3, this.maximumTime, this.periodMillis, this.periodMin, this.periodScale, this.periodZero);
        double d4 = (this.weightNewValue * d3) + (this.weightMaximum * calcImpact);
        this.amortized = d4;
        if (calcImpact < d4) {
            this.maximumValue = d4;
            this.maximumTime = j3;
        }
    }

    public long getMaximumTime() {
        return this.maximumTime;
    }

    public double getMaximumValue() {
        return this.maximumValue;
    }

    @Override // com.startapp.motiondetector.Valuable
    public double getValue() {
        return this.amortized;
    }

    @Override // com.startapp.motiondetector.SignalProcessor
    public void reset() {
        this.maximumValue = 0.0d;
        this.maximumTime = 0L;
        this.amortized = 0.0d;
    }

    public void setMaximumTime(long j3) {
        this.maximumTime = j3;
    }

    public void setMaximumValue(double d3) {
        this.maximumValue = d3;
    }
}
