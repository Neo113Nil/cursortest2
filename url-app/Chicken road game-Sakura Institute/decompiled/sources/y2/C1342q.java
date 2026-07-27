package y2;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: y2.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1342q implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final Throwable f11674d;

    public C1342q(Throwable exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        this.f11674d = exception;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1342q) {
            if (Intrinsics.a(this.f11674d, ((C1342q) obj).f11674d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f11674d.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f11674d + ')';
    }
}
