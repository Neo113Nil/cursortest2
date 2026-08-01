package l;

import android.view.View;
import k.InterfaceC0187k;
import k.MenuC0189m;

/* renamed from: l.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0238i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final C0234g f3406a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0242k f3407b;

    public RunnableC0238i(C0242k c0242k, C0234g c0234g) {
        this.f3407b = c0242k;
        this.f3406a = c0234g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0187k interfaceC0187k;
        C0242k c0242k = this.f3407b;
        MenuC0189m menuC0189m = c0242k.f3410c;
        if (menuC0189m != null && (interfaceC0187k = menuC0189m.f3166e) != null) {
            interfaceC0187k.f(menuC0189m);
        }
        View view = (View) c0242k.h;
        if (view != null && view.getWindowToken() != null) {
            C0234g c0234g = this.f3406a;
            if (!c0234g.b()) {
                if (c0234g.f3228e != null) {
                    c0234g.d(0, 0, false, false);
                }
            }
            c0242k.f3423s = c0234g;
        }
        c0242k.f3425u = null;
    }
}
