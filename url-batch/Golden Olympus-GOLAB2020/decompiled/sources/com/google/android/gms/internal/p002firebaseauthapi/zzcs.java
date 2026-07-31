package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzwf;

/* loaded from: classes.dex */
public final class zzcs {
    public static final zzwf zza = zza(16);
    public static final zzwf zzb;

    static {
        zza(32);
        zza(16, 16);
        zza(32, 16);
        zzvc zzvcVar = zzvc.SHA256;
        zzb = zza(16, 16, 32, 16, zzvcVar);
        zza(32, 16, 32, 32, zzvcVar);
        zzwf.zza zza2 = zzwf.zza().zza(zzec.zza());
        zzxd zzxdVar = zzxd.TINK;
    }

    private static zzwf zza(int i4, int i5, int i6, int i7, zzvc zzvcVar) {
        zzss zzssVar = (zzss) ((zzakg) zzss.zzb().zza((zzsv) ((zzakg) zzsv.zzb().zza(16).zze())).zza(i4).zze());
        return (zzwf) ((zzakg) zzwf.zza().zza(((zzsm) ((zzakg) zzsm.zza().zza(zzssVar).zza((zzve) ((zzakg) zzve.zzc().zza((zzvh) ((zzakg) zzvh.zzc().zza(zzvcVar).zza(i7).zze())).zza(32).zze())).zze())).zzj()).zza(zzcy.zza()).zza(zzxd.TINK).zze());
    }

    private static zzwf zza(int i4, int i5) {
        return (zzwf) ((zzakg) zzwf.zza().zza(((zztb) ((zzakg) zztb.zzb().zza(i4).zza((zzte) ((zzakg) zzte.zzb().zza(16).zze())).zze())).zzj()).zza(zzdg.zza()).zza(zzxd.TINK).zze());
    }

    private static zzwf zza(int i4) {
        return (zzwf) ((zzakg) zzwf.zza().zza(((zztk) ((zzakg) zztk.zzc().zza(i4).zze())).zzj()).zza(zzdn.zza()).zza(zzxd.TINK).zze());
    }
}
