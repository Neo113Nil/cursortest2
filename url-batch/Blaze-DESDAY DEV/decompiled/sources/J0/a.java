package J0;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public final float f333a;

    public a(float f2) {
        this.f333a = f2;
    }

    @Override // J0.c
    public final float a(RectF rectF) {
        return this.f333a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f333a == ((a) obj).f333a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f333a)});
    }
}
