package l;

import android.view.View;
import k.InterfaceC0158k;
import k.MenuC0160m;

/* renamed from: l.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0221i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final C0217g f2985a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0225k f2986b;

    public RunnableC0221i(C0225k c0225k, C0217g c0217g) {
        this.f2986b = c0225k;
        this.f2985a = c0217g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0158k interfaceC0158k;
        C0225k c0225k = this.f2986b;
        MenuC0160m menuC0160m = c0225k.f2995c;
        if (menuC0160m != null && (interfaceC0158k = menuC0160m.f2664e) != null) {
            interfaceC0158k.q(menuC0160m);
        }
        View view = (View) c0225k.h;
        if (view != null && view.getWindowToken() != null) {
            C0217g c0217g = this.f2985a;
            if (!c0217g.b()) {
                if (c0217g.f2725e != null) {
                    c0217g.d(0, 0, false, false);
                }
            }
            c0225k.f3008s = c0217g;
        }
        c0225k.f3010u = null;
    }
}
