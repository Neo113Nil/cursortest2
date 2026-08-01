package n0;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class o2 implements p2 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f6772a;

    public o2(Object obj) {
        this.f6772a = obj;
    }

    @Override // n0.p2
    public final Object a(x0.h hVar) {
        return this.f6772a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o2) && Intrinsics.a(this.f6772a, ((o2) obj).f6772a);
    }

    public final int hashCode() {
        Object obj = this.f6772a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "StaticValueHolder(value=" + this.f6772a + ')';
    }
}
