package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class jk2 {
    public final yb2 a;
    public final yb2 b;
    public final yb2 c;
    public final yb2 d;
    public final yb2 e;

    public jk2() {
        yb2 yb2Var = hk2.a;
        yb2 yb2Var2 = hk2.b;
        yb2 yb2Var3 = hk2.c;
        yb2 yb2Var4 = hk2.d;
        yb2 yb2Var5 = hk2.e;
        this.a = yb2Var;
        this.b = yb2Var2;
        this.c = yb2Var3;
        this.d = yb2Var4;
        this.e = yb2Var5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jk2)) {
            return false;
        }
        jk2 jk2Var = (jk2) obj;
        return Intrinsics.b(this.a, jk2Var.a) && Intrinsics.b(this.b, jk2Var.b) && Intrinsics.b(this.c, jk2Var.c) && Intrinsics.b(this.d, jk2Var.d) && Intrinsics.b(this.e, jk2Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.a + ", small=" + this.b + ", medium=" + this.c + ", large=" + this.d + ", extraLarge=" + this.e + ')';
    }
}
