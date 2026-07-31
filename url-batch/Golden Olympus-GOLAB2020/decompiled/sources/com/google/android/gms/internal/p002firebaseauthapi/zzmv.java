package com.google.android.gms.internal.p002firebaseauthapi;

import java.lang.Enum;
import java.security.GeneralSecurityException;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzmv<E extends Enum<E>, O> {
    private final Map<E, O> zza;
    private final Map<O, E> zzb;

    public static <E extends Enum<E>, O> zzmu<E, O> zza() {
        return new zzmu<>();
    }

    private zzmv(Map<E, O> map, Map<O, E> map2) {
        this.zza = map;
        this.zzb = map2;
    }

    public final E zza(O o4) {
        E e4 = this.zzb.get(o4);
        if (e4 != null) {
            return e4;
        }
        throw new GeneralSecurityException("Unable to convert object enum: " + String.valueOf(o4));
    }

    public final O zza(E e4) {
        O o4 = this.zza.get(e4);
        if (o4 != null) {
            return o4;
        }
        throw new GeneralSecurityException("Unable to convert proto enum: " + String.valueOf(e4));
    }
}
