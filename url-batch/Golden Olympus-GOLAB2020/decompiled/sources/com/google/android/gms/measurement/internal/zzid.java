package com.google.android.gms.measurement.internal;

import java.util.List;

/* loaded from: classes.dex */
final class zzid implements com.google.android.gms.internal.measurement.zzr {
    final /* synthetic */ zzif zza;

    zzid(zzif zzifVar) {
        this.zza = zzifVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzr
    public final void zza(int i4, String str, List list, boolean z4, boolean z5) {
        int i5 = i4 - 1;
        zzhc zzi = i5 != 0 ? i5 != 1 ? i5 != 3 ? i5 != 4 ? this.zza.zzu.zzaW().zzi() : z4 ? this.zza.zzu.zzaW().zzm() : !z5 ? this.zza.zzu.zzaW().zzl() : this.zza.zzu.zzaW().zzk() : this.zza.zzu.zzaW().zzj() : z4 ? this.zza.zzu.zzaW().zzh() : !z5 ? this.zza.zzu.zzaW().zzf() : this.zza.zzu.zzaW().zze() : this.zza.zzu.zzaW().zzd();
        int size = list.size();
        if (size == 1) {
            zzi.zzb(str, list.get(0));
            return;
        }
        if (size == 2) {
            zzi.zzc(str, list.get(0), list.get(1));
        } else if (size != 3) {
            zzi.zza(str);
        } else {
            zzi.zzd(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
