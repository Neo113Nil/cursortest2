package u1;

import android.os.Handler;
import android.view.ViewGroup;
import java.util.List;
import m0.k1;
import m0.l1;
import w1.i1;
import w1.y1;
import x1.j2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class a0 implements m0.j {

    /* renamed from: d, reason: collision with root package name */
    public final w1.f0 f7169d;

    /* renamed from: e, reason: collision with root package name */
    public m0.v f7170e;

    /* renamed from: f, reason: collision with root package name */
    public y0 f7171f;

    /* renamed from: g, reason: collision with root package name */
    public int f7172g;

    /* renamed from: h, reason: collision with root package name */
    public int f7173h;
    public final o.j0 i;

    /* renamed from: j, reason: collision with root package name */
    public final o.j0 f7174j;

    /* renamed from: k, reason: collision with root package name */
    public final v f7175k;

    /* renamed from: l, reason: collision with root package name */
    public final s f7176l;

    /* renamed from: m, reason: collision with root package name */
    public final o.j0 f7177m;

    /* renamed from: n, reason: collision with root package name */
    public final o.w0 f7178n;

    /* renamed from: o, reason: collision with root package name */
    public final o.j0 f7179o;

    /* renamed from: p, reason: collision with root package name */
    public final o0.e f7180p;

    /* renamed from: q, reason: collision with root package name */
    public int f7181q;

    /* renamed from: r, reason: collision with root package name */
    public int f7182r;

    public a0(w1.f0 f0Var, y0 y0Var) {
        this.f7169d = f0Var;
        this.f7171f = y0Var;
        long[] jArr = o.r0.f5528a;
        this.i = new o.j0();
        this.f7174j = new o.j0();
        this.f7175k = new v(this);
        this.f7176l = new s(this);
        this.f7177m = new o.j0();
        this.f7178n = new o.w0();
        this.f7179o = new o.j0();
        this.f7180p = new o0.e(new Object[16]);
    }

    public static void c(t tVar) {
        o.k0 k0Var;
        k1 k1Var = tVar.f7272f;
        if (k1Var != null) {
            k1Var.f4994h.set(l1.f5008e);
            u0.i iVar = k1Var.f4995j;
            if (iVar.f7157d.h()) {
                k0Var = iVar.f7157d;
                o.k0 k0Var2 = o.s0.f5536a;
                iVar.f7157d = new o.k0();
                iVar.f7156c.g();
            } else {
                k0Var = null;
            }
            iVar.b();
            m0.y yVar = k1Var.f4987a;
            yVar.f5179t = null;
            if (k0Var != null) {
                yVar.f5183x.f7163k = k0Var;
                yVar.f5185z = 2;
            }
            tVar.f7272f = null;
            m0.y yVar2 = tVar.f7269c;
            if (yVar2 != null) {
                yVar2.m();
            }
            tVar.f7269c = null;
        }
    }

    @Override // m0.j
    public final void a() {
        m0.y yVar;
        w1.f0 f0Var = this.f7169d;
        f0Var.f7652r = true;
        o.j0 j0Var = this.i;
        Object[] objArr = j0Var.f5484c;
        long[] jArr = j0Var.f5482a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j7 = jArr[i];
                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i8 = 8 - ((~(i - length)) >>> 31);
                    for (int i9 = 0; i9 < i8; i9++) {
                        if ((255 & j7) < 128 && (yVar = ((t) objArr[(i << 3) + i9]).f7269c) != null) {
                            yVar.m();
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
        f0Var.O();
        f0Var.f7652r = false;
        j0Var.a();
        this.f7174j.a();
        this.f7182r = 0;
        this.f7181q = 0;
        this.f7177m.a();
        e();
    }

    @Override // m0.j
    public final void b() {
        f(true);
    }

    public final void d(int i) {
        boolean z3;
        boolean z7 = false;
        this.f7181q = 0;
        List n6 = this.f7169d.n();
        o0.b bVar = (o0.b) n6;
        int i8 = (bVar.f5572d.f5580f - this.f7182r) - 1;
        if (i <= i8) {
            this.f7178n.clear();
            if (i <= i8) {
                int i9 = i;
                while (true) {
                    Object g3 = this.i.g((w1.f0) bVar.get(i9));
                    q6.i.b(g3);
                    ((o.f0) this.f7178n.f5562e).a(((t) g3).f7267a);
                    if (i9 == i8) {
                        break;
                    } else {
                        i9++;
                    }
                }
            }
            this.f7171f.g(this.f7178n);
            w0.f e8 = w0.q.e();
            p6.c e9 = e8 != null ? e8.e() : null;
            w0.f h8 = w0.q.h(e8);
            z3 = false;
            while (i8 >= i) {
                try {
                    w1.f0 f0Var = (w1.f0) ((o0.b) n6).get(i8);
                    Object g7 = this.i.g(f0Var);
                    q6.i.b(g7);
                    t tVar = (t) g7;
                    Object obj = tVar.f7267a;
                    if (((o.f0) this.f7178n.f5562e).c(obj)) {
                        this.f7181q++;
                        if (((Boolean) tVar.f7273g.getValue()).booleanValue()) {
                            w1.j0 j0Var = f0Var.G;
                            w1.w0 w0Var = j0Var.f7700p;
                            w1.d0 d0Var = w1.d0.f7612f;
                            w0Var.f7805o = d0Var;
                            w1.s0 s0Var = j0Var.f7701q;
                            if (s0Var != null) {
                                s0Var.f7765m = d0Var;
                            }
                            g(tVar, false);
                            if (tVar.f7274h) {
                                z3 = true;
                            }
                        }
                    } else {
                        w1.f0 f0Var2 = this.f7169d;
                        f0Var2.f7652r = true;
                        this.i.k(f0Var);
                        m0.y yVar = tVar.f7269c;
                        if (yVar != null) {
                            yVar.m();
                        }
                        this.f7169d.P(i8, 1);
                        f0Var2.f7652r = false;
                    }
                    this.f7174j.k(obj);
                    i8--;
                } catch (Throwable th) {
                    w0.q.k(e8, h8, e9);
                    throw th;
                }
            }
            w0.q.k(e8, h8, e9);
        } else {
            z3 = false;
        }
        if (z3) {
            synchronized (w0.m.f7537c) {
                o.k0 k0Var = w0.m.f7543j.f7505h;
                if (k0Var != null) {
                    if (k0Var.h()) {
                        z7 = true;
                    }
                }
            }
            if (z7) {
                w0.m.a();
            }
        }
        e();
    }

    public final void e() {
        int i = ((o0.b) this.f7169d.n()).f5572d.f5580f;
        o.j0 j0Var = this.i;
        if (j0Var.f5486e != i) {
            t1.a.a("Inconsistency between the count of nodes tracked by the state (" + j0Var.f5486e + ") and the children count on the SubcomposeLayout (" + i + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        if ((i - this.f7181q) - this.f7182r < 0) {
            StringBuilder l3 = a0.q.l("Incorrect state. Total children ", i, ". Reusable children ");
            l3.append(this.f7181q);
            l3.append(". Precomposed children ");
            l3.append(this.f7182r);
            t1.a.a(l3.toString());
        }
        o.j0 j0Var2 = this.f7177m;
        if (j0Var2.f5486e == this.f7182r) {
            return;
        }
        t1.a.a("Incorrect state. Precomposed children " + this.f7182r + ". Map size " + j0Var2.f5486e);
    }

    public final void f(boolean z3) {
        this.f7182r = 0;
        this.f7177m.a();
        List n6 = this.f7169d.n();
        int i = ((o0.b) n6).f5572d.f5580f;
        if (this.f7181q != i) {
            this.f7181q = i;
            w0.f e8 = w0.q.e();
            p6.c e9 = e8 != null ? e8.e() : null;
            w0.f h8 = w0.q.h(e8);
            for (int i8 = 0; i8 < i; i8++) {
                try {
                    w1.f0 f0Var = (w1.f0) ((o0.b) n6).get(i8);
                    t tVar = (t) this.i.g(f0Var);
                    if (tVar != null && ((Boolean) tVar.f7273g.getValue()).booleanValue()) {
                        w1.j0 j0Var = f0Var.G;
                        w1.w0 w0Var = j0Var.f7700p;
                        w1.d0 d0Var = w1.d0.f7612f;
                        w0Var.f7805o = d0Var;
                        w1.s0 s0Var = j0Var.f7701q;
                        if (s0Var != null) {
                            s0Var.f7765m = d0Var;
                        }
                        g(tVar, z3);
                        tVar.f7267a = s0.f7266a;
                    }
                } catch (Throwable th) {
                    w0.q.k(e8, h8, e9);
                    throw th;
                }
            }
            w0.q.k(e8, h8, e9);
            this.f7174j.a();
        }
        e();
    }

    public final void g(t tVar, boolean z3) {
        m0.y yVar;
        if (z3 || !tVar.f7274h) {
            tVar.f7273g = m0.b.q(Boolean.FALSE);
        } else {
            tVar.f7273g.setValue(Boolean.FALSE);
        }
        if (tVar.f7272f != null) {
            c(tVar);
            return;
        }
        if (z3) {
            m0.y yVar2 = tVar.f7269c;
            if (yVar2 != null) {
                yVar2.l();
                return;
            }
            return;
        }
        i1 outOfFrameExecutor = ((x1.t) w1.i0.a(this.f7169d)).getOutOfFrameExecutor();
        if (outOfFrameExecutor == null) {
            if (tVar.f7274h || (yVar = tVar.f7269c) == null) {
                return;
            }
            yVar.l();
            return;
        }
        d1.o oVar = new d1.o(8, tVar);
        Handler handler = ((x1.t) outOfFrameExecutor).getHandler();
        if (handler == null) {
            throw new IllegalArgumentException("schedule is called when outOfFrameExecutor is not available (view is detached)");
        }
        handler.postAtFrontOfQueue(new a1.a(11, oVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00f6 A[Catch: all -> 0x00c4, TryCatch #1 {all -> 0x00c4, blocks: (B:56:0x00ad, B:59:0x00b9, B:64:0x00e4, B:66:0x00f6, B:68:0x010a, B:70:0x010e, B:71:0x0144, B:74:0x011b, B:75:0x0126, B:77:0x012a, B:78:0x0141, B:79:0x00f9, B:82:0x00c9, B:84:0x00d7, B:85:0x014e, B:86:0x0158), top: B:55:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x010a A[Catch: all -> 0x00c4, TryCatch #1 {all -> 0x00c4, blocks: (B:56:0x00ad, B:59:0x00b9, B:64:0x00e4, B:66:0x00f6, B:68:0x010a, B:70:0x010e, B:71:0x0144, B:74:0x011b, B:75:0x0126, B:77:0x012a, B:78:0x0141, B:79:0x00f9, B:82:0x00c9, B:84:0x00d7, B:85:0x014e, B:86:0x0158), top: B:55:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0126 A[Catch: all -> 0x00c4, TryCatch #1 {all -> 0x00c4, blocks: (B:56:0x00ad, B:59:0x00b9, B:64:0x00e4, B:66:0x00f6, B:68:0x010a, B:70:0x010e, B:71:0x0144, B:74:0x011b, B:75:0x0126, B:77:0x012a, B:78:0x0141, B:79:0x00f9, B:82:0x00c9, B:84:0x00d7, B:85:0x014e, B:86:0x0158), top: B:55:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f9 A[Catch: all -> 0x00c4, TryCatch #1 {all -> 0x00c4, blocks: (B:56:0x00ad, B:59:0x00b9, B:64:0x00e4, B:66:0x00f6, B:68:0x010a, B:70:0x010e, B:71:0x0144, B:74:0x011b, B:75:0x0126, B:77:0x012a, B:78:0x0141, B:79:0x00f9, B:82:0x00c9, B:84:0x00d7, B:85:0x014e, B:86:0x0158), top: B:55:0x00ad }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(w1.f0 f0Var, Object obj, boolean z3, p6.e eVar) {
        boolean z7;
        m0.y yVar;
        o.j0 j0Var = this.i;
        Object g3 = j0Var.g(f0Var);
        Object obj2 = g3;
        if (g3 == null) {
            u0.c cVar = i.f7222a;
            t tVar = new t();
            tVar.f7267a = obj;
            tVar.f7268b = cVar;
            tVar.f7269c = null;
            tVar.f7273g = m0.b.q(Boolean.TRUE);
            j0Var.m(f0Var, tVar);
            obj2 = tVar;
        }
        t tVar2 = (t) obj2;
        int i = 1;
        boolean z8 = tVar2.f7268b != eVar;
        if (tVar2.f7272f != null) {
            if (z8) {
                c(tVar2);
            } else {
                if (z3) {
                    return;
                }
                k1 k1Var = tVar2.f7272f;
                if (k1Var != null) {
                    w0.f e8 = w0.q.e();
                    p6.c e9 = e8 != null ? e8.e() : null;
                    w0.f h8 = w0.q.h(e8);
                    try {
                        w1.f0 f0Var2 = this.f7169d;
                        f0Var2.f7652r = true;
                        while (!k1Var.c()) {
                            k1Var.f(new c5.n(15));
                        }
                        k1Var.a();
                        tVar2.f7272f = null;
                        f0Var2.f7652r = false;
                        w0.q.k(e8, h8, e9);
                    } finally {
                    }
                }
            }
        }
        m0.y yVar2 = tVar2.f7269c;
        if (yVar2 != null) {
            synchronized (yVar2.f5167g) {
                z7 = yVar2.f5176q.f5486e > 0;
            }
        } else {
            z7 = true;
        }
        if (z8 || z7 || tVar2.f7270d) {
            tVar2.f7268b = eVar;
            if (tVar2.f7272f != null) {
                t1.a.a("new subcompose call while paused composition is still active");
            }
            w0.f e10 = w0.q.e();
            p6.c e11 = e10 != null ? e10.e() : null;
            w0.f h9 = w0.q.h(e10);
            try {
                w1.f0 f0Var3 = this.f7169d;
                f0Var3.f7652r = true;
                m0.y yVar3 = tVar2.f7269c;
                m0.v vVar = this.f7170e;
                if (vVar == null) {
                    t1.a.c("parent composition reference not set");
                    throw new a5.c();
                }
                if (yVar3 != null) {
                    if (yVar3.f5185z == 3) {
                    }
                    tVar2.f7269c = yVar3;
                    p6.e eVar2 = tVar2.f7268b;
                    if (((x1.t) w1.i0.a(this.f7169d)).getOutOfFrameExecutor() == null) {
                        tVar2.f7274h = false;
                    } else {
                        tVar2.f7274h = true;
                        eVar2 = new u0.c(1524156494, true, new a1.g(i, tVar2, eVar2));
                    }
                    if (z3) {
                        if (tVar2.f7271e) {
                            yVar3.i();
                            yVar3.q();
                            m0.s sVar = yVar3.f5184y;
                            sVar.f5097z = 100;
                            sVar.f5096y = true;
                            yVar3.f5164d.a(yVar3, eVar2);
                            sVar.s();
                        } else {
                            yVar3.B(eVar2);
                        }
                    } else if (tVar2.f7271e) {
                        yVar3.i();
                        yVar3.q();
                        tVar2.f7272f = yVar3.k(true, eVar2);
                    } else {
                        tVar2.f7272f = yVar3.k(yVar3.i(), eVar2);
                    }
                    tVar2.f7271e = false;
                    f0Var3.f7652r = false;
                    w0.q.k(e10, h9, e11);
                    tVar2.f7270d = false;
                }
                if (z3) {
                    ViewGroup.LayoutParams layoutParams = j2.f8485a;
                    yVar = new m0.y(vVar, new y1(f0Var));
                } else {
                    ViewGroup.LayoutParams layoutParams2 = j2.f8485a;
                    yVar = new m0.y(vVar, new y1(f0Var));
                }
                yVar3 = yVar;
                tVar2.f7269c = yVar3;
                p6.e eVar22 = tVar2.f7268b;
                if (((x1.t) w1.i0.a(this.f7169d)).getOutOfFrameExecutor() == null) {
                }
                if (z3) {
                }
                tVar2.f7271e = false;
                f0Var3.f7652r = false;
                w0.q.k(e10, h9, e11);
                tVar2.f7270d = false;
            } finally {
            }
        }
    }

    public final w1.f0 i(Object obj) {
        o.j0 j0Var;
        int i;
        if (this.f7181q == 0) {
            return null;
        }
        w1.f0 f0Var = this.f7169d;
        o0.b bVar = (o0.b) f0Var.n();
        int i8 = bVar.f5572d.f5580f - this.f7182r;
        int i9 = i8 - this.f7181q;
        int i10 = i8 - 1;
        int i11 = i10;
        while (true) {
            j0Var = this.i;
            if (i11 < i9) {
                i = -1;
                break;
            }
            Object g3 = j0Var.g((w1.f0) bVar.get(i11));
            q6.i.b(g3);
            if (((t) g3).f7267a.equals(obj)) {
                i = i11;
                break;
            }
            i11--;
        }
        if (i == -1) {
            while (i10 >= i9) {
                Object g7 = j0Var.g((w1.f0) bVar.get(i10));
                q6.i.b(g7);
                t tVar = (t) g7;
                Object obj2 = tVar.f7267a;
                if (obj2 == s0.f7266a || this.f7171f.h(obj, obj2)) {
                    tVar.f7267a = obj;
                    i11 = i10;
                    i = i11;
                    break;
                }
                i10--;
            }
            i11 = i10;
        }
        if (i == -1) {
            return null;
        }
        if (i11 != i9) {
            f0Var.f7652r = true;
            f0Var.K(i11, i9, 1);
            f0Var.f7652r = false;
        }
        this.f7181q--;
        w1.f0 f0Var2 = (w1.f0) bVar.get(i9);
        Object g8 = j0Var.g(f0Var2);
        q6.i.b(g8);
        t tVar2 = (t) g8;
        tVar2.f7273g = m0.b.q(Boolean.TRUE);
        tVar2.f7271e = true;
        tVar2.f7270d = true;
        return f0Var2;
    }
}
