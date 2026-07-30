package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class tn2 extends nk0 {
    public final t01 a;
    public final String b;
    public final m60 c;

    public tn2(t01 t01Var, String str, m60 m60Var) {
        this.a = t01Var;
        this.b = str;
        this.c = m60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tn2)) {
            return false;
        }
        tn2 tn2Var = (tn2) obj;
        return this.a.equals(tn2Var.a) && Intrinsics.b(this.b, tn2Var.b) && this.c == tn2Var.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 31);
    }
}
