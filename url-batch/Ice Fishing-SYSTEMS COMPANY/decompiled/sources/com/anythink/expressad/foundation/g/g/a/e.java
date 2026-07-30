package com.anythink.expressad.foundation.g.g.a;

import android.text.TextUtils;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class e implements Serializable, Cloneable {

    /* renamed from: A, reason: collision with root package name */
    private boolean f19686A;

    /* renamed from: B, reason: collision with root package name */
    private com.anythink.expressad.foundation.d.d f19687B;

    /* renamed from: C, reason: collision with root package name */
    private List<com.anythink.expressad.foundation.d.d> f19688C;

    /* renamed from: a, reason: collision with root package name */
    private boolean f19689a;

    /* renamed from: b, reason: collision with root package name */
    private Map<String, Map<String, String>> f19690b;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, Map<String, String>> f19691c;

    /* renamed from: d, reason: collision with root package name */
    private Map<String, Long> f19692d;

    /* renamed from: e, reason: collision with root package name */
    private com.anythink.expressad.foundation.e.c f19693e;

    /* renamed from: f, reason: collision with root package name */
    private String f19694f;

    /* renamed from: g, reason: collision with root package name */
    private List<com.anythink.expressad.foundation.d.d> f19695g;

    /* renamed from: h, reason: collision with root package name */
    private long f19696h;
    private String i;

    /* renamed from: j, reason: collision with root package name */
    private int f19697j;

    /* renamed from: k, reason: collision with root package name */
    private String f19698k;

    /* renamed from: l, reason: collision with root package name */
    private String f19699l;

    /* renamed from: m, reason: collision with root package name */
    private String f19700m;

    /* renamed from: n, reason: collision with root package name */
    private String f19701n;

    /* renamed from: o, reason: collision with root package name */
    private String f19702o;

    /* renamed from: p, reason: collision with root package name */
    private String f19703p;

    /* renamed from: q, reason: collision with root package name */
    private String f19704q;

    /* renamed from: r, reason: collision with root package name */
    private String f19705r;

    /* renamed from: s, reason: collision with root package name */
    private String f19706s;

    /* renamed from: t, reason: collision with root package name */
    private String f19707t;

    /* renamed from: u, reason: collision with root package name */
    private String f19708u;

    /* renamed from: v, reason: collision with root package name */
    private int f19709v;

    /* renamed from: w, reason: collision with root package name */
    private int f19710w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f19711x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f19712y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f19713z;

    public e() {
        this.f19689a = false;
        this.f19690b = new HashMap();
        this.f19691c = new HashMap();
        this.f19692d = new HashMap();
        this.f19694f = "";
        this.f19709v = -1;
        this.f19711x = false;
        this.f19713z = false;
    }

    private boolean A() {
        return this.f19713z;
    }

    private boolean B() {
        return this.f19686A;
    }

    private String C() {
        return this.f19702o;
    }

    private void a(boolean z8) {
        this.f19711x = z8;
    }

    private void b(String str) {
        this.f19707t = str;
    }

    private boolean c() {
        return this.f19689a;
    }

    private boolean d() {
        return this.f19711x;
    }

    private int e() {
        return this.f19709v;
    }

    private String f() {
        return this.f19708u;
    }

    private String g() {
        return this.f19707t;
    }

    private List<com.anythink.expressad.foundation.d.d> h() {
        return this.f19695g;
    }

    private String i() {
        return this.f19694f;
    }

    private com.anythink.expressad.foundation.d.d j() {
        return this.f19687B;
    }

    private List<com.anythink.expressad.foundation.d.d> k() {
        return this.f19688C;
    }

    private long l() {
        return this.f19696h;
    }

    private String m() {
        Map<String, String> map;
        if (!TextUtils.isEmpty(this.i)) {
            return this.i;
        }
        try {
            if (TextUtils.isEmpty(this.i)) {
                String str = this.f19694f + this.f19708u;
                Map<String, Map<String, String>> map2 = this.f19690b;
                if (map2 != null && map2.containsKey(str) && (map = this.f19690b.get(str)) != null && map.containsKey("unit_id")) {
                    this.i = map.get("unit_id");
                }
            }
        } catch (Exception e6) {
            if (com.anythink.expressad.a.f17776a) {
                e6.printStackTrace();
            }
        }
        return this.i;
    }

    private int n() {
        return this.f19697j;
    }

    private String o() {
        return this.f19698k;
    }

    private String p() {
        return this.f19699l;
    }

    private String q() {
        return this.f19701n;
    }

    private String r() {
        return this.f19704q;
    }

    private int s() {
        return this.f19710w;
    }

    private String t() {
        return this.f19705r;
    }

    private static void u() {
    }

    private void v() {
        Map<String, Map<String, String>> map = this.f19690b;
        if (map != null) {
            map.clear();
        }
        Map<String, Map<String, String>> map2 = this.f19691c;
        if (map2 != null) {
            map2.clear();
        }
        List<com.anythink.expressad.foundation.d.d> list = this.f19688C;
        if (list != null) {
            list.clear();
        }
        this.f19694f = "";
    }

    private com.anythink.expressad.foundation.e.c w() {
        return this.f19693e;
    }

    private Map<String, Map<String, String>> x() {
        return this.f19690b;
    }

    private Map<String, Map<String, String>> y() {
        return this.f19691c;
    }

    private boolean z() {
        return this.f19712y;
    }

    public final Object clone() {
        return super.clone();
    }

    private void b(List<com.anythink.expressad.foundation.d.d> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        this.f19688C = list;
    }

    private void c(String str) {
        this.f19694f = str;
    }

    private void d(String str) {
        this.i = str;
    }

    private void e(String str) {
        this.f19698k = str;
    }

    private void f(String str) {
        this.f19699l = str;
    }

    private void g(String str) {
        this.f19701n = str;
    }

    private void h(String str) {
        this.f19704q = str;
    }

    private void i(String str) {
        this.f19705r = str;
    }

    private Map<String, String> j(String str) {
        com.anythink.expressad.foundation.e.c cVar;
        com.anythink.expressad.foundation.e.c cVar2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        f fVar = new f();
        try {
            this.f19708u = str;
            fVar.a("ts", Long.valueOf(System.currentTimeMillis()));
            if (!TextUtils.isEmpty(m())) {
                fVar.a("unit_id", m());
            }
            int i = this.f19697j;
            if (i != 0) {
                fVar.a(b.f19594e, Integer.valueOf(i));
            }
            if (!TextUtils.isEmpty(this.f19705r)) {
                fVar.a("hb", this.f19705r);
            }
            if (!TextUtils.isEmpty(this.f19698k)) {
                fVar.a(b.f19605q, this.f19698k);
            }
            if (!TextUtils.isEmpty(str)) {
                fVar.a("key", str);
            }
            if (Arrays.asList(d.f19674l).contains(str)) {
                fVar.a(b.aR, this.f19711x ? "1" : "2");
            }
            if (c.f19618D.contains(str) && (cVar2 = this.f19693e) != null) {
                fVar.a("type", Integer.valueOf(cVar2.d()));
                fVar.a("reason", cVar2.a());
                if (!TextUtils.isEmpty(cVar2.f())) {
                    fVar.a(b.am, cVar2.f());
                    fVar.a(b.al, Integer.valueOf(cVar2.e()));
                }
            }
            if (c.f19619E.contains(str) && (cVar = this.f19693e) != null && !TextUtils.isEmpty(cVar.f())) {
                fVar.a("type", Integer.valueOf(cVar.e()));
                fVar.a("reason", cVar.f());
            }
        } catch (Exception e6) {
            if (com.anythink.expressad.a.f17776a) {
                e6.printStackTrace();
            }
        }
        return fVar.a();
    }

    private void k(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            String str2 = this.f19694f + str;
            Map<String, Map<String, String>> map = this.f19690b;
            if (map == null || !map.containsKey(str2)) {
                return;
            }
            this.f19690b.remove(str2);
        } catch (Exception e6) {
            if (com.anythink.expressad.a.f17776a) {
                e6.printStackTrace();
            }
        }
    }

    private long l(String str) {
        Map<String, Long> map;
        try {
            if (!TextUtils.isEmpty(str) && (map = this.f19692d) != null && map.containsKey(str)) {
                Long l9 = this.f19692d.get(str);
                return System.currentTimeMillis() - (l9 != null ? l9.longValue() : 0L);
            }
        } catch (Exception e6) {
            if (com.anythink.expressad.a.f17776a) {
                e6.printStackTrace();
            }
        }
        return 0L;
    }

    private void n(String str) {
        this.f19702o = str;
    }

    public final void a() {
        this.f19709v = 2;
    }

    private void a(String str) {
        this.f19708u = str;
    }

    private void c(boolean z8) {
        this.f19713z = z8;
    }

    private void d(boolean z8) {
        this.f19686A = z8;
    }

    private void a(List<com.anythink.expressad.foundation.d.d> list) {
        this.f19695g = list;
    }

    public final void b() {
        this.f19697j = com.anythink.expressad.foundation.g.a.aZ;
    }

    private void b(boolean z8) {
        this.f19712y = z8;
    }

    public final void a(com.anythink.expressad.foundation.d.d dVar) {
        this.f19687B = dVar;
    }

    private void a(long j9) {
        this.f19696h = j9;
    }

    public final void a(int i) {
        this.f19710w = i;
    }

    public final void a(String str, f fVar) {
        Map<String, String> map;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            String str2 = this.f19694f + str;
            Map<String, Map<String, String>> map2 = this.f19690b;
            if (map2 != null) {
                if (map2.containsKey(str2) && (map = this.f19690b.get(str2)) != null) {
                    map.putAll(fVar.a());
                } else {
                    this.f19690b.put(str2, fVar.a());
                }
            }
        } catch (Exception e6) {
            if (com.anythink.expressad.a.f17776a) {
                e6.printStackTrace();
            }
        }
    }

    private e(boolean z8) {
        this.f19689a = false;
        this.f19690b = new HashMap();
        this.f19691c = new HashMap();
        this.f19692d = new HashMap();
        this.f19694f = "";
        this.f19709v = -1;
        this.f19711x = false;
        this.f19713z = false;
        this.f19689a = z8;
    }

    private void m(String str) {
        if (this.f19692d == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f19692d.put(str, Long.valueOf(System.currentTimeMillis()));
    }

    private void a(String str, f fVar, int i) {
        Map<String, String> map;
        if (TextUtils.isEmpty(str) || fVar == null) {
            return;
        }
        try {
            String str2 = this.f19694f + "_" + i + "_" + str;
            Map<String, Map<String, String>> map2 = this.f19691c;
            if (map2 != null) {
                if (map2.containsKey(str2) && (map = this.f19691c.get(str2)) != null) {
                    map.putAll(fVar.a());
                } else {
                    this.f19691c.put(str2, fVar.a());
                }
            }
        } catch (Exception e6) {
            if (com.anythink.expressad.a.f17776a) {
                e6.printStackTrace();
            }
        }
    }

    private void a(com.anythink.expressad.foundation.e.c cVar) {
        this.f19693e = cVar;
    }
}
