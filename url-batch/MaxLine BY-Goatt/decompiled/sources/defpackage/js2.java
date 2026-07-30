package defpackage;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class js2 {
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;
    public final String e;
    public final int f;
    public final int g;

    public js2(String str, String str2, boolean z, int i, String str3, int i2) {
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
        this.g = up2.q(upperCase, "INT") ? 3 : (up2.q(upperCase, "CHAR") || up2.q(upperCase, "CLOB") || up2.q(upperCase, "TEXT")) ? 2 : up2.q(upperCase, "BLOB") ? 5 : (up2.q(upperCase, "REAL") || up2.q(upperCase, "FLOA") || up2.q(upperCase, "DOUB")) ? 4 : 1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof js2) {
                boolean z = this.d > 0;
                js2 js2Var = (js2) obj;
                int i = js2Var.f;
                if (z == (js2Var.d > 0) && Intrinsics.b(this.a, js2Var.a) && this.c == js2Var.c) {
                    String str = js2Var.e;
                    int i2 = this.f;
                    String str2 = this.e;
                    if ((i2 != 1 || i != 2 || str2 == null || th2.h(str2, str)) && ((i2 != 2 || i != 1 || str == null || th2.h(str, str2)) && ((i2 == 0 || i2 != i || (str2 == null ? str == null : th2.h(str2, str))) && this.g == js2Var.g))) {
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
        return np2.b(np2.d(sb.toString()));
    }
}
