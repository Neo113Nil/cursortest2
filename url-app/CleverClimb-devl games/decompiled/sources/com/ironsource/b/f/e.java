package com.ironsource.b.f;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: GeneralProperties.java */
/* loaded from: classes2.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private static e f6843a;

    /* renamed from: b, reason: collision with root package name */
    private JSONObject f6844b = new JSONObject();

    private e() {
    }

    public static synchronized e a() {
        e eVar;
        synchronized (e.class) {
            if (f6843a == null) {
                f6843a = new e();
            }
            eVar = f6843a;
        }
        return eVar;
    }

    public synchronized void a(Map<String, Object> map) {
        if (map != null) {
            for (String str : map.keySet()) {
                a(str, map.get(str));
            }
        }
    }

    public synchronized void a(String str, Object obj) {
        try {
            this.f6844b.put(str, obj);
        } catch (Exception unused) {
        }
    }

    public synchronized JSONObject b() {
        return this.f6844b;
    }
}
