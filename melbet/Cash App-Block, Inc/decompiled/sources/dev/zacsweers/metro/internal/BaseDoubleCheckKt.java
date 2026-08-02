package dev.zacsweers.metro.internal;

import dev.zacsweers.metro.Provider;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.collections.builders.MapBuilder;
import papa.Handlers$$ExternalSyntheticBUOutline0;

/* loaded from: classes.dex */
public abstract class BaseDoubleCheckKt {
    public static final Object UNINITIALIZED = new Object();

    public static final boolean hasDuplicates(ArrayList arrayList) {
        arrayList.getClass();
        return arrayList.size() >= 2 && arrayList.size() != CollectionsKt.toSet(arrayList).size();
    }

    public static Lazy lazy(Provider provider) {
        provider.getClass();
        return provider instanceof Lazy ? (Lazy) provider : new DoubleCheck(provider);
    }

    public static final LinkedHashMap newLinkedHashMapWithExpectedSize(int i) {
        if (i >= 0) {
            i = i < 3 ? i + 1 : i < 1073741824 ? (int) ((i / 0.75f) + 1.0f) : Integer.MAX_VALUE;
        }
        return new LinkedHashMap(i);
    }

    public static final ArrayList presizedList(int i) {
        return i == 0 ? new ArrayList() : new ArrayList(i);
    }

    public static DoubleCheck provider(Provider provider) {
        provider.getClass();
        return provider instanceof DoubleCheck ? (DoubleCheck) provider : new DoubleCheck(provider);
    }

    public static void setDelegate(Provider provider, Provider provider2) {
        provider.getClass();
        DelegateFactory delegateFactory = (DelegateFactory) provider;
        Provider provider3 = delegateFactory.delegate;
        if (provider3 == null) {
            delegateFactory.delegate = provider2;
        } else {
            Handlers$$ExternalSyntheticBUOutline0.m(provider3, "Backing delegate already set: ");
        }
    }

    public static final Map toUnmodifiableMap(Map map) {
        map.getClass();
        if (map.isEmpty()) {
            EmptyMap emptyMap = EmptyMap.INSTANCE;
            emptyMap.getClass();
            return emptyMap;
        }
        MapBuilder mapBuilder = new MapBuilder(map.size());
        mapBuilder.putAll(map);
        return mapBuilder.build();
    }
}
