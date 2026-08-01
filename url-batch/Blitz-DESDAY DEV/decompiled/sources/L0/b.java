package L0;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    public final c f415a;

    /* renamed from: b, reason: collision with root package name */
    public final float f416b;

    public b(float f2, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f415a;
            f2 += ((b) cVar).f416b;
        }
        this.f415a = cVar;
        this.f416b = f2;
    }

    @Override // L0.c
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.f415a.a(rectF) + this.f416b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f415a.equals(bVar.f415a) && this.f416b == bVar.f416b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f415a, Float.valueOf(this.f416b)});
    }
}
