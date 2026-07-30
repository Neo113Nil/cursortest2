package P0;

import G0.A;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public String f2218a;

    /* renamed from: b, reason: collision with root package name */
    public A f2219b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Intrinsics.a(this.f2218a, oVar.f2218a) && this.f2219b == oVar.f2219b;
    }

    public final int hashCode() {
        return this.f2219b.hashCode() + (this.f2218a.hashCode() * 31);
    }

    public final String toString() {
        return "IdAndState(id=" + this.f2218a + ", state=" + this.f2219b + ')';
    }
}
