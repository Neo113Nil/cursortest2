package com.startapp.motiondetector;

/* loaded from: classes3.dex */
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

    public AmortizedMaximum(double d, double d2, double d3, double d4, double d5) {
        double d6 = d + d2;
        this.weightMaximum = d / d6;
        this.weightNewValue = d2 / d6;
        this.periodMillis = d3;
        this.periodMin = d4;
        this.periodScale = d5;
        this.periodZero = Utils.logisticalFunction(0.0d, d4, d5);
    }

    public double getMaximumValue() {
        return this.maximumValue;
    }

    public void setMaximumValue(double d) {
        this.maximumValue = d;
    }

    public long getMaximumTime() {
        return this.maximumTime;
    }

    public void setMaximumTime(long j) {
        this.maximumTime = j;
    }

    public static double calcImpact(long j, long j2, double d, double d2, double d3, double d4) {
        double max = Math.max(0L, j - j2) / d;
        if (d3 > 0.0d) {
            return Utils.logisticalFunction0(max, d2, d3, d4);
        }
        if (d3 < 0.0d) {
            return Utils.logisticalFunction1(max, d2, d3, d4);
        }
        return Utils.logisticalFunction(max, d2, d3);
    }

    public void add(long j, double d) {
        double calcImpact = this.maximumValue * calcImpact(j, this.maximumTime, this.periodMillis, this.periodMin, this.periodScale, this.periodZero);
        double d2 = (this.weightMaximum * calcImpact) + (this.weightNewValue * d);
        this.amortized = d2;
        if (calcImpact < d2) {
            this.maximumValue = d2;
            this.maximumTime = j;
        }
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
}
