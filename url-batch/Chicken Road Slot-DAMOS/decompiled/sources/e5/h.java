package e5;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f3905a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3906b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3907c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3908d;

    /* renamed from: e, reason: collision with root package name */
    public final String f3909e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3910f;
    public final int g;

    public h(String str, String str2, boolean z10, int i3, String str3, int i10) {
        str.getClass();
        str2.getClass();
        this.f3905a = str;
        this.f3906b = str2;
        this.f3907c = z10;
        this.f3908d = i3;
        this.f3909e = str3;
        this.f3910f = i10;
        String upperCase = str2.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        this.g = StringsKt.n(upperCase, "INT") ? 3 : (StringsKt.n(upperCase, "CHAR") || StringsKt.n(upperCase, "CLOB") || StringsKt.n(upperCase, "TEXT")) ? 2 : StringsKt.n(upperCase, "BLOB") ? 5 : (StringsKt.n(upperCase, "REAL") || StringsKt.n(upperCase, "FLOA") || StringsKt.n(upperCase, "DOUB")) ? 4 : 1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof h) {
                boolean z10 = this.f3908d > 0;
                h hVar = (h) obj;
                int i3 = hVar.f3910f;
                if (z10 == (hVar.f3908d > 0) && Intrinsics.a(this.f3905a, hVar.f3905a) && this.f3907c == hVar.f3907c) {
                    String str = hVar.f3909e;
                    int i10 = this.f3910f;
                    String str2 = this.f3909e;
                    if ((i10 != 1 || i3 != 2 || str2 == null || a.a.q(str2, str)) && ((i10 != 2 || i3 != 1 || str == null || a.a.q(str, str2)) && ((i10 == 0 || i10 != i3 || (str2 == null ? str == null : a.a.q(str2, str))) && this.g == hVar.g))) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.f3905a.hashCode() * 31) + this.g) * 31) + (this.f3907c ? 1231 : 1237)) * 31) + this.f3908d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("\n            |Column {\n            |   name = '");
        sb2.append(this.f3905a);
        sb2.append("',\n            |   type = '");
        sb2.append(this.f3906b);
        sb2.append("',\n            |   affinity = '");
        sb2.append(this.g);
        sb2.append("',\n            |   notNull = '");
        sb2.append(this.f3907c);
        sb2.append("',\n            |   primaryKeyPosition = '");
        sb2.append(this.f3908d);
        sb2.append("',\n            |   defaultValue = '");
        String str = this.f3909e;
        if (str == null) {
            str = "undefined";
        }
        sb2.append(str);
        sb2.append("'\n            |}\n        ");
        return kotlin.text.i.b(kotlin.text.i.d(sb2.toString()));
    }
}
