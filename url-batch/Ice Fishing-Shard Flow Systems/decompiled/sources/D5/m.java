package D5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final String f361a;

    /* renamed from: b, reason: collision with root package name */
    public final u f362b;

    /* renamed from: c, reason: collision with root package name */
    public final int f363c;

    /* renamed from: d, reason: collision with root package name */
    public n f364d;

    /* renamed from: e, reason: collision with root package name */
    public D6.m f365e = new D6.m();

    /* renamed from: f, reason: collision with root package name */
    public String f366f = "";

    /* renamed from: g, reason: collision with root package name */
    public String f367g = "";

    public m(String str, n nVar, int i2, u uVar) {
        this.f361a = str;
        this.f364d = nVar;
        this.f363c = i2;
        this.f362b = uVar;
    }

    public final a a(A4.c cVar) {
        H5.b b7 = b();
        ArrayList arrayList = new ArrayList();
        u uVar = this.f362b;
        for (Map.Entry entry : uVar.f394e.entrySet()) {
            J5.a aVar = (J5.a) entry.getKey();
            Iterator it = aVar.f1390b.a(b7, uVar.f393d).iterator();
            while (it.hasNext()) {
                d dVar = ((L5.a) it.next()).f1686b;
                b bVar = dVar.f358a;
                if (L5.d.f1692a != bVar) {
                    I5.a aVar2 = uVar.f392c.f1466c;
                    H5.c.a(dVar, G5.b.f844d, b7);
                    throw null;
                }
            }
        }
        t tVar = arrayList.size() == 1 ? (t) arrayList.get(0) : new t(arrayList);
        switch (cVar.f89d) {
            case 1:
                return new g(b7, tVar);
            case 2:
                return new i(b7, tVar);
            case 3:
                return new l(b7, tVar);
            case 4:
                return new q(b7, tVar);
            case 5:
                return new r(b7, tVar);
            default:
                return new s(b7, tVar);
        }
    }

    public final H5.b b() {
        return new H5.b(this.f361a, this.f366f, this.f367g, this.f364d, this.f363c, new H5.a(this.f365e.f539a));
    }

    public final String c(String str) {
        StringBuilder l7 = C4.p.l(str, "{descriptor=");
        l7.append(b());
        l7.append("}");
        return l7.toString();
    }

    public final String toString() {
        return c(m.class.getSimpleName());
    }
}
