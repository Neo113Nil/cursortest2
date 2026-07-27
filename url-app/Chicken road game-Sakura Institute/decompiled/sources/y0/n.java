package y0;

import D.C0144k;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n.AbstractC0864b;
import p0.AbstractC0960V;
import r0.AbstractC1065f;
import r0.E;
import r0.InterfaceC1072m;
import r0.a0;
import s0.C1160o0;
import z2.C1403G;
import z2.C1405I;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final S.n f11584a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f11585b;

    /* renamed from: c, reason: collision with root package name */
    public final E f11586c;

    /* renamed from: d, reason: collision with root package name */
    public final i f11587d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f11588e;

    /* renamed from: f, reason: collision with root package name */
    public n f11589f;

    /* renamed from: g, reason: collision with root package name */
    public final int f11590g;

    public n(S.n nVar, boolean z4, E e4, i iVar) {
        this.f11584a = nVar;
        this.f11585b = z4;
        this.f11586c = e4;
        this.f11587d = iVar;
        this.f11590g = e4.f9595e;
    }

    public static /* synthetic */ List h(n nVar, boolean z4, int i2) {
        boolean z5 = (i2 & 1) != 0 ? !nVar.f11585b : false;
        if ((i2 & 2) != 0) {
            z4 = false;
        }
        return nVar.g(z5, z4, false);
    }

    public final n a(f fVar, Function1 function1) {
        i iVar = new i();
        iVar.f11577e = false;
        iVar.f11578i = false;
        function1.invoke(iVar);
        n nVar = new n(new l(function1), false, new E(this.f11590g + (fVar != null ? 1000000000 : 2000000000), true), iVar);
        nVar.f11588e = true;
        nVar.f11589f = this;
        return nVar;
    }

    public final void b(E e4, ArrayList arrayList, boolean z4) {
        I.d u4 = e4.u();
        int i2 = u4.f3332i;
        if (i2 > 0) {
            Object[] objArr = u4.f3330d;
            int i4 = 0;
            do {
                E e5 = (E) objArr[i4];
                if (e5.D() && (z4 || !e5.f9591J)) {
                    if (e5.B.f(8)) {
                        arrayList.add(AbstractC0864b.h(e5, this.f11585b));
                    } else {
                        b(e5, arrayList, z4);
                    }
                }
                i4++;
            } while (i4 < i2);
        }
    }

    public final a0 c() {
        if (this.f11588e) {
            n j4 = j();
            if (j4 != null) {
                return j4.c();
            }
            return null;
        }
        InterfaceC1072m v4 = AbstractC0864b.v(this.f11586c);
        if (v4 == null) {
            v4 = this.f11584a;
        }
        return AbstractC1065f.t(v4, 8);
    }

    public final void d(List list) {
        List o4 = o(false, false);
        int size = o4.size();
        for (int i2 = 0; i2 < size; i2++) {
            n nVar = (n) o4.get(i2);
            if (nVar.l()) {
                list.add(nVar);
            } else if (!nVar.f11587d.f11578i) {
                nVar.d(list);
            }
        }
    }

    public final Y.d e() {
        a0 c4 = c();
        if (c4 != null) {
            if (!c4.O0().f3990s) {
                c4 = null;
            }
            if (c4 != null) {
                return AbstractC0960V.g(c4).n(c4, true);
            }
        }
        return Y.d.f4373e;
    }

    public final Y.d f() {
        a0 c4 = c();
        if (c4 != null) {
            if (!c4.O0().f3990s) {
                c4 = null;
            }
            if (c4 != null) {
                return AbstractC0960V.e(c4);
            }
        }
        return Y.d.f4373e;
    }

    public final List g(boolean z4, boolean z5, boolean z6) {
        if (!z4 && this.f11587d.f11578i) {
            return C1405I.f11931d;
        }
        if (!l()) {
            return o(z5, z6);
        }
        ArrayList arrayList = new ArrayList();
        d(arrayList);
        return arrayList;
    }

    public final i i() {
        boolean l4 = l();
        i iVar = this.f11587d;
        if (!l4) {
            return iVar;
        }
        i iVar2 = new i();
        iVar2.f11577e = iVar.f11577e;
        iVar2.f11578i = iVar.f11578i;
        iVar2.f11576d.putAll(iVar.f11576d);
        n(iVar2);
        return iVar2;
    }

    public final n j() {
        E e4;
        n nVar = this.f11589f;
        if (nVar != null) {
            return nVar;
        }
        E e5 = this.f11586c;
        boolean z4 = this.f11585b;
        if (z4) {
            m mVar = m.f11581e;
            e4 = e5.s();
            while (e4 != null) {
                if (((Boolean) mVar.invoke(e4)).booleanValue()) {
                    break;
                }
                e4 = e4.s();
            }
        }
        e4 = null;
        if (e4 == null) {
            m mVar2 = m.f11582i;
            E s4 = e5.s();
            while (true) {
                if (s4 == null) {
                    e4 = null;
                    break;
                }
                if (((Boolean) mVar2.invoke(s4)).booleanValue()) {
                    e4 = s4;
                    break;
                }
                s4 = s4.s();
            }
        }
        if (e4 == null) {
            return null;
        }
        return AbstractC0864b.h(e4, z4);
    }

    public final i k() {
        return this.f11587d;
    }

    public final boolean l() {
        return this.f11585b && this.f11587d.f11577e;
    }

    public final boolean m() {
        if (!this.f11588e && h(this, true, 4).isEmpty()) {
            E s4 = this.f11586c.s();
            while (true) {
                if (s4 != null) {
                    i o4 = s4.o();
                    if (o4 != null && o4.f11577e) {
                        break;
                    }
                    s4 = s4.s();
                } else {
                    s4 = null;
                    break;
                }
            }
            if (s4 == null) {
                return true;
            }
        }
        return false;
    }

    public final void n(i iVar) {
        if (this.f11587d.f11578i) {
            return;
        }
        List o4 = o(false, false);
        int size = o4.size();
        for (int i2 = 0; i2 < size; i2++) {
            n nVar = (n) o4.get(i2);
            if (!nVar.l()) {
                for (Map.Entry entry : nVar.f11587d.f11576d.entrySet()) {
                    t tVar = (t) entry.getKey();
                    Object value = entry.getValue();
                    LinkedHashMap linkedHashMap = iVar.f11576d;
                    Object obj = linkedHashMap.get(tVar);
                    Intrinsics.d(tVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
                    Object h4 = tVar.f11641b.h(obj, value);
                    if (h4 != null) {
                        linkedHashMap.put(tVar, h4);
                    }
                }
                nVar.n(iVar);
            }
        }
    }

    public final List o(boolean z4, boolean z5) {
        if (this.f11588e) {
            return C1405I.f11931d;
        }
        ArrayList arrayList = new ArrayList();
        b(this.f11586c, arrayList, z5);
        if (z4) {
            t tVar = q.f11630s;
            i iVar = this.f11587d;
            LinkedHashMap linkedHashMap = iVar.f11576d;
            Object obj = linkedHashMap.get(tVar);
            if (obj == null) {
                obj = null;
            }
            f fVar = (f) obj;
            if (fVar != null && iVar.f11577e && !arrayList.isEmpty()) {
                arrayList.add(a(fVar, new C1160o0(12, fVar)));
            }
            t tVar2 = q.f11612a;
            if (linkedHashMap.containsKey(tVar2) && !arrayList.isEmpty() && iVar.f11577e) {
                Object obj2 = linkedHashMap.get(tVar2);
                if (obj2 == null) {
                    obj2 = null;
                }
                List list = (List) obj2;
                String str = list != null ? (String) C1403G.r(list) : null;
                if (str != null) {
                    arrayList.add(0, a(null, new C0144k(str, 3)));
                }
            }
        }
        return arrayList;
    }
}
