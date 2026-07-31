package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzwl;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzbi {
    public static final byte[] zza = new byte[0];

    public static byte[] zza(zzwl.zza zzaVar) {
        int i4 = zzbh.zza[zzaVar.zzf().ordinal()];
        if (i4 == 1 || i4 == 2) {
            return zzor.zza(zzaVar.zza()).zzb();
        }
        if (i4 == 3) {
            return zzor.zzb(zzaVar.zza()).zzb();
        }
        if (i4 == 4) {
            return zza;
        }
        throw new GeneralSecurityException("unknown output prefix type");
    }
}
