package com.anythink.core.common.a;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    final String f12330a = "h";

    /* renamed from: b, reason: collision with root package name */
    Map<String, Integer> f12331b = new ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    Map<String, Integer> f12332c = new ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    int f12333d = 0;

    /* renamed from: e, reason: collision with root package name */
    int f12334e = 0;

    public final synchronized void a(g gVar) {
        if (gVar != null) {
            try {
                gVar.toString();
                String b9 = gVar.b();
                int d2 = gVar.d();
                if (d2 == 4) {
                    a(b9);
                } else if (d2 == 6) {
                    b(b9);
                }
            } finally {
            }
        }
    }

    public final synchronized void b(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f12334e++;
            this.f12332c.put(str, Integer.valueOf(a(this.f12332c, str) + 1));
        }
    }

    public final synchronized void a(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f12333d++;
            this.f12331b.put(str, Integer.valueOf(a(this.f12331b, str) + 1));
        }
    }

    public final synchronized void a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                JSONArray jSONArray = new JSONArray();
                Iterator<Map.Entry<String, Integer>> it = this.f12331b.entrySet().iterator();
                while (it.hasNext()) {
                    String key = it.next().getKey();
                    int a9 = a(this.f12331b, key);
                    int a10 = a(this.f12332c, key);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("dsp_id", key);
                    jSONObject2.put("show_c", a9);
                    jSONObject2.put("click_c", a10);
                    jSONArray.put(jSONObject2);
                }
                if (jSONArray.length() > 0) {
                    jSONObject.put("ad_fc", jSONArray);
                }
            } catch (Throwable unused) {
            }
        }
    }

    private static int a(Map<String, Integer> map, String str) {
        Integer num;
        if (map == null || (num = map.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }
}
