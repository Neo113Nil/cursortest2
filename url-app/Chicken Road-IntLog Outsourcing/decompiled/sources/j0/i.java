package j0;

import B4.k;
import M.U;
import a.AbstractC0169a;
import f4.C0434k;
import java.math.BigInteger;

/* loaded from: classes.dex */
public final class i implements Comparable {

    /* renamed from: f, reason: collision with root package name */
    public static final i f10457f;

    /* renamed from: a, reason: collision with root package name */
    public final int f10458a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10459b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10460c;

    /* renamed from: d, reason: collision with root package name */
    public final String f10461d;

    /* renamed from: e, reason: collision with root package name */
    public final C0434k f10462e = AbstractC0169a.A(new U(7, this));

    static {
        new i(0, 0, 0, "");
        f10457f = new i(0, 1, 0, "");
        new i(1, 0, 0, "");
    }

    public i(int i2, int i3, int i6, String str) {
        this.f10458a = i2;
        this.f10459b = i3;
        this.f10460c = i6;
        this.f10461d = str;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        i other = (i) obj;
        kotlin.jvm.internal.i.e(other, "other");
        Object value = this.f10462e.getValue();
        kotlin.jvm.internal.i.d(value, "<get-bigInteger>(...)");
        Object value2 = other.f10462e.getValue();
        kotlin.jvm.internal.i.d(value2, "<get-bigInteger>(...)");
        return ((BigInteger) value).compareTo((BigInteger) value2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f10458a == iVar.f10458a && this.f10459b == iVar.f10459b && this.f10460c == iVar.f10460c;
    }

    public final int hashCode() {
        return ((((527 + this.f10458a) * 31) + this.f10459b) * 31) + this.f10460c;
    }

    public final String toString() {
        String str;
        String str2 = this.f10461d;
        if (k.Z(str2)) {
            str = "";
        } else {
            str = "-" + str2;
        }
        return this.f10458a + '.' + this.f10459b + '.' + this.f10460c + str;
    }
}
