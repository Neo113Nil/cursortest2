package a;

import android.window.OnBackInvokedCallback;
import g.A;
import g1.InterfaceC0110a;

/* loaded from: classes.dex */
public final /* synthetic */ class q implements OnBackInvokedCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1275a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1276b;

    public /* synthetic */ q(int i, Object obj) {
        this.f1275a = i;
        this.f1276b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f1275a) {
            case 0:
                InterfaceC0110a interfaceC0110a = (InterfaceC0110a) this.f1276b;
                h1.d.e(interfaceC0110a, "$onBackInvoked");
                interfaceC0110a.b();
                break;
            case 1:
                ((A) this.f1276b).C();
                break;
            default:
                ((Runnable) this.f1276b).run();
                break;
        }
    }
}
