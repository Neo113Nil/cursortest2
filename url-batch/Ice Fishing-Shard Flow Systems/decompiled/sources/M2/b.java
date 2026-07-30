package M2;

import n2.AbstractC0755f;
import r4.l;
import s4.n;
import s4.o;
import s4.p;

/* loaded from: classes.dex */
public final class b extends a implements o {

    /* renamed from: n, reason: collision with root package name */
    public static b f1732n;

    /* renamed from: o, reason: collision with root package name */
    public static b f1733o;

    /* renamed from: p, reason: collision with root package name */
    public static b f1734p;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f1735m;

    @Override // s4.o
    public final void onMethodCall(n nVar, p pVar) {
        switch (this.f1735m) {
            case 0:
                if (!nVar.f7767a.contentEquals("OneSignal#setLogLevel")) {
                    if (!nVar.f7767a.contentEquals("OneSignal#setAlertLevel")) {
                        a.e(pVar);
                        break;
                    } else {
                        try {
                            AbstractC0755f.c().getDebug().setAlertLevel(K2.c.fromInt(((Integer) nVar.a("visualLevel")).intValue()));
                            a.f(null, pVar);
                            break;
                        } catch (ClassCastException e7) {
                            a.d("failed with error: " + e7.getMessage() + "\n" + e7.getStackTrace(), pVar);
                            return;
                        }
                    }
                } else {
                    try {
                        AbstractC0755f.c().getDebug().setLogLevel(K2.c.fromInt(((Integer) nVar.a("logLevel")).intValue()));
                        a.f(null, pVar);
                        break;
                    } catch (ClassCastException e8) {
                        a.d("failed with error: " + e8.getMessage() + "\n" + e8.getStackTrace(), pVar);
                        return;
                    }
                }
            case 1:
                l lVar = (l) pVar;
                g(lVar, new d(this, nVar, lVar, 0));
                break;
            default:
                l lVar2 = (l) pVar;
                g(lVar2, new d(this, nVar, lVar2, 1));
                break;
        }
    }
}
