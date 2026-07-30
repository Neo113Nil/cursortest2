package x0;

import P.V;
import R5.q;
import java.math.BigInteger;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class i implements Comparable {

    /* renamed from: n, reason: collision with root package name */
    public static final i f8311n;

    /* renamed from: d, reason: collision with root package name */
    public final int f8312d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8313e;

    /* renamed from: i, reason: collision with root package name */
    public final int f8314i;

    /* renamed from: l, reason: collision with root package name */
    public final String f8315l;

    /* renamed from: m, reason: collision with root package name */
    public final q f8316m = R5.i.b(new V(5, this));

    static {
        new i(0, 0, 0, "");
        f8311n = new i(0, 1, 0, "");
        new i(1, 0, 0, "");
    }

    public i(int i2, int i5, int i7, String str) {
        this.f8312d = i2;
        this.f8313e = i5;
        this.f8314i = i7;
        this.f8315l = str;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        i other = (i) obj;
        Intrinsics.checkNotNullParameter(other, "other");
        Object value = this.f8316m.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-bigInteger>(...)");
        Object value2 = other.f8316m.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "<get-bigInteger>(...)");
        return ((BigInteger) value).compareTo((BigInteger) value2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f8312d == iVar.f8312d && this.f8313e == iVar.f8313e && this.f8314i == iVar.f8314i;
    }

    public final int hashCode() {
        return ((((527 + this.f8312d) * 31) + this.f8313e) * 31) + this.f8314i;
    }

    public final String toString() {
        String str;
        String str2 = this.f8315l;
        if (StringsKt.z(str2)) {
            str = "";
        } else {
            str = "-" + str2;
        }
        return this.f8312d + '.' + this.f8313e + '.' + this.f8314i + str;
    }
}
