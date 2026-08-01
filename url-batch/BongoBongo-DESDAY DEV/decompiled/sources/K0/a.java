package K0;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public final float f377a;

    public a(float f2) {
        this.f377a = f2;
    }

    @Override // K0.c
    public final float a(RectF rectF) {
        return this.f377a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f377a == ((a) obj).f377a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f377a)});
    }
}
