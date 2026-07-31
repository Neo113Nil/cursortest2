package z0;

import F.Z;
import M1.u;
import e2.AbstractC0381e;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import r0.M;
import t.x;
import t0.AbstractC0898f;
import t0.D;
import t0.InterfaceC0904l;
import t0.a0;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final U.k f8988a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f8989b;

    /* renamed from: c, reason: collision with root package name */
    public final D f8990c;

    /* renamed from: d, reason: collision with root package name */
    public final i f8991d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8992e;

    /* renamed from: f, reason: collision with root package name */
    public n f8993f;

    /* renamed from: g, reason: collision with root package name */
    public final int f8994g;

    public n(U.k kVar, boolean z3, D d3, i iVar) {
        this.f8988a = kVar;
        this.f8989b = z3;
        this.f8990c = d3;
        this.f8991d = iVar;
        this.f8994g = d3.f7717e;
    }

    public static /* synthetic */ List h(n nVar, boolean z3, int i3) {
        boolean z4 = (i3 & 1) != 0 ? !nVar.f8989b : false;
        if ((i3 & 2) != 0) {
            z3 = false;
        }
        return nVar.g(z4, z3, false);
    }

    public final n a(f fVar, Y1.c cVar) {
        i iVar = new i();
        iVar.f8983e = false;
        iVar.f8984f = false;
        cVar.j(iVar);
        n nVar = new n(new l(cVar), false, new D(this.f8994g + (fVar != null ? 1000000000 : 2000000000), true), iVar);
        nVar.f8992e = true;
        nVar.f8993f = this;
        return nVar;
    }

    public final void b(D d3, ArrayList arrayList, boolean z3) {
        K.d s3 = d3.s();
        int i3 = s3.f2642f;
        if (i3 > 0) {
            Object[] objArr = s3.f2640d;
            int i4 = 0;
            do {
                D d4 = (D) objArr[i4];
                if (d4.B() && (z3 || !d4.f7713F)) {
                    if (d4.f7735x.f(8)) {
                        arrayList.add(AbstractC0381e.g(d4, this.f8989b));
                    } else {
                        b(d4, arrayList, z3);
                    }
                }
                i4++;
            } while (i4 < i3);
        }
    }

    public final a0 c() {
        if (this.f8992e) {
            n j3 = j();
            if (j3 != null) {
                return j3.c();
            }
            return null;
        }
        InterfaceC0904l E3 = AbstractC0381e.E(this.f8990c);
        if (E3 == null) {
            E3 = this.f8988a;
        }
        return AbstractC0898f.r(E3, 8);
    }

    public final void d(List list) {
        List o3 = o(false, false);
        int size = o3.size();
        for (int i3 = 0; i3 < size; i3++) {
            n nVar = (n) o3.get(i3);
            if (nVar.l()) {
                list.add(nVar);
            } else if (!nVar.f8991d.f8984f) {
                nVar.d(list);
            }
        }
    }

    public final a0.d e() {
        a0 c3 = c();
        if (c3 != null) {
            if (!c3.B0().p) {
                c3 = null;
            }
            if (c3 != null) {
                return M.g(c3).u(c3, true);
            }
        }
        return a0.d.f3490e;
    }

    public final a0.d f() {
        a0 c3 = c();
        if (c3 != null) {
            if (!c3.B0().p) {
                c3 = null;
            }
            if (c3 != null) {
                return M.e(c3);
            }
        }
        return a0.d.f3490e;
    }

    public final List g(boolean z3, boolean z4, boolean z5) {
        if (!z3 && this.f8991d.f8984f) {
            return u.f2803d;
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
        i iVar = this.f8991d;
        if (!l3) {
            return iVar;
        }
        i iVar2 = new i();
        iVar2.f8983e = iVar.f8983e;
        iVar2.f8984f = iVar.f8984f;
        iVar2.f8982d.putAll(iVar.f8982d);
        n(iVar2);
        return iVar2;
    }

    public final n j() {
        D d3;
        n nVar = this.f8993f;
        if (nVar != null) {
            return nVar;
        }
        D d4 = this.f8990c;
        boolean z3 = this.f8989b;
        if (z3) {
            m mVar = m.f8987e;
            d3 = d4.q();
            while (d3 != null) {
                if (((Boolean) mVar.j(d3)).booleanValue()) {
                    break;
                }
                d3 = d3.q();
            }
        }
        d3 = null;
        if (d3 == null) {
            D q2 = d4.q();
            while (true) {
                if (q2 == null) {
                    d3 = null;
                    break;
                }
                if (q2.f7735x.f(8)) {
                    d3 = q2;
                    break;
                }
                q2 = q2.q();
            }
        }
        if (d3 == null) {
            return null;
        }
        return AbstractC0381e.g(d3, z3);
    }

    public final i k() {
        return this.f8991d;
    }

    public final boolean l() {
        return this.f8989b && this.f8991d.f8983e;
    }

    public final boolean m() {
        if (!this.f8992e && h(this, true, 4).isEmpty()) {
            D q2 = this.f8990c.q();
            while (true) {
                if (q2 != null) {
                    i n3 = q2.n();
                    if (n3 != null && n3.f8983e) {
                        break;
                    }
                    q2 = q2.q();
                } else {
                    q2 = null;
                    break;
                }
            }
            if (q2 == null) {
                return true;
            }
        }
        return false;
    }

    public final void n(i iVar) {
        if (this.f8991d.f8984f) {
            return;
        }
        List o3 = o(false, false);
        int size = o3.size();
        for (int i3 = 0; i3 < size; i3++) {
            n nVar = (n) o3.get(i3);
            if (!nVar.l()) {
                for (Map.Entry entry : nVar.f8991d.f8982d.entrySet()) {
                    t tVar = (t) entry.getKey();
                    Object value = entry.getValue();
                    LinkedHashMap linkedHashMap = iVar.f8982d;
                    Object obj = linkedHashMap.get(tVar);
                    Z1.i.d(tVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
                    Object g3 = tVar.f9038b.g(obj, value);
                    if (g3 != null) {
                        linkedHashMap.put(tVar, g3);
                    }
                }
                nVar.n(iVar);
            }
        }
    }

    public final List o(boolean z3, boolean z4) {
        if (this.f8992e) {
            return u.f2803d;
        }
        ArrayList arrayList = new ArrayList();
        b(this.f8990c, arrayList, z4);
        if (z3) {
            t tVar = q.f9026r;
            i iVar = this.f8991d;
            LinkedHashMap linkedHashMap = iVar.f8982d;
            Object obj = linkedHashMap.get(tVar);
            if (obj == null) {
                obj = null;
            }
            f fVar = (f) obj;
            if (fVar != null && iVar.f8983e && !arrayList.isEmpty()) {
                arrayList.add(a(fVar, new x(11, fVar)));
            }
            t tVar2 = q.f9010a;
            if (linkedHashMap.containsKey(tVar2) && !arrayList.isEmpty() && iVar.f8983e) {
                Object obj2 = linkedHashMap.get(tVar2);
                if (obj2 == null) {
                    obj2 = null;
                }
                List list = (List) obj2;
                String str = list != null ? (String) M1.l.n0(list) : null;
                if (str != null) {
                    arrayList.add(0, a(null, new Z(str, 2)));
                }
            }
        }
        return arrayList;
    }
}
