package I0;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class h implements c {

    /* renamed from: a, reason: collision with root package name */
    public final float f287a;

    public h(float f2) {
        this.f287a = f2;
    }

    @Override // I0.c
    public final float a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.f287a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && this.f287a == ((h) obj).f287a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f287a)});
    }
}
