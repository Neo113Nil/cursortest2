package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class vs {
    public final List a;
    public final List b;

    public vs(le1 le1Var, le1 le1Var2) {
        le1Var.getClass();
        le1Var2.getClass();
        this.a = le1Var;
        this.b = le1Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vs)) {
            return false;
        }
        vs vsVar = (vs) obj;
        return Intrinsics.b(this.a, vsVar.a) && Intrinsics.b(this.b, vsVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Content(warnings=" + this.a + ", storage=" + this.b + ")";
    }
}
