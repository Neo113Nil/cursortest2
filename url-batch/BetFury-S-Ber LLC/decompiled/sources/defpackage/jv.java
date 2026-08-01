package defpackage;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class jv extends hv {
    public static final jv i = new jv(1, 0, 1);

    @Override // defpackage.hv
    public final boolean equals(Object obj) {
        if (!(obj instanceof jv)) {
            return false;
        }
        if (isEmpty() && ((jv) obj).isEmpty()) {
            return true;
        }
        jv jvVar = (jv) obj;
        return this.f == jvVar.f && this.g == jvVar.g;
    }

    @Override // defpackage.hv
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f * 31) + this.g;
    }

    @Override // defpackage.hv
    public final boolean isEmpty() {
        return this.f > this.g;
    }

    @Override // defpackage.hv
    public final String toString() {
        return this.f + ".." + this.g;
    }
}
