package y;

import a2.h0;
import a2.j0;
import android.graphics.Rect;
import androidx.lifecycle.g0;
import c7.a0;
import c7.m1;
import f7.e0;
import f7.f0;
import java.lang.ref.WeakReference;
import s1.f1;
import s1.g1;
import s1.h2;
import s1.l0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d implements g2.r {

    /* renamed from: a, reason: collision with root package name */
    public q f9709a;

    /* renamed from: b, reason: collision with root package name */
    public m1 f9710b;

    /* renamed from: c, reason: collision with root package name */
    public u f9711c;

    /* renamed from: d, reason: collision with root package name */
    public e0 f9712d;

    @Override // g2.r
    public final void a(g2.w wVar, g2.q qVar, h0 h0Var, l0 l0Var, y0.d dVar, y0.d dVar2) {
        u uVar = this.f9711c;
        if (uVar != null) {
            r rVar = uVar.f9759m;
            synchronized (rVar.f9730c) {
                try {
                    rVar.f9737j = wVar;
                    rVar.f9739l = qVar;
                    rVar.f9738k = h0Var;
                    rVar.f9740m = dVar;
                    rVar.f9741n = dVar2;
                    if (!rVar.f9732e) {
                        if (rVar.f9731d) {
                        }
                    }
                    rVar.a();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // g2.r
    public final void b(y0.d dVar) {
        Rect rect;
        u uVar = this.f9711c;
        if (uVar != null) {
            uVar.f9758l = new Rect(t6.a.O(dVar.f9780a), t6.a.O(dVar.f9781b), t6.a.O(dVar.f9782c), t6.a.O(dVar.f9783d));
            if (!uVar.f9756j.isEmpty() || (rect = uVar.f9758l) == null) {
                return;
            }
            uVar.f9747a.requestRectangleOnScreen(new Rect(rect));
        }
    }

    @Override // g2.r
    public final void c(g2.w wVar, g2.w wVar2) {
        u uVar = this.f9711c;
        if (uVar != null) {
            boolean z8 = (j0.a(uVar.f9754h.f4066b, wVar2.f4066b) && r6.k.a(uVar.f9754h.f4067c, wVar2.f4067c)) ? false : true;
            uVar.f9754h = wVar2;
            int size = uVar.f9756j.size();
            for (int i7 = 0; i7 < size; i7++) {
                w wVar3 = (w) ((WeakReference) uVar.f9756j.get(i7)).get();
                if (wVar3 != null) {
                    wVar3.f9767g = wVar2;
                }
            }
            r rVar = uVar.f9759m;
            synchronized (rVar.f9730c) {
                rVar.f9737j = null;
                rVar.f9739l = null;
                rVar.f9738k = null;
                rVar.f9740m = null;
                rVar.f9741n = null;
            }
            if (r6.k.a(wVar, wVar2)) {
                if (z8) {
                    p pVar = uVar.f9748b;
                    int e9 = j0.e(wVar2.f4066b);
                    int d8 = j0.d(wVar2.f4066b);
                    j0 j0Var = uVar.f9754h.f4067c;
                    int e10 = j0Var != null ? j0.e(j0Var.f408a) : -1;
                    j0 j0Var2 = uVar.f9754h.f4067c;
                    pVar.a().updateSelection(pVar.f9723b, e9, d8, e10, j0Var2 != null ? j0.d(j0Var2.f408a) : -1);
                    return;
                }
                return;
            }
            if (wVar != null && (!r6.k.a(wVar.f4065a.f373f, wVar2.f4065a.f373f) || (j0.a(wVar.f4066b, wVar2.f4066b) && !r6.k.a(wVar.f4067c, wVar2.f4067c)))) {
                p pVar2 = uVar.f9748b;
                pVar2.a().restartInput(pVar2.f9723b);
                return;
            }
            int size2 = uVar.f9756j.size();
            for (int i8 = 0; i8 < size2; i8++) {
                w wVar4 = (w) ((WeakReference) uVar.f9756j.get(i8)).get();
                if (wVar4 != null) {
                    g2.w wVar5 = uVar.f9754h;
                    p pVar3 = uVar.f9748b;
                    if (wVar4.f9771k) {
                        wVar4.f9767g = wVar5;
                        if (wVar4.f9769i) {
                            pVar3.a().updateExtractedText(pVar3.f9723b, wVar4.f9768h, v0.d.c(wVar5));
                        }
                        j0 j0Var3 = wVar5.f4067c;
                        long j8 = wVar5.f4066b;
                        int e11 = j0Var3 != null ? j0.e(j0Var3.f408a) : -1;
                        j0 j0Var4 = wVar5.f4067c;
                        pVar3.a().updateSelection(pVar3.f9723b, j0.e(j8), j0.d(j8), e11, j0Var4 != null ? j0.d(j0Var4.f408a) : -1);
                    }
                }
            }
        }
    }

    @Override // g2.r
    public final void d(g2.w wVar, g2.m mVar, c.h hVar, w.p pVar) {
        j(new p2.f(wVar, this, mVar, hVar, pVar, 3));
    }

    @Override // g2.r
    public final void e() {
        j(null);
    }

    @Override // g2.r
    public final void f() {
        h2 h2Var;
        q qVar = this.f9709a;
        if (qVar == null || (h2Var = (h2) r1.f.i(qVar, f1.f8225n)) == null) {
            return;
        }
        ((g1) h2Var).b();
    }

    @Override // g2.r
    public final void g() {
        h2 h2Var;
        q qVar = this.f9709a;
        if (qVar == null || (h2Var = (h2) r1.f.i(qVar, f1.f8225n)) == null) {
            return;
        }
        ((g1) h2Var).a();
    }

    @Override // g2.r
    public final void h() {
        m1 m1Var = this.f9710b;
        if (m1Var != null) {
            m1Var.c(null);
        }
        this.f9710b = null;
        f7.w i7 = i();
        if (i7 != null) {
            ((e0) i7).h();
        }
    }

    public final f7.w i() {
        e0 a3;
        e0 e0Var = this.f9712d;
        if (e0Var != null) {
            return e0Var;
        }
        if (!x.b.f9592a) {
            return null;
        }
        a3 = f0.a((r2 & 1) != 0 ? 0 : 1, (r2 & 2) == 0 ? 16 : 0, e7.a.f2835h);
        this.f9712d = a3;
        return a3;
    }

    public final void j(p2.f fVar) {
        q qVar = this.f9709a;
        if (qVar == null) {
            return;
        }
        m1 m1Var = null;
        g0 g0Var = new g0(fVar, this, qVar, m1Var, 13);
        if (qVar.f8116r) {
            m1Var = a0.p(qVar.o0(), null, c7.y.f1759i, new b(qVar, g0Var, m1Var, 2), 1);
        }
        this.f9710b = m1Var;
    }

    public final void k(q qVar) {
        if (this.f9709a == qVar) {
            this.f9709a = null;
            return;
        }
        throw new IllegalStateException(("Expected textInputModifierNode to be " + qVar + " but was " + this.f9709a).toString());
    }
}
