package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class eq implements pv2 {
    public final bk2 a;
    public final float b;

    public eq(bk2 bk2Var, float f) {
        this.a = bk2Var;
        this.b = f;
    }

    @Override // defpackage.pv2
    public final float a() {
        return this.b;
    }

    @Override // defpackage.pv2
    public final long b() {
        int i = aw.h;
        return aw.g;
    }

    @Override // defpackage.pv2
    public final cq c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eq)) {
            return false;
        }
        eq eqVar = (eq) obj;
        return Intrinsics.b(this.a, eqVar.a) && Float.compare(this.b, eqVar.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BrushStyle(value=");
        sb.append(this.a);
        sb.append(", alpha=");
        return q40.n(sb, this.b, ')');
    }
}
