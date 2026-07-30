package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class ho {
    public final v01 a;
    public final boolean b;

    public ho(v01 v01Var, boolean z) {
        this.a = v01Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ho) {
            ho hoVar = (ho) obj;
            if (hoVar.a.equals(this.a) && hoVar.b == this.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.b).hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }
}
