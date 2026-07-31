package com.google.android.gms.common.util;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class CollectionUtils {
    private CollectionUtils() {
    }

    public static boolean isEmpty(Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }

    @Deprecated
    public static <T> List<T> listOf() {
        return Collections.EMPTY_LIST;
    }

    public static <K, V> Map<K, V> mapOf(K k4, V v4, K k5, V v5, K k6, V v6) {
        Map zzb = zzb(3, false);
        zzb.put(k4, v4);
        zzb.put(k5, v5);
        zzb.put(k6, v6);
        return Collections.unmodifiableMap(zzb);
    }

    public static <K, V> Map<K, V> mapOfKeyValueArrays(K[] kArr, V[] vArr) {
        int length = kArr.length;
        int length2 = vArr.length;
        if (length != length2) {
            StringBuilder sb = new StringBuilder(String.valueOf(length).length() + 44 + String.valueOf(length2).length());
            sb.append("Key and values array lengths not equal: ");
            sb.append(length);
            sb.append(" != ");
            sb.append(length2);
            throw new IllegalArgumentException(sb.toString());
        }
        if (length == 0) {
            return Collections.EMPTY_MAP;
        }
        if (length == 1) {
            return Collections.singletonMap(kArr[0], vArr[0]);
        }
        Map zzb = zzb(length, false);
        for (int i4 = 0; i4 < kArr.length; i4++) {
            zzb.put(kArr[i4], vArr[i4]);
        }
        return Collections.unmodifiableMap(zzb);
    }

    public static <T> Set<T> mutableSetOfWithSize(int i4) {
        return i4 == 0 ? new androidx.collection.b() : zza(i4, true);
    }

    @Deprecated
    public static <T> Set<T> setOf(T t4, T t5, T t6) {
        Set zza = zza(3, false);
        zza.add(t4);
        zza.add(t5);
        zza.add(t6);
        return Collections.unmodifiableSet(zza);
    }

    private static Set zza(int i4, boolean z4) {
        if (i4 <= (true != z4 ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN)) {
            return new androidx.collection.b(i4);
        }
        return new HashSet(i4, true != z4 ? 1.0f : 0.75f);
    }

    private static Map zzb(int i4, boolean z4) {
        return i4 <= 256 ? new androidx.collection.a(i4) : new HashMap(i4, 1.0f);
    }

    @Deprecated
    public static <T> List<T> listOf(T t4) {
        return Collections.singletonList(t4);
    }

    @Deprecated
    public static <T> List<T> listOf(T... tArr) {
        int length = tArr.length;
        if (length == 0) {
            return Collections.EMPTY_LIST;
        }
        if (length != 1) {
            return Collections.unmodifiableList(Arrays.asList(tArr));
        }
        return Collections.singletonList(tArr[0]);
    }

    public static <K, V> Map<K, V> mapOf(K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8, K k9, V v9) {
        Map zzb = zzb(6, false);
        zzb.put(k4, v4);
        zzb.put(k5, v5);
        zzb.put(k6, v6);
        zzb.put(k7, v7);
        zzb.put(k8, v8);
        zzb.put(k9, v9);
        return Collections.unmodifiableMap(zzb);
    }

    @Deprecated
    public static <T> Set<T> setOf(T... tArr) {
        int length = tArr.length;
        if (length == 0) {
            return Collections.EMPTY_SET;
        }
        if (length == 1) {
            return Collections.singleton(tArr[0]);
        }
        if (length == 2) {
            T t4 = tArr[0];
            T t5 = tArr[1];
            Set zza = zza(2, false);
            zza.add(t4);
            zza.add(t5);
            return Collections.unmodifiableSet(zza);
        }
        if (length == 3) {
            return setOf(tArr[0], tArr[1], tArr[2]);
        }
        if (length != 4) {
            Set zza2 = zza(length, false);
            Collections.addAll(zza2, tArr);
            return Collections.unmodifiableSet(zza2);
        }
        T t6 = tArr[0];
        T t7 = tArr[1];
        T t8 = tArr[2];
        T t9 = tArr[3];
        Set zza3 = zza(4, false);
        zza3.add(t6);
        zza3.add(t7);
        zza3.add(t8);
        zza3.add(t9);
        return Collections.unmodifiableSet(zza3);
    }
}
