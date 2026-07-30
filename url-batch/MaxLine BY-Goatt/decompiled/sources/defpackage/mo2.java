package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class mo2 implements md {
    public final md a;
    public final long b;

    public mo2(bm0 bm0Var, long j) {
        this.a = bm0Var;
        this.b = j;
    }

    @Override // defpackage.md
    public final c43 a(k03 k03Var) {
        return new no2(this.a.a(k03Var), this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof mo2)) {
            return false;
        }
        mo2 mo2Var = (mo2) obj;
        return mo2Var.b == this.b && Intrinsics.b(mo2Var.a, this.a);
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
