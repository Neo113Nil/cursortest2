package R5;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class t implements Comparable {

    /* renamed from: e, reason: collision with root package name */
    public static final s f2432e = new s(null);

    /* renamed from: d, reason: collision with root package name */
    public final byte f2433d;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return Intrinsics.d(this.f2433d & 255, ((t) obj).f2433d & 255);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t) {
            return this.f2433d == ((t) obj).f2433d;
        }
        return false;
    }

    public final int hashCode() {
        return Byte.hashCode(this.f2433d);
    }

    public final String toString() {
        return String.valueOf(this.f2433d & 255);
    }
}
