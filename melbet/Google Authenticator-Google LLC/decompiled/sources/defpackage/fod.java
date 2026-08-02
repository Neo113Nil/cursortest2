package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fod implements fnw {
    private final float a;

    public fod(float f) {
        this.a = f;
    }

    @Override // defpackage.fnw
    public final float a(RectF rectF) {
        return this.a * Math.min(rectF.width(), rectF.height());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fod) && this.a == ((fod) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }

    public final String toString() {
        return ((int) (this.a * 100.0f)) + "%";
    }
}
