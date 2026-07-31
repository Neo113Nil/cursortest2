package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class r84 {

    /* renamed from: a, reason: collision with root package name */
    public final int f11058a;

    /* renamed from: b, reason: collision with root package name */
    public final zx3[] f11059b;

    /* renamed from: c, reason: collision with root package name */
    public final pw0 f11060c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f11061d;

    /* renamed from: e, reason: collision with root package name */
    public final w74[] f11062e;

    public r84(zx3[] zx3VarArr, w74[] w74VarArr, pw0 pw0Var, Object obj, byte[] bArr) {
        this.f11059b = zx3VarArr;
        this.f11062e = (w74[]) w74VarArr.clone();
        this.f11060c = pw0Var;
        this.f11061d = obj;
        this.f11058a = zx3VarArr.length;
    }

    public final boolean a(r84 r84Var, int i7) {
        return r84Var != null && n13.p(this.f11059b[i7], r84Var.f11059b[i7]) && n13.p(this.f11062e[i7], r84Var.f11062e[i7]);
    }

    public final boolean b(int i7) {
        return this.f11059b[i7] != null;
    }
}
