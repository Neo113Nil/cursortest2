package r2;

import k2.AbstractC0546s;
import p2.o;

/* loaded from: classes.dex */
public final class l extends AbstractC0546s {

    /* renamed from: f, reason: collision with root package name */
    public static final l f7335f = new l();

    @Override // k2.AbstractC0546s
    public final void P(P1.i iVar, Runnable runnable) {
        e.f7323g.f7325f.b(runnable, true, false);
    }

    @Override // k2.AbstractC0546s
    public final AbstractC0546s R(String str, int i3) {
        p2.a.c(i3);
        return i3 >= k.f7332d ? str != null ? new o(this, str) : this : super.R(str, i3);
    }

    @Override // k2.AbstractC0546s
    public final String toString() {
        return "Dispatchers.IO";
    }
}
