package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.coreutils.internal.parsing.RemoteConfigJsonUtils;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
import t3.C1442b;
import t3.C1443c;

/* loaded from: classes.dex */
public final class L implements JsonParser {

    /* renamed from: a, reason: collision with root package name */
    public final Y f13421a;

    /* renamed from: b, reason: collision with root package name */
    public final X f13422b;

    /* JADX WARN: Multi-variable type inference failed */
    public L() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final J parse(JSONObject jSONObject) {
        N n;
        P p2;
        Q q4;
        boolean extractFeature = RemoteConfigJsonUtils.extractFeature(jSONObject, "screenshot", AbstractC1157o.f13495a);
        Y y4 = this.f13421a;
        X x4 = this.f13422b;
        x4.getClass();
        JSONObject optJSONObject = jSONObject.optJSONObject("screenshot");
        if (optJSONObject == null) {
            q4 = new Q();
            q4.f13434a = new N();
            q4.f13435b = new P();
            O o = new O();
            o.f13429c = AbstractC1157o.f13496b;
            q4.f13436c = o;
        } else {
            Q q5 = new Q();
            x4.f13444a.getClass();
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("api_captor_config");
            O o4 = null;
            if (optJSONObject2 == null) {
                n = null;
            } else {
                n = new N();
                Boolean optBooleanOrNull = JsonUtils.optBooleanOrNull(optJSONObject2, "enabled");
                if (optBooleanOrNull != null) {
                    n.f13425a = optBooleanOrNull.booleanValue();
                }
            }
            if (n != null) {
                q5.f13434a = n;
            }
            x4.f13445b.getClass();
            JSONObject optJSONObject3 = optJSONObject.optJSONObject("service_captor_config");
            if (optJSONObject3 == null) {
                p2 = null;
            } else {
                p2 = new P();
                Boolean optBooleanOrNull2 = JsonUtils.optBooleanOrNull(optJSONObject3, "enabled");
                if (optBooleanOrNull2 != null) {
                    p2.f13431a = optBooleanOrNull2.booleanValue();
                }
                Long optLongOrNull = JsonUtils.optLongOrNull(optJSONObject3, "delay_seconds");
                if (optLongOrNull != null) {
                    p2.f13432b = optLongOrNull.longValue();
                }
            }
            if (p2 != null) {
                q5.f13435b = p2;
            }
            x4.f13446c.getClass();
            JSONObject optJSONObject4 = optJSONObject.optJSONObject("content_observer_captor_config");
            if (optJSONObject4 != null) {
                o4 = new O();
                Boolean optBooleanOrNull3 = JsonUtils.optBooleanOrNull(optJSONObject4, "enabled");
                if (optBooleanOrNull3 != null) {
                    o4.f13427a = optBooleanOrNull3.booleanValue();
                }
                JSONArray optJSONArray = optJSONObject4.optJSONArray("media_store_column_names");
                if (optJSONArray != null) {
                    C1443c H4 = O3.d.H(0, optJSONArray.length());
                    ArrayList arrayList = new ArrayList(d3.k.Y(H4));
                    Iterator it = H4.iterator();
                    while (((C1442b) it).f15429c) {
                        arrayList.add(optJSONArray.getString(((C1442b) it).nextInt()));
                    }
                    Object[] array = arrayList.toArray(new String[0]);
                    if (array == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    }
                    o4.f13429c = (String[]) array;
                }
                Long optLongOrNull2 = JsonUtils.optLongOrNull(optJSONObject4, "detect_window_seconds");
                if (optLongOrNull2 != null) {
                    o4.f13428b = optLongOrNull2.longValue();
                }
            }
            if (o4 != null) {
                q5.f13436c = o4;
            }
            q4 = q5;
        }
        return new J(extractFeature, y4.toModel(q4));
    }

    public final J b(JSONObject jSONObject) {
        return (J) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final Object parseOrNull(JSONObject jSONObject) {
        return (J) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }

    public L(Y y4, X x4) {
        this.f13421a = y4;
        this.f13422b = x4;
    }

    public /* synthetic */ L(Y y4, X x4, int i4, kotlin.jvm.internal.e eVar) {
        this((i4 & 1) != 0 ? new Y(null, null, null, 7, null) : y4, (i4 & 2) != 0 ? new X() : x4);
    }
}
