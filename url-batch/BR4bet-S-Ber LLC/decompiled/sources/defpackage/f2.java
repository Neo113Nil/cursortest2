package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class f2 implements ve {
    public final ve a;
    public final float b;

    public f2(float f, ve veVar) {
        while (veVar instanceof f2) {
            veVar = ((f2) veVar).a;
            f += ((f2) veVar).b;
        }
        this.a = veVar;
        this.b = f;
    }

    @Override // defpackage.ve
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.a.a(rectF) + this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f2)) {
            return false;
        }
        f2 f2Var = (f2) obj;
        return this.a.equals(f2Var.a) && this.b == f2Var.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }
}
