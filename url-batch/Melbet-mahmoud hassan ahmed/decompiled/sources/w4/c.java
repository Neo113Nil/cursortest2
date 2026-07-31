package w4;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import m5.k;

/* loaded from: classes.dex */
public class c extends w4.a {

    /* renamed from: a, reason: collision with root package name */
    final Map<String, Object> f23019a;

    /* renamed from: b, reason: collision with root package name */
    final a f23020b = new a();

    /* renamed from: c, reason: collision with root package name */
    final boolean f23021c;

    public class a implements g {

        /* renamed from: a, reason: collision with root package name */
        Object f23022a;

        /* renamed from: b, reason: collision with root package name */
        String f23023b;

        /* renamed from: c, reason: collision with root package name */
        String f23024c;

        /* renamed from: d, reason: collision with root package name */
        Object f23025d;

        public a() {
        }

        @Override // w4.g
        public void a(Object obj) {
            this.f23022a = obj;
        }

        @Override // w4.g
        public void b(String str, String str2, Object obj) {
            this.f23023b = str;
            this.f23024c = str2;
            this.f23025d = obj;
        }
    }

    public c(Map<String, Object> map, boolean z6) {
        this.f23019a = map;
        this.f23021c = z6;
    }

    @Override // w4.f
    public <T> T c(String str) {
        return (T) this.f23019a.get(str);
    }

    @Override // w4.b, w4.f
    public boolean e() {
        return this.f23021c;
    }

    @Override // w4.a
    public g k() {
        return this.f23020b;
    }

    public String l() {
        return (String) this.f23019a.get("method");
    }

    public Map<String, Object> m() {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("code", this.f23020b.f23023b);
        hashMap2.put("message", this.f23020b.f23024c);
        hashMap2.put("data", this.f23020b.f23025d);
        hashMap.put("error", hashMap2);
        return hashMap;
    }

    public Map<String, Object> n() {
        HashMap hashMap = new HashMap();
        hashMap.put("result", this.f23020b.f23022a);
        return hashMap;
    }

    public void o(k.d dVar) {
        a aVar = this.f23020b;
        dVar.b(aVar.f23023b, aVar.f23024c, aVar.f23025d);
    }

    public void p(List<Map<String, Object>> list) {
        if (e()) {
            return;
        }
        list.add(m());
    }

    public void q(List<Map<String, Object>> list) {
        if (e()) {
            return;
        }
        list.add(n());
    }
}
