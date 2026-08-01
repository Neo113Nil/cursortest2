package m;

import android.view.View;
import l.InterfaceC0167k;
import l.MenuC0169m;

/* renamed from: m.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0217i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final C0213g f3092a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0221k f3093b;

    public RunnableC0217i(C0221k c0221k, C0213g c0213g) {
        this.f3093b = c0221k;
        this.f3092a = c0213g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0167k interfaceC0167k;
        C0221k c0221k = this.f3093b;
        MenuC0169m menuC0169m = c0221k.f3125c;
        if (menuC0169m != null && (interfaceC0167k = menuC0169m.f2818e) != null) {
            interfaceC0167k.q(menuC0169m);
        }
        View view = (View) c0221k.f3129h;
        if (view != null && view.getWindowToken() != null) {
            C0213g c0213g = this.f3092a;
            if (!c0213g.b()) {
                if (c0213g.f2881e != null) {
                    c0213g.d(0, 0, false, false);
                }
            }
            c0221k.f3139s = c0213g;
        }
        c0221k.f3141u = null;
    }
}
