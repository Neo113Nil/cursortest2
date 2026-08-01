package hd;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class t implements Comparable {

    /* renamed from: e, reason: collision with root package name */
    public static final s f4523e = new s(null);

    /* renamed from: d, reason: collision with root package name */
    public final byte f4524d;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return Intrinsics.b(this.f4524d & 255, ((t) obj).f4524d & 255);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t) {
            return this.f4524d == ((t) obj).f4524d;
        }
        return false;
    }

    public final int hashCode() {
        return Byte.hashCode(this.f4524d);
    }

    public final String toString() {
        return String.valueOf(this.f4524d & 255);
    }
}
