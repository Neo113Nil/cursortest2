package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* loaded from: classes.dex */
final class d4 implements w3 {

    /* renamed from: a, reason: collision with root package name */
    private final cq2 f4064a = new cq2(new byte[4], 4);

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ f4 f4065b;

    public d4(f4 f4Var) {
        this.f4065b = f4Var;
    }

    @Override // com.google.android.gms.internal.ads.w3
    public final void a(dr2 dr2Var) {
        SparseArray sparseArray;
        SparseArray sparseArray2;
        SparseArray sparseArray3;
        int i7;
        if (dr2Var.s() == 0 && (dr2Var.s() & 128) != 0) {
            dr2Var.g(6);
            int i8 = dr2Var.i() / 4;
            for (int i9 = 0; i9 < i8; i9++) {
                dr2Var.a(this.f4064a, 4);
                int c7 = this.f4064a.c(16);
                this.f4064a.j(3);
                if (c7 == 0) {
                    this.f4064a.j(13);
                } else {
                    int c8 = this.f4064a.c(13);
                    sparseArray2 = this.f4065b.f4977e;
                    if (sparseArray2.get(c8) == null) {
                        sparseArray3 = this.f4065b.f4977e;
                        sparseArray3.put(c8, new x3(new e4(this.f4065b, c8)));
                        f4 f4Var = this.f4065b;
                        i7 = f4Var.f4983k;
                        f4Var.f4983k = i7 + 1;
                    }
                }
            }
            sparseArray = this.f4065b.f4977e;
            sparseArray.remove(0);
        }
    }

    @Override // com.google.android.gms.internal.ads.w3
    public final void b(ky2 ky2Var, rc4 rc4Var, k4 k4Var) {
    }
}
