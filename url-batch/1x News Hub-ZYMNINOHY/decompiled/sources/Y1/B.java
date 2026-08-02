package Y1;

import E1.AbstractC0033i;
import a.AbstractC0129a;
import android.util.Log;
import b2.C0191e;
import b2.C0192f;
import b2.C0195i;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class B implements l2.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1746a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ V0.e f1747b;

    public /* synthetic */ B(V0.e eVar, int i3) {
        this.f1746a = i3;
        this.f1747b = eVar;
    }

    @Override // l2.l
    public final Object invoke(Object obj) {
        List L;
        List L2;
        C0192f c0192f = (C0192f) obj;
        switch (this.f1746a) {
            case 0:
                Throwable a3 = C0192f.a(c0192f.f2550a);
                V0.e eVar = this.f1747b;
                if (a3 != null) {
                    if (a3 instanceof C0104a) {
                        C0104a c0104a = (C0104a) a3;
                        L = c2.f.L(c0104a.f1816a, c0104a.f1817b, c0104a.f1818c);
                    } else {
                        L = c2.f.L(a3.getClass().getSimpleName(), a3.toString(), AbstractC0033i.l("Cause: ", a3.getCause(), ", Stacktrace: ", Log.getStackTraceString(a3)));
                    }
                    eVar.n(L);
                } else {
                    Object obj2 = c0192f.f2550a;
                    if (obj2 instanceof C0191e) {
                        obj2 = null;
                    }
                    eVar.n(AbstractC0129a.r((Boolean) obj2));
                }
                break;
            default:
                Throwable a4 = C0192f.a(c0192f.f2550a);
                V0.e eVar2 = this.f1747b;
                if (a4 != null) {
                    if (a4 instanceof C0104a) {
                        C0104a c0104a2 = (C0104a) a4;
                        L2 = c2.f.L(c0104a2.f1816a, c0104a2.f1817b, c0104a2.f1818c);
                    } else {
                        L2 = c2.f.L(a4.getClass().getSimpleName(), a4.toString(), AbstractC0033i.l("Cause: ", a4.getCause(), ", Stacktrace: ", Log.getStackTraceString(a4)));
                    }
                    eVar2.n(L2);
                } else {
                    Object obj3 = c0192f.f2550a;
                    if (obj3 instanceof C0191e) {
                        obj3 = null;
                    }
                    eVar2.n(AbstractC0129a.r((String) obj3));
                }
                break;
        }
        return C0195i.f2555a;
    }
}
