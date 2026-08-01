package c6;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public String f1837a;

    /* renamed from: b, reason: collision with root package name */
    public int f1838b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Intrinsics.a(this.f1837a, oVar.f1837a) && this.f1838b == oVar.f1838b;
    }

    public final int hashCode() {
        return a4.i.b(this.f1838b) + (this.f1837a.hashCode() * 31);
    }

    public final String toString() {
        return "IdAndState(id=" + this.f1837a + ", state=" + n0.l.n(this.f1838b) + ')';
    }
}
