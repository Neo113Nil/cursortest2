package d0;

import K.S;
import b2.C0193g;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.math.BigInteger;
import kotlin.jvm.internal.j;
import s2.n;

/* loaded from: classes.dex */
public final class h implements Comparable {
    public static final h f;

    /* renamed from: a, reason: collision with root package name */
    public final int f4925a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4926b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4927c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4928d;

    /* renamed from: e, reason: collision with root package name */
    public final C0193g f4929e = new C0193g(new S(3, this));

    static {
        new h("", 0, 0, 0);
        f = new h("", 0, 1, 0);
        new h("", 1, 0, 0);
    }

    public h(String str, int i3, int i4, int i5) {
        this.f4925a = i3;
        this.f4926b = i4;
        this.f4927c = i5;
        this.f4928d = str;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        h other = (h) obj;
        j.e(other, "other");
        Object a3 = this.f4929e.a();
        j.d(a3, "<get-bigInteger>(...)");
        Object a4 = other.f4929e.a();
        j.d(a4, "<get-bigInteger>(...)");
        return ((BigInteger) a3).compareTo((BigInteger) a4);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f4925a == hVar.f4925a && this.f4926b == hVar.f4926b && this.f4927c == hVar.f4927c;
    }

    public final int hashCode() {
        return ((((527 + this.f4925a) * 31) + this.f4926b) * 31) + this.f4927c;
    }

    public final String toString() {
        String str;
        String str2 = this.f4928d;
        if (n.U(str2)) {
            str = "";
        } else {
            str = TokenBuilder.TOKEN_DELIMITER + str2;
        }
        return this.f4925a + '.' + this.f4926b + '.' + this.f4927c + str;
    }
}
