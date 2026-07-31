package q1;

import D1.C0014b;
import a2.InterfaceC0184a;
import g2.C0405a;
import h2.AbstractC0447i;
import h2.AbstractC0454p;
import j.C0481G;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class z extends w implements Iterable, InterfaceC0184a {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f6978q = 0;

    /* renamed from: m, reason: collision with root package name */
    public final C0481G f6979m;

    /* renamed from: n, reason: collision with root package name */
    public int f6980n;

    /* renamed from: o, reason: collision with root package name */
    public String f6981o;
    public String p;

    public z(C0774C c0774c) {
        super(c0774c);
        this.f6979m = new C0481G();
    }

    @Override // q1.w
    public final u c(C0014b c0014b) {
        return k(c0014b, false, this);
    }

    @Override // q1.w
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof z)) {
            return false;
        }
        if (super.equals(obj)) {
            C0481G c0481g = this.f6979m;
            int e3 = c0481g.e();
            z zVar = (z) obj;
            C0481G c0481g2 = zVar.f6979m;
            if (e3 == c0481g2.e() && this.f6980n == zVar.f6980n) {
                Iterator it = ((C0405a) g2.h.a0(new L1.q(6, c0481g))).iterator();
                while (it.hasNext()) {
                    w wVar = (w) it.next();
                    if (!wVar.equals(c0481g2.b(wVar.f6967i))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // q1.w
    public final int hashCode() {
        int i3 = this.f6980n;
        C0481G c0481g = this.f6979m;
        int e3 = c0481g.e();
        for (int i4 = 0; i4 < e3; i4++) {
            i3 = (((i3 * 31) + c0481g.c(i4)) * 31) + ((w) c0481g.f(i4)).hashCode();
        }
        return i3;
    }

    public final w i(String str, boolean z3) {
        Object obj;
        z zVar;
        Z1.i.f(str, "route");
        C0481G c0481g = this.f6979m;
        Z1.i.f(c0481g, "<this>");
        Iterator it = ((C0405a) g2.h.a0(new L1.q(6, c0481g))).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            w wVar = (w) obj;
            if (AbstractC0454p.d0(wVar.f6968j, str, false) || wVar.d(str) != null) {
                break;
            }
        }
        w wVar2 = (w) obj;
        if (wVar2 != null) {
            return wVar2;
        }
        if (!z3 || (zVar = this.f6963e) == null || AbstractC0447i.t0(str)) {
            return null;
        }
        return zVar.i(str, true);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new y(this);
    }

    public final w j(int i3, z zVar, boolean z3) {
        C0481G c0481g = this.f6979m;
        w wVar = (w) c0481g.b(i3);
        if (wVar != null) {
            return wVar;
        }
        if (z3) {
            Iterator it = ((C0405a) g2.h.a0(new L1.q(6, c0481g))).iterator();
            while (true) {
                if (!it.hasNext()) {
                    wVar = null;
                    break;
                }
                w wVar2 = (w) it.next();
                wVar = (!(wVar2 instanceof z) || Z1.i.a(wVar2, zVar)) ? null : ((z) wVar2).j(i3, this, true);
                if (wVar != null) {
                    break;
                }
            }
        }
        if (wVar != null) {
            return wVar;
        }
        z zVar2 = this.f6963e;
        if (zVar2 == null || zVar2.equals(zVar)) {
            return null;
        }
        z zVar3 = this.f6963e;
        Z1.i.c(zVar3);
        return zVar3.j(i3, this, z3);
    }

    public final u k(C0014b c0014b, boolean z3, z zVar) {
        u uVar;
        u c3 = super.c(c0014b);
        ArrayList arrayList = new ArrayList();
        y yVar = new y(this);
        while (true) {
            if (!yVar.hasNext()) {
                break;
            }
            w wVar = (w) yVar.next();
            uVar = Z1.i.a(wVar, zVar) ? null : wVar.c(c0014b);
            if (uVar != null) {
                arrayList.add(uVar);
            }
        }
        u uVar2 = (u) M1.l.u0(arrayList);
        z zVar2 = this.f6963e;
        if (zVar2 != null && z3 && !zVar2.equals(zVar)) {
            uVar = zVar2.k(c0014b, true, this);
        }
        return (u) M1.l.u0(M1.m.d0(c3, uVar2, uVar));
    }

    public final u l(String str, boolean z3, z zVar) {
        u uVar;
        Z1.i.f(str, "route");
        u d3 = d(str);
        ArrayList arrayList = new ArrayList();
        y yVar = new y(this);
        while (true) {
            if (!yVar.hasNext()) {
                break;
            }
            w wVar = (w) yVar.next();
            uVar = Z1.i.a(wVar, zVar) ? null : wVar instanceof z ? ((z) wVar).l(str, false, this) : wVar.d(str);
            if (uVar != null) {
                arrayList.add(uVar);
            }
        }
        u uVar2 = (u) M1.l.u0(arrayList);
        z zVar2 = this.f6963e;
        if (zVar2 != null && z3 && !zVar2.equals(zVar)) {
            uVar = zVar2.l(str, true, this);
        }
        return (u) M1.l.u0(M1.m.d0(d3, uVar2, uVar));
    }

    @Override // q1.w
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        String str = this.p;
        w i3 = (str == null || AbstractC0447i.t0(str)) ? null : i(str, true);
        if (i3 == null) {
            i3 = j(this.f6980n, this, false);
        }
        sb.append(" startDestination=");
        if (i3 == null) {
            String str2 = this.p;
            if (str2 != null) {
                sb.append(str2);
            } else {
                String str3 = this.f6981o;
                if (str3 != null) {
                    sb.append(str3);
                } else {
                    sb.append("0x" + Integer.toHexString(this.f6980n));
                }
            }
        } else {
            sb.append("{");
            sb.append(i3.toString());
            sb.append("}");
        }
        String sb2 = sb.toString();
        Z1.i.e(sb2, "sb.toString()");
        return sb2;
    }
}
