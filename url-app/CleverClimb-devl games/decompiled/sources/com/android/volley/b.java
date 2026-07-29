package com.android.volley;

import java.util.Collections;
import java.util.Map;

/* compiled from: Cache.java */
/* loaded from: classes.dex */
public interface b {
    a a(String str);

    void a();

    void a(String str, a aVar);

    /* compiled from: Cache.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public byte[] f2259a;

        /* renamed from: b, reason: collision with root package name */
        public String f2260b;

        /* renamed from: c, reason: collision with root package name */
        public long f2261c;

        /* renamed from: d, reason: collision with root package name */
        public long f2262d;
        public long e;
        public long f;
        public Map<String, String> g = Collections.emptyMap();

        public boolean a() {
            return this.e < System.currentTimeMillis();
        }

        public boolean b() {
            return this.f < System.currentTimeMillis();
        }
    }
}
