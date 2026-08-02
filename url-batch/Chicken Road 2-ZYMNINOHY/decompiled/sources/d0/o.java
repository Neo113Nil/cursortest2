package d0;

import T.C0097o;
import T.G;
import T.InterfaceC0090h;
import W.J;
import W.u;
import android.os.Handler;
import q0.X;
import q0.a0;
import y0.E;
import y0.F;

/* loaded from: classes.dex */
public final class o implements F {

    /* renamed from: a, reason: collision with root package name */
    public final a0 f8192a;

    /* renamed from: b, reason: collision with root package name */
    public final l2.e f8193b = new l2.e(24, false);

    /* renamed from: c, reason: collision with root package name */
    public final H0.a f8194c = new H0.a(1);

    /* renamed from: d, reason: collision with root package name */
    public long f8195d = -9223372036854775807L;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p f8196e;

    public o(p pVar, B1.j jVar) {
        this.f8196e = pVar;
        this.f8192a = new a0(jVar, null, null);
    }

    @Override // y0.F
    public final void b(u uVar, int i4, int i5) {
        this.f8192a.b(uVar, i4, 0);
    }

    @Override // y0.F
    public final void d(C0097o c0097o) {
        this.f8192a.d(c0097o);
    }

    @Override // y0.F
    public final void e(long j4, int i4, int i5, int i6, E e4) {
        long i7;
        long j5;
        this.f8192a.e(j4, i4, i5, i6, e4);
        while (this.f8192a.x(false)) {
            H0.a aVar = this.f8194c;
            aVar.h();
            if (this.f8192a.C(this.f8193b, aVar, 0, false) == -4) {
                aVar.k();
            } else {
                aVar = null;
            }
            if (aVar != null) {
                long j6 = aVar.f3783g;
                T.E m4 = this.f8196e.f8199c.m(aVar);
                if (m4 != null) {
                    J0.a aVar2 = (J0.a) m4.f2655a[0];
                    String str = aVar2.f1145a;
                    String str2 = aVar2.f1146b;
                    if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                        try {
                            j5 = J.P(J.p(aVar2.f1149e));
                        } catch (G unused) {
                            j5 = -9223372036854775807L;
                        }
                        if (j5 != -9223372036854775807L) {
                            n nVar = new n(j6, j5);
                            Handler handler = this.f8196e.f8200d;
                            handler.sendMessage(handler.obtainMessage(1, nVar));
                        }
                    }
                }
            }
        }
        a0 a0Var = this.f8192a;
        X x4 = a0Var.f14959a;
        synchronized (a0Var) {
            int i8 = a0Var.f14975s;
            i7 = i8 == 0 ? -1L : a0Var.i(i8);
        }
        x4.a(i7);
    }

    @Override // y0.F
    public final int f(InterfaceC0090h interfaceC0090h, int i4, boolean z) {
        return this.f8192a.f(interfaceC0090h, i4, z);
    }
}
