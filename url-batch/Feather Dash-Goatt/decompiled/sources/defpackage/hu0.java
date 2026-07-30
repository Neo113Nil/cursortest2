package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class hu0 implements wg {
    public final Class a;

    public hu0(Class cls) {
        cls.getClass();
        this.a = cls;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hu0) {
            return Intrinsics.a(this.a, ((hu0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a + " (Kotlin reflection is not available)";
    }
}
