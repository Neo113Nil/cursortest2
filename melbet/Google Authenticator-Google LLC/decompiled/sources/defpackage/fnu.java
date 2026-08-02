package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fnu implements fnw {
    private final fnw a;
    private final float b;

    public fnu(float f, fnw fnwVar) {
        while (fnwVar instanceof fnu) {
            fnwVar = ((fnu) fnwVar).a;
            f += ((fnu) fnwVar).b;
        }
        this.a = fnwVar;
        this.b = f;
    }

    @Override // defpackage.fnw
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.a.a(rectF) + this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fnu)) {
            return false;
        }
        fnu fnuVar = (fnu) obj;
        return this.a.equals(fnuVar.a) && this.b == fnuVar.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }
}
