package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzaat {
    private final Handler zza;
    private final zzaau zzb;

    public zzaat(Handler handler, zzaau zzaauVar) {
        this.zza = zzaauVar == null ? null : handler;
        this.zzb = zzaauVar;
    }

    public final void zza(final String str, final long j, final long j2) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaaj
                @Override // java.lang.Runnable
                public final void run() {
                    zzaat.this.zzg(str, j, j2);
                }
            });
        }
    }

    public final void zzb(final String str) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaas
                @Override // java.lang.Runnable
                public final void run() {
                    zzaat.this.zzh(str);
                }
            });
        }
    }

    public final void zzc(final zzil zzilVar) {
        zzilVar.zza();
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaar
                @Override // java.lang.Runnable
                public final void run() {
                    zzaat.this.zzi(zzilVar);
                }
            });
        }
    }

    public final void zzd(final int i, final long j) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaal
                @Override // java.lang.Runnable
                public final void run() {
                    zzaat.this.zzj(i, j);
                }
            });
        }
    }

    public final void zze(final zzil zzilVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaap
                @Override // java.lang.Runnable
                public final void run() {
                    zzaat.this.zzk(zzilVar);
                }
            });
        }
    }

    public final void zzf(final zzam zzamVar, final zzim zzimVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaaq
                @Override // java.lang.Runnable
                public final void run() {
                    zzaat.this.zzl(zzamVar, zzimVar);
                }
            });
        }
    }

    final /* synthetic */ void zzg(String str, long j, long j2) {
        int i = zzfs.zza;
        this.zzb.zzp(str, j, j2);
    }

    final /* synthetic */ void zzh(String str) {
        int i = zzfs.zza;
        this.zzb.zzq(str);
    }

    final /* synthetic */ void zzi(zzil zzilVar) {
        zzilVar.zza();
        int i = zzfs.zza;
        this.zzb.zzr(zzilVar);
    }

    final /* synthetic */ void zzj(int i, long j) {
        int i2 = zzfs.zza;
        this.zzb.zzl(i, j);
    }

    final /* synthetic */ void zzk(zzil zzilVar) {
        int i = zzfs.zza;
        this.zzb.zzs(zzilVar);
    }

    final /* synthetic */ void zzl(zzam zzamVar, zzim zzimVar) {
        int i = zzfs.zza;
        this.zzb.zzu(zzamVar, zzimVar);
    }

    final /* synthetic */ void zzm(Object obj, long j) {
        int i = zzfs.zza;
        this.zzb.zzm(obj, j);
    }

    final /* synthetic */ void zzn(long j, int i) {
        int i2 = zzfs.zza;
        this.zzb.zzt(j, i);
    }

    final /* synthetic */ void zzo(Exception exc) {
        int i = zzfs.zza;
        this.zzb.zzo(exc);
    }

    final /* synthetic */ void zzp(zzdu zzduVar) {
        int i = zzfs.zza;
        this.zzb.zzv(zzduVar);
    }

    public final void zzq(final Object obj) {
        Handler handler = this.zza;
        if (handler != null) {
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaam
                @Override // java.lang.Runnable
                public final void run() {
                    zzaat.this.zzm(obj, elapsedRealtime);
                }
            });
        }
    }

    public final void zzr(final long j, final int i) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaan
                @Override // java.lang.Runnable
                public final void run() {
                    zzaat.this.zzn(j, i);
                }
            });
        }
    }

    public final void zzs(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaao
                @Override // java.lang.Runnable
                public final void run() {
                    zzaat.this.zzo(exc);
                }
            });
        }
    }

    public final void zzt(final zzdu zzduVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaak
                @Override // java.lang.Runnable
                public final void run() {
                    zzaat.this.zzp(zzduVar);
                }
            });
        }
    }
}
