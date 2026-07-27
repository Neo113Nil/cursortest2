package m0;

import A.AbstractC0017m;

/* renamed from: m0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0853a {

    /* renamed from: a, reason: collision with root package name */
    public long f8235a;

    /* renamed from: b, reason: collision with root package name */
    public float f8236b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0853a)) {
            return false;
        }
        C0853a c0853a = (C0853a) obj;
        return this.f8235a == c0853a.f8235a && Float.compare(this.f8236b, c0853a.f8236b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f8236b) + (Long.hashCode(this.f8235a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataPointAtTime(time=");
        sb.append(this.f8235a);
        sb.append(", dataPoint=");
        return AbstractC0017m.k(sb, this.f8236b, ')');
    }
}
