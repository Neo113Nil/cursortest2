package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
final class qg3 extends kd3<pd3, gk3> {
    qg3(Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.ads.kd3
    public final /* bridge */ /* synthetic */ pd3 b(gk3 gk3Var) {
        gk3 gk3Var2 = gk3Var;
        int K = gk3Var2.K().K();
        SecretKeySpec secretKeySpec = new SecretKeySpec(gk3Var2.L().m(), "HMAC");
        int F = gk3Var2.K().F();
        int i7 = K - 2;
        if (i7 == 1) {
            return new sn3(new rn3("HMACSHA1", secretKeySpec), F);
        }
        if (i7 == 2) {
            return new sn3(new rn3("HMACSHA384", secretKeySpec), F);
        }
        if (i7 == 3) {
            return new sn3(new rn3("HMACSHA256", secretKeySpec), F);
        }
        if (i7 == 4) {
            return new sn3(new rn3("HMACSHA512", secretKeySpec), F);
        }
        if (i7 == 5) {
            return new sn3(new rn3("HMACSHA224", secretKeySpec), F);
        }
        throw new GeneralSecurityException("unknown hash");
    }
}
