package f8;

import java.util.Set;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class w extends k7.e {
    @Override // k7.e
    public final void k(c0 c0Var, Set set) {
        synchronized (c0Var) {
            try {
                if (c0Var.f4199v == null) {
                    c0Var.f4199v = set;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // k7.e
    public final int m(c0 c0Var) {
        int i3;
        synchronized (c0Var) {
            i3 = c0Var.f4200w - 1;
            c0Var.f4200w = i3;
        }
        return i3;
    }
}
