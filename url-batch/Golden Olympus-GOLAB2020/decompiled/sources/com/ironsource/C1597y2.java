package com.ironsource;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* renamed from: com.ironsource.y2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1597y2 {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f20366b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public static final String f20367c = "adUnits";

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final JSONObject f20368a;

    @Metadata
    /* renamed from: com.ironsource.y2$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C1597y2(@NotNull JSONObject configurations) {
        Intrinsics.checkNotNullParameter(configurations, "configurations");
        this.f20368a = configurations.optJSONObject(f20367c);
    }

    @NotNull
    public final <T> Map<String, T> a(@NotNull Function1<? super JSONObject, ? extends T> valueExtractor) {
        Intrinsics.checkNotNullParameter(valueExtractor, "valueExtractor");
        JSONObject jSONObject = this.f20368a;
        if (jSONObject == null) {
            return MapsKt.emptyMap();
        }
        Iterator<String> keys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(keys, "adUnits.keys()");
        Sequence c4 = kotlin.sequences.k.c(keys);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : c4) {
            JSONObject jSONObject2 = jSONObject.getJSONObject((String) obj);
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "adUnits.getJSONObject(adUnitId)");
            linkedHashMap.put(obj, valueExtractor.invoke(jSONObject2));
        }
        return linkedHashMap;
    }
}
