package I0;

import android.window.OnBackInvokedCallback;
import h.z;
import i1.InterfaceC0181a;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements OnBackInvokedCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f585a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f586b;

    public /* synthetic */ d(int i, Object obj) {
        this.f585a = i;
        this.f586b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f585a) {
            case 0:
                ((b) this.f586b).a();
                break;
            case 1:
                InterfaceC0181a interfaceC0181a = (InterfaceC0181a) this.f586b;
                j1.h.e(interfaceC0181a, "$onBackInvoked");
                interfaceC0181a.c();
                break;
            case 2:
                ((z) this.f586b).C();
                break;
            default:
                ((Runnable) this.f586b).run();
                break;
        }
    }
}
