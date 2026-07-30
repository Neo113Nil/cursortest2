package R;

import D.W;
import java.math.BigInteger;
import u0.C0245e;

/* loaded from: classes.dex */
public final class i implements Comparable {

    /* renamed from: j, reason: collision with root package name */
    public static final i f885j;

    /* renamed from: e, reason: collision with root package name */
    public final int f886e;

    /* renamed from: f, reason: collision with root package name */
    public final int f887f;

    /* renamed from: g, reason: collision with root package name */
    public final int f888g;

    /* renamed from: h, reason: collision with root package name */
    public final String f889h;

    /* renamed from: i, reason: collision with root package name */
    public final C0245e f890i = new C0245e(new W(3, this));

    static {
        new i(0, 0, 0, "");
        f885j = new i(0, 1, 0, "");
        new i(1, 0, 0, "");
    }

    public i(int i2, int i3, int i4, String str) {
        this.f886e = i2;
        this.f887f = i3;
        this.f888g = i4;
        this.f889h = str;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        i iVar = (i) obj;
        F0.i.e(iVar, "other");
        Object a2 = this.f890i.a();
        F0.i.d(a2, "<get-bigInteger>(...)");
        Object a3 = iVar.f890i.a();
        F0.i.d(a3, "<get-bigInteger>(...)");
        return ((BigInteger) a2).compareTo((BigInteger) a3);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f886e == iVar.f886e && this.f887f == iVar.f887f && this.f888g == iVar.f888g;
    }

    public final int hashCode() {
        return ((((527 + this.f886e) * 31) + this.f887f) * 31) + this.f888g;
    }

    public final String toString() {
        String str;
        String str2 = this.f889h;
        if (L0.h.Q(str2)) {
            str = "";
        } else {
            str = "-" + str2;
        }
        return this.f886e + '.' + this.f887f + '.' + this.f888g + str;
    }
}
