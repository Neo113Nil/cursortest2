package G;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: G.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0189b0 {

    /* renamed from: a, reason: collision with root package name */
    public final i.y f2790a;

    public final boolean equals(Object obj) {
        if (obj instanceof C0189b0) {
            return Intrinsics.a(this.f2790a, ((C0189b0) obj).f2790a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2790a.hashCode();
    }

    public final String toString() {
        return "MutableScatterMultiMap(map=" + this.f2790a + ')';
    }
}
