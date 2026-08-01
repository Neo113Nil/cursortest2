package b1;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c extends d {
    @Override // b1.d
    public final d C(Function1 function1, Function1 function12) {
        return (d) ((i) r.e(new q(0, new a(0, function1, function12))));
    }

    @Override // b1.d, b1.i
    public final void c() {
        synchronized (r.f1030c) {
            o();
        }
    }

    @Override // b1.d, b1.i
    public final void k() {
        x.l();
        throw null;
    }

    @Override // b1.d, b1.i
    public final void l() {
        x.l();
        throw null;
    }

    @Override // b1.d, b1.i
    public final void m() {
        r.a();
    }

    @Override // b1.d, b1.i
    public final i u(Function1 function1) {
        int i3 = 0;
        return (g) ((i) r.e(new q(i3, new b(i3, function1))));
    }

    @Override // b1.d
    public final x w() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }
}
