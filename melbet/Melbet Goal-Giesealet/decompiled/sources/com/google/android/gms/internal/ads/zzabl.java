package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzabl {
    private final Handler zza;
    private final zzabm zzb;

    public zzabl(Handler handler, zzabm zzabmVar) {
        if (zzabmVar != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.zza = handler;
        this.zzb = zzabmVar;
    }

    public final void zza(final zzhr zzhrVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabk
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzabl.this.zzk(zzhrVar);
                }
            });
        }
    }

    public final void zzb(final String str, final long j, final long j2) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabb
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzabl.this.zzl(str, j, j2);
                }
            });
        }
    }

    public final void zzc(final zzu zzuVar, final zzhs zzhsVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabc
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzabl.this.zzm(zzuVar, zzhsVar);
                }
            });
        }
    }

    public final void zzd(final int i, final long j) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabd
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzabl.this.zzn(i, j);
                }
            });
        }
    }

    public final void zze(final long j, final int i) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabe
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzabl.this.zzo(j, i);
                }
            });
        }
    }

    public final void zzf(final zzbu zzbuVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabf
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzabl.this.zzp(zzbuVar);
                }
            });
        }
    }

    public final void zzg(final Object obj) {
        Handler handler = this.zza;
        if (handler != null) {
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabg
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzabl.this.zzq(obj, elapsedRealtime);
                }
            });
        }
    }

    public final void zzh(final String str) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabh
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzabl.this.zzr(str);
                }
            });
        }
    }

    public final void zzi(final zzhr zzhrVar) {
        zzhrVar.zza();
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabi
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzabl.this.zzs(zzhrVar);
                }
            });
        }
    }

    public final void zzj(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabj
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzabl.this.zzt(exc);
                }
            });
        }
    }

    final /* synthetic */ void zzk(zzhr zzhrVar) {
        String str = zzeo.zza;
        this.zzb.zza(zzhrVar);
    }

    final /* synthetic */ void zzl(String str, long j, long j2) {
        String str2 = zzeo.zza;
        this.zzb.zzb(str, j, j2);
    }

    final /* synthetic */ void zzm(zzu zzuVar, zzhs zzhsVar) {
        String str = zzeo.zza;
        this.zzb.zzc(zzuVar, zzhsVar);
    }

    final /* synthetic */ void zzn(int i, long j) {
        String str = zzeo.zza;
        this.zzb.zzd(i, j);
    }

    final /* synthetic */ void zzo(long j, int i) {
        String str = zzeo.zza;
        this.zzb.zzi(j, i);
    }

    final /* synthetic */ void zzp(zzbu zzbuVar) {
        String str = zzeo.zza;
        this.zzb.zze(zzbuVar);
    }

    final /* synthetic */ void zzq(Object obj, long j) {
        String str = zzeo.zza;
        this.zzb.zzf(obj, j);
    }

    final /* synthetic */ void zzr(String str) {
        String str2 = zzeo.zza;
        this.zzb.zzg(str);
    }

    final /* synthetic */ void zzs(zzhr zzhrVar) {
        zzhrVar.zza();
        String str = zzeo.zza;
        this.zzb.zzh(zzhrVar);
    }

    final /* synthetic */ void zzt(Exception exc) {
        String str = zzeo.zza;
        this.zzb.zzj(exc);
    }
}
