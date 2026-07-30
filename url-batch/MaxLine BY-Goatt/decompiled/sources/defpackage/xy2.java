package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class xy2 {
    public final yd a;
    public final cu1 b;

    public xy2(yd ydVar, cu1 cu1Var) {
        this.a = ydVar;
        this.b = cu1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xy2)) {
            return false;
        }
        xy2 xy2Var = (xy2) obj;
        return Intrinsics.b(this.a, xy2Var.a) && this.b.equals(xy2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TransformedText(text=" + ((Object) this.a) + ", offsetMapping=" + this.b + ')';
    }
}
