package ru.rustore.sdk.core.util;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes3.dex */
public final class CollectionExtKt {
    @SuppressLint({})
    @Nullable
    public static final ComponentName findActivityComponentName(@NotNull List<? extends ResolveInfo> list, @NotNull String releasePackage, @NotNull String debugPackage) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(releasePackage, "releasePackage");
        Intrinsics.checkNotNullParameter(debugPackage, "debugPackage");
        List<? extends ResolveInfo> list2 = list;
        LinkedHashMap linkedHashMap = new LinkedHashMap(g.d(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list2, 10)), 16));
        for (ResolveInfo resolveInfo : list2) {
            Pair pair = TuplesKt.to(resolveInfo.activityInfo.packageName, resolveInfo);
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        ResolveInfo resolveInfo2 = (ResolveInfo) linkedHashMap.get(debugPackage);
        if (resolveInfo2 == null) {
            resolveInfo2 = (ResolveInfo) linkedHashMap.get(releasePackage);
        }
        if (resolveInfo2 == null) {
            return null;
        }
        ActivityInfo activityInfo = resolveInfo2.activityInfo;
        return new ComponentName(activityInfo.packageName, activityInfo.name);
    }

    @Nullable
    public static final ComponentName findRuStoreActivityComponentName(@NotNull List<? extends ResolveInfo> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return findActivityComponentName(list, "ru.vk.store", "ru.vk.store.qa");
    }

    @Nullable
    public static final ComponentName findRuStoreServiceComponentName(@NotNull List<? extends ResolveInfo> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return findServiceComponentName(list, "ru.vk.store", "ru.vk.store.qa");
    }

    @SuppressLint({})
    @Nullable
    public static final ComponentName findServiceComponentName(@NotNull List<? extends ResolveInfo> list, @NotNull String releasePackage, @NotNull String debugPackage) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(releasePackage, "releasePackage");
        Intrinsics.checkNotNullParameter(debugPackage, "debugPackage");
        List<? extends ResolveInfo> list2 = list;
        LinkedHashMap linkedHashMap = new LinkedHashMap(g.d(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list2, 10)), 16));
        for (ResolveInfo resolveInfo : list2) {
            Pair pair = TuplesKt.to(resolveInfo.serviceInfo.packageName, resolveInfo);
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        ResolveInfo resolveInfo2 = (ResolveInfo) linkedHashMap.get(debugPackage);
        if (resolveInfo2 == null) {
            resolveInfo2 = (ResolveInfo) linkedHashMap.get(releasePackage);
        }
        if (resolveInfo2 == null) {
            return null;
        }
        ServiceInfo serviceInfo = resolveInfo2.serviceInfo;
        return new ComponentName(serviceInfo.packageName, serviceInfo.name);
    }
}
