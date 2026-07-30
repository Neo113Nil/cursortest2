package e5;

import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import l1.x;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public int f2754a;

    /* renamed from: b, reason: collision with root package name */
    public Object f2755b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2756c;

    /* renamed from: d, reason: collision with root package name */
    public final Collection f2757d;

    /* renamed from: e, reason: collision with root package name */
    public Object f2758e;

    /* renamed from: f, reason: collision with root package name */
    public Object f2759f;

    public b(s7.a aVar, x xVar, w7.g gVar) {
        List j8;
        r6.k.f(xVar, "routeDatabase");
        this.f2755b = aVar;
        this.f2756c = xVar;
        e6.u uVar = e6.u.f2826f;
        this.f2757d = uVar;
        this.f2758e = uVar;
        this.f2759f = new ArrayList();
        s7.l lVar = aVar.f8536h;
        r6.k.f(lVar, "url");
        URI g9 = lVar.g();
        if (g9.getHost() == null) {
            j8 = t7.b.j(Proxy.NO_PROXY);
        } else {
            List<Proxy> select = aVar.f8535g.select(g9);
            j8 = (select == null || select.isEmpty()) ? t7.b.j(Proxy.NO_PROXY) : t7.b.v(select);
        }
        this.f2757d = j8;
        this.f2754a = 0;
    }

    public void a(l lVar) {
        if (((HashSet) this.f2756c).contains(lVar.f2785a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        ((HashSet) this.f2757d).add(lVar);
    }

    public c b() {
        if (((f) this.f2759f) != null) {
            return new c((String) this.f2755b, new HashSet((HashSet) this.f2756c), new HashSet((HashSet) this.f2757d), this.f2754a, (f) this.f2759f, (HashSet) this.f2758e);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    public boolean c() {
        return this.f2754a < ((List) this.f2757d).size() || !((ArrayList) this.f2759f).isEmpty();
    }

    public b(Class cls, Class[] clsArr) {
        this.f2755b = null;
        HashSet hashSet = new HashSet();
        this.f2756c = hashSet;
        this.f2757d = new HashSet();
        this.f2754a = 0;
        this.f2758e = new HashSet();
        hashSet.add(t.a(cls));
        for (Class cls2 : clsArr) {
            a8.m.n(cls2, "Null interface");
            ((HashSet) this.f2756c).add(t.a(cls2));
        }
    }

    public b(t tVar, t[] tVarArr) {
        this.f2755b = null;
        HashSet hashSet = new HashSet();
        this.f2756c = hashSet;
        this.f2757d = new HashSet();
        this.f2754a = 0;
        this.f2758e = new HashSet();
        hashSet.add(tVar);
        for (t tVar2 : tVarArr) {
            a8.m.n(tVar2, "Null interface");
        }
        Collections.addAll((HashSet) this.f2756c, tVarArr);
    }
}
