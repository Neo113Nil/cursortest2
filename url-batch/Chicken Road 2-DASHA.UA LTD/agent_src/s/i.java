package s;

import java.math.BigInteger;
import r.C0092a;

/* loaded from: classes.dex */
public final class i implements Comparable {

    /* renamed from: g, reason: collision with root package name */
    public static final i f1252g;

    /* renamed from: b, reason: collision with root package name */
    public final int f1253b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1254c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1255d;

    /* renamed from: e, reason: collision with root package name */
    public final String f1256e;

    /* renamed from: f, reason: collision with root package name */
    public final U.e f1257f = new U.e(new C0092a(1, this));

    static {
        new i(0, 0, 0, "");
        f1252g = new i(0, 1, 0, "");
        new i(1, 0, 0, "");
    }

    public i(int i2, int i3, int i4, String str) {
        this.f1253b = i2;
        this.f1254c = i3;
        this.f1255d = i4;
        this.f1256e = str;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        i iVar = (i) obj;
        e0.h.e(iVar, "other");
        Object a2 = this.f1257f.a();
        e0.h.d(a2, "<get-bigInteger>(...)");
        Object a3 = iVar.f1257f.a();
        e0.h.d(a3, "<get-bigInteger>(...)");
        return ((BigInteger) a2).compareTo((BigInteger) a3);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f1253b == iVar.f1253b && this.f1254c == iVar.f1254c && this.f1255d == iVar.f1255d;
    }

    public final int hashCode() {
        return ((((527 + this.f1253b) * 31) + this.f1254c) * 31) + this.f1255d;
    }

    public final String toString() {
        String str;
        String str2 = this.f1256e;
        int i2 = 0;
        while (true) {
            if (i2 >= str2.length()) {
                str = "";
                break;
            }
            char charAt = str2.charAt(i2);
            if (!Character.isWhitespace(charAt) && !Character.isSpaceChar(charAt)) {
                str = "-".concat(str2);
                break;
            }
            i2++;
        }
        return this.f1253b + '.' + this.f1254c + '.' + this.f1255d + str;
    }
}
