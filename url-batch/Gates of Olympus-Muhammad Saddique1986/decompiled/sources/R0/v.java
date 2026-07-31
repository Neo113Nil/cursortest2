package R0;

import m.AbstractC0625j;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4122a = true;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4123b = true;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f4124c = true;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f4122a == vVar.f4122a && this.f4123b == vVar.f4123b && this.f4124c == vVar.f4124c;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + A.k.e((AbstractC0625j.b(1) + A.k.e(Boolean.hashCode(this.f4122a) * 31, 31, this.f4123b)) * 31, 31, this.f4124c);
    }
}
