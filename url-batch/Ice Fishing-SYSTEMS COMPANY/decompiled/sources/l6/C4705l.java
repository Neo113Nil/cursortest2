package l6;

import java.util.logging.Level;

/* renamed from: l6.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4705l implements InterfaceC4699f {

    /* renamed from: n, reason: collision with root package name */
    public final C4694a f39072n;

    /* renamed from: u, reason: collision with root package name */
    public final C4694a f39073u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f39074v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ EnumC4706m f39075w;

    public C4705l(EnumC4706m enumC4706m, C4694a c4694a, C4694a c4694a2) {
        this.f39075w = enumC4706m;
        this.f39072n = c4694a;
        this.f39073u = c4694a2;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f39074v || this.f39075w.j() != this.f39073u) {
            EnumC4706m.f39077u.log(Level.FINE, " Trying to close scope which does not represent current context. Ignoring the call.");
        } else {
            this.f39074v = true;
            EnumC4706m.f39078v.set(this.f39072n);
        }
    }
}
