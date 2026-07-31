package h;

import B0.E;

/* renamed from: h.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0138e implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0139f f1971e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ MenuItemC0144k f1972f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ MenuC0143j f1973g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ E f1974h;

    public RunnableC0138e(E e2, C0139f c0139f, MenuItemC0144k menuItemC0144k, MenuC0143j menuC0143j) {
        this.f1974h = e2;
        this.f1971e = c0139f;
        this.f1972f = menuItemC0144k;
        this.f1973g = menuC0143j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewOnKeyListenerC0140g viewOnKeyListenerC0140g = (ViewOnKeyListenerC0140g) this.f1974h.f20f;
        C0139f c0139f = this.f1971e;
        if (c0139f != null) {
            viewOnKeyListenerC0140g.f1981D = true;
            c0139f.f1976b.c(false);
            viewOnKeyListenerC0140g.f1981D = false;
        }
        MenuItemC0144k menuItemC0144k = this.f1972f;
        if (menuItemC0144k.isEnabled() && menuItemC0144k.hasSubMenu()) {
            this.f1973g.p(menuItemC0144k, null, 4);
        }
    }
}
