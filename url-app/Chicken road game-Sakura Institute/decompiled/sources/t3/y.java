package t3;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public class y extends v implements Iterable, s6.a {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f8873s = 0;

    /* renamed from: o, reason: collision with root package name */
    public final i.h0 f8874o;

    /* renamed from: p, reason: collision with root package name */
    public int f8875p;

    /* renamed from: q, reason: collision with root package name */
    public String f8876q;

    /* renamed from: r, reason: collision with root package name */
    public String f8877r;

    public y(a0 a0Var) {
        super(a0Var);
        this.f8874o = new i.h0();
    }

    @Override // t3.v
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof y) || !super.equals(obj)) {
            return false;
        }
        i.h0 h0Var = this.f8874o;
        int e9 = h0Var.e();
        y yVar = (y) obj;
        i.h0 h0Var2 = yVar.f8874o;
        if (e9 != h0Var2.e() || this.f8875p != yVar.f8875p) {
            return false;
        }
        Iterator it = ((y6.a) y6.h.m(new d6.q(5, h0Var))).iterator();
        while (it.hasNext()) {
            v vVar = (v) it.next();
            if (!vVar.equals(h0Var2.b(vVar.f8862k))) {
                return false;
            }
        }
        return true;
    }

    @Override // t3.v
    public final t g(b1.b bVar) {
        return y(bVar, false, this);
    }

    @Override // t3.v
    public final int hashCode() {
        int i7 = this.f8875p;
        i.h0 h0Var = this.f8874o;
        int e9 = h0Var.e();
        for (int i8 = 0; i8 < e9; i8++) {
            i7 = (((i7 * 31) + h0Var.c(i8)) * 31) + ((v) h0Var.f(i8)).hashCode();
        }
        return i7;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new x(this);
    }

    @Override // t3.v
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        String str = this.f8877r;
        v w4 = (str == null || z6.h.G(str)) ? null : w(str, true);
        if (w4 == null) {
            w4 = x(this.f8875p, this, false);
        }
        sb.append(" startDestination=");
        if (w4 == null) {
            String str2 = this.f8877r;
            if (str2 != null) {
                sb.append(str2);
            } else {
                String str3 = this.f8876q;
                if (str3 != null) {
                    sb.append(str3);
                } else {
                    sb.append("0x" + Integer.toHexString(this.f8875p));
                }
            }
        } else {
            sb.append("{");
            sb.append(w4.toString());
            sb.append("}");
        }
        String sb2 = sb.toString();
        r6.k.e(sb2, "sb.toString()");
        return sb2;
    }

    public final v w(String str, boolean z8) {
        Object obj;
        y yVar;
        r6.k.f(str, "route");
        i.h0 h0Var = this.f8874o;
        r6.k.f(h0Var, "<this>");
        Iterator it = ((y6.a) y6.h.m(new d6.q(5, h0Var))).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            v vVar = (v) obj;
            if (z6.o.p(false, vVar.f8863l, str) || vVar.m(str) != null) {
                break;
            }
        }
        v vVar2 = (v) obj;
        if (vVar2 != null) {
            return vVar2;
        }
        if (!z8 || (yVar = this.f8858g) == null || z6.h.G(str)) {
            return null;
        }
        return yVar.w(str, true);
    }

    public final v x(int i7, y yVar, boolean z8) {
        i.h0 h0Var = this.f8874o;
        v vVar = (v) h0Var.b(i7);
        if (vVar != null) {
            return vVar;
        }
        if (z8) {
            Iterator it = ((y6.a) y6.h.m(new d6.q(5, h0Var))).iterator();
            while (true) {
                if (!it.hasNext()) {
                    vVar = null;
                    break;
                }
                v vVar2 = (v) it.next();
                vVar = (!(vVar2 instanceof y) || vVar2.equals(yVar)) ? null : ((y) vVar2).x(i7, this, true);
                if (vVar != null) {
                    break;
                }
            }
        }
        if (vVar != null) {
            return vVar;
        }
        y yVar2 = this.f8858g;
        if (yVar2 == null || yVar2.equals(yVar)) {
            return null;
        }
        y yVar3 = this.f8858g;
        r6.k.c(yVar3);
        return yVar3.x(i7, this, z8);
    }

    public final t y(b1.b bVar, boolean z8, y yVar) {
        t tVar;
        t g9 = super.g(bVar);
        ArrayList arrayList = new ArrayList();
        x xVar = new x(this);
        while (true) {
            if (!xVar.hasNext()) {
                break;
            }
            v vVar = (v) xVar.next();
            tVar = r6.k.a(vVar, yVar) ? null : vVar.g(bVar);
            if (tVar != null) {
                arrayList.add(tVar);
            }
        }
        t tVar2 = (t) e6.l.p0(arrayList);
        y yVar2 = this.f8858g;
        if (yVar2 != null && z8 && !yVar2.equals(yVar)) {
            tVar = yVar2.y(bVar, true, this);
        }
        return (t) e6.l.p0(e6.k.f0(new t[]{g9, tVar2, tVar}));
    }

    public final t z(String str, boolean z8, y yVar) {
        t tVar;
        t m8 = m(str);
        ArrayList arrayList = new ArrayList();
        x xVar = new x(this);
        while (true) {
            if (!xVar.hasNext()) {
                break;
            }
            v vVar = (v) xVar.next();
            tVar = r6.k.a(vVar, yVar) ? null : vVar instanceof y ? ((y) vVar).z(str, false, this) : vVar.m(str);
            if (tVar != null) {
                arrayList.add(tVar);
            }
        }
        t tVar2 = (t) e6.l.p0(arrayList);
        y yVar2 = this.f8858g;
        if (yVar2 != null && z8 && !yVar2.equals(yVar)) {
            tVar = yVar2.z(str, true, this);
        }
        return (t) e6.l.p0(e6.k.f0(new t[]{m8, tVar2, tVar}));
    }
}
