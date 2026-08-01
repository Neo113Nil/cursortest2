package n;

import android.view.View;
import m.InterfaceC0227k;
import m.MenuC0229m;

/* renamed from: n.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0278i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final C0274g f3632a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0282k f3633b;

    public RunnableC0278i(C0282k c0282k, C0274g c0274g) {
        this.f3633b = c0282k;
        this.f3632a = c0274g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0227k interfaceC0227k;
        C0282k c0282k = this.f3633b;
        MenuC0229m menuC0229m = c0282k.f3652c;
        if (menuC0229m != null && (interfaceC0227k = menuC0229m.e) != null) {
            interfaceC0227k.f(menuC0229m);
        }
        View view = (View) c0282k.f3656h;
        if (view != null && view.getWindowToken() != null) {
            C0274g c0274g = this.f3632a;
            if (!c0274g.b()) {
                if (c0274g.e != null) {
                    c0274g.d(0, 0, false, false);
                }
            }
            c0282k.f3665s = c0274g;
        }
        c0282k.f3667u = null;
    }
}
