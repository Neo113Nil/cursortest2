package a;

import a1.InterfaceC0059a;
import android.window.OnBackInvokedCallback;
import g.LayoutInflaterFactory2C0117A;

/* loaded from: classes.dex */
public final /* synthetic */ class q implements OnBackInvokedCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1142a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1143b;

    public /* synthetic */ q(int i, Object obj) {
        this.f1142a = i;
        this.f1143b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f1142a) {
            case 0:
                InterfaceC0059a interfaceC0059a = (InterfaceC0059a) this.f1143b;
                b1.d.e(interfaceC0059a, "$onBackInvoked");
                interfaceC0059a.a();
                break;
            case 1:
                ((LayoutInflaterFactory2C0117A) this.f1143b).C();
                break;
            default:
                ((Runnable) this.f1143b).run();
                break;
        }
    }
}
