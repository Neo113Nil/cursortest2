package E4;

import H4.e;
import S.i;
import S.j;
import java.nio.charset.StandardCharsets;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f700a;

    /* renamed from: b, reason: collision with root package name */
    public final String f701b;

    /* renamed from: c, reason: collision with root package name */
    public final int f702c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f703d;

    /* renamed from: e, reason: collision with root package name */
    public e f704e;

    public a(int i2, String str) {
        if (i2 == 0) {
            throw new NullPointerException("Null type");
        }
        this.f700a = i2;
        this.f701b = str;
        this.f702c = ((i.b(i2) ^ 1000003) * 1000003) ^ str.hashCode();
    }

    public static a b(int i2, String str) {
        if (str == null) {
            str = "";
        }
        return new a(i2, str);
    }

    public static a c(e eVar) {
        C4.e eVar2 = eVar.f990a;
        String str = eVar.f991b;
        switch (eVar2.ordinal()) {
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
            case j.DOUBLE_FIELD_NUMBER /* 7 */:
                return b(8, str);
            default:
                throw new IllegalArgumentException("Unrecognized attributeKey type: " + eVar.f990a);
        }
    }

    public final e a() {
        e a7;
        String str;
        if (this.f704e == null) {
            int i2 = this.f700a;
            int b7 = i.b(i2);
            String str2 = this.f701b;
            switch (b7) {
                case 0:
                    a7 = e.a(C4.e.f301d, str2);
                    break;
                case 1:
                    a7 = e.a(C4.e.f302e, str2);
                    break;
                case 2:
                    a7 = e.a(C4.e.f303i, str2);
                    break;
                case 3:
                    a7 = e.a(C4.e.f304l, str2);
                    break;
                case 4:
                    a7 = e.a(C4.e.f305m, str2);
                    break;
                case 5:
                    a7 = e.a(C4.e.f306n, str2);
                    break;
                case 6:
                    a7 = e.a(C4.e.f307o, str2);
                    break;
                case j.DOUBLE_FIELD_NUMBER /* 7 */:
                    a7 = e.a(C4.e.f308p, str2);
                    break;
                case j.BYTES_FIELD_NUMBER /* 8 */:
                    a7 = null;
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
                        case j.DOUBLE_FIELD_NUMBER /* 7 */:
                            str = "LONG_ARRAY";
                            break;
                        case j.BYTES_FIELD_NUMBER /* 8 */:
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
            this.f704e = a7;
        }
        return this.f704e;
    }

    public final byte[] d() {
        byte[] bArr = this.f703d;
        if (bArr != null) {
            return bArr;
        }
        byte[] bytes = this.f701b.getBytes(StandardCharsets.UTF_8);
        this.f703d = bytes;
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
        return i.a(this.f700a, aVar.f700a) && this.f701b.equals(aVar.f701b);
    }

    public final int hashCode() {
        return this.f702c;
    }

    public final String toString() {
        return this.f701b;
    }
}
