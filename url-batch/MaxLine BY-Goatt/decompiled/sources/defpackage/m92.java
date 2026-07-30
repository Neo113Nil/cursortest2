package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class m92 {
    public final int a;
    public final jq0 b;
    public final iq0 c;

    public m92(int i, jq0 jq0Var, iq0 iq0Var) {
        this.a = i;
        this.b = jq0Var;
        this.c = iq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m92)) {
            return false;
        }
        m92 m92Var = (m92) obj;
        return this.a == m92Var.a && Intrinsics.b(this.b, m92Var.b) && this.c.equals(m92Var.c);
    }

    public final int hashCode() {
        return this.c.a.hashCode() + q40.e(0, q40.e(0, ((this.a * 31) + this.b.m) * 31, 31), 31);
    }

    public final String toString() {
        return "ResourceFont(resId=" + this.a + ", weight=" + this.b + ", style=" + ((Object) "Normal") + ", loadingStrategy=Blocking)";
    }
}
