package k0;

import T.B;
import T.C;
import T.C0097o;
import T.D;
import T.E;
import W.J;
import W.n;
import a.AbstractC0124a;
import a0.AbstractC0135a;
import a0.C0130F;
import a0.SurfaceHolderCallbackC0125A;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import i2.AbstractC0457a;
import java.util.ArrayList;
import l2.e;
import q0.C1353B;

/* loaded from: classes.dex */
public final class b extends AbstractC0135a implements Handler.Callback {

    /* renamed from: A, reason: collision with root package name */
    public E f14138A;

    /* renamed from: B, reason: collision with root package name */
    public long f14139B;

    /* renamed from: s, reason: collision with root package name */
    public final C1240a f14140s;

    /* renamed from: t, reason: collision with root package name */
    public final SurfaceHolderCallbackC0125A f14141t;

    /* renamed from: u, reason: collision with root package name */
    public final Handler f14142u;
    public final H0.a v;

    /* renamed from: w, reason: collision with root package name */
    public AbstractC0457a f14143w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f14144x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f14145y;
    public long z;

    public b(SurfaceHolderCallbackC0125A surfaceHolderCallbackC0125A, Looper looper) {
        super(5);
        this.f14141t = surfaceHolderCallbackC0125A;
        this.f14142u = looper == null ? null : new Handler(looper, this);
        this.f14140s = C1240a.f14137a;
        this.v = new H0.a(1);
        this.f14139B = -9223372036854775807L;
    }

    @Override // a0.AbstractC0135a
    public final int D(C0097o c0097o) {
        if (this.f14140s.b(c0097o)) {
            return AbstractC0135a.f(c0097o.f2854O == 0 ? 4 : 2, 0, 0, 0);
        }
        return AbstractC0135a.f(0, 0, 0, 0);
    }

    public final void G(E e4, ArrayList arrayList) {
        int i4 = 0;
        while (true) {
            D[] dArr = e4.f2655a;
            if (i4 >= dArr.length) {
                return;
            }
            C0097o a3 = dArr[i4].a();
            if (a3 != null) {
                C1240a c1240a = this.f14140s;
                if (c1240a.b(a3)) {
                    AbstractC0457a a4 = c1240a.a(a3);
                    byte[] b4 = dArr[i4].b();
                    b4.getClass();
                    H0.a aVar = this.v;
                    aVar.h();
                    aVar.j(b4.length);
                    aVar.f3781e.put(b4);
                    aVar.k();
                    E m4 = a4.m(aVar);
                    if (m4 != null) {
                        G(m4, arrayList);
                    }
                    i4++;
                }
            }
            arrayList.add(dArr[i4]);
            i4++;
        }
    }

    public final long H(long j4) {
        AbstractC0124a.t(j4 != -9223372036854775807L);
        AbstractC0124a.t(this.f14139B != -9223372036854775807L);
        return j4 - this.f14139B;
    }

    public final void I(E e4) {
        SurfaceHolderCallbackC0125A surfaceHolderCallbackC0125A = this.f14141t;
        C0130F c0130f = surfaceHolderCallbackC0125A.f3838a;
        C c4 = c0130f.f3884h0;
        n nVar = c0130f.n;
        B a3 = c4.a();
        int i4 = 0;
        while (true) {
            D[] dArr = e4.f2655a;
            if (i4 >= dArr.length) {
                break;
            }
            dArr[i4].c(a3);
            i4++;
        }
        c0130f.f3884h0 = new C(a3);
        C h2 = c0130f.h();
        if (!h2.equals(c0130f.f3862R)) {
            c0130f.f3862R = h2;
            nVar.c(14, new D0.a(13, surfaceHolderCallbackC0125A));
        }
        nVar.c(28, new D0.a(14, e4));
        nVar.b();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        I((E) message.obj);
        return true;
    }

    @Override // a0.AbstractC0135a
    public final String k() {
        return "MetadataRenderer";
    }

    @Override // a0.AbstractC0135a
    public final boolean m() {
        return this.f14145y;
    }

    @Override // a0.AbstractC0135a
    public final boolean o() {
        return true;
    }

    @Override // a0.AbstractC0135a
    public final void p() {
        this.f14138A = null;
        this.f14143w = null;
        this.f14139B = -9223372036854775807L;
    }

    @Override // a0.AbstractC0135a
    public final void r(long j4, boolean z, boolean z4) {
        this.f14138A = null;
        this.f14144x = false;
        this.f14145y = false;
    }

    @Override // a0.AbstractC0135a
    public final void w(C0097o[] c0097oArr, long j4, long j5, C1353B c1353b) {
        this.f14143w = this.f14140s.a(c0097oArr[0]);
        E e4 = this.f14138A;
        if (e4 != null) {
            long j6 = e4.f2656b;
            long j7 = (this.f14139B + j6) - j5;
            if (j6 != j7) {
                e4 = new E(j7, e4.f2655a);
            }
            this.f14138A = e4;
        }
        this.f14139B = j5;
    }

    @Override // a0.AbstractC0135a
    public final void z(long j4, long j5) {
        boolean z = true;
        while (z) {
            if (!this.f14144x && this.f14138A == null) {
                H0.a aVar = this.v;
                aVar.h();
                e eVar = this.f4039c;
                eVar.k();
                int y4 = y(eVar, aVar, 0);
                if (y4 == -4) {
                    if (aVar.g(4)) {
                        this.f14144x = true;
                    } else if (aVar.f3783g >= this.f4048l) {
                        aVar.f1083j = this.z;
                        aVar.k();
                        AbstractC0457a abstractC0457a = this.f14143w;
                        String str = J.f3263a;
                        E m4 = abstractC0457a.m(aVar);
                        if (m4 != null) {
                            ArrayList arrayList = new ArrayList(m4.f2655a.length);
                            G(m4, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.f14138A = new E(H(aVar.f3783g), (D[]) arrayList.toArray(new D[0]));
                            }
                        }
                    }
                } else if (y4 == -5) {
                    C0097o c0097o = (C0097o) eVar.f14271c;
                    c0097o.getClass();
                    this.z = c0097o.f2872s;
                }
            }
            E e4 = this.f14138A;
            if (e4 == null || e4.f2656b > H(j4)) {
                z = false;
            } else {
                E e5 = this.f14138A;
                Handler handler = this.f14142u;
                if (handler != null) {
                    handler.obtainMessage(1, e5).sendToTarget();
                } else {
                    I(e5);
                }
                this.f14138A = null;
                z = true;
            }
            if (this.f14144x && this.f14138A == null) {
                this.f14145y = true;
            }
        }
    }
}
