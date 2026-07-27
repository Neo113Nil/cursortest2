package C;

import B1.C0097d;
import G.C0199g0;
import W2.InterfaceC0302y;
import Z.C0323u;
import b0.C0494b;
import b0.C0499g;
import f1.C0607a;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import l.AbstractC0779e;
import l.AbstractC0798y;
import l.C0778d;
import l.u0;
import l0.AbstractC0819q;
import l0.C0809g;
import l0.C0810h;
import p.C0925a;
import p.C0926b;
import p.C0927c;
import p.C0928d;
import p.C0929e;
import p.C0931g;
import p.C0932h;
import p.InterfaceC0933i;
import s0.C1166s;
import t3.C1210a;
import t3.EnumC1211b;
import w2.C1294c;
import z2.C1403G;

/* loaded from: classes.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1051a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1052b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1053c = AbstractC0779e.a(0.0f);

    /* renamed from: d, reason: collision with root package name */
    public Object f1054d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public Object f1055e;

    /* JADX WARN: Multi-variable type inference failed */
    public F(Function0 function0, boolean z4) {
        this.f1051a = z4;
        this.f1052b = (M2.p) function0;
    }

    public IOException a(boolean z4, boolean z5, IOException ioe) {
        if (ioe != null) {
            h(ioe);
        }
        q3.g call = (q3.g) this.f1052b;
        if (z5) {
            if (ioe != null) {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(ioe, "ioe");
            } else {
                Intrinsics.checkNotNullParameter(call, "call");
            }
        }
        if (z4) {
            if (ioe != null) {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(ioe, "ioe");
            } else {
                Intrinsics.checkNotNullParameter(call, "call");
            }
        }
        return call.f(this, z5, z4, ioe);
    }

    public void b(r0.G g4, float f4, long j4) {
        float floatValue = ((Number) ((C0778d) this.f1053c).d()).floatValue();
        if (floatValue > 0.0f) {
            long b4 = C0323u.b(floatValue, j4);
            if (!this.f1051a) {
                g4.V(b4, f4, (r18 & 4) != 0 ? g4.w() : 0L, 1.0f, C0499g.f5607a, null, 3);
                return;
            }
            C0494b c0494b = g4.f9624d;
            float d4 = Y.f.d(c0494b.h());
            float b5 = Y.f.b(c0494b.h());
            C0097d c0097d = c0494b.f5603e;
            long s4 = c0097d.s();
            c0097d.k().g();
            try {
                ((C0097d) ((C1294c) c0097d.f987e).f11388d).k().p(0.0f, 0.0f, d4, b5, 1);
                g4.V(b4, f4, (r18 & 4) != 0 ? g4.w() : 0L, 1.0f, C0499g.f5607a, null, 3);
            } finally {
                c0097d.k().b();
                c0097d.G(s4);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [M2.p, kotlin.jvm.functions.Function0] */
    public void c(InterfaceC0933i interfaceC0933i, InterfaceC0302y interfaceC0302y) {
        boolean z4 = interfaceC0933i instanceof C0931g;
        ArrayList arrayList = (ArrayList) this.f1054d;
        if (z4) {
            arrayList.add(interfaceC0933i);
        } else if (interfaceC0933i instanceof C0932h) {
            arrayList.remove(((C0932h) interfaceC0933i).f8971a);
        } else if (interfaceC0933i instanceof C0928d) {
            arrayList.add(interfaceC0933i);
        } else if (interfaceC0933i instanceof C0929e) {
            arrayList.remove(((C0929e) interfaceC0933i).f8967a);
        } else if (interfaceC0933i instanceof C0926b) {
            arrayList.add(interfaceC0933i);
        } else if (interfaceC0933i instanceof C0927c) {
            arrayList.remove(((C0927c) interfaceC0933i).f8966a);
        } else if (!(interfaceC0933i instanceof C0925a)) {
            return;
        } else {
            arrayList.remove(((C0925a) interfaceC0933i).f8965a);
        }
        InterfaceC0933i interfaceC0933i2 = (InterfaceC0933i) C1403G.y(arrayList);
        if (Intrinsics.a((InterfaceC0933i) this.f1055e, interfaceC0933i2)) {
            return;
        }
        if (interfaceC0933i2 != null) {
            C0113h c0113h = (C0113h) ((M2.p) this.f1052b).invoke();
            float f4 = z4 ? c0113h.f1091c : interfaceC0933i instanceof C0928d ? c0113h.f1090b : interfaceC0933i instanceof C0926b ? c0113h.f1089a : 0.0f;
            u0 u0Var = w.f1137a;
            boolean z5 = interfaceC0933i2 instanceof C0931g;
            u0 u0Var2 = w.f1137a;
            if (!z5) {
                if (interfaceC0933i2 instanceof C0928d) {
                    u0Var2 = new u0(45, AbstractC0798y.f7866b, 2);
                } else if (interfaceC0933i2 instanceof C0926b) {
                    u0Var2 = new u0(45, AbstractC0798y.f7866b, 2);
                }
            }
            W2.B.m(interfaceC0302y, null, null, new D(this, f4, u0Var2, null), 3);
        } else {
            InterfaceC0933i interfaceC0933i3 = (InterfaceC0933i) this.f1055e;
            u0 u0Var3 = w.f1137a;
            boolean z6 = interfaceC0933i3 instanceof C0931g;
            u0 u0Var4 = w.f1137a;
            if (!z6 && !(interfaceC0933i3 instanceof C0928d) && (interfaceC0933i3 instanceof C0926b)) {
                u0Var4 = new u0(150, AbstractC0798y.f7866b, 2);
            }
            W2.B.m(interfaceC0302y, null, null, new E(this, u0Var4, null), 3);
        }
        this.f1055e = interfaceC0933i2;
    }

    public m3.x d(m3.w response) {
        r3.d dVar = (r3.d) this.f1054d;
        Intrinsics.checkNotNullParameter(response, "response");
        try {
            String a4 = m3.w.a("Content-Type", response);
            long e4 = dVar.e(response);
            return new m3.x(a4, e4, m3.z.h(new q3.c(this, dVar.b(response), e4)));
        } catch (IOException ioe) {
            q3.g call = (q3.g) this.f1052b;
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(ioe, "ioe");
            h(ioe);
            throw ioe;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int e(y.t tVar, C1166s c1166s, boolean z4) {
        Object[] objArr;
        C0097d c0097d;
        int i2;
        r0.r rVar = (r0.r) this.f1055e;
        if (this.f1051a) {
            return 0;
        }
        try {
            this.f1051a = true;
            y.t x2 = ((C0607a) this.f1054d).x(tVar, c1166s);
            i.m mVar = (i.m) x2.f11494e;
            int c4 = mVar.c();
            for (int i4 = 0; i4 < c4; i4++) {
                l0.s sVar = (l0.s) mVar.d(i4);
                if (!sVar.f7926d && !sVar.f7930h) {
                }
                objArr = false;
                break;
            }
            objArr = true;
            int c5 = mVar.c();
            int i5 = 0;
            while (true) {
                c0097d = (C0097d) this.f1053c;
                if (i5 >= c5) {
                    break;
                }
                l0.s sVar2 = (l0.s) mVar.d(i5);
                if (objArr != false || AbstractC0819q.a(sVar2)) {
                    ((r0.E) this.f1052b).w(sVar2.f7925c, (r0.r) this.f1055e, AbstractC0819q.e(sVar2.f7931i, 1), true);
                    if (!rVar.isEmpty()) {
                        c0097d.b(sVar2.f7923a, rVar, AbstractC0819q.a(sVar2));
                        rVar.clear();
                    }
                }
                i5++;
            }
            ((C0810h) c0097d.f988i).d();
            boolean e4 = c0097d.e(x2, z4);
            int c6 = mVar.c();
            int i6 = 0;
            while (true) {
                if (i6 >= c6) {
                    i2 = 0;
                    break;
                }
                l0.s sVar3 = (l0.s) mVar.d(i6);
                if (!Y.c.b(AbstractC0819q.h(sVar3, true), 0L) && sVar3.b()) {
                    i2 = 2;
                    break;
                }
                i6++;
            }
            int i7 = (e4 ? 1 : 0) | i2;
            this.f1051a = false;
            return i7;
        } catch (Throwable th) {
            this.f1051a = false;
            throw th;
        }
    }

    public void f() {
        if (this.f1051a) {
            return;
        }
        i.m mVar = (i.m) ((C0607a) this.f1054d).f6561e;
        int i2 = mVar.f6928j;
        Object[] objArr = mVar.f6927i;
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            objArr[i5] = null;
        }
        mVar.f6928j = 0;
        mVar.f6925d = false;
        C0097d c0097d = (C0097d) this.f1053c;
        I.d dVar = ((C0810h) c0097d.f988i).f7906a;
        int i6 = dVar.f3332i;
        if (i6 > 0) {
            Object[] objArr2 = dVar.f3330d;
            do {
                ((C0809g) objArr2[i4]).f();
                i4++;
            } while (i4 < i6);
        }
        ((C0810h) c0097d.f988i).f7906a.g();
    }

    public m3.v g(boolean z4) {
        try {
            m3.v g4 = ((r3.d) this.f1054d).g(z4);
            if (g4 != null) {
                Intrinsics.checkNotNullParameter(this, "deferredTrailers");
                g4.f8472m = this;
            }
            return g4;
        } catch (IOException ioe) {
            q3.g call = (q3.g) this.f1052b;
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(ioe, "ioe");
            h(ioe);
            throw ioe;
        }
    }

    public void h(IOException iOException) {
        this.f1051a = true;
        ((q3.d) this.f1053c).c(iOException);
        q3.i h4 = ((r3.d) this.f1054d).h();
        q3.g call = (q3.g) this.f1052b;
        synchronized (h4) {
            try {
                Intrinsics.checkNotNullParameter(call, "call");
                if (!(iOException instanceof t3.C)) {
                    if (!(h4.f9409g != null) || (iOException instanceof C1210a)) {
                        h4.f9412j = true;
                        if (h4.f9415m == 0) {
                            q3.i.d(call.f9388d, h4.f9404b, iOException);
                            h4.f9414l++;
                        }
                    }
                } else if (((t3.C) iOException).f10747d == EnumC1211b.REFUSED_STREAM) {
                    int i2 = h4.f9416n + 1;
                    h4.f9416n = i2;
                    if (i2 > 1) {
                        h4.f9412j = true;
                        h4.f9414l++;
                    }
                } else if (((t3.C) iOException).f10747d != EnumC1211b.CANCEL || !call.f9400s) {
                    h4.f9412j = true;
                    h4.f9414l++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void i(int i2, int i4) {
        if (i2 < 0.0f) {
            throw new IllegalArgumentException(("Index should be non-negative (" + i2 + ')').toString());
        }
        ((C0199g0) this.f1052b).f(i2);
        s.u uVar = (s.u) this.f1055e;
        if (i2 != uVar.f9968e) {
            uVar.f9968e = i2;
            int i5 = (i2 / 30) * 30;
            uVar.f9967d.setValue(kotlin.ranges.b.h(Math.max(i5 - 100, 0), i5 + 130));
        }
        ((C0199g0) this.f1053c).f(i4);
    }
}
