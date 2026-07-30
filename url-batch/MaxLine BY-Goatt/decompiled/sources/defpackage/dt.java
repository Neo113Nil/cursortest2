package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class dt {
    public static final dt c = new dt(zv.Q(new ArrayList()), null);
    public final Set a;
    public final yj1 b;

    public dt(Set set, yj1 yj1Var) {
        set.getClass();
        this.a = set;
        this.b = yj1Var;
    }

    public final void a(String str, Function0 function0) {
        str.getClass();
        Set set = this.a;
        ah0 ah0Var = ah0.m;
        Iterator it = set.iterator();
        if (!it.hasNext()) {
            ah0Var.getClass();
        } else {
            it.next().getClass();
            b71.o();
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dt)) {
            return false;
        }
        dt dtVar = (dt) obj;
        return Intrinsics.b(dtVar.a, this.a) && Intrinsics.b(dtVar.b, this.b);
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() + 1517) * 41;
        yj1 yj1Var = this.b;
        return hashCode + (yj1Var != null ? yj1Var.hashCode() : 0);
    }
}
