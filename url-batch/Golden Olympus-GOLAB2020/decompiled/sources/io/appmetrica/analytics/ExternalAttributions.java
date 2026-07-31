package io.appmetrica.analytics;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.C2988te;
import io.appmetrica.analytics.impl.C3092xe;
import io.appmetrica.analytics.impl.C3141zb;
import io.appmetrica.analytics.impl.EnumC2594ea;
import io.appmetrica.analytics.impl.Vc;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ExternalAttributions {
    @NonNull
    public static ExternalAttribution adjust(Object obj) {
        return obj == null ? new C2988te(EnumC2594ea.ADJUST) : new C3092xe(EnumC2594ea.ADJUST, obj);
    }

    @NonNull
    public static ExternalAttribution airbridge(Map<String, String> map) {
        return map == null ? new C2988te(EnumC2594ea.AIRBRIDGE) : new Vc(EnumC2594ea.AIRBRIDGE, map);
    }

    @NonNull
    public static ExternalAttribution appsflyer(Map<String, Object> map) {
        return map == null ? new C2988te(EnumC2594ea.APPSFLYER) : new Vc(EnumC2594ea.APPSFLYER, map);
    }

    @NonNull
    public static ExternalAttribution kochava(JSONObject jSONObject) {
        return jSONObject == null ? new C2988te(EnumC2594ea.KOCHAVA) : new C3141zb(EnumC2594ea.KOCHAVA, jSONObject);
    }

    @NonNull
    public static ExternalAttribution singular(Map<String, Object> map) {
        return map == null ? new C2988te(EnumC2594ea.SINGULAR) : new Vc(EnumC2594ea.SINGULAR, map);
    }

    @NonNull
    public static ExternalAttribution tenjin(Map<String, String> map) {
        return map == null ? new C2988te(EnumC2594ea.TENJIN) : new Vc(EnumC2594ea.TENJIN, map);
    }
}
