package ee;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3989a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3990b;

    public p(Object obj, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this.f3989a = obj;
        this.f3990b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (Intrinsics.a(this.f3989a, pVar.f3989a)) {
                long j = pVar.f3990b;
                a aVar = b.f3956e;
                return this.f3990b == j;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f3989a;
        int hashCode = obj == null ? 0 : obj.hashCode();
        a aVar = b.f3956e;
        return Long.hashCode(this.f3990b) + (hashCode * 31);
    }

    public final String toString() {
        return "TimedValue(value=" + this.f3989a + ", duration=" + ((Object) b.g(this.f3990b)) + ')';
    }
}
