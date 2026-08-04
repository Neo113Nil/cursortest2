package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzccu extends zzccq {
    public zzccu(zzcbd zzcbdVar) {
        super(zzcbdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzccq
    public final boolean zze(String str) {
        String zzf = com.google.android.gms.ads.internal.util.client.zzf.zzf(str);
        zzcbd zzcbdVar = (zzcbd) this.zzc.get();
        if (zzcbdVar != null && zzf != null) {
            zzcbdVar.zzt(zzf, this);
        }
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("VideoStreamNoopCache is doing nothing.");
        zzq(str, zzf, "noop", "Noop cache is a noop.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzccq
    public final void zzl() {
    }
}
