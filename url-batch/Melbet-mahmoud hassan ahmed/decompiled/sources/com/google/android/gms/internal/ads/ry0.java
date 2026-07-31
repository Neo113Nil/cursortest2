package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ry0 {

    /* renamed from: e, reason: collision with root package name */
    public static final ry0 f11565e = new ry0(0, 0, 0, 1.0f);

    /* renamed from: f, reason: collision with root package name */
    public static final my3<ry0> f11566f = new my3() { // from class: com.google.android.gms.internal.ads.qx0
    };

    /* renamed from: a, reason: collision with root package name */
    public final int f11567a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11568b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11569c;

    /* renamed from: d, reason: collision with root package name */
    public final float f11570d;

    public ry0(int i7, int i8, int i9, float f7) {
        this.f11567a = i7;
        this.f11568b = i8;
        this.f11569c = i9;
        this.f11570d = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ry0) {
            ry0 ry0Var = (ry0) obj;
            if (this.f11567a == ry0Var.f11567a && this.f11568b == ry0Var.f11568b && this.f11569c == ry0Var.f11569c && this.f11570d == ry0Var.f11570d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f11567a + 217) * 31) + this.f11568b) * 31) + this.f11569c) * 31) + Float.floatToRawIntBits(this.f11570d);
    }
}
