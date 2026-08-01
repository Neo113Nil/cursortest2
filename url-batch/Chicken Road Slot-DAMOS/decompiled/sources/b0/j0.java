package b0;

import c2.r1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class j0 extends d1.k implements r1 {
    public float C;
    public boolean D;

    @Override // c2.r1
    public final Object q(Object obj) {
        q0 q0Var = obj instanceof q0 ? (q0) obj : null;
        if (q0Var == null) {
            q0Var = new q0();
            q0Var.f884a = 0.0f;
            q0Var.f885b = true;
        }
        q0Var.f884a = this.C;
        q0Var.f885b = this.D;
        return q0Var;
    }
}
