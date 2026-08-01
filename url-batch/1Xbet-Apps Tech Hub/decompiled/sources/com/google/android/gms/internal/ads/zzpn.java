package com.google.android.gms.internal.ads;

import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzpn {
    private final Handler zza;
    private final zzpo zzb;

    public zzpn(Handler handler, zzpo zzpoVar) {
        this.zza = zzpoVar == null ? null : handler;
        this.zzb = zzpoVar;
    }

    public final void zza(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzph
                @Override // java.lang.Runnable
                public final void run() {
                    zzpn.this.zzj(exc);
                }
            });
        }
    }

    public final void zzb(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpi
                @Override // java.lang.Runnable
                public final void run() {
                    zzpn.this.zzk(exc);
                }
            });
        }
    }

    public final void zzc(final zzpp zzppVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpf
                @Override // java.lang.Runnable
                public final void run() {
                    zzpn.this.zzl(zzppVar);
                }
            });
        }
    }

    public final void zzd(final zzpp zzppVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpg
                @Override // java.lang.Runnable
                public final void run() {
                    zzpn.this.zzm(zzppVar);
                }
            });
        }
    }

    public final void zze(final String str, final long j, final long j2) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpl
                @Override // java.lang.Runnable
                public final void run() {
                    zzpn.this.zzn(str, j, j2);
                }
            });
        }
    }

    public final void zzf(final String str) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpm
                @Override // java.lang.Runnable
                public final void run() {
                    zzpn.this.zzo(str);
                }
            });
        }
    }

    public final void zzg(final zzil zzilVar) {
        zzilVar.zza();
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpc
                @Override // java.lang.Runnable
                public final void run() {
                    zzpn.this.zzp(zzilVar);
                }
            });
        }
    }

    public final void zzh(final zzil zzilVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpb
                @Override // java.lang.Runnable
                public final void run() {
                    zzpn.this.zzq(zzilVar);
                }
            });
        }
    }

    public final void zzi(final zzam zzamVar, final zzim zzimVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpj
                @Override // java.lang.Runnable
                public final void run() {
                    zzpn.this.zzr(zzamVar, zzimVar);
                }
            });
        }
    }

    final /* synthetic */ void zzj(Exception exc) {
        int i = zzfs.zza;
        this.zzb.zza(exc);
    }

    final /* synthetic */ void zzk(Exception exc) {
        int i = zzfs.zza;
        this.zzb.zzh(exc);
    }

    final /* synthetic */ void zzl(zzpp zzppVar) {
        int i = zzfs.zza;
        this.zzb.zzi(zzppVar);
    }

    final /* synthetic */ void zzm(zzpp zzppVar) {
        int i = zzfs.zza;
        this.zzb.zzj(zzppVar);
    }

    final /* synthetic */ void zzn(String str, long j, long j2) {
        int i = zzfs.zza;
        this.zzb.zzb(str, j, j2);
    }

    final /* synthetic */ void zzo(String str) {
        int i = zzfs.zza;
        this.zzb.zzc(str);
    }

    final /* synthetic */ void zzp(zzil zzilVar) {
        zzilVar.zza();
        int i = zzfs.zza;
        this.zzb.zzd(zzilVar);
    }

    final /* synthetic */ void zzq(zzil zzilVar) {
        int i = zzfs.zza;
        this.zzb.zze(zzilVar);
    }

    final /* synthetic */ void zzr(zzam zzamVar, zzim zzimVar) {
        int i = zzfs.zza;
        this.zzb.zzf(zzamVar, zzimVar);
    }

    final /* synthetic */ void zzs(long j) {
        int i = zzfs.zza;
        this.zzb.zzg(j);
    }

    final /* synthetic */ void zzt(boolean z) {
        int i = zzfs.zza;
        this.zzb.zzn(z);
    }

    final /* synthetic */ void zzu(int i, long j, long j2) {
        int i2 = zzfs.zza;
        this.zzb.zzk(i, j, j2);
    }

    public final void zzv(final long j) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpd
                @Override // java.lang.Runnable
                public final void run() {
                    zzpn.this.zzs(j);
                }
            });
        }
    }

    public final void zzw(final boolean z) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpk
                @Override // java.lang.Runnable
                public final void run() {
                    zzpn.this.zzt(z);
                }
            });
        }
    }

    public final void zzx(final int i, final long j, final long j2) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpe
                @Override // java.lang.Runnable
                public final void run() {
                    zzpn.this.zzu(i, j, j2);
                }
            });
        }
    }
}
