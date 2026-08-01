package H0;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public final float f253a;

    public a(float f2) {
        this.f253a = f2;
    }

    @Override // H0.c
    public final float a(RectF rectF) {
        return this.f253a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f253a == ((a) obj).f253a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f253a)});
    }
}
