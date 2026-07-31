package com.chartboost.sdk.impl;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class gb {
    public int a;
    public int b;
    public int c;
    public int d;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gb)) {
            return false;
        }
        gb gbVar = (gb) obj;
        return this.a == gbVar.a && this.b == gbVar.b && this.c == gbVar.c && this.d == gbVar.d;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.a) * 31) + Integer.hashCode(this.b)) * 31) + Integer.hashCode(this.c)) * 31) + Integer.hashCode(this.d);
    }

    public String toString() {
        return "IntRectangle(x=" + this.a + ", y=" + this.b + ", width=" + this.c + ", height=" + this.d + ")";
    }

    public gb(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final int c() {
        return this.a;
    }

    public final int d() {
        return this.b;
    }

    public final int b() {
        return this.c;
    }

    public final int a() {
        return this.d;
    }

    public final void c(int i) {
        this.a = i;
    }

    public /* synthetic */ gb(int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? 0 : i3, (i5 & 8) != 0 ? 0 : i4);
    }

    public final void d(int i) {
        this.b = i;
    }

    public final void b(int i) {
        this.c = i;
    }

    public final void a(int i) {
        this.d = i;
    }
}
