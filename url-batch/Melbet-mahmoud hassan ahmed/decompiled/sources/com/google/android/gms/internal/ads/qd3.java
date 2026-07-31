package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

@Deprecated
/* loaded from: classes.dex */
public final class qd3 {
    @Deprecated
    public static final md3 a(byte[] bArr) {
        try {
            bl3 I = bl3.I(bArr, mp3.a());
            for (al3 al3Var : I.J()) {
                if (al3Var.G().M() == 2 || al3Var.G().M() == 3 || al3Var.G().M() == 4) {
                    throw new GeneralSecurityException("keyset contains secret key material");
                }
            }
            return md3.a(I);
        } catch (mq3 unused) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }
}
