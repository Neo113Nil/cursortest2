package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzfor {
    private final Context zza;
    private final Looper zzb;

    public zzfor(Context context, Looper looper) {
        this.zza = context;
        this.zzb = looper;
    }

    public final void zza(String str) {
        zzfpb zza = zzfpd.zza();
        Context context = this.zza;
        zza.zza(context.getPackageName());
        zza.zzc(2);
        zzfoz zza2 = zzfpa.zza();
        zza2.zza(str);
        zza2.zzb(2);
        zza.zzb(zza2);
        new zzfos(context, this.zzb, (zzfpd) zza.zzbu()).zza();
    }
}
