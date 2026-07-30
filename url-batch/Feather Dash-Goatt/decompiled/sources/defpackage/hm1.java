package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class hm1 implements ro1 {
    public final String a;
    public final av0 b;

    public hm1(i90 i90Var, String str) {
        this.a = str;
        this.b = gb0.F(i90Var);
    }

    @Override // defpackage.ro1
    public final int a(nr nrVar) {
        return e().d;
    }

    @Override // defpackage.ro1
    public final int b(nr nrVar) {
        return e().b;
    }

    @Override // defpackage.ro1
    public final int c(nr nrVar, vc0 vc0Var) {
        return e().c;
    }

    @Override // defpackage.ro1
    public final int d(nr nrVar, vc0 vc0Var) {
        return e().a;
    }

    public final i90 e() {
        return (i90) this.b.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hm1) {
            return Intrinsics.a(e(), ((hm1) obj).e());
        }
        return false;
    }

    public final void f(i90 i90Var) {
        this.b.setValue(i90Var);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append("(left=");
        sb.append(e().a);
        sb.append(", top=");
        sb.append(e().b);
        sb.append(", right=");
        sb.append(e().c);
        sb.append(", bottom=");
        return qy0.m(sb, e().d, ')');
    }
}
