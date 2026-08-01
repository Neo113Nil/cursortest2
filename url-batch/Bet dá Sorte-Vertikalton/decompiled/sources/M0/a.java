package M0;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public final float f476a;

    public a(float f2) {
        this.f476a = f2;
    }

    @Override // M0.c
    public final float a(RectF rectF) {
        return this.f476a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f476a == ((a) obj).f476a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f476a)});
    }
}
