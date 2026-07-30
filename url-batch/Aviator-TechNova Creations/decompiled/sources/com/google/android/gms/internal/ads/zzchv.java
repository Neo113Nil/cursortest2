package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzchv extends zzchr {
    public zzchv(zzcge zzcgeVar) {
        super(zzcgeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzchr
    public final boolean zze(String str) {
        String zzf = com.google.android.gms.ads.internal.util.client.zzf.zzf(str);
        zzcge zzcgeVar = (zzcge) this.zzc.get();
        if (zzcgeVar != null && zzf != null) {
            zzcgeVar.zzt(zzf, this);
        }
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("VideoStreamNoopCache is doing nothing.");
        zzq(str, zzf, "noop", "Noop cache is a noop.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzchr
    public final void zzl() {
    }
}
