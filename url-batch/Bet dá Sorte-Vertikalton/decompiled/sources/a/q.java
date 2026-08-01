package a;

import a1.InterfaceC0058a;
import android.window.OnBackInvokedCallback;
import g.LayoutInflaterFactory2C0112A;

/* loaded from: classes.dex */
public final /* synthetic */ class q implements OnBackInvokedCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1156a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1157b;

    public /* synthetic */ q(int i, Object obj) {
        this.f1156a = i;
        this.f1157b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f1156a) {
            case 0:
                InterfaceC0058a interfaceC0058a = (InterfaceC0058a) this.f1157b;
                b1.d.e(interfaceC0058a, "$onBackInvoked");
                interfaceC0058a.a();
                break;
            case 1:
                ((LayoutInflaterFactory2C0112A) this.f1157b).C();
                break;
            default:
                ((Runnable) this.f1157b).run();
                break;
        }
    }
}
