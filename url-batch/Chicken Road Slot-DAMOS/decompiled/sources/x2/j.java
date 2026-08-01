package x2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f10325a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10326b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10327c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10328d;

    public j(int i3, int i10, int i11, int i12) {
        this.f10325a = i3;
        this.f10326b = i10;
        this.f10327c = i11;
        this.f10328d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f10325a == jVar.f10325a && this.f10326b == jVar.f10326b && this.f10327c == jVar.f10327c && this.f10328d == jVar.f10328d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f10328d) + v4.a.x(this.f10327c, v4.a.x(this.f10326b, Integer.hashCode(this.f10325a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntRect.fromLTRB(");
        sb2.append(this.f10325a);
        sb2.append(", ");
        sb2.append(this.f10326b);
        sb2.append(", ");
        sb2.append(this.f10327c);
        sb2.append(", ");
        return v4.a.m(sb2, this.f10328d, ')');
    }
}
