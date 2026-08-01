package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzcir {
    private zzcbt zza;
    private Context zzb;
    private WeakReference zzc;

    public final zzcir zzc(Context context) {
        this.zzc = new WeakReference(context);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.zzb = context;
        return this;
    }

    public final zzcir zzd(zzcbt zzcbtVar) {
        this.zza = zzcbtVar;
        return this;
    }
}
