package l;

import android.view.View;
import k.InterfaceC0156k;
import k.MenuC0158m;

/* renamed from: l.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0239i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final C0235g f2973a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0243k f2974b;

    public RunnableC0239i(C0243k c0243k, C0235g c0235g) {
        this.f2974b = c0243k;
        this.f2973a = c0235g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0156k interfaceC0156k;
        C0243k c0243k = this.f2974b;
        MenuC0158m menuC0158m = c0243k.f2993c;
        if (menuC0158m != null && (interfaceC0156k = menuC0158m.f2672e) != null) {
            interfaceC0156k.e(menuC0158m);
        }
        View view = (View) c0243k.h;
        if (view != null && view.getWindowToken() != null) {
            C0235g c0235g = this.f2973a;
            if (!c0235g.b()) {
                if (c0235g.f2733e != null) {
                    c0235g.d(0, 0, false, false);
                }
            }
            c0243k.f3006s = c0235g;
        }
        c0243k.f3008u = null;
    }
}
