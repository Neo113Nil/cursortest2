package s7;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class g0 extends b0 {

    /* renamed from: e, reason: collision with root package name */
    public boolean f8703e;

    public g0(q1 q1Var) {
        super(q1Var);
        ((q1) this.f1478d).O++;
    }

    public final void t() {
        if (this.f8703e) {
            return;
        }
        kotlin.collections.i0.l("Not initialized");
    }

    public final void u() {
        if (this.f8703e) {
            kotlin.collections.i0.l("Can't initialize twice");
        } else {
            if (v()) {
                return;
            }
            ((q1) this.f1478d).Q.incrementAndGet();
            this.f8703e = true;
        }
    }

    public abstract boolean v();
}
