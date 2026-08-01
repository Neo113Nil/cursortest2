package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.openadsdk.api.PAGErrorCode;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzasb implements zzase {
    private static zzasb zzb;
    private final Context zzc;
    private final zzfpi zzd;
    private final zzfpp zze;
    private final zzfpr zzf;
    private final zzatd zzg;
    private final zzfnt zzh;
    private final Executor zzi;
    private final zzfpo zzj;
    private final zzats zzl;
    private final zzatk zzm;
    private final zzatb zzn;
    private volatile boolean zzp;
    private volatile boolean zzq;
    private final int zzr;
    volatile long zza = 0;
    private final Object zzo = new Object();
    private final CountDownLatch zzk = new CountDownLatch(1);

    zzasb(Context context, zzfnt zzfntVar, zzfpi zzfpiVar, zzfpp zzfppVar, zzfpr zzfprVar, zzatd zzatdVar, Executor executor, zzfno zzfnoVar, int i, zzats zzatsVar, zzatk zzatkVar, zzatb zzatbVar) {
        this.zzq = false;
        this.zzc = context;
        this.zzh = zzfntVar;
        this.zzd = zzfpiVar;
        this.zze = zzfppVar;
        this.zzf = zzfprVar;
        this.zzg = zzatdVar;
        this.zzi = executor;
        this.zzr = i;
        this.zzl = zzatsVar;
        this.zzm = zzatkVar;
        this.zzn = zzatbVar;
        this.zzq = false;
        this.zzj = new zzarz(this, zzfnoVar);
    }

    public static synchronized zzasb zza(String str, Context context, boolean z, boolean z2) {
        zzasb zzb2;
        synchronized (zzasb.class) {
            zzb2 = zzb(str, context, Executors.newCachedThreadPool(), z, z2);
        }
        return zzb2;
    }

    @Deprecated
    public static synchronized zzasb zzb(String str, Context context, Executor executor, boolean z, boolean z2) {
        zzasb zzasbVar;
        synchronized (zzasb.class) {
            if (zzb == null) {
                zzfnu zza = zzfnv.zza();
                zza.zza(str);
                zza.zzc(z);
                zzfnv zzd = zza.zzd();
                zzfnt zza2 = zzfnt.zza(context, executor, z2);
                zzasm zzc = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzdg)).booleanValue() ? zzasm.zzc(context) : null;
                zzats zzd2 = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzdh)).booleanValue() ? zzats.zzd(context, executor) : null;
                zzatk zzatkVar = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzcv)).booleanValue() ? new zzatk() : null;
                zzatb zzatbVar = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzcx)).booleanValue() ? new zzatb() : null;
                zzfom zze = zzfom.zze(context, executor, zza2, zzd);
                zzatc zzatcVar = new zzatc(context);
                zzatd zzatdVar = new zzatd(zzd, zze, new zzatq(context, zzatcVar), zzatcVar, zzc, zzd2, zzatkVar, zzatbVar);
                int zzb2 = zzfov.zzb(context, zza2);
                zzfno zzfnoVar = new zzfno();
                zzasb zzasbVar2 = new zzasb(context, zza2, new zzfpi(context, zzb2), new zzfpp(context, zzb2, new zzary(zza2), ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzce)).booleanValue()), new zzfpr(context, zzatdVar, zza2, zzfnoVar), zzatdVar, executor, zzfnoVar, zzb2, zzd2, zzatkVar, zzatbVar);
                zzb = zzasbVar2;
                zzasbVar2.zzm();
                zzb.zzp();
            }
            zzasbVar = zzb;
        }
        return zzasbVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x009a, code lost:
    
        if (r4.zzd().zzj().equals(r5.zzj()) != false) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* bridge */ /* synthetic */ void zzj(zzasb zzasbVar) {
        String str;
        String str2;
        int length;
        boolean zza;
        long currentTimeMillis = System.currentTimeMillis();
        zzfph zzt = zzasbVar.zzt(1);
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
                zzfpm zza2 = zzfod.zza(zzasbVar.zzc, 1, zzasbVar.zzr, str, str2, "1", zzasbVar.zzh);
                byte[] bArr = zza2.zzb;
                if (bArr == null || (length = bArr.length) == 0) {
                    zzasbVar.zzh.zzd(5009, System.currentTimeMillis() - currentTimeMillis);
                } else {
                    try {
                        zzavc zzc = zzavc.zzc(zzgve.zzv(bArr, 0, length), zzgvy.zza());
                        if (!zzc.zzd().zzk().isEmpty() && !zzc.zzd().zzj().isEmpty() && zzc.zze().zzA().length != 0) {
                            zzfph zzt2 = zzasbVar.zzt(1);
                            if (zzt2 != null) {
                                zzavf zza3 = zzt2.zza();
                                if (zzc.zzd().zzk().equals(zza3.zzk())) {
                                }
                            }
                            zzfpo zzfpoVar = zzasbVar.zzj;
                            int i = zza2.zzc;
                            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzcc)).booleanValue()) {
                                zza = zzasbVar.zzd.zza(zzc, zzfpoVar);
                            } else if (i == 3) {
                                zza = zzasbVar.zze.zza(zzc);
                            } else {
                                if (i == 4) {
                                    zza = zzasbVar.zze.zzb(zzc, zzfpoVar);
                                }
                                zzasbVar.zzh.zzd(4009, System.currentTimeMillis() - currentTimeMillis);
                            }
                            if (zza) {
                                zzfph zzt3 = zzasbVar.zzt(1);
                                if (zzt3 != null) {
                                    if (zzasbVar.zzf.zzc(zzt3)) {
                                        zzasbVar.zzq = true;
                                    }
                                    zzasbVar.zza = System.currentTimeMillis() / 1000;
                                }
                            }
                            zzasbVar.zzh.zzd(4009, System.currentTimeMillis() - currentTimeMillis);
                        }
                        zzasbVar.zzh.zzd(5010, System.currentTimeMillis() - currentTimeMillis);
                    } catch (NullPointerException unused) {
                        zzasbVar.zzh.zzd(2030, System.currentTimeMillis() - currentTimeMillis);
                    }
                }
            } catch (zzgwy e) {
                zzasbVar.zzh.zzc(4002, System.currentTimeMillis() - currentTimeMillis, e);
            }
        } finally {
            zzasbVar.zzk.countDown();
        }
    }

    private final void zzs() {
        zzats zzatsVar = this.zzl;
        if (zzatsVar != null) {
            zzatsVar.zzh();
        }
    }

    private final zzfph zzt(int i) {
        if (zzfov.zza(this.zzr)) {
            return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzcc)).booleanValue() ? this.zze.zzc(1) : this.zzd.zzc(1);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzase
    public final String zze(Context context, String str, View view) {
        return zzf(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzase
    public final String zzf(Context context, String str, View view, Activity activity) {
        zzs();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzcv)).booleanValue()) {
            this.zzm.zzi();
        }
        zzp();
        zzfnw zza = this.zzf.zza();
        if (zza == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String zza2 = zza.zza(context, null, str, view, activity);
        this.zzh.zzf(PAGErrorCode.LOAD_FACTORY_NULL_CODE, System.currentTimeMillis() - currentTimeMillis, zza2, null);
        return zza2;
    }

    @Override // com.google.android.gms.internal.ads.zzase
    public final String zzg(Context context) {
        zzs();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzcv)).booleanValue()) {
            this.zzm.zzj();
        }
        zzp();
        zzfnw zza = this.zzf.zza();
        if (zza == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String zzc = zza.zzc(context, null);
        this.zzh.zzf(5001, System.currentTimeMillis() - currentTimeMillis, zzc, null);
        return zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzase
    public final String zzh(Context context, View view, Activity activity) {
        zzs();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzcv)).booleanValue()) {
            this.zzm.zzk(context, view);
        }
        zzp();
        zzfnw zza = this.zzf.zza();
        if (zza == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String zzb2 = zza.zzb(context, null, view, activity);
        this.zzh.zzf(5002, System.currentTimeMillis() - currentTimeMillis, zzb2, null);
        return zzb2;
    }

    @Override // com.google.android.gms.internal.ads.zzase
    public final void zzk(MotionEvent motionEvent) {
        zzfnw zza = this.zzf.zza();
        if (zza != null) {
            try {
                zza.zzd(null, motionEvent);
            } catch (zzfpq e) {
                this.zzh.zzc(e.zza(), -1L, e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzase
    public final void zzl(int i, int i2, int i3) {
    }

    final synchronized void zzm() {
        long currentTimeMillis = System.currentTimeMillis();
        zzfph zzt = zzt(1);
        if (zzt == null) {
            this.zzh.zzd(4013, System.currentTimeMillis() - currentTimeMillis);
        } else if (this.zzf.zzc(zzt)) {
            this.zzq = true;
            this.zzk.countDown();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzase
    public final void zzn(StackTraceElement[] stackTraceElementArr) {
        zzatb zzatbVar = this.zzn;
        if (zzatbVar != null) {
            zzatbVar.zzb(Arrays.asList(stackTraceElementArr));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzase
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
                zzfph zzb2 = this.zzf.zzb();
                if ((zzb2 == null || zzb2.zzd(3600L)) && zzfov.zza(this.zzr)) {
                    this.zzi.execute(new zzasa(this));
                }
            }
        }
    }

    public final synchronized boolean zzr() {
        return this.zzq;
    }
}
