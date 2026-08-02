package i0;

import I.C0079n;
import a.AbstractC0132a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: i0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0222a extends AbstractC0132a {

    /* renamed from: j, reason: collision with root package name */
    public final Map f2487j;

    /* renamed from: k, reason: collision with root package name */
    public final C0079n f2488k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f2489l;

    public C0222a(Map map, boolean z2) {
        super(25);
        this.f2488k = new C0079n();
        this.f2487j = map;
        this.f2489l = z2;
    }

    public final void S(ArrayList arrayList) {
        if (this.f2489l) {
            return;
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        C0079n c0079n = this.f2488k;
        hashMap2.put("code", (String) c0079n.f690f);
        hashMap2.put("message", (String) c0079n.f691g);
        hashMap2.put("data", (HashMap) c0079n.f692h);
        hashMap.put("error", hashMap2);
        arrayList.add(hashMap);
    }

    public final void T(ArrayList arrayList) {
        if (this.f2489l) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("result", (Serializable) this.f2488k.f689e);
        arrayList.add(hashMap);
    }

    @Override // a.AbstractC0132a
    public final Object s(String str) {
        return this.f2487j.get(str);
    }

    @Override // a.AbstractC0132a
    public final String t() {
        return (String) this.f2487j.get("method");
    }

    @Override // a.AbstractC0132a
    public final boolean u() {
        return this.f2489l;
    }

    @Override // a.AbstractC0132a
    public final c v() {
        return this.f2488k;
    }

    @Override // a.AbstractC0132a
    public final boolean w() {
        return this.f2487j.containsKey("transactionId");
    }
}
