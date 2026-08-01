package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class eb implements ve {
    public final float a;

    public eb(float f) {
        this.a = f;
    }

    @Override // defpackage.ve
    public final float a(RectF rectF) {
        float min = Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f);
        float f = this.a;
        if (f < 0.0f) {
            return 0.0f;
        }
        return f > min ? min : f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eb) && this.a == ((eb) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }
}
