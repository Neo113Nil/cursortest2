package q7;

/* renamed from: q7.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4946o implements Comparable {

    /* renamed from: n, reason: collision with root package name */
    public final int f40176n;

    public /* synthetic */ C4946o(int i) {
        this.f40176n = i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return kotlin.jvm.internal.h.f(this.f40176n ^ Integer.MIN_VALUE, ((C4946o) obj).f40176n ^ Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4946o) {
            return this.f40176n == ((C4946o) obj).f40176n;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f40176n);
    }

    public final String toString() {
        return String.valueOf(this.f40176n & 4294967295L);
    }
}
