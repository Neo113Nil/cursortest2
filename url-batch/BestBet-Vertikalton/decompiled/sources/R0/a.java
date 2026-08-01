package R0;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public final float f898a;

    public a(float f2) {
        this.f898a = f2;
    }

    @Override // R0.c
    public final float a(RectF rectF) {
        return this.f898a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f898a == ((a) obj).f898a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f898a)});
    }
}
