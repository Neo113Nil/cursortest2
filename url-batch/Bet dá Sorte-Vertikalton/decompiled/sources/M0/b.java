package M0;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    public final c f477a;

    /* renamed from: b, reason: collision with root package name */
    public final float f478b;

    public b(float f2, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f477a;
            f2 += ((b) cVar).f478b;
        }
        this.f477a = cVar;
        this.f478b = f2;
    }

    @Override // M0.c
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.f477a.a(rectF) + this.f478b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f477a.equals(bVar.f477a) && this.f478b == bVar.f478b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f477a, Float.valueOf(this.f478b)});
    }
}
