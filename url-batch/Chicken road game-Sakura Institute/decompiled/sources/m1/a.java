package m1;

import a0.m;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public long f6295a;

    /* renamed from: b, reason: collision with root package name */
    public float f6296b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f6295a == aVar.f6295a && Float.compare(this.f6296b, aVar.f6296b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6296b) + (Long.hashCode(this.f6295a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataPointAtTime(time=");
        sb.append(this.f6295a);
        sb.append(", dataPoint=");
        return m.k(sb, this.f6296b, ')');
    }
}
