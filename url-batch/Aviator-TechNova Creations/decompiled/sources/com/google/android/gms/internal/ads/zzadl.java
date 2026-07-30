package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzadl {
    private final Handler zza;
    private final zzadm zzb;

    public zzadl(Handler handler, zzadm zzadmVar) {
        if (zzadmVar != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.zza = handler;
        this.zzb = zzadmVar;
    }

    public final void zza(final zzin zzinVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzadk
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzadl.this.zzk(zzinVar);
                }
            });
        }
    }

    public final void zzb(final String str, final long j, final long j2) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzadb
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzadl.this.zzl(str, j, j2);
                }
            });
        }
    }

    public final void zzc(final zzv zzvVar, final zzio zzioVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzadc
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzadl.this.zzm(zzvVar, zzioVar);
                }
            });
        }
    }

    public final void zzd(final int i, final long j) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzadd
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzadl.this.zzn(i, j);
                }
            });
        }
    }

    public final void zze(final long j, final int i) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzade
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzadl.this.zzo(j, i);
                }
            });
        }
    }

    public final void zzf(final zzbv zzbvVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzadf
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzadl.this.zzp(zzbvVar);
                }
            });
        }
    }

    public final void zzg(final Object obj) {
        Handler handler = this.zza;
        if (handler != null) {
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzadg
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzadl.this.zzq(obj, elapsedRealtime);
                }
            });
        }
    }

    public final void zzh(final String str) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzadh
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzadl.this.zzr(str);
                }
            });
        }
    }

    public final void zzi(final zzin zzinVar) {
        zzinVar.zza();
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzadi
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzadl.this.zzs(zzinVar);
                }
            });
        }
    }

    public final void zzj(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzadj
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzadl.this.zzt(exc);
                }
            });
        }
    }

    final /* synthetic */ void zzk(zzin zzinVar) {
        String str = zzfj.zza;
        this.zzb.zzb(zzinVar);
    }

    final /* synthetic */ void zzl(String str, long j, long j2) {
        String str2 = zzfj.zza;
        this.zzb.zzc(str, j, j2);
    }

    final /* synthetic */ void zzm(zzv zzvVar, zzio zzioVar) {
        String str = zzfj.zza;
        this.zzb.zzd(zzvVar, zzioVar);
    }

    final /* synthetic */ void zzn(int i, long j) {
        String str = zzfj.zza;
        this.zzb.zze(i, j);
    }

    final /* synthetic */ void zzo(long j, int i) {
        String str = zzfj.zza;
        this.zzb.zzj(j, i);
    }

    final /* synthetic */ void zzp(zzbv zzbvVar) {
        String str = zzfj.zza;
        this.zzb.zzf(zzbvVar);
    }

    final /* synthetic */ void zzq(Object obj, long j) {
        String str = zzfj.zza;
        this.zzb.zzg(obj, j);
    }

    final /* synthetic */ void zzr(String str) {
        String str2 = zzfj.zza;
        this.zzb.zzh(str);
    }

    final /* synthetic */ void zzs(zzin zzinVar) {
        zzinVar.zza();
        String str = zzfj.zza;
        this.zzb.zzi(zzinVar);
    }

    final /* synthetic */ void zzt(Exception exc) {
        String str = zzfj.zza;
        this.zzb.zzk(exc);
    }
}
