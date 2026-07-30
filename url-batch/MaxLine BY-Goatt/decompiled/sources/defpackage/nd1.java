package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class nd1 implements z63 {
    public final z63 a;
    public final int b;

    public nd1(fc fcVar, int i) {
        this.a = fcVar;
        this.b = i;
    }

    @Override // defpackage.z63
    public final int a(ca0 ca0Var) {
        if ((this.b & 32) != 0) {
            return this.a.a(ca0Var);
        }
        return 0;
    }

    @Override // defpackage.z63
    public final int b(ca0 ca0Var) {
        if ((this.b & 16) != 0) {
            return this.a.b(ca0Var);
        }
        return 0;
    }

    @Override // defpackage.z63
    public final int c(ca0 ca0Var, u81 u81Var) {
        if (((u81Var == u81.m ? 4 : 1) & this.b) != 0) {
            return this.a.c(ca0Var, u81Var);
        }
        return 0;
    }

    @Override // defpackage.z63
    public final int d(ca0 ca0Var, u81 u81Var) {
        if (((u81Var == u81.m ? 8 : 2) & this.b) != 0) {
            return this.a.d(ca0Var, u81Var);
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nd1)) {
            return false;
        }
        nd1 nd1Var = (nd1) obj;
        return Intrinsics.b(this.a, nd1Var.a) && this.b == nd1Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.a);
        sb.append(" only ");
        StringBuilder sb2 = new StringBuilder("WindowInsetsSides(");
        StringBuilder sb3 = new StringBuilder();
        int i = this.b;
        int i2 = hl2.a;
        if ((i & i2) == i2) {
            hl2.p(sb3, "Start");
        }
        int i3 = hl2.c;
        if ((i & i3) == i3) {
            hl2.p(sb3, "Left");
        }
        if ((i & 16) == 16) {
            hl2.p(sb3, "Top");
        }
        int i4 = hl2.b;
        if ((i & i4) == i4) {
            hl2.p(sb3, "End");
        }
        int i5 = hl2.d;
        if ((i & i5) == i5) {
            hl2.p(sb3, "Right");
        }
        if ((i & 32) == 32) {
            hl2.p(sb3, "Bottom");
        }
        sb2.append(sb3.toString());
        sb2.append(')');
        sb.append((Object) sb2.toString());
        sb.append(')');
        return sb.toString();
    }
}
