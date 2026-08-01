package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzamy implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzana zzc;

    zzamy(zzana zzanaVar, String str, long j) {
        this.zzc = zzanaVar;
        this.zza = str;
        this.zzb = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzanl zzanlVar;
        zzanl zzanlVar2;
        zzanlVar = this.zzc.zza;
        zzanlVar.zza(this.zza, this.zzb);
        zzana zzanaVar = this.zzc;
        zzanlVar2 = zzanaVar.zza;
        zzanlVar2.zzb(zzanaVar.toString());
    }
}
