package X3;

import N.p;
import V3.b;
import a4.e;
import com.onesignal.core.internal.permissions.h;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.nio.charset.StandardCharsets;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f2863a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2864b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2865c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f2866d;

    /* renamed from: e, reason: collision with root package name */
    public e f2867e;

    public a(String str, int i7) {
        if (i7 == 0) {
            throw new NullPointerException("Null type");
        }
        this.f2863a = i7;
        this.f2864b = str;
        this.f2865c = str.hashCode() ^ ((p.c(i7) ^ 1000003) * 1000003);
    }

    public static a b(String str, int i7) {
        if (str == null) {
            str = "";
        }
        return new a(str, i7);
    }

    public static a c(e eVar) {
        b bVar = eVar.f3139a;
        String str = eVar.f3140b;
        switch (bVar.ordinal()) {
            case 0:
                return b(str, 1);
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                return b(str, 2);
            case h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                return b(str, 3);
            case 3:
                return b(str, 4);
            case 4:
                return b(str, 5);
            case 5:
                return b(str, 6);
            case 6:
                return b(str, 7);
            case 7:
                return b(str, 8);
            default:
                throw new IllegalArgumentException("Unrecognized attributeKey type: " + eVar.f3139a);
        }
    }

    public final e a() {
        e a7;
        String str;
        if (this.f2867e == null) {
            int i7 = this.f2863a;
            int c7 = p.c(i7);
            String str2 = this.f2864b;
            switch (c7) {
                case 0:
                    a7 = e.a(b.f2707f, str2);
                    break;
                case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                    a7 = e.a(b.f2708g, str2);
                    break;
                case h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                    a7 = e.a(b.f2709h, str2);
                    break;
                case 3:
                    a7 = e.a(b.f2710i, str2);
                    break;
                case 4:
                    a7 = e.a(b.f2711j, str2);
                    break;
                case 5:
                    a7 = e.a(b.f2712k, str2);
                    break;
                case 6:
                    a7 = e.a(b.f2713l, str2);
                    break;
                case 7:
                    a7 = e.a(b.f2714m, str2);
                    break;
                case 8:
                    a7 = null;
                    break;
                default:
                    switch (i7) {
                        case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                            str = "STRING";
                            break;
                        case h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
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
            this.f2867e = a7;
        }
        return this.f2867e;
    }

    public final byte[] d() {
        byte[] bArr = this.f2866d;
        if (bArr != null) {
            return bArr;
        }
        byte[] bytes = this.f2864b.getBytes(StandardCharsets.UTF_8);
        this.f2866d = bytes;
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
        return p.a(this.f2863a, aVar.f2863a) && this.f2864b.equals(aVar.f2864b);
    }

    public final int hashCode() {
        return this.f2865c;
    }

    public final String toString() {
        return this.f2864b;
    }
}
