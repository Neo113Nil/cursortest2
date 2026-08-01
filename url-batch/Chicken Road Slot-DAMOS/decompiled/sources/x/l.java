package x;

import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import b0.l0;
import b1.c0;
import c2.c2;
import c2.k1;
import c2.t1;
import c2.x1;
import d2.d1;
import ge.a0;
import ge.c1;
import ge.f1;
import ge.r1;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import s.z;
import wd.y;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class l extends c2.j implements t1, v1.b, x1, c2, c2.h, k1 {
    public static final o X = new o(1);
    public z.f E;
    public x F;
    public j2.g G;
    public boolean H;
    public Function0 I;
    public final p J;
    public r K;
    public c2.i L;
    public z.h M;
    public z.c N;
    public final z O;
    public long P;
    public z.h Q;
    public z.f R;
    public boolean S;
    public r1 T;
    public final o U;
    public x1.l V;
    public u1.b W;

    public l(z.f fVar, x xVar, boolean z10, j2.g gVar, Function0 function0) {
        this.E = fVar;
        this.F = xVar;
        this.G = gVar;
        this.H = z10;
        this.I = function0;
        this.J = new p(fVar, new f1(1, this, l.class, "onFocusChange", "onFocusChange(Z)V", 0, 1));
        int i3 = s.n.f8347a;
        this.O = new z(6);
        this.P = 0L;
        z.f fVar2 = this.E;
        this.R = fVar2;
        this.S = fVar2 == null;
        this.U = X;
    }

    @Override // d1.k
    public final void A() {
        if (!this.S) {
            O();
        }
        if (this.H) {
            I(this.J);
        }
    }

    @Override // d1.k
    public final void B() {
        M();
        if (this.R == null) {
            this.E = null;
        }
        c2.i iVar = this.L;
        if (iVar != null) {
            J(iVar);
        }
        this.L = null;
        r rVar = this.K;
        if (rVar != null) {
            J(rVar);
        }
        this.K = null;
    }

    public final void L(boolean z10) {
        ld.a aVar = null;
        if (z10) {
            this.W = null;
        } else {
            this.V = null;
        }
        z.f fVar = this.E;
        if (fVar != null) {
            r1 r1Var = this.T;
            if (r1Var == null || !r1Var.d()) {
                z.h hVar = z10 ? this.Q : this.M;
                if (hVar != null) {
                    z.g gVar = new z.g(hVar);
                    c1 c1Var = (c1) ((le.d) w()).f5969d.m(ge.u.f4403e);
                    a0.s(w(), null, new b5.t(fVar, gVar, c1Var != null ? c1Var.o(new l0(23, fVar, gVar)) : null, aVar, 14), 3);
                }
            } else {
                r1 r1Var2 = this.T;
                if (r1Var2 != null) {
                    r1Var2.a(null);
                }
            }
            if (z10) {
                this.Q = null;
            } else {
                this.M = null;
            }
        }
    }

    public final void M() {
        z.f fVar = this.E;
        z zVar = this.O;
        if (fVar != null) {
            z.h hVar = this.M;
            if (hVar != null) {
                fVar.b(new z.g(hVar));
            }
            z.h hVar2 = this.Q;
            if (hVar2 != null) {
                fVar.b(new z.g(hVar2));
            }
            z.c cVar = this.N;
            if (cVar != null) {
                fVar.b(new z.d(cVar));
            }
            Object[] objArr = zVar.f8401c;
            long[] jArr = zVar.f8399a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i3 = 0;
                while (true) {
                    long j = jArr[i3];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i10 = 8 - ((~(i3 - length)) >>> 31);
                        for (int i11 = 0; i11 < i10; i11++) {
                            if ((255 & j) < 128) {
                                fVar.b(new z.g((z.h) objArr[(i3 << 3) + i11]));
                            }
                            j >>= 8;
                        }
                        if (i10 != 8) {
                            break;
                        }
                    }
                    if (i3 == length) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        this.M = null;
        this.Q = null;
        this.N = null;
        zVar.a();
    }

    public final void N(boolean z10, long j) {
        z.f fVar = this.E;
        if (fVar != null) {
            r1 r1Var = this.T;
            if (r1Var == null || !r1Var.d()) {
                z.h hVar = z10 ? this.Q : this.M;
                if (hVar != null) {
                    a0.s(w(), null, new b(hVar, fVar, null), 3);
                }
            } else {
                r1Var.a(null);
                a0.s(w(), null, new a(r1Var, j, fVar, null), 3);
            }
            if (z10) {
                this.Q = null;
            } else {
                this.M = null;
            }
        }
    }

    public final void O() {
        x xVar;
        if (this.L == null && (xVar = this.F) != null) {
            if (this.E == null) {
                this.E = new z.f();
            }
            this.J.M(this.E);
            z.f fVar = this.E;
            fVar.getClass();
            c2.i a9 = xVar.a(fVar);
            I(a9);
            this.L = a9;
        }
    }

    public final void P(c0 c0Var, x1.h hVar) {
        z.f fVar;
        ArrayList arrayList = (ArrayList) c0Var.f954b;
        O();
        if (this.H && this.K == null) {
            r rVar = new r(this);
            I(rVar);
            this.K = rVar;
        }
        int i3 = 1;
        if (hVar != x1.h.f10271e) {
            if (hVar != x1.h.f10272i || this.W == null) {
                return;
            }
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                u1.b bVar = (u1.b) arrayList.get(i10);
                if (bVar.f9607i && !bVar.equals(this.W)) {
                    L(true);
                    return;
                }
            }
            return;
        }
        ld.a aVar = null;
        if (this.W == null) {
            int size2 = arrayList.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size2) {
                    break;
                }
                u1.b bVar2 = (u1.b) arrayList.get(i11);
                if (bVar2.f9606h || !bVar2.f9603d) {
                    i11++;
                } else {
                    u1.b bVar3 = (u1.b) arrayList.get(0);
                    bVar3.f9607i = true;
                    this.W = bVar3;
                    if (this.H && (fVar = this.E) != null) {
                        z.h hVar2 = new z.h(bVar3.f9602c);
                        wd.z zVar = new wd.z();
                        c2.k.x(this, r.D, new b1.q(2, new j(bVar3, zVar, 0)));
                        if (!zVar.f10164d) {
                            int i12 = m.f10202b;
                            ViewParent parent = c2.k.w(this).getParent();
                            while (parent != null && (parent instanceof ViewGroup)) {
                                ViewGroup viewGroup = (ViewGroup) parent;
                                if (!viewGroup.shouldDelayChildPressedState()) {
                                    parent = viewGroup.getParent();
                                }
                            }
                            this.Q = hVar2;
                            a0.s(w(), null, new b(fVar, hVar2, aVar, i3), 3);
                            return;
                        }
                        this.T = a0.s(w(), null, new c(fVar, hVar2, this, aVar, 0), 3);
                        return;
                    }
                }
            }
            return;
        }
        int size3 = arrayList.size();
        for (int i13 = 0; i13 < size3; i13++) {
            u1.b bVar4 = (u1.b) arrayList.get(i13);
            if (bVar4.f9607i || !bVar4.f9606h || bVar4.f9603d) {
                float a9 = ((d2.c2) c2.k.h(this, d1.f3395t)).a();
                int size4 = arrayList.size();
                for (int i14 = 0; i14 < size4; i14++) {
                    u1.b bVar5 = (u1.b) arrayList.get(i14);
                    long j = bVar5.f9602c;
                    u1.b bVar6 = this.W;
                    bVar6.getClass();
                    boolean z10 = Math.abs(j1.b.b(j1.b.c(j, bVar6.f9602c))) > a9;
                    if (bVar5.f9607i || z10) {
                        L(true);
                        return;
                    }
                }
                return;
            }
        }
        ((u1.b) arrayList.get(0)).f9607i = true;
        if (this.H) {
            u1.b bVar7 = this.W;
            bVar7.getClass();
            N(true, bVar7.f9602c);
            this.I.invoke();
        }
        this.W = null;
    }

    @Override // c2.c2
    public final Object d() {
        return this.U;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ce, code lost:
    
        if (((r7 & ((~r7) << 6)) & r14) == 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d0, code lost:
    
        r16 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v1.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i(KeyEvent keyEvent) {
        boolean z10;
        int i3;
        Object obj;
        O();
        long e2 = cf.c.e(keyEvent.getKeyCode());
        boolean z11 = this.H;
        z zVar = this.O;
        ld.a aVar = null;
        int i10 = 1;
        if (z11 && c6.f.K(keyEvent) == 2 && g.e(keyEvent)) {
            if (!zVar.b(e2)) {
                z.h hVar = new z.h(this.P);
                zVar.f(e2, hVar);
                if (this.E == null) {
                    return true;
                }
                a0.s(w(), null, new d(this, hVar, aVar, 2), 3);
                return true;
            }
        } else if (this.H && c6.f.K(keyEvent) == 1 && g.e(keyEvent)) {
            zVar.getClass();
            int hashCode = Long.hashCode(e2) * (-862048943);
            int i11 = hashCode ^ (hashCode << 16);
            int i12 = i11 & 127;
            int i13 = zVar.f8402d;
            int i14 = (i11 >>> 7) & i13;
            int i15 = 0;
            loop0: while (true) {
                long[] jArr = zVar.f8399a;
                int i16 = i14 >> 3;
                int i17 = (i14 & 7) << 3;
                z10 = i10;
                long j = (((-i17) >> 63) & (jArr[i16 + i10] << (64 - i17))) | (jArr[i16] >>> i17);
                long j3 = (i12 * 72340172838076673L) ^ j;
                long j10 = -9187201950435737472L;
                long j11 = (~j3) & (j3 - 72340172838076673L) & (-9187201950435737472L);
                while (true) {
                    if (j11 == 0) {
                        break;
                    }
                    i3 = (i14 + (Long.numberOfTrailingZeros(j11) >> 3)) & i13;
                    long j12 = j10;
                    if (zVar.f8400b[i3] == e2) {
                        break loop0;
                    }
                    j11 &= j11 - 1;
                    j10 = j12;
                }
                i15 += 8;
                i14 = (i14 + i15) & i13;
                i10 = z10 ? 1 : 0;
            }
            if (i3 >= 0) {
                zVar.f8403e--;
                long[] jArr2 = zVar.f8399a;
                int i18 = zVar.f8402d;
                int i19 = i3 >> 3;
                int i20 = (i3 & 7) << 3;
                long j13 = (jArr2[i19] & (~(255 << i20))) | (254 << i20);
                jArr2[i19] = j13;
                jArr2[(((i3 - 7) & i18) + (i18 & 7)) >> 3] = j13;
                Object[] objArr = zVar.f8401c;
                obj = objArr[i3];
                objArr[i3] = null;
            } else {
                obj = null;
            }
            z.h hVar2 = (z.h) obj;
            if (hVar2 != null) {
                if (this.E != null) {
                    a0.s(w(), null, new d(this, hVar2, aVar, 3), 3);
                }
                this.I.invoke();
            }
            if (hVar2 != null) {
                return z10;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // c2.t1
    public final void j(c0 c0Var, x1.h hVar, long j) {
        boolean z10;
        z.f fVar;
        char c10 = ' ';
        long j3 = 4294967295L;
        long j10 = ((j >> 33) << 32) | (((j << 32) >> 33) & 4294967295L);
        this.P = (Float.floatToRawIntBits((int) (j10 & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j10 >> 32)) << 32);
        O();
        ld.a aVar = null;
        int i3 = 1;
        int i10 = 0;
        if (this.H) {
            if (this.K == null) {
                r rVar = new r(this);
                I(rVar);
                this.K = rVar;
            }
            if (hVar == x1.h.f10271e) {
                int i11 = c0Var.f953a;
                if (i11 == 4) {
                    a0.s(w(), null, new e(this, aVar, i10), 3);
                } else if (i11 == 5) {
                    a0.s(w(), null, new e(this, aVar, i3), 3);
                }
            }
        }
        if (hVar != x1.h.f10271e) {
            if (hVar != x1.h.f10272i || this.V == null) {
                return;
            }
            List list = (List) c0Var.f954b;
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                x1.l lVar = (x1.l) list.get(i12);
                if (lVar.b() && !lVar.equals(this.V)) {
                    L(false);
                    return;
                }
            }
            return;
        }
        if (this.V == null) {
            int i13 = y.b.f10568a;
            List list2 = (List) c0Var.f954b;
            int size2 = list2.size();
            for (int i14 = 0; i14 < size2; i14++) {
                x1.l lVar2 = (x1.l) list2.get(i14);
                if (lVar2.b() || lVar2.f10282h || !lVar2.f10279d) {
                    return;
                }
            }
            x1.l lVar3 = (x1.l) ((List) c0Var.f954b).get(0);
            lVar3.a();
            this.V = lVar3;
            if (!this.H || (fVar = this.E) == null) {
                return;
            }
            z.h hVar2 = new z.h(lVar3.f10278c);
            wd.z zVar = new wd.z();
            int i15 = 2;
            c2.k.x(this, r.D, new b1.q(i15, new j(lVar3, zVar, 1)));
            if (!zVar.f10164d) {
                int i16 = m.f10202b;
                ViewParent parent = c2.k.w(this).getParent();
                while (parent != null && (parent instanceof ViewGroup)) {
                    ViewGroup viewGroup = (ViewGroup) parent;
                    if (!viewGroup.shouldDelayChildPressedState()) {
                        parent = viewGroup.getParent();
                    }
                }
                this.M = hVar2;
                a0.s(w(), null, new b(fVar, hVar2, aVar, i15), 3);
                return;
            }
            this.T = a0.s(w(), null, new c(fVar, hVar2, this, aVar, 1), 3);
            return;
        }
        List list3 = (List) c0Var.f954b;
        int size3 = list3.size();
        int i17 = 0;
        while (i17 < size3) {
            x1.l lVar4 = (x1.l) list3.get(i17);
            if (((lVar4.b() || !lVar4.f10282h || lVar4.f10279d) ? 0 : i3) == 0) {
                long H = c2.k.u(this).L.H(((d2.c2) c2.k.h(this, d1.f3395t)).b());
                long floatToRawIntBits = (Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (H & j3)) - ((int) (j & j3))) / 2.0f) & j3) | (Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (H >> c10)) - ((int) (j >> c10))) / 2.0f) << c10);
                int size4 = list3.size();
                int i18 = 0;
                while (i18 < size4) {
                    x1.l lVar5 = (x1.l) list3.get(i18);
                    if (lVar5.b()) {
                        z10 = i10;
                    } else {
                        int i19 = lVar5.f10283i == i3 ? i3 : i10;
                        long j11 = lVar5.f10278c;
                        char c11 = c10;
                        float intBitsToFloat = Float.intBitsToFloat((int) (j11 >> c11));
                        float intBitsToFloat2 = Float.intBitsToFloat((int) (j11 & j3));
                        float f3 = i19;
                        float intBitsToFloat3 = Float.intBitsToFloat((int) (floatToRawIntBits >> c11)) * f3;
                        long j12 = j3;
                        float f10 = ((int) (j >> c11)) + intBitsToFloat3;
                        float intBitsToFloat4 = Float.intBitsToFloat((int) (floatToRawIntBits & j12)) * f3;
                        int i20 = i18;
                        if ((((intBitsToFloat > f10) | (intBitsToFloat < (-intBitsToFloat3))) || (intBitsToFloat2 < (-intBitsToFloat4))) || (intBitsToFloat2 > ((int) (j & j12)) + intBitsToFloat4)) {
                            z10 = 0;
                        } else {
                            i18 = i20 + 1;
                            j3 = j12;
                            i3 = 1;
                            c10 = ' ';
                            i10 = 0;
                        }
                    }
                    L(z10);
                    return;
                }
                return;
            }
            i17++;
            j3 = j3;
            i3 = 1;
            c10 = ' ';
        }
        ((x1.l) list3.get(0)).a();
        if (this.H) {
            x1.l lVar6 = this.V;
            lVar6.getClass();
            N(false, lVar6.f10278c);
            this.I.invoke();
        }
        this.V = null;
    }

    @Override // c2.t1
    public final void m() {
        z.c cVar;
        z.f fVar = this.E;
        if (fVar != null && (cVar = this.N) != null) {
            fVar.b(new z.d(cVar));
        }
        this.N = null;
        L(false);
    }

    @Override // c2.x1
    public final boolean p() {
        return true;
    }

    @Override // c2.x1
    public final void u(j2.u uVar) {
        j2.g gVar = this.G;
        if (gVar != null) {
            j2.s.a(uVar, gVar.f4938a);
        }
        a1.b bVar = new a1.b(26, this);
        y[] yVarArr = j2.s.f5019a;
        uVar.b(j2.i.f4952b, new j2.a(null, bVar));
        if (this.H) {
            this.J.u(uVar);
        } else {
            uVar.b(j2.q.j, Unit.f5554a);
        }
    }

    @Override // d1.k
    public final boolean x() {
        return false;
    }

    @Override // c2.k1
    public final void h() {
    }
}
