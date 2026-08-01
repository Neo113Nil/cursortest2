package s4;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class i extends c6.f {

    /* renamed from: a, reason: collision with root package name */
    public final b f8440a;

    public i(b bVar) {
        bVar.getClass();
        this.f8440a = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && i.class == obj.getClass() && Intrinsics.a(this.f8440a, ((i) obj).f8440a);
    }

    public final int hashCode() {
        return this.f8440a.hashCode() - 31;
    }

    public final String toString() {
        return "InProgress(latestEvent=" + this.f8440a + ", direction=-1)";
    }
}
