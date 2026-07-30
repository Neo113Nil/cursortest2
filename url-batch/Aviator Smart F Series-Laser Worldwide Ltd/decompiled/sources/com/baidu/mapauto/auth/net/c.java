package com.baidu.mapauto.auth.net;

import com.baidu.mapauto.auth.AuthCore;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public int f7747a;

    /* renamed from: b, reason: collision with root package name */
    public String f7748b;

    /* renamed from: c, reason: collision with root package name */
    public Map<String, Object> f7749c;

    /* renamed from: d, reason: collision with root package name */
    public HostnameVerifier f7750d;

    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public String f7752b;

        /* renamed from: d, reason: collision with root package name */
        public HostnameVerifier f7754d;

        /* renamed from: a, reason: collision with root package name */
        public int f7751a = 5000;

        /* renamed from: c, reason: collision with root package name */
        public final HashMap f7753c = new HashMap();

        public final a a(AuthCore.a aVar) {
            this.f7754d = aVar;
            return this;
        }

        public final a b() {
            this.f7752b = "https://api.map.baidu.com";
            return this;
        }

        public final a c() {
            this.f7751a = 10000;
            return this;
        }

        public final a d() {
            return this;
        }

        public final a a(HashMap hashMap) {
            this.f7753c.clear();
            this.f7753c.putAll(hashMap);
            return this;
        }

        public final c a() {
            return new c(this.f7752b, this.f7751a, this.f7753c, this.f7754d);
        }
    }

    public c(String str, int i8, HashMap hashMap, HostnameVerifier hostnameVerifier) {
        this.f7748b = str;
        this.f7747a = i8;
        this.f7749c = hashMap;
        this.f7750d = hostnameVerifier;
    }
}
