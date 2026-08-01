package a2;

import android.os.Handler;
import android.view.ViewGroup;
import c2.n1;
import d2.t2;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c0 implements n0.i {
    public int A;
    public int B;

    /* renamed from: d, reason: collision with root package name */
    public final c2.g0 f61d;

    /* renamed from: e, reason: collision with root package name */
    public n0.o f62e;

    /* renamed from: i, reason: collision with root package name */
    public int f63i;

    /* renamed from: r, reason: collision with root package name */
    public int f64r;

    /* renamed from: s, reason: collision with root package name */
    public final s.h0 f65s;

    /* renamed from: t, reason: collision with root package name */
    public final s.h0 f66t;

    /* renamed from: u, reason: collision with root package name */
    public final v f67u;

    /* renamed from: v, reason: collision with root package name */
    public final s f68v;

    /* renamed from: w, reason: collision with root package name */
    public final s.h0 f69w;

    /* renamed from: x, reason: collision with root package name */
    public final b1 f70x;

    /* renamed from: y, reason: collision with root package name */
    public final s.h0 f71y;

    /* renamed from: z, reason: collision with root package name */
    public final o0.e f72z;

    public c0(c2.g0 g0Var) {
        this.f61d = g0Var;
        long[] jArr = s.p0.f8356a;
        this.f65s = new s.h0();
        this.f66t = new s.h0();
        this.f67u = new v(this);
        this.f68v = new s(this);
        this.f69w = new s.h0();
        this.f70x = new b1();
        this.f71y = new s.h0();
        this.f72z = new o0.e(new Object[16]);
    }

    public final void a(t tVar) {
        tVar.getClass();
    }

    public final void b(int i3) {
        boolean z10;
        boolean z11 = false;
        this.A = 0;
        List m10 = this.f61d.m();
        o0.b bVar = (o0.b) m10;
        int i10 = (bVar.f7311d.f7319i - this.B) - 1;
        if (i3 <= i10) {
            this.f70x.clear();
            if (i3 <= i10) {
                int i11 = i3;
                while (true) {
                    Object g = this.f65s.g((c2.g0) bVar.get(i11));
                    g.getClass();
                    ((s.e0) this.f70x.f59e).a(((t) g).f150a);
                    if (i11 == i10) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            this.f70x.clear();
            b1.i e2 = b1.x.e();
            Function1 e9 = e2 != null ? e2.e() : null;
            b1.i h10 = b1.x.h(e2);
            z10 = false;
            while (i10 >= i3) {
                try {
                    c2.g0 g0Var = (c2.g0) ((o0.b) m10).get(i10);
                    Object g2 = this.f65s.g(g0Var);
                    g2.getClass();
                    t tVar = (t) g2;
                    Object obj = tVar.f150a;
                    if (((s.e0) this.f70x.f59e).c(obj)) {
                        this.A++;
                        if (((Boolean) tVar.f155f.getValue()).booleanValue()) {
                            c2.k0 k0Var = g0Var.T;
                            c2.w0 w0Var = k0Var.f1606p;
                            c2.e0 e0Var = c2.e0.f1530i;
                            w0Var.f1693z = e0Var;
                            c2.s0 s0Var = k0Var.f1607q;
                            if (s0Var != null) {
                                s0Var.f1665x = e0Var;
                            }
                            f(tVar, false);
                            if (tVar.g) {
                                z10 = true;
                            }
                        }
                    } else {
                        c2.g0 g0Var2 = this.f61d;
                        g0Var2.E = true;
                        this.f65s.k(g0Var);
                        n0.q qVar = tVar.f152c;
                        if (qVar != null) {
                            qVar.l();
                        }
                        this.f61d.N(i10, 1);
                        g0Var2.E = false;
                    }
                    this.f66t.k(obj);
                    i10--;
                } catch (Throwable th) {
                    b1.x.k(e2, h10, e9);
                    throw th;
                }
            }
            b1.x.k(e2, h10, e9);
        } else {
            z10 = false;
        }
        if (z10) {
            synchronized (b1.r.f1030c) {
                s.i0 i0Var = b1.r.j.f959h;
                if (i0Var != null) {
                    if (i0Var.h()) {
                        z11 = true;
                    }
                }
            }
            if (z11) {
                b1.r.a();
            }
        }
        c();
    }

    public final void c() {
        int i3 = ((o0.b) this.f61d.m()).f7311d.f7319i;
        s.h0 h0Var = this.f65s;
        if (h0Var.f8316e != i3) {
            z1.a.a("Inconsistency between the count of nodes tracked by the state (" + h0Var.f8316e + ") and the children count on the SubcomposeLayout (" + i3 + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        if ((i3 - this.A) - this.B < 0) {
            StringBuilder i10 = n0.l.i(i3, "Incorrect state. Total children ", ". Reusable children ");
            i10.append(this.A);
            i10.append(". Precomposed children ");
            i10.append(this.B);
            z1.a.a(i10.toString());
        }
        s.h0 h0Var2 = this.f69w;
        if (h0Var2.f8316e == this.B) {
            return;
        }
        z1.a.a("Incorrect state. Precomposed children " + this.B + ". Map size " + h0Var2.f8316e);
    }

    public final void d(boolean z10) {
        this.B = 0;
        this.f69w.a();
        List m10 = this.f61d.m();
        int i3 = ((o0.b) m10).f7311d.f7319i;
        if (this.A != i3) {
            this.A = i3;
            b1.i e2 = b1.x.e();
            Function1 e9 = e2 != null ? e2.e() : null;
            b1.i h10 = b1.x.h(e2);
            for (int i10 = 0; i10 < i3; i10++) {
                try {
                    c2.g0 g0Var = (c2.g0) ((o0.b) m10).get(i10);
                    t tVar = (t) this.f65s.g(g0Var);
                    if (tVar != null && ((Boolean) tVar.f155f.getValue()).booleanValue()) {
                        c2.k0 k0Var = g0Var.T;
                        c2.w0 w0Var = k0Var.f1606p;
                        c2.e0 e0Var = c2.e0.f1530i;
                        w0Var.f1693z = e0Var;
                        c2.s0 s0Var = k0Var.f1607q;
                        if (s0Var != null) {
                            s0Var.f1665x = e0Var;
                        }
                        f(tVar, z10);
                        tVar.f150a = q.f139a;
                    }
                } catch (Throwable th) {
                    b1.x.k(e2, h10, e9);
                    throw th;
                }
            }
            b1.x.k(e2, h10, e9);
            this.f66t.a();
        }
        c();
    }

    public final void e(int i3, int i10) {
        c2.g0 g0Var = this.f61d;
        g0Var.E = true;
        g0Var.H(i3, i10, 1);
        g0Var.E = false;
    }

    public final void f(t tVar, boolean z10) {
        n0.q qVar;
        if (z10 || !tVar.g) {
            tVar.f155f = n0.h.r(Boolean.FALSE);
        } else {
            tVar.f155f.setValue(Boolean.FALSE);
        }
        tVar.getClass();
        if (z10) {
            n0.q qVar2 = tVar.f152c;
            if (qVar2 != null) {
                qVar2.k();
                return;
            }
            return;
        }
        n1 outOfFrameExecutor = c2.j0.a(this.f61d).getOutOfFrameExecutor();
        if (outOfFrameExecutor == null) {
            if (tVar.g || (qVar = tVar.f152c) == null) {
                return;
            }
            qVar.k();
            return;
        }
        a0 a0Var = new a0(0, tVar);
        d2.v vVar = (d2.v) outOfFrameExecutor;
        kotlin.collections.s sVar = vVar.f3576v;
        boolean isEmpty = sVar.isEmpty();
        sVar.addLast(a0Var);
        if (isEmpty) {
            Handler handler = vVar.getHandler();
            if (handler != null) {
                handler.postAtFrontOfQueue(vVar.f3578w);
            } else {
                te.a1.e("schedule is called when outOfFrameExecutor is not available (view is detached)");
            }
        }
    }

    @Override // n0.i
    public final void g() {
        n0.q qVar;
        c2.g0 g0Var = this.f61d;
        g0Var.E = true;
        s.h0 h0Var = this.f65s;
        Object[] objArr = h0Var.f8314c;
        long[] jArr = h0Var.f8312a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j) < 128 && (qVar = ((t) objArr[(i3 << 3) + i11]).f152c) != null) {
                            qVar.l();
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
        g0Var.M();
        g0Var.E = false;
        h0Var.a();
        this.f66t.a();
        this.B = 0;
        this.A = 0;
        this.f69w.a();
        c();
    }

    @Override // n0.i
    public final void h() {
        d(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0092 A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:27:0x005c, B:30:0x0068, B:35:0x0082, B:37:0x0092, B:38:0x00a4, B:40:0x00a8, B:41:0x00c2, B:44:0x00bf, B:45:0x0095, B:47:0x0075, B:48:0x00cc, B:49:0x00d6), top: B:26:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a8 A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:27:0x005c, B:30:0x0068, B:35:0x0082, B:37:0x0092, B:38:0x00a4, B:40:0x00a8, B:41:0x00c2, B:44:0x00bf, B:45:0x0095, B:47:0x0075, B:48:0x00cc, B:49:0x00d6), top: B:26:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bf A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:27:0x005c, B:30:0x0068, B:35:0x0082, B:37:0x0092, B:38:0x00a4, B:40:0x00a8, B:41:0x00c2, B:44:0x00bf, B:45:0x0095, B:47:0x0075, B:48:0x00cc, B:49:0x00d6), top: B:26:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0095 A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:27:0x005c, B:30:0x0068, B:35:0x0082, B:37:0x0092, B:38:0x00a4, B:40:0x00a8, B:41:0x00c2, B:44:0x00bf, B:45:0x0095, B:47:0x0075, B:48:0x00cc, B:49:0x00d6), top: B:26:0x005c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(c2.g0 g0Var, Object obj, x0.d dVar) {
        boolean z10;
        s.h0 h0Var = this.f65s;
        Object g = h0Var.g(g0Var);
        Object obj2 = g;
        if (g == null) {
            x0.d dVar2 = f.f89a;
            t tVar = new t();
            tVar.f150a = obj;
            tVar.f151b = dVar2;
            tVar.f152c = null;
            tVar.f155f = n0.h.r(Boolean.TRUE);
            h0Var.m(g0Var, tVar);
            obj2 = tVar;
        }
        t tVar2 = (t) obj2;
        int i3 = 0;
        boolean z11 = tVar2.f151b != dVar;
        n0.q qVar = tVar2.f152c;
        if (qVar != null) {
            synchronized (qVar.f6780r) {
                z10 = qVar.B.f8316e > 0;
            }
        } else {
            z10 = true;
        }
        if (z11 || z10 || tVar2.f153d) {
            tVar2.f151b = dVar;
            b1.i e2 = b1.x.e();
            Function1 e9 = e2 != null ? e2.e() : null;
            b1.i h10 = b1.x.h(e2);
            try {
                c2.g0 g0Var2 = this.f61d;
                g0Var2.E = true;
                n0.q qVar2 = tVar2.f152c;
                n0.o oVar = this.f62e;
                if (oVar == null) {
                    z1.a.c("parent composition reference not set");
                    throw new hd.d();
                }
                if (qVar2 != null) {
                    if (qVar2.I == 3) {
                    }
                    tVar2.f152c = qVar2;
                    x0.d dVar3 = tVar2.f151b;
                    if (c2.j0.a(this.f61d).getOutOfFrameExecutor() == null) {
                        tVar2.g = false;
                    } else {
                        tVar2.g = true;
                        dVar3 = new x0.d(1524156494, true, new b0(i3, tVar2, dVar3));
                    }
                    if (tVar2.f154e) {
                        qVar2.z(dVar3);
                    } else {
                        qVar2.i();
                        qVar2.p();
                        n0.i0 i0Var = qVar2.H;
                        i0Var.f6721z = 0;
                        i0Var.f6720y = true;
                        qVar2.J = dVar3;
                        qVar2.f6777d.a(qVar2, dVar3);
                        i0Var.s();
                    }
                    tVar2.f154e = false;
                    g0Var2.E = false;
                    b1.x.k(e2, h10, e9);
                    tVar2.f153d = false;
                }
                ViewGroup.LayoutParams layoutParams = t2.f3539a;
                qVar2 = new n0.q(oVar, new a1.n(g0Var));
                tVar2.f152c = qVar2;
                x0.d dVar32 = tVar2.f151b;
                if (c2.j0.a(this.f61d).getOutOfFrameExecutor() == null) {
                }
                if (tVar2.f154e) {
                }
                tVar2.f154e = false;
                g0Var2.E = false;
                b1.x.k(e2, h10, e9);
                tVar2.f153d = false;
            } catch (Throwable th) {
                b1.x.k(e2, h10, e9);
                throw th;
            }
        }
    }

    public final c2.g0 j(Object obj) {
        s.h0 h0Var;
        int i3;
        if (this.A == 0) {
            return null;
        }
        o0.b bVar = (o0.b) this.f61d.m();
        int i10 = bVar.f7311d.f7319i - this.B;
        int i11 = i10 - this.A;
        int i12 = i10 - 1;
        int i13 = i12;
        while (true) {
            h0Var = this.f65s;
            if (i13 < i11) {
                i3 = -1;
                break;
            }
            Object g = h0Var.g((c2.g0) bVar.get(i13));
            g.getClass();
            if (Intrinsics.a(((t) g).f150a, obj)) {
                i3 = i13;
                break;
            }
            i13--;
        }
        if (i3 == -1) {
            while (true) {
                if (i12 < i11) {
                    i13 = i12;
                    break;
                }
                Object g2 = h0Var.g((c2.g0) bVar.get(i12));
                g2.getClass();
                t tVar = (t) g2;
                if (tVar.f150a == q.f139a) {
                    tVar.f150a = obj;
                    i13 = i12;
                    i3 = i13;
                    break;
                }
                i12--;
            }
        }
        if (i3 == -1) {
            return null;
        }
        if (i13 != i11) {
            e(i13, i11);
        }
        this.A--;
        c2.g0 g0Var = (c2.g0) bVar.get(i11);
        Object g10 = h0Var.g(g0Var);
        g10.getClass();
        t tVar2 = (t) g10;
        tVar2.f155f = n0.h.r(Boolean.TRUE);
        tVar2.f154e = true;
        tVar2.f153d = true;
        return g0Var;
    }
}
