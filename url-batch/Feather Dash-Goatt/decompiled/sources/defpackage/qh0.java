package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class qh0 extends rh0 {
    public final String a;
    public final jh1 b;

    public qh0(String str, jh1 jh1Var) {
        this.a = str;
        this.b = jh1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qh0)) {
            return false;
        }
        qh0 qh0Var = (qh0) obj;
        return this.a.equals(qh0Var.a) && Intrinsics.a(this.b, qh0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        jh1 jh1Var = this.b;
        return (hashCode + (jh1Var != null ? jh1Var.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return "LinkAnnotation.Url(url=" + this.a + ')';
    }
}
