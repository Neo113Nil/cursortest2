package a;

import android.window.OnBackInvokedCallback;
import f1.InterfaceC0099a;
import g.LayoutInflaterFactory2C0101A;

/* loaded from: classes.dex */
public final /* synthetic */ class q implements OnBackInvokedCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1284a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1285b;

    public /* synthetic */ q(int i, Object obj) {
        this.f1284a = i;
        this.f1285b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f1284a) {
            case 0:
                InterfaceC0099a interfaceC0099a = (InterfaceC0099a) this.f1285b;
                g1.d.e(interfaceC0099a, "$onBackInvoked");
                interfaceC0099a.a();
                break;
            case 1:
                ((LayoutInflaterFactory2C0101A) this.f1285b).C();
                break;
            default:
                ((Runnable) this.f1285b).run();
                break;
        }
    }
}
