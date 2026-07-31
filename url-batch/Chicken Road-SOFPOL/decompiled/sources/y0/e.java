package y0;

import a0.q;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final float f8698a;

    /* renamed from: b, reason: collision with root package name */
    public final float f8699b;

    public e(float f6, float f8) {
        this.f8698a = f6;
        this.f8699b = f8;
    }

    public final long a(long j7, long j8, r2.l lVar) {
        float f6 = (((int) (j8 >> 32)) - ((int) (j7 >> 32))) / 2.0f;
        float f8 = (((int) (j8 & 4294967295L)) - ((int) (j7 & 4294967295L))) / 2.0f;
        r2.l lVar2 = r2.l.f6529d;
        float f9 = this.f8698a;
        if (lVar != lVar2) {
            f9 *= -1;
        }
        float f10 = 1;
        float f11 = (f9 + f10) * f6;
        float f12 = (f10 + this.f8699b) * f8;
        return (Math.round(f12) & 4294967295L) | (Math.round(f11) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Float.compare(this.f8698a, eVar.f8698a) == 0 && Float.compare(this.f8699b, eVar.f8699b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f8699b) + (Float.hashCode(this.f8698a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BiasAlignment(horizontalBias=");
        sb.append(this.f8698a);
        sb.append(", verticalBias=");
        return q.j(sb, this.f8699b, ')');
    }
}
