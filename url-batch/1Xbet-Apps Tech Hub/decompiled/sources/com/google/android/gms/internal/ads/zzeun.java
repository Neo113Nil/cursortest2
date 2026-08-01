package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzeun implements zzeuy {
    private final zzgbl zza;
    private final Context zzb;
    private final zzcbt zzc;
    private final String zzd;

    zzeun(zzgbl zzgblVar, Context context, zzcbt zzcbtVar, String str) {
        this.zza = zzgblVar;
        this.zzb = context;
        this.zzc = zzcbtVar;
        this.zzd = str;
    }

    @Override // com.google.android.gms.internal.ads.zzeuy
    public final int zza() {
        return 35;
    }

    @Override // com.google.android.gms.internal.ads.zzeuy
    public final ListenableFuture zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeum
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeun.this.zzc();
            }
        });
    }

    final /* synthetic */ zzeuo zzc() throws Exception {
        boolean isCallerInstantApp = Wrappers.packageManager(this.zzb).isCallerInstantApp();
        com.google.android.gms.ads.internal.zzt.zzp();
        boolean zzD = com.google.android.gms.ads.internal.util.zzt.zzD(this.zzb);
        String str = this.zzc.zza;
        com.google.android.gms.ads.internal.zzt.zzp();
        boolean zzE = com.google.android.gms.ads.internal.util.zzt.zzE();
        com.google.android.gms.ads.internal.zzt.zzp();
        ApplicationInfo applicationInfo = this.zzb.getApplicationInfo();
        int i = applicationInfo == null ? 0 : applicationInfo.targetSdkVersion;
        Context context = this.zzb;
        return new zzeuo(isCallerInstantApp, zzD, str, zzE, i, DynamiteModule.getRemoteVersion(context, ModuleDescriptor.MODULE_ID), DynamiteModule.getLocalVersion(context, ModuleDescriptor.MODULE_ID), this.zzd);
    }
}
