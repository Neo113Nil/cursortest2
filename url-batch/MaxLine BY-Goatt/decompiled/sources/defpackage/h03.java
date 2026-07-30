package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class h03 implements bm0 {
    public final int a;
    public final int b;
    public final bf0 c;

    public h03(int i, bf0 bf0Var, int i2) {
        this(i, 0, (i2 & 4) != 0 ? cf0.a : bf0Var);
    }

    @Override // defpackage.md
    public final c43 a(k03 k03Var) {
        return new yq(this.a, this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h03) {
            h03 h03Var = (h03) obj;
            if (h03Var.a == this.a && h03Var.b == this.b && Intrinsics.b(h03Var.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.c.hashCode() + (this.a * 31)) * 31) + this.b;
    }

    public h03(int i, int i2, bf0 bf0Var) {
        this.a = i;
        this.b = i2;
        this.c = bf0Var;
    }
}
