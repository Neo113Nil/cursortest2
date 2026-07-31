package com.ironsource;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public final class tp {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f19809b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public static final String f19810c = "placements";

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public static final String f19811d = "placementName";

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final JSONArray f19812a;

    @Metadata
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public tp(@NotNull JSONObject configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f19812a = configuration.optJSONArray(f19810c);
    }

    @NotNull
    public final <T> Map<String, T> a(@NotNull Function1<? super JSONObject, ? extends T> valueExtractor) {
        Intrinsics.checkNotNullParameter(valueExtractor, "valueExtractor");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JSONArray jSONArray = this.f19812a;
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i4 = 0; i4 < length; i4++) {
                JSONObject jsonObject = jSONArray.getJSONObject(i4);
                String key = jsonObject.optString(f19811d);
                Intrinsics.checkNotNullExpressionValue(jsonObject, "jsonObject");
                Object invoke = valueExtractor.invoke(jsonObject);
                Intrinsics.checkNotNullExpressionValue(key, "key");
                linkedHashMap.put(key, invoke);
            }
        }
        return linkedHashMap;
    }
}
