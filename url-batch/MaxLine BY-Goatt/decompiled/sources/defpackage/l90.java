package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class l90 {
    public final sl2 a;
    public final me2 b;
    public final s32 c;

    public l90(sl2 sl2Var, me2 me2Var, s32 s32Var) {
        this.a = sl2Var;
        this.b = me2Var;
        this.c = s32Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l90)) {
            return false;
        }
        l90 l90Var = (l90) obj;
        return Intrinsics.b(this.a, l90Var.a) && this.b == l90Var.b && this.c == l90Var.c;
    }

    public final int hashCode() {
        sl2 sl2Var = this.a;
        int hashCode = (sl2Var != null ? sl2Var.hashCode() : 0) * 31;
        me2 me2Var = this.b;
        int hashCode2 = (hashCode + (me2Var != null ? me2Var.hashCode() : 0)) * 887503681;
        s32 s32Var = this.c;
        return (hashCode2 + (s32Var != null ? s32Var.hashCode() : 0)) * 887503681;
    }
}
