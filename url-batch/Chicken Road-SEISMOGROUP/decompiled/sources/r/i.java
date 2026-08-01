package r;

import java.math.BigInteger;
import q.C0085a;

/* loaded from: classes.dex */
public final class i implements Comparable {

    /* renamed from: g, reason: collision with root package name */
    public static final i f1249g;

    /* renamed from: b, reason: collision with root package name */
    public final int f1250b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1251c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1252d;

    /* renamed from: e, reason: collision with root package name */
    public final String f1253e;

    /* renamed from: f, reason: collision with root package name */
    public final U.e f1254f = new U.e(new C0085a(1, this));

    static {
        new i(0, 0, 0, "");
        f1249g = new i(0, 1, 0, "");
        new i(1, 0, 0, "");
    }

    public i(int i2, int i3, int i4, String str) {
        this.f1250b = i2;
        this.f1251c = i3;
        this.f1252d = i4;
        this.f1253e = str;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        i iVar = (i) obj;
        e0.h.e(iVar, "other");
        Object a2 = this.f1254f.a();
        e0.h.d(a2, "<get-bigInteger>(...)");
        Object a3 = iVar.f1254f.a();
        e0.h.d(a3, "<get-bigInteger>(...)");
        return ((BigInteger) a2).compareTo((BigInteger) a3);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f1250b == iVar.f1250b && this.f1251c == iVar.f1251c && this.f1252d == iVar.f1252d;
    }

    public final int hashCode() {
        return ((((527 + this.f1250b) * 31) + this.f1251c) * 31) + this.f1252d;
    }

    public final String toString() {
        String str;
        String str2 = this.f1253e;
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
        return this.f1250b + '.' + this.f1251c + '.' + this.f1252d + str;
    }
}
