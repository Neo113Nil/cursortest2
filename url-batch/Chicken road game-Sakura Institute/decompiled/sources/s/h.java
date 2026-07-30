package s;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f8010a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8011b;

    public h(int i7, int i8) {
        this.f8010a = i7;
        this.f8011b = i8;
        if (i7 < 0) {
            throw new IllegalArgumentException("negative start index");
        }
        if (i8 < i7) {
            throw new IllegalArgumentException("end index greater than start");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f8010a == hVar.f8010a && this.f8011b == hVar.f8011b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f8011b) + (Integer.hashCode(this.f8010a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Interval(start=");
        sb.append(this.f8010a);
        sb.append(", end=");
        return a0.m.l(sb, this.f8011b, ')');
    }
}
