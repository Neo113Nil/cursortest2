package m;

import android.view.KeyEvent;
import java.util.Iterator;
import java.util.LinkedHashMap;
import r1.l1;
import r1.n1;
import r1.q1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public class q extends r1.m implements l1, j1.d, x0.c, n1, q1 {
    public static final t0 L = new t0(2);
    public final z B;
    public l1.d0 C;
    public r1.l D;
    public p.l E;
    public p.f F;
    public p.j I;
    public boolean J;
    public final t0 K;

    /* renamed from: u, reason: collision with root package name */
    public p.j f6231u;

    /* renamed from: v, reason: collision with root package name */
    public l0 f6232v;

    /* renamed from: w, reason: collision with root package name */
    public String f6233w;

    /* renamed from: x, reason: collision with root package name */
    public y1.f f6234x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f6235y;

    /* renamed from: z, reason: collision with root package name */
    public q6.a f6236z;
    public final x A = new x();
    public final LinkedHashMap G = new LinkedHashMap();
    public long H = 0;

    public q(p.j jVar, l0 l0Var, boolean z8, String str, y1.f fVar, q6.a aVar) {
        this.f6231u = jVar;
        this.f6232v = l0Var;
        this.f6233w = str;
        this.f6234x = fVar;
        this.f6235y = z8;
        this.f6236z = aVar;
        this.B = new z(jVar);
        p.j jVar2 = this.f6231u;
        this.I = jVar2;
        this.J = jVar2 == null && this.f6232v != null;
        this.K = L;
    }

    @Override // r1.l1
    public final void A(l1.j jVar, l1.k kVar, long j8) {
        long j9 = ((j8 >> 33) << 32) | (((j8 << 32) >> 33) & 4294967295L);
        this.H = u3.r.a((int) (j9 >> 32), (int) (j9 & 4294967295L));
        F0();
        h6.d dVar = null;
        if (this.f6235y && kVar == l1.k.f5816g) {
            int i7 = jVar.f5814c;
            if (i7 == 4) {
                c7.a0.p(o0(), null, null, new d(this, dVar, 0), 3);
            } else if (i7 == 5) {
                c7.a0.p(o0(), null, null, new d(this, dVar, 1), 3);
            }
        }
        if (this.C == null) {
            a0.e0 e0Var = new a0.e0(this, dVar, 17);
            l1.j jVar2 = l1.a0.f5772a;
            l1.d0 d0Var = new l1.d0(null, null, e0Var);
            A0(d0Var);
            this.C = d0Var;
        }
        l1.d0 d0Var2 = this.C;
        if (d0Var2 != null) {
            d0Var2.A(jVar, kVar, j8);
        }
    }

    public final void E0() {
        p.j jVar = this.f6231u;
        LinkedHashMap linkedHashMap = this.G;
        if (jVar != null) {
            p.l lVar = this.E;
            if (lVar != null) {
                jVar.c(new p.k(lVar));
            }
            p.f fVar = this.F;
            if (fVar != null) {
                jVar.c(new p.g(fVar));
            }
            Iterator it = linkedHashMap.values().iterator();
            while (it.hasNext()) {
                jVar.c(new p.k((p.l) it.next()));
            }
        }
        this.E = null;
        this.F = null;
        linkedHashMap.clear();
    }

    public final void F0() {
        l0 l0Var;
        if (this.D == null && (l0Var = this.f6232v) != null) {
            if (this.f6231u == null) {
                this.f6231u = new p.j();
            }
            this.B.D0(this.f6231u);
            p.j jVar = this.f6231u;
            r6.k.c(jVar);
            r1.l a3 = l0Var.a(jVar);
            A0(a3);
            this.D = a3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0076, code lost:
    
        if (r3.D == null) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G0(p.j jVar, l0 l0Var, boolean z8, String str, y1.f fVar, q6.a aVar) {
        boolean z9;
        r1.l lVar;
        boolean z10 = true;
        boolean z11 = false;
        if (r6.k.a(this.I, jVar)) {
            z9 = false;
        } else {
            E0();
            this.I = jVar;
            this.f6231u = jVar;
            z9 = true;
        }
        if (!r6.k.a(this.f6232v, l0Var)) {
            this.f6232v = l0Var;
            z9 = true;
        }
        boolean z12 = this.f6235y;
        z zVar = this.B;
        if (z12 != z8) {
            r1.l lVar2 = this.A;
            if (z8) {
                A0(lVar2);
                A0(zVar);
            } else {
                B0(lVar2);
                B0(zVar);
                E0();
            }
            r1.f.o(this);
            this.f6235y = z8;
        }
        if (!r6.k.a(this.f6233w, str)) {
            this.f6233w = str;
            r1.f.o(this);
        }
        if (!r6.k.a(this.f6234x, fVar)) {
            this.f6234x = fVar;
            r1.f.o(this);
        }
        this.f6236z = aVar;
        boolean z13 = this.J;
        p.j jVar2 = this.I;
        if (z13 != (jVar2 == null && this.f6232v != null)) {
            if (jVar2 == null && this.f6232v != null) {
                z11 = true;
            }
            this.J = z11;
            if (!z11) {
            }
        }
        z10 = z9;
        if (z10 && ((lVar = this.D) != null || !this.J)) {
            if (lVar != null) {
                B0(lVar);
            }
            this.D = null;
            F0();
        }
        zVar.D0(this.f6231u);
    }

    @Override // j1.d
    public final boolean O(KeyEvent keyEvent) {
        int Y;
        F0();
        boolean z8 = this.f6235y;
        LinkedHashMap linkedHashMap = this.G;
        if (z8) {
            int i7 = r.f6240b;
            if (j1.c.e0(keyEvent) == 2 && ((Y = (int) (j1.c.Y(keyEvent) >> 32)) == 23 || Y == 66 || Y == 160)) {
                if (!linkedHashMap.containsKey(new j1.a(r4.a.d(keyEvent.getKeyCode())))) {
                    p.l lVar = new p.l(this.H);
                    linkedHashMap.put(new j1.a(r4.a.d(keyEvent.getKeyCode())), lVar);
                    if (this.f6231u != null) {
                        c7.a0.p(o0(), null, null, new c(this, lVar, null, 0), 3);
                    }
                    return true;
                }
                return false;
            }
        }
        if (this.f6235y) {
            int i8 = r.f6240b;
            if (j1.c.e0(keyEvent) == 1) {
                int Y2 = (int) (j1.c.Y(keyEvent) >> 32);
                if (Y2 != 23 && Y2 != 66 && Y2 != 160) {
                    return false;
                }
                p.l lVar2 = (p.l) linkedHashMap.remove(new j1.a(r4.a.d(keyEvent.getKeyCode())));
                if (lVar2 != null && this.f6231u != null) {
                    c7.a0.p(o0(), null, null, new c(this, lVar2, null, 1), 3);
                }
                this.f6236z.a();
                return true;
            }
        }
        return false;
    }

    @Override // r1.n1
    public final void S(y1.i iVar) {
        y1.f fVar = this.f6234x;
        if (fVar != null) {
            y1.r.d(iVar, fVar.f9803a);
        }
        String str = this.f6233w;
        androidx.lifecycle.r0 r0Var = new androidx.lifecycle.r0(19, this);
        x6.e[] eVarArr = y1.r.f9886a;
        iVar.m(y1.h.f9807b, new y1.a(str, r0Var));
        if (this.f6235y) {
            this.B.S(iVar);
        } else {
            iVar.m(y1.p.f9867i, d6.z.f2639a);
        }
        D0(iVar);
    }

    @Override // r1.l1
    public final void a0() {
        p.f fVar;
        p.j jVar = this.f6231u;
        if (jVar != null && (fVar = this.F) != null) {
            jVar.c(new p.g(fVar));
        }
        this.F = null;
        l1.d0 d0Var = this.C;
        if (d0Var != null) {
            d0Var.a0();
        }
    }

    @Override // r1.n1
    public final boolean e0() {
        return true;
    }

    @Override // j1.d
    public final boolean l(KeyEvent keyEvent) {
        return false;
    }

    @Override // x0.c
    public final void m0(x0.q qVar) {
        if (qVar.a()) {
            F0();
        }
        if (this.f6235y) {
            this.B.m0(qVar);
        }
    }

    @Override // r1.q1
    public final Object o() {
        return this.K;
    }

    @Override // s0.n
    public final boolean p0() {
        return false;
    }

    @Override // s0.n
    public final void s0() {
        if (!this.J) {
            F0();
        }
        if (this.f6235y) {
            A0(this.A);
            A0(this.B);
        }
    }

    @Override // s0.n
    public final void t0() {
        E0();
        if (this.I == null) {
            this.f6231u = null;
        }
        r1.l lVar = this.D;
        if (lVar != null) {
            B0(lVar);
        }
        this.D = null;
    }

    public void D0(y1.i iVar) {
    }
}
