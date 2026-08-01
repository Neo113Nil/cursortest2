package s7;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class d4 extends z3 {

    /* renamed from: i, reason: collision with root package name */
    public boolean f8593i;

    public d4(j4 j4Var) {
        super(j4Var);
        this.f9150e.F++;
    }

    public final void t() {
        if (this.f8593i) {
            return;
        }
        kotlin.collections.i0.l("Not initialized");
    }

    public final void u() {
        if (this.f8593i) {
            kotlin.collections.i0.l("Can't initialize twice");
            return;
        }
        v();
        this.f9150e.G++;
        this.f8593i = true;
    }

    public abstract void v();
}
