package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class bh2 {
    public final ah2 a;
    public final ah2 b;
    public final boolean c;

    public bh2(ah2 ah2Var, ah2 ah2Var2, boolean z) {
        this.a = ah2Var;
        this.b = ah2Var2;
        this.c = z;
    }

    public static bh2 a(bh2 bh2Var, ah2 ah2Var, ah2 ah2Var2, boolean z, int i) {
        if ((i & 1) != 0) {
            ah2Var = bh2Var.a;
        }
        if ((i & 2) != 0) {
            ah2Var2 = bh2Var.b;
        }
        bh2Var.getClass();
        return new bh2(ah2Var, ah2Var2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bh2)) {
            return false;
        }
        bh2 bh2Var = (bh2) obj;
        return Intrinsics.b(this.a, bh2Var.a) && Intrinsics.b(this.b, bh2Var.b) && this.c == bh2Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Selection(start=" + this.a + ", end=" + this.b + ", handlesCrossed=" + this.c + ')';
    }
}
