package com.facebook.internal;

import com.facebook.FacebookRequestError;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: FacebookRequestErrorClassification.java */
/* loaded from: classes.dex */
public final class j {
    private static j g;

    /* renamed from: a, reason: collision with root package name */
    private final Map<Integer, Set<Integer>> f6120a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<Integer, Set<Integer>> f6121b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<Integer, Set<Integer>> f6122c;

    /* renamed from: d, reason: collision with root package name */
    private final String f6123d;
    private final String e;
    private final String f;

    j(Map<Integer, Set<Integer>> map, Map<Integer, Set<Integer>> map2, Map<Integer, Set<Integer>> map3, String str, String str2, String str3) {
        this.f6120a = map;
        this.f6121b = map2;
        this.f6122c = map3;
        this.f6123d = str;
        this.e = str2;
        this.f = str3;
    }

    public String a(FacebookRequestError.a aVar) {
        switch (aVar) {
            case OTHER:
                return this.f6123d;
            case LOGIN_RECOVERABLE:
                return this.f;
            case TRANSIENT:
                return this.e;
            default:
                return null;
        }
    }

    public FacebookRequestError.a a(int i, int i2, boolean z) {
        Set<Integer> set;
        Set<Integer> set2;
        Set<Integer> set3;
        if (z) {
            return FacebookRequestError.a.TRANSIENT;
        }
        if (this.f6120a != null && this.f6120a.containsKey(Integer.valueOf(i)) && ((set3 = this.f6120a.get(Integer.valueOf(i))) == null || set3.contains(Integer.valueOf(i2)))) {
            return FacebookRequestError.a.OTHER;
        }
        if (this.f6122c != null && this.f6122c.containsKey(Integer.valueOf(i)) && ((set2 = this.f6122c.get(Integer.valueOf(i))) == null || set2.contains(Integer.valueOf(i2)))) {
            return FacebookRequestError.a.LOGIN_RECOVERABLE;
        }
        if (this.f6121b != null && this.f6121b.containsKey(Integer.valueOf(i)) && ((set = this.f6121b.get(Integer.valueOf(i))) == null || set.contains(Integer.valueOf(i2)))) {
            return FacebookRequestError.a.TRANSIENT;
        }
        return FacebookRequestError.a.OTHER;
    }

    public static synchronized j a() {
        j jVar;
        synchronized (j.class) {
            if (g == null) {
                g = b();
            }
            jVar = g;
        }
        return jVar;
    }

    private static j b() {
        return new j(null, new HashMap<Integer, Set<Integer>>() { // from class: com.facebook.internal.j.1
            {
                put(2, null);
                put(4, null);
                put(9, null);
                put(17, null);
                put(341, null);
            }
        }, new HashMap<Integer, Set<Integer>>() { // from class: com.facebook.internal.j.2
            {
                put(102, null);
                put(190, null);
            }
        }, null, null, null);
    }

    private static Map<Integer, Set<Integer>> a(JSONObject jSONObject) {
        int optInt;
        HashSet hashSet;
        JSONArray optJSONArray = jSONObject.optJSONArray("items");
        if (optJSONArray.length() == 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject != null && (optInt = optJSONObject.optInt("code")) != 0) {
                JSONArray optJSONArray2 = optJSONObject.optJSONArray("subcodes");
                if (optJSONArray2 == null || optJSONArray2.length() <= 0) {
                    hashSet = null;
                } else {
                    hashSet = new HashSet();
                    for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                        int optInt2 = optJSONArray2.optInt(i2);
                        if (optInt2 != 0) {
                            hashSet.add(Integer.valueOf(optInt2));
                        }
                    }
                }
                hashMap.put(Integer.valueOf(optInt), hashSet);
            }
        }
        return hashMap;
    }

    public static j a(JSONArray jSONArray) {
        String optString;
        if (jSONArray == null) {
            return null;
        }
        Map<Integer, Set<Integer>> map = null;
        Map<Integer, Set<Integer>> map2 = null;
        Map<Integer, Set<Integer>> map3 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject != null && (optString = optJSONObject.optString("name")) != null) {
                if (optString.equalsIgnoreCase("other")) {
                    str = optJSONObject.optString("recovery_message", null);
                    map = a(optJSONObject);
                } else if (optString.equalsIgnoreCase("transient")) {
                    str2 = optJSONObject.optString("recovery_message", null);
                    map2 = a(optJSONObject);
                } else if (optString.equalsIgnoreCase("login_recoverable")) {
                    str3 = optJSONObject.optString("recovery_message", null);
                    map3 = a(optJSONObject);
                }
            }
        }
        return new j(map, map2, map3, str, str2, str3);
    }
}
