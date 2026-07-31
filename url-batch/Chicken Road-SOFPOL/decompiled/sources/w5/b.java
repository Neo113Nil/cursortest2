package w5;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public final d f8067a;

    /* renamed from: b, reason: collision with root package name */
    public final float f8068b;

    public b(float f6, d dVar) {
        while (dVar instanceof b) {
            dVar = ((b) dVar).f8067a;
            f6 += ((b) dVar).f8068b;
        }
        this.f8067a = dVar;
        this.f8068b = f6;
    }

    @Override // w5.d
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.f8067a.a(rectF) + this.f8068b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f8067a.equals(bVar.f8067a) && this.f8068b == bVar.f8068b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8067a, Float.valueOf(this.f8068b)});
    }
}
