package I0;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public final float f309a;

    public a(float f2) {
        this.f309a = f2;
    }

    @Override // I0.c
    public final float a(RectF rectF) {
        return this.f309a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f309a == ((a) obj).f309a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f309a)});
    }
}
