package com.facebook.ads.internal.a;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.tapjoy.TapjoyConstants;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f4879a = "b";

    public static a a(Context context, com.facebook.ads.internal.m.c cVar, String str, Uri uri, Map<String, String> map) {
        if (uri == null) {
            return null;
        }
        String authority = uri.getAuthority();
        String queryParameter = uri.getQueryParameter("video_url");
        if (!TextUtils.isEmpty(uri.getQueryParameter("data"))) {
            try {
                JSONObject jSONObject = new JSONObject(uri.getQueryParameter("data"));
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    map.put(next, jSONObject.getString(next));
                }
            } catch (JSONException e) {
                Log.w(f4879a, "Unable to parse json data in AdActionFactory.", e);
            }
        }
        char c2 = 65535;
        int hashCode = authority.hashCode();
        if (hashCode != -1458789996) {
            if (hashCode != 109770977) {
                if (hashCode == 1546100943 && authority.equals("open_link")) {
                    c2 = 1;
                }
            } else if (authority.equals(TapjoyConstants.TJC_STORE)) {
                c2 = 0;
            }
        } else if (authority.equals("passthrough")) {
            c2 = 2;
        }
        switch (c2) {
            case 0:
                if (queryParameter != null) {
                    return null;
                }
                return new e(context, cVar, str, uri, map);
            case 1:
                return new g(context, cVar, str, uri, map);
            case 2:
                return new h(context, cVar, str, uri, map);
            default:
                return new i(context, cVar, str, uri);
        }
    }

    public static boolean a(String str) {
        return TapjoyConstants.TJC_STORE.equalsIgnoreCase(str) || "open_link".equalsIgnoreCase(str);
    }
}
