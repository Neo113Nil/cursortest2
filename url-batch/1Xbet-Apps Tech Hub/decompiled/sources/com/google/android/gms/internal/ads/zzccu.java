package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzccu implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzcda zzc;

    zzccu(zzcda zzcdaVar, String str, String str2) {
        this.zzc = zzcdaVar;
        this.zza = str;
        this.zzb = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcdb zzcdbVar;
        zzcdb zzcdbVar2;
        zzcda zzcdaVar = this.zzc;
        zzcdbVar = zzcdaVar.zzq;
        if (zzcdbVar != null) {
            String str = this.zza;
            String str2 = this.zzb;
            zzcdbVar2 = zzcdaVar.zzq;
            zzcdbVar2.zzb(str, str2);
        }
    }
}
