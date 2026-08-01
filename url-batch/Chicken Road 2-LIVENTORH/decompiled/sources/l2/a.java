package l2;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final float f2555a;

    public a(float f2) {
        this.f2555a = f2;
    }

    @Override // l2.d
    public final float a(RectF rectF) {
        return this.f2555a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f2555a == ((a) obj).f2555a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f2555a)});
    }

    public final String toString() {
        return this.f2555a + "px";
    }
}
