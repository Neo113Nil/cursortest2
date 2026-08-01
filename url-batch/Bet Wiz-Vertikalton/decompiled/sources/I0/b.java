package I0;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    public final c f310a;

    /* renamed from: b, reason: collision with root package name */
    public final float f311b;

    public b(float f2, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f310a;
            f2 += ((b) cVar).f311b;
        }
        this.f310a = cVar;
        this.f311b = f2;
    }

    @Override // I0.c
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.f310a.a(rectF) + this.f311b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f310a.equals(bVar.f310a) && this.f311b == bVar.f311b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f310a, Float.valueOf(this.f311b)});
    }
}
