package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class mv0 extends yn1 {
    @Override // defpackage.yn1
    public final yn1 C(Function1 function1, Function1 function12) {
        return (yn1) ((nm2) tm2.f(new a0(13, new q30(1, function1, function12))));
    }

    @Override // defpackage.yn1, defpackage.nm2
    public final void c() {
        synchronized (tm2.c) {
            o();
            Unit unit = Unit.a;
        }
    }

    @Override // defpackage.yn1, defpackage.nm2
    public final void k() {
        uj2.h();
        throw null;
    }

    @Override // defpackage.yn1, defpackage.nm2
    public final void l() {
        uj2.h();
        throw null;
    }

    @Override // defpackage.yn1, defpackage.nm2
    public final void m() {
        tm2.a();
    }

    @Override // defpackage.yn1, defpackage.nm2
    public final nm2 u(Function1 function1) {
        return (l62) ((nm2) tm2.f(new a0(13, new lv0(function1, 0))));
    }

    @Override // defpackage.yn1
    public final mi2 w() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }
}
