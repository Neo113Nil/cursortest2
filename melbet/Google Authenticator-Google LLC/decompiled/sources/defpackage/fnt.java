package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fnt implements fnw {
    private final float a;

    public fnt(float f) {
        this.a = f;
    }

    @Override // defpackage.fnw
    public final float a(RectF rectF) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fnt) && this.a == ((fnt) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }

    public final String toString() {
        return this.a + "px";
    }
}
