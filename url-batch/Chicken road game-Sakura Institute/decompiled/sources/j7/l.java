package j7;

import c7.t;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class l extends t {

    /* renamed from: h, reason: collision with root package name */
    public static final l f5165h = new l();

    @Override // c7.t
    public final void V(h6.i iVar, Runnable runnable) {
        e.f5153i.f5155h.c(runnable, true, false);
    }

    @Override // c7.t
    public final void W(h6.i iVar, Runnable runnable) {
        e.f5153i.f5155h.c(runnable, true, true);
    }

    @Override // c7.t
    public final t Y(int i7) {
        h7.a.a(i7);
        return i7 >= k.f5162d ? this : super.Y(i7);
    }

    @Override // c7.t
    public final String toString() {
        return "Dispatchers.IO";
    }
}
