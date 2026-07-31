package R5;

import J5.o;
import Q.m;
import T5.J;
import X5.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k5.C0477g;
import k5.C0481k;
import l5.AbstractC0506j;
import l5.AbstractC0508l;
import l5.C0512p;
import l5.s;
import l5.t;
import m1.AbstractC0521b;

/* loaded from: classes.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    public final String f2157a;

    /* renamed from: b, reason: collision with root package name */
    public final A3.c f2158b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2159c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f2160d;

    /* renamed from: e, reason: collision with root package name */
    public final e[] f2161e;

    /* renamed from: f, reason: collision with root package name */
    public final List[] f2162f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f2163g;

    /* renamed from: h, reason: collision with root package name */
    public final Map f2164h;

    /* renamed from: i, reason: collision with root package name */
    public final e[] f2165i;

    /* renamed from: j, reason: collision with root package name */
    public final C0481k f2166j;

    public f(String str, A3.c cVar, int i7, List list, a aVar) {
        this.f2157a = str;
        this.f2158b = cVar;
        this.f2159c = i7;
        ArrayList arrayList = aVar.f2142b;
        kotlin.jvm.internal.i.e(arrayList, "<this>");
        AbstractC0506j.O(arrayList, new HashSet(t.p0(AbstractC0508l.C(arrayList, 12))));
        int i8 = 0;
        this.f2160d = (String[]) arrayList.toArray(new String[0]);
        this.f2161e = J.b(aVar.f2144d);
        this.f2162f = (List[]) aVar.f2145e.toArray(new List[0]);
        ArrayList arrayList2 = aVar.f2146f;
        kotlin.jvm.internal.i.e(arrayList2, "<this>");
        boolean[] zArr = new boolean[arrayList2.size()];
        int size = arrayList2.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList2.get(i9);
            i9++;
            zArr[i8] = ((Boolean) obj).booleanValue();
            i8++;
        }
        this.f2163g = zArr;
        String[] strArr = this.f2160d;
        kotlin.jvm.internal.i.e(strArr, "<this>");
        E5.i iVar = new E5.i(1, new l(4, strArr));
        ArrayList arrayList3 = new ArrayList(AbstractC0508l.C(iVar, 10));
        Iterator it = iVar.iterator();
        while (true) {
            E5.b bVar = (E5.b) it;
            if (!bVar.f688g.hasNext()) {
                this.f2164h = t.t0(arrayList3);
                this.f2165i = J.b(list);
                this.f2166j = AbstractC0521b.x(new m(1, this));
                return;
            }
            s sVar = (s) bVar.next();
            arrayList3.add(new C0477g(sVar.f5307b, Integer.valueOf(sVar.f5306a)));
        }
    }

    @Override // R5.e
    public final int a(String name) {
        kotlin.jvm.internal.i.e(name, "name");
        Integer num = (Integer) this.f2164h.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // R5.e
    public final String b() {
        return this.f2157a;
    }

    @Override // R5.e
    public final A3.c c() {
        return this.f2158b;
    }

    @Override // R5.e
    public final int d() {
        return this.f2159c;
    }

    @Override // R5.e
    public final String e(int i7) {
        return this.f2160d[i7];
    }

    public final boolean equals(Object obj) {
        int i7;
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            e eVar = (e) obj;
            if (this.f2157a.equals(eVar.b()) && Arrays.equals(this.f2165i, ((f) obj).f2165i)) {
                int d7 = eVar.d();
                int i8 = this.f2159c;
                if (i8 == d7) {
                    for (0; i7 < i8; i7 + 1) {
                        e[] eVarArr = this.f2161e;
                        i7 = (kotlin.jvm.internal.i.a(eVarArr[i7].b(), eVar.h(i7).b()) && kotlin.jvm.internal.i.a(eVarArr[i7].c(), eVar.h(i7).c())) ? i7 + 1 : 0;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // R5.e
    public final List g(int i7) {
        return this.f2162f[i7];
    }

    @Override // R5.e
    public final List getAnnotations() {
        return C0512p.f5303f;
    }

    @Override // R5.e
    public final e h(int i7) {
        return this.f2161e[i7];
    }

    public final int hashCode() {
        return ((Number) this.f2166j.getValue()).intValue();
    }

    @Override // R5.e
    public final boolean i(int i7) {
        return this.f2163g[i7];
    }

    @Override // R5.e
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return AbstractC0506j.I(i6.g.B(0, this.f2159c), ", ", this.f2157a.concat("("), ")", new o(2, this), 24);
    }

    @Override // R5.e
    public final void f() {
    }
}
