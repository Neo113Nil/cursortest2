package com.ironsource;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class de {

    /* renamed from: b, reason: collision with root package name */
    public static final String f15896b = "userId";

    /* renamed from: c, reason: collision with root package name */
    public static final String f15897c = "appKey";

    /* renamed from: d, reason: collision with root package name */
    private static de f15898d;

    /* renamed from: a, reason: collision with root package name */
    private JSONObject f15899a = new JSONObject();

    private de() {
    }

    public static synchronized de a() {
        de deVar;
        synchronized (de.class) {
            try {
                if (f15898d == null) {
                    f15898d = new de();
                }
                deVar = f15898d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return deVar;
    }

    public synchronized JSONObject b() {
        return this.f15899a;
    }

    public synchronized String a(String str) {
        return this.f15899a.optString(str);
    }

    public synchronized void a(String str, Object obj) {
        try {
            this.f15899a.put(str, obj);
        } catch (Exception e4) {
            o9.d().a(e4);
        }
    }

    public synchronized void a(Map<String, Object> map) {
        if (map != null) {
            for (String str : map.keySet()) {
                a(str, map.get(str));
            }
        }
    }
}
