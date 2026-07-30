package defpackage;

import android.content.res.Resources;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class g70 {
    public final Resources.Theme a;
    public final int b;

    public g70(Resources.Theme theme, int i) {
        this.a = theme;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g70)) {
            return false;
        }
        g70 g70Var = (g70) obj;
        return Intrinsics.a(this.a, g70Var.a) && this.b == g70Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Key(theme=");
        sb.append(this.a);
        sb.append(", id=");
        return qy0.m(sb, this.b, ')');
    }
}
