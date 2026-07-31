package I;

import android.view.Choreographer;
import java.util.ArrayList;
import k2.C0536h;

/* renamed from: I.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0106l0 implements Y {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2273d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2274e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f2275f;

    public C0106l0(Choreographer choreographer, u0.S s3) {
        this.f2273d = 1;
        this.f2274e = choreographer;
        this.f2275f = s3;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b4  */
    @Override // I.Y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(Y1.c cVar, R1.c cVar2) {
        C0104k0 c0104k0;
        Object obj;
        Q1.a aVar;
        int i3;
        boolean z3;
        Object p;
        C0106l0 c0106l0;
        u0.S s3 = null;
        switch (this.f2273d) {
            case 0:
                if (cVar2 instanceof C0104k0) {
                    c0104k0 = (C0104k0) cVar2;
                    int i4 = c0104k0.f2271h;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        c0104k0.f2271h = i4 - Integer.MIN_VALUE;
                        obj = c0104k0.f2269f;
                        aVar = Q1.a.f3113d;
                        i3 = c0104k0.f2271h;
                        if (i3 != 0) {
                            I2.l.Q(obj);
                            T t3 = (T) this.f2275f;
                            c0104k0.f2267d = this;
                            c0104k0.f2268e = cVar;
                            c0104k0.f2271h = 1;
                            synchronized (t3.f2198b) {
                                z3 = t3.f2197a;
                            }
                            if (z3) {
                                p = L1.z.f2729a;
                            } else {
                                C0536h c0536h = new C0536h(1, M1.B.G(c0104k0));
                                c0536h.q();
                                synchronized (t3.f2198b) {
                                    ((ArrayList) t3.f2199c).add(c0536h);
                                }
                                c0536h.s(new F.D0(t3, 3, c0536h));
                                p = c0536h.p();
                                if (p != aVar) {
                                    p = L1.z.f2729a;
                                }
                            }
                            if (p == aVar) {
                                return aVar;
                            }
                            c0106l0 = this;
                        } else {
                            if (i3 != 1) {
                                if (i3 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                I2.l.Q(obj);
                                return obj;
                            }
                            cVar = c0104k0.f2268e;
                            c0106l0 = c0104k0.f2267d;
                            I2.l.Q(obj);
                        }
                        Y y3 = (Y) c0106l0.f2274e;
                        c0104k0.f2267d = null;
                        c0104k0.f2268e = null;
                        c0104k0.f2271h = 2;
                        obj = y3.j(cVar, c0104k0);
                        if (obj == aVar) {
                            return aVar;
                        }
                        return obj;
                    }
                }
                c0104k0 = new C0104k0(this, cVar2);
                obj = c0104k0.f2269f;
                aVar = Q1.a.f3113d;
                i3 = c0104k0.f2271h;
                if (i3 != 0) {
                }
                Y y32 = (Y) c0106l0.f2274e;
                c0104k0.f2267d = null;
                c0104k0.f2268e = null;
                c0104k0.f2271h = 2;
                obj = y32.j(cVar, c0104k0);
                if (obj == aVar) {
                }
                return obj;
            default:
                u0.S s4 = (u0.S) this.f2275f;
                if (s4 == null) {
                    P1.g k3 = cVar2.getContext().k(P1.e.f3072d);
                    if (k3 instanceof u0.S) {
                        s3 = (u0.S) k3;
                    }
                } else {
                    s3 = s4;
                }
                C0536h c0536h2 = new C0536h(1, M1.B.G(cVar2));
                c0536h2.q();
                C c3 = new C(c0536h2, this, cVar);
                if (s3 == null || !Z1.i.a(s3.f8235f, (Choreographer) this.f2274e)) {
                    ((Choreographer) this.f2274e).postFrameCallback(c3);
                    c0536h2.s(new t.o(this, 5, c3));
                } else {
                    synchronized (s3.f8237h) {
                        s3.f8239j.add(c3);
                        if (!s3.f8242m) {
                            s3.f8242m = true;
                            s3.f8235f.postFrameCallback(s3.f8243n);
                        }
                    }
                    c0536h2.s(new t.o(s3, 4, c3));
                }
                Object p3 = c0536h2.p();
                Q1.a aVar2 = Q1.a.f3113d;
                return p3;
        }
    }

    @Override // P1.i
    public final P1.g k(P1.h hVar) {
        switch (this.f2273d) {
        }
        return I2.l.A(this, hVar);
    }

    @Override // P1.i
    public final P1.i o(P1.i iVar) {
        switch (this.f2273d) {
        }
        return I2.l.M(this, iVar);
    }

    @Override // P1.i
    public final Object r(Object obj, Y1.e eVar) {
        switch (this.f2273d) {
        }
        return eVar.g(obj, this);
    }

    @Override // P1.i
    public final P1.i x(P1.h hVar) {
        switch (this.f2273d) {
        }
        return I2.l.H(this, hVar);
    }

    public C0106l0(Y y3) {
        this.f2273d = 0;
        this.f2274e = y3;
        this.f2275f = new T();
    }
}
