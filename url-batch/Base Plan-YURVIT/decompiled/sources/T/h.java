package T;

import F.U;
import java.math.BigInteger;

/* loaded from: classes.dex */
public final class h implements Comparable {

    /* renamed from: j, reason: collision with root package name */
    public static final h f847j;

    /* renamed from: e, reason: collision with root package name */
    public final int f848e;

    /* renamed from: f, reason: collision with root package name */
    public final int f849f;

    /* renamed from: g, reason: collision with root package name */
    public final int f850g;

    /* renamed from: h, reason: collision with root package name */
    public final String f851h;

    /* renamed from: i, reason: collision with root package name */
    public final D0.f f852i = new D0.f(new U(3, this));

    static {
        new h(0, 0, 0, "");
        f847j = new h(0, 1, 0, "");
        new h(1, 0, 0, "");
    }

    public h(int i2, int i3, int i4, String str) {
        this.f848e = i2;
        this.f849f = i3;
        this.f850g = i4;
        this.f851h = str;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        h hVar = (h) obj;
        P0.h.e(hVar, "other");
        Object a2 = this.f852i.a();
        P0.h.d(a2, "<get-bigInteger>(...)");
        Object a3 = hVar.f852i.a();
        P0.h.d(a3, "<get-bigInteger>(...)");
        return ((BigInteger) a2).compareTo((BigInteger) a3);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f848e == hVar.f848e && this.f849f == hVar.f849f && this.f850g == hVar.f850g;
    }

    public final int hashCode() {
        return ((((527 + this.f848e) * 31) + this.f849f) * 31) + this.f850g;
    }

    public final String toString() {
        String str;
        String str2 = this.f851h;
        if (V0.i.P(str2)) {
            str = "";
        } else {
            str = "-" + str2;
        }
        return this.f848e + '.' + this.f849f + '.' + this.f850g + str;
    }
}
