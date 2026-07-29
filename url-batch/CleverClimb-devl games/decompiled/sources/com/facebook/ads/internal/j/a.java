package com.facebook.ads.internal.j;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static String f5160a;

    /* renamed from: b, reason: collision with root package name */
    private String f5161b;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, Object> f5162c;

    /* renamed from: d, reason: collision with root package name */
    private int f5163d;
    private String e;

    /* renamed from: com.facebook.ads.internal.j.a$a, reason: collision with other inner class name */
    public enum EnumC0346a {
        OPEN_STORE(0),
        OPEN_LINK(1),
        XOUT(2),
        OPEN_URL(3),
        SHOW_INTERSTITIAL(4);

        int f;

        EnumC0346a(int i) {
            this.f = i;
        }
    }

    public enum b {
        LOADING_AD(0);


        /* renamed from: b, reason: collision with root package name */
        int f5170b;

        b(int i) {
            this.f5170b = i;
        }
    }

    public a(String str, Map<String, Object> map, int i, String str2) {
        this.f5161b = str;
        this.f5162c = map;
        this.f5163d = i;
        this.e = str2;
    }

    public static a a(long j, EnumC0346a enumC0346a, String str) {
        long currentTimeMillis = System.currentTimeMillis();
        HashMap hashMap = new HashMap();
        hashMap.put("Time", String.valueOf(currentTimeMillis - j));
        hashMap.put("AdAction", String.valueOf(enumC0346a.f));
        return new a("bounceback", hashMap, (int) (currentTimeMillis / 1000), str);
    }

    public static a a(b bVar, String str, long j, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("LatencyType", String.valueOf(bVar.f5170b));
        hashMap.put("AdPlacementType", str);
        hashMap.put("Time", String.valueOf(j));
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        if (str2 == null) {
            str2 = f5160a;
        }
        return new a(com.umeng.commonsdk.proguard.d.ay, hashMap, currentTimeMillis, str2);
    }

    public static a a(Throwable th, String str) {
        HashMap hashMap = new HashMap();
        if (th != null) {
            hashMap.put("ex", th.getClass().getSimpleName());
            hashMap.put("ex_msg", th.getMessage());
        }
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        if (str == null) {
            str = f5160a;
        }
        return new a("error", hashMap, currentTimeMillis, str);
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", this.f5161b);
            jSONObject.put("data", new JSONObject(this.f5162c));
            jSONObject.put("time", this.f5163d);
            jSONObject.put("request_id", this.e);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }
}
