package l2;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class k implements d {

    /* renamed from: a, reason: collision with root package name */
    public final float f2617a;

    public k(float f2) {
        this.f2617a = f2;
    }

    @Override // l2.d
    public final float a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.f2617a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && this.f2617a == ((k) obj).f2617a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f2617a)});
    }

    public final String toString() {
        return ((int) (this.f2617a * 100.0f)) + "%";
    }
}
