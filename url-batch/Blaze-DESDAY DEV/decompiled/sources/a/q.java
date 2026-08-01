package a;

import android.window.OnBackInvokedCallback;
import f1.InterfaceC0090a;
import g.LayoutInflaterFactory2C0092A;

/* loaded from: classes.dex */
public final /* synthetic */ class q implements OnBackInvokedCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1229a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1230b;

    public /* synthetic */ q(int i, Object obj) {
        this.f1229a = i;
        this.f1230b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f1229a) {
            case 0:
                InterfaceC0090a interfaceC0090a = (InterfaceC0090a) this.f1230b;
                g1.d.e(interfaceC0090a, "$onBackInvoked");
                interfaceC0090a.b();
                break;
            case 1:
                ((LayoutInflaterFactory2C0092A) this.f1230b).C();
                break;
            default:
                ((Runnable) this.f1230b).run();
                break;
        }
    }
}
