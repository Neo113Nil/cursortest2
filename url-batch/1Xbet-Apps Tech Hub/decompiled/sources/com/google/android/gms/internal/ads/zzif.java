package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzif {
    private final Context zza;
    private final zzid zzb;

    public zzif(Context context, Handler handler, zzie zzieVar) {
        this.zza = context.getApplicationContext();
        this.zzb = new zzid(this, handler, zzieVar);
    }
}
