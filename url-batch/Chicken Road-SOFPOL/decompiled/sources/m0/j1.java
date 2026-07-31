package m0;

import android.view.Choreographer;
import java.util.ArrayList;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class j1 implements w0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4975d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f4976e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f4977f;

    public j1(Choreographer choreographer, x1.m0 m0Var) {
        this.f4975d = 1;
        this.f4976e = choreographer;
        this.f4977f = m0Var;
    }

    @Override // g6.h
    public final g6.h c(g6.h hVar) {
        switch (this.f4975d) {
        }
        return a.a.v(this, hVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d8, code lost:
    
        if (r8 == r1) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0099  */
    @Override // m0.w0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(p6.c cVar, i6.c cVar2) {
        i1 i1Var;
        h6.a aVar;
        int i;
        boolean z3;
        Object s5;
        Object d8;
        switch (this.f4975d) {
            case 0:
                if (cVar2 instanceof i1) {
                    i1Var = (i1) cVar2;
                    int i8 = i1Var.f4951j;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        i1Var.f4951j = i8 - Integer.MIN_VALUE;
                        Object obj = i1Var.f4950h;
                        aVar = h6.a.f3204d;
                        i = i1Var.f4951j;
                        if (i != 0) {
                            s6.a.K(obj);
                            a0.f1 f1Var = (a0.f1) this.f4977f;
                            i1Var.f4949g = cVar;
                            i1Var.f4951j = 1;
                            synchronized (f1Var.f79b) {
                                z3 = f1Var.f78a;
                            }
                            if (!z3) {
                                a7.h hVar = new a7.h(1, m.a.G(i1Var));
                                hVar.t();
                                synchronized (f1Var.f79b) {
                                    ((ArrayList) f1Var.f80c).add(hVar);
                                }
                                hVar.v(new s0(0, f1Var, hVar));
                                s5 = hVar.s();
                                if (s5 != aVar) {
                                    s5 = c6.m.f1757a;
                                    break;
                                }
                            } else {
                                s5 = c6.m.f1757a;
                                break;
                            }
                        } else {
                            if (i != 1) {
                                if (i != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                s6.a.K(obj);
                                return obj;
                            }
                            cVar = i1Var.f4949g;
                            s6.a.K(obj);
                        }
                        w0 w0Var = (w0) this.f4976e;
                        i1Var.f4949g = null;
                        i1Var.f4951j = 2;
                        d8 = w0Var.d(cVar, i1Var);
                        if (d8 != aVar) {
                            return d8;
                        }
                        return aVar;
                    }
                }
                i1Var = new i1(this, cVar2);
                Object obj2 = i1Var.f4950h;
                aVar = h6.a.f3204d;
                i = i1Var.f4951j;
                if (i != 0) {
                }
                w0 w0Var2 = (w0) this.f4976e;
                i1Var.f4949g = null;
                i1Var.f4951j = 2;
                d8 = w0Var2.d(cVar, i1Var);
                if (d8 != aVar) {
                }
                return aVar;
            default:
                x1.m0 m0Var = (x1.m0) this.f4977f;
                a7.h hVar2 = new a7.h(1, m.a.G(cVar2));
                hVar2.t();
                x1.n0 n0Var = new x1.n0(hVar2, this, cVar);
                if (q6.i.a(m0Var.f8500f, (Choreographer) this.f4976e)) {
                    synchronized (m0Var.f8502h) {
                        m0Var.f8503j.add(n0Var);
                        if (!m0Var.f8506m) {
                            m0Var.f8506m = true;
                            m0Var.f8500f.postFrameCallback(m0Var.f8507n);
                        }
                    }
                    hVar2.v(new f1.n(6, m0Var, n0Var));
                } else {
                    ((Choreographer) this.f4976e).postFrameCallback(n0Var);
                    hVar2.v(new f1.n(7, this, n0Var));
                }
                return hVar2.s();
        }
    }

    @Override // g6.h
    public final Object g(Object obj, p6.e eVar) {
        switch (this.f4975d) {
        }
        return eVar.g(obj, this);
    }

    @Override // g6.h
    public final g6.f l(g6.g gVar) {
        switch (this.f4975d) {
        }
        return a.a.j(this, gVar);
    }

    @Override // g6.h
    public final g6.h v(g6.g gVar) {
        switch (this.f4975d) {
        }
        return a.a.s(this, gVar);
    }

    public j1(w0 w0Var) {
        this.f4975d = 0;
        this.f4976e = w0Var;
        this.f4977f = new a0.f1();
    }
}
