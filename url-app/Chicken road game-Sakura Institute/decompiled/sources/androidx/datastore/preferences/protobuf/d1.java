package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class d1 {

    /* renamed from: a, reason: collision with root package name */
    public static final b1 f802a = new b1();

    /* renamed from: b, reason: collision with root package name */
    public static final c1 f803b = new c1();

    public static String c(g gVar) {
        StringBuilder sb = new StringBuilder(gVar.size());
        for (int i7 = 0; i7 < gVar.size(); i7++) {
            byte a3 = gVar.a(i7);
            if (a3 == 34) {
                sb.append("\\\"");
            } else if (a3 == 39) {
                sb.append("\\'");
            } else if (a3 != 92) {
                switch (a3) {
                    case j3.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case q.c.f7259c /* 9 */:
                        sb.append("\\t");
                        break;
                    case q.c.f7261e /* 10 */:
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
                        if (a3 < 32 || a3 > 126) {
                            sb.append('\\');
                            sb.append((char) (((a3 >>> 6) & 3) + 48));
                            sb.append((char) (((a3 >>> 3) & 7) + 48));
                            sb.append((char) ((a3 & 7) + 48));
                            break;
                        } else {
                            sb.append((char) a3);
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

    public static boolean d(byte b9) {
        return b9 > -65;
    }

    public abstract String a(byte[] bArr, int i7, int i8);

    public abstract int b(String str, byte[] bArr, int i7, int i8);

    public abstract int e(byte[] bArr, int i7, int i8);

    public abstract void f(byte[] bArr, int i7, int i8);
}
