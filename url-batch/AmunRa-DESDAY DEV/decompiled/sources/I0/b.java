package I0;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    public final c f250a;

    /* renamed from: b, reason: collision with root package name */
    public final float f251b;

    public b(float f2, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f250a;
            f2 += ((b) cVar).f251b;
        }
        this.f250a = cVar;
        this.f251b = f2;
    }

    @Override // I0.c
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.f250a.a(rectF) + this.f251b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f250a.equals(bVar.f250a) && this.f251b == bVar.f251b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f250a, Float.valueOf(this.f251b)});
    }
}
