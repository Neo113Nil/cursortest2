package H0;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    public final c f254a;

    /* renamed from: b, reason: collision with root package name */
    public final float f255b;

    public b(float f2, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f254a;
            f2 += ((b) cVar).f255b;
        }
        this.f254a = cVar;
        this.f255b = f2;
    }

    @Override // H0.c
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.f254a.a(rectF) + this.f255b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f254a.equals(bVar.f254a) && this.f255b == bVar.f255b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f254a, Float.valueOf(this.f255b)});
    }
}
