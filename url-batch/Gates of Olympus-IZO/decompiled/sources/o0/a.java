package o0;

import H2.AbstractC0080b;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public long f6678a;

    /* renamed from: b, reason: collision with root package name */
    public float f6679b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f6678a == aVar.f6678a && Float.compare(this.f6679b, aVar.f6679b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6679b) + (Long.hashCode(this.f6678a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataPointAtTime(time=");
        sb.append(this.f6678a);
        sb.append(", dataPoint=");
        return AbstractC0080b.j(sb, this.f6679b, ')');
    }
}
