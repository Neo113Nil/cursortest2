package H0;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public final float f252a;

    public a(float f2) {
        this.f252a = f2;
    }

    @Override // H0.c
    public final float a(RectF rectF) {
        return this.f252a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f252a == ((a) obj).f252a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f252a)});
    }
}
