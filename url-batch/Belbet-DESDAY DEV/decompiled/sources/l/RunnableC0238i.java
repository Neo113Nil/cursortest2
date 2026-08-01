package l;

import android.view.View;
import k.InterfaceC0155k;
import k.MenuC0157m;

/* renamed from: l.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0238i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final C0234g f2990a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0244l f2991b;

    public RunnableC0238i(C0244l c0244l, C0234g c0234g) {
        this.f2991b = c0244l;
        this.f2990a = c0234g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0155k interfaceC0155k;
        C0244l c0244l = this.f2991b;
        MenuC0157m menuC0157m = c0244l.f3011c;
        if (menuC0157m != null && (interfaceC0155k = menuC0157m.f2689e) != null) {
            interfaceC0155k.g(menuC0157m);
        }
        View view = (View) c0244l.h;
        if (view != null && view.getWindowToken() != null) {
            C0234g c0234g = this.f2990a;
            if (!c0234g.b()) {
                if (c0234g.f2750e != null) {
                    c0234g.d(0, 0, false, false);
                }
            }
            c0244l.f3024s = c0234g;
        }
        c0244l.f3026u = null;
    }
}
