package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.a1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2906a1 {

    /* renamed from: a, reason: collision with root package name */
    public int f29153a;

    /* renamed from: b, reason: collision with root package name */
    public int f29154b;

    /* renamed from: c, reason: collision with root package name */
    public int f29155c;

    /* renamed from: d, reason: collision with root package name */
    public int f29156d;

    /* renamed from: e, reason: collision with root package name */
    public int f29157e;

    /* renamed from: f, reason: collision with root package name */
    public int f29158f;

    /* renamed from: g, reason: collision with root package name */
    public Object f29159g;

    public /* synthetic */ C2906a1(C3366iP c3366iP) {
        this.f29153a = c3366iP.f31384a;
        this.f29154b = c3366iP.f31385b;
        this.f29155c = c3366iP.f31386c;
        this.f29156d = c3366iP.f31387d;
        this.f29159g = c3366iP.f31388e;
        this.f29157e = c3366iP.f31389f;
        this.f29158f = c3366iP.f31390g;
    }

    public boolean a(int i) {
        int i4;
        int i9;
        int i10;
        int i11;
        if ((i & (-2097152)) != -2097152 || (i4 = (i >>> 19) & 3) == 1 || (i9 = (i >>> 17) & 3) == 0 || (i10 = (i >>> 12) & 15) == 0 || i10 == 15 || (i11 = (i >>> 10) & 3) == 3) {
            return false;
        }
        int i12 = i10 - 1;
        this.f29153a = i4;
        this.f29159g = AbstractC3194fG.f30665n[3 - i9];
        int i13 = AbstractC3194fG.f30673u[i11];
        this.f29155c = i13;
        if (i4 == 2) {
            i13 /= 2;
            this.f29155c = i13;
        } else if (i4 == 0) {
            i13 /= 4;
            this.f29155c = i13;
        }
        int i14 = (i >>> 9) & 1;
        int i15 = 1152;
        if (i9 != 1) {
            if (i9 != 2) {
                i15 = 384;
            }
        } else if (i4 != 3) {
            i15 = 576;
        }
        this.f29158f = i15;
        if (i9 == 3) {
            int i16 = i4 == 3 ? AbstractC3194fG.f30675v[i12] : AbstractC3194fG.f30677w[i12];
            this.f29157e = i16;
            this.f29154b = (((i16 * 12) / i13) + i14) * 4;
        } else {
            if (i4 == 3) {
                int i17 = i9 == 2 ? AbstractC3194fG.f30678x[i12] : AbstractC3194fG.f30679y[i12];
                this.f29157e = i17;
                this.f29154b = ((i17 * 144) / i13) + i14;
            } else {
                int i18 = AbstractC3194fG.f30680z[i12];
                this.f29157e = i18;
                this.f29154b = (((i9 == 1 ? 72 : 144) * i18) / i13) + i14;
            }
        }
        this.f29156d = ((i >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }
}
