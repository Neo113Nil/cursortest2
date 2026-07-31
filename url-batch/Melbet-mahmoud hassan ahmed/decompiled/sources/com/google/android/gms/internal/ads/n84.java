package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class n84 {

    /* renamed from: a, reason: collision with root package name */
    private final String[] f8981a;

    /* renamed from: b, reason: collision with root package name */
    private final int[] f8982b;

    /* renamed from: c, reason: collision with root package name */
    private final hm0[] f8983c;

    /* renamed from: d, reason: collision with root package name */
    private final int[] f8984d;

    /* renamed from: e, reason: collision with root package name */
    private final int[][][] f8985e;

    /* renamed from: f, reason: collision with root package name */
    private final hm0 f8986f;

    n84(String[] strArr, int[] iArr, hm0[] hm0VarArr, int[] iArr2, int[][][] iArr3, hm0 hm0Var) {
        this.f8981a = strArr;
        this.f8982b = iArr;
        this.f8983c = hm0VarArr;
        this.f8985e = iArr3;
        this.f8984d = iArr2;
        this.f8986f = hm0Var;
    }

    public final int a(int i7) {
        return this.f8982b[i7];
    }

    public final int b(int i7, int i8, int i9) {
        return this.f8985e[i7][i8][0] & 7;
    }

    public final hm0 c(int i7) {
        return this.f8983c[i7];
    }

    public final hm0 d() {
        return this.f8986f;
    }
}
