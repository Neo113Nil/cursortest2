package androidx.datastore.preferences.protobuf;

import r.AbstractC0856c;

/* loaded from: classes.dex */
public abstract class e0 {

    /* renamed from: a, reason: collision with root package name */
    public static final c0 f5057a = new c0();

    /* renamed from: b, reason: collision with root package name */
    public static final d0 f5058b = new d0();

    public static String c(C0253g c0253g) {
        StringBuilder sb = new StringBuilder(c0253g.size());
        for (int i3 = 0; i3 < c0253g.size(); i3++) {
            byte b3 = c0253g.b(i3);
            if (b3 == 34) {
                sb.append("\\\"");
            } else if (b3 == 39) {
                sb.append("\\'");
            } else if (b3 != 92) {
                switch (b3) {
                    case k1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        sb.append("\\a");
                        break;
                    case k1.i.BYTES_FIELD_NUMBER /* 8 */:
                        sb.append("\\b");
                        break;
                    case AbstractC0856c.f8037c /* 9 */:
                        sb.append("\\t");
                        break;
                    case AbstractC0856c.f8039e /* 10 */:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (b3 < 32 || b3 > 126) {
                            sb.append('\\');
                            sb.append((char) (((b3 >>> 6) & 3) + 48));
                            sb.append((char) (((b3 >>> 3) & 7) + 48));
                            sb.append((char) ((b3 & 7) + 48));
                            break;
                        } else {
                            sb.append((char) b3);
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static boolean d(byte b3) {
        return b3 > -65;
    }

    public abstract String a(byte[] bArr, int i3, int i4);

    public abstract int b(String str, byte[] bArr, int i3, int i4);

    public abstract int e(byte[] bArr, int i3, int i4);

    public abstract void f(byte[] bArr, int i3, int i4);
}
