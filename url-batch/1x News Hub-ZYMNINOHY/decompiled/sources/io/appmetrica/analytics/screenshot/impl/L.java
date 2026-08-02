package io.appmetrica.analytics.screenshot.impl;

import a.AbstractC0129a;
import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.coreutils.internal.parsing.RemoteConfigJsonUtils;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class L implements JsonParser {

    /* renamed from: a, reason: collision with root package name */
    public final Y f8992a;

    /* renamed from: b, reason: collision with root package name */
    public final X f8993b;

    /* JADX WARN: Multi-variable type inference failed */
    public L() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final J parse(JSONObject jSONObject) {
        N n3;
        P p3;
        Q q3;
        boolean extractFeature = RemoteConfigJsonUtils.extractFeature(jSONObject, "screenshot", AbstractC1032o.f9065a);
        Y y3 = this.f8992a;
        X x3 = this.f8993b;
        x3.getClass();
        JSONObject optJSONObject = jSONObject.optJSONObject("screenshot");
        if (optJSONObject == null) {
            q3 = new Q();
            q3.f9005a = new N();
            q3.f9006b = new P();
            O o = new O();
            o.f9000c = AbstractC1032o.f9066b;
            q3.f9007c = o;
        } else {
            Q q4 = new Q();
            x3.f9015a.getClass();
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("api_captor_config");
            O o3 = null;
            if (optJSONObject2 == null) {
                n3 = null;
            } else {
                n3 = new N();
                Boolean optBooleanOrNull = JsonUtils.optBooleanOrNull(optJSONObject2, "enabled");
                if (optBooleanOrNull != null) {
                    n3.f8996a = optBooleanOrNull.booleanValue();
                }
            }
            if (n3 != null) {
                q4.f9005a = n3;
            }
            x3.f9016b.getClass();
            JSONObject optJSONObject3 = optJSONObject.optJSONObject("service_captor_config");
            if (optJSONObject3 == null) {
                p3 = null;
            } else {
                p3 = new P();
                Boolean optBooleanOrNull2 = JsonUtils.optBooleanOrNull(optJSONObject3, "enabled");
                if (optBooleanOrNull2 != null) {
                    p3.f9002a = optBooleanOrNull2.booleanValue();
                }
                Long optLongOrNull = JsonUtils.optLongOrNull(optJSONObject3, "delay_seconds");
                if (optLongOrNull != null) {
                    p3.f9003b = optLongOrNull.longValue();
                }
            }
            if (p3 != null) {
                q4.f9006b = p3;
            }
            x3.f9017c.getClass();
            JSONObject optJSONObject4 = optJSONObject.optJSONObject("content_observer_captor_config");
            if (optJSONObject4 != null) {
                o3 = new O();
                Boolean optBooleanOrNull3 = JsonUtils.optBooleanOrNull(optJSONObject4, "enabled");
                if (optBooleanOrNull3 != null) {
                    o3.f8998a = optBooleanOrNull3.booleanValue();
                }
                JSONArray optJSONArray = optJSONObject4.optJSONArray("media_store_column_names");
                if (optJSONArray != null) {
                    p2.c G2 = AbstractC0129a.G(0, optJSONArray.length());
                    ArrayList arrayList = new ArrayList(c2.g.N(G2));
                    Iterator it = G2.iterator();
                    while (((p2.b) it).f10223c) {
                        arrayList.add(optJSONArray.getString(((p2.b) it).a()));
                    }
                    Object[] array = arrayList.toArray(new String[0]);
                    if (array == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    }
                    o3.f9000c = (String[]) array;
                }
                Long optLongOrNull2 = JsonUtils.optLongOrNull(optJSONObject4, "detect_window_seconds");
                if (optLongOrNull2 != null) {
                    o3.f8999b = optLongOrNull2.longValue();
                }
            }
            if (o3 != null) {
                q4.f9007c = o3;
            }
            q3 = q4;
        }
        return new J(extractFeature, y3.toModel(q3));
    }

    public final J b(JSONObject jSONObject) {
        return (J) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final Object parseOrNull(JSONObject jSONObject) {
        return (J) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }

    public L(Y y3, X x3) {
        this.f8992a = y3;
        this.f8993b = x3;
    }

    public /* synthetic */ L(Y y3, X x3, int i3, kotlin.jvm.internal.f fVar) {
        this((i3 & 1) != 0 ? new Y(null, null, null, 7, null) : y3, (i3 & 2) != 0 ? new X() : x3);
    }
}
