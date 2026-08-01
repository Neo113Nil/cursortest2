package g2;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class c implements d {

    /* renamed from: a, reason: collision with root package name */
    public final float f1835a;

    public c(float f4) {
        this.f1835a = f4;
    }

    @Override // g2.d
    public final float a(RectF rectF) {
        float min = Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f);
        float f4 = this.f1835a;
        if (f4 < 0.0f) {
            return 0.0f;
        }
        return f4 > min ? min : f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f1835a == ((c) obj).f1835a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f1835a)});
    }
}
