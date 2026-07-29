package com.applovin.impl.sdk.a;

import com.applovin.impl.sdk.ad.g;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class e {

    /* renamed from: d, reason: collision with root package name */
    private static e f2944d;

    /* renamed from: a, reason: collision with root package name */
    private final Map<g, String> f2945a = new HashMap(1);

    /* renamed from: b, reason: collision with root package name */
    private final Map<g, Map<String, String>> f2946b = new HashMap(1);

    /* renamed from: c, reason: collision with root package name */
    private final Object f2947c = new Object();

    private e() {
    }

    public static synchronized e a() {
        e eVar;
        synchronized (e.class) {
            if (f2944d == null) {
                f2944d = new e();
            }
            eVar = f2944d;
        }
        return eVar;
    }

    public Map<String, String> a(g gVar) {
        Map<String, String> remove;
        synchronized (this.f2947c) {
            remove = this.f2946b.remove(gVar);
        }
        return remove;
    }

    public void a(g gVar, String str) {
        synchronized (this.f2947c) {
            this.f2945a.put(gVar, str);
        }
    }

    public void a(g gVar, Map<String, String> map) {
        synchronized (this.f2947c) {
            this.f2946b.put(gVar, map);
        }
    }

    public String b(g gVar) {
        String remove;
        synchronized (this.f2947c) {
            remove = this.f2945a.remove(gVar);
        }
        return remove;
    }
}
