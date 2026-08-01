package n0;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class z implements a2 {

    /* renamed from: d, reason: collision with root package name */
    public final Function1 f6871d;

    /* renamed from: e, reason: collision with root package name */
    public a0 f6872e;

    public z(Function1 function1) {
        this.f6871d = function1;
    }

    @Override // n0.a2
    public final void b() {
        this.f6872e = (a0) this.f6871d.invoke(h.f6688d);
    }

    @Override // n0.a2
    public final void e() {
        a0 a0Var = this.f6872e;
        if (a0Var != null) {
            a0Var.a();
        }
        this.f6872e = null;
    }

    @Override // n0.a2
    public final void c() {
    }
}
