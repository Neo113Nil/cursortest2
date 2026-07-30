package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class sj1 implements lu {
    public final int d;
    public final pu e;

    public sj1(int i, pu puVar) {
        this.d = i;
        this.e = puVar;
    }

    @Override // defpackage.p7
    public final qm1 a(c51 c51Var) {
        return new jj(this.d, this.e);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof sj1)) {
            return false;
        }
        sj1 sj1Var = (sj1) obj;
        return sj1Var.d == this.d && Intrinsics.a(sj1Var.e, this.e);
    }

    public final int hashCode() {
        return (this.e.hashCode() + (this.d * 31)) * 31;
    }

    @Override // defpackage.lu, defpackage.p7
    public final sm1 a(c51 c51Var) {
        return new jj(this.d, this.e);
    }
}
