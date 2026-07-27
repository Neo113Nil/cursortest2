package androidx.datastore.preferences.protobuf;

import com.appsflyer.attribution.RequestError;
import q.AbstractC1024c;

/* loaded from: classes.dex */
public abstract class e0 {

    /* renamed from: a, reason: collision with root package name */
    public static final c0 f5331a = new c0();

    /* renamed from: b, reason: collision with root package name */
    public static final d0 f5332b = new d0();

    public static String c(C0442g c0442g) {
        StringBuilder sb = new StringBuilder(c0442g.size());
        for (int i2 = 0; i2 < c0442g.size(); i2++) {
            byte e4 = c0442g.e(i2);
            if (e4 == 34) {
                sb.append("\\\"");
            } else if (e4 == 39) {
                sb.append("\\'");
            } else if (e4 != 92) {
                switch (e4) {
                    case i1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        sb.append("\\a");
                        break;
                    case i1.i.BYTES_FIELD_NUMBER /* 8 */:
                        sb.append("\\b");
                        break;
                    case AbstractC1024c.f9242c /* 9 */:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case RequestError.STOP_TRACKING /* 11 */:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (e4 < 32 || e4 > 126) {
                            sb.append('\\');
                            sb.append((char) (((e4 >>> 6) & 3) + 48));
                            sb.append((char) (((e4 >>> 3) & 7) + 48));
                            sb.append((char) ((e4 & 7) + 48));
                            break;
                        } else {
                            sb.append((char) e4);
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

    public static boolean d(byte b4) {
        return b4 > -65;
    }

    public abstract String a(byte[] bArr, int i2, int i4);

    public abstract int b(String str, byte[] bArr, int i2, int i4);

    public abstract int e(byte[] bArr, int i2, int i4);

    public abstract void f(byte[] bArr, int i2, int i4);
}
