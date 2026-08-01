package l;

import android.view.View;
import k.InterfaceC0162k;
import k.MenuC0164m;

/* renamed from: l.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0212i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final C0208g f2924a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0216k f2925b;

    public RunnableC0212i(C0216k c0216k, C0208g c0208g) {
        this.f2925b = c0216k;
        this.f2924a = c0208g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0162k interfaceC0162k;
        C0216k c0216k = this.f2925b;
        MenuC0164m menuC0164m = c0216k.f2934c;
        if (menuC0164m != null && (interfaceC0162k = menuC0164m.f2688e) != null) {
            interfaceC0162k.o(menuC0164m);
        }
        View view = (View) c0216k.h;
        if (view != null && view.getWindowToken() != null) {
            C0208g c0208g = this.f2924a;
            if (!c0208g.b()) {
                if (c0208g.f2749e != null) {
                    c0208g.d(0, 0, false, false);
                }
            }
            c0216k.f2947s = c0208g;
        }
        c0216k.f2949u = null;
    }
}
