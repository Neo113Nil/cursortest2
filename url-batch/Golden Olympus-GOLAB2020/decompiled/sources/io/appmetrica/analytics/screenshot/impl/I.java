package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.coreutils.internal.parsing.RemoteConfigJsonUtils;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class I implements JsonParser {

    /* renamed from: a, reason: collision with root package name */
    public final V f40700a;

    /* renamed from: b, reason: collision with root package name */
    public final U f40701b;

    /* JADX WARN: Multi-variable type inference failed */
    public I() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final G parse(@NotNull JSONObject jSONObject) {
        K k4;
        M m4;
        N n4;
        boolean extractFeature = RemoteConfigJsonUtils.extractFeature(jSONObject, "screenshot", AbstractC3168n.f40774a);
        V v4 = this.f40700a;
        U u4 = this.f40701b;
        u4.getClass();
        JSONObject optJSONObject = jSONObject.optJSONObject("screenshot");
        if (optJSONObject == null) {
            n4 = new N();
            n4.f40713a = new K();
            n4.f40714b = new M();
            L l4 = new L();
            l4.f40708c = AbstractC3168n.f40775b;
            n4.f40715c = l4;
        } else {
            N n5 = new N();
            u4.f40723a.getClass();
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("api_captor_config");
            L l5 = null;
            if (optJSONObject2 == null) {
                k4 = null;
            } else {
                k4 = new K();
                Boolean optBooleanOrNull = JsonUtils.optBooleanOrNull(optJSONObject2, "enabled");
                if (optBooleanOrNull != null) {
                    k4.f40704a = optBooleanOrNull.booleanValue();
                }
            }
            if (k4 != null) {
                n5.f40713a = k4;
            }
            u4.f40724b.getClass();
            JSONObject optJSONObject3 = optJSONObject.optJSONObject("service_captor_config");
            if (optJSONObject3 == null) {
                m4 = null;
            } else {
                m4 = new M();
                Boolean optBooleanOrNull2 = JsonUtils.optBooleanOrNull(optJSONObject3, "enabled");
                if (optBooleanOrNull2 != null) {
                    m4.f40710a = optBooleanOrNull2.booleanValue();
                }
                Long optLongOrNull = JsonUtils.optLongOrNull(optJSONObject3, "delay_seconds");
                if (optLongOrNull != null) {
                    m4.f40711b = optLongOrNull.longValue();
                }
            }
            if (m4 != null) {
                n5.f40714b = m4;
            }
            u4.f40725c.getClass();
            JSONObject optJSONObject4 = optJSONObject.optJSONObject("content_observer_captor_config");
            if (optJSONObject4 != null) {
                l5 = new L();
                Boolean optBooleanOrNull3 = JsonUtils.optBooleanOrNull(optJSONObject4, "enabled");
                if (optBooleanOrNull3 != null) {
                    l5.f40706a = optBooleanOrNull3.booleanValue();
                }
                JSONArray optJSONArray = optJSONObject4.optJSONArray("media_store_column_names");
                if (optJSONArray != null) {
                    IntRange p4 = kotlin.ranges.g.p(0, optJSONArray.length());
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(p4, 10));
                    Iterator it = p4.iterator();
                    while (it.hasNext()) {
                        arrayList.add(optJSONArray.getString(((kotlin.collections.E) it).a()));
                    }
                    Object[] array = arrayList.toArray(new String[0]);
                    if (array == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    }
                    l5.f40708c = (String[]) array;
                }
                Long optLongOrNull2 = JsonUtils.optLongOrNull(optJSONObject4, "detect_window_seconds");
                if (optLongOrNull2 != null) {
                    l5.f40707b = optLongOrNull2.longValue();
                }
            }
            if (l5 != null) {
                n5.f40715c = l5;
            }
            n4 = n5;
        }
        return new G(extractFeature, v4.toModel(n4));
    }

    @Nullable
    public final G b(@NotNull JSONObject jSONObject) {
        return (G) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final Object parseOrNull(JSONObject jSONObject) {
        return (G) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }

    public I(@NotNull V v4, @NotNull U u4) {
        this.f40700a = v4;
        this.f40701b = u4;
    }

    public /* synthetic */ I(V v4, U u4, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? new V(null, null, null, 7, null) : v4, (i4 & 2) != 0 ? new U() : u4);
    }
}
