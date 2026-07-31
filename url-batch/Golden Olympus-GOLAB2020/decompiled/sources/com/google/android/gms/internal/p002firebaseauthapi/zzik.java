package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* loaded from: classes.dex */
final class zzik extends ThreadLocal<Cipher> {
    zzik() {
    }

    private static Cipher zza() {
        boolean zzb;
        try {
            Cipher zza = zzym.zza.zza("AES/GCM-SIV/NoPadding");
            zzb = zzih.zzb(zza);
            if (zzb) {
                return zza;
            }
            return null;
        } catch (GeneralSecurityException e4) {
            throw new IllegalStateException(e4);
        }
    }

    @Override // java.lang.ThreadLocal
    protected final /* synthetic */ Cipher initialValue() {
        return zza();
    }
}
