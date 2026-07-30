package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class c01 extends kf implements dc0 {
    public final boolean k;

    public c01(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.k = false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c01) {
            c01 c01Var = (c01) obj;
            return g().equals(c01Var.g()) && e().equals(c01Var.e()) && h().equals(c01Var.h()) && Intrinsics.a(this.e, c01Var.e);
        }
        if (obj instanceof dc0) {
            return obj.equals(i());
        }
        return false;
    }

    public final int hashCode() {
        return h().hashCode() + ((e().hashCode() + (g().hashCode() * 31)) * 31);
    }

    public final xb0 i() {
        if (this.k) {
            return this;
        }
        xb0 xb0Var = this.d;
        if (xb0Var != null) {
            return xb0Var;
        }
        xb0 c = c();
        this.d = c;
        return c;
    }

    public final dc0 j() {
        if (this.k) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        xb0 i = i();
        if (i != this) {
            return (dc0) i;
        }
        throw new lc0();
    }

    public final String toString() {
        xb0 i = i();
        if (i != this) {
            return i.toString();
        }
        return "property " + e() + " (Kotlin reflection is not available)";
    }

    public c01() {
        this.k = false;
    }
}
