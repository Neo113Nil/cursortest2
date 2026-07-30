package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class zi extends cj {
    public final xy1 a;
    public final ni0 b;

    public zi(xy1 xy1Var, ni0 ni0Var) {
        this.a = xy1Var;
        this.b = ni0Var;
    }

    @Override // defpackage.cj
    public final xy1 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zi)) {
            return false;
        }
        zi ziVar = (zi) obj;
        return Intrinsics.b(this.a, ziVar.a) && this.b.equals(ziVar.b);
    }

    public final int hashCode() {
        xy1 xy1Var = this.a;
        return this.b.hashCode() + ((xy1Var == null ? 0 : xy1Var.hashCode()) * 31);
    }

    public final String toString() {
        return "Error(painter=" + this.a + ", result=" + this.b + ')';
    }
}
