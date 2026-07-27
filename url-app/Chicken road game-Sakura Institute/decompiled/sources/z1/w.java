package z1;

import A.AbstractC0017m;
import B1.C0104k;
import G.C0192d;
import G.C0208l;
import G.C0216p;
import G.InterfaceC0191c0;
import G.W;
import android.app.Application;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.chicken.road.kedro.laqer.MainActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class w implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11921d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ MainActivity f11922e;

    public /* synthetic */ w(MainActivity mainActivity, int i2) {
        this.f11921d = i2;
        this.f11922e = mainActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        switch (this.f11921d) {
            case 0:
                C0216p c0216p = (C0216p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0216p.z()) {
                    c0216p.N();
                } else {
                    Context context = (Context) c0216p.k(AndroidCompositionLocals_androidKt.f5213b);
                    c0216p.S(527012112);
                    Object I3 = c0216p.I();
                    W w4 = C0208l.f2826a;
                    MainActivity mainActivity = this.f11922e;
                    if (I3 == w4) {
                        Application application = mainActivity.getApplication();
                        Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
                        I3 = new C0104k(application);
                        c0216p.c0(I3);
                    }
                    C0104k c0104k = (C0104k) I3;
                    Object f4 = AbstractC0017m.f(c0216p, false, 527014282);
                    W w5 = W.f2779l;
                    if (f4 == w4) {
                        f4 = C0192d.K(B1.A.f944a, w5);
                        c0216p.c0(f4);
                    }
                    InterfaceC0191c0 interfaceC0191c0 = (InterfaceC0191c0) f4;
                    Object f5 = AbstractC0017m.f(c0216p, false, 527017357);
                    if (f5 == w4) {
                        f5 = C0192d.K(Boolean.FALSE, w5);
                        c0216p.c0(f5);
                    }
                    InterfaceC0191c0 interfaceC0191c02 = (InterfaceC0191c0) f5;
                    c0216p.q(false);
                    Unit unit = Unit.f7487a;
                    c0216p.S(527019660);
                    Object I4 = c0216p.I();
                    if (I4 == w4) {
                        I4 = new C1394t(interfaceC0191c02, null);
                        c0216p.c0(I4);
                    }
                    c0216p.q(false);
                    C0192d.e(c0216p, unit, (Function2) I4);
                    c0216p.S(527021924);
                    boolean h4 = c0216p.h(c0104k);
                    Object I5 = c0216p.I();
                    if (h4 || I5 == w4) {
                        I5 = new C1395u(c0104k, interfaceC0191c0, null);
                        c0216p.c0(I5);
                    }
                    c0216p.q(false);
                    C0192d.e(c0216p, unit, (Function2) I5);
                    B1.B b4 = (B1.B) interfaceC0191c0.getValue();
                    if (!((Boolean) interfaceC0191c02.getValue()).booleanValue() || (b4 instanceof B1.A)) {
                        c0216p.S(527026841);
                        AbstractC1359C.b(0, c0216p);
                        c0216p.q(false);
                    } else if (b4 instanceof B1.z) {
                        c0216p.S(-841962277);
                        c0216p.S(527030744);
                        boolean h5 = c0216p.h(context) | c0216p.h(b4) | c0216p.f(mainActivity);
                        Object I6 = c0216p.I();
                        if (h5 || I6 == w4) {
                            I6 = new C1396v(context, (B1.z) b4, mainActivity, null);
                            c0216p.c0(I6);
                        }
                        c0216p.q(false);
                        C0192d.e(c0216p, b4, (Function2) I6);
                        AbstractC1359C.b(0, c0216p);
                        c0216p.q(false);
                    } else {
                        c0216p.S(527038996);
                        AbstractC1359C.a(0, c0216p);
                        c0216p.q(false);
                    }
                }
                break;
            default:
                C0216p c0216p2 = (C0216p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0216p2.z()) {
                    c0216p2.N();
                } else {
                    AbstractC1370N.a(O.f.b(1789920883, new w(this.f11922e, 0), c0216p2), c0216p2, 6);
                }
                break;
        }
        return Unit.f7487a;
    }
}
