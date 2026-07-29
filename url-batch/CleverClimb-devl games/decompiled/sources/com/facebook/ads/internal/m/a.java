package com.facebook.ads.internal.m;

import android.text.TextUtils;
import com.facebook.ads.internal.q.a.j;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f5181a;

    /* renamed from: b, reason: collision with root package name */
    private final double f5182b;

    /* renamed from: c, reason: collision with root package name */
    private final double f5183c;

    /* renamed from: d, reason: collision with root package name */
    private final String f5184d;
    private final Map<String, String> e;
    private final e f;
    private final f g;
    private final boolean h;

    /* renamed from: com.facebook.ads.internal.m.a$a, reason: collision with other inner class name */
    public static class C0347a {

        /* renamed from: a, reason: collision with root package name */
        private String f5185a;

        /* renamed from: b, reason: collision with root package name */
        private double f5186b;

        /* renamed from: c, reason: collision with root package name */
        private String f5187c;

        /* renamed from: d, reason: collision with root package name */
        private Map<String, String> f5188d;
        private e e;
        private f f;
        private boolean g;

        public C0347a a(double d2) {
            this.f5186b = d2;
            return this;
        }

        public C0347a a(e eVar) {
            this.e = eVar;
            return this;
        }

        public C0347a a(f fVar) {
            this.f = fVar;
            return this;
        }

        public C0347a a(String str) {
            this.f5185a = str;
            return this;
        }

        public C0347a a(Map<String, String> map) {
            this.f5188d = map;
            return this;
        }

        public C0347a a(boolean z) {
            this.g = z;
            return this;
        }

        public a a() {
            return new a(this.f5185a, this.f5186b, this.f5187c, this.f5188d, this.e, this.f, this.g);
        }

        public C0347a b(String str) {
            this.f5187c = str;
            return this;
        }
    }

    public a(String str, double d2, String str2, Map<String, String> map, e eVar, f fVar, boolean z) {
        this.f5181a = str;
        double currentTimeMillis = System.currentTimeMillis();
        Double.isNaN(currentTimeMillis);
        this.f5182b = currentTimeMillis / 1000.0d;
        this.f5183c = d2;
        this.f5184d = str2;
        this.f = eVar;
        this.g = fVar;
        this.h = z;
        HashMap hashMap = new HashMap();
        if (map != null && !map.isEmpty()) {
            hashMap.putAll(map);
        }
        if (f()) {
            hashMap.put("analog", j.a(com.facebook.ads.internal.g.a.a()));
        }
        this.e = a(hashMap);
    }

    private static Map<String, String> a(Map<String, String> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (value != null) {
                hashMap.put(key, value);
            }
        }
        return hashMap;
    }

    public String a() {
        return this.f5181a;
    }

    public double b() {
        return this.f5182b;
    }

    public double c() {
        return this.f5183c;
    }

    public String d() {
        return this.f5184d;
    }

    public Map<String, String> e() {
        return this.e;
    }

    final boolean f() {
        return this.f == e.IMMEDIATE;
    }

    final boolean g() {
        return !TextUtils.isEmpty(this.f5181a);
    }

    public e h() {
        return this.f;
    }

    public f i() {
        return this.g;
    }
}
