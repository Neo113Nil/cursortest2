package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;

/* loaded from: classes.dex */
final class mx3 implements d64, w24 {

    /* renamed from: f, reason: collision with root package name */
    private final ox3 f8799f;

    /* renamed from: g, reason: collision with root package name */
    private c64 f8800g;

    /* renamed from: h, reason: collision with root package name */
    private v24 f8801h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ qx3 f8802i;

    public mx3(qx3 qx3Var, ox3 ox3Var) {
        c64 c64Var;
        v24 v24Var;
        this.f8802i = qx3Var;
        c64Var = qx3Var.f10901e;
        this.f8800g = c64Var;
        v24Var = qx3Var.f10902f;
        this.f8801h = v24Var;
        this.f8799f = ox3Var;
    }

    private final boolean a(int i7, s54 s54Var) {
        c64 c64Var;
        v24 v24Var;
        s54 s54Var2 = null;
        if (s54Var != null) {
            ox3 ox3Var = this.f8799f;
            int i8 = 0;
            while (true) {
                if (i8 >= ox3Var.f9878c.size()) {
                    break;
                }
                if (ox3Var.f9878c.get(i8).f5775d == s54Var.f5775d) {
                    s54Var2 = s54Var.c(Pair.create(ox3Var.f9877b, s54Var.f5772a));
                    break;
                }
                i8++;
            }
            if (s54Var2 == null) {
                return false;
            }
        }
        int i9 = i7 + this.f8799f.f9879d;
        c64 c64Var2 = this.f8800g;
        if (c64Var2.f3747a != i9 || !n13.p(c64Var2.f3748b, s54Var2)) {
            c64Var = this.f8802i.f10901e;
            this.f8800g = c64Var.a(i9, s54Var2, 0L);
        }
        v24 v24Var2 = this.f8801h;
        if (v24Var2.f13098a == i9 && n13.p(v24Var2.f13099b, s54Var2)) {
            return true;
        }
        v24Var = this.f8802i.f10902f;
        this.f8801h = v24Var.a(i9, s54Var2);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.d64
    public final void A(int i7, s54 s54Var, p54 p54Var) {
        if (a(i7, s54Var)) {
            this.f8800g.c(p54Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.d64
    public final void D(int i7, s54 s54Var, k54 k54Var, p54 p54Var) {
        if (a(i7, s54Var)) {
            this.f8800g.e(k54Var, p54Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.d64
    public final void h(int i7, s54 s54Var, k54 k54Var, p54 p54Var) {
        if (a(i7, s54Var)) {
            this.f8800g.g(k54Var, p54Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.d64
    public final void r(int i7, s54 s54Var, k54 k54Var, p54 p54Var) {
        if (a(i7, s54Var)) {
            this.f8800g.k(k54Var, p54Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.d64
    public final void u(int i7, s54 s54Var, k54 k54Var, p54 p54Var, IOException iOException, boolean z6) {
        if (a(i7, s54Var)) {
            this.f8800g.i(k54Var, p54Var, iOException, z6);
        }
    }
}
