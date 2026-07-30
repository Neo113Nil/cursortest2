package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class vx1 implements fu {
    public final Class m;

    public vx1(Class cls) {
        cls.getClass();
        this.m = cls;
    }

    @Override // defpackage.fu
    public final Class a() {
        return this.m;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vx1) {
            return Intrinsics.b(this.m, ((vx1) obj).m);
        }
        return false;
    }

    public final int hashCode() {
        return this.m.hashCode();
    }

    public final String toString() {
        return this.m + " (Kotlin reflection is not available)";
    }
}
