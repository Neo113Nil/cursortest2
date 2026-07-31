package io.appmetrica.analytics;

import io.appmetrica.analytics.impl.Bc;
import io.appmetrica.analytics.impl.C0172fb;
import io.appmetrica.analytics.impl.C0175fe;
import io.appmetrica.analytics.impl.C0278je;
import io.appmetrica.analytics.impl.K9;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ExternalAttributions {
    public static ExternalAttribution adjust(Object obj) {
        return obj == null ? new C0175fe(K9.ADJUST) : new C0278je(K9.ADJUST, obj);
    }

    public static ExternalAttribution airbridge(Map<String, String> map) {
        return map == null ? new C0175fe(K9.AIRBRIDGE) : new Bc(K9.AIRBRIDGE, map);
    }

    public static ExternalAttribution appsflyer(Map<String, Object> map) {
        return map == null ? new C0175fe(K9.APPSFLYER) : new Bc(K9.APPSFLYER, map);
    }

    public static ExternalAttribution kochava(JSONObject jSONObject) {
        return jSONObject == null ? new C0175fe(K9.KOCHAVA) : new C0172fb(K9.KOCHAVA, jSONObject);
    }

    public static ExternalAttribution singular(Map<String, Object> map) {
        return map == null ? new C0175fe(K9.SINGULAR) : new Bc(K9.SINGULAR, map);
    }

    public static ExternalAttribution tenjin(Map<String, String> map) {
        return map == null ? new C0175fe(K9.TENJIN) : new Bc(K9.TENJIN, map);
    }
}
