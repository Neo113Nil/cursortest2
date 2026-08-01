package I0;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    public final c f257a;

    /* renamed from: b, reason: collision with root package name */
    public final float f258b;

    public b(float f2, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f257a;
            f2 += ((b) cVar).f258b;
        }
        this.f257a = cVar;
        this.f258b = f2;
    }

    @Override // I0.c
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.f257a.a(rectF) + this.f258b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f257a.equals(bVar.f257a) && this.f258b == bVar.f258b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f257a, Float.valueOf(this.f258b)});
    }
}
