package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class z1 implements td {
    public final td a;
    public final float b;

    public z1(float f, td tdVar) {
        while (tdVar instanceof z1) {
            tdVar = ((z1) tdVar).a;
            f += ((z1) tdVar).b;
        }
        this.a = tdVar;
        this.b = f;
    }

    @Override // defpackage.td
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.a.a(rectF) + this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z1)) {
            return false;
        }
        z1 z1Var = (z1) obj;
        return this.a.equals(z1Var.a) && this.b == z1Var.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }
}
