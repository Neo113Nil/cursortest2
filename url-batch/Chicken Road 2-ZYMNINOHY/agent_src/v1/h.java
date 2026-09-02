package v1;

import E.AbstractC0005f;
import G3.k;
import c3.C0295g;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.math.BigInteger;
import kotlin.jvm.internal.i;
import w3.AbstractC1510g;

/* loaded from: classes.dex */
public final class h implements Comparable {

    /* renamed from: f, reason: collision with root package name */
    public static final h f15551f;

    /* renamed from: a, reason: collision with root package name */
    public final int f15552a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15553b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15554c;

    /* renamed from: d, reason: collision with root package name */
    public final String f15555d;

    /* renamed from: e, reason: collision with root package name */
    public final C0295g f15556e = new C0295g(new k(6, this));

    static {
        new h("", 0, 0, 0);
        f15551f = new h("", 0, 1, 0);
        new h("", 1, 0, 0);
    }

    public h(String str, int i4, int i5, int i6) {
        this.f15552a = i4;
        this.f15553b = i5;
        this.f15554c = i6;
        this.f15555d = str;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        h other = (h) obj;
        i.e(other, "other");
        Object a3 = this.f15556e.a();
        i.d(a3, "<get-bigInteger>(...)");
        Object a4 = other.f15556e.a();
        i.d(a4, "<get-bigInteger>(...)");
        return ((BigInteger) a3).compareTo((BigInteger) a4);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f15552a == hVar.f15552a && this.f15553b == hVar.f15553b && this.f15554c == hVar.f15554c;
    }

    public final int hashCode() {
        return ((((527 + this.f15552a) * 31) + this.f15553b) * 31) + this.f15554c;
    }

    public final String toString() {
        String str = this.f15555d;
        String n = !AbstractC1510g.j0(str) ? AbstractC0005f.n(TokenBuilder.TOKEN_DELIMITER, str) : "";
        StringBuilder sb = new StringBuilder();
        sb.append(this.f15552a);
        sb.append('.');
        sb.append(this.f15553b);
        sb.append('.');
        return AbstractC0005f.o(sb, this.f15554c, n);
    }
}
