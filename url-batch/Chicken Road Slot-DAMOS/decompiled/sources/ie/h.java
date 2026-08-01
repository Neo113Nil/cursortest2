package ie;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class h extends i {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f4750a;

    public h(Throwable th) {
        this.f4750a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return Intrinsics.a(this.f4750a, ((h) obj).f4750a);
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.f4750a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // ie.i
    public final String toString() {
        return "Closed(" + this.f4750a + ')';
    }
}
