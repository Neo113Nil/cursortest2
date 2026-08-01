package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzgnw implements zzgdc {
    private final zzgdk zza;
    private final zzgoq zzb;
    private final zzgoq zzc;

    /* synthetic */ zzgnw(zzgdk zzgdkVar, zzgnv zzgnvVar) {
        zzgoq zzgoqVar;
        this.zza = zzgdkVar;
        if (zzgdkVar.zzf()) {
            zzgor zzb = zzgkp.zza().zzb();
            zzgow zza = zzgkk.zza(zzgdkVar);
            this.zzb = zzb.zza(zza, "mac", "compute");
            zzgoqVar = zzb.zza(zza, "mac", "verify");
        } else {
            zzgoqVar = zzgkk.zza;
            this.zzb = zzgoqVar;
        }
        this.zzc = zzgoqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgdc
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length <= 5) {
            throw new GeneralSecurityException("tag too short");
        }
        for (zzgdg zzgdgVar : this.zza.zze(Arrays.copyOf(bArr, 5))) {
            try {
                ((zzgdc) zzgdgVar.zzd()).zza(bArr, bArr2);
                zzgdgVar.zza();
                return;
            } catch (GeneralSecurityException unused) {
            }
        }
        for (zzgdg zzgdgVar2 : this.zza.zze(zzgck.zza)) {
            try {
                ((zzgdc) zzgdgVar2.zzd()).zza(bArr, bArr2);
                zzgdgVar2.zza();
                return;
            } catch (GeneralSecurityException unused2) {
            }
        }
        throw new GeneralSecurityException("invalid MAC");
    }
}
