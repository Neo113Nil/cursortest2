package com.ironsource;

import com.unity3d.mediation.LevelPlay;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public final class aq {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<LevelPlay.AdFormat, a> f15098a;

    @Metadata
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Map<String, b> f15099a;

        public a(@NotNull JSONObject adFormatProviderOrder) {
            Intrinsics.checkNotNullParameter(adFormatProviderOrder, "adFormatProviderOrder");
            List<String> b4 = nk.b(adFormatProviderOrder.names());
            b4 = b4 == null ? CollectionsKt.emptyList() : b4;
            LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.g.d(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(b4, 10)), 16));
            for (Object obj : b4) {
                JSONArray optJSONArray = adFormatProviderOrder.optJSONArray((String) obj);
                if (optJSONArray == null) {
                    optJSONArray = new JSONArray();
                } else {
                    Intrinsics.checkNotNullExpressionValue(optJSONArray, "adFormatProviderOrder.op…(adUnitId) ?: JSONArray()");
                }
                linkedHashMap.put(obj, new b(optJSONArray));
            }
            this.f15099a = linkedHashMap;
        }

        @NotNull
        public final Map<String, b> a() {
            return this.f15099a;
        }
    }

    @Metadata
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final List<String> f15100a;

        public b(@NotNull JSONArray providerOrder) {
            Intrinsics.checkNotNullParameter(providerOrder, "providerOrder");
            List<String> b4 = nk.b(providerOrder);
            Intrinsics.checkNotNullExpressionValue(b4, "jsonArrayToStringList(providerOrder)");
            this.f15100a = b4;
        }

        @NotNull
        public final List<String> a() {
            return this.f15100a;
        }
    }

    public aq(@NotNull JSONObject providerOrder) {
        Intrinsics.checkNotNullParameter(providerOrder, "providerOrder");
        LevelPlay.AdFormat[] values = LevelPlay.AdFormat.values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.g.d(MapsKt.mapCapacity(values.length), 16));
        for (LevelPlay.AdFormat adFormat : values) {
            JSONObject optJSONObject = providerOrder.optJSONObject(wt.a(adFormat));
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            } else {
                Intrinsics.checkNotNullExpressionValue(optJSONObject, "providerOrder.optJSONObj…dFormat)) ?: JSONObject()");
            }
            linkedHashMap.put(adFormat, new a(optJSONObject));
        }
        this.f15098a = linkedHashMap;
    }

    @NotNull
    public final Map<LevelPlay.AdFormat, a> a() {
        return this.f15098a;
    }
}
