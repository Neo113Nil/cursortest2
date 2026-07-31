package C2;

import g2.AbstractC2429a;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class X implements m2.k {

    /* renamed from: b, reason: collision with root package name */
    private final m2.k f261b;

    public X(m2.k origin) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        this.f261b = origin;
    }

    @Override // m2.k
    public boolean d() {
        return this.f261b.d();
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        m2.k kVar = this.f261b;
        X x4 = obj instanceof X ? (X) obj : null;
        if (!Intrinsics.areEqual(kVar, x4 != null ? x4.f261b : null)) {
            return false;
        }
        m2.d g4 = g();
        if (g4 instanceof m2.c) {
            m2.k kVar2 = obj instanceof m2.k ? (m2.k) obj : null;
            m2.d g5 = kVar2 != null ? kVar2.g() : null;
            if (g5 != null && (g5 instanceof m2.c)) {
                return Intrinsics.areEqual(AbstractC2429a.a((m2.c) g4), AbstractC2429a.a((m2.c) g5));
            }
        }
        return false;
    }

    @Override // m2.k
    public List f() {
        return this.f261b.f();
    }

    @Override // m2.k
    public m2.d g() {
        return this.f261b.g();
    }

    public int hashCode() {
        return this.f261b.hashCode();
    }

    public String toString() {
        return "KTypeWrapper: " + this.f261b;
    }
}
