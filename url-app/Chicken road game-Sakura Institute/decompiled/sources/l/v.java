package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class v implements g {

    /* renamed from: a, reason: collision with root package name */
    public long f5680a;

    /* renamed from: b, reason: collision with root package name */
    public Object f5681b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f5682c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f5683d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f5684e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f5685f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f5686g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f5687h;

    public v(w wVar, w1 w1Var, Object obj, q qVar) {
        g3.k kVar = new g3.k(4, wVar.f5696a);
        this.f5681b = kVar;
        this.f5682c = w1Var;
        this.f5683d = obj;
        q qVar2 = (q) w1Var.f5702a.f(obj);
        this.f5685f = qVar2;
        this.f5686g = e.g(qVar);
        q6.c cVar = w1Var.f5703b;
        if (((q) kVar.f4163j) == null) {
            kVar.f4163j = qVar2.c();
        }
        q qVar3 = (q) kVar.f4163j;
        if (qVar3 == null) {
            r6.k.j("targetVector");
            throw null;
        }
        int b9 = qVar3.b();
        int i7 = 0;
        while (i7 < b9) {
            q qVar4 = (q) kVar.f4163j;
            if (qVar4 == null) {
                r6.k.j("targetVector");
                throw null;
            }
            b6.c cVar2 = (b6.c) kVar.f4160g;
            float a3 = qVar2.a(i7);
            float a9 = qVar.a(i7);
            double b10 = ((k.l0) cVar2.f1394g).b(a9);
            double d8 = k.m0.f5243a;
            int i8 = i7;
            qVar4.e((Math.signum(a9) * ((float) (Math.exp((d8 / (d8 - 1.0d)) * b10) * r13.f5237a * r13.f5238b))) + a3, i8);
            i7 = i8 + 1;
        }
        q qVar5 = (q) kVar.f4163j;
        if (qVar5 == null) {
            r6.k.j("targetVector");
            throw null;
        }
        this.f5684e = cVar.f(qVar5);
        g3.k kVar2 = (g3.k) this.f5681b;
        q qVar6 = (q) this.f5685f;
        if (((q) kVar2.f4162i) == null) {
            kVar2.f4162i = qVar6.c();
        }
        q qVar7 = (q) kVar2.f4162i;
        if (qVar7 == null) {
            r6.k.j("velocityVector");
            throw null;
        }
        int b11 = qVar7.b();
        long j8 = 0;
        for (int i9 = 0; i9 < b11; i9++) {
            b6.c cVar3 = (b6.c) kVar2.f4160g;
            qVar6.getClass();
            j8 = Math.max(j8, ((long) (Math.exp(((k.l0) cVar3.f1394g).b(qVar.a(i9)) / (k.m0.f5243a - 1.0d)) * 1000.0d)) * 1000000);
        }
        this.f5680a = j8;
        q g9 = e.g(((g3.k) this.f5681b).s(j8, (q) this.f5685f, qVar));
        this.f5687h = g9;
        int b12 = g9.b();
        for (int i10 = 0; i10 < b12; i10++) {
            q qVar8 = (q) this.f5687h;
            float a10 = qVar8.a(i10);
            ((g3.k) this.f5681b).getClass();
            ((g3.k) this.f5681b).getClass();
            qVar8.e(v1.g.d(a10, -0.0f, 0.0f), i10);
        }
    }

    public static ArrayList h(v vVar, l3.g gVar) {
        o5.e eVar = (o5.e) vVar.f5681b;
        l5.x xVar = (l5.x) vVar.f5682c;
        l5.f fVar = l5.f.f6023i;
        xVar.getClass();
        return vVar.k(gVar, eVar, null, new androidx.room.c(fVar, 23, xVar));
    }

    public static ArrayList i(v vVar, q5.i iVar, l3.g gVar) {
        vVar.getClass();
        l5.f fVar = iVar.f7535a;
        l5.m mVar = (l5.m) ((o5.e) vVar.f5681b).m(fVar);
        o5.j.b("Missing sync point for query tag that we're tracking", mVar != null);
        l5.x xVar = (l5.x) vVar.f5682c;
        xVar.getClass();
        return mVar.a(gVar, new androidx.room.c(fVar, 23, xVar), null);
    }

    public static void m(o5.e eVar, ArrayList arrayList) {
        l5.m mVar = (l5.m) eVar.f6846f;
        if (mVar != null && mVar.f()) {
            arrayList.add(mVar.d());
            return;
        }
        if (mVar != null) {
            arrayList.addAll(mVar.e());
        }
        Iterator it = eVar.f6847g.iterator();
        while (it.hasNext()) {
            m((o5.e) ((Map.Entry) it.next()).getValue(), arrayList);
        }
    }

    public static q5.i n(q5.i iVar) {
        return (!iVar.f7536b.d() || iVar.b()) ? iVar : q5.i.a(iVar.f7535a);
    }

    @Override // l.g
    public boolean a() {
        return false;
    }

    @Override // l.g
    public Object b(long j8) {
        if (g(j8)) {
            return this.f5684e;
        }
        q6.c cVar = ((w1) this.f5682c).f5703b;
        g3.k kVar = (g3.k) this.f5681b;
        q qVar = (q) this.f5685f;
        q qVar2 = (q) this.f5686g;
        if (((q) kVar.f4161h) == null) {
            kVar.f4161h = qVar.c();
        }
        q qVar3 = (q) kVar.f4161h;
        String str = "valueVector";
        if (qVar3 == null) {
            r6.k.j("valueVector");
            throw null;
        }
        int b9 = qVar3.b();
        int i7 = 0;
        while (i7 < b9) {
            q qVar4 = (q) kVar.f4161h;
            if (qVar4 == null) {
                r6.k.j(str);
                throw null;
            }
            b6.c cVar2 = (b6.c) kVar.f4160g;
            float a3 = qVar.a(i7);
            long j9 = j8 / 1000000;
            k.k0 a9 = ((k.l0) cVar2.f1394g).a(qVar2.a(i7));
            String str2 = str;
            long j10 = a9.f5233c;
            qVar4.e((Math.signum(a9.f5231a) * a9.f5232b * k.b.a(j10 > 0 ? j9 / j10 : 1.0f).f5171a) + a3, i7);
            i7++;
            str = str2;
        }
        String str3 = str;
        q qVar5 = (q) kVar.f4161h;
        if (qVar5 != null) {
            return cVar.f(qVar5);
        }
        r6.k.j(str3);
        throw null;
    }

    @Override // l.g
    public long c() {
        return this.f5680a;
    }

    @Override // l.g
    public w1 d() {
        return (w1) this.f5682c;
    }

    @Override // l.g
    public Object e() {
        return this.f5684e;
    }

    @Override // l.g
    public q f(long j8) {
        return !g(j8) ? ((g3.k) this.f5681b).s(j8, (q) this.f5685f, (q) this.f5686g) : (q) this.f5687h;
    }

    public ArrayList j(l3.g gVar, o5.e eVar, t5.s sVar, androidx.room.c cVar) {
        l5.m mVar = (l5.m) eVar.f6846f;
        if (sVar == null && mVar != null) {
            sVar = mVar.c(l5.f.f6023i);
        }
        t5.s sVar2 = sVar;
        ArrayList arrayList = new ArrayList();
        eVar.f6847g.z(new l5.p(this, sVar2, cVar, gVar, arrayList));
        if (mVar != null) {
            arrayList.addAll(mVar.a(gVar, cVar, sVar2));
        }
        return arrayList;
    }

    public ArrayList k(l3.g gVar, o5.e eVar, t5.s sVar, androidx.room.c cVar) {
        l5.f fVar = (l5.f) gVar.f5902c;
        if (fVar.isEmpty()) {
            return j(gVar, eVar, sVar, cVar);
        }
        l5.m mVar = (l5.m) eVar.f6846f;
        if (sVar == null && mVar != null) {
            sVar = mVar.c(l5.f.f6023i);
        }
        ArrayList arrayList = new ArrayList();
        t5.c z8 = fVar.z();
        l3.g a3 = gVar.a(z8);
        o5.e eVar2 = (o5.e) eVar.f6847g.g(z8);
        if (eVar2 != null && a3 != null) {
            arrayList.addAll(k(a3, eVar2, sVar != null ? sVar.d(z8) : null, new androidx.room.c(((l5.f) cVar.f1069g).m(z8), 23, (l5.x) cVar.f1070h)));
        }
        if (mVar != null) {
            arrayList.addAll(mVar.a(gVar, cVar, sVar));
        }
        return arrayList;
    }

    public List l(l5.f fVar, t5.s sVar) {
        return (List) ((n5.a) this.f5686g).a(new l5.s(this, fVar, sVar));
    }

    public List o(q5.i iVar, l5.w wVar, g5.a aVar) {
        return (List) ((n5.a) this.f5686g).a(new l5.n(this, iVar, wVar, aVar, 1));
    }

    public l5.t p(q5.i iVar) {
        return (l5.t) ((HashMap) this.f5684e).get(iVar);
    }

    public v(l5.d dVar, n5.a aVar, l5.h hVar) {
        this.f5680a = 1L;
        this.f5681b = o5.e.f6845i;
        l5.x xVar = new l5.x();
        xVar.f6092a = l5.b.f6006g;
        xVar.f6093b = new ArrayList();
        xVar.f6094c = -1L;
        this.f5682c = xVar;
        this.f5683d = new HashMap();
        this.f5684e = new HashMap();
        new HashSet();
        this.f5685f = hVar;
        this.f5686g = aVar;
        this.f5687h = dVar.a("SyncTree");
    }
}
