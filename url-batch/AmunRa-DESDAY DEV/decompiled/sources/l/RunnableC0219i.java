package l;

import android.view.View;
import k.InterfaceC0156k;
import k.MenuC0158m;

/* renamed from: l.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0219i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final C0215g f3068a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0223k f3069b;

    public RunnableC0219i(C0223k c0223k, C0215g c0215g) {
        this.f3069b = c0223k;
        this.f3068a = c0215g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0156k interfaceC0156k;
        C0223k c0223k = this.f3069b;
        MenuC0158m menuC0158m = c0223k.f3088c;
        if (menuC0158m != null && (interfaceC0156k = menuC0158m.f2605e) != null) {
            interfaceC0156k.e(menuC0158m);
        }
        View view = (View) c0223k.h;
        if (view != null && view.getWindowToken() != null) {
            C0215g c0215g = this.f3068a;
            if (!c0215g.b()) {
                if (c0215g.f2666e != null) {
                    c0215g.d(0, 0, false, false);
                }
            }
            c0223k.f3101s = c0215g;
        }
        c0223k.f3103u = null;
    }
}
