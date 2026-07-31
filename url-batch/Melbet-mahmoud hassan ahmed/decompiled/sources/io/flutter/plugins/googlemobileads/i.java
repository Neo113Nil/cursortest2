package io.flutter.plugins.googlemobileads;

import io.flutter.plugins.googlemobileads.l;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import s2.a;

/* loaded from: classes.dex */
class i extends l {

    /* renamed from: i, reason: collision with root package name */
    private final Map<String, String> f17506i;

    /* renamed from: j, reason: collision with root package name */
    private final Map<String, List<String>> f17507j;

    /* renamed from: k, reason: collision with root package name */
    private final String f17508k;

    static class b extends l.a {

        /* renamed from: i, reason: collision with root package name */
        private Map<String, String> f17509i;

        /* renamed from: j, reason: collision with root package name */
        private Map<String, List<String>> f17510j;

        /* renamed from: k, reason: collision with root package name */
        private String f17511k;

        b() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // io.flutter.plugins.googlemobileads.l.a
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public i a() {
            return new i(e(), c(), this.f17509i, this.f17510j, i(), h(), d(), this.f17511k, f(), g(), b());
        }

        public b s(Map<String, String> map) {
            this.f17509i = map;
            return this;
        }

        public b t(Map<String, List<String>> map) {
            this.f17510j = map;
            return this;
        }

        public b u(String str) {
            this.f17511k = str;
            return this;
        }
    }

    private i(List<String> list, String str, Map<String, String> map, Map<String, List<String>> map2, Boolean bool, List<String> list2, Integer num, String str2, String str3, i0 i0Var, Map<String, String> map3) {
        super(list, str, bool, list2, num, str3, i0Var, map3);
        this.f17506i = map;
        this.f17507j = map2;
        this.f17508k = str2;
    }

    @Override // io.flutter.plugins.googlemobileads.l
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return super.equals(obj) && Objects.equals(this.f17506i, iVar.f17506i) && Objects.equals(this.f17507j, iVar.f17507j);
    }

    @Override // io.flutter.plugins.googlemobileads.l
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.f17506i, this.f17507j);
    }

    s2.a k(String str) {
        a.C0135a c0135a = new a.C0135a();
        j(c0135a, str);
        Map<String, String> map = this.f17506i;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                c0135a.n(entry.getKey(), entry.getValue());
            }
        }
        Map<String, List<String>> map2 = this.f17507j;
        if (map2 != null) {
            for (Map.Entry<String, List<String>> entry2 : map2.entrySet()) {
                c0135a.o(entry2.getKey(), entry2.getValue());
            }
        }
        String str2 = this.f17508k;
        if (str2 != null) {
            c0135a.q(str2);
        }
        return c0135a.c();
    }

    protected Map<String, String> l() {
        return this.f17506i;
    }

    protected Map<String, List<String>> m() {
        return this.f17507j;
    }

    protected String n() {
        return this.f17508k;
    }
}
