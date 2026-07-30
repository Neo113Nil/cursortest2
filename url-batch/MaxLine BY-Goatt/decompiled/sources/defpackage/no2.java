package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class no2 implements c43 {
    public final c43 m;
    public final long n;

    public no2(c43 c43Var, long j) {
        this.m = c43Var;
        this.n = j;
    }

    @Override // defpackage.c43
    public final boolean a() {
        return this.m.a();
    }

    @Override // defpackage.c43
    public final long e(sd sdVar, sd sdVar2, sd sdVar3) {
        return this.m.e(sdVar, sdVar2, sdVar3) + this.n;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof no2)) {
            return false;
        }
        no2 no2Var = (no2) obj;
        return no2Var.n == this.n && Intrinsics.b(no2Var.m, this.m);
    }

    public final int hashCode() {
        return Long.hashCode(this.n) + (this.m.hashCode() * 31);
    }

    @Override // defpackage.c43
    public final sd l(long j, sd sdVar, sd sdVar2, sd sdVar3) {
        long j2 = this.n;
        return j < j2 ? sdVar3 : this.m.l(j - j2, sdVar, sdVar2, sdVar3);
    }

    @Override // defpackage.c43
    public final sd n(long j, sd sdVar, sd sdVar2, sd sdVar3) {
        long j2 = this.n;
        return j < j2 ? sdVar : this.m.n(j - j2, sdVar, sdVar2, sdVar3);
    }
}
