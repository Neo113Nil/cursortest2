package io.appmetrica.analytics;

import io.appmetrica.analytics.impl.Ac;
import io.appmetrica.analytics.impl.C0585eb;
import io.appmetrica.analytics.impl.C0588ee;
import io.appmetrica.analytics.impl.C0692ie;
import io.appmetrica.analytics.impl.J9;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ExternalAttributions {
    public static ExternalAttribution adjust(Object obj) {
        return obj == null ? new C0588ee(J9.ADJUST) : new C0692ie(J9.ADJUST, obj);
    }

    public static ExternalAttribution airbridge(Map<String, String> map) {
        return map == null ? new C0588ee(J9.AIRBRIDGE) : new Ac(J9.AIRBRIDGE, map);
    }

    public static ExternalAttribution appsflyer(Map<String, Object> map) {
        return map == null ? new C0588ee(J9.APPSFLYER) : new Ac(J9.APPSFLYER, map);
    }

    public static ExternalAttribution kochava(JSONObject jSONObject) {
        return jSONObject == null ? new C0588ee(J9.KOCHAVA) : new C0585eb(J9.KOCHAVA, jSONObject);
    }

    public static ExternalAttribution singular(Map<String, Object> map) {
        return map == null ? new C0588ee(J9.SINGULAR) : new Ac(J9.SINGULAR, map);
    }

    public static ExternalAttribution tenjin(Map<String, String> map) {
        return map == null ? new C0588ee(J9.TENJIN) : new Ac(J9.TENJIN, map);
    }
}
