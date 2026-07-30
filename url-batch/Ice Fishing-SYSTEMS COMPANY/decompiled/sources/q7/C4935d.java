package q7;

/* renamed from: q7.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4935d implements Comparable {

    /* renamed from: u, reason: collision with root package name */
    public static final C4935d f40157u = new C4935d();

    /* renamed from: n, reason: collision with root package name */
    public final int f40158n = 131604;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C4935d other = (C4935d) obj;
        kotlin.jvm.internal.h.e(other, "other");
        return this.f40158n - other.f40158n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C4935d c4935d = obj instanceof C4935d ? (C4935d) obj : null;
        return c4935d != null && this.f40158n == c4935d.f40158n;
    }

    public final int hashCode() {
        return this.f40158n;
    }

    public final String toString() {
        return "2.2.20";
    }
}
