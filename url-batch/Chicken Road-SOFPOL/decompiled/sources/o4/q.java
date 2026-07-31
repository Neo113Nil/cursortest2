package o4;

import a0.g1;
import java.util.ArrayList;
import java.util.Iterator;
import o.u0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public class q extends o implements Iterable, r6.a {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f5679j = 0;
    public final h4.j i;

    public q(s sVar) {
        super(sVar);
        this.i = new h4.j(this);
    }

    @Override // o4.o
    public final n c(g1 g1Var) {
        n c8 = super.c(g1Var);
        h4.j jVar = this.i;
        jVar.getClass();
        return jVar.o(c8, g1Var, false, (q) jVar.f3190c);
    }

    public final n e(g1 g1Var, o oVar) {
        return this.i.o(super.c(g1Var), g1Var, true, oVar);
    }

    @Override // o4.o
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof q) || !super.equals(obj)) {
            return false;
        }
        h4.j jVar = this.i;
        int f6 = ((u0) jVar.f3191d).f();
        h4.j jVar2 = ((q) obj).i;
        if (f6 != ((u0) jVar2.f3191d).f() || jVar.f3189b != jVar2.f3189b) {
            return false;
        }
        u0 u0Var = (u0) jVar.f3191d;
        q6.i.e(u0Var, "<this>");
        Iterator it = ((x6.a) x6.g.a0(new d6.b(1, u0Var))).iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            if (!oVar.equals(((u0) jVar2.f3191d).c(oVar.f5671e.f4348a))) {
                return false;
            }
        }
        return true;
    }

    public final n f(String str, boolean z3, o oVar) {
        n nVar;
        q6.i.e(str, "route");
        h4.j jVar = this.i;
        jVar.getClass();
        q qVar = (q) jVar.f3190c;
        n e8 = qVar.f5671e.e(str);
        ArrayList arrayList = new ArrayList();
        Iterator it = qVar.iterator();
        while (true) {
            r4.i iVar = (r4.i) it;
            nVar = null;
            if (!iVar.hasNext()) {
                break;
            }
            o oVar2 = (o) iVar.next();
            if (!q6.i.a(oVar2, oVar)) {
                if (oVar2 instanceof q) {
                    nVar = ((q) oVar2).f(str, false, qVar);
                } else {
                    oVar2.getClass();
                    nVar = oVar2.f5671e.e(str);
                }
            }
            if (nVar != null) {
                arrayList.add(nVar);
            }
        }
        n nVar2 = (n) d6.m.Z(arrayList);
        q qVar2 = qVar.f5672f;
        if (qVar2 != null && z3 && !qVar2.equals(oVar)) {
            nVar = qVar2.f(str, true, qVar);
        }
        return (n) d6.m.Z(d6.l.N(new n[]{e8, nVar2, nVar}));
    }

    @Override // o4.o
    public final int hashCode() {
        h4.j jVar = this.i;
        int i = jVar.f3189b;
        u0 u0Var = (u0) jVar.f3191d;
        int f6 = u0Var.f();
        for (int i8 = 0; i8 < f6; i8++) {
            i = (((i * 31) + u0Var.d(i8)) * 31) + ((o) u0Var.g(i8)).hashCode();
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        h4.j jVar = this.i;
        jVar.getClass();
        return new r4.i(jVar);
    }

    @Override // o4.o
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        h4.j jVar = this.i;
        String str = (String) jVar.f3193f;
        jVar.getClass();
        o k3 = (str == null || y6.j.e0(str)) ? null : jVar.k(str, true);
        if (k3 == null) {
            k3 = jVar.j(jVar.f3189b);
        }
        sb.append(" startDestination=");
        if (k3 == null) {
            String str2 = (String) jVar.f3193f;
            if (str2 != null) {
                sb.append(str2);
            } else {
                String str3 = (String) jVar.f3192e;
                if (str3 != null) {
                    sb.append(str3);
                } else {
                    sb.append("0x" + Integer.toHexString(jVar.f3189b));
                }
            }
        } else {
            sb.append("{");
            sb.append(k3.toString());
            sb.append("}");
        }
        String sb2 = sb.toString();
        q6.i.d(sb2, "toString(...)");
        return sb2;
    }
}
