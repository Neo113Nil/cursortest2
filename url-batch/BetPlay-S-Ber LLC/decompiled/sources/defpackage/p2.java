package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class p2 implements xd {
    public final xd a;
    public final float b;

    public p2(float f, xd xdVar) {
        while (xdVar instanceof p2) {
            xdVar = ((p2) xdVar).a;
            f += ((p2) xdVar).b;
        }
        this.a = xdVar;
        this.b = f;
    }

    @Override // defpackage.xd
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.a.a(rectF) + this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p2)) {
            return false;
        }
        p2 p2Var = (p2) obj;
        return this.a.equals(p2Var.a) && this.b == p2Var.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }
}
