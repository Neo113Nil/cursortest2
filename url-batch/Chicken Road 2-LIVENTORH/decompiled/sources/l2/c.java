package l2;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class c implements d {

    /* renamed from: a, reason: collision with root package name */
    public final float f2572a;

    public c(float f2) {
        this.f2572a = f2;
    }

    @Override // l2.d
    public final float a(RectF rectF) {
        float min = Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f);
        float f2 = this.f2572a;
        if (f2 < 0.0f) {
            return 0.0f;
        }
        return f2 > min ? min : f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f2572a == ((c) obj).f2572a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f2572a)});
    }
}
