package o2;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class c implements d {

    /* renamed from: a, reason: collision with root package name */
    public final float f2926a;

    public c(float f5) {
        this.f2926a = f5;
    }

    @Override // o2.d
    public final float a(RectF rectF) {
        float min = Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f);
        float f5 = this.f2926a;
        if (f5 < 0.0f) {
            return 0.0f;
        }
        return f5 > min ? min : f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f2926a == ((c) obj).f2926a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f2926a)});
    }
}
