package o2;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class k implements d {

    /* renamed from: a, reason: collision with root package name */
    public final float f2973a;

    public k(float f5) {
        this.f2973a = f5;
    }

    @Override // o2.d
    public final float a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.f2973a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && this.f2973a == ((k) obj).f2973a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f2973a)});
    }

    public final String toString() {
        return ((int) (this.f2973a * 100.0f)) + "%";
    }
}
