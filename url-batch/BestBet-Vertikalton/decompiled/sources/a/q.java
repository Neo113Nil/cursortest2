package a;

import android.window.OnBackInvokedCallback;
import g.LayoutInflaterFactory2C0112A;
import j1.InterfaceC0170a;

/* loaded from: classes.dex */
public final /* synthetic */ class q implements OnBackInvokedCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1603a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1604b;

    public /* synthetic */ q(int i, Object obj) {
        this.f1603a = i;
        this.f1604b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f1603a) {
            case 0:
                InterfaceC0170a interfaceC0170a = (InterfaceC0170a) this.f1604b;
                k1.e.e(interfaceC0170a, "$onBackInvoked");
                interfaceC0170a.c();
                break;
            case 1:
                ((LayoutInflaterFactory2C0112A) this.f1604b).C();
                break;
            default:
                ((Runnable) this.f1604b).run();
                break;
        }
    }
}
