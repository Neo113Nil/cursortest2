package Z;

import A.AbstractC0017m;
import y2.y;

/* loaded from: classes.dex */
public final class O {

    /* renamed from: d, reason: collision with root package name */
    public static final O f4488d = new O();

    /* renamed from: a, reason: collision with root package name */
    public final long f4489a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4490b;

    /* renamed from: c, reason: collision with root package name */
    public final float f4491c;

    public O(long j4, long j5, float f4) {
        this.f4489a = j4;
        this.f4490b = j5;
        this.f4491c = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O)) {
            return false;
        }
        O o4 = (O) obj;
        return C0323u.c(this.f4489a, o4.f4489a) && Y.c.b(this.f4490b, o4.f4490b) && this.f4491c == o4.f4491c;
    }

    public final int hashCode() {
        int i2 = C0323u.f4548h;
        y.a aVar = y2.y.f11688e;
        return Float.hashCode(this.f4491c) + AbstractC0017m.c(Long.hashCode(this.f4489a) * 31, 31, this.f4490b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Shadow(color=");
        AbstractC0017m.s(this.f4489a, sb, ", offset=");
        sb.append((Object) Y.c.j(this.f4490b));
        sb.append(", blurRadius=");
        return AbstractC0017m.k(sb, this.f4491c, ')');
    }

    public /* synthetic */ O() {
        this(K.d(4278190080L), 0L, 0.0f);
    }
}
