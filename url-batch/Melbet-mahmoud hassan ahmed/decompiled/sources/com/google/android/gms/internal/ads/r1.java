package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class r1 {

    /* renamed from: a, reason: collision with root package name */
    public final o1 f10957a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10958b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f10959c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f10960d;

    /* renamed from: e, reason: collision with root package name */
    public final int f10961e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f10962f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f10963g;

    /* renamed from: h, reason: collision with root package name */
    public final long f10964h;

    public r1(o1 o1Var, long[] jArr, int[] iArr, int i7, long[] jArr2, int[] iArr2, long j7) {
        int length = iArr.length;
        int length2 = jArr2.length;
        wu1.d(length == length2);
        int length3 = jArr.length;
        wu1.d(length3 == length2);
        int length4 = iArr2.length;
        wu1.d(length4 == length2);
        this.f10957a = o1Var;
        this.f10959c = jArr;
        this.f10960d = iArr;
        this.f10961e = i7;
        this.f10962f = jArr2;
        this.f10963g = iArr2;
        this.f10964h = j7;
        this.f10958b = length3;
        if (length4 > 0) {
            int i8 = length4 - 1;
            iArr2[i8] = iArr2[i8] | 536870912;
        }
    }

    public final int a(long j7) {
        for (int J = n13.J(this.f10962f, j7, true, false); J >= 0; J--) {
            if ((this.f10963g[J] & 1) != 0) {
                return J;
            }
        }
        return -1;
    }

    public final int b(long j7) {
        for (int H = n13.H(this.f10962f, j7, true, false); H < this.f10962f.length; H++) {
            if ((this.f10963g[H] & 1) != 0) {
                return H;
            }
        }
        return -1;
    }
}
