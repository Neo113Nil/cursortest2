package G1;

import H2.AbstractC0080b;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final List f1563a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1564b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1565c;

    /* renamed from: d, reason: collision with root package name */
    public final String f1566d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f1567e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f1568f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1569g;

    public n(List list, int i3, int i4, String str, boolean z3, boolean z4, int i5) {
        Z1.i.f(list, "questions");
        this.f1563a = list;
        this.f1564b = i3;
        this.f1565c = i4;
        this.f1566d = str;
        this.f1567e = z3;
        this.f1568f = z4;
        this.f1569g = i5;
    }

    public static n a(n nVar, ArrayList arrayList, int i3, int i4, String str, boolean z3, boolean z4, int i5, int i6) {
        List list = (i6 & 1) != 0 ? nVar.f1563a : arrayList;
        int i7 = (i6 & 2) != 0 ? nVar.f1564b : i3;
        int i8 = (i6 & 4) != 0 ? nVar.f1565c : i4;
        String str2 = (i6 & 8) != 0 ? nVar.f1566d : str;
        boolean z5 = (i6 & 16) != 0 ? nVar.f1567e : z3;
        boolean z6 = (i6 & 32) != 0 ? nVar.f1568f : z4;
        int i9 = (i6 & 64) != 0 ? nVar.f1569g : i5;
        nVar.getClass();
        Z1.i.f(list, "questions");
        return new n(list, i7, i8, str2, z5, z6, i9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Z1.i.a(this.f1563a, nVar.f1563a) && this.f1564b == nVar.f1564b && this.f1565c == nVar.f1565c && Z1.i.a(this.f1566d, nVar.f1566d) && this.f1567e == nVar.f1567e && this.f1568f == nVar.f1568f && this.f1569g == nVar.f1569g;
    }

    public final int hashCode() {
        int b2 = AbstractC0080b.b(this.f1565c, AbstractC0080b.b(this.f1564b, this.f1563a.hashCode() * 31, 31), 31);
        String str = this.f1566d;
        return Integer.hashCode(this.f1569g) + AbstractC0080b.f(AbstractC0080b.f((b2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f1567e), 31, this.f1568f);
    }

    public final String toString() {
        return "GuessState(questions=" + this.f1563a + ", index=" + this.f1564b + ", score=" + this.f1565c + ", selectedId=" + this.f1566d + ", revealed=" + this.f1567e + ", finished=" + this.f1568f + ", best=" + this.f1569g + ")";
    }
}
