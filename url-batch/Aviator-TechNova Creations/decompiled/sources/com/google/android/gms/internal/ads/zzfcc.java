package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzfcc implements zzfax {
    private final Executor zza;
    private final String zzb;

    public zzfcc(zzcdm zzcdmVar, Executor executor, String str, PackageInfo packageInfo, int i) {
        this.zza = executor;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final ListenableFuture zza() {
        ListenableFuture zza = zzgzo.zza(this.zzb);
        zzfcb zzfcbVar = zzfcb.zza;
        Executor executor = this.zza;
        return zzgzo.zzh(zzgzo.zzk(zza, zzfcbVar, executor), Throwable.class, new zzgyw() { // from class: com.google.android.gms.internal.ads.zzfca
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzfcc.this.zzc((Throwable) obj);
            }
        }, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 41;
    }

    final /* synthetic */ ListenableFuture zzc(Throwable th) {
        return zzgzo.zza(new zzfcd(this.zzb));
    }
}
