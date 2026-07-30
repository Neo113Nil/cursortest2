package l1;

import r1.l1;
import r1.q1;
import s1.f1;
import s1.h0;
import w.g0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class p extends s0.n implements q1, l1, r1.k {

    /* renamed from: s, reason: collision with root package name */
    public boolean f5824s;

    @Override // r1.l1
    public final void A(j jVar, k kVar, long j8) {
        if (kVar == k.f5816g) {
            int i7 = jVar.f5814c;
            if (i7 == 4) {
                this.f5824s = true;
                B0();
            } else if (i7 == 5) {
                C0();
            }
        }
    }

    public final void A0() {
        a aVar = g0.f9239b;
        r6.v vVar = new r6.v();
        r1.f.w(this, new o(0, vVar));
        s sVar = (s) r1.f.i(this, f1.f8230s);
        if (sVar != null) {
            h0.f8239a.a(((s1.o) sVar).f8332a, aVar);
        }
    }

    public final void B0() {
        r6.r rVar = new r6.r();
        rVar.f7964f = true;
        r1.f.x(this, new n(rVar));
        if (rVar.f7964f) {
            A0();
        }
    }

    public final void C0() {
        d6.z zVar;
        s sVar;
        if (this.f5824s) {
            this.f5824s = false;
            if (this.f8116r) {
                r6.v vVar = new r6.v();
                r1.f.w(this, new m(vVar, 0, (byte) 0));
                p pVar = (p) vVar.f7968f;
                if (pVar != null) {
                    pVar.A0();
                    zVar = d6.z.f2639a;
                } else {
                    zVar = null;
                }
                if (zVar != null || (sVar = (s) r1.f.i(this, f1.f8230s)) == null) {
                    return;
                }
                r.f5826a.getClass();
                h0.f8239a.a(((s1.o) sVar).f8332a, t.f5827a);
            }
        }
    }

    @Override // r1.l1
    public final void a0() {
        C0();
    }

    @Override // r1.q1
    public final /* bridge */ /* synthetic */ Object o() {
        return "androidx.compose.ui.input.pointer.PointerHoverIcon";
    }

    @Override // s0.n
    public final void t0() {
        C0();
    }
}
