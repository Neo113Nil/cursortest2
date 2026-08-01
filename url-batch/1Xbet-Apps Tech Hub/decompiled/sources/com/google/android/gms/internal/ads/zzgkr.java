package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzgkr {
    private static final zzgkr zza = new zzgkr();
    private final AtomicReference zzb = new AtomicReference(new zzgln(new zzglj(null), null));

    zzgkr() {
    }

    public static zzgkr zza() {
        return zza;
    }

    public final Class zzb(Class cls) throws GeneralSecurityException {
        return ((zzgln) this.zzb.get()).zza(cls);
    }

    public final Object zzc(zzgcp zzgcpVar, Class cls) throws GeneralSecurityException {
        return ((zzgln) this.zzb.get()).zzb(zzgcpVar, cls);
    }

    public final Object zzd(zzgdk zzgdkVar, Class cls) throws GeneralSecurityException {
        return ((zzgln) this.zzb.get()).zzc(zzgdkVar, cls);
    }

    public final synchronized void zze(zzglg zzglgVar) throws GeneralSecurityException {
        zzglj zzgljVar = new zzglj((zzgln) this.zzb.get(), null);
        zzgljVar.zza(zzglgVar);
        this.zzb.set(new zzgln(zzgljVar, null));
    }

    public final synchronized void zzf(zzgdl zzgdlVar) throws GeneralSecurityException {
        zzglj zzgljVar = new zzglj((zzgln) this.zzb.get(), null);
        zzgljVar.zzb(zzgdlVar);
        this.zzb.set(new zzgln(zzgljVar, null));
    }
}
