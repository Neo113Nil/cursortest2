package R5;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class E implements Comparable {

    /* renamed from: e, reason: collision with root package name */
    public static final D f2404e = new D(null);

    /* renamed from: d, reason: collision with root package name */
    public final short f2405d;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return Intrinsics.d(this.f2405d & 65535, ((E) obj).f2405d & 65535);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof E) {
            return this.f2405d == ((E) obj).f2405d;
        }
        return false;
    }

    public final int hashCode() {
        return Short.hashCode(this.f2405d);
    }

    public final String toString() {
        return String.valueOf(this.f2405d & 65535);
    }
}
