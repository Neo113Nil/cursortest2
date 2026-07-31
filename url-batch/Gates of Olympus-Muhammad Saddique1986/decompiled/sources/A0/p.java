package A0;

import a0.C0239d;
import e2.InterfaceC0424c;
import h2.AbstractC0508a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import r0.AbstractC0898U;
import t0.AbstractC0993f;
import t0.E;
import t0.InterfaceC0999l;
import t0.b0;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final U.p f139a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f140b;

    /* renamed from: c, reason: collision with root package name */
    public final E f141c;

    /* renamed from: d, reason: collision with root package name */
    public final i f142d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f143e;

    /* renamed from: f, reason: collision with root package name */
    public p f144f;

    /* renamed from: g, reason: collision with root package name */
    public final int f145g;

    public p(U.p pVar, boolean z3, E e3, i iVar) {
        this.f139a = pVar;
        this.f140b = z3;
        this.f141c = e3;
        this.f142d = iVar;
        this.f145g = e3.f8541e;
    }

    public static /* synthetic */ List h(p pVar, boolean z3, int i3) {
        boolean z4 = (i3 & 1) != 0 ? !pVar.f140b : false;
        if ((i3 & 2) != 0) {
            z3 = false;
        }
        return pVar.g(z4, z3, false);
    }

    public final p a(f fVar, InterfaceC0424c interfaceC0424c) {
        i iVar = new i();
        iVar.f130e = false;
        iVar.f131f = false;
        interfaceC0424c.n(iVar);
        p pVar = new p(new n(interfaceC0424c), false, new E(this.f145g + (fVar != null ? 1000000000 : 2000000000), true), iVar);
        pVar.f143e = true;
        pVar.f144f = this;
        return pVar;
    }

    public final void b(E e3, ArrayList arrayList, boolean z3) {
        K.d u3 = e3.u();
        int i3 = u3.f3216f;
        if (i3 > 0) {
            Object[] objArr = u3.f3214d;
            int i4 = 0;
            do {
                E e4 = (E) objArr[i4];
                if (e4.D() && (z3 || !e4.f8537G)) {
                    if (e4.f8561y.f(8)) {
                        arrayList.add(AbstractC0508a.j(e4, this.f140b));
                    } else {
                        b(e4, arrayList, z3);
                    }
                }
                i4++;
            } while (i4 < i3);
        }
    }

    public final b0 c() {
        if (this.f143e) {
            p j3 = j();
            if (j3 != null) {
                return j3.c();
            }
            return null;
        }
        InterfaceC0999l G3 = AbstractC0508a.G(this.f141c);
        if (G3 == null) {
            G3 = this.f139a;
        }
        return AbstractC0993f.r(G3, 8);
    }

    public final void d(List list) {
        List o3 = o(false, false);
        int size = o3.size();
        for (int i3 = 0; i3 < size; i3++) {
            p pVar = (p) o3.get(i3);
            if (pVar.l()) {
                list.add(pVar);
            } else if (!pVar.f142d.f131f) {
                pVar.d(list);
            }
        }
    }

    public final C0239d e() {
        b0 c2 = c();
        if (c2 != null) {
            if (!c2.K0().f4501p) {
                c2 = null;
            }
            if (c2 != null) {
                return AbstractC0898U.g(c2).B(c2, true);
            }
        }
        return C0239d.f4723e;
    }

    public final C0239d f() {
        b0 c2 = c();
        if (c2 != null) {
            if (!c2.K0().f4501p) {
                c2 = null;
            }
            if (c2 != null) {
                return AbstractC0898U.e(c2);
            }
        }
        return C0239d.f4723e;
    }

    public final List g(boolean z3, boolean z4, boolean z5) {
        if (!z3 && this.f142d.f131f) {
            return S1.u.f4320d;
        }
        if (!l()) {
            return o(z4, z5);
        }
        ArrayList arrayList = new ArrayList();
        d(arrayList);
        return arrayList;
    }

    public final i i() {
        boolean l3 = l();
        i iVar = this.f142d;
        if (!l3) {
            return iVar;
        }
        i iVar2 = new i();
        iVar2.f130e = iVar.f130e;
        iVar2.f131f = iVar.f131f;
        iVar2.f129d.putAll(iVar.f129d);
        n(iVar2);
        return iVar2;
    }

    public final p j() {
        E e3;
        p pVar = this.f144f;
        if (pVar != null) {
            return pVar;
        }
        E e4 = this.f141c;
        boolean z3 = this.f140b;
        if (z3) {
            o oVar = o.f138e;
            e3 = e4.s();
            while (e3 != null) {
                if (((Boolean) oVar.n(e3)).booleanValue()) {
                    break;
                }
                e3 = e3.s();
            }
        }
        e3 = null;
        if (e3 == null) {
            E s3 = e4.s();
            while (true) {
                if (s3 == null) {
                    e3 = null;
                    break;
                }
                if (s3.f8561y.f(8)) {
                    e3 = s3;
                    break;
                }
                s3 = s3.s();
            }
        }
        if (e3 == null) {
            return null;
        }
        return AbstractC0508a.j(e3, z3);
    }

    public final i k() {
        return this.f142d;
    }

    public final boolean l() {
        return this.f140b && this.f142d.f130e;
    }

    public final boolean m() {
        if (!this.f143e && h(this, true, 4).isEmpty()) {
            E s3 = this.f141c.s();
            while (true) {
                if (s3 != null) {
                    i o3 = s3.o();
                    if (o3 != null && o3.f130e) {
                        break;
                    }
                    s3 = s3.s();
                } else {
                    s3 = null;
                    break;
                }
            }
            if (s3 == null) {
                return true;
            }
        }
        return false;
    }

    public final void n(i iVar) {
        if (this.f142d.f131f) {
            return;
        }
        List o3 = o(false, false);
        int size = o3.size();
        for (int i3 = 0; i3 < size; i3++) {
            p pVar = (p) o3.get(i3);
            if (!pVar.l()) {
                for (Map.Entry entry : pVar.f142d.f129d.entrySet()) {
                    v vVar = (v) entry.getKey();
                    Object value = entry.getValue();
                    LinkedHashMap linkedHashMap = iVar.f129d;
                    Object obj = linkedHashMap.get(vVar);
                    f2.j.d(vVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
                    Object h3 = vVar.f195b.h(obj, value);
                    if (h3 != null) {
                        linkedHashMap.put(vVar, h3);
                    }
                }
                pVar.n(iVar);
            }
        }
    }

    public final List o(boolean z3, boolean z4) {
        if (this.f143e) {
            return S1.u.f4320d;
        }
        ArrayList arrayList = new ArrayList();
        b(this.f141c, arrayList, z4);
        if (z3) {
            v vVar = s.f184s;
            i iVar = this.f142d;
            LinkedHashMap linkedHashMap = iVar.f129d;
            Object obj = linkedHashMap.get(vVar);
            if (obj == null) {
                obj = null;
            }
            f fVar = (f) obj;
            if (fVar != null && iVar.f130e && !arrayList.isEmpty()) {
                arrayList.add(a(fVar, new l(0, fVar)));
            }
            v vVar2 = s.f166a;
            if (linkedHashMap.containsKey(vVar2) && !arrayList.isEmpty() && iVar.f130e) {
                Object obj2 = linkedHashMap.get(vVar2);
                if (obj2 == null) {
                    obj2 = null;
                }
                List list = (List) obj2;
                String str = list != null ? (String) S1.l.L0(list) : null;
                if (str != null) {
                    arrayList.add(0, a(null, new m(str, 0)));
                }
            }
        }
        return arrayList;
    }
}
