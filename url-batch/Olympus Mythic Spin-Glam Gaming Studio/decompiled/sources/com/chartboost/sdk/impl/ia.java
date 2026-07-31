package com.chartboost.sdk.impl;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes10.dex */
public final class ia {
    public int a;
    public int b;
    public int c;
    public int d;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ia)) {
            return false;
        }
        ia iaVar = (ia) obj;
        return this.a == iaVar.a && this.b == iaVar.b && this.c == iaVar.c && this.d == iaVar.d;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.a) * 31) + Integer.hashCode(this.b)) * 31) + Integer.hashCode(this.c)) * 31) + Integer.hashCode(this.d);
    }

    public String toString() {
        return "ImpressionCounter(onVideoCompletedPlayCount=" + this.a + ", onRewardedVideoCompletedPlayCount=" + this.b + ", impressionNotifyDidCompleteAdPlayCount=" + this.c + ", impressionSendVideoCompleteRequestPlayCount=" + this.d + ")";
    }

    public ia(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final int d() {
        return this.a;
    }

    public final int c() {
        return this.b;
    }

    public final int a() {
        return this.c;
    }

    public final int b() {
        return this.d;
    }

    public final void d(int i) {
        this.a = i;
    }

    public /* synthetic */ ia(int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 1 : i, (i5 & 2) != 0 ? 1 : i2, (i5 & 4) != 0 ? 1 : i3, (i5 & 8) != 0 ? 1 : i4);
    }

    public final void c(int i) {
        this.b = i;
    }

    public final void a(int i) {
        this.c = i;
    }

    public final void b(int i) {
        this.d = i;
    }
}
