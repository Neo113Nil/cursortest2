package hd;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e0 implements Comparable {

    /* renamed from: e, reason: collision with root package name */
    public static final d0 f4499e = new d0(null);

    /* renamed from: d, reason: collision with root package name */
    public final short f4500d;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return Intrinsics.b(this.f4500d & 65535, ((e0) obj).f4500d & 65535);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e0) {
            return this.f4500d == ((e0) obj).f4500d;
        }
        return false;
    }

    public final int hashCode() {
        return Short.hashCode(this.f4500d);
    }

    public final String toString() {
        return String.valueOf(this.f4500d & 65535);
    }
}
