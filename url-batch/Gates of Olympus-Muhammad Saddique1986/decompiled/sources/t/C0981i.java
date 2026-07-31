package t;

/* renamed from: t.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0981i {

    /* renamed from: a, reason: collision with root package name */
    public final int f8481a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8482b;

    public C0981i(int i3, int i4) {
        this.f8481a = i3;
        this.f8482b = i4;
        if (i3 < 0) {
            throw new IllegalArgumentException("negative start index");
        }
        if (i4 < i3) {
            throw new IllegalArgumentException("end index greater than start");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0981i)) {
            return false;
        }
        C0981i c0981i = (C0981i) obj;
        return this.f8481a == c0981i.f8481a && this.f8482b == c0981i.f8482b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f8482b) + (Integer.hashCode(this.f8481a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Interval(start=");
        sb.append(this.f8481a);
        sb.append(", end=");
        return A.k.j(sb, this.f8482b, ')');
    }
}
