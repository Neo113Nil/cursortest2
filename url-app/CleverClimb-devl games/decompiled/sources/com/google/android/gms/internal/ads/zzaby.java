package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzaby implements Runnable {
    private final /* synthetic */ zzaoj zzcaj;
    private final /* synthetic */ String zzcak;
    private final /* synthetic */ zzabv zzcal;

    zzaby(zzabv zzabvVar, zzaoj zzaojVar, String str) {
        this.zzcal = zzabvVar;
        this.zzcaj = zzaojVar;
        this.zzcak = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.ads.internal.zzbc zzbcVar;
        zzaoj zzaojVar = this.zzcaj;
        zzbcVar = this.zzcal.zzbzz;
        zzaojVar.set(zzbcVar.zzdv().get(this.zzcak));
    }
}
