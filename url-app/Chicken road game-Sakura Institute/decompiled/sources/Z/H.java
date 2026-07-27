package Z;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class H extends I {

    /* renamed from: a, reason: collision with root package name */
    public final Y.e f4459a;

    /* renamed from: b, reason: collision with root package name */
    public final C0313j f4460b;

    public H(Y.e eVar) {
        C0313j c0313j;
        this.f4459a = eVar;
        if (u3.d.L(eVar)) {
            c0313j = null;
        } else {
            c0313j = K.h();
            J.a(c0313j, eVar);
        }
        this.f4460b = c0313j;
    }

    @Override // Z.I
    public final Y.d a() {
        Y.e eVar = this.f4459a;
        return new Y.d(eVar.f4378a, eVar.f4379b, eVar.f4380c, eVar.f4381d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof H) {
            return Intrinsics.a(this.f4459a, ((H) obj).f4459a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4459a.hashCode();
    }
}
