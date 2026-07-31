package S1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class k extends O2.d {
    public static List h0(Object[] objArr) {
        f2.j.f(objArr, "<this>");
        List asList = Arrays.asList(objArr);
        f2.j.e(asList, "asList(...)");
        return asList;
    }

    public static boolean i0(long[] jArr, long j3) {
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

    public static void j0(int i3, int i4, int i5, byte[] bArr, byte[] bArr2) {
        f2.j.f(bArr, "<this>");
        f2.j.f(bArr2, "destination");
        System.arraycopy(bArr, i4, bArr2, i3, i5 - i4);
    }

    public static void k0(char[] cArr, char[] cArr2, int i3, int i4, int i5) {
        f2.j.f(cArr, "<this>");
        f2.j.f(cArr2, "destination");
        System.arraycopy(cArr, i4, cArr2, i3, i5 - i4);
    }

    public static void l0(int[] iArr, int[] iArr2, int i3, int i4, int i5) {
        f2.j.f(iArr, "<this>");
        f2.j.f(iArr2, "destination");
        System.arraycopy(iArr, i4, iArr2, i3, i5 - i4);
    }

    public static void m0(Object[] objArr, Object[] objArr2, int i3, int i4, int i5) {
        f2.j.f(objArr, "<this>");
        f2.j.f(objArr2, "destination");
        System.arraycopy(objArr, i4, objArr2, i3, i5 - i4);
    }

    public static /* synthetic */ void n0(int[] iArr, int[] iArr2, int i3, int i4, int i5) {
        if ((i5 & 2) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = iArr.length;
        }
        l0(iArr, iArr2, i3, 0, i4);
    }

    public static /* synthetic */ void o0(Object[] objArr, Object[] objArr2, int i3, int i4, int i5) {
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = objArr.length;
        }
        m0(objArr, objArr2, 0, i3, i4);
    }

    public static byte[] p0(byte[] bArr, int i3, int i4) {
        f2.j.f(bArr, "<this>");
        O2.d.E(i4, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i3, i4);
        f2.j.e(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    public static Object[] q0(Object[] objArr, int i3, int i4) {
        f2.j.f(objArr, "<this>");
        O2.d.E(i4, objArr.length);
        Object[] copyOfRange = Arrays.copyOfRange(objArr, i3, i4);
        f2.j.e(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    public static void r0(Object[] objArr, m1.q qVar, int i3, int i4) {
        f2.j.f(objArr, "<this>");
        Arrays.fill(objArr, i3, i4, qVar);
    }

    public static void s0(long[] jArr) {
        int length = jArr.length;
        f2.j.f(jArr, "<this>");
        Arrays.fill(jArr, 0, length, -9187201950435737472L);
    }

    public static int u0(Object[] objArr, Object obj) {
        f2.j.f(objArr, "<this>");
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

    public static String v0(byte[] bArr, String str, String str2, String str3, A2.i iVar, int i3) {
        if ((i3 & 2) != 0) {
            str2 = "";
        }
        if ((i3 & 4) != 0) {
            str3 = "";
        }
        if ((i3 & 32) != 0) {
            iVar = null;
        }
        f2.j.f(bArr, "<this>");
        f2.j.f(str2, "prefix");
        f2.j.f(str3, "postfix");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str2);
        int i4 = 0;
        for (byte b3 : bArr) {
            i4++;
            if (i4 > 1) {
                sb.append((CharSequence) str);
            }
            if (iVar != null) {
                sb.append((CharSequence) iVar.n(Byte.valueOf(b3)));
            } else {
                sb.append((CharSequence) String.valueOf((int) b3));
            }
        }
        sb.append((CharSequence) str3);
        String sb2 = sb.toString();
        f2.j.e(sb2, "toString(...)");
        return sb2;
    }

    public static List w0(Object[] objArr) {
        int length = objArr.length;
        return length != 0 ? length != 1 ? new ArrayList(new i(objArr, false)) : O2.l.l0(objArr[0]) : u.f4320d;
    }
}
