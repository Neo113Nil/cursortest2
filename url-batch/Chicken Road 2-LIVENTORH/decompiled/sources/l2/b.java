package l2;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public final d f2563a;

    /* renamed from: b, reason: collision with root package name */
    public final float f2564b;

    public b(float f2, d dVar) {
        while (dVar instanceof b) {
            dVar = ((b) dVar).f2563a;
            f2 += ((b) dVar).f2564b;
        }
        this.f2563a = dVar;
        this.f2564b = f2;
    }

    @Override // l2.d
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.f2563a.a(rectF) + this.f2564b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f2563a.equals(bVar.f2563a) && this.f2564b == bVar.f2564b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2563a, Float.valueOf(this.f2564b)});
    }
}
