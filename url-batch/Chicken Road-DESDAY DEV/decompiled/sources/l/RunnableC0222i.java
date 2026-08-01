package l;

import android.view.View;
import k.InterfaceC0159k;
import k.MenuC0161m;

/* renamed from: l.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0222i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final C0218g f2922a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0226k f2923b;

    public RunnableC0222i(C0226k c0226k, C0218g c0218g) {
        this.f2923b = c0226k;
        this.f2922a = c0218g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0159k interfaceC0159k;
        C0226k c0226k = this.f2923b;
        MenuC0161m menuC0161m = c0226k.f2942c;
        if (menuC0161m != null && (interfaceC0159k = menuC0161m.f2615e) != null) {
            interfaceC0159k.o(menuC0161m);
        }
        View view = (View) c0226k.h;
        if (view != null && view.getWindowToken() != null) {
            C0218g c0218g = this.f2922a;
            if (!c0218g.b()) {
                if (c0218g.f2676e != null) {
                    c0218g.d(0, 0, false, false);
                }
            }
            c0226k.f2955s = c0218g;
        }
        c0226k.f2957u = null;
    }
}
