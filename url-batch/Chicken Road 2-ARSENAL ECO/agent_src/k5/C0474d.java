package k5;

/* renamed from: k5.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0474d implements Comparable {

    /* renamed from: g, reason: collision with root package name */
    public static final C0474d f5193g = new C0474d();

    /* renamed from: f, reason: collision with root package name */
    public final int f5194f = 131604;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C0474d other = (C0474d) obj;
        kotlin.jvm.internal.i.e(other, "other");
        return this.f5194f - other.f5194f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C0474d c0474d = obj instanceof C0474d ? (C0474d) obj : null;
        return c0474d != null && this.f5194f == c0474d.f5194f;
    }

    public final int hashCode() {
        return this.f5194f;
    }

    public final String toString() {
        return "2.2.20";
    }
}
