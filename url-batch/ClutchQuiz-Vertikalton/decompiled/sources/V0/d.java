package V0;

import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class d extends T.d {
    public static void S(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        g1.f.e(objArr, "<this>");
        g1.f.e(objArr2, "destination");
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    public static Object[] T(Object[] objArr, int i, int i2) {
        g1.f.e(objArr, "<this>");
        int length = objArr.length;
        if (i2 <= length) {
            Object[] copyOfRange = Arrays.copyOfRange(objArr, i, i2);
            g1.f.d(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i2 + ") is greater than size (" + length + ").");
    }

    public static String U(Object[] objArr) {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int length = objArr.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            Object obj = objArr[i2];
            i++;
            if (i > 1) {
                sb.append((CharSequence) ", ");
            }
            if (obj != null ? obj instanceof CharSequence : true) {
                sb.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb.append(((Character) obj).charValue());
            } else {
                sb.append((CharSequence) String.valueOf(obj));
            }
        }
        sb.append((CharSequence) "");
        String sb2 = sb.toString();
        g1.f.d(sb2, "toString(...)");
        return sb2;
    }
}
