package I0;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public final float f256a;

    public a(float f2) {
        this.f256a = f2;
    }

    @Override // I0.c
    public final float a(RectF rectF) {
        return this.f256a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f256a == ((a) obj).f256a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f256a)});
    }
}
