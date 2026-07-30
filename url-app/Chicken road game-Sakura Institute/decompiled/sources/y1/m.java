package y1;

import e6.u;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p1.s0;
import r1.a1;
import r1.d0;
import s1.l0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final s0.n f9837a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f9838b;

    /* renamed from: c, reason: collision with root package name */
    public final d0 f9839c;

    /* renamed from: d, reason: collision with root package name */
    public final i f9840d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f9841e;

    /* renamed from: f, reason: collision with root package name */
    public m f9842f;

    /* renamed from: g, reason: collision with root package name */
    public final int f9843g;

    public m(s0.n nVar, boolean z8, d0 d0Var, i iVar) {
        this.f9837a = nVar;
        this.f9838b = z8;
        this.f9839c = d0Var;
        this.f9840d = iVar;
        this.f9843g = d0Var.f7720g;
    }

    public static /* synthetic */ List h(m mVar, int i7) {
        return mVar.g((i7 & 1) != 0 ? !mVar.f9838b : false, (i7 & 2) == 0);
    }

    public final m a(f fVar, q6.c cVar) {
        i iVar = new i();
        iVar.f9833g = false;
        iVar.f9834h = false;
        cVar.f(iVar);
        m mVar = new m(new l(cVar), false, new d0(this.f9843g + (fVar != null ? 1000000000 : 2000000000), true), iVar);
        mVar.f9841e = true;
        mVar.f9842f = this;
        return mVar;
    }

    public final void b(d0 d0Var, ArrayList arrayList) {
        i0.d u8 = d0Var.u();
        int i7 = u8.f4842h;
        if (i7 > 0) {
            Object[] objArr = u8.f4840f;
            int i8 = 0;
            do {
                d0 d0Var2 = (d0) objArr[i8];
                if (d0Var2.E() && !d0Var2.I) {
                    if (d0Var2.A.f(8)) {
                        arrayList.add(u3.q.b(d0Var2, this.f9838b));
                    } else {
                        b(d0Var2, arrayList);
                    }
                }
                i8++;
            } while (i8 < i7);
        }
    }

    public final a1 c() {
        if (this.f9841e) {
            m j8 = j();
            if (j8 != null) {
                return j8.c();
            }
            return null;
        }
        r1.l h3 = u3.q.h(this.f9839c);
        if (h3 == null) {
            h3 = this.f9837a;
        }
        return r1.f.r(h3, 8);
    }

    public final void d(ArrayList arrayList) {
        List o2 = o(false);
        int size = o2.size();
        for (int i7 = 0; i7 < size; i7++) {
            m mVar = (m) o2.get(i7);
            if (mVar.l()) {
                arrayList.add(mVar);
            } else if (!mVar.f9840d.f9834h) {
                mVar.d(arrayList);
            }
        }
    }

    public final y0.d e() {
        a1 c4 = c();
        if (c4 != null) {
            if (!c4.M0().f8116r) {
                c4 = null;
            }
            if (c4 != null) {
                return s0.f(c4).h(c4, true);
            }
        }
        return y0.d.f9779e;
    }

    public final y0.d f() {
        a1 c4 = c();
        if (c4 != null) {
            if (!c4.M0().f8116r) {
                c4 = null;
            }
            if (c4 != null) {
                return s0.e(c4);
            }
        }
        return y0.d.f9779e;
    }

    public final List g(boolean z8, boolean z9) {
        if (!z8 && this.f9840d.f9834h) {
            return u.f2826f;
        }
        if (!l()) {
            return o(z9);
        }
        ArrayList arrayList = new ArrayList();
        d(arrayList);
        return arrayList;
    }

    public final i i() {
        boolean l8 = l();
        i iVar = this.f9840d;
        if (!l8) {
            return iVar;
        }
        i iVar2 = new i();
        iVar2.f9833g = iVar.f9833g;
        iVar2.f9834h = iVar.f9834h;
        iVar2.f9832f.putAll(iVar.f9832f);
        n(iVar2);
        return iVar2;
    }

    public final m j() {
        d0 d0Var;
        m mVar = this.f9842f;
        if (mVar != null) {
            return mVar;
        }
        d0 d0Var2 = this.f9839c;
        boolean z8 = this.f9838b;
        if (z8) {
            d0Var = d0Var2.s();
            while (d0Var != null) {
                i o2 = d0Var.o();
                if (o2 != null && o2.f9833g) {
                    break;
                }
                d0Var = d0Var.s();
            }
        }
        d0Var = null;
        if (d0Var == null) {
            d0 s5 = d0Var2.s();
            while (true) {
                if (s5 == null) {
                    d0Var = null;
                    break;
                }
                if (s5.A.f(8)) {
                    d0Var = s5;
                    break;
                }
                s5 = s5.s();
            }
        }
        if (d0Var == null) {
            return null;
        }
        return u3.q.b(d0Var, z8);
    }

    public final i k() {
        return this.f9840d;
    }

    public final boolean l() {
        return this.f9838b && this.f9840d.f9833g;
    }

    public final boolean m() {
        if (this.f9841e || !h(this, 4).isEmpty()) {
            return false;
        }
        d0 s5 = this.f9839c.s();
        while (true) {
            if (s5 == null) {
                s5 = null;
                break;
            }
            i o2 = s5.o();
            if (o2 != null && o2.f9833g) {
                break;
            }
            s5 = s5.s();
        }
        return s5 == null;
    }

    public final void n(i iVar) {
        if (this.f9840d.f9834h) {
            return;
        }
        List o2 = o(false);
        int size = o2.size();
        for (int i7 = 0; i7 < size; i7++) {
            m mVar = (m) o2.get(i7);
            if (!mVar.l()) {
                i iVar2 = mVar.f9840d;
                LinkedHashMap linkedHashMap = iVar.f9832f;
                for (Map.Entry entry : iVar2.f9832f.entrySet()) {
                    s sVar = (s) entry.getKey();
                    Object value = entry.getValue();
                    Object obj = linkedHashMap.get(sVar);
                    r6.k.d(sVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
                    Object d8 = sVar.f9888b.d(obj, value);
                    if (d8 != null) {
                        linkedHashMap.put(sVar, d8);
                    }
                }
                mVar.n(iVar);
            }
        }
    }

    public final List o(boolean z8) {
        if (this.f9841e) {
            return u.f2826f;
        }
        ArrayList arrayList = new ArrayList();
        b(this.f9839c, arrayList);
        if (z8) {
            i iVar = this.f9840d;
            LinkedHashMap linkedHashMap = iVar.f9832f;
            Object obj = linkedHashMap.get(p.f9877s);
            if (obj == null) {
                obj = null;
            }
            f fVar = (f) obj;
            if (fVar != null && iVar.f9833g && !arrayList.isEmpty()) {
                arrayList.add(a(fVar, new l0(14, fVar)));
            }
            s sVar = p.f9859a;
            if (linkedHashMap.containsKey(sVar) && !arrayList.isEmpty() && iVar.f9833g) {
                Object obj2 = linkedHashMap.get(sVar);
                if (obj2 == null) {
                    obj2 = null;
                }
                List list = (List) obj2;
                String str = list != null ? (String) e6.l.i0(list) : null;
                if (str != null) {
                    arrayList.add(0, a(null, new d0.k(str, 2)));
                }
            }
        }
        return arrayList;
    }
}
