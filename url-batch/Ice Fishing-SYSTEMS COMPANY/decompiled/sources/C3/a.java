package C3;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public final float f378a;

    public a(float f6) {
        this.f378a = f6;
    }

    @Override // C3.c
    public final float a(RectF rectF) {
        return this.f378a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f378a == ((a) obj).f378a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f378a)});
    }
}
