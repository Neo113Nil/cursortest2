package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzasb;
import com.google.android.gms.internal.ads.zzase;
import com.google.android.gms.internal.ads.zzash;
import com.google.android.gms.internal.ads.zzbdc;
import com.google.android.gms.internal.ads.zzcbg;
import com.google.android.gms.internal.ads.zzcbn;
import com.google.android.gms.internal.ads.zzcbt;
import com.google.android.gms.internal.ads.zzcca;
import com.google.android.gms.internal.ads.zzfnt;
import com.google.android.gms.internal.ads.zzfov;
import com.google.android.gms.internal.ads.zzfpp;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzi implements Runnable, zzase {
    protected boolean zza;
    private final boolean zzf;
    private final boolean zzg;
    private final Executor zzh;
    private final zzfnt zzi;
    private Context zzj;
    private final Context zzk;
    private zzcbt zzl;
    private final zzcbt zzm;
    private final boolean zzn;
    private int zzo;
    private final List zzc = new Vector();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    final CountDownLatch zzb = new CountDownLatch(1);

    public zzi(Context context, zzcbt zzcbtVar) {
        this.zzj = context;
        this.zzk = context;
        this.zzl = zzcbtVar;
        this.zzm = zzcbtVar;
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        this.zzh = newCachedThreadPool;
        boolean booleanValue = ((Boolean) zzba.zzc().zza(zzbdc.zzch)).booleanValue();
        this.zzn = booleanValue;
        this.zzi = zzfnt.zza(context, newCachedThreadPool, booleanValue);
        this.zzf = ((Boolean) zzba.zzc().zza(zzbdc.zzcd)).booleanValue();
        this.zzg = ((Boolean) zzba.zzc().zza(zzbdc.zzci)).booleanValue();
        if (((Boolean) zzba.zzc().zza(zzbdc.zzcg)).booleanValue()) {
            this.zzo = 2;
        } else {
            this.zzo = 1;
        }
        if (!((Boolean) zzba.zzc().zza(zzbdc.zzdk)).booleanValue()) {
            this.zza = zzc();
        }
        if (((Boolean) zzba.zzc().zza(zzbdc.zzdd)).booleanValue()) {
            zzcca.zza.execute(this);
            return;
        }
        zzay.zzb();
        if (zzcbg.zzu()) {
            zzcca.zza.execute(this);
        } else {
            run();
        }
    }

    private final zzase zzj() {
        return zzi() == 2 ? (zzase) this.zze.get() : (zzase) this.zzd.get();
    }

    private final void zzm() {
        List list = this.zzc;
        zzase zzj = zzj();
        if (list.isEmpty() || zzj == null) {
            return;
        }
        for (Object[] objArr : this.zzc) {
            int length = objArr.length;
            if (length == 1) {
                zzj.zzk((MotionEvent) objArr[0]);
            } else if (length == 3) {
                zzj.zzl(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
            }
        }
        this.zzc.clear();
    }

    private final void zzp(boolean z) {
        this.zzd.set(zzash.zzu(this.zzl.zza, zzq(this.zzj), z, this.zzo));
    }

    private static final Context zzq(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (((Boolean) zzba.zzc().zza(zzbdc.zzdk)).booleanValue()) {
                this.zza = zzc();
            }
            boolean z = this.zzl.zzd;
            final boolean z2 = false;
            if (!((Boolean) zzba.zzc().zza(zzbdc.zzaV)).booleanValue() && z) {
                z2 = true;
            }
            if (zzi() == 1) {
                zzp(z2);
                if (this.zzo == 2) {
                    this.zzh.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.zzg
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzi.this.zzb(z2);
                        }
                    });
                }
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                try {
                    zzasb zza = zzasb.zza(this.zzl.zza, zzq(this.zzj), z2, this.zzn);
                    this.zze.set(zza);
                    if (this.zzg && !zza.zzr()) {
                        this.zzo = 1;
                        zzp(z2);
                    }
                } catch (NullPointerException e) {
                    this.zzo = 1;
                    zzp(z2);
                    this.zzi.zzc(2031, System.currentTimeMillis() - currentTimeMillis, e);
                }
            }
        } finally {
            this.zzb.countDown();
            this.zzj = null;
            this.zzl = null;
        }
    }

    final /* synthetic */ void zzb(boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            zzasb.zza(this.zzm.zza, zzq(this.zzk), z, this.zzn).zzp();
        } catch (NullPointerException e) {
            this.zzi.zzc(2027, System.currentTimeMillis() - currentTimeMillis, e);
        }
    }

    protected final boolean zzc() {
        Context context = this.zzj;
        zzh zzhVar = new zzh(this);
        zzfnt zzfntVar = this.zzi;
        return new zzfpp(this.zzj, zzfov.zzb(context, zzfntVar), zzhVar, ((Boolean) zzba.zzc().zza(zzbdc.zzce)).booleanValue()).zzd(1);
    }

    public final boolean zzd() {
        try {
            this.zzb.await();
            return true;
        } catch (InterruptedException e) {
            zzcbn.zzk("Interrupted during GADSignals creation.", e);
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzase
    public final String zze(Context context, String str, View view) {
        return zzf(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzase
    public final String zzf(Context context, String str, View view, Activity activity) {
        if (!zzd()) {
            return "";
        }
        zzase zzj = zzj();
        if (((Boolean) zzba.zzc().zza(zzbdc.zzjW)).booleanValue()) {
            zzt.zzp();
            com.google.android.gms.ads.internal.util.zzt.zzI(view, 4, null);
        }
        if (zzj == null) {
            return "";
        }
        zzm();
        return zzj.zzf(zzq(context), str, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.zzase
    public final String zzg(Context context) {
        zzase zzj;
        if (!zzd() || (zzj = zzj()) == null) {
            return "";
        }
        zzm();
        return zzj.zzg(zzq(context));
    }

    @Override // com.google.android.gms.internal.ads.zzase
    public final String zzh(Context context, View view, Activity activity) {
        if (!((Boolean) zzba.zzc().zza(zzbdc.zzjV)).booleanValue()) {
            zzase zzj = zzj();
            if (((Boolean) zzba.zzc().zza(zzbdc.zzjW)).booleanValue()) {
                zzt.zzp();
                com.google.android.gms.ads.internal.util.zzt.zzI(view, 2, null);
            }
            return zzj != null ? zzj.zzh(context, view, activity) : "";
        }
        if (!zzd()) {
            return "";
        }
        zzase zzj2 = zzj();
        if (((Boolean) zzba.zzc().zza(zzbdc.zzjW)).booleanValue()) {
            zzt.zzp();
            com.google.android.gms.ads.internal.util.zzt.zzI(view, 2, null);
        }
        return zzj2 != null ? zzj2.zzh(context, view, activity) : "";
    }

    protected final int zzi() {
        if (!this.zzf || this.zza) {
            return this.zzo;
        }
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzase
    public final void zzk(MotionEvent motionEvent) {
        zzase zzj = zzj();
        if (zzj == null) {
            this.zzc.add(new Object[]{motionEvent});
        } else {
            zzm();
            zzj.zzk(motionEvent);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzase
    public final void zzl(int i, int i2, int i3) {
        zzase zzj = zzj();
        if (zzj == null) {
            this.zzc.add(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
        } else {
            zzm();
            zzj.zzl(i, i2, i3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzase
    public final void zzn(StackTraceElement[] stackTraceElementArr) {
        zzase zzj;
        if (!zzd() || (zzj = zzj()) == null) {
            return;
        }
        zzj.zzn(stackTraceElementArr);
    }

    @Override // com.google.android.gms.internal.ads.zzase
    public final void zzo(View view) {
        zzase zzj = zzj();
        if (zzj != null) {
            zzj.zzo(view);
        }
    }
}
