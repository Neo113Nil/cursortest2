package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class ui implements zg1 {
    public final long d;

    public ui(long j) {
        this.d = j;
        if (j != 16) {
            return;
        }
        p80.a("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    @Override // defpackage.zg1
    public final long c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ui) && hi.c(this.d, ((ui) obj).d);
    }

    public final int hashCode() {
        int i = hi.h;
        jk1 jk1Var = kk1.d;
        return Long.hashCode(this.d);
    }

    @Override // defpackage.zg1
    public final op j() {
        return null;
    }

    @Override // defpackage.zg1
    public final float k() {
        return hi.d(this.d);
    }

    public final String toString() {
        return "ColorStyle(value=" + ((Object) hi.i(this.d)) + ')';
    }
}
