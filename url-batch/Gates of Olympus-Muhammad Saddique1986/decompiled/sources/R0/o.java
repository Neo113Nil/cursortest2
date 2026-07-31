package R0;

import android.window.OnBackInvokedCallback;
import e2.InterfaceC0422a;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements OnBackInvokedCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4108a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0422a f4109b;

    public /* synthetic */ o(InterfaceC0422a interfaceC0422a, int i3) {
        this.f4108a = i3;
        this.f4109b = interfaceC0422a;
    }

    public final void onBackInvoked() {
        switch (this.f4108a) {
            case 0:
                InterfaceC0422a interfaceC0422a = this.f4109b;
                if (interfaceC0422a != null) {
                    interfaceC0422a.b();
                    break;
                }
                break;
            default:
                InterfaceC0422a interfaceC0422a2 = this.f4109b;
                f2.j.f(interfaceC0422a2, "$onBackInvoked");
                interfaceC0422a2.b();
                break;
        }
    }
}
