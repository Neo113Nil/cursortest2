package R5;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class x implements Comparable {

    /* renamed from: e, reason: collision with root package name */
    public static final w f2438e = new w(null);

    /* renamed from: d, reason: collision with root package name */
    public final int f2439d;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Intrinsics.d(this.f2439d ^ Integer.MIN_VALUE, ((x) obj).f2439d ^ Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof x) {
            return this.f2439d == ((x) obj).f2439d;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f2439d);
    }

    public final String toString() {
        return String.valueOf(this.f2439d & 4294967295L);
    }
}
