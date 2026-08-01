package defpackage;

import java.util.Locale;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class ch0 {
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;
    public final String e;
    public final int f;
    public final int g;

    public ch0(String str, String str2, boolean z, int i, String str3, int i2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = i;
        this.e = str3;
        this.f = i2;
        String upperCase = str2.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        this.g = mf0.t(upperCase, "INT") ? 3 : (mf0.t(upperCase, "CHAR") || mf0.t(upperCase, "CLOB") || mf0.t(upperCase, "TEXT")) ? 2 : mf0.t(upperCase, "BLOB") ? 5 : (mf0.t(upperCase, "REAL") || mf0.t(upperCase, "FLOA") || mf0.t(upperCase, "DOUB")) ? 4 : 1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ch0) {
                boolean z = this.d > 0;
                ch0 ch0Var = (ch0) obj;
                int i = ch0Var.f;
                if (z == (ch0Var.d > 0) && mv.c(this.a, ch0Var.a) && this.c == ch0Var.c) {
                    String str = ch0Var.e;
                    int i2 = this.f;
                    String str2 = this.e;
                    if ((i2 != 1 || i != 2 || str2 == null || bd0.c(str2, str)) && ((i2 != 2 || i != 1 || str == null || bd0.c(str, str2)) && ((i2 == 0 || i2 != i || (str2 == null ? str == null : bd0.c(str2, str))) && this.g == ch0Var.g))) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.g) * 31) + (this.c ? 1231 : 1237)) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |Column {\n            |   name = '");
        sb.append(this.a);
        sb.append("',\n            |   type = '");
        sb.append(this.b);
        sb.append("',\n            |   affinity = '");
        sb.append(this.g);
        sb.append("',\n            |   notNull = '");
        sb.append(this.c);
        sb.append("',\n            |   primaryKeyPosition = '");
        sb.append(this.d);
        sb.append("',\n            |   defaultValue = '");
        String str = this.e;
        if (str == null) {
            str = "undefined";
        }
        sb.append(str);
        sb.append("'\n            |}\n        ");
        return nf0.m(nf0.n(sb.toString()));
    }
}
