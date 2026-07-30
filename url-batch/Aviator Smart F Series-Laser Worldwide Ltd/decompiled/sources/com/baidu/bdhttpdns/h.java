package com.baidu.bdhttpdns;

import android.util.LruCache;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
class h {

    /* renamed from: a, reason: collision with root package name */
    private final String f4232a;

    /* renamed from: b, reason: collision with root package name */
    private final LruCache<String, a> f4233b = new LruCache<>(((int) Runtime.getRuntime().maxMemory()) / 16);

    /* renamed from: c, reason: collision with root package name */
    private boolean f4234c;

    static class a {

        /* renamed from: a, reason: collision with root package name */
        private ArrayList<String> f4235a;

        /* renamed from: b, reason: collision with root package name */
        private ArrayList<String> f4236b;

        /* renamed from: c, reason: collision with root package name */
        private long f4237c;

        /* renamed from: d, reason: collision with root package name */
        private long f4238d;

        a() {
        }

        public void a(long j8) {
            this.f4237c = j8;
        }

        public ArrayList<String> b() {
            return this.f4235a;
        }

        public ArrayList<String> c() {
            return this.f4236b;
        }

        public long d() {
            return this.f4237c;
        }

        public long e() {
            return this.f4238d;
        }

        public void a(ArrayList<String> arrayList) {
            this.f4235a = arrayList;
        }

        public void b(long j8) {
            this.f4238d = j8;
        }

        public boolean a() {
            return e() + this.f4237c < System.currentTimeMillis() / 1000;
        }

        public void b(ArrayList<String> arrayList) {
            this.f4236b = arrayList;
        }
    }

    h(String str, boolean z7) {
        this.f4234c = false;
        this.f4232a = str;
        this.f4234c = z7;
    }

    a a(String str) {
        a aVar = this.f4233b.get(str);
        if (aVar == null || !aVar.a() || !this.f4234c) {
            return aVar;
        }
        this.f4233b.remove(str);
        l.a("Remove expired entry from %s cache while reading, host(%s)", this.f4232a, str);
        return null;
    }

    ArrayList<String> b() {
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<String> it = this.f4233b.snapshot().keySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    void a() {
        this.f4233b.evictAll();
        l.a("Clear %s cache", this.f4232a);
    }

    void b(String str) {
        a a8 = a(str);
        if (a8 == null || !a8.a()) {
            return;
        }
        this.f4233b.remove(str);
        l.a("Remove expired entry from %s cache, host(%s)", this.f4232a, str);
    }

    void a(String str, a aVar) {
        ArrayList<String> b8 = aVar.b();
        ArrayList<String> c8 = aVar.c();
        if ((b8 == null || b8.isEmpty()) && (c8 == null || c8.isEmpty())) {
            return;
        }
        this.f4233b.put(str, aVar);
        Object[] objArr = new Object[5];
        objArr[0] = this.f4232a;
        objArr[1] = str;
        objArr[2] = b8 != null ? b8.toString() : null;
        objArr[3] = c8 != null ? c8.toString() : null;
        objArr[4] = Long.valueOf(aVar.d());
        l.a("Set entry to %s cache, host(%s), ipv4List(%s), ipv6List(%s), ttl(%d)", objArr);
    }

    void a(boolean z7) {
        this.f4234c = z7;
    }
}
