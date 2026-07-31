package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class zzalh<K, V> extends LinkedHashMap<K, V> {
    private static final zzalh<?, ?> zza;
    private boolean zzb;

    static {
        zzalh<?, ?> zzalhVar = new zzalh<>();
        zza = zzalhVar;
        ((zzalh) zzalhVar).zzb = false;
    }

    private zzalh() {
        this.zzb = true;
    }

    private static int zza(Object obj) {
        if (obj instanceof byte[]) {
            return zzaki.zza((byte[]) obj);
        }
        if (obj instanceof zzakl) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    private final void zze() {
        if (!this.zzb) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        zze();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x005c A[RETURN] */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z4;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this != map) {
                if (size() == map.size()) {
                    for (Map.Entry<K, V> entry : entrySet()) {
                        if (map.containsKey(entry.getKey())) {
                            V value = entry.getValue();
                            Object obj2 = map.get(entry.getKey());
                            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                            }
                        }
                    }
                }
                z4 = false;
                if (!z4) {
                    return true;
                }
            }
            z4 = true;
            if (!z4) {
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i4 = 0;
        for (Map.Entry<K, V> entry : entrySet()) {
            i4 += zza(entry.getValue()) ^ zza(entry.getKey());
        }
        return i4;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V put(K k4, V v4) {
        zze();
        zzaki.zza(k4);
        zzaki.zza(v4);
        return (V) super.put(k4, v4);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        zze();
        for (K k4 : map.keySet()) {
            zzaki.zza(k4);
            zzaki.zza(map.get(k4));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        zze();
        return (V) super.remove(obj);
    }

    public final zzalh<K, V> zzb() {
        return isEmpty() ? new zzalh<>() : new zzalh<>(this);
    }

    public final void zzc() {
        this.zzb = false;
    }

    public final boolean zzd() {
        return this.zzb;
    }

    private zzalh(Map<K, V> map) {
        super(map);
        this.zzb = true;
    }

    public static <K, V> zzalh<K, V> zza() {
        return (zzalh<K, V>) zza;
    }

    public final void zza(zzalh<K, V> zzalhVar) {
        zze();
        if (zzalhVar.isEmpty()) {
            return;
        }
        putAll(zzalhVar);
    }
}
