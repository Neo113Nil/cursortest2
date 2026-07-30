package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ce1 extends ee1 {
    public final String a;
    public final fw2 b;

    public ce1(String str, fw2 fw2Var) {
        this.a = str;
        this.b = fw2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ce1)) {
            return false;
        }
        ce1 ce1Var = (ce1) obj;
        return this.a.equals(ce1Var.a) && Intrinsics.b(this.b, ce1Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        fw2 fw2Var = this.b;
        return (hashCode + (fw2Var != null ? fw2Var.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return in1.m(new StringBuilder("LinkAnnotation.Clickable(tag="), this.a, ')');
    }
}
