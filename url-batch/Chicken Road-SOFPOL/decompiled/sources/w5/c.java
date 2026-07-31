package w5;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class c implements d {

    /* renamed from: a, reason: collision with root package name */
    public final float f8077a;

    public c(float f6) {
        this.f8077a = f6;
    }

    @Override // w5.d
    public final float a(RectF rectF) {
        float min = Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f);
        float f6 = this.f8077a;
        if (f6 < 0.0f) {
            return 0.0f;
        }
        return f6 > min ? min : f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f8077a == ((c) obj).f8077a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f8077a)});
    }
}
