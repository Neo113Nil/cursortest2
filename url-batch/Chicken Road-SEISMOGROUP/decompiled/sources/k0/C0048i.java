package k0;

import java.util.concurrent.CancellationException;

/* renamed from: k0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0048i extends M implements InterfaceC0047h {

    /* renamed from: f, reason: collision with root package name */
    public final T f919f;

    public C0048i(T t) {
        this.f919f = t;
    }

    @Override // k0.InterfaceC0047h
    public final boolean g(Throwable th) {
        T n2 = n();
        if (th instanceof CancellationException) {
            return true;
        }
        return n2.o(th) && n2.w();
    }

    @Override // d0.l
    public final /* bridge */ /* synthetic */ Object h(Object obj) {
        o((Throwable) obj);
        return U.g.f433a;
    }

    @Override // k0.O
    public final void o(Throwable th) {
        this.f919f.o(n());
    }
}
