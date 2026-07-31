package a0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f107a;

    /* renamed from: b, reason: collision with root package name */
    public final int f108b;

    public k(int i, int i8) {
        this.f107a = i;
        this.f108b = i8;
        if (!(i >= 0)) {
            w.a.a("negative start index");
        }
        if (i8 >= i) {
            return;
        }
        w.a.a("end index greater than start");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f107a == kVar.f107a && this.f108b == kVar.f108b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f108b) + (Integer.hashCode(this.f107a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Interval(start=");
        sb.append(this.f107a);
        sb.append(", end=");
        return q.k(sb, this.f108b, ')');
    }
}
