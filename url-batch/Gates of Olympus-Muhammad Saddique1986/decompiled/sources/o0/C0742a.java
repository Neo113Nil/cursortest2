package o0;

import A.k;

/* renamed from: o0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0742a {

    /* renamed from: a, reason: collision with root package name */
    public long f7424a;

    /* renamed from: b, reason: collision with root package name */
    public float f7425b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0742a)) {
            return false;
        }
        C0742a c0742a = (C0742a) obj;
        return this.f7424a == c0742a.f7424a && Float.compare(this.f7425b, c0742a.f7425b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f7425b) + (Long.hashCode(this.f7424a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataPointAtTime(time=");
        sb.append(this.f7424a);
        sb.append(", dataPoint=");
        return k.i(sb, this.f7425b, ')');
    }
}
