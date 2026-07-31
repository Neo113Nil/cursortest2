package O0;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: O0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0409i {
    public static Map a(Context context, String str) {
        if (context == null) {
            return null;
        }
        Map c4 = AbstractC0413m.c(context, str);
        g(c4);
        return c(c4);
    }

    public static Map b(Context context, String str, String str2) {
        Map a4;
        Map a5;
        int o4 = Y.o() * 1048576;
        if (AbstractC0408h.c(context, "cached_v2_1", o4)) {
            j0.m("hmsSdk", "cached event reach max size, delete it");
            AbstractC0413m.d(context, "cached_v2_1", new String[0]);
        }
        if (AbstractC0408h.c(context, "stat_v2_1", o4)) {
            j0.m("hmsSdk", "stat event reach max size, delete it");
            AbstractC0413m.d(context, "stat_v2_1", new String[0]);
        }
        if ("alltype".equals(str2) || TextUtils.isEmpty(str)) {
            j0.b("hmsSdk", "read all event records");
            a4 = a(context, "stat_v2_1");
            a5 = a(context, "cached_v2_1");
        } else {
            String d4 = P.d(str, str2);
            a4 = f(context, "stat_v2_1", d4);
            a5 = f(context, "cached_v2_1", d4);
        }
        return d(a4, a5);
    }

    private static Map c(Map map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (entry.getValue() instanceof String) {
                e(str, (String) entry.getValue(), hashMap);
            }
        }
        return hashMap;
    }

    private static Map d(Map map, Map map2) {
        if (map.size() == 0 && map2.size() == 0) {
            return new HashMap();
        }
        if (map.size() == 0) {
            return map2;
        }
        if (map2.size() == 0) {
            return map;
        }
        HashMap hashMap = new HashMap(map);
        hashMap.putAll(map2);
        return hashMap;
    }

    private static void e(String str, String str2, Map map) {
        ArrayList arrayList = new ArrayList();
        try {
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            JSONArray jSONArray = new JSONArray(str2);
            if (jSONArray.length() == 0) {
                return;
            }
            for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                C0406f c0406f = new C0406f();
                try {
                    c0406f.c(jSONArray.getJSONObject(i4));
                    arrayList.add(c0406f);
                } catch (JSONException unused) {
                    j0.l("hmsSdk", "JSON Exception happened when create data for report - readDataToRecord");
                }
            }
            map.put(str, arrayList);
        } catch (JSONException unused2) {
            j0.l("hmsSdk", "When events turn to JSONArray,JSON Exception has happened");
        }
    }

    public static Map f(Context context, String str, String str2) {
        String b4 = AbstractC0413m.b(context, str, str2, "");
        HashMap hashMap = new HashMap();
        e(str2, b4, hashMap);
        return hashMap;
    }

    private static void g(Map map) {
        Iterator it = map.entrySet().iterator();
        Set f4 = P.f(Y.c());
        while (it.hasNext()) {
            if (!f4.contains(((Map.Entry) it.next()).getKey())) {
                it.remove();
            }
        }
    }
}
