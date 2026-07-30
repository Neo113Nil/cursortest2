package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class ic0 {
    public final Float a;
    public pu b;

    public ic0(Float f, pu puVar) {
        this.a = f;
        this.b = puVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ic0)) {
            return false;
        }
        ic0 ic0Var = (ic0) obj;
        return ic0Var.a.equals(this.a) && Intrinsics.a(ic0Var.b, this.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + qy0.c(0, this.a.hashCode() * 31, 31);
    }
}
