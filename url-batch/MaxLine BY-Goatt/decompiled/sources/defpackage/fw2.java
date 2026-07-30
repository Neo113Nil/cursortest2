package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class fw2 {
    public final un2 a;
    public final un2 b;
    public final un2 c;
    public final un2 d;

    public fw2(un2 un2Var, un2 un2Var2, un2 un2Var3, un2 un2Var4) {
        this.a = un2Var;
        this.b = un2Var2;
        this.c = un2Var3;
        this.d = un2Var4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof fw2)) {
            return false;
        }
        fw2 fw2Var = (fw2) obj;
        return Intrinsics.b(this.a, fw2Var.a) && Intrinsics.b(this.b, fw2Var.b) && Intrinsics.b(this.c, fw2Var.c) && Intrinsics.b(this.d, fw2Var.d);
    }

    public final int hashCode() {
        un2 un2Var = this.a;
        int hashCode = (un2Var != null ? un2Var.hashCode() : 0) * 31;
        un2 un2Var2 = this.b;
        int hashCode2 = (hashCode + (un2Var2 != null ? un2Var2.hashCode() : 0)) * 31;
        un2 un2Var3 = this.c;
        int hashCode3 = (hashCode2 + (un2Var3 != null ? un2Var3.hashCode() : 0)) * 31;
        un2 un2Var4 = this.d;
        return hashCode3 + (un2Var4 != null ? un2Var4.hashCode() : 0);
    }
}
