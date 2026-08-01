package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzgzi extends zzgzg {
    zzgzi() {
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    final /* synthetic */ int zza(Object obj) {
        return ((zzgzh) obj).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    final /* synthetic */ int zzb(Object obj) {
        return ((zzgzh) obj).zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    final /* bridge */ /* synthetic */ Object zzc(Object obj) {
        zzgwm zzgwmVar = (zzgwm) obj;
        zzgzh zzgzhVar = zzgwmVar.zzc;
        if (zzgzhVar != zzgzh.zzc()) {
            return zzgzhVar;
        }
        zzgzh zzf = zzgzh.zzf();
        zzgwmVar.zzc = zzf;
        return zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    final /* synthetic */ Object zzd(Object obj) {
        return ((zzgwm) obj).zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    final /* bridge */ /* synthetic */ Object zze(Object obj, Object obj2) {
        if (zzgzh.zzc().equals(obj2)) {
            return obj;
        }
        if (zzgzh.zzc().equals(obj)) {
            return zzgzh.zze((zzgzh) obj, (zzgzh) obj2);
        }
        ((zzgzh) obj).zzd((zzgzh) obj2);
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    final /* synthetic */ Object zzf() {
        return zzgzh.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    final /* synthetic */ Object zzg(Object obj) {
        ((zzgzh) obj).zzh();
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    final /* bridge */ /* synthetic */ void zzh(Object obj, int i, int i2) {
        ((zzgzh) obj).zzj((i << 3) | 5, Integer.valueOf(i2));
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    final /* bridge */ /* synthetic */ void zzi(Object obj, int i, long j) {
        ((zzgzh) obj).zzj((i << 3) | 1, Long.valueOf(j));
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    final /* bridge */ /* synthetic */ void zzj(Object obj, int i, Object obj2) {
        ((zzgzh) obj).zzj((i << 3) | 3, obj2);
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    final /* bridge */ /* synthetic */ void zzk(Object obj, int i, zzgve zzgveVar) {
        ((zzgzh) obj).zzj((i << 3) | 2, zzgveVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    final /* bridge */ /* synthetic */ void zzl(Object obj, int i, long j) {
        ((zzgzh) obj).zzj(i << 3, Long.valueOf(j));
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    final void zzm(Object obj) {
        ((zzgwm) obj).zzc.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    final /* synthetic */ void zzn(Object obj, Object obj2) {
        ((zzgwm) obj).zzc = (zzgzh) obj2;
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    final /* synthetic */ void zzo(Object obj, Object obj2) {
        ((zzgwm) obj).zzc = (zzgzh) obj2;
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    final boolean zzq(zzgyh zzgyhVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    final /* synthetic */ void zzr(Object obj, zzgvu zzgvuVar) throws IOException {
        ((zzgzh) obj).zzk(zzgvuVar);
    }
}
