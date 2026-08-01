package l;

import android.view.View;
import k.InterfaceC0164k;
import k.MenuC0166m;

/* renamed from: l.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0215i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final C0211g f2949a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0219k f2950b;

    public RunnableC0215i(C0219k c0219k, C0211g c0211g) {
        this.f2950b = c0219k;
        this.f2949a = c0211g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0164k interfaceC0164k;
        C0219k c0219k = this.f2950b;
        MenuC0166m menuC0166m = c0219k.f2959c;
        if (menuC0166m != null && (interfaceC0164k = menuC0166m.f2716e) != null) {
            interfaceC0164k.p(menuC0166m);
        }
        View view = (View) c0219k.h;
        if (view != null && view.getWindowToken() != null) {
            C0211g c0211g = this.f2949a;
            if (!c0211g.b()) {
                if (c0211g.f2777e != null) {
                    c0211g.d(0, 0, false, false);
                }
            }
            c0219k.f2972s = c0211g;
        }
        c0219k.f2974u = null;
    }
}
