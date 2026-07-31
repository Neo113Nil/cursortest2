package com.chartboost.sdk.impl;

import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class cg {
    public final int a;
    public final int b;
    public final float c;
    public final WindowInsetsCompat d;
    public final Insets e;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cg)) {
            return false;
        }
        cg cgVar = (cg) obj;
        return this.a == cgVar.a && this.b == cgVar.b && Float.compare(this.c, cgVar.c) == 0 && Intrinsics.areEqual(this.d, cgVar.d) && Intrinsics.areEqual(this.e, cgVar.e);
    }

    public int hashCode() {
        int hashCode = ((((Integer.hashCode(this.a) * 31) + Integer.hashCode(this.b)) * 31) + Float.hashCode(this.c)) * 31;
        WindowInsetsCompat windowInsetsCompat = this.d;
        int hashCode2 = (hashCode + (windowInsetsCompat == null ? 0 : windowInsetsCompat.hashCode())) * 31;
        Insets insets = this.e;
        return hashCode2 + (insets != null ? insets.hashCode() : 0);
    }

    public String toString() {
        return "RenderingContainer(width=" + this.a + ", height=" + this.b + ", density=" + this.c + ", windowInsets=" + this.d + ", systemInsets=" + this.e + ")";
    }

    public cg(int i, int i2, float f, WindowInsetsCompat windowInsetsCompat, Insets insets) {
        this.a = i;
        this.b = i2;
        this.c = f;
        this.d = windowInsetsCompat;
        this.e = insets;
    }

    public final int d() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final float a() {
        return this.c;
    }

    public final Insets c() {
        return this.e;
    }

    public /* synthetic */ cg(int i, int i2, float f, WindowInsetsCompat windowInsetsCompat, Insets insets, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, f, (i3 & 8) != 0 ? null : windowInsetsCompat, (i3 & 16) != 0 ? null : insets);
    }
}
