package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@zzadh
/* loaded from: classes.dex */
public abstract class zzgq {
    private static MessageDigest zzaix;
    protected Object mLock = new Object();

    protected final MessageDigest zzhg() {
        synchronized (this.mLock) {
            if (zzaix != null) {
                return zzaix;
            }
            for (int i = 0; i < 2; i++) {
                try {
                    zzaix = MessageDigest.getInstance("MD5");
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return zzaix;
        }
    }

    abstract byte[] zzx(String str);
}
