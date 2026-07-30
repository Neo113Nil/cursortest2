package s;

import androidx.lifecycle.r0;
import g0.g1;
import g0.n2;
import g0.p1;
import g0.t0;
import java.util.LinkedHashSet;
import java.util.Map;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class g0 implements p0.i, p0.c {

    /* renamed from: a, reason: collision with root package name */
    public final p0.j f8007a;

    /* renamed from: b, reason: collision with root package name */
    public final g1 f8008b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f8009c;

    public g0(p0.i iVar, Map map) {
        e0 e0Var = new e0(iVar, 0);
        n2 n2Var = p0.k.f7012a;
        this.f8007a = new p0.j(map, e0Var);
        this.f8008b = g0.d.J(null, t0.f3903k);
        this.f8009c = new LinkedHashSet();
    }

    @Override // p0.i
    public final boolean a(Object obj) {
        return this.f8007a.a(obj);
    }

    @Override // p0.i
    public final Object b(String str) {
        return this.f8007a.b(str);
    }

    @Override // p0.c
    public final void c(Object obj) {
        p0.c cVar = (p0.c) this.f8008b.getValue();
        if (cVar == null) {
            throw new IllegalArgumentException("null wrappedHolder");
        }
        cVar.c(obj);
    }

    @Override // p0.i
    public final b1.b d(String str, r0 r0Var) {
        return this.f8007a.d(str, r0Var);
    }

    @Override // p0.c
    public final void e(Object obj, o0.a aVar, g0.p pVar, int i7) {
        int i8;
        pVar.S(-697180401);
        if ((i7 & 6) == 0) {
            i8 = (pVar.h(obj) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= pVar.h(aVar) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i8 |= pVar.h(this) ? 256 : 128;
        }
        if ((i8 & 147) == 146 && pVar.x()) {
            pVar.L();
        } else {
            p0.c cVar = (p0.c) this.f8008b.getValue();
            if (cVar == null) {
                throw new IllegalArgumentException("null wrappedHolder");
            }
            cVar.e(obj, aVar, pVar, i8 & 126);
            boolean h3 = pVar.h(this) | pVar.h(obj);
            Object G = pVar.G();
            if (h3 || G == g0.l.f3784a) {
                G = new q.t0(this, 1, obj);
                pVar.a0(G);
            }
            g0.d.d(obj, (q6.c) G, pVar);
        }
        p1 r8 = pVar.r();
        if (r8 != null) {
            r8.f3853d = new a0.a(this, obj, aVar, i7, 7);
        }
    }
}
