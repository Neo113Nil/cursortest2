package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class j81 {
    public final Float a;
    public final bf0 b;

    public j81(Float f, bf0 bf0Var) {
        this.a = f;
        this.b = bf0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j81)) {
            return false;
        }
        j81 j81Var = (j81) obj;
        return j81Var.a.equals(this.a) && Intrinsics.b(j81Var.b, this.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + q40.e(0, this.a.hashCode() * 31, 31);
    }
}
