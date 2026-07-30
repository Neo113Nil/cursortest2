package com.google.android.gms.measurement.internal;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.2 */
/* loaded from: classes3.dex */
final class zzft implements com.google.android.gms.internal.measurement.zzr {
    final /* synthetic */ zzfv zza;

    zzft(zzfv zzfvVar) {
        this.zza = zzfvVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzr
    public final void zza(int i, String str, List list, boolean z, boolean z2) {
        int i2 = i - 1;
        zzes zzi = i2 != 0 ? i2 != 1 ? i2 != 3 ? i2 != 4 ? this.zza.zzt.zzaA().zzi() : z ? this.zza.zzt.zzaA().zzm() : !z2 ? this.zza.zzt.zzaA().zzl() : this.zza.zzt.zzaA().zzk() : this.zza.zzt.zzaA().zzj() : z ? this.zza.zzt.zzaA().zzh() : !z2 ? this.zza.zzt.zzaA().zze() : this.zza.zzt.zzaA().zzd() : this.zza.zzt.zzaA().zzc();
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
