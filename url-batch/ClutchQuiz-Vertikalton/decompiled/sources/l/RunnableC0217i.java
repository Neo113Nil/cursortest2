package l;

import android.view.View;
import k.InterfaceC0165k;
import k.MenuC0167m;

/* renamed from: l.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0217i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final C0213g f2985a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0221k f2986b;

    public RunnableC0217i(C0221k c0221k, C0213g c0213g) {
        this.f2986b = c0221k;
        this.f2985a = c0213g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0165k interfaceC0165k;
        C0221k c0221k = this.f2986b;
        MenuC0167m menuC0167m = c0221k.f2989c;
        if (menuC0167m != null && (interfaceC0165k = menuC0167m.f2749e) != null) {
            interfaceC0165k.p(menuC0167m);
        }
        View view = (View) c0221k.h;
        if (view != null && view.getWindowToken() != null) {
            C0213g c0213g = this.f2985a;
            if (!c0213g.b()) {
                if (c0213g.f2810e != null) {
                    c0213g.d(0, 0, false, false);
                }
            }
            c0221k.f3002s = c0213g;
        }
        c0221k.f3004u = null;
    }
}
