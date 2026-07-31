package io.appmetrica.analytics.coreutils.internal.collection;

import android.os.Bundle;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractC3219i;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.ranges.g;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes3.dex */
public final class CollectionUtils {

    @NotNull
    public static final CollectionUtils INSTANCE = new CollectionUtils();

    private CollectionUtils() {
    }

    public static final boolean areCollectionsEqual(@Nullable Collection<? extends Object> collection, @Nullable Collection<? extends Object> collection2) {
        HashSet hashSet;
        if (collection == null && collection2 == null) {
            return true;
        }
        if (collection == null || collection2 == null || collection.size() != collection2.size()) {
            return false;
        }
        if (collection instanceof HashSet) {
            hashSet = (HashSet) collection;
            collection = collection2;
        } else if (collection2 instanceof HashSet) {
            hashSet = (HashSet) collection2;
        } else {
            HashSet hashSet2 = new HashSet(collection);
            collection = collection2;
            hashSet = hashSet2;
        }
        Iterator<? extends Object> it = collection.iterator();
        while (it.hasNext()) {
            if (!hashSet.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Nullable
    public static final <T> List<T> arrayListCopyOfNullableCollection(@Nullable Collection<? extends T> collection) {
        if (collection != null) {
            return CollectionsKt.toList(collection);
        }
        return null;
    }

    @NotNull
    public static final Map<String, byte[]> bundleToMap(@Nullable Bundle bundle) {
        HashMap hashMap = new HashMap();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                byte[] byteArray = bundle.getByteArray(str);
                if (byteArray != null) {
                    hashMap.put(str, byteArray);
                }
            }
        }
        return hashMap;
    }

    @NotNull
    public static final <T> Map<String, T> convertMapKeysToLowerCase(@NotNull Map<String, ? extends T> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            linkedHashMap.put(str != null ? str.toLowerCase(Locale.getDefault()) : null, entry.getValue());
        }
        return linkedHashMap;
    }

    @Nullable
    public static final <K, V> Map<K, V> copyOf(@Nullable Map<K, V> map) {
        if (map == null || map.isEmpty()) {
            return null;
        }
        return new HashMap(map);
    }

    @NotNull
    public static final List<String> createSortedListWithoutRepetitions(@NotNull String... strArr) {
        return unmodifiableListCopy(AbstractC3219i.u(strArr));
    }

    @Nullable
    public static final <T> T getFirstOrNull(@Nullable List<? extends T> list) {
        if (list != null) {
            return (T) CollectionsKt.firstOrNull((List) list);
        }
        return null;
    }

    @Nullable
    public static final <T> T getFromMapIgnoreCase(@NotNull Map<String, ? extends T> map, @NotNull String str) {
        T t4;
        Iterator<T> it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                t4 = null;
                break;
            }
            t4 = it.next();
            Map.Entry entry = (Map.Entry) t4;
            CharSequence charSequence = (CharSequence) entry.getKey();
            if (charSequence != null && charSequence.length() != 0 && StringsKt.w((String) entry.getKey(), str, true)) {
                break;
            }
        }
        Map.Entry entry2 = (Map.Entry) t4;
        if (entry2 != null) {
            return (T) entry2.getValue();
        }
        return null;
    }

    @Nullable
    public static final <K, V> List<Map.Entry<K, V>> getListFromMap(@Nullable Map<K, ? extends V> map) {
        if (map == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(map.size());
        Iterator<Map.Entry<K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(new AbstractMap.SimpleEntry(it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <K, V> Map<K, V> getMapFromList(@Nullable List<? extends Map.Entry<? extends K, ? extends V>> list) {
        if (list == null) {
            return new LinkedHashMap();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(g.d(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static final <K, V> Map<K, V> getMapFromListOrNull(@Nullable List<? extends Map.Entry<? extends K, ? extends V>> list) {
        if (list == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(g.d(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        return linkedHashMap;
    }

    public static final <K, V> V getOrDefault(@NotNull Map<K, ? extends V> map, K k4, V v4) {
        V v5 = map.get(k4);
        return v5 == null ? v4 : v5;
    }

    @NotNull
    public static final Set<Integer> hashSetFromIntArray(@NotNull int[] iArr) {
        return AbstractC3219i.z0(iArr);
    }

    public static final boolean isNullOrEmpty(@Nullable Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }

    @Nullable
    public static final <K, V> Map<K, V> mapCopyOfNullableMap(@Nullable Map<K, ? extends V> map) {
        if (map != null) {
            return MapsKt.toMap(map);
        }
        return null;
    }

    @NotNull
    public static final Bundle mapToBundle(@NotNull Map<String, byte[]> map) {
        Bundle bundle = new Bundle(map.size());
        for (Map.Entry<String, byte[]> entry : map.entrySet()) {
            bundle.putByteArray(entry.getKey(), entry.getValue());
        }
        return bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static final <T> List<T> nullIfEmptyList(@Nullable List<? extends T> list) {
        if (list == 0 || list.isEmpty()) {
            return null;
        }
        return list;
    }

    public static final <K, V> void putOpt(@NotNull Map<K, V> map, @Nullable K k4, @Nullable V v4) {
        if (k4 == null || v4 == null) {
            return;
        }
        map.put(k4, v4);
    }

    @NotNull
    public static final List<Integer> toIntList(@NotNull int[] iArr) {
        return AbstractC3219i.E0(iArr);
    }

    @NotNull
    public static final <T> List<T> unmodifiableListCopy(@NotNull Collection<? extends T> collection) {
        return Collections.unmodifiableList(new ArrayList(collection));
    }

    @NotNull
    public static final <K, V> Map<K, V> unmodifiableMapCopy(@NotNull Map<K, ? extends V> map) {
        return Collections.unmodifiableMap(new HashMap(map));
    }

    @NotNull
    public static final <K, V> Map<K, V> unmodifiableSameOrderMapCopy(@NotNull Map<K, ? extends V> map) {
        return Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    @NotNull
    public static final <T> Set<T> unmodifiableSetOf(@NotNull T... tArr) {
        return Collections.unmodifiableSet(AbstractC3219i.A0(tArr));
    }
}
