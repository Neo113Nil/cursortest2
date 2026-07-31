package U;

import H2.AbstractC0080b;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final float f3294a;

    public c(float f3) {
        this.f3294a = f3;
    }

    public final int a(int i3, int i4) {
        return Math.round((1 + this.f3294a) * ((i4 - i3) / 2.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Float.compare(this.f3294a, ((c) obj).f3294a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f3294a);
    }

    public final String toString() {
        return AbstractC0080b.j(new StringBuilder("Vertical(bias="), this.f3294a, ')');
    }
}
