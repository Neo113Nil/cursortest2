package a;

import android.window.OnBackInvokedCallback;
import d1.InterfaceC0081a;
import g.LayoutInflaterFactory2C0116A;

/* loaded from: classes.dex */
public final /* synthetic */ class q implements OnBackInvokedCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1186a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1187b;

    public /* synthetic */ q(int i, Object obj) {
        this.f1186a = i;
        this.f1187b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f1186a) {
            case 0:
                InterfaceC0081a interfaceC0081a = (InterfaceC0081a) this.f1187b;
                e1.d.e(interfaceC0081a, "$onBackInvoked");
                interfaceC0081a.a();
                break;
            case 1:
                ((LayoutInflaterFactory2C0116A) this.f1187b).C();
                break;
            default:
                ((Runnable) this.f1187b).run();
                break;
        }
    }
}
