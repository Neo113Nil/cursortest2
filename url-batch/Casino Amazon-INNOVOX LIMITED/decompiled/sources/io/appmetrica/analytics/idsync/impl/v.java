package io.appmetrica.analytics.idsync.impl;

import android.util.Base64;
import com.google.android.gms.common.internal.ImagesContract;
import com.onesignal.inAppMessages.internal.display.impl.WebViewManager;
import java.util.Collection;
import java.util.Map;
import kotlin.text.Charsets;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class v {
    public static String a(D d) {
        String encodeToString;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(WebViewManager.EVENT_TYPE_KEY, d.f724a);
        jSONObject.put(ImagesContract.URL, d.c);
        jSONObject.put("responseCode", d.e);
        byte[] bArr = d.f;
        try {
            encodeToString = new String(bArr, Charsets.UTF_8);
        } catch (Throwable unused) {
            encodeToString = Base64.encodeToString(bArr, 0);
        }
        jSONObject.put("responseBody", encodeToString);
        Map map = d.g;
        JSONObject jSONObject2 = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            jSONObject2.putOpt((String) entry.getKey(), new JSONArray((Collection) entry.getValue()));
        }
        jSONObject.put("responseHeaders", jSONObject2);
        return jSONObject.toString();
    }
}
