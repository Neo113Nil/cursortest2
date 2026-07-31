package t1;

/* renamed from: t1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1021a extends u {
    @Override // t1.u
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C1021a)) {
            return false;
        }
        if (super.equals(obj)) {
            if (f2.j.a(null, null)) {
                return true;
            }
        }
        return false;
    }

    @Override // t1.u
    public final int hashCode() {
        return super.hashCode() * 961;
    }
}
