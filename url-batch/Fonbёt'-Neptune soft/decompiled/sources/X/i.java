package X;

import I.U;
import java.math.BigInteger;

/* loaded from: classes.dex */
public final class i implements Comparable {

    /* renamed from: j, reason: collision with root package name */
    public static final i f1137j;

    /* renamed from: e, reason: collision with root package name */
    public final int f1138e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1139f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1140g;

    /* renamed from: h, reason: collision with root package name */
    public final String f1141h;

    /* renamed from: i, reason: collision with root package name */
    public final F0.f f1142i = new F0.f(new U(3, this));

    static {
        new i(0, 0, 0, "");
        f1137j = new i(0, 1, 0, "");
        new i(1, 0, 0, "");
    }

    public i(int i2, int i3, int i4, String str) {
        this.f1138e = i2;
        this.f1139f = i3;
        this.f1140g = i4;
        this.f1141h = str;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        i iVar = (i) obj;
        Q0.h.e(iVar, "other");
        Object a2 = this.f1142i.a();
        Q0.h.d(a2, "<get-bigInteger>(...)");
        Object a3 = iVar.f1142i.a();
        Q0.h.d(a3, "<get-bigInteger>(...)");
        return ((BigInteger) a2).compareTo((BigInteger) a3);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f1138e == iVar.f1138e && this.f1139f == iVar.f1139f && this.f1140g == iVar.f1140g;
    }

    public final int hashCode() {
        return ((((527 + this.f1138e) * 31) + this.f1139f) * 31) + this.f1140g;
    }

    public final String toString() {
        String str;
        String str2 = this.f1141h;
        if (X0.j.R(str2)) {
            str = "";
        } else {
            str = "-" + str2;
        }
        return this.f1138e + '.' + this.f1139f + '.' + this.f1140g + str;
    }
}
