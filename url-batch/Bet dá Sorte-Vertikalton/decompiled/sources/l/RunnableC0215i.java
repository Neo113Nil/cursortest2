package l;

import android.view.View;
import k.InterfaceC0155k;
import k.MenuC0157m;

/* renamed from: l.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0215i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final C0211g f2970a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0219k f2971b;

    public RunnableC0215i(C0219k c0219k, C0211g c0211g) {
        this.f2971b = c0219k;
        this.f2970a = c0211g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0155k interfaceC0155k;
        C0219k c0219k = this.f2971b;
        MenuC0157m menuC0157m = c0219k.f2974c;
        if (menuC0157m != null && (interfaceC0155k = menuC0157m.f2651e) != null) {
            interfaceC0155k.q(menuC0157m);
        }
        View view = (View) c0219k.h;
        if (view != null && view.getWindowToken() != null) {
            C0211g c0211g = this.f2970a;
            if (!c0211g.b()) {
                if (c0211g.f2712e != null) {
                    c0211g.d(0, 0, false, false);
                }
            }
            c0219k.f2987s = c0211g;
        }
        c0219k.f2989u = null;
    }
}
