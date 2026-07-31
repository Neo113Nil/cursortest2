package f4;

import java.util.logging.Level;

/* renamed from: f4.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0385l implements InterfaceC0379f {

    /* renamed from: f, reason: collision with root package name */
    public final C0374a f4240f;

    /* renamed from: g, reason: collision with root package name */
    public final C0374a f4241g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4242h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ EnumC0386m f4243i;

    public C0385l(EnumC0386m enumC0386m, C0374a c0374a, C0374a c0374a2) {
        this.f4243i = enumC0386m;
        this.f4240f = c0374a;
        this.f4241g = c0374a2;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f4242h || this.f4243i.current() != this.f4241g) {
            EnumC0386m.f4245g.log(Level.FINE, " Trying to close scope which does not represent current context. Ignoring the call.");
        } else {
            this.f4242h = true;
            EnumC0386m.f4246h.set(this.f4240f);
        }
    }
}
