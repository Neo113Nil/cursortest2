package com.chartboost.sdk.impl;

/* loaded from: classes6.dex */
public final class wh {
    public final long a;
    public final long b;
    public final long c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wh)) {
            return false;
        }
        wh whVar = (wh) obj;
        return this.a == whVar.a && this.b == whVar.b && this.c == whVar.c;
    }

    public int hashCode() {
        return (((Long.hashCode(this.a) * 31) + Long.hashCode(this.b)) * 31) + Long.hashCode(this.c);
    }

    public String toString() {
        return "TimeSourceBodyFields(currentTimeMillis=" + this.a + ", nanoTime=" + this.b + ", uptimeMillis=" + this.c + ")";
    }

    public wh(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final long a() {
        return this.a;
    }
}
