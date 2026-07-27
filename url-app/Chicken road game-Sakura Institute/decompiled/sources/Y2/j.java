package Y2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j extends k {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f4442a;

    public j(Throwable th) {
        this.f4442a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            if (Intrinsics.a(this.f4442a, ((j) obj).f4442a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.f4442a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // Y2.k
    public final String toString() {
        return "Closed(" + this.f4442a + ')';
    }
}
