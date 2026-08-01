package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzfoe {
    private final Context zza;
    private final Looper zzb;

    public zzfoe(Context context, Looper looper) {
        this.zza = context;
        this.zzb = looper;
    }

    public final void zza(String str) {
        zzfos zza = zzfou.zza();
        zza.zza(this.zza.getPackageName());
        zza.zzc(2);
        zzfop zza2 = zzfoq.zza();
        zza2.zza(str);
        zza2.zzb(2);
        zza.zzb(zza2);
        new zzfof(this.zza, this.zzb, (zzfou) zza.zzal()).zza();
    }
}
