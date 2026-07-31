package r1;

import a0.q;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public long f6498a;

    /* renamed from: b, reason: collision with root package name */
    public float f6499b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f6498a == aVar.f6498a && Float.compare(this.f6499b, aVar.f6499b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6499b) + (Long.hashCode(this.f6498a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataPointAtTime(time=");
        sb.append(this.f6498a);
        sb.append(", dataPoint=");
        return q.j(sb, this.f6499b, ')');
    }
}
