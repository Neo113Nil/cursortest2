package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzgln {
    private final Map zza;
    private final Map zzb;

    /* synthetic */ zzgln(zzglj zzgljVar, zzglm zzglmVar) {
        this.zza = new HashMap(zzgljVar.zza);
        this.zzb = new HashMap(zzgljVar.zzb);
    }

    public final Class zza(Class cls) throws GeneralSecurityException {
        if (this.zzb.containsKey(cls)) {
            return ((zzgdl) this.zzb.get(cls)).zza();
        }
        throw new GeneralSecurityException("No input primitive class for " + cls.toString() + " available");
    }

    public final Object zzb(zzgcp zzgcpVar, Class cls) throws GeneralSecurityException {
        zzgll zzgllVar = new zzgll(zzgcpVar.getClass(), cls, null);
        if (this.zza.containsKey(zzgllVar)) {
            return ((zzglg) this.zza.get(zzgllVar)).zza(zzgcpVar);
        }
        throw new GeneralSecurityException("No PrimitiveConstructor for " + zzgllVar.toString() + " available");
    }

    public final Object zzc(zzgdk zzgdkVar, Class cls) throws GeneralSecurityException {
        if (!this.zzb.containsKey(cls)) {
            throw new GeneralSecurityException("No wrapper found for ".concat(cls.toString()));
        }
        zzgdl zzgdlVar = (zzgdl) this.zzb.get(cls);
        if (zzgdkVar.zzc().equals(zzgdlVar.zza()) && zzgdlVar.zza().equals(zzgdkVar.zzc())) {
            return zzgdlVar.zzc(zzgdkVar);
        }
        throw new GeneralSecurityException("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
    }
}
