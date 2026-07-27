package N4;

import F4.o;
import M.U;
import P4.I;
import T4.m;
import a.AbstractC0169a;
import f4.C0430g;
import f4.C0434k;
import g4.AbstractC0465j;
import g4.AbstractC0467l;
import g4.AbstractC0476u;
import g4.C0471p;
import g4.C0474s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import n2.AbstractC1341c;

/* loaded from: classes.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    public final String f2174a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1341c f2175b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2176c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f2177d;

    /* renamed from: e, reason: collision with root package name */
    public final e[] f2178e;

    /* renamed from: f, reason: collision with root package name */
    public final List[] f2179f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f2180g;

    /* renamed from: h, reason: collision with root package name */
    public final Map f2181h;

    /* renamed from: i, reason: collision with root package name */
    public final e[] f2182i;

    /* renamed from: j, reason: collision with root package name */
    public final C0434k f2183j;

    public f(String str, AbstractC1341c abstractC1341c, int i2, List list, a aVar) {
        this.f2174a = str;
        this.f2175b = abstractC1341c;
        this.f2176c = i2;
        ArrayList arrayList = aVar.f2159b;
        kotlin.jvm.internal.i.e(arrayList, "<this>");
        AbstractC0465j.Q0(arrayList, new HashSet(AbstractC0476u.W(AbstractC0467l.D0(arrayList, 12))));
        int i3 = 0;
        this.f2177d = (String[]) arrayList.toArray(new String[0]);
        this.f2178e = I.b(aVar.f2161d);
        this.f2179f = (List[]) aVar.f2162e.toArray(new List[0]);
        ArrayList arrayList2 = aVar.f2163f;
        kotlin.jvm.internal.i.e(arrayList2, "<this>");
        boolean[] zArr = new boolean[arrayList2.size()];
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            zArr[i3] = ((Boolean) it.next()).booleanValue();
            i3++;
        }
        this.f2180g = zArr;
        String[] strArr = this.f2177d;
        kotlin.jvm.internal.i.e(strArr, "<this>");
        A4.i iVar = new A4.i(1, new m(4, strArr));
        ArrayList arrayList3 = new ArrayList(AbstractC0467l.D0(iVar, 10));
        Iterator it2 = iVar.iterator();
        while (true) {
            A4.b bVar = (A4.b) it2;
            if (!bVar.f85b.hasNext()) {
                this.f2181h = AbstractC0476u.c0(arrayList3);
                this.f2182i = I.b(list);
                this.f2183j = AbstractC0169a.A(new U(1, this));
                return;
            }
            C0474s c0474s = (C0474s) bVar.next();
            arrayList3.add(new C0430g(c0474s.f5754b, Integer.valueOf(c0474s.f5753a)));
        }
    }

    @Override // N4.e
    public final int a(String name) {
        kotlin.jvm.internal.i.e(name, "name");
        Integer num = (Integer) this.f2181h.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // N4.e
    public final String b() {
        return this.f2174a;
    }

    @Override // N4.e
    public final AbstractC1341c c() {
        return this.f2175b;
    }

    @Override // N4.e
    public final int d() {
        return this.f2176c;
    }

    @Override // N4.e
    public final String e(int i2) {
        return this.f2177d[i2];
    }

    public final boolean equals(Object obj) {
        int i2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            e eVar = (e) obj;
            if (this.f2174a.equals(eVar.b()) && Arrays.equals(this.f2182i, ((f) obj).f2182i)) {
                int d6 = eVar.d();
                int i3 = this.f2176c;
                if (i3 == d6) {
                    for (0; i2 < i3; i2 + 1) {
                        e[] eVarArr = this.f2178e;
                        i2 = (kotlin.jvm.internal.i.a(eVarArr[i2].b(), eVar.h(i2).b()) && kotlin.jvm.internal.i.a(eVarArr[i2].c(), eVar.h(i2).c())) ? i2 + 1 : 0;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // N4.e
    public final List g(int i2) {
        return this.f2179f[i2];
    }

    @Override // N4.e
    public final List getAnnotations() {
        return C0471p.f5750a;
    }

    @Override // N4.e
    public final e h(int i2) {
        return this.f2178e[i2];
    }

    public final int hashCode() {
        return ((Number) this.f2183j.getValue()).intValue();
    }

    @Override // N4.e
    public final boolean i(int i2) {
        return this.f2180g[i2];
    }

    @Override // N4.e
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return AbstractC0465j.K0(K1.b.s0(0, this.f2176c), ", ", this.f2174a.concat("("), ")", new o(4, this), 24);
    }

    @Override // N4.e
    public final void f() {
    }
}
