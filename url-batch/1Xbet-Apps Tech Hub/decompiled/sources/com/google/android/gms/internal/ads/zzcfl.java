package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzcfl extends zzcfh {
    public zzcfl(zzcdw zzcdwVar) {
        super(zzcdwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcfh
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzcfh
    public final boolean zzt(String str) {
        String zze = zzcbg.zze(str);
        zzcdw zzcdwVar = (zzcdw) this.zzc.get();
        if (zzcdwVar != null && zze != null) {
            zzcdwVar.zzt(zze, this);
        }
        zzcbn.zzj("VideoStreamNoopCache is doing nothing.");
        zzg(str, zze, "noop", "Noop cache is a noop.");
        return false;
    }
}
