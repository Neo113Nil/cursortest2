package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzgdx implements zzgcf {
    private final zzgdk zza;
    private final zzgoq zzb;
    private final zzgoq zzc;

    /* synthetic */ zzgdx(zzgdk zzgdkVar, zzgdw zzgdwVar) {
        zzgoq zzgoqVar;
        this.zza = zzgdkVar;
        if (zzgdkVar.zzf()) {
            zzgor zzb = zzgkp.zza().zzb();
            zzgow zza = zzgkk.zza(zzgdkVar);
            this.zzb = zzb.zza(zza, "aead", "encrypt");
            zzgoqVar = zzb.zza(zza, "aead", "decrypt");
        } else {
            zzgoqVar = zzgkk.zza;
            this.zzb = zzgoqVar;
        }
        this.zzc = zzgoqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length > 5) {
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, length);
            for (zzgdg zzgdgVar : this.zza.zze(copyOf)) {
                try {
                    byte[] zza = ((zzgcf) zzgdgVar.zze()).zza(copyOfRange, bArr2);
                    zzgdgVar.zza();
                    int length2 = copyOfRange.length;
                    return zza;
                } catch (GeneralSecurityException unused) {
                }
            }
        }
        for (zzgdg zzgdgVar2 : this.zza.zze(zzgck.zza)) {
            try {
                byte[] zza2 = ((zzgcf) zzgdgVar2.zze()).zza(bArr, bArr2);
                zzgdgVar2.zza();
                int length3 = bArr.length;
                return zza2;
            } catch (GeneralSecurityException unused2) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }
}
