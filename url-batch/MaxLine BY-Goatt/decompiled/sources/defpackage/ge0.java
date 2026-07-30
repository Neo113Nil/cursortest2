package defpackage;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ge0 extends nk0 {
    public final Drawable a;
    public final boolean b;
    public final m60 c;

    public ge0(Drawable drawable, boolean z, m60 m60Var) {
        this.a = drawable;
        this.b = z;
        this.c = m60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ge0)) {
            return false;
        }
        ge0 ge0Var = (ge0) obj;
        return Intrinsics.b(this.a, ge0Var.a) && this.b == ge0Var.b && this.c == ge0Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + in1.i(this.a.hashCode() * 31, 31, this.b);
    }
}
