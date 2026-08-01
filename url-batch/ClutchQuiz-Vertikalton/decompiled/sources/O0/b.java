package O0;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    public final c f509a;

    /* renamed from: b, reason: collision with root package name */
    public final float f510b;

    public b(float f2, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f509a;
            f2 += ((b) cVar).f510b;
        }
        this.f509a = cVar;
        this.f510b = f2;
    }

    @Override // O0.c
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.f509a.a(rectF) + this.f510b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f509a.equals(bVar.f509a) && this.f510b == bVar.f510b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f509a, Float.valueOf(this.f510b)});
    }
}
