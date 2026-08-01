package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class o2 implements ng {
    public final ng a;
    public final float b;

    public o2(float f, ng ngVar) {
        while (ngVar instanceof o2) {
            ngVar = ((o2) ngVar).a;
            f += ((o2) ngVar).b;
        }
        this.a = ngVar;
        this.b = f;
    }

    @Override // defpackage.ng
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.a.a(rectF) + this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o2)) {
            return false;
        }
        o2 o2Var = (o2) obj;
        return this.a.equals(o2Var.a) && this.b == o2Var.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }
}
