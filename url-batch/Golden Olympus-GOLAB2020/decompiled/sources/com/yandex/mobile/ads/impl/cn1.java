package com.yandex.mobile.ads.impl;

import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class cn1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<String, String> f24269a;

    public static final class a {
        @NotNull
        public static Uri a(@NotNull Uri uri, @NotNull Function1 modifier) {
            Map map;
            Intrinsics.checkNotNullParameter(uri, "<this>");
            Intrinsics.checkNotNullParameter(modifier, "modifier");
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            if (queryParameterNames != null) {
                map = new LinkedHashMap(kotlin.ranges.g.d(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(queryParameterNames, 10)), 16));
                for (String str : queryParameterNames) {
                    Pair pair = TuplesKt.to(str, uri.getQueryParameter(str));
                    map.put(pair.getFirst(), pair.getSecond());
                }
            } else {
                map = null;
            }
            if (map == null) {
                map = MapsKt.emptyMap();
            }
            cn1 cn1Var = (cn1) ((da2) modifier).invoke(new cn1(map));
            Uri.Builder clearQuery = uri.buildUpon().clearQuery();
            for (Map.Entry<String, String> entry : cn1Var.a().entrySet()) {
                clearQuery.appendQueryParameter(entry.getKey(), entry.getValue());
            }
            Uri build = clearQuery.build();
            Intrinsics.checkNotNullExpressionValue(build, "build(...)");
            return build;
        }
    }

    public cn1(@NotNull Map<String, String> rawParams) {
        Intrinsics.checkNotNullParameter(rawParams, "rawParams");
        this.f24269a = MapsKt.toMutableMap(rawParams);
    }

    @NotNull
    public final Map<String, String> a() {
        return this.f24269a;
    }

    public final void a(@NotNull String key, @Nullable String str) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (str == null || str.length() <= 0) {
            return;
        }
        this.f24269a.put(key, str);
    }
}
