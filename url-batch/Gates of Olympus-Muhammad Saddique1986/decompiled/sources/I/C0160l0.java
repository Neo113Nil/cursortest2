package I;

import B.C0022x;
import android.view.Choreographer;
import e2.InterfaceC0424c;
import e2.InterfaceC0426e;
import h2.AbstractC0508a;
import java.util.ArrayList;
import p.C0758d0;
import q2.C0821h;

/* renamed from: I.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0160l0 implements X {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2830d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2831e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f2832f;

    public C0160l0(Choreographer choreographer, u0.W w2) {
        this.f2830d = 1;
        this.f2831e = choreographer;
        this.f2832f = w2;
    }

    @Override // V1.i
    public final V1.i d(V1.i iVar) {
        switch (this.f2830d) {
        }
        return AbstractC0508a.L(this, iVar);
    }

    @Override // V1.i
    public final Object e(Object obj, InterfaceC0426e interfaceC0426e) {
        switch (this.f2830d) {
        }
        return interfaceC0426e.h(obj, this);
    }

    @Override // V1.i
    public final V1.i l(V1.h hVar) {
        switch (this.f2830d) {
        }
        return AbstractC0508a.K(this, hVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b3  */
    @Override // I.X
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(InterfaceC0424c interfaceC0424c, V1.d dVar) {
        C0158k0 c0158k0;
        Object obj;
        W1.a aVar;
        int i3;
        boolean z3;
        Object q3;
        C0160l0 c0160l0;
        switch (this.f2830d) {
            case 0:
                if (dVar instanceof C0158k0) {
                    c0158k0 = (C0158k0) dVar;
                    int i4 = c0158k0.f2828k;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        c0158k0.f2828k = i4 - Integer.MIN_VALUE;
                        obj = c0158k0.f2826i;
                        aVar = W1.a.f4608d;
                        i3 = c0158k0.f2828k;
                        if (i3 != 0) {
                            R1.a.e(obj);
                            S s3 = (S) this.f2832f;
                            c0158k0.f2824g = this;
                            c0158k0.f2825h = interfaceC0424c;
                            c0158k0.f2828k = 1;
                            synchronized (s3.f2753b) {
                                z3 = s3.f2752a;
                            }
                            if (z3) {
                                q3 = R1.y.f4171a;
                            } else {
                                C0821h c0821h = new C0821h(1, l0.c.B(c0158k0));
                                c0821h.r();
                                synchronized (s3.f2753b) {
                                    ((ArrayList) s3.f2754c).add(c0821h);
                                }
                                c0821h.v(new C0022x(s3, 7, c0821h));
                                q3 = c0821h.q();
                                if (q3 != aVar) {
                                    q3 = R1.y.f4171a;
                                }
                            }
                            if (q3 == aVar) {
                                return aVar;
                            }
                            c0160l0 = this;
                        } else {
                            if (i3 != 1) {
                                if (i3 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                R1.a.e(obj);
                                return obj;
                            }
                            interfaceC0424c = c0158k0.f2825h;
                            c0160l0 = c0158k0.f2824g;
                            R1.a.e(obj);
                        }
                        X x3 = (X) c0160l0.f2831e;
                        c0158k0.f2824g = null;
                        c0158k0.f2825h = null;
                        c0158k0.f2828k = 2;
                        obj = x3.n(interfaceC0424c, c0158k0);
                        if (obj == aVar) {
                            return aVar;
                        }
                        return obj;
                    }
                }
                c0158k0 = new C0158k0(this, dVar);
                obj = c0158k0.f2826i;
                aVar = W1.a.f4608d;
                i3 = c0158k0.f2828k;
                if (i3 != 0) {
                }
                X x32 = (X) c0160l0.f2831e;
                c0158k0.f2824g = null;
                c0158k0.f2825h = null;
                c0158k0.f2828k = 2;
                obj = x32.n(interfaceC0424c, c0158k0);
                if (obj == aVar) {
                }
                return obj;
            default:
                u0.W w2 = (u0.W) this.f2832f;
                if (w2 == null) {
                    V1.g v3 = dVar.t().v(V1.e.f4557d);
                    w2 = v3 instanceof u0.W ? (u0.W) v3 : null;
                }
                C0821h c0821h2 = new C0821h(1, l0.c.B(dVar));
                c0821h2.r();
                C c2 = new C(c0821h2, this, interfaceC0424c);
                if (w2 == null || !f2.j.a(w2.f9280f, (Choreographer) this.f2831e)) {
                    ((Choreographer) this.f2831e).postFrameCallback(c2);
                    c0821h2.v(new C0758d0(this, 10, c2));
                } else {
                    synchronized (w2.f9282h) {
                        w2.f9284j.add(c2);
                        if (!w2.f9287m) {
                            w2.f9287m = true;
                            w2.f9280f.postFrameCallback(w2.f9288n);
                        }
                    }
                    c0821h2.v(new C0758d0(w2, 9, c2));
                }
                return c0821h2.q();
        }
    }

    @Override // V1.i
    public final V1.g v(V1.h hVar) {
        switch (this.f2830d) {
        }
        return AbstractC0508a.C(this, hVar);
    }

    public C0160l0(X x3) {
        this.f2830d = 0;
        this.f2831e = x3;
        this.f2832f = new S();
    }
}
