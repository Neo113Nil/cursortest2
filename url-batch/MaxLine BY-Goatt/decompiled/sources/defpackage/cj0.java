package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class cj0 implements m03, Cloneable {
    public static final cj0 o;
    public List m;
    public List n;

    static {
        cj0 cj0Var = new cj0();
        List list = Collections.EMPTY_LIST;
        cj0Var.m = list;
        cj0Var.n = list;
        o = cj0Var;
    }

    @Override // defpackage.m03
    public final l03 a(uw0 uw0Var, v03 v03Var) {
        boolean z;
        boolean z2;
        Class cls = v03Var.a;
        boolean z3 = !Enum.class.isAssignableFrom(cls) && (cls.isAnonymousClass() || cls.isLocalClass());
        if (z3) {
            z = true;
        } else {
            b(true);
            z = false;
        }
        if (z3) {
            z2 = true;
        } else {
            b(false);
            z2 = false;
        }
        if (z || z2) {
            return new bj0(this, z2, z, uw0Var, v03Var);
        }
        return null;
    }

    public final void b(boolean z) {
        Iterator it = (z ? this.m : this.n).iterator();
        if (it.hasNext()) {
            it.next().getClass();
            b71.o();
        }
    }

    public final Object clone() {
        try {
            return (cj0) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }
}
