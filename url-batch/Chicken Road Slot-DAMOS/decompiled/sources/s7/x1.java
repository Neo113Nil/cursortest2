package s7;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class x1 extends c1.b {

    /* renamed from: e, reason: collision with root package name */
    public boolean f9095e;

    public x1(q1 q1Var) {
        super(q1Var);
        ((q1) this.f1478d).O++;
    }

    public abstract boolean t();

    public final void u() {
        if (this.f9095e) {
            return;
        }
        kotlin.collections.i0.l("Not initialized");
    }

    public final void v() {
        if (this.f9095e) {
            kotlin.collections.i0.l("Can't initialize twice");
        } else {
            if (t()) {
                return;
            }
            ((q1) this.f1478d).Q.incrementAndGet();
            this.f9095e = true;
        }
    }
}
