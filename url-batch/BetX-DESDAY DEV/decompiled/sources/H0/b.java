package H0;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    public final c f253a;

    /* renamed from: b, reason: collision with root package name */
    public final float f254b;

    public b(float f2, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f253a;
            f2 += ((b) cVar).f254b;
        }
        this.f253a = cVar;
        this.f254b = f2;
    }

    @Override // H0.c
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.f253a.a(rectF) + this.f254b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f253a.equals(bVar.f253a) && this.f254b == bVar.f254b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f253a, Float.valueOf(this.f254b)});
    }
}
