package b0;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final x2.c f917a;

    /* renamed from: b, reason: collision with root package name */
    public final long f918b;

    public w(a2.a1 a1Var, long j) {
        this.f917a = a1Var;
        this.f918b = j;
    }

    public final float a() {
        long j = this.f918b;
        if (!x2.a.c(j)) {
            return Float.POSITIVE_INFINITY;
        }
        return this.f917a.S(x2.a.g(j));
    }

    public final float b() {
        long j = this.f918b;
        if (!x2.a.d(j)) {
            return Float.POSITIVE_INFINITY;
        }
        return this.f917a.S(x2.a.h(j));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return Intrinsics.a(this.f917a, wVar.f917a) && x2.a.b(this.f918b, wVar.f918b);
    }

    public final int hashCode() {
        return Long.hashCode(this.f918b) + (this.f917a.hashCode() * 31);
    }

    public final String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.f917a + ", constraints=" + ((Object) x2.a.k(this.f918b)) + ')';
    }
}
