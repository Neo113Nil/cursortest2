package defpackage;

import android.transition.Transition;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class c90 extends b90 {
    public final Object c;
    public final boolean d;
    public final Object e;

    public c90(bo2 bo2Var, is isVar, boolean z, boolean z2) {
        super(bo2Var, isVar);
        int i = bo2Var.a;
        fr0 fr0Var = bo2Var.c;
        if (i == 2) {
            this.c = z ? fr0Var.getReenterTransition() : fr0Var.getEnterTransition();
            this.d = z ? fr0Var.getAllowReturnTransitionOverlap() : fr0Var.getAllowEnterTransitionOverlap();
        } else {
            this.c = z ? fr0Var.getReturnTransition() : fr0Var.getExitTransition();
            this.d = true;
        }
        if (!z2) {
            this.e = null;
        } else if (z) {
            this.e = fr0Var.getSharedElementReturnTransition();
        } else {
            this.e = fr0Var.getSharedElementEnterTransition();
        }
    }

    public final vs0 o(Object obj) {
        if (obj == null) {
            return null;
        }
        vs0 vs0Var = qs0.a;
        boolean z = obj instanceof Transition;
        if (z) {
            return vs0Var;
        }
        vs0 vs0Var2 = qs0.b;
        if (vs0Var2 != null && z) {
            return vs0Var2;
        }
        StringBuilder sb = new StringBuilder("Transition ");
        sb.append(obj);
        fr0 fr0Var = ((bo2) this.a).c;
        sb.append(" for fragment ");
        sb.append(fr0Var);
        sb.append(" is not a valid framework Transition or AndroidX Transition");
        throw new IllegalArgumentException(sb.toString());
    }
}
