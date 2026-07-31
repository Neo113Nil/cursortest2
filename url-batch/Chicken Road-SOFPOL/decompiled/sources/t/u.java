package t;

import a7.h1;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import w1.f1;
import w1.p1;
import w1.s1;
import w1.x1;
import x1.b1;
import x1.u1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public class u extends w1.l implements p1, o1.c, s1, x1, w1.j, f1 {
    public static final b L = new b();
    public i0 A;
    public w1.k B;
    public v.l C;
    public v.f D;
    public final o.a0 E;
    public long F;
    public v.j G;
    public boolean H;
    public h1 I;
    public final b J;
    public q1.k K;

    /* renamed from: t, reason: collision with root package name */
    public v.j f6860t;

    /* renamed from: u, reason: collision with root package name */
    public i0 f6861u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f6862v;

    /* renamed from: w, reason: collision with root package name */
    public d2.g f6863w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f6864x;

    /* renamed from: y, reason: collision with root package name */
    public p6.a f6865y;

    /* renamed from: z, reason: collision with root package name */
    public final c0 f6866z;

    public u(v.j jVar, i0 i0Var, boolean z3, boolean z7, d2.g gVar, p6.a aVar) {
        this.f6860t = jVar;
        this.f6861u = i0Var;
        this.f6862v = z3;
        this.f6863w = gVar;
        this.f6864x = z7;
        this.f6865y = aVar;
        this.f6866z = new c0(jVar, new a7.v0(1, this, u.class, "onFocusChange", "onFocusChange(Z)V", 0, 0, 1));
        int i = o.o.f5515a;
        this.E = new o.a0(6);
        this.F = 0L;
        v.j jVar2 = this.f6860t;
        this.G = jVar2;
        this.H = jVar2 == null;
        this.J = L;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // w1.p1
    public final void C(q1.f fVar, q1.g gVar, long j7) {
        char c8 = ' ';
        long j8 = 4294967295L;
        long j9 = ((j7 >> 33) << 32) | (((j7 << 32) >> 33) & 4294967295L);
        this.F = (Float.floatToRawIntBits((int) (j9 >> 32)) << 32) | (Float.floatToRawIntBits((int) (j9 & 4294967295L)) & 4294967295L);
        x0();
        boolean z3 = this.f6864x;
        q1.g gVar2 = q1.g.f5989e;
        int i = 1;
        g6.c cVar = null;
        int i8 = 0;
        if (z3 && gVar == gVar2) {
            int i9 = fVar.f5987b;
            if (i9 == 4) {
                a7.x.n(f0(), null, new f(this, cVar, i8), 3);
            } else if (i9 == 5) {
                a7.x.n(f0(), null, new f(this, cVar, i), 3);
            }
        }
        if (gVar != gVar2) {
            if (gVar != q1.g.f5990f || this.K == null) {
                return;
            }
            ?? r02 = fVar.f5986a;
            int size = r02.size();
            for (int i10 = 0; i10 < size; i10++) {
                q1.k kVar = (q1.k) r02.get(i10);
                if (kVar.b() && !kVar.equals(this.K)) {
                    this.K = null;
                    w0();
                    return;
                }
            }
            return;
        }
        q1.k kVar2 = this.K;
        if (kVar2 == null) {
            if (u.h1.c(fVar, true)) {
                q1.k kVar3 = (q1.k) fVar.f5986a.get(0);
                kVar3.a();
                this.K = kVar3;
                if (this.f6864x) {
                    long j10 = kVar3.f5996c;
                    v.j jVar = this.f6860t;
                    if (jVar != null) {
                        v.l lVar = new v.l(j10);
                        q6.o oVar = new q6.o();
                        w1.f.x(this, u.m0.f7047s, new a0.t(20, oVar));
                        if (!oVar.f6201d) {
                            int i11 = v.f6876b;
                            if (!this.f8706d.f8718q) {
                                t1.a.b("Cannot get View because the Modifier node is not currently attached.");
                            }
                            ViewParent parent = ((View) w1.i0.a(w1.f.u(this))).getParent();
                            while (parent != null && (parent instanceof ViewGroup)) {
                                ViewGroup viewGroup = (ViewGroup) parent;
                                if (!viewGroup.shouldDelayChildPressedState()) {
                                    parent = viewGroup.getParent();
                                }
                            }
                            this.C = lVar;
                            a7.x.n(f0(), null, new c(jVar, lVar, null), 3);
                            return;
                        }
                        this.I = a7.x.n(f0(), null, new b0.c(jVar, lVar, this, cVar, 10), 3);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        ?? r03 = fVar.f5986a;
        int size2 = r03.size();
        int i12 = 0;
        while (i12 < size2) {
            q1.k kVar4 = (q1.k) r03.get(i12);
            if (((kVar4.b() || !kVar4.f6001h || kVar4.f5997d) ? i8 : i) == 0) {
                long O = w1.f.u(this).f7659y.O(((u1) w1.f.i(this, b1.f8380s)).c());
                long floatToRawIntBits = (Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (O >> c8)) - ((int) (j7 >> c8))) / 2.0f) << c8) | (Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (O & 4294967295L)) - ((int) (j7 & 4294967295L))) / 2.0f) & 4294967295L);
                int size3 = r03.size();
                int i13 = i8;
                while (i13 < size3) {
                    q1.k kVar5 = (q1.k) r03.get(i13);
                    if (!kVar5.b()) {
                        int i14 = kVar5.i == i ? i : i8;
                        long j11 = kVar5.f5996c;
                        long j12 = j8;
                        float intBitsToFloat = Float.intBitsToFloat((int) (j11 >> c8));
                        float intBitsToFloat2 = Float.intBitsToFloat((int) (j11 & j12));
                        float f6 = i14;
                        float intBitsToFloat3 = Float.intBitsToFloat((int) (floatToRawIntBits >> c8)) * f6;
                        float f8 = ((int) (j7 >> c8)) + intBitsToFloat3;
                        float intBitsToFloat4 = Float.intBitsToFloat((int) (floatToRawIntBits & j12)) * f6;
                        if (!((intBitsToFloat2 < (-intBitsToFloat4)) | (intBitsToFloat < (-intBitsToFloat3)) | (intBitsToFloat > f8) | (intBitsToFloat2 > ((int) (j7 & j12)) + intBitsToFloat4))) {
                            i13++;
                            j8 = j12;
                            i = 1;
                            c8 = ' ';
                            i8 = 0;
                        }
                    }
                    this.K = null;
                    w0();
                    return;
                }
                return;
            }
            i12++;
            i = 1;
            c8 = ' ';
            i8 = 0;
        }
        ((q1.k) r03.get(i8)).a();
        if (this.f6864x) {
            long j13 = kVar2.f5996c;
            v.j jVar2 = this.f6860t;
            if (jVar2 != null) {
                h1 h1Var = this.I;
                if (h1Var == null || !h1Var.b()) {
                    v.l lVar2 = this.C;
                    if (lVar2 != null) {
                        a7.x.n(f0(), null, new c(lVar2, jVar2, cVar, 1), 3);
                    }
                } else {
                    a7.x.n(f0(), null, new d(this, j13, jVar2, null, 0), 3);
                }
                this.C = null;
            }
            this.f6865y.b();
        }
        this.K = null;
    }

    @Override // w1.f1
    public final void F() {
        if (this.f6862v) {
            w1.f.r(this, new a(this, 0));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ce, code lost:
    
        if (((r7 & ((~r7) << 6)) & r14) == 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d0, code lost:
    
        r16 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o1.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean K(KeyEvent keyEvent) {
        boolean z3;
        int i;
        Object obj;
        x0();
        long c8 = h0.a.c(keyEvent.getKeyCode());
        boolean z7 = this.f6864x;
        o.a0 a0Var = this.E;
        g6.c cVar = null;
        int i8 = 1;
        if (z7 && m.a.E(keyEvent) == 2 && androidx.compose.foundation.a.e(keyEvent)) {
            if (!a0Var.b(c8)) {
                v.l lVar = new v.l(this.F);
                a0Var.f(c8, lVar);
                if (this.f6860t == null) {
                    return true;
                }
                a7.x.n(f0(), null, new e(this, lVar, cVar, 1), 3);
                return true;
            }
        } else if (this.f6864x && m.a.E(keyEvent) == 1 && androidx.compose.foundation.a.e(keyEvent)) {
            a0Var.getClass();
            int hashCode = Long.hashCode(c8) * (-862048943);
            int i9 = hashCode ^ (hashCode << 16);
            int i10 = i9 & 127;
            int i11 = a0Var.f5414d;
            int i12 = (i9 >>> 7) & i11;
            int i13 = 0;
            loop0: while (true) {
                long[] jArr = a0Var.f5411a;
                int i14 = i12 >> 3;
                int i15 = (i12 & 7) << 3;
                z3 = i8;
                long j7 = (((-i15) >> 63) & (jArr[i14 + i8] << (64 - i15))) | (jArr[i14] >>> i15);
                long j8 = (i10 * 72340172838076673L) ^ j7;
                long j9 = -9187201950435737472L;
                long j10 = (~j8) & (j8 - 72340172838076673L) & (-9187201950435737472L);
                while (true) {
                    if (j10 == 0) {
                        break;
                    }
                    i = (i12 + (Long.numberOfTrailingZeros(j10) >> 3)) & i11;
                    long j11 = j9;
                    if (a0Var.f5412b[i] == c8) {
                        break loop0;
                    }
                    j10 &= j10 - 1;
                    j9 = j11;
                }
                i13 += 8;
                i12 = (i12 + i13) & i11;
                i8 = z3 ? 1 : 0;
            }
            if (i >= 0) {
                a0Var.f5415e--;
                long[] jArr2 = a0Var.f5411a;
                int i16 = a0Var.f5414d;
                int i17 = i >> 3;
                int i18 = (i & 7) << 3;
                long j12 = (jArr2[i17] & (~(255 << i18))) | (254 << i18);
                jArr2[i17] = j12;
                jArr2[(((i - 7) & i16) + (i16 & 7)) >> 3] = j12;
                Object[] objArr = a0Var.f5413c;
                obj = objArr[i];
                objArr[i] = null;
            } else {
                obj = null;
            }
            v.l lVar2 = (v.l) obj;
            if (lVar2 != null) {
                if (this.f6860t != null) {
                    a7.x.n(f0(), null, new e(this, lVar2, cVar, 2), 3);
                }
                this.f6865y.b();
            }
            if (lVar2 != null) {
                return z3;
            }
            return false;
        }
        return false;
    }

    @Override // w1.p1
    public final void S() {
        v.f fVar;
        v.j jVar = this.f6860t;
        if (jVar != null && (fVar = this.D) != null) {
            jVar.c(new v.g(fVar));
        }
        this.D = null;
        if (this.K != null) {
            this.K = null;
            w0();
        }
    }

    @Override // w1.s1
    public final boolean U() {
        return true;
    }

    @Override // y0.l
    public final boolean g0() {
        return false;
    }

    @Override // o1.c
    public final boolean h(KeyEvent keyEvent) {
        return false;
    }

    @Override // y0.l
    public final void j0() {
        F();
        if (!this.H) {
            x0();
        }
        if (this.f6864x) {
            r0(this.f6866z);
        }
    }

    @Override // y0.l
    public final void k0() {
        v0();
        if (this.G == null) {
            this.f6860t = null;
        }
        w1.k kVar = this.B;
        if (kVar != null) {
            s0(kVar);
        }
        this.B = null;
    }

    @Override // w1.x1
    public final Object m() {
        return this.J;
    }

    @Override // w1.s1
    public final void q(d2.j jVar) {
        d2.g gVar = this.f6863w;
        if (gVar != null) {
            d2.u.a(jVar, gVar.f2122a);
        }
        a aVar = new a(this, 1);
        w6.d[] dVarArr = d2.u.f2215a;
        jVar.e(d2.i.f2126b, new d2.a(null, aVar));
        if (this.f6864x) {
            this.f6866z.q(jVar);
        } else {
            jVar.e(d2.s.i, c6.m.f1757a);
        }
        u0(jVar);
    }

    public final void v0() {
        v.j jVar = this.f6860t;
        o.a0 a0Var = this.E;
        if (jVar != null) {
            v.l lVar = this.C;
            if (lVar != null) {
                jVar.c(new v.k(lVar));
            }
            v.f fVar = this.D;
            if (fVar != null) {
                jVar.c(new v.g(fVar));
            }
            Object[] objArr = a0Var.f5413c;
            long[] jArr = a0Var.f5411a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j7 = jArr[i];
                    if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i8 = 8 - ((~(i - length)) >>> 31);
                        for (int i9 = 0; i9 < i8; i9++) {
                            if ((255 & j7) < 128) {
                                jVar.c(new v.k((v.l) objArr[(i << 3) + i9]));
                            }
                            j7 >>= 8;
                        }
                        if (i8 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        this.C = null;
        this.D = null;
        a0Var.a();
    }

    public final void w0() {
        v.j jVar = this.f6860t;
        if (jVar != null) {
            h1 h1Var = this.I;
            g6.c cVar = null;
            if (h1Var == null || !h1Var.b()) {
                v.l lVar = this.C;
                if (lVar != null) {
                    a7.x.n(f0(), null, new c(lVar, jVar, cVar, 0), 3);
                }
            } else {
                h1 h1Var2 = this.I;
                if (h1Var2 != null) {
                    h1Var2.a(null);
                }
            }
            this.C = null;
        }
    }

    public final void x0() {
        if (this.B != null) {
            return;
        }
        i0 i0Var = this.f6862v ? this.A : this.f6861u;
        if (i0Var != null) {
            if (this.f6860t == null) {
                this.f6860t = new v.j();
            }
            this.f6866z.w0(this.f6860t);
            v.j jVar = this.f6860t;
            q6.i.b(jVar);
            w1.k a8 = i0Var.a(jVar);
            r0(a8);
            this.B = a8;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0065, code lost:
    
        if (r3.B == null) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y0(v.j jVar, i0 i0Var, boolean z3, boolean z7, d2.g gVar, p6.a aVar) {
        boolean z8;
        w1.k kVar;
        boolean z9 = true;
        if (q6.i.a(this.G, jVar)) {
            z8 = false;
        } else {
            v0();
            this.G = jVar;
            this.f6860t = jVar;
            z8 = true;
        }
        if (!q6.i.a(this.f6861u, i0Var)) {
            this.f6861u = i0Var;
            z8 = true;
        }
        if (this.f6862v != z3) {
            this.f6862v = z3;
            if (z3) {
                F();
            }
            z8 = true;
        }
        boolean z10 = this.f6864x;
        c0 c0Var = this.f6866z;
        if (z10 != z7) {
            if (z7) {
                r0(c0Var);
            } else {
                s0(c0Var);
                v0();
            }
            w1.f.n(this);
            this.f6864x = z7;
        }
        if (!q6.i.a(this.f6863w, gVar)) {
            this.f6863w = gVar;
            w1.f.n(this);
        }
        this.f6865y = aVar;
        boolean z11 = this.H;
        v.j jVar2 = this.G;
        if (z11 != (jVar2 == null)) {
            boolean z12 = jVar2 == null;
            this.H = z12;
            if (!z12) {
            }
        }
        z9 = z8;
        if (z9 && ((kVar = this.B) != null || !this.H)) {
            if (kVar != null) {
                s0(kVar);
            }
            this.B = null;
            x0();
        }
        c0Var.w0(this.f6860t);
    }

    public void u0(d2.j jVar) {
    }
}
