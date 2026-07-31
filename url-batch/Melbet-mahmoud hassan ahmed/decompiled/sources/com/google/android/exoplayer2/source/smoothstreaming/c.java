package com.google.android.exoplayer2.source.smoothstreaming;

import b2.a;
import com.google.android.exoplayer2.source.smoothstreaming.b;
import java.util.ArrayList;
import m2.t;
import n2.g0;
import n2.i0;
import n2.p0;
import r0.j3;
import r0.s1;
import t1.e0;
import t1.q0;
import t1.r0;
import t1.u;
import t1.x0;
import t1.z0;
import v0.w;
import v0.y;
import v1.i;

/* loaded from: classes.dex */
final class c implements u, r0.a<i<b>> {

    /* renamed from: f, reason: collision with root package name */
    private final b.a f2391f;

    /* renamed from: g, reason: collision with root package name */
    private final p0 f2392g;

    /* renamed from: h, reason: collision with root package name */
    private final i0 f2393h;

    /* renamed from: i, reason: collision with root package name */
    private final y f2394i;

    /* renamed from: j, reason: collision with root package name */
    private final w.a f2395j;

    /* renamed from: k, reason: collision with root package name */
    private final g0 f2396k;

    /* renamed from: l, reason: collision with root package name */
    private final e0.a f2397l;

    /* renamed from: m, reason: collision with root package name */
    private final n2.b f2398m;

    /* renamed from: n, reason: collision with root package name */
    private final z0 f2399n;

    /* renamed from: o, reason: collision with root package name */
    private final t1.i f2400o;

    /* renamed from: p, reason: collision with root package name */
    private u.a f2401p;

    /* renamed from: q, reason: collision with root package name */
    private b2.a f2402q;

    /* renamed from: r, reason: collision with root package name */
    private i<b>[] f2403r;

    /* renamed from: s, reason: collision with root package name */
    private r0 f2404s;

    public c(b2.a aVar, b.a aVar2, p0 p0Var, t1.i iVar, y yVar, w.a aVar3, g0 g0Var, e0.a aVar4, i0 i0Var, n2.b bVar) {
        this.f2402q = aVar;
        this.f2391f = aVar2;
        this.f2392g = p0Var;
        this.f2393h = i0Var;
        this.f2394i = yVar;
        this.f2395j = aVar3;
        this.f2396k = g0Var;
        this.f2397l = aVar4;
        this.f2398m = bVar;
        this.f2400o = iVar;
        this.f2399n = j(aVar, yVar);
        i<b>[] m7 = m(0);
        this.f2403r = m7;
        this.f2404s = iVar.a(m7);
    }

    private i<b> d(t tVar, long j7) {
        int c7 = this.f2399n.c(tVar.c());
        return new i<>(this.f2402q.f1634f[c7].f1640a, null, null, this.f2391f.a(this.f2393h, this.f2402q, c7, tVar, this.f2392g), this, this.f2398m, j7, this.f2394i, this.f2395j, this.f2396k, this.f2397l);
    }

    private static z0 j(b2.a aVar, y yVar) {
        x0[] x0VarArr = new x0[aVar.f1634f.length];
        int i7 = 0;
        while (true) {
            a.b[] bVarArr = aVar.f1634f;
            if (i7 >= bVarArr.length) {
                return new z0(x0VarArr);
            }
            s1[] s1VarArr = bVarArr[i7].f1649j;
            s1[] s1VarArr2 = new s1[s1VarArr.length];
            for (int i8 = 0; i8 < s1VarArr.length; i8++) {
                s1 s1Var = s1VarArr[i8];
                s1VarArr2[i8] = s1Var.c(yVar.e(s1Var));
            }
            x0VarArr[i7] = new x0(Integer.toString(i7), s1VarArr2);
            i7++;
        }
    }

    private static i<b>[] m(int i7) {
        return new i[i7];
    }

    @Override // t1.u, t1.r0
    public boolean a() {
        return this.f2404s.a();
    }

    @Override // t1.u, t1.r0
    public long c() {
        return this.f2404s.c();
    }

    @Override // t1.u, t1.r0
    public long e() {
        return this.f2404s.e();
    }

    @Override // t1.u
    public long f(long j7, j3 j3Var) {
        for (i<b> iVar : this.f2403r) {
            if (iVar.f22758f == 2) {
                return iVar.f(j7, j3Var);
            }
        }
        return j7;
    }

    @Override // t1.u, t1.r0
    public boolean g(long j7) {
        return this.f2404s.g(j7);
    }

    @Override // t1.u, t1.r0
    public void h(long j7) {
        this.f2404s.h(j7);
    }

    @Override // t1.u
    public long n() {
        return -9223372036854775807L;
    }

    @Override // t1.r0.a
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public void l(i<b> iVar) {
        this.f2401p.l(this);
    }

    @Override // t1.u
    public z0 p() {
        return this.f2399n;
    }

    @Override // t1.u
    public void q(u.a aVar, long j7) {
        this.f2401p = aVar;
        aVar.i(this);
    }

    @Override // t1.u
    public long r(t[] tVarArr, boolean[] zArr, q0[] q0VarArr, boolean[] zArr2, long j7) {
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < tVarArr.length; i7++) {
            if (q0VarArr[i7] != null) {
                i iVar = (i) q0VarArr[i7];
                if (tVarArr[i7] == null || !zArr[i7]) {
                    iVar.P();
                    q0VarArr[i7] = null;
                } else {
                    ((b) iVar.E()).c(tVarArr[i7]);
                    arrayList.add(iVar);
                }
            }
            if (q0VarArr[i7] == null && tVarArr[i7] != null) {
                i<b> d7 = d(tVarArr[i7], j7);
                arrayList.add(d7);
                q0VarArr[i7] = d7;
                zArr2[i7] = true;
            }
        }
        i<b>[] m7 = m(arrayList.size());
        this.f2403r = m7;
        arrayList.toArray(m7);
        this.f2404s = this.f2400o.a(this.f2403r);
        return j7;
    }

    @Override // t1.u
    public void s() {
        this.f2393h.b();
    }

    @Override // t1.u
    public void t(long j7, boolean z6) {
        for (i<b> iVar : this.f2403r) {
            iVar.t(j7, z6);
        }
    }

    @Override // t1.u
    public long u(long j7) {
        for (i<b> iVar : this.f2403r) {
            iVar.S(j7);
        }
        return j7;
    }

    public void v() {
        for (i<b> iVar : this.f2403r) {
            iVar.P();
        }
        this.f2401p = null;
    }

    public void w(b2.a aVar) {
        this.f2402q = aVar;
        for (i<b> iVar : this.f2403r) {
            iVar.E().j(aVar);
        }
        this.f2401p.l(this);
    }
}
