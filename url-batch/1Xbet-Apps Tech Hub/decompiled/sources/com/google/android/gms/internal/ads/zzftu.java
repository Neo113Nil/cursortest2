package com.google.android.gms.internal.ads;

import java.io.Serializable;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public abstract class zzftu implements Serializable {
    zzftu() {
    }

    public static zzftu zzc() {
        return zzftd.zza;
    }

    public static zzftu zzd(@CheckForNull Object obj) {
        return obj == null ? zzftd.zza : new zzfud(obj);
    }

    public abstract zzftu zza(zzftn zzftnVar);

    public abstract Object zzb(Object obj);
}
