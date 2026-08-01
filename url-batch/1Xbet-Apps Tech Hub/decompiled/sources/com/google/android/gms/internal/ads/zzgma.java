package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzgma {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final Map zzd;

    /* synthetic */ zzgma(zzglu zzgluVar, zzglz zzglzVar) {
        this.zza = new HashMap(zzgluVar.zza);
        this.zzb = new HashMap(zzgluVar.zzb);
        this.zzc = new HashMap(zzgluVar.zzc);
        this.zzd = new HashMap(zzgluVar.zzd);
    }

    public final zzgcp zza(zzglt zzgltVar, @Nullable zzgdp zzgdpVar) throws GeneralSecurityException {
        zzglw zzglwVar = new zzglw(zzgltVar.getClass(), zzgltVar.zzd(), null);
        if (this.zzb.containsKey(zzglwVar)) {
            return ((zzgjy) this.zzb.get(zzglwVar)).zza(zzgltVar, zzgdpVar);
        }
        throw new GeneralSecurityException("No Key Parser for requested key type " + zzglwVar.toString() + " available");
    }

    public final zzgdd zzb(zzglt zzgltVar) throws GeneralSecurityException {
        zzglw zzglwVar = new zzglw(zzgltVar.getClass(), zzgltVar.zzd(), null);
        if (this.zzd.containsKey(zzglwVar)) {
            return ((zzgky) this.zzd.get(zzglwVar)).zza(zzgltVar);
        }
        throw new GeneralSecurityException("No Parameters Parser for requested key type " + zzglwVar.toString() + " available");
    }

    public final zzglt zzc(zzgdd zzgddVar, Class cls) throws GeneralSecurityException {
        zzgly zzglyVar = new zzgly(zzgddVar.getClass(), cls, null);
        if (this.zzc.containsKey(zzglyVar)) {
            return ((zzglc) this.zzc.get(zzglyVar)).zza(zzgddVar);
        }
        throw new GeneralSecurityException("No Key Format serializer for " + zzglyVar.toString() + " available");
    }

    public final boolean zzh(zzglt zzgltVar) {
        return this.zzb.containsKey(new zzglw(zzgltVar.getClass(), zzgltVar.zzd(), null));
    }

    public final boolean zzi(zzglt zzgltVar) {
        return this.zzd.containsKey(new zzglw(zzgltVar.getClass(), zzgltVar.zzd(), null));
    }
}
