package i0;

import a1.n;
import a3.t;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.i0;
import c2.l;
import c2.u;
import c6.s;
import d1.k;
import ge.a0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import k1.p;
import kotlin.collections.y;
import s.d0;
import te.a1;
import z.j;
import z4.m;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a extends k implements c2.h, l, u {
    public final z.f C;
    public final boolean D;
    public final float E;
    public final d9.c F;
    public final j0.e G;
    public b7.h H;
    public float I;
    public boolean K;
    public d M;
    public e N;
    public long J = 0;
    public final d0 L = new d0();

    public a(z.f fVar, boolean z10, float f3, d9.c cVar, j0.e eVar) {
        this.C = fVar;
        this.D = z10;
        this.E = f3;
        this.F = cVar;
        this.G = eVar;
    }

    @Override // d1.k
    public final void A() {
        a0.s(w(), null, new t(this, (ld.a) null, 9), 3);
    }

    @Override // d1.k
    public final void B() {
        d dVar = this.M;
        if (dVar != null) {
            this.N = null;
            c2.k.l(this);
            s sVar = dVar.f4562r;
            e eVar = (e) ((LinkedHashMap) sVar.f1868d).get(this);
            if (eVar != null) {
                eVar.c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) sVar.f1868d;
                e eVar2 = (e) linkedHashMap.get(this);
                if (eVar2 != null) {
                }
                linkedHashMap.remove(this);
                dVar.f4561i.add(eVar);
            }
        }
    }

    public final void I(j jVar) {
        e eVar;
        if (!(jVar instanceof z.h)) {
            if (jVar instanceof z.i) {
                e eVar2 = this.N;
                if (eVar2 != null) {
                    eVar2.d();
                    return;
                }
                return;
            }
            if (!(jVar instanceof z.g) || (eVar = this.N) == null) {
                return;
            }
            eVar.d();
            return;
        }
        z.h hVar = (z.h) jVar;
        long j = this.J;
        float f3 = this.I;
        d dVar = this.M;
        if (dVar == null) {
            Object obj = (View) c2.k.h(this, AndroidCompositionLocals_androidKt.f469f);
            while (!(obj instanceof ViewGroup)) {
                Object parent = ((View) obj).getParent();
                if (!(parent instanceof View)) {
                    a1.c(obj, ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?", "Couldn't find a valid parent for ");
                    return;
                }
                obj = parent;
            }
            ViewGroup viewGroup = (ViewGroup) obj;
            int childCount = viewGroup.getChildCount();
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    d dVar2 = new d(viewGroup.getContext());
                    viewGroup.addView(dVar2);
                    dVar = dVar2;
                    break;
                } else {
                    View childAt = viewGroup.getChildAt(i3);
                    if (childAt instanceof d) {
                        dVar = (d) childAt;
                        break;
                    }
                    i3++;
                }
            }
            this.M = dVar;
        }
        ArrayList arrayList = dVar.f4560e;
        s sVar = dVar.f4562r;
        LinkedHashMap linkedHashMap = (LinkedHashMap) sVar.f1868d;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) sVar.f1868d;
        LinkedHashMap linkedHashMap3 = (LinkedHashMap) sVar.f1869e;
        e eVar3 = (e) linkedHashMap.get(this);
        if (eVar3 == null) {
            ArrayList arrayList2 = dVar.f4561i;
            arrayList2.getClass();
            eVar3 = (e) (arrayList2.isEmpty() ? null : arrayList2.remove(0));
            if (eVar3 == null) {
                if (dVar.f4563s > y.e(arrayList)) {
                    eVar3 = new e(dVar.getContext());
                    dVar.addView(eVar3);
                    arrayList.add(eVar3);
                } else {
                    eVar3 = (e) arrayList.get(dVar.f4563s);
                    a aVar = (a) linkedHashMap3.get(eVar3);
                    if (aVar != null) {
                        aVar.N = null;
                        c2.k.l(aVar);
                        e eVar4 = (e) linkedHashMap2.get(aVar);
                        if (eVar4 != null) {
                        }
                        linkedHashMap2.remove(aVar);
                        eVar3.c();
                    }
                }
                int i10 = dVar.f4563s;
                if (i10 < dVar.f4559d - 1) {
                    dVar.f4563s = i10 + 1;
                } else {
                    dVar.f4563s = 0;
                }
            }
            linkedHashMap2.put(this, eVar3);
            linkedHashMap3.put(eVar3, this);
        }
        e eVar5 = eVar3;
        int a9 = yd.c.a(f3);
        long o6 = this.F.o();
        this.G.invoke();
        eVar5.b(hVar, this.D, j, a9, o6, new a1.b(12, this));
        this.N = eVar5;
        c2.k.l(this);
    }

    @Override // c2.u
    public final void e(long j) {
        float n10;
        this.K = true;
        x2.c cVar = c2.k.u(this).L;
        this.J = m.b(j);
        float f3 = this.E;
        if (Float.isNaN(f3)) {
            long j3 = this.J;
            float f10 = c.f4558a;
            float intBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L));
            n10 = j1.b.b((Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32)) / 2.0f;
            if (this.D) {
                n10 += cVar.n(c.f4558a);
            }
        } else {
            n10 = cVar.n(f3);
        }
        this.I = n10;
        d0 d0Var = this.L;
        Object[] objArr = d0Var.f8284a;
        int i3 = d0Var.f8285b;
        for (int i10 = 0; i10 < i3; i10++) {
            I((j) objArr[i10]);
        }
        d0Var.d();
    }

    @Override // c2.l
    public final void f(i0 i0Var) {
        m1.b bVar = i0Var.f1585d;
        i0Var.a();
        b7.h hVar = this.H;
        if (hVar != null) {
            float f3 = this.I;
            long o6 = this.F.o();
            float floatValue = ((Number) ((v.b) hVar.f1294c).f9734a.f9798e.getValue()).floatValue();
            if (floatValue > 0.0f) {
                long b10 = p.b(o6, floatValue);
                if (hVar.f1292a) {
                    float intBitsToFloat = Float.intBitsToFloat((int) (bVar.u() >> 32));
                    float intBitsToFloat2 = Float.intBitsToFloat((int) (bVar.u() & 4294967295L));
                    n nVar = bVar.f6406e;
                    long u2 = nVar.u();
                    nVar.p().h();
                    try {
                        ((n) ((l.d) nVar.f41i).f5643e).p().l(0.0f, 0.0f, intBitsToFloat, intBitsToFloat2);
                        m1.d.C(i0Var, b10, f3);
                    } finally {
                        nVar.p().f();
                        nVar.K(u2);
                    }
                } else {
                    m1.d.C(i0Var, b10, f3);
                }
            }
        }
        k1.n p4 = bVar.f6406e.p();
        e eVar = this.N;
        if (eVar != null) {
            long j = this.J;
            int a9 = yd.c.a(this.I);
            long o10 = this.F.o();
            this.G.invoke();
            eVar.e(a9, j, o10);
            eVar.draw(k1.c.a(p4));
        }
    }

    @Override // d1.k
    public final boolean x() {
        return false;
    }
}
