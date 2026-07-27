package g2;

import G.C0231x;
import b2.C0517a;
import f1.C0607a;
import j2.AbstractC0720j;
import j2.C0715e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k.AbstractC0736b;
import k.C0733I;
import k.C0734J;
import k.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l.AbstractC0779e;
import l.AbstractC0792s;
import l.C0796w;
import l.InterfaceC0783i;
import l.v0;
import o2.C0924c;

/* loaded from: classes.dex */
public final class s implements InterfaceC0783i {

    /* renamed from: a, reason: collision with root package name */
    public long f6751a;

    /* renamed from: b, reason: collision with root package name */
    public Object f6752b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f6753c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f6754d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f6755e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f6756f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f6757g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f6758h;

    public s(C0796w c0796w, v0 v0Var, Object obj, AbstractC0792s abstractC0792s) {
        AbstractC0792s abstractC0792s2 = abstractC0792s;
        Y0.b bVar = new Y0.b(6, c0796w.f7855a);
        this.f6752b = bVar;
        this.f6753c = v0Var;
        this.f6754d = obj;
        AbstractC0792s abstractC0792s3 = (AbstractC0792s) v0Var.f7853a.invoke(obj);
        this.f6755e = abstractC0792s3;
        this.f6756f = AbstractC0779e.f(abstractC0792s);
        if (((AbstractC0792s) bVar.f4389e) == null) {
            bVar.f4389e = abstractC0792s3.c();
        }
        AbstractC0792s abstractC0792s4 = (AbstractC0792s) bVar.f4389e;
        String str = "targetVector";
        if (abstractC0792s4 == null) {
            Intrinsics.g("targetVector");
            throw null;
        }
        int b4 = abstractC0792s4.b();
        int i2 = 0;
        while (i2 < b4) {
            AbstractC0792s abstractC0792s5 = (AbstractC0792s) bVar.f4389e;
            if (abstractC0792s5 == null) {
                Intrinsics.g(str);
                throw null;
            }
            float a4 = abstractC0792s3.a(i2);
            float a5 = abstractC0792s2.a(i2);
            C0734J c0734j = (C0734J) ((C0607a) bVar.f4390i).f6561e;
            double b5 = c0734j.b(a5);
            double d4 = K.f7264a;
            float f4 = c0734j.f7262a * c0734j.f7263b;
            abstractC0792s5.e((Math.signum(a5) * ((float) (Math.exp((d4 / (d4 - 1.0d)) * b5) * f4))) + a4, i2);
            i2++;
            abstractC0792s2 = abstractC0792s;
            abstractC0792s3 = abstractC0792s3;
            str = str;
        }
        String str2 = str;
        AbstractC0792s abstractC0792s6 = (AbstractC0792s) bVar.f4389e;
        if (abstractC0792s6 == null) {
            Intrinsics.g(str2);
            throw null;
        }
        this.f6758h = v0Var.f7854b.invoke(abstractC0792s6);
        Y0.b bVar2 = (Y0.b) this.f6752b;
        AbstractC0792s abstractC0792s7 = (AbstractC0792s) this.f6755e;
        if (((AbstractC0792s) bVar2.f4392k) == null) {
            bVar2.f4392k = abstractC0792s7.c();
        }
        AbstractC0792s abstractC0792s8 = (AbstractC0792s) bVar2.f4392k;
        if (abstractC0792s8 == null) {
            Intrinsics.g("velocityVector");
            throw null;
        }
        int b6 = abstractC0792s8.b();
        long j4 = 0;
        for (int i4 = 0; i4 < b6; i4++) {
            abstractC0792s7.getClass();
            j4 = Math.max(j4, ((long) (Math.exp(((C0734J) ((C0607a) bVar2.f4390i).f6561e).b(abstractC0792s.a(i4)) / (K.f7264a - 1.0d)) * 1000.0d)) * 1000000);
        }
        this.f6751a = j4;
        AbstractC0792s f5 = AbstractC0779e.f(((Y0.b) this.f6752b).s(j4, (AbstractC0792s) this.f6755e, abstractC0792s));
        this.f6757g = f5;
        int b7 = f5.b();
        for (int i5 = 0; i5 < b7; i5++) {
            AbstractC0792s abstractC0792s9 = (AbstractC0792s) this.f6757g;
            float a6 = abstractC0792s9.a(i5);
            ((Y0.b) this.f6752b).getClass();
            ((Y0.b) this.f6752b).getClass();
            abstractC0792s9.e(kotlin.ranges.b.d(a6, -0.0f, 0.0f), i5);
        }
    }

    public static ArrayList h(s sVar, h2.d dVar) {
        C0715e c0715e = (C0715e) sVar.f6752b;
        e eVar = e.f6694j;
        x xVar = (x) sVar.f6753c;
        xVar.getClass();
        return sVar.k(dVar, c0715e, null, new y.t(eVar, 25, xVar));
    }

    public static ArrayList i(s sVar, l2.i iVar, h2.d dVar) {
        sVar.getClass();
        C0715e c0715e = (C0715e) sVar.f6752b;
        e eVar = iVar.f7984a;
        l lVar = (l) c0715e.j(eVar);
        AbstractC0720j.b("Missing sync point for query tag that we're tracking", lVar != null);
        x xVar = (x) sVar.f6753c;
        xVar.getClass();
        return lVar.a(dVar, new y.t(eVar, 25, xVar), null);
    }

    public static void m(C0715e c0715e, ArrayList arrayList) {
        l lVar = (l) c0715e.f7159d;
        if (lVar != null && lVar.f()) {
            arrayList.add(lVar.d());
            return;
        }
        if (lVar != null) {
            arrayList.addAll(lVar.e());
        }
        Iterator it = c0715e.f7160e.iterator();
        while (it.hasNext()) {
            m((C0715e) ((Map.Entry) it.next()).getValue(), arrayList);
        }
    }

    public static l2.i n(l2.i iVar) {
        return (!iVar.f7985b.d() || iVar.b()) ? iVar : l2.i.a(iVar.f7984a);
    }

    @Override // l.InterfaceC0783i
    public boolean a() {
        return false;
    }

    @Override // l.InterfaceC0783i
    public Object b(long j4) {
        if (f(j4)) {
            return this.f6758h;
        }
        Function1 function1 = ((v0) this.f6753c).f7854b;
        Y0.b bVar = (Y0.b) this.f6752b;
        AbstractC0792s abstractC0792s = (AbstractC0792s) bVar.f4391j;
        AbstractC0792s abstractC0792s2 = (AbstractC0792s) this.f6755e;
        if (abstractC0792s == null) {
            bVar.f4391j = abstractC0792s2.c();
        }
        AbstractC0792s abstractC0792s3 = (AbstractC0792s) bVar.f4391j;
        String str = "valueVector";
        if (abstractC0792s3 == null) {
            Intrinsics.g("valueVector");
            throw null;
        }
        int b4 = abstractC0792s3.b();
        int i2 = 0;
        while (i2 < b4) {
            AbstractC0792s abstractC0792s4 = (AbstractC0792s) bVar.f4391j;
            if (abstractC0792s4 == null) {
                Intrinsics.g(str);
                throw null;
            }
            float a4 = abstractC0792s2.a(i2);
            long j5 = j4 / 1000000;
            C0733I a5 = ((C0734J) ((C0607a) bVar.f4390i).f6561e).a(((AbstractC0792s) this.f6756f).a(i2));
            String str2 = str;
            long j6 = a5.f7261c;
            abstractC0792s4.e((Math.signum(a5.f7259a) * a5.f7260b * AbstractC0736b.a(j6 > 0 ? j5 / j6 : 1.0f).f7272a) + a4, i2);
            i2++;
            str = str2;
        }
        String str3 = str;
        AbstractC0792s abstractC0792s5 = (AbstractC0792s) bVar.f4391j;
        if (abstractC0792s5 != null) {
            return function1.invoke(abstractC0792s5);
        }
        Intrinsics.g(str3);
        throw null;
    }

    @Override // l.InterfaceC0783i
    public long c() {
        return this.f6751a;
    }

    @Override // l.InterfaceC0783i
    public v0 d() {
        return (v0) this.f6753c;
    }

    @Override // l.InterfaceC0783i
    public Object e() {
        return this.f6758h;
    }

    @Override // l.InterfaceC0783i
    public AbstractC0792s g(long j4) {
        if (f(j4)) {
            return (AbstractC0792s) this.f6757g;
        }
        return ((Y0.b) this.f6752b).s(j4, (AbstractC0792s) this.f6755e, (AbstractC0792s) this.f6756f);
    }

    public ArrayList j(h2.d dVar, C0715e c0715e, o2.s sVar, y.t tVar) {
        l lVar = (l) c0715e.f7159d;
        if (sVar == null && lVar != null) {
            sVar = lVar.c(e.f6694j);
        }
        ArrayList arrayList = new ArrayList();
        c0715e.f7160e.C(new o(this, sVar, tVar, dVar, arrayList));
        if (lVar != null) {
            arrayList.addAll(lVar.a(dVar, tVar, sVar));
        }
        return arrayList;
    }

    public ArrayList k(h2.d dVar, C0715e c0715e, o2.s sVar, y.t tVar) {
        e eVar = (e) dVar.f6875c;
        if (eVar.isEmpty()) {
            return j(dVar, c0715e, sVar, tVar);
        }
        l lVar = (l) c0715e.f7159d;
        if (sVar == null && lVar != null) {
            sVar = lVar.c(e.f6694j);
        }
        ArrayList arrayList = new ArrayList();
        C0924c C3 = eVar.C();
        h2.d a4 = dVar.a(C3);
        C0715e c0715e2 = (C0715e) c0715e.f7160e.h(C3);
        if (c0715e2 != null && a4 != null) {
            arrayList.addAll(k(a4, c0715e2, sVar != null ? sVar.b(C3) : null, new y.t(((e) tVar.f11494e).j(C3), 25, (x) tVar.f11495i)));
        }
        if (lVar != null) {
            arrayList.addAll(lVar.a(dVar, tVar, sVar));
        }
        return arrayList;
    }

    public List l(e eVar, o2.s sVar) {
        return (List) ((C0231x) this.f6757g).a(new r(this, eVar, sVar));
    }

    public List o(l2.i iVar, w wVar, C0517a c0517a) {
        return (List) ((C0231x) this.f6757g).a(new m(this, iVar, wVar, c0517a, 1));
    }

    public t p(l2.i iVar) {
        return (t) ((HashMap) this.f6755e).get(iVar);
    }

    public s(d dVar, C0231x c0231x, g gVar) {
        this.f6751a = 1L;
        this.f6752b = C0715e.f7158j;
        x xVar = new x();
        xVar.f6771a = C0639b.f6677e;
        xVar.f6772b = new ArrayList();
        xVar.f6773c = -1L;
        this.f6753c = xVar;
        this.f6754d = new HashMap();
        this.f6755e = new HashMap();
        new HashSet();
        this.f6756f = gVar;
        this.f6757g = c0231x;
        this.f6758h = dVar.b("SyncTree");
    }
}
