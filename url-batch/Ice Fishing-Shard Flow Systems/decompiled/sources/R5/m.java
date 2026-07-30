package R5;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class m implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final Throwable f2420d;

    public m(Throwable exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        this.f2420d = exception;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            return Intrinsics.a(this.f2420d, ((m) obj).f2420d);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2420d.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f2420d + ')';
    }
}
