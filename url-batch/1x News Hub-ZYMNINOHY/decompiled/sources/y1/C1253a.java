package y1;

import B0.p;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: y1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1253a extends S0.a {

    /* renamed from: i, reason: collision with root package name */
    public final Map f10825i;

    /* renamed from: j, reason: collision with root package name */
    public final p f10826j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f10827k;

    public C1253a(Map map, boolean z) {
        super(23);
        this.f10826j = new p();
        this.f10825i = map;
        this.f10827k = z;
    }

    public final void Q(ArrayList arrayList) {
        if (this.f10827k) {
            return;
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        p pVar = this.f10826j;
        hashMap2.put("code", (String) pVar.f163b);
        hashMap2.put("message", (String) pVar.f164c);
        hashMap2.put("data", (HashMap) pVar.f165d);
        hashMap.put("error", hashMap2);
        arrayList.add(hashMap);
    }

    public final void R(ArrayList arrayList) {
        if (this.f10827k) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("result", (Serializable) this.f10826j.f162a);
        arrayList.add(hashMap);
    }

    @Override // S0.a
    public final Object m(String str) {
        return this.f10825i.get(str);
    }

    @Override // S0.a
    public final String o() {
        return (String) this.f10825i.get("method");
    }

    @Override // S0.a
    public final boolean p() {
        return this.f10827k;
    }

    @Override // S0.a
    public final InterfaceC1255c q() {
        return this.f10826j;
    }

    @Override // S0.a
    public final boolean s() {
        return this.f10825i.containsKey("transactionId");
    }
}
