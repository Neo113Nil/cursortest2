package B0;

import b2.AbstractC0279e;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public String f171a;

    /* renamed from: b, reason: collision with root package name */
    public int f172b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return kotlin.jvm.internal.i.a(this.f171a, pVar.f171a) && this.f172b == pVar.f172b;
    }

    public final int hashCode() {
        return O.j.b(this.f172b) + (this.f171a.hashCode() * 31);
    }

    public final String toString() {
        return "IdAndState(id=" + this.f171a + ", state=" + AbstractC0279e.r(this.f172b) + ')';
    }
}
