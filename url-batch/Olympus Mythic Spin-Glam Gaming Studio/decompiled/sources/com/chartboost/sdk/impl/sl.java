package com.chartboost.sdk.impl;

import kotlin.text.StringsKt;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class sl {

    public interface a {
        void a(JSONObject jSONObject);
    }

    public final void a(String str, a aVar) {
        if (a(str)) {
            xb.b("CORS policy: No 'Access-Control-Allow-Origin' header is present on the requested resource", (Throwable) null, 2, (Object) null);
            if (aVar != null) {
                aVar.a(new JSONObject().put("message", "CORS policy: No 'Access-Control-Allow-Origin' header is present on the requested resource"));
            }
        }
    }

    public final boolean a(String str) {
        return (str == null || !StringsKt.contains$default((CharSequence) str, (CharSequence) "Access-Control-Allow-Origin", false, 2, (Object) null) || !StringsKt.contains$default((CharSequence) str, (CharSequence) "'null'", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) com.safedk.android.analytics.brandsafety.creatives.discoveries.d.v, false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) com.safedk.android.analytics.brandsafety.creatives.discoveries.d.u, false, 2, (Object) null)) ? false : true;
    }
}
