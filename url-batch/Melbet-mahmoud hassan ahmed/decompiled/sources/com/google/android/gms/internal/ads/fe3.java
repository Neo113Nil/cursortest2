package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
final class fe3 {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f5097a = Charset.forName("UTF-8");

    public static gl3 a(bl3 bl3Var) {
        dl3 F = gl3.F();
        F.s(bl3Var.G());
        for (al3 al3Var : bl3Var.J()) {
            el3 F2 = fl3.F();
            F2.s(al3Var.G().J());
            F2.u(al3Var.J());
            F2.t(al3Var.K());
            F2.r(al3Var.F());
            F.r(F2.o());
        }
        return F.o();
    }

    public static void b(bl3 bl3Var) {
        int G = bl3Var.G();
        int i7 = 0;
        boolean z6 = false;
        boolean z7 = true;
        for (al3 al3Var : bl3Var.J()) {
            if (al3Var.J() == 3) {
                if (!al3Var.I()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(al3Var.F())));
                }
                if (al3Var.K() == 2) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(al3Var.F())));
                }
                if (al3Var.J() == 2) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(al3Var.F())));
                }
                if (al3Var.F() == G) {
                    if (z6) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z6 = true;
                }
                z7 &= al3Var.G().M() == 5;
                i7++;
            }
        }
        if (i7 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z6 && !z7) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
    }
}
