package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.games.GamesStatusCodes;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzauh implements zzauk {
    private static zzauh zzb;
    private final Context zzc;
    private final zzfpw zzd;
    private final zzfqd zze;
    private final zzfqf zzf;
    private final zzavj zzg;
    private final zzfoh zzh;
    private final Executor zzi;
    private final zzfqc zzj;
    private final zzavy zzl;
    private final zzavq zzm;
    private final zzavh zzn;
    private volatile boolean zzp;
    private volatile boolean zzq;
    private final int zzr;
    volatile long zza = 0;
    private final Object zzo = new Object();
    private final CountDownLatch zzk = new CountDownLatch(1);

    zzauh(Context context, zzfoh zzfohVar, zzfpw zzfpwVar, zzfqd zzfqdVar, zzfqf zzfqfVar, zzavj zzavjVar, Executor executor, zzfoc zzfocVar, int i, zzavy zzavyVar, zzavq zzavqVar, zzavh zzavhVar) {
        this.zzq = false;
        this.zzc = context;
        this.zzh = zzfohVar;
        this.zzd = zzfpwVar;
        this.zze = zzfqdVar;
        this.zzf = zzfqfVar;
        this.zzg = zzavjVar;
        this.zzi = executor;
        this.zzr = i;
        this.zzl = zzavyVar;
        this.zzm = zzavqVar;
        this.zzn = zzavhVar;
        this.zzq = false;
        this.zzj = new zzauf(this, zzfocVar);
    }

    public static synchronized zzauh zza(String str, Context context, boolean z, boolean z2) {
        zzauh zzb2;
        synchronized (zzauh.class) {
            zzb2 = zzb(str, context, Executors.newCachedThreadPool(), z, z2);
        }
        return zzb2;
    }

    @Deprecated
    public static synchronized zzauh zzb(String str, Context context, Executor executor, boolean z, boolean z2) {
        zzauh zzauhVar;
        synchronized (zzauh.class) {
            if (zzb == null) {
                zzfoi zza = zzfoj.zza();
                zza.zza(str);
                zza.zzc(z);
                zzfoj zzd = zza.zzd();
                zzfoh zza2 = zzfoh.zza(context, executor, z2);
                zzaus zzc = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzcY)).booleanValue() ? zzaus.zzc(context) : null;
                zzavy zzd2 = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzcZ)).booleanValue() ? zzavy.zzd(context, executor) : null;
                zzavq zzavqVar = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzcs)).booleanValue() ? new zzavq() : null;
                zzavh zzavhVar = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzct)).booleanValue() ? new zzavh() : null;
                zzfpa zze = zzfpa.zze(context, executor, zza2, zzd);
                zzavi zzaviVar = new zzavi(context);
                zzavj zzavjVar = new zzavj(zzd, zze, new zzavw(context, zzaviVar), zzaviVar, zzc, zzd2, zzavqVar, zzavhVar);
                int zzb2 = zzfpj.zzb(context, zza2);
                zzfoc zzfocVar = new zzfoc();
                zzauh zzauhVar2 = new zzauh(context, zza2, new zzfpw(context, zzb2), new zzfqd(context, zzb2, new zzaue(zza2), ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzcc)).booleanValue()), new zzfqf(context, zzavjVar, zza2, zzfocVar), zzavjVar, executor, zzfocVar, zzb2, zzd2, zzavqVar, zzavhVar);
                zzb = zzauhVar2;
                zzauhVar2.zzm();
                zzb.zzp();
            }
            zzauhVar = zzb;
        }
        return zzauhVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x009a, code lost:
    
        if (r4.zzd().zzj().equals(r5.zzj()) != false) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* bridge */ /* synthetic */ void zzj(zzauh zzauhVar) {
        String str;
        String str2;
        int length;
        boolean zza;
        long currentTimeMillis = System.currentTimeMillis();
        zzfpv zzt = zzauhVar.zzt(1);
        if (zzt != null) {
            String zzk = zzt.zza().zzk();
            str2 = zzt.zza().zzj();
            str = zzk;
        } else {
            str = null;
            str2 = null;
        }
        try {
            try {
                zzfqa zza2 = zzfor.zza(zzauhVar.zzc, 1, zzauhVar.zzr, str, str2, "1", zzauhVar.zzh);
                byte[] bArr = zza2.zzb;
                if (bArr == null || (length = bArr.length) == 0) {
                    zzauhVar.zzh.zzd(5009, System.currentTimeMillis() - currentTimeMillis);
                } else {
                    try {
                        zzaxi zzc = zzaxi.zzc(zzgwm.zzv(bArr, 0, length), zzgxi.zza());
                        if (!zzc.zzd().zzk().isEmpty() && !zzc.zzd().zzj().isEmpty() && zzc.zze().zzA().length != 0) {
                            zzfpv zzt2 = zzauhVar.zzt(1);
                            if (zzt2 != null) {
                                zzaxl zza3 = zzt2.zza();
                                if (zzc.zzd().zzk().equals(zza3.zzk())) {
                                }
                            }
                            zzfqc zzfqcVar = zzauhVar.zzj;
                            int i = zza2.zzc;
                            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzca)).booleanValue()) {
                                zza = zzauhVar.zzd.zza(zzc, zzfqcVar);
                            } else if (i == 3) {
                                zza = zzauhVar.zze.zza(zzc);
                            } else {
                                if (i == 4) {
                                    zza = zzauhVar.zze.zzb(zzc, zzfqcVar);
                                }
                                zzauhVar.zzh.zzd(4009, System.currentTimeMillis() - currentTimeMillis);
                            }
                            if (zza) {
                                zzfpv zzt3 = zzauhVar.zzt(1);
                                if (zzt3 != null) {
                                    if (zzauhVar.zzf.zzc(zzt3)) {
                                        zzauhVar.zzq = true;
                                    }
                                    zzauhVar.zza = System.currentTimeMillis() / 1000;
                                }
                            }
                            zzauhVar.zzh.zzd(4009, System.currentTimeMillis() - currentTimeMillis);
                        }
                        zzauhVar.zzh.zzd(5010, System.currentTimeMillis() - currentTimeMillis);
                    } catch (NullPointerException unused) {
                        zzauhVar.zzh.zzd(2030, System.currentTimeMillis() - currentTimeMillis);
                    }
                }
            } catch (zzgyn e) {
                zzauhVar.zzh.zzc(GamesStatusCodes.STATUS_SNAPSHOT_CONTENTS_UNAVAILABLE, System.currentTimeMillis() - currentTimeMillis, e);
            }
        } finally {
            zzauhVar.zzk.countDown();
        }
    }

    private final void zzs() {
        zzavy zzavyVar = this.zzl;
        if (zzavyVar != null) {
            zzavyVar.zzh();
        }
    }

    private final zzfpv zzt(int i) {
        if (zzfpj.zza(this.zzr)) {
            return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzca)).booleanValue() ? this.zze.zzc(1) : this.zzd.zzc(1);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzauk
    public final String zze(Context context, String str, View view) {
        return zzf(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzauk
    public final String zzf(Context context, String str, View view, Activity activity) {
        zzs();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzcs)).booleanValue()) {
            this.zzm.zzi();
        }
        zzp();
        zzfok zza = this.zzf.zza();
        if (zza == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String zza2 = zza.zza(context, null, str, view, activity);
        this.zzh.zzf(5000, System.currentTimeMillis() - currentTimeMillis, zza2, null);
        return zza2;
    }

    @Override // com.google.android.gms.internal.ads.zzauk
    public final String zzg(Context context) {
        zzs();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzcs)).booleanValue()) {
            this.zzm.zzj();
        }
        zzp();
        zzfok zza = this.zzf.zza();
        if (zza == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String zzc = zza.zzc(context, null);
        this.zzh.zzf(5001, System.currentTimeMillis() - currentTimeMillis, zzc, null);
        return zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzauk
    public final String zzh(Context context, View view, Activity activity) {
        zzs();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzcs)).booleanValue()) {
            this.zzm.zzk(context, view);
        }
        zzp();
        zzfok zza = this.zzf.zza();
        if (zza == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String zzb2 = zza.zzb(context, null, view, activity);
        this.zzh.zzf(5002, System.currentTimeMillis() - currentTimeMillis, zzb2, null);
        return zzb2;
    }

    @Override // com.google.android.gms.internal.ads.zzauk
    public final void zzk(MotionEvent motionEvent) {
        zzfok zza = this.zzf.zza();
        if (zza != null) {
            try {
                zza.zzd(null, motionEvent);
            } catch (zzfqe e) {
                this.zzh.zzc(e.zza(), -1L, e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzauk
    public final void zzl(int i, int i2, int i3) {
        DisplayMetrics displayMetrics;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzkY)).booleanValue() || (displayMetrics = this.zzc.getResources().getDisplayMetrics()) == null) {
            return;
        }
        float f = i;
        float f2 = i2;
        MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, f * displayMetrics.density, f2 * displayMetrics.density, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzk(obtain);
        obtain.recycle();
        MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 2, f * displayMetrics.density, f2 * displayMetrics.density, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzk(obtain2);
        obtain2.recycle();
        MotionEvent obtain3 = MotionEvent.obtain(0L, i3, 1, f * displayMetrics.density, f2 * displayMetrics.density, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzk(obtain3);
        obtain3.recycle();
    }

    final synchronized void zzm() {
        long currentTimeMillis = System.currentTimeMillis();
        zzfpv zzt = zzt(1);
        if (zzt == null) {
            this.zzh.zzd(4013, System.currentTimeMillis() - currentTimeMillis);
        } else if (this.zzf.zzc(zzt)) {
            this.zzq = true;
            this.zzk.countDown();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzauk
    public final void zzn(StackTraceElement[] stackTraceElementArr) {
        zzavh zzavhVar = this.zzn;
        if (zzavhVar != null) {
            zzavhVar.zzb(Arrays.asList(stackTraceElementArr));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzauk
    public final void zzo(View view) {
        this.zzg.zzd(view);
    }

    public final void zzp() {
        if (this.zzp) {
            return;
        }
        synchronized (this.zzo) {
            if (!this.zzp) {
                if ((System.currentTimeMillis() / 1000) - this.zza < 3600) {
                    return;
                }
                zzfpv zzb2 = this.zzf.zzb();
                if ((zzb2 == null || zzb2.zzd(3600L)) && zzfpj.zza(this.zzr)) {
                    this.zzi.execute(new zzaug(this));
                }
            }
        }
    }

    public final synchronized boolean zzr() {
        return this.zzq;
    }
}
