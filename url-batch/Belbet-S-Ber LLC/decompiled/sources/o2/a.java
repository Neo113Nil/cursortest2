package o2;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final float f2914a;

    public a(float f5) {
        this.f2914a = f5;
    }

    @Override // o2.d
    public final float a(RectF rectF) {
        return this.f2914a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f2914a == ((a) obj).f2914a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f2914a)});
    }

    public final String toString() {
        return this.f2914a + "px";
    }
}
