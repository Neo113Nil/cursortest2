package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
final class w1 extends h2 {

    /* renamed from: n, reason: collision with root package name */
    private dd4 f13657n;

    /* renamed from: o, reason: collision with root package name */
    private v1 f13658o;

    w1() {
    }

    private static boolean j(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // com.google.android.gms.internal.ads.h2
    protected final long a(dr2 dr2Var) {
        if (!j(dr2Var.h())) {
            return -1L;
        }
        int i7 = (dr2Var.h()[2] & 255) >> 4;
        if (i7 != 6) {
            if (i7 == 7) {
                i7 = 7;
            }
            int a7 = xc4.a(dr2Var, i7);
            dr2Var.f(0);
            return a7;
        }
        dr2Var.g(4);
        dr2Var.C();
        int a72 = xc4.a(dr2Var, i7);
        dr2Var.f(0);
        return a72;
    }

    @Override // com.google.android.gms.internal.ads.h2
    protected final void b(boolean z6) {
        super.b(z6);
        if (z6) {
            this.f13657n = null;
            this.f13658o = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.h2
    protected final boolean c(dr2 dr2Var, long j7, d2 d2Var) {
        byte[] h7 = dr2Var.h();
        dd4 dd4Var = this.f13657n;
        if (dd4Var == null) {
            dd4 dd4Var2 = new dd4(h7, 17);
            this.f13657n = dd4Var2;
            d2Var.f4046a = dd4Var2.c(Arrays.copyOfRange(h7, 9, dr2Var.l()), null);
            return true;
        }
        if ((h7[0] & Byte.MAX_VALUE) == 3) {
            cd4 b7 = ad4.b(dr2Var);
            dd4 f7 = dd4Var.f(b7);
            this.f13657n = f7;
            this.f13658o = new v1(f7, b7);
            return true;
        }
        if (!j(h7)) {
            return true;
        }
        v1 v1Var = this.f13658o;
        if (v1Var != null) {
            v1Var.a(j7);
            d2Var.f4047b = this.f13658o;
        }
        Objects.requireNonNull(d2Var.f4046a);
        return false;
    }
}
