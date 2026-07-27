package R3;

import E.C0028c;
import a2.C0180a;
import b2.AbstractC0279e;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2626a;

    /* renamed from: b, reason: collision with root package name */
    public String f2627b;

    /* renamed from: c, reason: collision with root package name */
    public int f2628c;

    /* renamed from: d, reason: collision with root package name */
    public String f2629d;

    /* renamed from: e, reason: collision with root package name */
    public String f2630e;

    /* renamed from: f, reason: collision with root package name */
    public Object f2631f;

    /* renamed from: g, reason: collision with root package name */
    public Object f2632g;

    /* renamed from: h, reason: collision with root package name */
    public Object f2633h;

    public /* synthetic */ m() {
        this.f2626a = 1;
    }

    public C0180a a() {
        String str = this.f2628c == 0 ? " registrationStatus" : "";
        if (((Long) this.f2631f) == null) {
            str = str.concat(" expiresInSecs");
        }
        if (((Long) this.f2632g) == null) {
            str = AbstractC0279e.e(str, " tokenCreationEpochInSecs");
        }
        if (str.isEmpty()) {
            return new C0180a(this.f2627b, this.f2628c, this.f2629d, this.f2630e, ((Long) this.f2631f).longValue(), ((Long) this.f2632g).longValue(), (String) this.f2633h);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public a b(C0028c c0028c) {
        V3.b c2 = c();
        u uVar = (u) this.f2631f;
        uVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : uVar.f2660e.entrySet()) {
            X3.a aVar = (X3.a) entry.getKey();
            for (Z3.a aVar2 : aVar.f3522b.a(c2, uVar.f2659d)) {
                Z3.d dVar = Z3.d.f3782a;
                d dVar2 = aVar2.f3776b;
                b bVar = dVar2.f2623a;
                if (dVar != bVar) {
                    W3.a aVar3 = uVar.f2658c.f3699c;
                    V3.c.a(dVar2, U3.b.f3171a, c2);
                    throw null;
                }
            }
        }
        t tVar = arrayList.size() == 1 ? (t) arrayList.get(0) : new t(arrayList);
        switch (c0028c.f602a) {
            case 13:
                return new g(c2, tVar);
            case 14:
                return new i(c2, tVar);
            case 15:
                return new l(c2, tVar);
            case 16:
                return new q(c2, tVar);
            case 17:
                return new r(c2, tVar);
            default:
                return new s(c2, tVar);
        }
    }

    public V3.b c() {
        return new V3.b(this.f2627b, this.f2629d, this.f2630e, (n) this.f2632g, this.f2628c, new V3.a(((T4.k) this.f2633h).f2900a));
    }

    public String d(String str) {
        return str + "{descriptor=" + c() + "}";
    }

    public String toString() {
        switch (this.f2626a) {
            case 0:
                return d(m.class.getSimpleName());
            default:
                return super.toString();
        }
    }

    public m(String str, n nVar, int i2, u uVar) {
        this.f2626a = 0;
        this.f2633h = new T4.k();
        this.f2629d = "";
        this.f2630e = "";
        this.f2627b = str;
        this.f2632g = nVar;
        this.f2628c = i2;
        this.f2631f = uVar;
    }
}
