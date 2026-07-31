package t1;

import g2.InterfaceC0439a;
import j.C0525G;
import java.util.ArrayList;
import java.util.Iterator;
import m2.C0651a;
import n2.AbstractC0730j;
import n2.AbstractC0737q;

/* loaded from: classes.dex */
public class x extends u implements Iterable, InterfaceC0439a {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f8947q = 0;

    /* renamed from: m, reason: collision with root package name */
    public final C0525G f8948m;

    /* renamed from: n, reason: collision with root package name */
    public int f8949n;

    /* renamed from: o, reason: collision with root package name */
    public String f8950o;

    /* renamed from: p, reason: collision with root package name */
    public String f8951p;

    public x(z zVar) {
        super(zVar);
        this.f8948m = new C0525G();
    }

    @Override // t1.u
    public final s c(G1.m mVar) {
        return k(mVar, false, this);
    }

    @Override // t1.u
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof x)) {
            return false;
        }
        if (super.equals(obj)) {
            C0525G c0525g = this.f8948m;
            int e3 = c0525g.e();
            x xVar = (x) obj;
            C0525G c0525g2 = xVar.f8948m;
            if (e3 == c0525g2.e() && this.f8949n == xVar.f8949n) {
                Iterator it = ((C0651a) m2.h.R(new R1.p(6, c0525g))).iterator();
                while (it.hasNext()) {
                    u uVar = (u) it.next();
                    if (!uVar.equals(c0525g2.b(uVar.f8936i))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // t1.u
    public final int hashCode() {
        int i3 = this.f8949n;
        C0525G c0525g = this.f8948m;
        int e3 = c0525g.e();
        for (int i4 = 0; i4 < e3; i4++) {
            i3 = (((i3 * 31) + c0525g.c(i4)) * 31) + ((u) c0525g.f(i4)).hashCode();
        }
        return i3;
    }

    public final u i(String str, boolean z3) {
        Object obj;
        x xVar;
        f2.j.f(str, "route");
        C0525G c0525g = this.f8948m;
        f2.j.f(c0525g, "<this>");
        Iterator it = ((C0651a) m2.h.R(new R1.p(6, c0525g))).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            u uVar = (u) obj;
            if (AbstractC0737q.s(uVar.f8937j, str, false) || uVar.d(str) != null) {
                break;
            }
        }
        u uVar2 = (u) obj;
        if (uVar2 != null) {
            return uVar2;
        }
        if (!z3 || (xVar = this.f8932e) == null || AbstractC0730j.K(str)) {
            return null;
        }
        return xVar.i(str, true);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new w(this);
    }

    public final u j(int i3, x xVar, boolean z3) {
        C0525G c0525g = this.f8948m;
        u uVar = (u) c0525g.b(i3);
        if (uVar != null) {
            return uVar;
        }
        if (z3) {
            Iterator it = ((C0651a) m2.h.R(new R1.p(6, c0525g))).iterator();
            while (true) {
                if (!it.hasNext()) {
                    uVar = null;
                    break;
                }
                u uVar2 = (u) it.next();
                uVar = (!(uVar2 instanceof x) || f2.j.a(uVar2, xVar)) ? null : ((x) uVar2).j(i3, this, true);
                if (uVar != null) {
                    break;
                }
            }
        }
        if (uVar != null) {
            return uVar;
        }
        x xVar2 = this.f8932e;
        if (xVar2 == null || xVar2.equals(xVar)) {
            return null;
        }
        x xVar3 = this.f8932e;
        f2.j.c(xVar3);
        return xVar3.j(i3, this, z3);
    }

    public final s k(G1.m mVar, boolean z3, x xVar) {
        s sVar;
        s c2 = super.c(mVar);
        ArrayList arrayList = new ArrayList();
        w wVar = new w(this);
        while (true) {
            if (!wVar.hasNext()) {
                break;
            }
            u uVar = (u) wVar.next();
            sVar = f2.j.a(uVar, xVar) ? null : uVar.c(mVar);
            if (sVar != null) {
                arrayList.add(sVar);
            }
        }
        s sVar2 = (s) S1.l.S0(arrayList);
        x xVar2 = this.f8932e;
        if (xVar2 != null && z3 && !xVar2.equals(xVar)) {
            sVar = xVar2.k(mVar, true, this);
        }
        return (s) S1.l.S0(S1.m.B0(c2, sVar2, sVar));
    }

    public final s l(String str, boolean z3, x xVar) {
        s sVar;
        s d3 = d(str);
        ArrayList arrayList = new ArrayList();
        w wVar = new w(this);
        while (true) {
            if (!wVar.hasNext()) {
                break;
            }
            u uVar = (u) wVar.next();
            sVar = f2.j.a(uVar, xVar) ? null : uVar instanceof x ? ((x) uVar).l(str, false, this) : uVar.d(str);
            if (sVar != null) {
                arrayList.add(sVar);
            }
        }
        s sVar2 = (s) S1.l.S0(arrayList);
        x xVar2 = this.f8932e;
        if (xVar2 != null && z3 && !xVar2.equals(xVar)) {
            sVar = xVar2.l(str, true, this);
        }
        return (s) S1.l.S0(S1.m.B0(d3, sVar2, sVar));
    }

    @Override // t1.u
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        String str = this.f8951p;
        u i3 = (str == null || AbstractC0730j.K(str)) ? null : i(str, true);
        if (i3 == null) {
            i3 = j(this.f8949n, this, false);
        }
        sb.append(" startDestination=");
        if (i3 == null) {
            String str2 = this.f8951p;
            if (str2 != null) {
                sb.append(str2);
            } else {
                String str3 = this.f8950o;
                if (str3 != null) {
                    sb.append(str3);
                } else {
                    sb.append("0x" + Integer.toHexString(this.f8949n));
                }
            }
        } else {
            sb.append("{");
            sb.append(i3.toString());
            sb.append("}");
        }
        String sb2 = sb.toString();
        f2.j.e(sb2, "sb.toString()");
        return sb2;
    }
}
