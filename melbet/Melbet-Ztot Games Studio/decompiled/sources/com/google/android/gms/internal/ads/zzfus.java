package com.google.android.gms.internal.ads;

import java.io.Serializable;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes3.dex */
public abstract class zzfus implements Serializable {
    zzfus() {
    }

    public static zzfus zzc() {
        return zzfud.zza;
    }

    public static zzfus zzd(@CheckForNull Object obj) {
        return obj == null ? zzfud.zza : new zzfuz(obj);
    }

    public abstract zzfus zza(zzful zzfulVar);

    public abstract Object zzb(Object obj);
}
