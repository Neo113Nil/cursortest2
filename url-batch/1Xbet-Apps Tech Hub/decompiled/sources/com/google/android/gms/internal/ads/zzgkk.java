package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzgkk {
    public static final zzgoq zza = new zzgkj(null);

    public static zzgow zza(zzgdk zzgdkVar) {
        zzgcr zzgcrVar;
        zzgos zzgosVar = new zzgos();
        zzgosVar.zzb(zzgdkVar.zzb());
        Iterator it = zzgdkVar.zzd().iterator();
        while (it.hasNext()) {
            for (zzgdg zzgdgVar : (List) it.next()) {
                int zzh = zzgdgVar.zzh() - 2;
                if (zzh == 1) {
                    zzgcrVar = zzgcr.zza;
                } else if (zzh == 2) {
                    zzgcrVar = zzgcr.zzb;
                } else {
                    if (zzh != 3) {
                        throw new IllegalStateException("Unknown key status");
                    }
                    zzgcrVar = zzgcr.zzc;
                }
                int zza2 = zzgdgVar.zza();
                String zzf = zzgdgVar.zzf();
                if (zzf.startsWith("type.googleapis.com/google.crypto.")) {
                    zzf = zzf.substring(34);
                }
                zzgosVar.zza(zzgcrVar, zza2, zzf, zzgdgVar.zzc().name());
            }
        }
        if (zzgdkVar.zza() != null) {
            zzgosVar.zzc(zzgdkVar.zza().zza());
        }
        try {
            return zzgosVar.zzd();
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
