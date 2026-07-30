package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class b40 extends kf implements a40, xb0, z30 {
    private final int k;
    private final int l;

    public b40(int i, int i2, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.k = i;
        this.l = 0;
    }

    @Override // defpackage.kf
    public final xb0 c() {
        a21.a.getClass();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [xb0] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b40) {
            b40 b40Var = (b40) obj;
            return e().equals(b40Var.e()) && h().equals(b40Var.h()) && this.l == b40Var.l && this.k == b40Var.k && Intrinsics.a(this.e, b40Var.e) && Intrinsics.a(g(), b40Var.g());
        }
        if (!(obj instanceof b40)) {
            return false;
        }
        ?? r0 = this.d;
        if (r0 == 0) {
            c();
            this.d = this;
        } else {
            this = r0;
        }
        return obj.equals(this);
    }

    @Override // defpackage.a40
    public final int getArity() {
        return this.k;
    }

    public final int hashCode() {
        return h().hashCode() + ((e().hashCode() + (g() == null ? 0 : g().hashCode() * 31)) * 31);
    }

    public final String toString() {
        xb0 xb0Var = this.d;
        if (xb0Var == null) {
            c();
            this.d = this;
            xb0Var = this;
        }
        if (xb0Var != this) {
            return xb0Var.toString();
        }
        if ("<init>".equals(e())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + e() + " (Kotlin reflection is not available)";
    }
}
