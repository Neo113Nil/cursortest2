package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzeoc implements zzevo {
    private final ListenableFuture zza;
    private final Executor zzb;
    private final ScheduledExecutorService zzc;

    public zzeoc(ListenableFuture listenableFuture, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.zza = listenableFuture;
        this.zzb = executor;
        this.zzc = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final int zza() {
        return 6;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final ListenableFuture zzb() {
        ListenableFuture zzn = zzgcj.zzn(this.zza, new zzgbq() { // from class: com.google.android.gms.internal.ads.zzeny
            @Override // com.google.android.gms.internal.ads.zzgbq
            public final ListenableFuture zza(Object obj) {
                final String str = (String) obj;
                return zzgcj.zzh(new zzevn() { // from class: com.google.android.gms.internal.ads.zzenx
                    @Override // com.google.android.gms.internal.ads.zzevn
                    public final void zzj(Object obj2) {
                        ((Bundle) obj2).putString("ms", str);
                    }
                });
            }
        }, this.zzb);
        if (((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzlz)).intValue() > 0) {
            zzn = zzgcj.zzo(zzn, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzlz)).intValue(), TimeUnit.MILLISECONDS, this.zzc);
        }
        return zzgcj.zzf(zzn, Throwable.class, new zzgbq() { // from class: com.google.android.gms.internal.ads.zzenz
            @Override // com.google.android.gms.internal.ads.zzgbq
            public final ListenableFuture zza(Object obj) {
                return ((Throwable) obj) instanceof TimeoutException ? zzgcj.zzh(new zzevn() { // from class: com.google.android.gms.internal.ads.zzeoa
                    @Override // com.google.android.gms.internal.ads.zzevn
                    public final void zzj(Object obj2) {
                        ((Bundle) obj2).putString("ms", Integer.toString(17));
                    }
                }) : zzgcj.zzh(new zzevn() { // from class: com.google.android.gms.internal.ads.zzeob
                    @Override // com.google.android.gms.internal.ads.zzevn
                    public final void zzj(Object obj2) {
                        ((Bundle) obj2).putString("ms", null);
                    }
                });
            }
        }, this.zzb);
    }
}
