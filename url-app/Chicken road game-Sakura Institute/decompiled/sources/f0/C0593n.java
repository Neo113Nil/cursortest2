package f0;

import A.AbstractC0017m;

/* renamed from: f0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0593n extends AbstractC0571B {

    /* renamed from: c, reason: collision with root package name */
    public final float f6424c;

    /* renamed from: d, reason: collision with root package name */
    public final float f6425d;

    public C0593n(float f4, float f5) {
        super(3, false, false);
        this.f6424c = f4;
        this.f6425d = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0593n)) {
            return false;
        }
        C0593n c0593n = (C0593n) obj;
        return Float.compare(this.f6424c, c0593n.f6424c) == 0 && Float.compare(this.f6425d, c0593n.f6425d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6425d) + (Float.hashCode(this.f6424c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MoveTo(x=");
        sb.append(this.f6424c);
        sb.append(", y=");
        return AbstractC0017m.k(sb, this.f6425d, ')');
    }
}
