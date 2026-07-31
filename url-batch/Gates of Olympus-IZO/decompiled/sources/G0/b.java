package G0;

import H2.AbstractC0080b;
import M1.B;
import Z1.i;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f1524g = 0;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1525a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1526b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1527c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1528d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1529e;

    /* renamed from: f, reason: collision with root package name */
    public final H0.b f1530f;

    static {
        new b();
    }

    public b() {
        H0.b bVar = H0.b.f1848f;
        this.f1525a = false;
        this.f1526b = 0;
        this.f1527c = true;
        this.f1528d = 1;
        this.f1529e = 1;
        this.f1530f = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f1525a == bVar.f1525a && B.y(this.f1526b, bVar.f1526b) && this.f1527c == bVar.f1527c && I2.d.v(this.f1528d, bVar.f1528d) && a.a(this.f1529e, bVar.f1529e) && i.a(null, null) && i.a(this.f1530f, bVar.f1530f);
    }

    public final int hashCode() {
        return this.f1530f.f1849d.hashCode() + AbstractC0080b.b(this.f1529e, AbstractC0080b.b(this.f1528d, AbstractC0080b.f(AbstractC0080b.b(this.f1526b, Boolean.hashCode(this.f1525a) * 31, 31), 31, this.f1527c), 31), 961);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImeOptions(singleLine=");
        sb.append(this.f1525a);
        sb.append(", capitalization=");
        int i3 = this.f1526b;
        String str = "None";
        sb.append((Object) (B.y(i3, -1) ? "Unspecified" : B.y(i3, 0) ? "None" : B.y(i3, 1) ? "Characters" : B.y(i3, 2) ? "Words" : B.y(i3, 3) ? "Sentences" : "Invalid"));
        sb.append(", autoCorrect=");
        sb.append(this.f1527c);
        sb.append(", keyboardType=");
        int i4 = this.f1528d;
        sb.append((Object) (I2.d.v(i4, 0) ? "Unspecified" : I2.d.v(i4, 1) ? "Text" : I2.d.v(i4, 2) ? "Ascii" : I2.d.v(i4, 3) ? "Number" : I2.d.v(i4, 4) ? "Phone" : I2.d.v(i4, 5) ? "Uri" : I2.d.v(i4, 6) ? "Email" : I2.d.v(i4, 7) ? "Password" : I2.d.v(i4, 8) ? "NumberPassword" : I2.d.v(i4, 9) ? "Decimal" : "Invalid"));
        sb.append(", imeAction=");
        int i5 = this.f1529e;
        if (a.a(i5, -1)) {
            str = "Unspecified";
        } else if (!a.a(i5, 0)) {
            str = a.a(i5, 1) ? "Default" : a.a(i5, 2) ? "Go" : a.a(i5, 3) ? "Search" : a.a(i5, 4) ? "Send" : a.a(i5, 5) ? "Previous" : a.a(i5, 6) ? "Next" : a.a(i5, 7) ? "Done" : "Invalid";
        }
        sb.append((Object) str);
        sb.append(", platformImeOptions=null, hintLocales=");
        sb.append(this.f1530f);
        sb.append(')');
        return sb.toString();
    }
}
