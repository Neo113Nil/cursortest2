package com.google.android.gms.measurement.internal;

import java.util.List;

/* loaded from: classes3.dex */
final class zzft implements com.google.android.gms.internal.measurement.zzr {
    final /* synthetic */ zzfv zza;

    zzft(zzfv zzfvVar) {
        this.zza = zzfvVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzr
    public final void zza(int i8, String str, List list, boolean z7, boolean z8) {
        int i9 = i8 - 1;
        zzes zzi = i9 != 0 ? i9 != 1 ? i9 != 3 ? i9 != 4 ? this.zza.zzt.zzaA().zzi() : z7 ? this.zza.zzt.zzaA().zzm() : !z8 ? this.zza.zzt.zzaA().zzl() : this.zza.zzt.zzaA().zzk() : this.zza.zzt.zzaA().zzj() : z7 ? this.zza.zzt.zzaA().zzh() : !z8 ? this.zza.zzt.zzaA().zze() : this.zza.zzt.zzaA().zzd() : this.zza.zzt.zzaA().zzc();
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
