package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class tc extends qd {
    public tc(gc gcVar, String str, String str2, j8 j8Var, int i7, int i8) {
        super(gcVar, "glZYRiAaVgXhfq7gmv5KdTlxK1u1W7CDU+wEOCdR48SsabliUSLxOyNuMGeUOQq8", "BXtZidg/K24z5N/YUAEC4oPRR4OaYUycAQjBgFG9Ir4=", j8Var, i7, 5);
    }

    @Override // com.google.android.gms.internal.ads.qd
    protected final void a() {
        this.f10653e.c0(-1L);
        this.f10653e.b0(-1L);
        int[] iArr = (int[]) this.f10654f.invoke(null, this.f10650b.b());
        synchronized (this.f10653e) {
            this.f10653e.c0(iArr[0]);
            this.f10653e.b0(iArr[1]);
            int i7 = iArr[2];
            if (i7 != Integer.MIN_VALUE) {
                this.f10653e.a0(i7);
            }
        }
    }
}
