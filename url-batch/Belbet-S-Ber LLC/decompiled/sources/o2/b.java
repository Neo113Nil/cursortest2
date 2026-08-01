package o2;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public final d f2918a;

    /* renamed from: b, reason: collision with root package name */
    public final float f2919b;

    public b(float f5, d dVar) {
        while (dVar instanceof b) {
            dVar = ((b) dVar).f2918a;
            f5 += ((b) dVar).f2919b;
        }
        this.f2918a = dVar;
        this.f2919b = f5;
    }

    @Override // o2.d
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.f2918a.a(rectF) + this.f2919b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f2918a.equals(bVar.f2918a) && this.f2919b == bVar.f2919b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2918a, Float.valueOf(this.f2919b)});
    }
}
