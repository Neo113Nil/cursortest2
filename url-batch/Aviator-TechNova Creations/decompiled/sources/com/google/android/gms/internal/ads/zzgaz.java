package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzgaz {
    private final zzgdf zza;
    private final zzgeg zzb;
    private final zzgmz zzc;
    private final zzgoe zzd;
    private final zzgcl zze;
    private final long zzf;
    private final zzika zzg;
    private final long zzh;
    private final long zzi = System.currentTimeMillis();
    private final boolean zzj;
    private final long zzk;

    zzgaz(zzgdf zzgdfVar, zzgeg zzgegVar, zzgmz zzgmzVar, zzgoe zzgoeVar, zzgcl zzgclVar, zzika zzikaVar, zzgbf zzgbfVar) {
        this.zza = zzgdfVar;
        this.zzb = zzgegVar;
        this.zzc = zzgmzVar;
        this.zzd = zzgoeVar;
        this.zze = zzgclVar;
        this.zzf = zzgbfVar.zzh();
        this.zzg = zzikaVar;
        this.zzh = zzgbfVar.zzg();
        this.zzj = zzgbfVar.zzq();
        this.zzk = zzgbfVar.zzp();
    }

    public final ListenableFuture zza() {
        return this.zza.zza();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String zzb(final Context context) {
        String num;
        boolean z = false;
        if (this.zzj) {
            if (System.currentTimeMillis() - this.zzi <= this.zzk) {
                z = true;
            }
        }
        zzgoc zza = this.zzd.zza(3);
        try {
            try {
                try {
                    zza.zza();
                    num = (String) zzgzo.zzj(this.zza.zzb(), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzgay
                        @Override // com.google.android.gms.internal.ads.zzgyw
                        public final /* synthetic */ ListenableFuture zza(Object obj) {
                            return zzgaz.this.zzg(context, (Void) obj);
                        }
                    }, zzhaf.zza()).get(z ? this.zzh : this.zzf, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    zza.zzb(e);
                    num = "";
                } catch (ExecutionException e2) {
                    e = e2;
                    Throwable cause = e.getCause();
                    if (cause != null) {
                        e = cause;
                    }
                    zza.zzb(e);
                    num = Integer.toString(3);
                }
            } catch (TimeoutException unused) {
                if (z) {
                    num = ((zzghi) this.zzg.zzb()).zza(true, this.zzi);
                } else {
                    this.zzd.zzb(56);
                    num = Integer.toString(17);
                }
            } catch (Throwable th) {
                zza.zzb(th);
                throw th;
            }
            zza.zzc();
            this.zze.zzb();
            return num;
        } catch (Throwable th2) {
            zza.zzc();
            this.zze.zzb();
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0079: IGET (r9 I:com.google.android.gms.internal.ads.zzgcl) = (r2 I:com.google.android.gms.internal.ads.zzgaz) com.google.android.gms.internal.ads.zzgaz.zze com.google.android.gms.internal.ads.zzgcl, block:B:26:0x0075 */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.google.android.gms.internal.ads.zzgaz] */
    public final String zzc(final Context context, String str, final View view, final Activity activity) {
        final zzgaz zzgazVar;
        ?? r2;
        String num;
        final String str2;
        zzgoc zza = this.zzd.zza(4);
        try {
            try {
                zza.zza();
                str2 = null;
                zzgazVar = this;
            } catch (Throwable th) {
                zza.zzc();
                r2.zze.zzb();
                throw th;
            }
        } catch (InterruptedException e) {
            e = e;
            zzgazVar = this;
        } catch (ExecutionException e2) {
            e = e2;
            zzgazVar = this;
        } catch (TimeoutException unused) {
            zzgazVar = this;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            num = (String) zzgzo.zzj(this.zza.zzb(), new zzgyw(context, str2, view, activity) { // from class: com.google.android.gms.internal.ads.zzgaw
                private final /* synthetic */ Context zzb;
                private final /* synthetic */ View zzc;
                private final /* synthetic */ Activity zzd;

                {
                    this.zzc = view;
                    this.zzd = activity;
                }

                @Override // com.google.android.gms.internal.ads.zzgyw
                public final /* synthetic */ ListenableFuture zza(Object obj) {
                    return zzgaz.this.zzh(this.zzb, null, this.zzc, this.zzd, (Void) obj);
                }
            }, zzhaf.zza()).get(zzgazVar.zzf, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e3) {
            e = e3;
            Thread.currentThread().interrupt();
            zza.zzb(e);
            num = "";
            zza.zzc();
            zzgazVar.zze.zzb();
            return num;
        } catch (ExecutionException e4) {
            e = e4;
            ExecutionException executionException = e;
            Throwable cause = executionException.getCause();
            if (cause != null) {
                executionException = cause;
            }
            zza.zzb(executionException);
            num = Integer.toString(3);
            zza.zzc();
            zzgazVar.zze.zzb();
            return num;
        } catch (TimeoutException unused2) {
            zzgazVar.zzd.zzb(57);
            num = Integer.toString(17);
            zza.zzc();
            zzgazVar.zze.zzb();
            return num;
        } catch (Throwable th3) {
            th = th3;
            Throwable th4 = th;
            zza.zzb(th4);
            throw th4;
        }
        zza.zzc();
        zzgazVar.zze.zzb();
        return num;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0079: IGET (r9 I:com.google.android.gms.internal.ads.zzgcl) = (r2 I:com.google.android.gms.internal.ads.zzgaz) com.google.android.gms.internal.ads.zzgaz.zze com.google.android.gms.internal.ads.zzgcl, block:B:26:0x0075 */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.google.android.gms.internal.ads.zzgaz] */
    public final String zzd(final Context context, final String str, final View view, Activity activity) {
        final zzgaz zzgazVar;
        ?? r2;
        String num;
        final Activity activity2;
        zzgoc zza = this.zzd.zza(5);
        try {
            try {
                zza.zza();
                activity2 = null;
                zzgazVar = this;
            } catch (Throwable th) {
                zza.zzc();
                r2.zze.zzb();
                throw th;
            }
        } catch (InterruptedException e) {
            e = e;
            zzgazVar = this;
        } catch (ExecutionException e2) {
            e = e2;
            zzgazVar = this;
        } catch (TimeoutException unused) {
            zzgazVar = this;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            num = (String) zzgzo.zzj(this.zza.zzb(), new zzgyw(context, str, view, activity2) { // from class: com.google.android.gms.internal.ads.zzgax
                private final /* synthetic */ Context zzb;
                private final /* synthetic */ String zzc;
                private final /* synthetic */ View zzd;

                @Override // com.google.android.gms.internal.ads.zzgyw
                public final /* synthetic */ ListenableFuture zza(Object obj) {
                    return zzgaz.this.zzi(this.zzb, this.zzc, this.zzd, null, (Void) obj);
                }
            }, zzhaf.zza()).get(zzgazVar.zzf, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e3) {
            e = e3;
            Thread.currentThread().interrupt();
            zza.zzb(e);
            num = "";
            zza.zzc();
            zzgazVar.zze.zzb();
            return num;
        } catch (ExecutionException e4) {
            e = e4;
            ExecutionException executionException = e;
            Throwable cause = executionException.getCause();
            if (cause != null) {
                executionException = cause;
            }
            zza.zzb(executionException);
            num = Integer.toString(3);
            zza.zzc();
            zzgazVar.zze.zzb();
            return num;
        } catch (TimeoutException unused2) {
            zzgazVar.zzd.zzb(58);
            num = Integer.toString(17);
            zza.zzc();
            zzgazVar.zze.zzb();
            return num;
        } catch (Throwable th3) {
            th = th3;
            Throwable th4 = th;
            zza.zzb(th4);
            throw th4;
        }
        zza.zzc();
        zzgazVar.zze.zzb();
        return num;
    }

    public final void zze(List list) {
        this.zzc.zza(list);
    }

    public final void zzf(InputEvent inputEvent) {
        this.zzb.zze(inputEvent);
    }

    final /* synthetic */ ListenableFuture zzg(Context context, Void r2) {
        return this.zzb.zzb(context);
    }

    final /* synthetic */ ListenableFuture zzh(Context context, String str, View view, Activity activity, Void r5) {
        return this.zzb.zzc(context, null, view, activity);
    }

    final /* synthetic */ ListenableFuture zzi(Context context, String str, View view, Activity activity, Void r5) {
        return this.zzb.zzd(context, str, view, null);
    }

    public final int zzj() {
        return this.zzb.zzh();
    }
}
