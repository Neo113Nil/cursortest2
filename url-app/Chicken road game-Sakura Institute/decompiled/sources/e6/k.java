package e6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class k extends r4.a {
    public static List T(Object[] objArr) {
        r6.k.f(objArr, "<this>");
        List asList = Arrays.asList(objArr);
        r6.k.e(asList, "asList(...)");
        return asList;
    }

    public static void U(int i7, int i8, int i9, byte[] bArr, byte[] bArr2) {
        r6.k.f(bArr, "<this>");
        r6.k.f(bArr2, "destination");
        System.arraycopy(bArr, i8, bArr2, i7, i9 - i8);
    }

    public static void V(char[] cArr, char[] cArr2, int i7, int i8, int i9) {
        r6.k.f(cArr, "<this>");
        r6.k.f(cArr2, "destination");
        System.arraycopy(cArr, i8, cArr2, i7, i9 - i8);
    }

    public static void W(int[] iArr, int[] iArr2, int i7, int i8, int i9) {
        r6.k.f(iArr, "<this>");
        r6.k.f(iArr2, "destination");
        System.arraycopy(iArr, i8, iArr2, i7, i9 - i8);
    }

    public static void X(Object[] objArr, Object[] objArr2, int i7, int i8, int i9) {
        r6.k.f(objArr, "<this>");
        r6.k.f(objArr2, "destination");
        System.arraycopy(objArr, i8, objArr2, i7, i9 - i8);
    }

    public static /* synthetic */ void Y(int[] iArr, int[] iArr2, int i7, int i8, int i9) {
        if ((i9 & 2) != 0) {
            i7 = 0;
        }
        if ((i9 & 8) != 0) {
            i8 = iArr.length;
        }
        W(iArr, iArr2, i7, 0, i8);
    }

    public static /* synthetic */ void Z(Object[] objArr, Object[] objArr2, int i7, int i8, int i9) {
        if ((i9 & 4) != 0) {
            i7 = 0;
        }
        if ((i9 & 8) != 0) {
            i8 = objArr.length;
        }
        X(objArr, objArr2, 0, i7, i8);
    }

    public static byte[] a0(byte[] bArr, int i7, int i8) {
        r6.k.f(bArr, "<this>");
        r4.a.y(i8, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i7, i8);
        r6.k.e(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    public static Object[] b0(Object[] objArr, int i7, int i8) {
        r6.k.f(objArr, "<this>");
        r4.a.y(i8, objArr.length);
        Object[] copyOfRange = Arrays.copyOfRange(objArr, i7, i8);
        r6.k.e(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    public static void c0(int i7, int i8, Object obj, Object[] objArr) {
        r6.k.f(objArr, "<this>");
        Arrays.fill(objArr, i7, i8, obj);
    }

    public static void d0(long[] jArr) {
        int length = jArr.length;
        r6.k.f(jArr, "<this>");
        Arrays.fill(jArr, 0, length, -9187201950435737472L);
    }

    public static ArrayList f0(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static int g0(Object[] objArr, Object obj) {
        r6.k.f(objArr, "<this>");
        int i7 = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i7 < length) {
                if (objArr[i7] == null) {
                    return i7;
                }
                i7++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i7 < length2) {
            if (obj.equals(objArr[i7])) {
                return i7;
            }
            i7++;
        }
        return -1;
    }

    public static String h0(byte[] bArr, String str, c7.r rVar, int i7) {
        String str2 = (i7 & 2) != 0 ? "" : "[";
        String str3 = (i7 & 4) == 0 ? "]" : "";
        if ((i7 & 32) != 0) {
            rVar = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str2);
        int i8 = 0;
        for (byte b9 : bArr) {
            i8++;
            if (i8 > 1) {
                sb.append((CharSequence) str);
            }
            if (rVar != null) {
                sb.append((CharSequence) rVar.f(Byte.valueOf(b9)));
            } else {
                sb.append((CharSequence) String.valueOf((int) b9));
            }
        }
        sb.append((CharSequence) str3);
        String sb2 = sb.toString();
        r6.k.e(sb2, "toString(...)");
        return sb2;
    }

    public static List i0(Object[] objArr) {
        int length = objArr.length;
        return length != 0 ? length != 1 ? new ArrayList(new i(objArr, false)) : t6.a.F(objArr[0]) : u.f2826f;
    }
}
