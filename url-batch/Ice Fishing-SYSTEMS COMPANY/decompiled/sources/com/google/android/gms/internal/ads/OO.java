package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import com.facebook.ads.AdError;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class OO implements I6, EQ, OP {

    /* renamed from: a, reason: collision with root package name */
    public final T2 f26691a;

    /* renamed from: b, reason: collision with root package name */
    public final L7 f26692b;

    /* renamed from: c, reason: collision with root package name */
    public final Y7 f26693c;

    /* renamed from: d, reason: collision with root package name */
    public final Q8 f26694d;

    /* renamed from: e, reason: collision with root package name */
    public final SparseArray f26695e;

    /* renamed from: f, reason: collision with root package name */
    public C3759pp f26696f;

    /* renamed from: g, reason: collision with root package name */
    public IO f26697g;

    /* renamed from: h, reason: collision with root package name */
    public C3709ot f26698h;
    public boolean i;

    public OO(T2 t22) {
        t22.getClass();
        this.f26691a = t22;
        String str = AbstractC3548lu.f32613a;
        Looper myLooper = Looper.myLooper();
        this.f26696f = new C3759pp((myLooper == null ? Looper.getMainLooper() : myLooper).getThread());
        L7 l72 = new L7();
        this.f26692b = l72;
        this.f26693c = new Y7();
        Q8 q82 = new Q8();
        q82.f27119n = l72;
        SB sb = UB.f27942u;
        q82.f27120u = C3675oC.f33115x;
        q82.f27121v = C3944tC.f34377z;
        this.f26694d = q82;
        this.f26695e = new SparseArray();
    }

    public final KO A(int i, BQ bq) {
        IO io = this.f26697g;
        io.getClass();
        if (bq != null) {
            return ((AbstractC3832r8) ((C3944tC) this.f26694d.f27121v).get(bq)) != null ? y(bq) : x(AbstractC3832r8.f33969a, i, bq);
        }
        AbstractC3832r8 r12 = io.r1();
        if (i >= r12.a()) {
            r12 = AbstractC3832r8.f33969a;
        }
        return x(r12, i, null);
    }

    public final void B(IO io, Looper looper) {
        boolean z8 = true;
        if (this.f26697g != null && !((UB) this.f26694d.f27120u).isEmpty()) {
            z8 = false;
        }
        PA.T(z8);
        io.getClass();
        this.f26697g = io;
        T2 t22 = this.f26691a;
        this.f26698h = t22.A(looper, null);
        C3759pp c3759pp = this.f26696f;
        C4164xG c4164xG = new C4164xG(12, this, io);
        c3759pp.getClass();
        this.f26696f = new C3759pp(c3759pp.f33515d, looper, looper.getThread(), t22, c4164xG, c3759pp.i);
    }

    @Override // com.google.android.gms.internal.ads.EQ
    public final void b(int i, BQ bq, C4228yQ c4228yQ) {
        KO A8 = A(i, bq);
        s(A8, 1004, new C4164xG(11, A8, c4228yQ));
    }

    @Override // com.google.android.gms.internal.ads.I6
    public final void c() {
        s(v(), 14, new MO(19));
    }

    @Override // com.google.android.gms.internal.ads.I6
    public final void d() {
        IO io = this.f26697g;
        io.getClass();
        Q8 q82 = this.f26694d;
        q82.f27122w = Q8.u(io, (UB) q82.f27120u, (BQ) q82.f27123x, (L7) q82.f27119n);
        q82.s(io.r1());
        s(v(), 0, new MO(7));
    }

    @Override // com.google.android.gms.internal.ads.I6
    public final void e() {
        s(v(), 13, new MO(11));
    }

    @Override // com.google.android.gms.internal.ads.I6
    public final void e0(int i) {
        KO v6 = v();
        s(v6, 4, new J6.i(v6, i));
    }

    @Override // com.google.android.gms.internal.ads.I6
    public final void f() {
        s(v(), 3, new MO(10));
    }

    @Override // com.google.android.gms.internal.ads.I6
    public final void f0(C3100dd c3100dd) {
        KO z8 = z();
        s(z8, 25, new C2478Aq(z8, c3100dd, 18));
    }

    @Override // com.google.android.gms.internal.ads.I6
    public final void g() {
        s(v(), -1, new MO(12));
    }

    @Override // com.google.android.gms.internal.ads.I6
    public final void g0(RN rn) {
        BQ bq;
        KO v6 = (rn == null || (bq = rn.f27348A) == null) ? v() : y(bq);
        s(v6, 10, new Mu(v6, rn));
    }

    @Override // com.google.android.gms.internal.ads.I6
    public final void h() {
        s(v(), 5, new MO(13));
    }

    @Override // com.google.android.gms.internal.ads.I6
    public final void h0(C2967b7 c2967b7, C2967b7 c2967b72, int i) {
        if (i == 1) {
            this.i = false;
            i = 1;
        }
        IO io = this.f26697g;
        io.getClass();
        Q8 q82 = this.f26694d;
        q82.f27122w = Q8.u(io, (UB) q82.f27120u, (BQ) q82.f27123x, (L7) q82.f27119n);
        KO v6 = v();
        s(v6, 11, new J6.i(v6, i, c2967b7, c2967b72));
    }

    @Override // com.google.android.gms.internal.ads.I6
    public final void i() {
        s(v(), 1, new MO(8));
    }

    @Override // com.google.android.gms.internal.ads.I6
    public final void i0(RN rn) {
        BQ bq;
        s((rn == null || (bq = rn.f27348A) == null) ? v() : y(bq), 10, new MO(17));
    }

    @Override // com.google.android.gms.internal.ads.I6
    public final void j() {
        s(v(), 6, new MO(14));
    }

    @Override // com.google.android.gms.internal.ads.I6
    public final void k() {
        s(v(), 7, new MO(16));
    }

    @Override // com.google.android.gms.internal.ads.EQ
    public final void l(int i, BQ bq, C3958tQ c3958tQ, C4228yQ c4228yQ) {
        s(A(i, bq), 1001, new MO(4));
    }

    @Override // com.google.android.gms.internal.ads.EQ
    public final void m(int i, BQ bq, C3958tQ c3958tQ, C4228yQ c4228yQ) {
        s(A(i, bq), AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE, new MO(5));
    }

    @Override // com.google.android.gms.internal.ads.I6
    public final void n() {
        s(z(), 21, new MO(21));
    }

    @Override // com.google.android.gms.internal.ads.I6
    public final void o() {
        s(v(), 2, new MO(9));
    }

    @Override // com.google.android.gms.internal.ads.EQ
    public final void p(int i, BQ bq, C3958tQ c3958tQ, C4228yQ c4228yQ, IOException iOException, boolean z8) {
        KO A8 = A(i, bq);
        s(A8, 1003, new Mt(A8, c3958tQ, c4228yQ, iOException, z8));
    }

    @Override // com.google.android.gms.internal.ads.EQ
    public final void q(int i, BQ bq, C3958tQ c3958tQ, C4228yQ c4228yQ, int i4) {
        s(A(i, bq), 1000, new MO(3));
    }

    @Override // com.google.android.gms.internal.ads.I6
    public final void r() {
        s(v(), 12, new MO(18));
    }

    public final void s(KO ko, int i, InterfaceC3865ro interfaceC3865ro) {
        this.f26695e.put(i, ko);
        C3759pp c3759pp = this.f26696f;
        c3759pp.c(i, interfaceC3865ro);
        c3759pp.d();
    }

    @Override // com.google.android.gms.internal.ads.I6
    public final void t() {
        s(z(), 22, new C3307hK((byte) 0, 24));
    }

    @Override // com.google.android.gms.internal.ads.I6
    public final void u() {
        s(z(), 24, new MO(2));
    }

    public final KO v() {
        return y((BQ) this.f26694d.f27122w);
    }

    @Override // com.google.android.gms.internal.ads.I6
    public final void w() {
        s(z(), 23, new MO(20));
    }

    public final KO x(AbstractC3832r8 abstractC3832r8, int i, BQ bq) {
        BQ bq2 = true == abstractC3832r8.g() ? null : bq;
        this.f26691a.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z8 = false;
        if (abstractC3832r8.equals(this.f26697g.r1()) && i == this.f26697g.t1()) {
            z8 = true;
        }
        long j9 = 0;
        if (bq2 == null || !bq2.b()) {
            if (z8) {
                IO io = this.f26697g;
                io.f25557w.b();
                C3093dO c3093dO = io.f25556v;
                c3093dO.P0();
                j9 = c3093dO.C1(c3093dO.f30014G0);
            } else if (!abstractC3832r8.g()) {
                abstractC3832r8.b(i, this.f26693c, 0L).getClass();
                j9 = AbstractC3548lu.t(0L);
            }
        } else if (z8 && this.f26697g.m() == bq2.f24044b && this.f26697g.B1() == bq2.f24045c) {
            j9 = this.f26697g.x1();
        }
        long j10 = j9;
        BQ bq3 = (BQ) this.f26694d.f27122w;
        AbstractC3832r8 r12 = this.f26697g.r1();
        int t12 = this.f26697g.t1();
        long x12 = this.f26697g.x1();
        IO io2 = this.f26697g;
        io2.f25557w.b();
        return new KO(elapsedRealtime, abstractC3832r8, i, bq2, j10, r12, t12, bq3, x12, io2.f25556v.S1());
    }

    public final KO y(BQ bq) {
        this.f26697g.getClass();
        AbstractC3832r8 abstractC3832r8 = bq == null ? null : (AbstractC3832r8) ((C3944tC) this.f26694d.f27121v).get(bq);
        if (bq != null && abstractC3832r8 != null) {
            return x(abstractC3832r8, abstractC3832r8.o(bq.f24043a, this.f26692b).f26108c, bq);
        }
        int t12 = this.f26697g.t1();
        AbstractC3832r8 r12 = this.f26697g.r1();
        if (t12 >= r12.a()) {
            r12 = AbstractC3832r8.f33969a;
        }
        return x(r12, t12, null);
    }

    public final KO z() {
        return y((BQ) this.f26694d.f27124y);
    }

    @Override // com.google.android.gms.internal.ads.I6
    public final void a() {
    }
}
