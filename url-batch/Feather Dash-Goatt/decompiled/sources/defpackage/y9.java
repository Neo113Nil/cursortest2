package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public class y9 extends w9 {
    public static boolean i(Object[] objArr, Object obj) {
        objArr.getClass();
        return k(objArr, obj) >= 0;
    }

    public static int j(long[] jArr) {
        jArr.getClass();
        return jArr.length - 1;
    }

    public static int k(Object[] objArr, Object obj) {
        objArr.getClass();
        int i = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i < length) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i < length2) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static String l(int i, Object[] objArr) {
        String str = (i & 2) != 0 ? "" : "innermostOf(";
        String str2 = (i & 4) == 0 ? ")" : "";
        objArr.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str);
        int i2 = 0;
        for (Object obj : objArr) {
            i2++;
            if (i2 > 1) {
                sb.append((CharSequence) ", ");
            }
            se1.a(sb, obj, null);
        }
        sb.append((CharSequence) str2);
        return sb.toString();
    }
}
