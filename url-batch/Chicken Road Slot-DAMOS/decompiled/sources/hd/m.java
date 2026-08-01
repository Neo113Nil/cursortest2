package hd;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class m implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final Throwable f4510d;

    public m(Throwable th) {
        th.getClass();
        this.f4510d = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            return Intrinsics.a(this.f4510d, ((m) obj).f4510d);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4510d.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f4510d + ')';
    }
}
