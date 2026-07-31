package io.flutter.plugins.googlemobileads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
abstract class e {

    /* renamed from: a, reason: collision with root package name */
    protected final int f17467a;

    static class a {

        /* renamed from: a, reason: collision with root package name */
        final int f17468a;

        /* renamed from: b, reason: collision with root package name */
        final String f17469b;

        /* renamed from: c, reason: collision with root package name */
        final String f17470c;

        a(int i7, String str, String str2) {
            this.f17468a = i7;
            this.f17469b = str;
            this.f17470c = str2;
        }

        a(r2.a aVar) {
            this.f17468a = aVar.a();
            this.f17469b = aVar.b();
            this.f17470c = aVar.c();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f17468a == aVar.f17468a && this.f17469b.equals(aVar.f17469b)) {
                return this.f17470c.equals(aVar.f17470c);
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.f17468a), this.f17469b, this.f17470c);
        }
    }

    static class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f17471a;

        /* renamed from: b, reason: collision with root package name */
        private final long f17472b;

        /* renamed from: c, reason: collision with root package name */
        private final String f17473c;

        /* renamed from: d, reason: collision with root package name */
        private final String f17474d;

        /* renamed from: e, reason: collision with root package name */
        private final Map<String, String> f17475e;

        /* renamed from: f, reason: collision with root package name */
        private a f17476f;

        b(String str, long j7, String str2, String str3, Map<String, String> map, a aVar) {
            this.f17471a = str;
            this.f17472b = j7;
            this.f17473c = str2;
            this.f17474d = str3;
            this.f17475e = map;
            this.f17476f = aVar;
        }

        b(r2.k kVar) {
            this.f17471a = kVar.b();
            this.f17472b = kVar.d();
            this.f17473c = kVar.toString();
            if (kVar.c() != null) {
                this.f17474d = kVar.c().toString();
                this.f17475e = new HashMap();
                for (String str : kVar.c().keySet()) {
                    this.f17475e.put(str, kVar.c().get(str).toString());
                }
            } else {
                this.f17474d = "unknown credentials";
                this.f17475e = new HashMap();
            }
            if (kVar.a() != null) {
                this.f17476f = new a(kVar.a());
            }
        }

        public Map<String, String> a() {
            return this.f17475e;
        }

        public String b() {
            return this.f17471a;
        }

        public String c() {
            return this.f17474d;
        }

        public String d() {
            return this.f17473c;
        }

        public a e() {
            return this.f17476f;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Objects.equals(this.f17471a, bVar.f17471a) && this.f17472b == bVar.f17472b && Objects.equals(this.f17473c, bVar.f17473c) && Objects.equals(this.f17474d, bVar.f17474d) && Objects.equals(this.f17476f, bVar.f17476f) && Objects.equals(this.f17475e, bVar.f17475e);
        }

        public long f() {
            return this.f17472b;
        }

        public int hashCode() {
            return Objects.hash(this.f17471a, Long.valueOf(this.f17472b), this.f17473c, this.f17474d, this.f17476f);
        }
    }

    static class c {

        /* renamed from: a, reason: collision with root package name */
        final int f17477a;

        /* renamed from: b, reason: collision with root package name */
        final String f17478b;

        /* renamed from: c, reason: collision with root package name */
        final String f17479c;

        /* renamed from: d, reason: collision with root package name */
        C0076e f17480d;

        c(int i7, String str, String str2, C0076e c0076e) {
            this.f17477a = i7;
            this.f17478b = str;
            this.f17479c = str2;
            this.f17480d = c0076e;
        }

        c(r2.n nVar) {
            this.f17477a = nVar.a();
            this.f17478b = nVar.b();
            this.f17479c = nVar.c();
            if (nVar.f() != null) {
                this.f17480d = new C0076e(nVar.f());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (this.f17477a == cVar.f17477a && this.f17478b.equals(cVar.f17478b) && Objects.equals(this.f17480d, cVar.f17480d)) {
                return this.f17479c.equals(cVar.f17479c);
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.f17477a), this.f17478b, this.f17479c, this.f17480d);
        }
    }

    static abstract class d extends e {
        d(int i7) {
            super(i7);
        }

        abstract void d(boolean z6);

        abstract void e();
    }

    /* renamed from: io.flutter.plugins.googlemobileads.e$e, reason: collision with other inner class name */
    static class C0076e {

        /* renamed from: a, reason: collision with root package name */
        private final String f17481a;

        /* renamed from: b, reason: collision with root package name */
        private final String f17482b;

        /* renamed from: c, reason: collision with root package name */
        private final List<b> f17483c;

        C0076e(String str, String str2, List<b> list) {
            this.f17481a = str;
            this.f17482b = str2;
            this.f17483c = list;
        }

        C0076e(r2.v vVar) {
            this.f17481a = vVar.c();
            this.f17482b = vVar.b();
            ArrayList arrayList = new ArrayList();
            Iterator<r2.k> it = vVar.a().iterator();
            while (it.hasNext()) {
                arrayList.add(new b(it.next()));
            }
            this.f17483c = arrayList;
        }

        List<b> a() {
            return this.f17483c;
        }

        String b() {
            return this.f17482b;
        }

        String c() {
            return this.f17481a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0076e)) {
                return false;
            }
            C0076e c0076e = (C0076e) obj;
            return Objects.equals(this.f17481a, c0076e.f17481a) && Objects.equals(this.f17482b, c0076e.f17482b) && Objects.equals(this.f17483c, c0076e.f17483c);
        }

        public int hashCode() {
            return Objects.hash(this.f17481a, this.f17482b);
        }
    }

    e(int i7) {
        this.f17467a = i7;
    }

    abstract void b();

    io.flutter.plugin.platform.d c() {
        return null;
    }
}
