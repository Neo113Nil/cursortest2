package M1;

import a.AbstractC0157a;
import e2.C0380d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class k extends I2.l {
    public static List T(Object[] objArr) {
        Z1.i.f(objArr, "<this>");
        List asList = Arrays.asList(objArr);
        Z1.i.e(asList, "asList(...)");
        return asList;
    }

    public static boolean U(long[] jArr, long j3) {
        int length = jArr.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                i3 = -1;
                break;
            }
            if (j3 == jArr[i3]) {
                break;
            }
            i3++;
        }
        return i3 >= 0;
    }

    public static void V(int i3, int i4, int i5, byte[] bArr, byte[] bArr2) {
        Z1.i.f(bArr, "<this>");
        Z1.i.f(bArr2, "destination");
        System.arraycopy(bArr, i4, bArr2, i3, i5 - i4);
    }

    public static void W(int[] iArr, int[] iArr2, int i3, int i4, int i5) {
        Z1.i.f(iArr, "<this>");
        Z1.i.f(iArr2, "destination");
        System.arraycopy(iArr, i4, iArr2, i3, i5 - i4);
    }

    public static void X(Object[] objArr, Object[] objArr2, int i3, int i4, int i5) {
        Z1.i.f(objArr, "<this>");
        Z1.i.f(objArr2, "destination");
        System.arraycopy(objArr, i4, objArr2, i3, i5 - i4);
    }

    public static /* synthetic */ void Y(int[] iArr, int[] iArr2, int i3, int i4, int i5) {
        if ((i5 & 2) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = iArr.length;
        }
        W(iArr, iArr2, i3, 0, i4);
    }

    public static /* synthetic */ void Z(Object[] objArr, Object[] objArr2, int i3, int i4, int i5) {
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        X(objArr, objArr2, 0, i3, i4);
    }

    public static byte[] a0(byte[] bArr, int i3, int i4) {
        Z1.i.f(bArr, "<this>");
        I2.l.r(i4, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i3, i4);
        Z1.i.e(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    public static Object[] b0(Object[] objArr, int i3, int i4) {
        Z1.i.f(objArr, "<this>");
        I2.l.r(i4, objArr.length);
        Object[] copyOfRange = Arrays.copyOfRange(objArr, i3, i4);
        Z1.i.e(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    public static void c0(Object[] objArr, int i3, int i4) {
        Z1.i.f(objArr, "<this>");
        Arrays.fill(objArr, i3, i4, (Object) null);
    }

    public static void d0(long[] jArr) {
        int length = jArr.length;
        Z1.i.f(jArr, "<this>");
        Arrays.fill(jArr, 0, length, -9187201950435737472L);
    }

    public static C0380d f0(int[] iArr) {
        return new C0380d(0, iArr.length - 1, 1);
    }

    public static int g0(Object[] objArr, Object obj) {
        Z1.i.f(objArr, "<this>");
        int i3 = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i3 < length) {
                if (objArr[i3] == null) {
                    return i3;
                }
                i3++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i3 < length2) {
            if (obj.equals(objArr[i3])) {
                return i3;
            }
            i3++;
        }
        return -1;
    }

    public static String h0(byte[] bArr, String str, String str2, String str3, D1.E e3, int i3) {
        if ((i3 & 2) != 0) {
            str2 = "";
        }
        if ((i3 & 4) != 0) {
            str3 = "";
        }
        if ((i3 & 32) != 0) {
            e3 = null;
        }
        Z1.i.f(bArr, "<this>");
        Z1.i.f(str2, "prefix");
        Z1.i.f(str3, "postfix");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str2);
        int i4 = 0;
        for (byte b2 : bArr) {
            i4++;
            if (i4 > 1) {
                sb.append((CharSequence) str);
            }
            if (e3 != null) {
                sb.append((CharSequence) e3.j(Byte.valueOf(b2)));
            } else {
                sb.append((CharSequence) String.valueOf((int) b2));
            }
        }
        sb.append((CharSequence) str3);
        String sb2 = sb.toString();
        Z1.i.e(sb2, "toString(...)");
        return sb2;
    }

    public static List i0(Object[] objArr) {
        int length = objArr.length;
        return length != 0 ? length != 1 ? new ArrayList(new i(objArr, false)) : AbstractC0157a.M(objArr[0]) : u.f2803d;
    }
}
