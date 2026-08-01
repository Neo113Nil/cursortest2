package com.google.android.gms.ads.internal;

import android.content.Context;
import com.google.android.gms.internal.ads.zzash;
import com.google.android.gms.internal.ads.zzasi;
import com.google.android.gms.internal.ads.zzcbt;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzo implements Callable {
    final /* synthetic */ zzs zza;

    zzo(zzs zzsVar) {
        this.zza = zzsVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzcbt zzcbtVar;
        Context context;
        zzs zzsVar = this.zza;
        zzcbtVar = zzsVar.zza;
        String str = zzcbtVar.zza;
        context = zzsVar.zzd;
        return new zzasi(zzash.zzt(str, context, false));
    }
}
