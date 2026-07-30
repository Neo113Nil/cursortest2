package j0;

import a.AbstractC0169a;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import r4.f;

/* renamed from: j0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0563a {

    /* renamed from: a, reason: collision with root package name */
    public final String f5924a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5925b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f5926c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5927d;

    /* renamed from: e, reason: collision with root package name */
    public final String f5928e;

    /* renamed from: f, reason: collision with root package name */
    public final int f5929f;

    /* renamed from: g, reason: collision with root package name */
    public final int f5930g;

    public C0563a(String name, String type, boolean z7, int i2, String str, int i5) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f5924a = name;
        this.f5925b = type;
        this.f5926c = z7;
        this.f5927d = i2;
        this.f5928e = str;
        this.f5929f = i5;
        int i7 = 5;
        if (type != null) {
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String upperCase = type.toUpperCase(US);
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
            if (StringsKt.u(upperCase, "INT", false)) {
                i7 = 3;
            } else if (StringsKt.u(upperCase, "CHAR", false) || StringsKt.u(upperCase, "CLOB", false) || StringsKt.u(upperCase, "TEXT", false)) {
                i7 = 2;
            } else if (!StringsKt.u(upperCase, "BLOB", false)) {
                i7 = (StringsKt.u(upperCase, "REAL", false) || StringsKt.u(upperCase, "FLOA", false) || StringsKt.u(upperCase, "DOUB", false)) ? 4 : 1;
            }
        }
        this.f5930g = i7;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C0563a)) {
                return false;
            }
            C0563a c0563a = (C0563a) obj;
            if (this.f5927d != c0563a.f5927d) {
                return false;
            }
            String str = c0563a.f5924a;
            int i2 = c0563a.f5929f;
            String str2 = c0563a.f5928e;
            if (!Intrinsics.a(this.f5924a, str) || this.f5926c != c0563a.f5926c) {
                return false;
            }
            String str3 = this.f5928e;
            int i5 = this.f5929f;
            if (i5 == 1 && i2 == 2 && str3 != null && !AbstractC0169a.h(str3, str2)) {
                return false;
            }
            if (i5 == 2 && i2 == 1 && str2 != null && !AbstractC0169a.h(str2, str3)) {
                return false;
            }
            if (i5 != 0 && i5 == i2) {
                if (str3 != null) {
                    if (!AbstractC0169a.h(str3, str2)) {
                        return false;
                    }
                } else if (str2 != null) {
                    return false;
                }
            }
            if (this.f5930g != c0563a.f5930g) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.f5924a.hashCode() * 31) + this.f5930g) * 31) + (this.f5926c ? 1231 : 1237)) * 31) + this.f5927d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Column{name='");
        sb.append(this.f5924a);
        sb.append("', type='");
        sb.append(this.f5925b);
        sb.append("', affinity='");
        sb.append(this.f5930g);
        sb.append("', notNull=");
        sb.append(this.f5926c);
        sb.append(", primaryKeyPosition=");
        sb.append(this.f5927d);
        sb.append(", defaultValue='");
        String str = this.f5928e;
        if (str == null) {
            str = "undefined";
        }
        return f.f(sb, str, "'}");
    }
}
