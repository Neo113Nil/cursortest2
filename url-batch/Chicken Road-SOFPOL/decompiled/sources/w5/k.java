package w5;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class k implements d {

    /* renamed from: a, reason: collision with root package name */
    public final float f8126a;

    public k(float f6) {
        this.f8126a = f6;
    }

    @Override // w5.d
    public final float a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.f8126a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && this.f8126a == ((k) obj).f8126a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f8126a)});
    }

    public final String toString() {
        return ((int) (this.f8126a * 100.0f)) + "%";
    }
}
