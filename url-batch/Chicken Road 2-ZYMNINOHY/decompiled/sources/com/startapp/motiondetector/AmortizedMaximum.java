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

    public AmortizedMaximum(double d4, double d5, double d6, double d7, double d8) {
        double d9 = d4 + d5;
        this.weightMaximum = d4 / d9;
        this.weightNewValue = d5 / d9;
        this.periodMillis = d6;
        this.periodMin = d7;
        this.periodScale = d8;
        this.periodZero = Utils.logisticalFunction(0.0d, d7, d8);
    }

    public static double calcImpact(long j4, long j5, double d4, double d5, double d6, double d7) {
        double max = Math.max(0L, j4 - j5) / d4;
        return d6 > 0.0d ? Utils.logisticalFunction0(max, d5, d6, d7) : d6 < 0.0d ? Utils.logisticalFunction1(max, d5, d6, d7) : Utils.logisticalFunction(max, d5, d6);
    }

    public void add(long j4, double d4) {
        double calcImpact = this.maximumValue * calcImpact(j4, this.maximumTime, this.periodMillis, this.periodMin, this.periodScale, this.periodZero);
        double d5 = (this.weightNewValue * d4) + (this.weightMaximum * calcImpact);
        this.amortized = d5;
        if (calcImpact < d5) {
            this.maximumValue = d5;
            this.maximumTime = j4;
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

    public void setMaximumTime(long j4) {
        this.maximumTime = j4;
    }

    public void setMaximumValue(double d4) {
        this.maximumValue = d4;
    }
}
