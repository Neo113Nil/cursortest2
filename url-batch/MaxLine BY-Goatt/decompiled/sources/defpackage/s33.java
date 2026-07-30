package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class s33 implements z63 {
    public final String a;
    public final lz1 b;

    public s33(f31 f31Var, String str) {
        this.a = str;
        this.b = ij2.j(f31Var);
    }

    @Override // defpackage.z63
    public final int a(ca0 ca0Var) {
        return e().d;
    }

    @Override // defpackage.z63
    public final int b(ca0 ca0Var) {
        return e().b;
    }

    @Override // defpackage.z63
    public final int c(ca0 ca0Var, u81 u81Var) {
        return e().c;
    }

    @Override // defpackage.z63
    public final int d(ca0 ca0Var, u81 u81Var) {
        return e().a;
    }

    public final f31 e() {
        return (f31) this.b.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof s33) {
            return Intrinsics.b(e(), ((s33) obj).e());
        }
        return false;
    }

    public final void f(f31 f31Var) {
        this.b.setValue(f31Var);
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
        return q40.o(sb, e().d, ')');
    }
}
