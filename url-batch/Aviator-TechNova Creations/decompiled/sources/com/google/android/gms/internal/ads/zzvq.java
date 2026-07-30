package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzvq implements zzwv, zztk {
    final /* synthetic */ zzvs zza;
    private final Object zzb;
    private zzwu zzc;
    private zztj zzd;

    public zzvq(zzvs zzvsVar, Object obj) {
        Objects.requireNonNull(zzvsVar);
        this.zza = zzvsVar;
        this.zzc = zzvsVar.zzf(null);
        this.zzd = zzvsVar.zzh(null);
        this.zzb = obj;
    }

    private final boolean zzf(int i, zzwk zzwkVar) {
        zzwk zzwkVar2;
        if (zzwkVar != null) {
            zzwkVar2 = this.zza.zzx(this.zzb, zzwkVar);
            if (zzwkVar2 == null) {
                return false;
            }
        } else {
            zzwkVar2 = null;
        }
        zzvs zzvsVar = this.zza;
        zzvsVar.zzw(this.zzb, 0);
        zzwu zzwuVar = this.zzc;
        int i2 = zzwuVar.zza;
        if (!Objects.equals(zzwuVar.zzb, zzwkVar2)) {
            this.zzc = zzvsVar.zzg(0, zzwkVar2);
        }
        zztj zztjVar = this.zzd;
        int i3 = zztjVar.zza;
        if (Objects.equals(zztjVar.zzb, zzwkVar2)) {
            return true;
        }
        this.zzd = zzvsVar.zzi(0, zzwkVar2);
        return true;
    }

    private final zzwg zzg(zzwg zzwgVar, zzwk zzwkVar) {
        zzvs zzvsVar = this.zza;
        Object obj = this.zzb;
        zzvsVar.zzy(obj, zzwgVar.zzc, zzwkVar);
        zzvsVar.zzy(obj, zzwgVar.zzd, zzwkVar);
        return zzwgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzwv
    public final void zzai(int i, zzwk zzwkVar, zzwb zzwbVar, zzwg zzwgVar, int i2) {
        if (zzf(0, zzwkVar)) {
            zzwu zzwuVar = this.zzc;
            zzg(zzwgVar, zzwkVar);
            zzwuVar.zzd(zzwbVar, zzwgVar, i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwv
    public final void zzaj(int i, zzwk zzwkVar, zzwb zzwbVar, zzwg zzwgVar) {
        if (zzf(0, zzwkVar)) {
            zzwu zzwuVar = this.zzc;
            zzg(zzwgVar, zzwkVar);
            zzwuVar.zze(zzwbVar, zzwgVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwv
    public final void zzak(int i, zzwk zzwkVar, zzwb zzwbVar, zzwg zzwgVar) {
        if (zzf(0, zzwkVar)) {
            zzwu zzwuVar = this.zzc;
            zzg(zzwgVar, zzwkVar);
            zzwuVar.zzf(zzwbVar, zzwgVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwv
    public final void zzal(int i, zzwk zzwkVar, zzwb zzwbVar, zzwg zzwgVar, IOException iOException, boolean z) {
        if (zzf(0, zzwkVar)) {
            zzwu zzwuVar = this.zzc;
            zzg(zzwgVar, zzwkVar);
            zzwuVar.zzg(zzwbVar, zzwgVar, iOException, z);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwv
    public final void zzam(int i, zzwk zzwkVar, zzwg zzwgVar) {
        if (zzf(0, zzwkVar)) {
            zzwu zzwuVar = this.zzc;
            zzg(zzwgVar, zzwkVar);
            zzwuVar.zzh(zzwgVar);
        }
    }
}
