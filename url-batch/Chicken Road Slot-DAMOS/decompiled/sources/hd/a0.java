package hd;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a0 implements Comparable {

    /* renamed from: e, reason: collision with root package name */
    public static final z f4495e = new z(null);

    /* renamed from: d, reason: collision with root package name */
    public final long f4496d;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Intrinsics.c(this.f4496d ^ Long.MIN_VALUE, ((a0) obj).f4496d ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a0) {
            return this.f4496d == ((a0) obj).f4496d;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f4496d);
    }

    public final String toString() {
        return g8.b.P(10, this.f4496d);
    }
}
