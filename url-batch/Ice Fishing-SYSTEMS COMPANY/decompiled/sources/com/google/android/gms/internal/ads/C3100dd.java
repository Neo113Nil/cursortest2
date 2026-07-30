package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.dd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3100dd {

    /* renamed from: d, reason: collision with root package name */
    public static final C3100dd f30070d = new C3100dd(0, 0, 1.0f);

    /* renamed from: a, reason: collision with root package name */
    public final int f30071a;

    /* renamed from: b, reason: collision with root package name */
    public final int f30072b;

    /* renamed from: c, reason: collision with root package name */
    public final float f30073c;

    static {
        String str = AbstractC3548lu.f32613a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(3, 36);
    }

    public C3100dd(int i, int i4, float f6) {
        this.f30071a = i;
        this.f30072b = i4;
        this.f30073c = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3100dd) {
            C3100dd c3100dd = (C3100dd) obj;
            if (this.f30071a == c3100dd.f30071a && this.f30072b == c3100dd.f30072b && this.f30073c == c3100dd.f30073c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f30073c) + ((((this.f30071a + 217) * 31) + this.f30072b) * 31);
    }
}
