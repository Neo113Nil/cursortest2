package com.google.android.gms.ads.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzaun;
import com.google.android.gms.internal.ads.zzauo;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
final class zzp implements Callable {
    final /* synthetic */ zzt zza;

    zzp(zzt zztVar) {
        this.zza = zztVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        VersionInfoParcel versionInfoParcel;
        Context context;
        zzt zztVar = this.zza;
        versionInfoParcel = zztVar.zza;
        String str = versionInfoParcel.afmaVersion;
        context = zztVar.zzd;
        return new zzauo(zzaun.zzt(str, context, false));
    }
}
