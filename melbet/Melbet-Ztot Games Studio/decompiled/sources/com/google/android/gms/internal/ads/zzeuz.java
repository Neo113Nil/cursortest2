package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzeuz implements zzevo {
    private final zzbya zza;
    private final zzgcu zzb;
    private final Context zzc;

    public zzeuz(zzbya zzbyaVar, zzgcu zzgcuVar, Context context) {
        this.zza = zzbyaVar;
        this.zzb = zzgcuVar;
        this.zzc = context;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final int zza() {
        return 34;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final ListenableFuture zzb() {
        return this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeuy
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeuz.this.zzc();
            }
        });
    }

    final /* synthetic */ zzeva zzc() throws Exception {
        if (!this.zza.zzp(this.zzc)) {
            return new zzeva(null, null, null, null, null);
        }
        String zzd = this.zza.zzd(this.zzc);
        String str = zzd == null ? "" : zzd;
        String zzb = this.zza.zzb(this.zzc);
        String str2 = zzb == null ? "" : zzb;
        String zza = this.zza.zza(this.zzc);
        String str3 = zza == null ? "" : zza;
        String str4 = true != this.zza.zzp(this.zzc) ? null : "fa";
        return new zzeva(str, str2, str3, str4 == null ? "" : str4, "TIME_OUT".equals(str2) ? (Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzaa) : null);
    }
}
