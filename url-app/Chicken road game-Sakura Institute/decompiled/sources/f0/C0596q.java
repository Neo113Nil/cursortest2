package f0;

import A.AbstractC0017m;

/* renamed from: f0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0596q extends AbstractC0571B {

    /* renamed from: c, reason: collision with root package name */
    public final float f6434c;

    /* renamed from: d, reason: collision with root package name */
    public final float f6435d;

    public C0596q(float f4, float f5) {
        super(1, false, true);
        this.f6434c = f4;
        this.f6435d = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0596q)) {
            return false;
        }
        C0596q c0596q = (C0596q) obj;
        return Float.compare(this.f6434c, c0596q.f6434c) == 0 && Float.compare(this.f6435d, c0596q.f6435d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6435d) + (Float.hashCode(this.f6434c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReflectiveQuadTo(x=");
        sb.append(this.f6434c);
        sb.append(", y=");
        return AbstractC0017m.k(sb, this.f6435d, ')');
    }
}
