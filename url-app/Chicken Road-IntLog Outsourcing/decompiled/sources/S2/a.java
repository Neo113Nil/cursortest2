package S2;

import O.j;
import Q2.b;
import V2.e;
import java.nio.charset.StandardCharsets;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f2745a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2746b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2747c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f2748d;

    /* renamed from: e, reason: collision with root package name */
    public e f2749e;

    public a(int i2, String str) {
        if (i2 == 0) {
            throw new NullPointerException("Null type");
        }
        this.f2745a = i2;
        this.f2746b = str;
        this.f2747c = ((j.b(i2) ^ 1000003) * 1000003) ^ str.hashCode();
    }

    public static a b(int i2, String str) {
        if (str == null) {
            str = "";
        }
        return new a(i2, str);
    }

    public static a c(e eVar) {
        int ordinal = eVar.f3236a.ordinal();
        String str = eVar.f3237b;
        switch (ordinal) {
            case 0:
                return b(1, str);
            case 1:
                return b(2, str);
            case 2:
                return b(3, str);
            case 3:
                return b(4, str);
            case 4:
                return b(5, str);
            case 5:
                return b(6, str);
            case 6:
                return b(7, str);
            case 7:
                return b(8, str);
            default:
                throw new IllegalArgumentException("Unrecognized attributeKey type: " + eVar.f3236a);
        }
    }

    public final e a() {
        e a6;
        String str;
        if (this.f2749e == null) {
            int i2 = this.f2745a;
            int b6 = j.b(i2);
            String str2 = this.f2746b;
            switch (b6) {
                case 0:
                    a6 = e.a(b.f2476a, str2);
                    break;
                case 1:
                    a6 = e.a(b.f2477b, str2);
                    break;
                case 2:
                    a6 = e.a(b.f2478c, str2);
                    break;
                case 3:
                    a6 = e.a(b.f2479d, str2);
                    break;
                case 4:
                    a6 = e.a(b.f2480e, str2);
                    break;
                case 5:
                    a6 = e.a(b.f2481f, str2);
                    break;
                case 6:
                    a6 = e.a(b.f2482g, str2);
                    break;
                case 7:
                    a6 = e.a(b.f2483h, str2);
                    break;
                case 8:
                    a6 = null;
                    break;
                default:
                    switch (i2) {
                        case 1:
                            str = "STRING";
                            break;
                        case 2:
                            str = "BOOLEAN";
                            break;
                        case 3:
                            str = "LONG";
                            break;
                        case 4:
                            str = "DOUBLE";
                            break;
                        case 5:
                            str = "STRING_ARRAY";
                            break;
                        case 6:
                            str = "BOOLEAN_ARRAY";
                            break;
                        case 7:
                            str = "LONG_ARRAY";
                            break;
                        case 8:
                            str = "DOUBLE_ARRAY";
                            break;
                        case 9:
                            str = "EXTENDED_ATTRIBUTES";
                            break;
                        default:
                            str = "null";
                            break;
                    }
                    throw new IllegalArgumentException("Unrecognized extendedAttributeKey type: ".concat(str));
            }
            this.f2749e = a6;
        }
        return this.f2749e;
    }

    public final byte[] d() {
        byte[] bArr = this.f2748d;
        if (bArr != null) {
            return bArr;
        }
        byte[] bytes = this.f2746b.getBytes(StandardCharsets.UTF_8);
        this.f2748d = bytes;
        return bytes;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return j.a(this.f2745a, aVar.f2745a) && this.f2746b.equals(aVar.f2746b);
    }

    public final int hashCode() {
        return this.f2747c;
    }

    public final String toString() {
        return this.f2746b;
    }
}
