package O5;

import H5.AbstractC0161v;
import o5.InterfaceC0569i;

/* loaded from: classes.dex */
public final class k extends AbstractC0161v {

    /* renamed from: h, reason: collision with root package name */
    public static final k f1830h = new k();

    @Override // H5.AbstractC0161v
    public final void F(InterfaceC0569i interfaceC0569i, Runnable runnable) {
        d dVar = d.f1816i;
        dVar.f1818h.d(runnable, j.f1829h, false);
    }

    @Override // H5.AbstractC0161v
    public final void G(InterfaceC0569i interfaceC0569i, Runnable runnable) {
        d dVar = d.f1816i;
        dVar.f1818h.d(runnable, j.f1829h, true);
    }

    public final AbstractC0161v I(int i7) {
        M5.a.a(i7);
        if (i7 >= j.f1825d) {
            return this;
        }
        M5.a.a(i7);
        return new M5.i(this, i7);
    }
}
