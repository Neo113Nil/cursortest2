package m0;

import A2.l;
import D1.C0014b;
import M0.n;
import U.k;
import k2.InterfaceC0550w;
import o.X;
import o.o0;
import t0.AbstractC0898f;
import t0.q0;

/* renamed from: m0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0620e extends k implements q0 {

    /* renamed from: q, reason: collision with root package name */
    public final X f5911q;

    /* renamed from: r, reason: collision with root package name */
    public final C0014b f5912r;

    /* renamed from: s, reason: collision with root package name */
    public final String f5913s = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";

    public C0620e(X x3, C0014b c0014b) {
        this.f5911q = x3;
        this.f5912r = c0014b;
    }

    @Override // U.k
    public final void n0() {
        C0014b c0014b = this.f5912r;
        c0014b.f536b = this;
        c0014b.f537c = new l(24, this);
        c0014b.f538d = j0();
    }

    @Override // U.k
    public final void o0() {
        C0014b c0014b = this.f5912r;
        if (((C0620e) c0014b.f536b) == this) {
            c0014b.f536b = null;
        }
    }

    @Override // t0.q0
    public final Object v() {
        return this.f5913s;
    }

    public final InterfaceC0550w v0() {
        C0620e c0620e = this.p ? (C0620e) AbstractC0898f.k(this) : null;
        if (c0620e != null) {
            return c0620e.v0();
        }
        InterfaceC0550w interfaceC0550w = (InterfaceC0550w) this.f5912r.f538d;
        if (interfaceC0550w != null) {
            return interfaceC0550w;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object w0(long j3, long j4, R1.c cVar) {
        C0618c c0618c;
        int i3;
        long j5;
        long j6;
        C0620e c0620e;
        C0620e c0620e2;
        long j7;
        long j8;
        long j9;
        if (cVar instanceof C0618c) {
            c0618c = (C0618c) cVar;
            int i4 = c0618c.f5905i;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c0618c.f5905i = i4 - Integer.MIN_VALUE;
                Object obj = c0618c.f5903g;
                Q1.a aVar = Q1.a.f3113d;
                i3 = c0618c.f5905i;
                if (i3 != 0) {
                    I2.l.Q(obj);
                    c0618c.f5900d = this;
                    j5 = j3;
                    c0618c.f5901e = j5;
                    j6 = j4;
                    c0618c.f5902f = j6;
                    c0618c.f5905i = 1;
                    obj = this.f5911q.a(j3, j4, c0618c);
                    if (obj == aVar) {
                        return aVar;
                    }
                    c0620e = this;
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j9 = c0618c.f5901e;
                        I2.l.Q(obj);
                        j8 = ((n) obj).f2783a;
                        j7 = j9;
                        return new n(n.e(j7, j8));
                    }
                    long j10 = c0618c.f5902f;
                    long j11 = c0618c.f5901e;
                    c0620e = c0618c.f5900d;
                    I2.l.Q(obj);
                    j6 = j10;
                    j5 = j11;
                }
                long j12 = ((n) obj).f2783a;
                boolean z3 = c0620e.p;
                c0620e2 = (z3 || !z3) ? null : (C0620e) AbstractC0898f.k(c0620e);
                if (c0620e2 != null) {
                    j7 = j12;
                    j8 = 0;
                    return new n(n.e(j7, j8));
                }
                long e3 = n.e(j5, j12);
                long d3 = n.d(j6, j12);
                c0618c.f5900d = null;
                c0618c.f5901e = j12;
                c0618c.f5905i = 2;
                obj = c0620e2.w0(e3, d3, c0618c);
                if (obj == aVar) {
                    return aVar;
                }
                j9 = j12;
                j8 = ((n) obj).f2783a;
                j7 = j9;
                return new n(n.e(j7, j8));
            }
        }
        c0618c = new C0618c(this, cVar);
        Object obj2 = c0618c.f5903g;
        Q1.a aVar2 = Q1.a.f3113d;
        i3 = c0618c.f5905i;
        if (i3 != 0) {
        }
        long j122 = ((n) obj2).f2783a;
        boolean z32 = c0620e.p;
        if (z32) {
        }
        if (c0620e2 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long x0(long j3, long j4, int i3) {
        long j5;
        boolean z3;
        C0620e c0620e;
        X x3 = this.f5911q;
        if (x3.f6478b) {
            o0 o0Var = x3.f6477a;
            if (!o0Var.f6592a.d()) {
                j5 = o0Var.g(o0Var.c(o0Var.f6592a.b(o0Var.c(o0Var.f(j4)))));
                z3 = this.p;
                c0620e = null;
                if (z3 && z3) {
                    c0620e = (C0620e) AbstractC0898f.k(this);
                }
                C0620e c0620e2 = c0620e;
                return a0.c.h(j5, c0620e2 != null ? c0620e2.x0(a0.c.h(j3, j5), a0.c.g(j4, j5), i3) : 0L);
            }
        }
        j5 = 0;
        z3 = this.p;
        c0620e = null;
        if (z3) {
            c0620e = (C0620e) AbstractC0898f.k(this);
        }
        C0620e c0620e22 = c0620e;
        return a0.c.h(j5, c0620e22 != null ? c0620e22.x0(a0.c.h(j3, j5), a0.c.g(j4, j5), i3) : 0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object y0(long j3, P1.d dVar) {
        C0619d c0619d;
        Object obj;
        Q1.a aVar;
        int i3;
        C0620e c0620e;
        long j4;
        long j5;
        if (dVar instanceof C0619d) {
            c0619d = (C0619d) dVar;
            int i4 = c0619d.f5910h;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c0619d.f5910h = i4 - Integer.MIN_VALUE;
                obj = c0619d.f5908f;
                aVar = Q1.a.f3113d;
                i3 = c0619d.f5910h;
                if (i3 != 0) {
                    I2.l.Q(obj);
                    boolean z3 = this.p;
                    C0620e c0620e2 = (z3 && z3) ? (C0620e) AbstractC0898f.k(this) : null;
                    if (c0620e2 == null) {
                        c0620e = this;
                        j4 = j3;
                        j5 = 0;
                        X x3 = c0620e.f5911q;
                        n.d(j4, j5);
                        c0619d.f5906d = null;
                        c0619d.f5907e = j5;
                        c0619d.f5910h = 2;
                        obj = new n(0L);
                        if (obj == aVar) {
                            return aVar;
                        }
                        return new n(n.e(j5, ((n) obj).f2783a));
                    }
                    c0619d.f5906d = this;
                    c0619d.f5907e = j3;
                    c0619d.f5910h = 1;
                    obj = c0620e2.y0(j3, c0619d);
                    if (obj == aVar) {
                        return aVar;
                    }
                    c0620e = this;
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j5 = c0619d.f5907e;
                        I2.l.Q(obj);
                        return new n(n.e(j5, ((n) obj).f2783a));
                    }
                    j3 = c0619d.f5907e;
                    c0620e = c0619d.f5906d;
                    I2.l.Q(obj);
                }
                long j6 = j3;
                j5 = ((n) obj).f2783a;
                j4 = j6;
                X x32 = c0620e.f5911q;
                n.d(j4, j5);
                c0619d.f5906d = null;
                c0619d.f5907e = j5;
                c0619d.f5910h = 2;
                obj = new n(0L);
                if (obj == aVar) {
                }
                return new n(n.e(j5, ((n) obj).f2783a));
            }
        }
        c0619d = new C0619d(this, (R1.c) dVar);
        obj = c0619d.f5908f;
        aVar = Q1.a.f3113d;
        i3 = c0619d.f5910h;
        if (i3 != 0) {
        }
        long j62 = j3;
        j5 = ((n) obj).f2783a;
        j4 = j62;
        X x322 = c0620e.f5911q;
        n.d(j4, j5);
        c0619d.f5906d = null;
        c0619d.f5907e = j5;
        c0619d.f5910h = 2;
        obj = new n(0L);
        if (obj == aVar) {
        }
        return new n(n.e(j5, ((n) obj).f2783a));
    }

    public final long z0(long j3, int i3) {
        boolean z3 = this.p;
        C0620e c0620e = null;
        if (z3 && z3) {
            c0620e = (C0620e) AbstractC0898f.k(this);
        }
        long z02 = c0620e != null ? c0620e.z0(j3, i3) : 0L;
        a0.c.g(j3, z02);
        return a0.c.h(z02, 0L);
    }
}
