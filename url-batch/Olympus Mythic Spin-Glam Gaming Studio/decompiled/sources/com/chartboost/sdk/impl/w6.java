package com.chartboost.sdk.impl;

/* loaded from: classes6.dex */
public final class w6 {
    public final int a;
    public final int b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w6)) {
            return false;
        }
        w6 w6Var = (w6) obj;
        return this.a == w6Var.a && this.b == w6Var.b;
    }

    public int hashCode() {
        return (Integer.hashCode(this.a) * 31) + Integer.hashCode(this.b);
    }

    public String toString() {
        return "DisplaySize(width=" + this.a + ", height=" + this.b + ")";
    }

    public w6(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final int a() {
        return this.b;
    }

    public final int b() {
        return this.a;
    }
}
