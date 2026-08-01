package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzglj {
    private final Map zza;
    private final Map zzb;

    private zzglj() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }

    public final zzglj zza(zzglg zzglgVar) throws GeneralSecurityException {
        zzgll zzgllVar = new zzgll(zzglgVar.zzc(), zzglgVar.zzd(), null);
        if (this.zza.containsKey(zzgllVar)) {
            zzglg zzglgVar2 = (zzglg) this.zza.get(zzgllVar);
            if (!zzglgVar2.equals(zzglgVar) || !zzglgVar.equals(zzglgVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(zzgllVar.toString()));
            }
        } else {
            this.zza.put(zzgllVar, zzglgVar);
        }
        return this;
    }

    public final zzglj zzb(zzgdl zzgdlVar) throws GeneralSecurityException {
        Map map = this.zzb;
        Class zzb = zzgdlVar.zzb();
        if (map.containsKey(zzb)) {
            zzgdl zzgdlVar2 = (zzgdl) this.zzb.get(zzb);
            if (!zzgdlVar2.equals(zzgdlVar) || !zzgdlVar.equals(zzgdlVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(zzb.toString()));
            }
        } else {
            this.zzb.put(zzb, zzgdlVar);
        }
        return this;
    }

    /* synthetic */ zzglj(zzgli zzgliVar) {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }

    /* synthetic */ zzglj(zzgln zzglnVar, zzgli zzgliVar) {
        Map map;
        Map map2;
        map = zzglnVar.zza;
        this.zza = new HashMap(map);
        map2 = zzglnVar.zzb;
        this.zzb = new HashMap(map2);
    }
}
