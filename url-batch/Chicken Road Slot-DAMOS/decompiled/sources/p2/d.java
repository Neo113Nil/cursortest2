package p2;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Object f7623a;

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return Intrinsics.a(this.f7623a, ((d) obj).f7623a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f7623a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "AsyncTypefaceResult(result=" + this.f7623a + ')';
    }
}
