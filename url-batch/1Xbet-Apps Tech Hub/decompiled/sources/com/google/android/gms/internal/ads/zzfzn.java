package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
abstract class zzfzn extends zzgar implements Runnable {

    @CheckForNull
    ListenableFuture zza;

    @CheckForNull
    Class zzb;

    @CheckForNull
    Object zzc;

    zzfzn(ListenableFuture listenableFuture, Class cls, Object obj) {
        listenableFuture.getClass();
        this.zza = listenableFuture;
        this.zzb = cls;
        this.zzc = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Throwable e;
        Object obj;
        ListenableFuture listenableFuture = this.zza;
        Class cls = this.zzb;
        Object obj2 = this.zzc;
        if (((obj2 == null) || ((listenableFuture == 0) | (cls == null))) || isCancelled()) {
            return;
        }
        this.zza = null;
        try {
            e = listenableFuture instanceof zzgcd ? ((zzgcd) listenableFuture).zzl() : null;
        } catch (Error e2) {
            e = e2;
        } catch (RuntimeException e3) {
            e = e3;
        } catch (ExecutionException e4) {
            Throwable cause = e4.getCause();
            if (cause == null) {
                cause = new NullPointerException("Future type " + String.valueOf(listenableFuture.getClass()) + " threw " + String.valueOf(e4.getClass()) + " without a cause");
            }
            e = cause;
        }
        if (e == null) {
            obj = zzgbb.zzp(listenableFuture);
            if (e != null) {
                zzc(obj);
                return;
            }
            if (!cls.isInstance(e)) {
                zzs(listenableFuture);
                return;
            }
            try {
                Object zze = zze(obj2, e);
                this.zzb = null;
                this.zzc = null;
                zzf(zze);
                return;
            } catch (Throwable th) {
                try {
                    zzgbs.zza(th);
                    zzd(th);
                    return;
                } finally {
                    this.zzb = null;
                    this.zzc = null;
                }
            }
        }
        obj = null;
        if (e != null) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    @CheckForNull
    protected final String zza() {
        String str;
        ListenableFuture listenableFuture = this.zza;
        Class cls = this.zzb;
        Object obj = this.zzc;
        String zza = super.zza();
        if (listenableFuture != null) {
            str = "inputFuture=[" + listenableFuture.toString() + "], ";
        } else {
            str = "";
        }
        if (cls == null || obj == null) {
            if (zza != null) {
                return str.concat(zza);
            }
            return null;
        }
        return str + "exceptionType=[" + cls.toString() + "], fallback=[" + obj.toString() + "]";
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    protected final void zzb() {
        zzr(this.zza);
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
    }

    abstract Object zze(Object obj, Throwable th) throws Exception;

    abstract void zzf(Object obj);
}
