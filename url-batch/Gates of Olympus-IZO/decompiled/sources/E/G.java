package E;

import D1.C0014b;
import H2.C0079a;
import a.AbstractC0157a;
import b0.C0288u;
import d0.C0321b;
import d0.C0325f;
import j.C0494l;
import java.io.IOException;
import java.util.ArrayList;
import k2.AbstractC0552y;
import k2.InterfaceC0550w;
import m.AbstractC0595e;
import m.AbstractC0614y;
import m.C0593d;
import m.x0;
import q.C0766a;
import q.C0767b;
import q.C0768c;
import q.C0769d;
import q.C0770e;
import q.C0771f;
import u0.C0997t;

/* loaded from: classes.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    public boolean f621a;

    /* renamed from: b, reason: collision with root package name */
    public Object f622b;

    /* renamed from: c, reason: collision with root package name */
    public Object f623c = AbstractC0595e.a();

    /* renamed from: d, reason: collision with root package name */
    public Object f624d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public Object f625e;

    /* JADX WARN: Multi-variable type inference failed */
    public G(boolean z3, Y1.a aVar) {
        this.f621a = z3;
        this.f622b = (Z1.j) aVar;
    }

    public IOException a(boolean z3, boolean z4, IOException iOException) {
        if (iOException != null) {
            h(iOException);
        }
        E2.h hVar = (E2.h) this.f622b;
        if (z4) {
            if (iOException != null) {
                Z1.i.f(hVar, "call");
            } else {
                Z1.i.f(hVar, "call");
            }
        }
        if (z3) {
            if (iOException != null) {
                Z1.i.f(hVar, "call");
            } else {
                Z1.i.f(hVar, "call");
            }
        }
        return hVar.f(this, z4, z3, iOException);
    }

    public void b(t0.F f3, float f4, long j3) {
        float floatValue = ((Number) ((C0593d) this.f623c).d()).floatValue();
        if (floatValue > 0.0f) {
            long b2 = C0288u.b(j3, floatValue);
            if (!this.f621a) {
                f3.h0(b2, f4, (r18 & 4) != 0 ? f3.w() : 0L, 1.0f, C0325f.f4448b, null, 3);
                return;
            }
            C0321b c0321b = f3.f7748d;
            float d3 = a0.f.d(c0321b.c());
            float b3 = a0.f.b(c0321b.c());
            C0014b c0014b = c0321b.f4444e;
            long m3 = c0014b.m();
            c0014b.h().f();
            try {
                ((C0014b) ((A2.g) c0014b.f536b).f83b).h().q(0.0f, 0.0f, d3, b3, 1);
                f3.h0(b2, f4, (r18 & 4) != 0 ? f3.w() : 0L, 1.0f, C0325f.f4448b, null, 3);
            } finally {
                c0014b.h().a();
                c0014b.y(m3);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [Y1.a, Z1.j] */
    public void c(q.h hVar, InterfaceC0550w interfaceC0550w) {
        boolean z3 = hVar instanceof C0771f;
        ArrayList arrayList = (ArrayList) this.f624d;
        if (z3) {
            arrayList.add(hVar);
        } else if (hVar instanceof q.g) {
            arrayList.remove(((q.g) hVar).f6816a);
        } else if (hVar instanceof C0769d) {
            arrayList.add(hVar);
        } else if (hVar instanceof C0770e) {
            arrayList.remove(((C0770e) hVar).f6815a);
        } else if (hVar instanceof C0767b) {
            arrayList.add(hVar);
        } else if (hVar instanceof C0768c) {
            arrayList.remove(((C0768c) hVar).f6814a);
        } else if (!(hVar instanceof C0766a)) {
            return;
        } else {
            arrayList.remove(((C0766a) hVar).f6813a);
        }
        q.h hVar2 = (q.h) M1.l.t0(arrayList);
        if (Z1.i.a((q.h) this.f625e, hVar2)) {
            return;
        }
        if (hVar2 != null) {
            C0027i c0027i = (C0027i) ((Z1.j) this.f622b).b();
            float f3 = z3 ? c0027i.f662c : hVar instanceof C0769d ? c0027i.f661b : hVar instanceof C0767b ? c0027i.f660a : 0.0f;
            x0 x0Var = x.f708a;
            boolean z4 = hVar2 instanceof C0771f;
            x0 x0Var2 = x.f708a;
            if (!z4) {
                if (hVar2 instanceof C0769d) {
                    x0Var2 = new x0(45, 0, AbstractC0614y.f5882c);
                } else if (hVar2 instanceof C0767b) {
                    x0Var2 = new x0(45, 0, AbstractC0614y.f5882c);
                }
            }
            AbstractC0552y.q(interfaceC0550w, null, null, new E(this, f3, x0Var2, null), 3);
        } else {
            q.h hVar3 = (q.h) this.f625e;
            x0 x0Var3 = x.f708a;
            boolean z5 = hVar3 instanceof C0771f;
            x0 x0Var4 = x.f708a;
            if (!z5 && !(hVar3 instanceof C0769d) && (hVar3 instanceof C0767b)) {
                x0Var4 = new x0(150, 0, AbstractC0614y.f5882c);
            }
            AbstractC0552y.q(interfaceC0550w, null, null, new F(this, x0Var4, null), 3);
        }
        this.f625e = hVar2;
    }

    public A2.z d(A2.y yVar) {
        F2.e eVar = (F2.e) this.f624d;
        try {
            String a3 = A2.y.a(yVar, "Content-Type");
            long a4 = eVar.a(yVar);
            return new A2.z(a3, a4, AbstractC0157a.j(new E2.d(this, eVar.c(yVar), a4)), 1);
        } catch (IOException e3) {
            Z1.i.f((E2.h) this.f622b, "call");
            h(e3);
            throw e3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int e(C2.c cVar, C0997t c0997t, boolean z3) {
        Object[] objArr;
        C0014b c0014b;
        int i3;
        t0.r rVar = (t0.r) this.f625e;
        if (this.f621a) {
            return 0;
        }
        try {
            this.f621a = true;
            C2.c c3 = ((n0.o) this.f624d).c(cVar, c0997t);
            C0494l c0494l = (C0494l) c3.f484e;
            int c4 = c0494l.c();
            for (int i4 = 0; i4 < c4; i4++) {
                n0.m mVar = (n0.m) c0494l.d(i4);
                if (!mVar.f6226d && !mVar.f6230h) {
                }
                objArr = false;
                break;
            }
            objArr = true;
            int c5 = c0494l.c();
            int i5 = 0;
            while (true) {
                c0014b = (C0014b) this.f623c;
                if (i5 >= c5) {
                    break;
                }
                n0.m mVar2 = (n0.m) c0494l.d(i5);
                if (objArr != false || n0.s.a(mVar2)) {
                    ((t0.D) this.f622b).u(mVar2.f6225c, (t0.r) this.f625e, n0.s.d(mVar2.f6231i, 1), true);
                    if (!rVar.isEmpty()) {
                        c0014b.a(mVar2.f6223a, rVar, n0.s.a(mVar2));
                        rVar.clear();
                    }
                }
                i5++;
            }
            ((n0.f) c0014b.f537c).d();
            boolean c6 = c0014b.c(c3, z3);
            int c7 = c0494l.c();
            int i6 = 0;
            while (true) {
                if (i6 >= c7) {
                    i3 = 0;
                    break;
                }
                n0.m mVar3 = (n0.m) c0494l.d(i6);
                if (!a0.c.b(n0.s.f(mVar3, true), 0L) && mVar3.b()) {
                    i3 = 2;
                    break;
                }
                i6++;
            }
            int i7 = (c6 ? 1 : 0) | i3;
            this.f621a = false;
            return i7;
        } catch (Throwable th) {
            this.f621a = false;
            throw th;
        }
    }

    public void f() {
        if (this.f621a) {
            return;
        }
        C0494l c0494l = (C0494l) ((n0.o) this.f624d).f6239a;
        int i3 = c0494l.f5172g;
        Object[] objArr = c0494l.f5171f;
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            objArr[i5] = null;
        }
        c0494l.f5172g = 0;
        c0494l.f5169d = false;
        C0014b c0014b = (C0014b) this.f623c;
        K.d dVar = ((n0.f) c0014b.f537c).f6213a;
        int i6 = dVar.f2642f;
        if (i6 > 0) {
            Object[] objArr2 = dVar.f2640d;
            do {
                ((n0.e) objArr2[i4]).f();
                i4++;
            } while (i4 < i6);
        }
        ((n0.f) c0014b.f537c).f6213a.h();
    }

    public A2.x g(boolean z3) {
        try {
            A2.x f3 = ((F2.e) this.f624d).f(z3);
            if (f3 != null) {
                f3.f210m = this;
            }
            return f3;
        } catch (IOException e3) {
            Z1.i.f((E2.h) this.f622b, "call");
            h(e3);
            throw e3;
        }
    }

    public void h(IOException iOException) {
        this.f621a = true;
        ((E2.e) this.f623c).c(iOException);
        E2.k h3 = ((F2.e) this.f624d).h();
        E2.h hVar = (E2.h) this.f622b;
        synchronized (h3) {
            try {
                Z1.i.f(hVar, "call");
                if (!(iOException instanceof H2.D)) {
                    if (!(h3.f826g != null) || (iOException instanceof C0079a)) {
                        h3.f829j = true;
                        if (h3.f832m == 0) {
                            E2.k.d(hVar.f802d, h3.f821b, iOException);
                            h3.f831l++;
                        }
                    }
                } else if (((H2.D) iOException).f1927d == 8) {
                    int i3 = h3.f833n + 1;
                    h3.f833n = i3;
                    if (i3 > 1) {
                        h3.f829j = true;
                        h3.f831l++;
                    }
                } else if (((H2.D) iOException).f1927d != 9 || !hVar.p) {
                    h3.f829j = true;
                    h3.f831l++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
