package io.flutter.plugins.googlemobileads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import r2.g;

/* loaded from: classes.dex */
class l {

    /* renamed from: a, reason: collision with root package name */
    private final List<String> f17525a;

    /* renamed from: b, reason: collision with root package name */
    private final String f17526b;

    /* renamed from: c, reason: collision with root package name */
    private final Boolean f17527c;

    /* renamed from: d, reason: collision with root package name */
    private final List<String> f17528d;

    /* renamed from: e, reason: collision with root package name */
    private final Integer f17529e;

    /* renamed from: f, reason: collision with root package name */
    private final String f17530f;

    /* renamed from: g, reason: collision with root package name */
    private final i0 f17531g;

    /* renamed from: h, reason: collision with root package name */
    private final Map<String, String> f17532h;

    protected static class a {

        /* renamed from: a, reason: collision with root package name */
        private List<String> f17533a;

        /* renamed from: b, reason: collision with root package name */
        private String f17534b;

        /* renamed from: c, reason: collision with root package name */
        private Boolean f17535c;

        /* renamed from: d, reason: collision with root package name */
        private List<String> f17536d;

        /* renamed from: e, reason: collision with root package name */
        private Integer f17537e;

        /* renamed from: f, reason: collision with root package name */
        private String f17538f;

        /* renamed from: g, reason: collision with root package name */
        private i0 f17539g;

        /* renamed from: h, reason: collision with root package name */
        private Map<String, String> f17540h;

        protected a() {
        }

        l a() {
            return new l(this.f17533a, this.f17534b, this.f17535c, this.f17536d, this.f17537e, this.f17538f, this.f17539g, this.f17540h);
        }

        protected Map<String, String> b() {
            return this.f17540h;
        }

        protected String c() {
            return this.f17534b;
        }

        protected Integer d() {
            return this.f17537e;
        }

        protected List<String> e() {
            return this.f17533a;
        }

        protected String f() {
            return this.f17538f;
        }

        protected i0 g() {
            return this.f17539g;
        }

        protected List<String> h() {
            return this.f17536d;
        }

        protected Boolean i() {
            return this.f17535c;
        }

        a j(Map<String, String> map) {
            this.f17540h = map;
            return this;
        }

        a k(String str) {
            this.f17534b = str;
            return this;
        }

        a l(Integer num) {
            this.f17537e = num;
            return this;
        }

        a m(List<String> list) {
            this.f17533a = list;
            return this;
        }

        a n(String str) {
            this.f17538f = str;
            return this;
        }

        a o(i0 i0Var) {
            this.f17539g = i0Var;
            return this;
        }

        a p(List<String> list) {
            this.f17536d = list;
            return this;
        }

        a q(Boolean bool) {
            this.f17535c = bool;
            return this;
        }
    }

    protected l(List<String> list, String str, Boolean bool, List<String> list2, Integer num, String str2, i0 i0Var, Map<String, String> map) {
        this.f17525a = list;
        this.f17526b = str;
        this.f17527c = bool;
        this.f17528d = list2;
        this.f17529e = num;
        this.f17530f = str2;
        this.f17531g = i0Var;
        this.f17532h = map;
    }

    private void a(g.a aVar, String str) {
        HashMap hashMap = new HashMap();
        i0 i0Var = this.f17531g;
        if (i0Var != null) {
            hashMap.putAll(i0Var.a(str, this.f17530f));
        }
        Map<String, String> map = this.f17532h;
        if (map != null && !map.isEmpty()) {
            Bundle bundle = new Bundle();
            for (Map.Entry<String, String> entry : this.f17532h.entrySet()) {
                bundle.putString(entry.getKey(), entry.getValue());
            }
            hashMap.put(AdMobAdapter.class, bundle);
        }
        Boolean bool = this.f17527c;
        if (bool != null && bool.booleanValue()) {
            Bundle bundle2 = (Bundle) hashMap.get(AdMobAdapter.class);
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            bundle2.putString("npa", "1");
            hashMap.put(AdMobAdapter.class, bundle2);
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            aVar.b((Class) entry2.getKey(), (Bundle) entry2.getValue());
        }
    }

    r2.g b(String str) {
        return j(new g.a(), str).c();
    }

    protected Map<String, String> c() {
        return this.f17532h;
    }

    protected String d() {
        return this.f17526b;
    }

    protected Integer e() {
        return this.f17529e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Objects.equals(this.f17525a, lVar.f17525a) && Objects.equals(this.f17526b, lVar.f17526b) && Objects.equals(this.f17527c, lVar.f17527c) && Objects.equals(this.f17528d, lVar.f17528d) && Objects.equals(this.f17529e, lVar.f17529e) && Objects.equals(this.f17530f, lVar.f17530f) && Objects.equals(this.f17531g, lVar.f17531g) && Objects.equals(this.f17532h, lVar.f17532h);
    }

    protected List<String> f() {
        return this.f17525a;
    }

    protected String g() {
        return this.f17530f;
    }

    protected List<String> h() {
        return this.f17528d;
    }

    public int hashCode() {
        return Objects.hash(this.f17525a, this.f17526b, this.f17527c, this.f17528d, this.f17529e, this.f17530f, this.f17531g);
    }

    protected Boolean i() {
        return this.f17527c;
    }

    protected g.a j(g.a aVar, String str) {
        List<String> list = this.f17525a;
        if (list != null) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                aVar.a(it.next());
            }
        }
        String str2 = this.f17526b;
        if (str2 != null) {
            aVar.d(str2);
        }
        a(aVar, str);
        List<String> list2 = this.f17528d;
        if (list2 != null) {
            aVar.g(list2);
        }
        Integer num = this.f17529e;
        if (num != null) {
            aVar.e(num.intValue());
        }
        aVar.h("Flutter-GMA-1.3.0");
        return aVar;
    }
}
