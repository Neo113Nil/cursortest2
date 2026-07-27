package Z;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class G extends I {

    /* renamed from: a, reason: collision with root package name */
    public final Y.d f4458a;

    public G(Y.d dVar) {
        this.f4458a = dVar;
    }

    @Override // Z.I
    public final Y.d a() {
        return this.f4458a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof G) {
            return Intrinsics.a(this.f4458a, ((G) obj).f4458a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4458a.hashCode();
    }
}
