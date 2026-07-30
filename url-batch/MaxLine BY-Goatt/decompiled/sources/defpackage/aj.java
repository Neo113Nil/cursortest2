package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class aj extends cj {
    public final xy1 a;

    public aj(xy1 xy1Var) {
        this.a = xy1Var;
    }

    @Override // defpackage.cj
    public final xy1 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aj) && Intrinsics.b(this.a, ((aj) obj).a);
    }

    public final int hashCode() {
        xy1 xy1Var = this.a;
        if (xy1Var == null) {
            return 0;
        }
        return xy1Var.hashCode();
    }

    public final String toString() {
        return "Loading(painter=" + this.a + ')';
    }
}
