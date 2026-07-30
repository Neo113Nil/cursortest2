package defpackage;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class j31 implements Serializable {
    public final Throwable d;

    public j31(Throwable th) {
        th.getClass();
        this.d = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j31) {
            return Intrinsics.a(this.d, ((j31) obj).d);
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.d + ')';
    }
}
