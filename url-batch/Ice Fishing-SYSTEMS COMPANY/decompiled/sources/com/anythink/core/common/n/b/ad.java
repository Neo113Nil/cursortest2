package com.anythink.core.common.n.b;

import com.anythink.core.common.n.b.u;
import java.net.URL;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class ad {

    /* renamed from: a, reason: collision with root package name */
    final v f15638a;

    /* renamed from: b, reason: collision with root package name */
    final String f15639b;

    /* renamed from: c, reason: collision with root package name */
    final u f15640c;

    /* renamed from: d, reason: collision with root package name */
    final ae f15641d;

    /* renamed from: e, reason: collision with root package name */
    final Map<Class<?>, Object> f15642e;

    /* renamed from: f, reason: collision with root package name */
    private volatile d f15643f;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        v f15644a;

        /* renamed from: b, reason: collision with root package name */
        String f15645b;

        /* renamed from: c, reason: collision with root package name */
        u.a f15646c;

        /* renamed from: d, reason: collision with root package name */
        ae f15647d;

        /* renamed from: e, reason: collision with root package name */
        Map<Class<?>, Object> f15648e;

        public a() {
            this.f15648e = Collections.EMPTY_MAP;
            this.f15645b = "GET";
            this.f15646c = new u.a();
        }

        private a b(String str, String str2) {
            this.f15646c.a(str, str2);
            return this;
        }

        private a c() {
            return a("HEAD", (ae) null);
        }

        private a d() {
            return a("DELETE", com.anythink.core.common.n.b.a.c.f15198e);
        }

        public final a a(v vVar) {
            if (vVar == null) {
                throw new NullPointerException("url == null");
            }
            this.f15644a = vVar;
            return this;
        }

        private a c(ae aeVar) {
            return a("PUT", aeVar);
        }

        public final a b(String str) {
            this.f15646c.b(str);
            return this;
        }

        private a b(ae aeVar) {
            return a("DELETE", aeVar);
        }

        private a d(ae aeVar) {
            return a("PATCH", aeVar);
        }

        public final a a(String str) {
            String str2;
            if (str != null) {
                if (str.regionMatches(true, 0, "ws:", 0, 3)) {
                    str2 = "http:" + str.substring(3);
                } else if (str.regionMatches(true, 0, "wss:", 0, 4)) {
                    str2 = "https:" + str.substring(4);
                } else {
                    str2 = str;
                }
                return a(v.d(str2));
            }
            throw new NullPointerException("url == null");
        }

        public final ad b() {
            if (this.f15644a != null) {
                return new ad(this);
            }
            throw new IllegalStateException("url == null");
        }

        public a(ad adVar) {
            Map<Class<?>, Object> map = Collections.EMPTY_MAP;
            this.f15648e = map;
            this.f15644a = adVar.f15638a;
            this.f15645b = adVar.f15639b;
            this.f15647d = adVar.f15641d;
            this.f15648e = adVar.f15642e.isEmpty() ? map : new LinkedHashMap<>(adVar.f15642e);
            this.f15646c = adVar.f15640c.b();
        }

        private a a(URL url) {
            if (url != null) {
                return a(v.d(url.toString()));
            }
            throw new NullPointerException("url == null");
        }

        public final a a(String str, String str2) {
            this.f15646c.d(str, str2);
            return this;
        }

        public final a a(u uVar) {
            this.f15646c = uVar.b();
            return this;
        }

        private a a(d dVar) {
            String dVar2 = dVar.toString();
            return dVar2.isEmpty() ? b("Cache-Control") : a("Cache-Control", dVar2);
        }

        public final a a() {
            return a("GET", (ae) null);
        }

        private a a(ae aeVar) {
            return a("POST", aeVar);
        }

        public final a a(String str, ae aeVar) {
            if (str != null) {
                if (str.length() == 0) {
                    throw new IllegalArgumentException("method.length() == 0");
                }
                if (aeVar != null && !com.anythink.core.common.n.b.a.c.f.c(str)) {
                    throw new IllegalArgumentException(D.y.k("method ", str, " must not have a request body."));
                }
                if (aeVar == null && com.anythink.core.common.n.b.a.c.f.b(str)) {
                    throw new IllegalArgumentException(D.y.k("method ", str, " must have a request body."));
                }
                this.f15645b = str;
                this.f15647d = aeVar;
                return this;
            }
            throw new NullPointerException("method == null");
        }

        private <T> a a(Class<? super T> cls, T t9) {
            if (t9 == null) {
                this.f15648e.remove(cls);
                return this;
            }
            if (this.f15648e.isEmpty()) {
                this.f15648e = new LinkedHashMap();
            }
            this.f15648e.put(cls, cls.cast(t9));
            return this;
        }

        private a a(Object obj) {
            if (obj == null) {
                this.f15648e.remove(Object.class);
                return this;
            }
            if (this.f15648e.isEmpty()) {
                this.f15648e = new LinkedHashMap();
            }
            this.f15648e.put(Object.class, Object.class.cast(obj));
            return this;
        }
    }

    public ad(a aVar) {
        this.f15638a = aVar.f15644a;
        this.f15639b = aVar.f15645b;
        this.f15640c = aVar.f15646c.a();
        this.f15641d = aVar.f15647d;
        this.f15642e = com.anythink.core.common.n.b.a.c.a(aVar.f15648e);
    }

    private Object h() {
        return Object.class.cast(this.f15642e.get(Object.class));
    }

    public final v a() {
        return this.f15638a;
    }

    public final String b() {
        return this.f15639b;
    }

    public final u c() {
        return this.f15640c;
    }

    public final ae d() {
        return this.f15641d;
    }

    public final a e() {
        return new a(this);
    }

    public final d f() {
        d dVar = this.f15643f;
        if (dVar != null) {
            return dVar;
        }
        d a9 = d.a(this.f15640c);
        this.f15643f = a9;
        return a9;
    }

    public final boolean g() {
        return this.f15638a.c();
    }

    public final String toString() {
        return "Request{method=" + this.f15639b + ", url=" + this.f15638a + ", tags=" + this.f15642e + '}';
    }

    public final String a(String str) {
        return this.f15640c.a(str);
    }

    public final List<String> b(String str) {
        return this.f15640c.b(str);
    }

    private <T> T a(Class<? extends T> cls) {
        return cls.cast(this.f15642e.get(cls));
    }
}
