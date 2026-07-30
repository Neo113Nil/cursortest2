package defpackage;

import android.content.res.Resources;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class z01 {
    public final Resources.Theme a;
    public final int b;

    public z01(Resources.Theme theme, int i) {
        this.a = theme;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z01)) {
            return false;
        }
        z01 z01Var = (z01) obj;
        return Intrinsics.b(this.a, z01Var.a) && this.b == z01Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Key(theme=");
        sb.append(this.a);
        sb.append(", id=");
        return q40.o(sb, this.b, ')');
    }
}
