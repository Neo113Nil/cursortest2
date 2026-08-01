package l;

import android.view.View;
import k.InterfaceC0198k;
import k.MenuC0200m;

/* renamed from: l.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0264i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final C0260g f3369a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0268k f3370b;

    public RunnableC0264i(C0268k c0268k, C0260g c0260g) {
        this.f3370b = c0268k;
        this.f3369a = c0260g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0198k interfaceC0198k;
        C0268k c0268k = this.f3370b;
        MenuC0200m menuC0200m = c0268k.f3388c;
        if (menuC0200m != null && (interfaceC0198k = menuC0200m.f3061e) != null) {
            interfaceC0198k.e(menuC0200m);
        }
        View view = (View) c0268k.h;
        if (view != null && view.getWindowToken() != null) {
            C0260g c0260g = this.f3369a;
            if (!c0260g.b()) {
                if (c0260g.f3125e != null) {
                    c0260g.d(0, 0, false, false);
                }
            }
            c0268k.f3402s = c0260g;
        }
        c0268k.f3404u = null;
    }
}
