package a;

import android.window.OnBackInvokedCallback;
import c1.InterfaceC0085a;
import g.LayoutInflaterFactory2C0090A;

/* loaded from: classes.dex */
public final /* synthetic */ class q implements OnBackInvokedCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1199a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1200b;

    public /* synthetic */ q(int i, Object obj) {
        this.f1199a = i;
        this.f1200b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f1199a) {
            case 0:
                InterfaceC0085a interfaceC0085a = (InterfaceC0085a) this.f1200b;
                d1.d.e(interfaceC0085a, "$onBackInvoked");
                interfaceC0085a.b();
                break;
            case 1:
                ((LayoutInflaterFactory2C0090A) this.f1200b).C();
                break;
            default:
                ((Runnable) this.f1200b).run();
                break;
        }
    }
}
