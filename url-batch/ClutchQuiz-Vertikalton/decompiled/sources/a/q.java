package a;

import android.window.OnBackInvokedCallback;
import g.z;

/* loaded from: classes.dex */
public final /* synthetic */ class q implements OnBackInvokedCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1223a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1224b;

    public /* synthetic */ q(int i, Object obj) {
        this.f1223a = i;
        this.f1224b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f1223a) {
            case 0:
                f1.a aVar = (f1.a) this.f1224b;
                g1.f.e(aVar, "$onBackInvoked");
                aVar.c();
                break;
            case 1:
                ((z) this.f1224b).C();
                break;
            default:
                ((Runnable) this.f1224b).run();
                break;
        }
    }
}
