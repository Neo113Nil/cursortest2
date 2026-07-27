package f0;

import A.AbstractC0017m;

/* renamed from: f0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0592m extends AbstractC0571B {

    /* renamed from: c, reason: collision with root package name */
    public final float f6422c;

    /* renamed from: d, reason: collision with root package name */
    public final float f6423d;

    public C0592m(float f4, float f5) {
        super(3, false, false);
        this.f6422c = f4;
        this.f6423d = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0592m)) {
            return false;
        }
        C0592m c0592m = (C0592m) obj;
        return Float.compare(this.f6422c, c0592m.f6422c) == 0 && Float.compare(this.f6423d, c0592m.f6423d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6423d) + (Float.hashCode(this.f6422c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LineTo(x=");
        sb.append(this.f6422c);
        sb.append(", y=");
        return AbstractC0017m.k(sb, this.f6423d, ')');
    }
}
