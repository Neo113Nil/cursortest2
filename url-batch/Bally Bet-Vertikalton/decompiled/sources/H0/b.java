package H0;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    public final c f238a;

    /* renamed from: b, reason: collision with root package name */
    public final float f239b;

    public b(float f2, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f238a;
            f2 += ((b) cVar).f239b;
        }
        this.f238a = cVar;
        this.f239b = f2;
    }

    @Override // H0.c
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.f238a.a(rectF) + this.f239b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f238a.equals(bVar.f238a) && this.f239b == bVar.f239b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f238a, Float.valueOf(this.f239b)});
    }
}
