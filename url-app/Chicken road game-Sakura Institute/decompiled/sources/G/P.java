package G;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class P {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f2734a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2735b;

    public P(Integer num, Object obj) {
        this.f2734a = num;
        this.f2735b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P)) {
            return false;
        }
        P p4 = (P) obj;
        return this.f2734a.equals(p4.f2734a) && Intrinsics.a(this.f2735b, p4.f2735b);
    }

    public final int hashCode() {
        int hashCode = this.f2734a.hashCode() * 31;
        Object obj = this.f2735b;
        return (obj instanceof Enum ? ((Enum) obj).ordinal() : obj != null ? obj.hashCode() : 0) + hashCode;
    }

    public final String toString() {
        return "JoinedKey(left=" + this.f2734a + ", right=" + this.f2735b + ')';
    }
}
