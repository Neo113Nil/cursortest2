package b0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public float f884a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f885b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return Float.compare(this.f884a, q0Var.f884a) == 0 && this.f885b == q0Var.f885b;
    }

    public final int hashCode() {
        return n0.l.d(Float.hashCode(this.f884a) * 31, 961, this.f885b);
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.f884a + ", fill=" + this.f885b + ", crossAxisAlignment=null, flowLayoutData=null)";
    }
}
