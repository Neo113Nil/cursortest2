package androidx.datastore.preferences.protobuf;

import f.AbstractC0382a;
import h1.C0438i;

/* loaded from: classes.dex */
public abstract class e0 {

    /* renamed from: a, reason: collision with root package name */
    public static final c0 f3856a = new c0();

    /* renamed from: b, reason: collision with root package name */
    public static final d0 f3857b = new d0();

    public static String c(C0197g c0197g) {
        StringBuilder sb = new StringBuilder(c0197g.size());
        for (int i3 = 0; i3 < c0197g.size(); i3++) {
            byte b2 = c0197g.b(i3);
            if (b2 == 34) {
                sb.append("\\\"");
            } else if (b2 == 39) {
                sb.append("\\'");
            } else if (b2 != 92) {
                switch (b2) {
                    case C0438i.DOUBLE_FIELD_NUMBER /* 7 */:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case AbstractC0382a.f4777a /* 9 */:
                        sb.append("\\t");
                        break;
                    case AbstractC0382a.f4779c /* 10 */:
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
                        if (b2 < 32 || b2 > 126) {
                            sb.append('\\');
                            sb.append((char) (((b2 >>> 6) & 3) + 48));
                            sb.append((char) (((b2 >>> 3) & 7) + 48));
                            sb.append((char) ((b2 & 7) + 48));
                            break;
                        } else {
                            sb.append((char) b2);
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

    public static boolean d(byte b2) {
        return b2 > -65;
    }

    public abstract String a(byte[] bArr, int i3, int i4);

    public abstract int b(String str, byte[] bArr, int i3, int i4);

    public abstract int e(byte[] bArr, int i3, int i4);

    public abstract void f(byte[] bArr, int i3, int i4);
}
