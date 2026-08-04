package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zztv implements zzva, zzrq {
    final /* synthetic */ zztx zza;
    private final Object zzb;
    private zzuz zzc;
    private zzrp zzd;

    public zztv(zztx zztxVar, Object obj) {
        Objects.requireNonNull(zztxVar);
        this.zza = zztxVar;
        this.zzc = zztxVar.zzf(null);
        this.zzd = zztxVar.zzh(null);
        this.zzb = obj;
    }

    private final boolean zzf(int i, zzup zzupVar) {
        zzup zzupVar2;
        if (zzupVar != null) {
            zzupVar2 = this.zza.zzx(this.zzb, zzupVar);
            if (zzupVar2 == null) {
                return false;
            }
        } else {
            zzupVar2 = null;
        }
        zztx zztxVar = this.zza;
        zztxVar.zzw(this.zzb, 0);
        zzuz zzuzVar = this.zzc;
        int i2 = zzuzVar.zza;
        if (!Objects.equals(zzuzVar.zzb, zzupVar2)) {
            this.zzc = zztxVar.zzg(0, zzupVar2);
        }
        zzrp zzrpVar = this.zzd;
        int i3 = zzrpVar.zza;
        if (Objects.equals(zzrpVar.zzb, zzupVar2)) {
            return true;
        }
        this.zzd = zztxVar.zzi(0, zzupVar2);
        return true;
    }

    private final zzul zzg(zzul zzulVar, zzup zzupVar) {
        zztx zztxVar = this.zza;
        Object obj = this.zzb;
        zztxVar.zzy(obj, zzulVar.zzc, zzupVar);
        zztxVar.zzy(obj, zzulVar.zzd, zzupVar);
        return zzulVar;
    }

    @Override // com.google.android.gms.internal.ads.zzva
    public final void zzcT(int i, zzup zzupVar, zzug zzugVar, zzul zzulVar, int i2) {
        if (zzf(0, zzupVar)) {
            zzuz zzuzVar = this.zzc;
            zzg(zzulVar, zzupVar);
            zzuzVar.zzd(zzugVar, zzulVar, i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzva
    public final void zzcU(int i, zzup zzupVar, zzug zzugVar, zzul zzulVar) {
        if (zzf(0, zzupVar)) {
            zzuz zzuzVar = this.zzc;
            zzg(zzulVar, zzupVar);
            zzuzVar.zze(zzugVar, zzulVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzva
    public final void zzcV(int i, zzup zzupVar, zzug zzugVar, zzul zzulVar) {
        if (zzf(0, zzupVar)) {
            zzuz zzuzVar = this.zzc;
            zzg(zzulVar, zzupVar);
            zzuzVar.zzf(zzugVar, zzulVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzva
    public final void zzcW(int i, zzup zzupVar, zzug zzugVar, zzul zzulVar, IOException iOException, boolean z) {
        if (zzf(0, zzupVar)) {
            zzuz zzuzVar = this.zzc;
            zzg(zzulVar, zzupVar);
            zzuzVar.zzg(zzugVar, zzulVar, iOException, z);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzva
    public final void zzcX(int i, zzup zzupVar, zzul zzulVar) {
        if (zzf(0, zzupVar)) {
            zzuz zzuzVar = this.zzc;
            zzg(zzulVar, zzupVar);
            zzuzVar.zzh(zzulVar);
        }
    }
}
