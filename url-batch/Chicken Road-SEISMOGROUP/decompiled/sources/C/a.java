package C;

import A.e;
import a.AbstractC0016a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class a extends AbstractC0016a {

    /* renamed from: g, reason: collision with root package name */
    public final Map f91g;

    /* renamed from: h, reason: collision with root package name */
    public final e f92h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f93i;

    public a(Map map, boolean z) {
        super(1);
        this.f92h = new e();
        this.f91g = map;
        this.f93i = z;
    }

    public final void I(ArrayList arrayList) {
        if (this.f93i) {
            return;
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        e eVar = this.f92h;
        hashMap2.put("code", (String) eVar.f8c);
        hashMap2.put("message", (String) eVar.f9d);
        hashMap2.put("data", (HashMap) eVar.f10e);
        hashMap.put("error", hashMap2);
        arrayList.add(hashMap);
    }

    public final void J(ArrayList arrayList) {
        if (this.f93i) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("result", (Serializable) this.f92h.f7b);
        arrayList.add(hashMap);
    }

    @Override // a.AbstractC0016a
    public final Object m(String str) {
        return this.f91g.get(str);
    }

    @Override // a.AbstractC0016a
    public final String o() {
        return (String) this.f91g.get("method");
    }

    @Override // a.AbstractC0016a
    public final boolean p() {
        return this.f93i;
    }

    @Override // a.AbstractC0016a
    public final c q() {
        return this.f92h;
    }

    @Override // a.AbstractC0016a
    public final boolean s() {
        return this.f91g.containsKey("transactionId");
    }
}
