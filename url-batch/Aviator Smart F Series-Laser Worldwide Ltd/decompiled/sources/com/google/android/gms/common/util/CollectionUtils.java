package com.google.android.gms.common.util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import androidx.collection.ArraySet;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.errorprone.annotations.InlineMe;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@KeepForSdk
/* loaded from: classes3.dex */
public final class CollectionUtils {
    private CollectionUtils() {
    }

    @KeepForSdk
    public static boolean isEmpty(@Nullable Collection<?> collection) {
        if (collection == null) {
            return true;
        }
        return collection.isEmpty();
    }

    @NonNull
    @Deprecated
    @InlineMe(imports = {"java.util.Collections"}, replacement = "Collections.emptyList()")
    @KeepForSdk
    public static <T> List<T> listOf() {
        return Collections.emptyList();
    }

    @NonNull
    @KeepForSdk
    public static <K, V> Map<K, V> mapOf(@NonNull K k8, @NonNull V v7, @NonNull K k9, @NonNull V v8, @NonNull K k10, @NonNull V v9) {
        Map zza = zza(3, false);
        zza.put(k8, v7);
        zza.put(k9, v8);
        zza.put(k10, v9);
        return Collections.unmodifiableMap(zza);
    }

    @NonNull
    @KeepForSdk
    public static <K, V> Map<K, V> mapOfKeyValueArrays(@NonNull K[] kArr, @NonNull V[] vArr) {
        int length = kArr.length;
        int length2 = vArr.length;
        if (length != length2) {
            throw new IllegalArgumentException("Key and values array lengths not equal: " + length + " != " + length2);
        }
        if (length == 0) {
            return Collections.emptyMap();
        }
        if (length == 1) {
            return Collections.singletonMap(kArr[0], vArr[0]);
        }
        Map zza = zza(length, false);
        for (int i8 = 0; i8 < kArr.length; i8++) {
            zza.put(kArr[i8], vArr[i8]);
        }
        return Collections.unmodifiableMap(zza);
    }

    @NonNull
    @KeepForSdk
    public static <T> Set<T> mutableSetOfWithSize(int i8) {
        return i8 == 0 ? new ArraySet() : zzb(i8, true);
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    public static <T> Set<T> setOf(@NonNull T t7, @NonNull T t8, @NonNull T t9) {
        Set zzb = zzb(3, false);
        zzb.add(t7);
        zzb.add(t8);
        zzb.add(t9);
        return Collections.unmodifiableSet(zzb);
    }

    private static Map zza(int i8, boolean z7) {
        return i8 <= 256 ? new ArrayMap(i8) : new HashMap(i8, 1.0f);
    }

    private static Set zzb(int i8, boolean z7) {
        if (i8 <= (true != z7 ? 256 : 128)) {
            return new ArraySet(i8);
        }
        return new HashSet(i8, true != z7 ? 1.0f : 0.75f);
    }

    @NonNull
    @Deprecated
    @InlineMe(imports = {"java.util.Collections"}, replacement = "Collections.singletonList(item)")
    @KeepForSdk
    public static <T> List<T> listOf(@NonNull T t7) {
        return Collections.singletonList(t7);
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    public static <T> List<T> listOf(@NonNull T... tArr) {
        int length = tArr.length;
        if (length == 0) {
            return Collections.emptyList();
        }
        if (length != 1) {
            return Collections.unmodifiableList(Arrays.asList(tArr));
        }
        return Collections.singletonList(tArr[0]);
    }

    @NonNull
    @KeepForSdk
    public static <K, V> Map<K, V> mapOf(@NonNull K k8, @NonNull V v7, @NonNull K k9, @NonNull V v8, @NonNull K k10, @NonNull V v9, @NonNull K k11, @NonNull V v10, @NonNull K k12, @NonNull V v11, @NonNull K k13, @NonNull V v12) {
        Map zza = zza(6, false);
        zza.put(k8, v7);
        zza.put(k9, v8);
        zza.put(k10, v9);
        zza.put(k11, v10);
        zza.put(k12, v11);
        zza.put(k13, v12);
        return Collections.unmodifiableMap(zza);
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    public static <T> Set<T> setOf(@NonNull T... tArr) {
        int length = tArr.length;
        if (length == 0) {
            return Collections.emptySet();
        }
        if (length == 1) {
            return Collections.singleton(tArr[0]);
        }
        if (length == 2) {
            T t7 = tArr[0];
            T t8 = tArr[1];
            Set zzb = zzb(2, false);
            zzb.add(t7);
            zzb.add(t8);
            return Collections.unmodifiableSet(zzb);
        }
        if (length == 3) {
            return setOf(tArr[0], tArr[1], tArr[2]);
        }
        if (length != 4) {
            Set zzb2 = zzb(length, false);
            Collections.addAll(zzb2, tArr);
            return Collections.unmodifiableSet(zzb2);
        }
        T t9 = tArr[0];
        T t10 = tArr[1];
        T t11 = tArr[2];
        T t12 = tArr[3];
        Set zzb3 = zzb(4, false);
        zzb3.add(t9);
        zzb3.add(t10);
        zzb3.add(t11);
        zzb3.add(t12);
        return Collections.unmodifiableSet(zzb3);
    }
}
