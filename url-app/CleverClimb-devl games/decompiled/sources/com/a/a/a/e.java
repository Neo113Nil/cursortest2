package com.a.a.a;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class e<T> {

    /* renamed from: a, reason: collision with root package name */
    int f2235a;

    /* renamed from: b, reason: collision with root package name */
    private int f2236b;

    /* renamed from: c, reason: collision with root package name */
    private String f2237c;

    /* renamed from: d, reason: collision with root package name */
    private Stack<b> f2238d;
    private Class<T> e;
    private String f;
    private InputStream g;
    private String h;
    private Object i;
    private Map<String, String> j;
    private Object k;
    private String l;
    private Map<String, String> m;
    private boolean n;
    private int o;
    private AtomicBoolean p;
    private int q;
    private boolean r;
    private boolean s;

    public static class a<T> {

        /* renamed from: a, reason: collision with root package name */
        private int f2239a;

        /* renamed from: b, reason: collision with root package name */
        private String f2240b;

        /* renamed from: c, reason: collision with root package name */
        private Stack<b<T>> f2241c;

        /* renamed from: d, reason: collision with root package name */
        private Class f2242d;
        private String f;
        private HashMap<String, String> g;
        private Object h;
        private int i;
        private String j;
        private HashMap<String, String> k;
        private boolean l;
        private int m;
        private Object n;
        private int o;
        private boolean p = true;
        private boolean q = false;
        private String e = "GET";

        public a() {
        }

        public a(Class<T> cls) {
            this.f2242d = cls;
        }

        public a<T> a(int i) {
            this.f2239a = i;
            return this;
        }

        public a<T> a(b<T> bVar) {
            if (bVar != null) {
                if (this.f2241c == null) {
                    this.f2241c = new Stack<>();
                }
                this.f2241c.push(bVar);
            }
            return this;
        }

        public a<T> a(Class<? extends Object> cls) {
            this.f2242d = cls;
            return this;
        }

        public a<T> a(Object obj) {
            this.n = obj;
            return this;
        }

        public a<T> a(String str) {
            this.f2240b = str;
            return this;
        }

        public a<T> a(String str, String str2) {
            if (this.g == null) {
                this.g = new HashMap<>();
            }
            this.g.put(str, str2);
            return this;
        }

        public a<T> a(boolean z) {
            this.p = z;
            return this;
        }

        public e<T> a() {
            return new e<>(this);
        }

        public a<T> b(int i) {
            this.o = i;
            if (this.o < 0) {
                this.o = 0;
            }
            return this;
        }

        public a<T> b(String str) {
            this.e = str;
            return this;
        }

        public a<T> b(boolean z) {
            this.q = z;
            return this;
        }

        public a<T> c(int i) {
            this.m = i;
            return this;
        }

        public a<T> c(String str) {
            this.j = str;
            return this;
        }
    }

    private e(a aVar) {
        this.p = new AtomicBoolean(false);
        this.r = true;
        this.s = false;
        this.k = aVar.h;
        this.f2237c = aVar.f2240b;
        this.f2238d = aVar.f2241c;
        this.e = aVar.f2242d;
        this.f = aVar.e;
        this.f2236b = aVar.f2239a;
        this.h = aVar.f;
        this.i = aVar.n;
        this.j = aVar.g;
        this.f2235a = aVar.i;
        this.l = aVar.j;
        this.m = aVar.k;
        this.n = aVar.l;
        this.o = aVar.m;
        this.q = aVar.o;
        this.r = aVar.p;
        this.s = aVar.q;
    }

    public static <T> a<T> a(Class<T> cls) {
        return new a<>(cls);
    }

    public int a() {
        return this.o;
    }

    public e a(b<T> bVar) {
        if (bVar != null) {
            if (this.f2238d == null) {
                this.f2238d = new Stack<>();
            }
            this.f2238d.add(bVar);
        }
        return this;
    }

    public void a(int i) {
        this.f2235a = i;
    }

    public void a(String str) {
        this.h = str;
    }

    public String b() {
        return this.h;
    }

    public void b(String str) {
        this.l = str;
    }

    public Class<T> c() {
        return this.e;
    }

    public void c(String str) {
        this.f2237c = str;
    }

    public int d() {
        return this.f2236b;
    }

    public b e() {
        if (this.f2238d == null || this.f2238d.empty()) {
            return null;
        }
        return this.f2238d.pop();
    }

    public b f() {
        if (this.f2238d == null || this.f2238d.empty()) {
            return null;
        }
        return this.f2238d.peek();
    }

    public Object g() {
        return this.i;
    }

    public String h() {
        return this.f;
    }

    public Map<String, String> i() {
        return this.j;
    }

    public Stack<b> j() {
        return this.f2238d;
    }

    public String k() {
        return this.l;
    }

    public String l() {
        return this.f2237c;
    }

    public Map<String, String> m() {
        return this.m;
    }

    public InputStream n() {
        return this.g;
    }

    public void o() {
        this.p.set(true);
    }

    public int p() {
        return this.f2235a;
    }

    public int q() {
        return this.q;
    }

    public boolean r() {
        return this.p != null && this.p.get();
    }

    public boolean s() {
        return this.r;
    }

    public boolean t() {
        return this.s;
    }
}
