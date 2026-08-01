package hd;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class x implements Comparable {

    /* renamed from: e, reason: collision with root package name */
    public static final w f4529e = new w(null);

    /* renamed from: d, reason: collision with root package name */
    public final int f4530d;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Intrinsics.b(this.f4530d ^ Integer.MIN_VALUE, ((x) obj).f4530d ^ Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof x) {
            return this.f4530d == ((x) obj).f4530d;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4530d);
    }

    public final String toString() {
        return String.valueOf(this.f4530d & 4294967295L);
    }
}
