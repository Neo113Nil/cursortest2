package W4;

import a5.C0231a;
import a5.C0232b;
import a5.C0233c;
import b5.C0266a;
import c5.C0290a;
import e5.C0346a;
import e5.C0349d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2806a;

    /* renamed from: b, reason: collision with root package name */
    public String f2807b;

    /* renamed from: c, reason: collision with root package name */
    public int f2808c;

    /* renamed from: d, reason: collision with root package name */
    public String f2809d;

    /* renamed from: e, reason: collision with root package name */
    public String f2810e;

    /* renamed from: f, reason: collision with root package name */
    public Object f2811f;

    /* renamed from: g, reason: collision with root package name */
    public Object f2812g;

    /* renamed from: h, reason: collision with root package name */
    public Object f2813h;

    public /* synthetic */ m() {
        this.f2806a = 1;
    }

    public C1.a a() {
        String str = this.f2808c == 0 ? " registrationStatus" : "";
        if (((Long) this.f2811f) == null) {
            str = str.concat(" expiresInSecs");
        }
        if (((Long) this.f2812g) == null) {
            str = o.d(str, " tokenCreationEpochInSecs");
        }
        if (str.isEmpty()) {
            return new C1.a(this.f2807b, this.f2808c, this.f2809d, this.f2810e, ((Long) this.f2811f).longValue(), ((Long) this.f2812g).longValue(), (String) this.f2813h);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public a b(B1.g gVar) {
        C0232b c7 = c();
        v vVar = (v) this.f2811f;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : vVar.f2840e.entrySet()) {
            C0290a c0290a = (C0290a) entry.getKey();
            Iterator it = c0290a.f3821b.a(c7, vVar.f2839d).iterator();
            while (it.hasNext()) {
                d dVar = ((C0346a) it.next()).f4008b;
                b bVar = dVar.f2803a;
                if (C0349d.f4014a != bVar) {
                    C0266a c0266a = vVar.f2838c.f3962c;
                    C0233c.a(dVar, Z4.b.f3107f, c7);
                    throw null;
                }
            }
        }
        u uVar = arrayList.size() == 1 ? (u) arrayList.get(0) : new u(arrayList);
        switch (gVar.f104f) {
            case 14:
                return new g(c7, uVar);
            case 15:
                return new i(c7, uVar);
            case 16:
                return new l(c7, uVar);
            case 17:
                return new r(c7, uVar);
            case 18:
                return new s(c7, uVar);
            default:
                return new t(c7, uVar);
        }
    }

    public C0232b c() {
        return new C0232b(this.f2807b, this.f2809d, this.f2810e, (n) this.f2812g, this.f2808c, new C0231a((List) ((V5.g) this.f2813h).f2734g));
    }

    public String d(String str) {
        return str + "{descriptor=" + c() + "}";
    }

    public String toString() {
        switch (this.f2806a) {
            case 0:
                return d(m.class.getSimpleName());
            default:
                return super.toString();
        }
    }

    public m(String str, n nVar, int i7, v vVar) {
        this.f2806a = 0;
        this.f2813h = new V5.g(2);
        this.f2809d = "";
        this.f2810e = "";
        this.f2807b = str;
        this.f2812g = nVar;
        this.f2808c = i7;
        this.f2811f = vVar;
    }
}
