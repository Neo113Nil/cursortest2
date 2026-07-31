package x2;

import q2.AbstractC0831s;
import v2.n;

/* loaded from: classes.dex */
public final class l extends AbstractC0831s {

    /* renamed from: f, reason: collision with root package name */
    public static final l f10360f = new l();

    @Override // q2.AbstractC0831s
    public final void D(V1.i iVar, Runnable runnable) {
        e.f10348g.f10350f.b(runnable, true, false);
    }

    @Override // q2.AbstractC0831s
    public final void E(V1.i iVar, Runnable runnable) {
        e.f10348g.f10350f.b(runnable, true, true);
    }

    @Override // q2.AbstractC0831s
    public final AbstractC0831s G(String str, int i3) {
        v2.a.c(i3);
        return i3 >= k.f10357d ? str != null ? new n(this, str) : this : super.G(str, i3);
    }

    @Override // q2.AbstractC0831s
    public final String toString() {
        return "Dispatchers.IO";
    }
}
