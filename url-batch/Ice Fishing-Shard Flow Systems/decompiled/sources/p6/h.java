package p6;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h extends i {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f7254a;

    public h(Throwable th) {
        this.f7254a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return Intrinsics.a(this.f7254a, ((h) obj).f7254a);
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.f7254a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // p6.i
    public final String toString() {
        return "Closed(" + this.f7254a + ')';
    }
}
