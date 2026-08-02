package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class alv {
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;
    public final String e;
    public final int f;
    public final int g;

    public alv(String str, String str2, boolean z, int i, String str3, int i2) {
        int i3;
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = i;
        this.e = str3;
        this.f = i2;
        String upperCase = str2.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        if (ksp.m(upperCase, "INT", false)) {
            i3 = 3;
        } else {
            int i4 = 2;
            if (!ksp.m(upperCase, "CHAR", false) && !ksp.m(upperCase, "CLOB", false) && !ksp.m(upperCase, "TEXT", false)) {
                if (ksp.m(upperCase, "BLOB", false)) {
                    i3 = 5;
                } else {
                    i4 = 4;
                    if (!ksp.m(upperCase, "REAL", false) && !ksp.m(upperCase, "FLOA", false) && !ksp.m(upperCase, "DOUB", false)) {
                        i3 = 1;
                    }
                }
            }
            i3 = i4;
        }
        this.g = i3;
    }

    public final boolean a() {
        return this.d > 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof alv)) {
            return false;
        }
        alv alvVar = (alv) obj;
        if (a() != alvVar.a() || !ksp.b(this.a, alvVar.a) || this.c != alvVar.c) {
            return false;
        }
        String str = this.e;
        String str2 = alvVar.e;
        int i = this.f;
        if (i == 1 && alvVar.f == 2 && str != null && !ajz.g(str, str2)) {
            return false;
        }
        if (i == 2 && alvVar.f == 1 && str2 != null && !ajz.g(str2, str)) {
            return false;
        }
        if (i == alvVar.f) {
            if (str != null) {
                if (!ajz.g(str, str2)) {
                    return false;
                }
            } else if (str2 != null) {
                return false;
            }
        }
        return this.g == alvVar.g;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.g) * 31) + (true != this.c ? 1237 : 1231)) * 31) + this.d;
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
        return ksp.o(ksp.v(sb.toString()));
    }
}
