package N0;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    public final c f882a;

    /* renamed from: b, reason: collision with root package name */
    public final float f883b;

    public b(float f2, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f882a;
            f2 += ((b) cVar).f883b;
        }
        this.f882a = cVar;
        this.f883b = f2;
    }

    @Override // N0.c
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.f882a.a(rectF) + this.f883b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f882a.equals(bVar.f882a) && this.f883b == bVar.f883b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f882a, Float.valueOf(this.f883b)});
    }
}
