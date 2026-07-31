package k2;

import N3.j;
import O3.i;
import com.onesignal.inAppMessages.internal.display.impl.a;
import u0.C0675e;

/* renamed from: k2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0468b extends AbstractC0467a implements i {

    /* renamed from: k, reason: collision with root package name */
    public static C0468b f5179k;

    /* renamed from: l, reason: collision with root package name */
    public static C0468b f5180l;

    /* renamed from: m, reason: collision with root package name */
    public static C0468b f5181m;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f5182j;

    @Override // O3.i
    public final void g(C0675e c0675e, j jVar) {
        switch (this.f5182j) {
            case 0:
                if (!((String) c0675e.f5975b).contentEquals("OneSignal#setLogLevel")) {
                    if (!((String) c0675e.f5975b).contentEquals("OneSignal#setAlertLevel")) {
                        AbstractC0467a.e(jVar);
                        break;
                    } else {
                        try {
                            L1.f.c().getDebug().setAlertLevel(i2.c.fromInt(((Integer) c0675e.c("visualLevel")).intValue()));
                            AbstractC0467a.f(jVar, null);
                            break;
                        } catch (ClassCastException e4) {
                            AbstractC0467a.d(jVar, "failed with error: " + e4.getMessage() + "\n" + e4.getStackTrace());
                            return;
                        }
                    }
                } else {
                    try {
                        L1.f.c().getDebug().setLogLevel(i2.c.fromInt(((Integer) c0675e.c("logLevel")).intValue()));
                        AbstractC0467a.f(jVar, null);
                        break;
                    } catch (ClassCastException e7) {
                        AbstractC0467a.d(jVar, "failed with error: " + e7.getMessage() + "\n" + e7.getStackTrace());
                        return;
                    }
                }
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                h(jVar, new d(this, c0675e, jVar, 0));
                break;
            default:
                h(jVar, new d(this, c0675e, jVar, 1));
                break;
        }
    }
}
