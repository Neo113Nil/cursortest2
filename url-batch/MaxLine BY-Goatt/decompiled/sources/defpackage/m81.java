package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class m81 implements Comparable<m81> {
    public static final a n = new a(null);
    public static final m81 o = new m81();
    public final int m = 131594;

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(m81 m81Var) {
        m81 m81Var2 = m81Var;
        m81Var2.getClass();
        return this.m - m81Var2.m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        m81 m81Var = obj instanceof m81 ? (m81) obj : null;
        return m81Var != null && this.m == m81Var.m;
    }

    public final int hashCode() {
        return this.m;
    }

    public final String toString() {
        return "2.2.10";
    }
}
