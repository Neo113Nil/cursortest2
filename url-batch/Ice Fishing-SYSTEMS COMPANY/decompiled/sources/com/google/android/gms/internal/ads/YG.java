package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public final class YG {
    public static YG a(JG jg, Provider provider) {
        YG yg = new YG();
        if (!XC.e(1)) {
            throw new GeneralSecurityException("Cannot use AES-CMAC in FIPS-mode.");
        }
        try {
            Mac.getInstance("AESCMAC", provider);
            jg.f25757d.b();
            new SecretKeySpec(((C3791qK) jg.f25756c.f26395u).b(), "AES");
            return yg;
        } catch (NoSuchAlgorithmException e6) {
            throw new GeneralSecurityException("AES-CMAC not available.", e6);
        }
    }
}
