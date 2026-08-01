package n0;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f6774a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f6775b;

    public p0(Integer num, Object obj) {
        this.f6774a = num;
        this.f6775b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return this.f6774a.equals(p0Var.f6774a) && Intrinsics.a(this.f6775b, p0Var.f6775b);
    }

    public final int hashCode() {
        int hashCode = this.f6774a.hashCode() * 31;
        Object obj = this.f6775b;
        return (obj instanceof Enum ? ((Enum) obj).ordinal() : obj != null ? obj.hashCode() : 0) + hashCode;
    }

    public final String toString() {
        return "JoinedKey(left=" + this.f6774a + ", right=" + this.f6775b + ')';
    }
}
