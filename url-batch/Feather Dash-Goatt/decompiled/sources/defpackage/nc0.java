package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class nc0 implements Comparable {
    public static final mc0 e = new mc0(null);
    public static final nc0 g = new nc0();
    public final int d = 131594;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        nc0 nc0Var = (nc0) obj;
        nc0Var.getClass();
        return this.d - nc0Var.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        nc0 nc0Var = obj instanceof nc0 ? (nc0) obj : null;
        return nc0Var != null && this.d == nc0Var.d;
    }

    public final int hashCode() {
        return this.d;
    }

    public final String toString() {
        return "2.2.10";
    }
}
