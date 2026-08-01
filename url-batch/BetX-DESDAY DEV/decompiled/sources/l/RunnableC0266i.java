package l;

import android.view.View;
import k.InterfaceC0200k;
import k.MenuC0202m;

/* renamed from: l.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0266i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final C0262g f3369a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0270k f3370b;

    public RunnableC0266i(C0270k c0270k, C0262g c0262g) {
        this.f3370b = c0270k;
        this.f3369a = c0262g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0200k interfaceC0200k;
        C0270k c0270k = this.f3370b;
        MenuC0202m menuC0202m = c0270k.f3391c;
        if (menuC0202m != null && (interfaceC0200k = menuC0202m.f3065e) != null) {
            interfaceC0200k.p(menuC0202m);
        }
        View view = (View) c0270k.h;
        if (view != null && view.getWindowToken() != null) {
            C0262g c0262g = this.f3369a;
            if (!c0262g.b()) {
                if (c0262g.f3129e != null) {
                    c0262g.d(0, 0, false, false);
                }
            }
            c0270k.f3405s = c0262g;
        }
        c0270k.f3407u = null;
    }
}
