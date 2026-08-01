package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzcez extends com.google.android.gms.ads.internal.util.zzb {
    final zzcdw zza;
    final zzcfh zzb;
    private final String zzc;
    private final String[] zzd;

    zzcez(zzcdw zzcdwVar, zzcfh zzcfhVar, String str, String[] strArr) {
        this.zza = zzcdwVar;
        this.zzb = zzcfhVar;
        this.zzc = str;
        this.zzd = strArr;
        com.google.android.gms.ads.internal.zzt.zzy().zzb(this);
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        try {
            this.zzb.zzu(this.zzc, this.zzd);
        } finally {
            com.google.android.gms.ads.internal.util.zzt.zza.post(new zzcey(this));
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final ListenableFuture zzb() {
        return (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzbU)).booleanValue() && (this.zzb instanceof zzcfq)) ? zzcca.zze.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzcex
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzcez.this.zzd();
            }
        }) : super.zzb();
    }

    final /* synthetic */ Boolean zzd() throws Exception {
        return Boolean.valueOf(this.zzb.zzw(this.zzc, this.zzd, this));
    }

    public final String zze() {
        return this.zzc;
    }
}
