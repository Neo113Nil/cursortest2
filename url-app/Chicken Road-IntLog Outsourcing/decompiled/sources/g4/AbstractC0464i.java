package g4;

import io.appmetrica.analytics.impl.C0789l5;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import t4.InterfaceC1441l;

/* renamed from: g4.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0464i extends B0.f {
    public static List M(Object[] objArr) {
        kotlin.jvm.internal.i.e(objArr, "<this>");
        List asList = Arrays.asList(objArr);
        kotlin.jvm.internal.i.d(asList, "asList(...)");
        return asList;
    }

    public static boolean N(long[] jArr, long j2) {
        int length = jArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                i2 = -1;
                break;
            }
            if (j2 == jArr[i2]) {
                break;
            }
            i2++;
        }
        return i2 >= 0;
    }

    public static void O(int i2, int i3, int i6, byte[] bArr, byte[] destination) {
        kotlin.jvm.internal.i.e(bArr, "<this>");
        kotlin.jvm.internal.i.e(destination, "destination");
        System.arraycopy(bArr, i3, destination, i2, i6 - i3);
    }

    public static void P(int i2, int i3, int i6, Object[] objArr, Object[] destination) {
        kotlin.jvm.internal.i.e(objArr, "<this>");
        kotlin.jvm.internal.i.e(destination, "destination");
        System.arraycopy(objArr, i3, destination, i2, i6 - i3);
    }

    public static byte[] Q(byte[] bArr, int i2, int i3) {
        kotlin.jvm.internal.i.e(bArr, "<this>");
        B0.f.m(i3, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i2, i3);
        kotlin.jvm.internal.i.d(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    public static Object[] R(int i2, int i3, Object[] objArr) {
        kotlin.jvm.internal.i.e(objArr, "<this>");
        B0.f.m(i3, objArr.length);
        Object[] copyOfRange = Arrays.copyOfRange(objArr, i2, i3);
        kotlin.jvm.internal.i.d(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    public static void S(int i2, int i3, Object[] objArr) {
        kotlin.jvm.internal.i.e(objArr, "<this>");
        Arrays.fill(objArr, i2, i3, (Object) null);
    }

    public static ArrayList T(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Object U(int i2, Object[] objArr) {
        kotlin.jvm.internal.i.e(objArr, "<this>");
        if (i2 < 0 || i2 >= objArr.length) {
            return null;
        }
        return objArr[i2];
    }

    public static String V(Object[] objArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i2, CharSequence truncated, InterfaceC1441l interfaceC1441l) {
        kotlin.jvm.internal.i.e(objArr, "<this>");
        kotlin.jvm.internal.i.e(separator, "separator");
        kotlin.jvm.internal.i.e(prefix, "prefix");
        kotlin.jvm.internal.i.e(postfix, "postfix");
        kotlin.jvm.internal.i.e(truncated, "truncated");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        int i3 = 0;
        for (Object obj : objArr) {
            i3++;
            if (i3 > 1) {
                sb.append(separator);
            }
            if (i2 >= 0 && i3 > i2) {
                break;
            }
            e5.g.d(sb, obj, interfaceC1441l);
        }
        if (i2 >= 0 && i3 > i2) {
            sb.append(truncated);
        }
        sb.append(postfix);
        return sb.toString();
    }

    public static String W(byte[] bArr, String str, String prefix, String postfix, InterfaceC1441l interfaceC1441l, int i2) {
        if ((i2 & 2) != 0) {
            prefix = "";
        }
        if ((i2 & 4) != 0) {
            postfix = "";
        }
        if ((i2 & 32) != 0) {
            interfaceC1441l = null;
        }
        kotlin.jvm.internal.i.e(bArr, "<this>");
        kotlin.jvm.internal.i.e(prefix, "prefix");
        kotlin.jvm.internal.i.e(postfix, "postfix");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) prefix);
        int i3 = 0;
        for (byte b6 : bArr) {
            i3++;
            if (i3 > 1) {
                sb.append((CharSequence) str);
            }
            if (interfaceC1441l != null) {
                sb.append((CharSequence) interfaceC1441l.invoke(Byte.valueOf(b6)));
            } else {
                sb.append((CharSequence) String.valueOf((int) b6));
            }
        }
        sb.append((CharSequence) postfix);
        return sb.toString();
    }

    public static /* synthetic */ String X(Object[] objArr, String str, C0789l5 c0789l5, int i2) {
        if ((i2 & 1) != 0) {
            str = ", ";
        }
        String str2 = str;
        if ((i2 & 32) != 0) {
            c0789l5 = null;
        }
        return V(objArr, str2, "", "", -1, "...", c0789l5);
    }

    public static final void Y(Object[] objArr, AbstractSet abstractSet) {
        kotlin.jvm.internal.i.e(objArr, "<this>");
        for (Object obj : objArr) {
            abstractSet.add(obj);
        }
    }

    public static List Z(int[] iArr) {
        kotlin.jvm.internal.i.e(iArr, "<this>");
        int length = iArr.length;
        if (length == 0) {
            return C0471p.f5750a;
        }
        if (length == 1) {
            return K1.b.W(Integer.valueOf(iArr[0]));
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i2 : iArr) {
            arrayList.add(Integer.valueOf(i2));
        }
        return arrayList;
    }

    public static List a0(Object[] objArr) {
        kotlin.jvm.internal.i.e(objArr, "<this>");
        int length = objArr.length;
        return length != 0 ? length != 1 ? new ArrayList(new C0462g(objArr, false)) : K1.b.W(objArr[0]) : C0471p.f5750a;
    }
}
