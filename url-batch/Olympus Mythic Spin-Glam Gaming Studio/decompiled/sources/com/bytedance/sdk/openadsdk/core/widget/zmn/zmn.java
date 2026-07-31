package com.bytedance.sdk.openadsdk.core.widget.zmn;

import android.util.Log;
import android.webkit.CookieManager;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes12.dex */
public class zmn {
    public static Map<String, String> zmn(Map<String, List<String>> map, String str) {
        HashMap hashMap = new HashMap();
        if (map != null && !map.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                String key = entry.getKey();
                List<String> value = entry.getValue();
                if (key != null && value != null && !value.isEmpty()) {
                    if (key.equalsIgnoreCase("set-cookie")) {
                        arrayList.addAll(value);
                    } else {
                        hashMap.put(key, zmn(value));
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                zmn(arrayList, str);
            }
        }
        return hashMap;
    }

    private static String zmn(List<String> list) {
        if (list == null || list.isEmpty()) {
            return "";
        }
        if (list.size() == 1) {
            return list.get(0);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(list.get(i));
        }
        return sb.toString();
    }

    private static void zmn(List<String> list, String str) {
        CookieManager cookieManager = CookieManager.getInstance();
        for (String str2 : list) {
            try {
                cookieManager.setCookie(d.u.concat(String.valueOf(str)), str2);
                cookieManager.flush();
                Log.d("Cookie", "Set cookie for " + str + ": " + str2);
            } catch (Exception e) {
                Log.e("Cookie", "Failed to set cookie", e);
            }
        }
    }
}
