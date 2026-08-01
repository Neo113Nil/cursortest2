package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
@Deprecated
/* loaded from: classes2.dex */
public final class zzdtu extends zzdtx {
    private final zzfjm zzg;

    public zzdtu(Executor executor, zzcbs zzcbsVar, zzfjm zzfjmVar, zzfjo zzfjoVar, Context context) {
        super(executor, zzcbsVar, zzfjoVar, context);
        this.zzg = zzfjmVar;
        zzfjmVar.zza(this.zzb);
    }

    public final Map zza() {
        return new HashMap(this.zzb);
    }
}
