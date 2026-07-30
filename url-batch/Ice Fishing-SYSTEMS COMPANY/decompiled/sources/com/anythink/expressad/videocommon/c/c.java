package com.anythink.expressad.videocommon.c;

import D.y;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private String f22507a;

    /* renamed from: b, reason: collision with root package name */
    private int f22508b;

    public c(String str, int i) {
        this.f22507a = str;
        this.f22508b = i;
    }

    private static c c() {
        return new c("Virtual Item", 1);
    }

    public final String a() {
        return this.f22507a;
    }

    public final int b() {
        return this.f22508b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Reward{name='");
        sb.append(this.f22507a);
        sb.append("', amount=");
        return y.m(sb, this.f22508b, '}');
    }

    public static c b(String str) {
        c cVar = null;
        try {
            com.anythink.expressad.videocommon.e.a b9 = com.anythink.expressad.videocommon.e.c.a().b();
            if (TextUtils.isEmpty(str)) {
                cVar = c();
            } else if (b9 != null && b9.i() != null) {
                cVar = b9.i().get(str);
            }
            return cVar == null ? c() : cVar;
        } catch (Exception e6) {
            e6.printStackTrace();
            return cVar;
        }
    }

    public final void a(String str) {
        this.f22507a = str;
    }

    public final void a(int i) {
        this.f22508b = i;
    }

    public static Map<String, c> a(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return null;
        }
        try {
            HashMap hashMap = new HashMap();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                hashMap.put(optJSONObject.optString("id"), new c(optJSONObject.optString("name"), optJSONObject.optInt("amount")));
            }
            return hashMap;
        } catch (Exception e6) {
            e6.printStackTrace();
            return null;
        }
    }

    public static c a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            String optString = jSONObject.optString("name");
            int optInt = jSONObject.optInt("amount");
            jSONObject.optString("id");
            return new c(optString, optInt);
        } catch (Exception e6) {
            e6.printStackTrace();
            return null;
        }
    }
}
