package g2;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class k implements d {

    /* renamed from: a, reason: collision with root package name */
    public final float f1876a;

    public k(float f4) {
        this.f1876a = f4;
    }

    @Override // g2.d
    public final float a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.f1876a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && this.f1876a == ((k) obj).f1876a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f1876a)});
    }

    public final String toString() {
        return ((int) (this.f1876a * 100.0f)) + "%";
    }
}
