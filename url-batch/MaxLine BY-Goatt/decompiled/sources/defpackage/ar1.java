package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ar1 extends s93 {
    public final sq1 s;

    public ar1(sq1 sq1Var) {
        sq1Var.getClass();
        this.s = sq1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && ar1.class == obj.getClass() && Intrinsics.b(this.s, ((ar1) obj).s);
    }

    public final int hashCode() {
        return this.s.hashCode() - 31;
    }

    public final String toString() {
        return "InProgress(latestEvent=" + this.s + ", direction=-1)";
    }
}
