package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzevz implements zzeuy {
    private final Executor zza;
    private final String zzb;
    private final PackageInfo zzc;
    private final zzcan zzd;

    public zzevz(zzcan zzcanVar, Executor executor, String str, PackageInfo packageInfo, int i) {
        this.zzd = zzcanVar;
        this.zza = executor;
        this.zzb = str;
        this.zzc = packageInfo;
    }

    @Override // com.google.android.gms.internal.ads.zzeuy
    public final int zza() {
        return 41;
    }

    @Override // com.google.android.gms.internal.ads.zzeuy
    public final ListenableFuture zzb() {
        return zzgbb.zzf(zzgbb.zzm(zzgbb.zzh(this.zzb), new zzftn() { // from class: com.google.android.gms.internal.ads.zzevx
            @Override // com.google.android.gms.internal.ads.zzftn
            public final Object apply(Object obj) {
                return new zzewa((String) obj);
            }
        }, this.zza), Throwable.class, new zzgai() { // from class: com.google.android.gms.internal.ads.zzevy
            @Override // com.google.android.gms.internal.ads.zzgai
            public final ListenableFuture zza(Object obj) {
                return zzevz.this.zzc((Throwable) obj);
            }
        }, this.zza);
    }

    final /* synthetic */ ListenableFuture zzc(Throwable th) throws Exception {
        return zzgbb.zzh(new zzewa(this.zzb));
    }
}
