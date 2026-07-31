package t1;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import r0.r3;
import s0.u1;
import t1.e0;
import t1.x;
import v0.w;

/* loaded from: classes.dex */
public abstract class a implements x {

    /* renamed from: f, reason: collision with root package name */
    private final ArrayList<x.c> f21949f = new ArrayList<>(1);

    /* renamed from: g, reason: collision with root package name */
    private final HashSet<x.c> f21950g = new HashSet<>(1);

    /* renamed from: h, reason: collision with root package name */
    private final e0.a f21951h = new e0.a();

    /* renamed from: i, reason: collision with root package name */
    private final w.a f21952i = new w.a();

    /* renamed from: j, reason: collision with root package name */
    private Looper f21953j;

    /* renamed from: k, reason: collision with root package name */
    private r3 f21954k;

    /* renamed from: l, reason: collision with root package name */
    private u1 f21955l;

    protected final u1 A() {
        return (u1) o2.a.h(this.f21955l);
    }

    protected final boolean B() {
        return !this.f21950g.isEmpty();
    }

    protected abstract void C(n2.p0 p0Var);

    protected final void D(r3 r3Var) {
        this.f21954k = r3Var;
        Iterator<x.c> it = this.f21949f.iterator();
        while (it.hasNext()) {
            it.next().a(this, r3Var);
        }
    }

    protected abstract void E();

    @Override // t1.x
    public final void b(e0 e0Var) {
        this.f21951h.C(e0Var);
    }

    @Override // t1.x
    public final void d(Handler handler, e0 e0Var) {
        o2.a.e(handler);
        o2.a.e(e0Var);
        this.f21951h.g(handler, e0Var);
    }

    @Override // t1.x
    public /* synthetic */ boolean f() {
        return w.b(this);
    }

    @Override // t1.x
    public /* synthetic */ r3 g() {
        return w.a(this);
    }

    @Override // t1.x
    public final void i(x.c cVar, n2.p0 p0Var, u1 u1Var) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f21953j;
        o2.a.a(looper == null || looper == myLooper);
        this.f21955l = u1Var;
        r3 r3Var = this.f21954k;
        this.f21949f.add(cVar);
        if (this.f21953j == null) {
            this.f21953j = myLooper;
            this.f21950g.add(cVar);
            C(p0Var);
        } else if (r3Var != null) {
            k(cVar);
            cVar.a(this, r3Var);
        }
    }

    @Override // t1.x
    public final void k(x.c cVar) {
        o2.a.e(this.f21953j);
        boolean isEmpty = this.f21950g.isEmpty();
        this.f21950g.add(cVar);
        if (isEmpty) {
            z();
        }
    }

    @Override // t1.x
    public final void n(x.c cVar) {
        boolean z6 = !this.f21950g.isEmpty();
        this.f21950g.remove(cVar);
        if (z6 && this.f21950g.isEmpty()) {
            y();
        }
    }

    @Override // t1.x
    public final void p(x.c cVar) {
        this.f21949f.remove(cVar);
        if (!this.f21949f.isEmpty()) {
            n(cVar);
            return;
        }
        this.f21953j = null;
        this.f21954k = null;
        this.f21955l = null;
        this.f21950g.clear();
        E();
    }

    @Override // t1.x
    public final void q(v0.w wVar) {
        this.f21952i.t(wVar);
    }

    @Override // t1.x
    public final void r(Handler handler, v0.w wVar) {
        o2.a.e(handler);
        o2.a.e(wVar);
        this.f21952i.g(handler, wVar);
    }

    protected final w.a t(int i7, x.b bVar) {
        return this.f21952i.u(i7, bVar);
    }

    protected final w.a u(x.b bVar) {
        return this.f21952i.u(0, bVar);
    }

    protected final e0.a v(int i7, x.b bVar, long j7) {
        return this.f21951h.F(i7, bVar, j7);
    }

    protected final e0.a w(x.b bVar) {
        return this.f21951h.F(0, bVar, 0L);
    }

    protected final e0.a x(x.b bVar, long j7) {
        o2.a.e(bVar);
        return this.f21951h.F(0, bVar, j7);
    }

    protected void y() {
    }

    protected void z() {
    }
}
