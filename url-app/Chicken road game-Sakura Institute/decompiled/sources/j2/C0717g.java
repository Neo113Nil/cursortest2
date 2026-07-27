package j2;

/* renamed from: j2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0717g {

    /* renamed from: a, reason: collision with root package name */
    public g2.i f7162a;

    /* renamed from: b, reason: collision with root package name */
    public g2.e f7163b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0717g.class != obj.getClass()) {
            return false;
        }
        C0717g c0717g = (C0717g) obj;
        if (this.f7162a.equals(c0717g.f7162a)) {
            return this.f7163b.equals(c0717g.f7163b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7163b.hashCode() + (this.f7162a.hashCode() * 31);
    }
}
