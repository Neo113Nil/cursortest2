package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class x40 extends zn0 {
    @Override // defpackage.zn0
    public final zn0 C(Function1 function1, Function1 function12) {
        return (zn0) ((ib1) pb1.e(new ob1(new qz(function1, 1, function12), 0)));
    }

    @Override // defpackage.zn0, defpackage.ib1
    public final void c() {
        synchronized (pb1.c) {
            o();
        }
    }

    @Override // defpackage.zn0, defpackage.ib1
    public final void k() {
        t80.O();
        throw null;
    }

    @Override // defpackage.zn0, defpackage.ib1
    public final void l() {
        t80.O();
        throw null;
    }

    @Override // defpackage.zn0, defpackage.ib1
    public final void m() {
        pb1.a();
    }

    @Override // defpackage.zn0, defpackage.ib1
    public final ib1 u(Function1 function1) {
        return (f11) ((ib1) pb1.e(new ob1(new pe(1, function1), 0)));
    }

    @Override // defpackage.zn0
    public final ka0 w() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }
}
