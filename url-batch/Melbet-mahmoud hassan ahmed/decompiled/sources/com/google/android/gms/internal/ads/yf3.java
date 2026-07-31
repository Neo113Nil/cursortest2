package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECPrivateKeySpec;

/* loaded from: classes.dex */
final class yf3 extends kd3<ad3, tj3> {
    yf3(Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.ads.kd3
    public final /* bridge */ /* synthetic */ ad3 b(tj3 tj3Var) {
        tj3 tj3Var2 = tj3Var;
        qj3 G = tj3Var2.J().G();
        zj3 J = G.J();
        int c7 = kg3.c(J.K());
        byte[] m7 = tj3Var2.K().m();
        return new vm3((ECPrivateKey) cn3.f3897k.a("EC").generatePrivate(new ECPrivateKeySpec(new BigInteger(1, m7), an3.e(c7))), J.I().m(), kg3.b(J.L()), kg3.d(G.M()), new lg3(G.F().I()));
    }
}
