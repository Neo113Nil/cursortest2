package y0;

import a0.q;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final float f8697a;

    public d(float f6) {
        this.f8697a = f6;
    }

    public final int a(int i, int i8) {
        return Math.round((1 + this.f8697a) * ((i8 - i) / 2.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Float.compare(this.f8697a, ((d) obj).f8697a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f8697a);
    }

    public final String toString() {
        return q.j(new StringBuilder("Vertical(bias="), this.f8697a, ')');
    }
}
