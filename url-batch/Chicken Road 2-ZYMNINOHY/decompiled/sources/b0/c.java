package b0;

import B.k;
import V0.j;
import W.G;
import W.InterfaceC0118k;
import W.J;
import a0.C0132H;
import android.app.Activity;
import android.app.UiModeManager;
import android.os.Handler;
import android.os.SystemClock;
import c0.C0281n;
import c0.D;
import c0.E;
import c0.F;
import c0.K;
import c0.RunnableC0282o;
import c0.z;
import com.startapp.sdk.internal.e3;
import com.startapp.sdk.internal.ng;
import f1.C;
import f1.C0413a;
import f1.C0415c;
import f1.C0416d;
import f1.y;
import g0.s;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.impl.C0583e9;
import io.appmetrica.analytics.impl.C0602f2;
import io.appmetrica.analytics.impl.C0649gn;
import io.appmetrica.analytics.impl.G0;
import io.appmetrica.analytics.impl.Id;
import io.appmetrica.analytics.impl.InterfaceC0492al;
import io.appmetrica.analytics.impl.InterfaceC0684i6;
import io.appmetrica.analytics.impl.N7;
import io.appmetrica.analytics.impl.Rd;
import io.appmetrica.analytics.impl.Zo;
import io.flutter.Build;
import r0.C1398i;
import v2.I;
import v2.a0;
import v2.r;
import y0.n;
import y0.q;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements InterfaceC0118k, e3, t2.b, u2.d, q, Rd, FunctionWithThrowable, InterfaceC0684i6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5268a;

    public /* synthetic */ c(int i4) {
        this.f5268a = i4;
    }

    @Override // com.startapp.sdk.internal.e3
    public long a() {
        return System.currentTimeMillis();
    }

    @Override // u2.d, S1.h
    public Object apply(Object obj) {
        switch (this.f5268a) {
            case 16:
                return I.o(Integer.valueOf(((C1398i) obj).f15152a));
            case Build.API_LEVELS.API_22 /* 22 */:
                s sVar = (s) obj;
                sVar.k();
                return I.k(r.u(sVar.f8942I.f15035b, new Zo(10)));
            case 27:
                return N7.a((UiModeManager) obj);
            default:
                return C0649gn.b((Activity) obj);
        }
    }

    @Override // y0.q
    public n[] b() {
        switch (this.f5268a) {
            case 17:
                return new n[]{new C0413a()};
            case 18:
                return new n[]{new C0415c()};
            case C0583e9.f11743C /* 19 */:
                return new n[]{new C0416d(0)};
            case C0583e9.f11744D /* 20 */:
                return new n[]{new y()};
            case 21:
                G g4 = new G(0L);
                v2.G g5 = I.f15571b;
                return new n[]{new C(1, 1, j.f3206v0, g4, new k(0, a0.f15605e))};
            default:
                return new n[]{new g1.d()};
        }
    }

    @Override // W.InterfaceC0118k
    public void invoke(Object obj) {
        long j4;
        t1.h hVar;
        C0132H c0132h;
        t0.r rVar;
        switch (this.f5268a) {
            case 0:
                ((h) obj).getClass();
                return;
            case 1:
                ((h) obj).getClass();
                return;
            case 2:
                ((h) obj).getClass();
                return;
            case 3:
                ((h) obj).getClass();
                return;
            case 4:
                ((h) obj).getClass();
                return;
            case 5:
                ((h) obj).getClass();
                return;
            case 6:
                ((h) obj).getClass();
                return;
            case 7:
                ((h) obj).getClass();
                return;
            case 8:
                ((h) obj).getClass();
                return;
            case 9:
                E e4 = (E) obj;
                c0.I i4 = e4.f5436b;
                if (e4.equals(i4.f5487j) && i4.n != null) {
                    F f4 = i4.f5491p;
                    int i5 = f4.f5438b;
                    if (i5 != -1) {
                        long j5 = ((C0281n) f4.f5441e).f5589f / i5;
                        z zVar = i4.f5495t;
                        zVar.getClass();
                        j4 = J.S(zVar.f5628a.getSampleRate(), j5);
                    } else {
                        j4 = -9223372036854775807L;
                    }
                    long elapsedRealtime = SystemClock.elapsedRealtime() - i4.f5472W;
                    t1.h hVar2 = i4.n;
                    int i6 = ((C0281n) i4.f5491p.f5441e).f5589f;
                    long Z3 = J.Z(j4);
                    c0.q qVar = ((K) hVar2.f15398b).f5502P0;
                    Handler handler = qVar.f5600a;
                    if (handler != null) {
                        handler.post(new RunnableC0282o(qVar, i6, Z3, elapsedRealtime));
                        return;
                    }
                    return;
                }
                return;
            case 10:
                E e5 = (E) obj;
                e5.getClass();
                c0.I.f5450c0.getAndDecrement();
                t1.h hVar3 = e5.f5436b.n;
                if (hVar3 != null) {
                    int i7 = e5.f5435a.f5584a;
                    c0.J j6 = new c0.J();
                    c0.q qVar2 = ((K) hVar3.f15398b).f5502P0;
                    Handler handler2 = qVar2.f5600a;
                    if (handler2 != null) {
                        handler2.post(new RunnableC0282o(qVar2, j6, 3));
                        return;
                    }
                    return;
                }
                return;
            case 11:
                E e6 = (E) obj;
                c0.I i8 = e6.f5436b;
                if (e6.equals(i8.f5487j) && (hVar = i8.n) != null && i8.f5464O && (c0132h = ((K) hVar.f15398b).f13805I) != null) {
                    c0132h.a();
                    return;
                }
                return;
            case 12:
                E e7 = (E) obj;
                c0.I i9 = e7.f5436b;
                if (e7.equals(i9.f5487j)) {
                    i9.f5463N = true;
                    return;
                }
                return;
            default:
                t1.h hVar4 = ((D) obj).f5434a.n;
                if (hVar4 != null) {
                    K k4 = (K) hVar4.f15398b;
                    synchronized (k4.f4037a) {
                        rVar = k4.f4052r;
                    }
                    if (rVar != null) {
                        synchronized (rVar.f15366c) {
                            rVar.f15369f.getClass();
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // t2.b
    public void onSuccess(Object obj) {
        ng.a((X1.a) obj);
    }

    @Override // io.appmetrica.analytics.impl.Rd
    public InterfaceC0492al a(G0 g02) {
        switch (this.f5268a) {
            case 25:
                return Id.a(g02);
            default:
                return Id.b(g02);
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0684i6
    public boolean a(Throwable th) {
        return C0602f2.a(th);
    }
}
