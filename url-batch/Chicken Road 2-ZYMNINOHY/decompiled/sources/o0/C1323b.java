package o0;

import B1.j;
import T.C0096n;
import T.C0097o;
import T.F;
import T.U;
import Y.A;
import Y.g;
import Y.h;
import a0.C0144j;
import a0.Q;
import a0.p0;
import f0.e;
import f0.i;
import g0.f;
import io.appmetrica.analytics.impl.Zo;
import java.util.AbstractList;
import java.util.ArrayList;
import q0.C1372n;
import q0.InterfaceC1382y;
import q0.InterfaceC1383z;
import q0.b0;
import q0.c0;
import q0.d0;
import q0.j0;
import r0.C1398i;
import t0.C1427b;
import t0.t;
import u0.o;
import v2.G;
import v2.I;
import v2.a0;
import v2.r;

/* renamed from: o0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1323b implements InterfaceC1383z, c0 {

    /* renamed from: a, reason: collision with root package name */
    public final f f14596a;

    /* renamed from: b, reason: collision with root package name */
    public final A f14597b;

    /* renamed from: c, reason: collision with root package name */
    public final o f14598c;

    /* renamed from: d, reason: collision with root package name */
    public final i f14599d;

    /* renamed from: e, reason: collision with root package name */
    public final e f14600e;

    /* renamed from: f, reason: collision with root package name */
    public final C1427b f14601f;

    /* renamed from: g, reason: collision with root package name */
    public final e f14602g;

    /* renamed from: h, reason: collision with root package name */
    public final j f14603h;

    /* renamed from: i, reason: collision with root package name */
    public final j0 f14604i;

    /* renamed from: j, reason: collision with root package name */
    public final C0144j f14605j;

    /* renamed from: k, reason: collision with root package name */
    public InterfaceC1382y f14606k;

    /* renamed from: l, reason: collision with root package name */
    public p0.c f14607l;

    /* renamed from: m, reason: collision with root package name */
    public C1398i[] f14608m;
    public C1372n n;

    public C1323b(p0.c cVar, f fVar, A a3, C0144j c0144j, i iVar, e eVar, C1427b c1427b, e eVar2, o oVar, j jVar) {
        this.f14607l = cVar;
        this.f14596a = fVar;
        this.f14597b = a3;
        this.f14598c = oVar;
        this.f14599d = iVar;
        this.f14600e = eVar;
        this.f14601f = c1427b;
        this.f14602g = eVar2;
        this.f14603h = jVar;
        this.f14605j = c0144j;
        U[] uArr = new U[cVar.f14693f.length];
        int i4 = 0;
        while (true) {
            p0.b[] bVarArr = cVar.f14693f;
            if (i4 >= bVarArr.length) {
                this.f14604i = new j0(uArr);
                this.f14608m = new C1398i[0];
                c0144j.getClass();
                G g4 = I.f15571b;
                a0 a0Var = a0.f15605e;
                this.n = new C1372n(a0Var, a0Var);
                return;
            }
            C0097o[] c0097oArr = bVarArr[i4].f14683j;
            C0097o[] c0097oArr2 = new C0097o[c0097oArr.length];
            for (int i5 = 0; i5 < c0097oArr.length; i5++) {
                C0097o c0097o = c0097oArr[i5];
                C0096n a4 = c0097o.a();
                a4.f2818N = iVar.d(c0097o);
                C0097o c0097o2 = new C0097o(a4);
                if (fVar.f8835a && ((a2.i) fVar.f8837c).f(c0097o2)) {
                    C0096n a5 = c0097o2.a();
                    a5.f2831m = F.n("application/x-media3-cues");
                    a5.f2816K = ((a2.i) fVar.f8837c).c(c0097o2);
                    StringBuilder sb = new StringBuilder();
                    sb.append(c0097o2.n);
                    String str = c0097o2.f2866k;
                    sb.append(str != null ? " ".concat(str) : "");
                    a5.f2828j = sb.toString();
                    a5.f2834r = Long.MAX_VALUE;
                    c0097o2 = new C0097o(a5);
                }
                c0097oArr2[i5] = c0097o2;
            }
            uArr[i4] = new U(Integer.toString(i4), c0097oArr2);
            i4++;
        }
    }

    @Override // q0.InterfaceC1383z
    public final long b(long j4, p0 p0Var) {
        for (C1398i c1398i : this.f14608m) {
            if (c1398i.f15152a == 2) {
                return c1398i.f15156e.b(j4, p0Var);
            }
        }
        return j4;
    }

    @Override // q0.InterfaceC1383z
    public final long d(t[] tVarArr, boolean[] zArr, b0[] b0VarArr, boolean[] zArr2, long j4) {
        ArrayList arrayList;
        int i4;
        t tVar;
        t[] tVarArr2 = tVarArr;
        ArrayList arrayList2 = new ArrayList();
        int i5 = 0;
        while (i5 < tVarArr2.length) {
            b0 b0Var = b0VarArr[i5];
            if (b0Var != null) {
                C1398i c1398i = (C1398i) b0Var;
                t tVar2 = tVarArr2[i5];
                if (tVar2 == null || !zArr[i5]) {
                    c1398i.B(null);
                    b0VarArr[i5] = null;
                } else {
                    ((C1322a) c1398i.f15156e).f14592e = tVar2;
                    arrayList2.add(c1398i);
                }
            }
            if (b0VarArr[i5] != null || (tVar = tVarArr2[i5]) == null) {
                arrayList = arrayList2;
                i4 = i5;
            } else {
                int b4 = this.f14604i.b(tVar.c());
                p0.c cVar = this.f14607l;
                f fVar = this.f14596a;
                h f4 = ((g) fVar.f8836b).f();
                A a3 = this.f14597b;
                if (a3 != null) {
                    f4.y(a3);
                }
                i4 = i5;
                arrayList = arrayList2;
                C1398i c1398i2 = new C1398i(this.f14607l.f14693f[b4].f14674a, null, null, new C1322a(this.f14598c, cVar, b4, tVar, f4, (a2.i) fVar.f8837c, fVar.f8835a), this, this.f14603h, j4, this.f14599d, this.f14600e, this.f14601f, this.f14602g, false, null);
                arrayList.add(c1398i2);
                b0VarArr[i4] = c1398i2;
                zArr2[i4] = true;
            }
            i5 = i4 + 1;
            arrayList2 = arrayList;
            tVarArr2 = tVarArr;
        }
        ArrayList arrayList3 = arrayList2;
        C1398i[] c1398iArr = new C1398i[arrayList3.size()];
        this.f14608m = c1398iArr;
        arrayList3.toArray(c1398iArr);
        AbstractList u4 = r.u(arrayList3, new Zo(6));
        this.f14605j.getClass();
        this.n = new C1372n(arrayList3, u4);
        return j4;
    }

    @Override // q0.d0
    public final long e() {
        return this.n.e();
    }

    @Override // q0.InterfaceC1383z
    public final void f(InterfaceC1382y interfaceC1382y, long j4) {
        this.f14606k = interfaceC1382y;
        interfaceC1382y.m(this);
    }

    @Override // q0.InterfaceC1383z
    public final void h() {
        this.f14598c.a();
    }

    @Override // q0.InterfaceC1383z
    public final long i(long j4) {
        for (C1398i c1398i : this.f14608m) {
            c1398i.C(j4);
        }
        return j4;
    }

    @Override // q0.InterfaceC1383z
    public final void j(long j4) {
        for (C1398i c1398i : this.f14608m) {
            c1398i.j(j4);
        }
    }

    @Override // q0.d0
    public final boolean l() {
        return this.n.l();
    }

    @Override // q0.InterfaceC1383z
    public final long q() {
        return -9223372036854775807L;
    }

    @Override // q0.c0
    public final void s(d0 d0Var) {
        InterfaceC1382y interfaceC1382y = this.f14606k;
        interfaceC1382y.getClass();
        interfaceC1382y.s(this);
    }

    @Override // q0.InterfaceC1383z
    public final j0 t() {
        return this.f14604i;
    }

    @Override // q0.d0
    public final long u() {
        return this.n.u();
    }

    @Override // q0.d0
    public final boolean v(Q q4) {
        return this.n.v(q4);
    }

    @Override // q0.d0
    public final void w(long j4) {
        this.n.w(j4);
    }
}
