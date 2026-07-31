package com.chartboost.sdk.impl;

/* loaded from: classes6.dex */
public final class x0 {
    public final double a;
    public final double b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return Double.compare(this.a, x0Var.a) == 0 && Double.compare(this.b, x0Var.b) == 0;
    }

    public int hashCode() {
        return (Double.hashCode(this.a) * 31) + Double.hashCode(this.b);
    }

    public String toString() {
        return "DoubleSize(width=" + this.a + ", height=" + this.b + ")";
    }

    public x0(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public final double b() {
        return this.a;
    }

    public final double a() {
        return this.b;
    }
}
