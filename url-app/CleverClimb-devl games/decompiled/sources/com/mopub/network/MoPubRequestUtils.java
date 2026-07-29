package com.mopub.network;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.mopub.common.Preconditions;
import com.mopub.common.logging.MoPubLog;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class MoPubRequestUtils {
    public static String truncateQueryParamsIfPost(String str) {
        int indexOf;
        Preconditions.checkNotNull(str);
        return (isMoPubRequest(str) && (indexOf = str.indexOf(63)) != -1) ? str.substring(0, indexOf) : str;
    }

    public static boolean isMoPubRequest(String str) {
        Preconditions.checkNotNull(str);
        return str.startsWith("http://ads.mopub.com") || str.startsWith("https://ads.mopub.com");
    }

    public static int chooseMethod(String str) {
        return isMoPubRequest(str) ? 1 : 0;
    }

    public static Map<String, String> convertQueryToMap(Context context, String str) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(str);
        HashMap hashMap = new HashMap();
        Uri parse = Uri.parse(Networking.getUrlRewriter(context).rewriteUrl(str));
        for (String str2 : parse.getQueryParameterNames()) {
            hashMap.put(str2, TextUtils.join(",", parse.getQueryParameters(str2)));
        }
        return hashMap;
    }

    public static String generateBodyFromParams(Map<String, String> map, String str) {
        Preconditions.checkNotNull(str);
        if (!isMoPubRequest(str) || map == null || map.isEmpty()) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (String str2 : map.keySet()) {
            try {
                jSONObject.put(str2, map.get(str2));
            } catch (JSONException unused) {
                MoPubLog.d("Unable to add " + str2 + " to JSON body.");
            }
        }
        return jSONObject.toString();
    }

    private MoPubRequestUtils() {
    }
}
