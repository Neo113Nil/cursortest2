package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes.dex */
final class zzaly {
    private static final zzaly zza = new zzaly();
    private final ConcurrentMap<Class<?>, zzamc<?>> zzc = new ConcurrentHashMap();
    private final zzamf zzb = new zzalb();

    private zzaly() {
    }

    public static zzaly zza() {
        return zza;
    }

    public final <T> zzamc<T> zza(Class<T> cls) {
        zzaki.zza(cls, "messageType");
        zzamc<T> zzamcVar = (zzamc) this.zzc.get(cls);
        if (zzamcVar == null) {
            zzamcVar = this.zzb.zza(cls);
            zzaki.zza(cls, "messageType");
            zzaki.zza(zzamcVar, "schema");
            zzamc<T> zzamcVar2 = (zzamc) this.zzc.putIfAbsent(cls, zzamcVar);
            if (zzamcVar2 != null) {
                return zzamcVar2;
            }
        }
        return zzamcVar;
    }

    public final <T> zzamc<T> zza(T t4) {
        return zza((Class) t4.getClass());
    }
}
