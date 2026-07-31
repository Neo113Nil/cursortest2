package y0;

import a0.q;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final float f8696a;

    public c(float f6) {
        this.f8696a = f6;
    }

    public final int a(int i, int i8, r2.l lVar) {
        float f6 = (i8 - i) / 2.0f;
        r2.l lVar2 = r2.l.f6529d;
        float f8 = this.f8696a;
        if (lVar != lVar2) {
            f8 *= -1;
        }
        return Math.round((1 + f8) * f6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Float.compare(this.f8696a, ((c) obj).f8696a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f8696a);
    }

    public final String toString() {
        return q.j(new StringBuilder("Horizontal(bias="), this.f8696a, ')');
    }
}
