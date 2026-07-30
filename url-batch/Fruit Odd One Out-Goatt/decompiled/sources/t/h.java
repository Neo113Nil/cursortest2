package t;

import java.math.BigInteger;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class h implements Comparable {

    /* renamed from: g, reason: collision with root package name */
    public static final h f1165g;

    /* renamed from: b, reason: collision with root package name */
    public final int f1166b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1167c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1168d;

    /* renamed from: e, reason: collision with root package name */
    public final String f1169e;

    /* renamed from: f, reason: collision with root package name */
    public final t0.e f1170f = new t0.e(new s.a(1, this));

    static {
        new h(0, 0, 0, "");
        f1165g = new h(0, 1, 0, "");
        new h(1, 0, 0, "");
    }

    public h(int i2, int i3, int i4, String str) {
        this.f1166b = i2;
        this.f1167c = i3;
        this.f1168d = i4;
        this.f1169e = str;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        h hVar = (h) obj;
        hVar.getClass();
        Object a2 = this.f1170f.a();
        a2.getClass();
        Object a3 = hVar.f1170f.a();
        a3.getClass();
        return ((BigInteger) a2).compareTo((BigInteger) a3);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f1166b == hVar.f1166b && this.f1167c == hVar.f1167c && this.f1168d == hVar.f1168d;
    }

    public final int hashCode() {
        return ((((527 + this.f1166b) * 31) + this.f1167c) * 31) + this.f1168d;
    }

    public final String toString() {
        String str = this.f1169e;
        return this.f1166b + '.' + this.f1167c + '.' + this.f1168d + (!j1.g.G(str) ? "-".concat(str) : "");
    }
}
