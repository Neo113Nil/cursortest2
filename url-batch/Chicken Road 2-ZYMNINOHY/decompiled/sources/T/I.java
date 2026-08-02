package T;

import a.AbstractC0124a;
import java.util.Locale;

/* loaded from: classes.dex */
public final class I {

    /* renamed from: d, reason: collision with root package name */
    public static final I f2663d = new I(1.0f);

    /* renamed from: a, reason: collision with root package name */
    public final float f2664a;

    /* renamed from: b, reason: collision with root package name */
    public final float f2665b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2666c;

    static {
        W.J.G(0);
        W.J.G(1);
    }

    public I(float f4) {
        this(f4, 1.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && I.class == obj.getClass()) {
            I i4 = (I) obj;
            if (this.f2664a == i4.f2664a && this.f2665b == i4.f2665b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f2665b) + ((Float.floatToRawIntBits(this.f2664a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f2664a), Float.valueOf(this.f2665b)};
        String str = W.J.f3263a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }

    public I(float f4, float f5) {
        AbstractC0124a.h(f4 > 0.0f);
        AbstractC0124a.h(f5 > 0.0f);
        this.f2664a = f4;
        this.f2665b = f5;
        this.f2666c = Math.round(f4 * 1000.0f);
    }
}
