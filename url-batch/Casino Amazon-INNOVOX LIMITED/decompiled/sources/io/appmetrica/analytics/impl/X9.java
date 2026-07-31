package io.appmetrica.analytics.impl;

import com.facebook.react.uimanager.ViewProps;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class X9 {
    public static boolean a(JSONObject jSONObject, String str, boolean z) {
        return ((Boolean) WrapUtils.getOrDefault(jSONObject.has(str) ? Boolean.valueOf(jSONObject.getJSONObject(str).getBoolean(ViewProps.ENABLED)) : null, Boolean.valueOf(z))).booleanValue();
    }
}
