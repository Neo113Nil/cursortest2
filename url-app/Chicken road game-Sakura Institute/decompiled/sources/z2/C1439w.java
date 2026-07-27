package z2;

import A1.v0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: z2.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1439w extends C1436t {
    public static Set A(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        int length = objArr.length;
        if (length == 0) {
            return C1407K.f11933d;
        }
        if (length == 1) {
            Set singleton = Collections.singleton(objArr[0]);
            Intrinsics.checkNotNullExpressionValue(singleton, "singleton(...)");
            return singleton;
        }
        LinkedHashSet destination = new LinkedHashSet(C1411O.a(objArr.length));
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (Object obj : objArr) {
            destination.add(obj);
        }
        return destination;
    }

    public static C1408L B(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        return new C1408L(new C1438v(objArr));
    }

    public static boolean o(byte b4, byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        int length = bArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                i2 = -1;
                break;
            }
            if (b4 == bArr[i2]) {
                break;
            }
            i2++;
        }
        return i2 >= 0;
    }

    public static boolean p(int[] iArr, int i2) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int length = iArr.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                i4 = -1;
                break;
            }
            if (i2 == iArr[i4]) {
                break;
            }
            i4++;
        }
        return i4 >= 0;
    }

    public static boolean q(long[] jArr, long j4) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        int length = jArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                i2 = -1;
                break;
            }
            if (j4 == jArr[i2]) {
                break;
            }
            i2++;
        }
        return i2 >= 0;
    }

    public static boolean r(Object[] objArr, Object obj) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        return v(objArr, obj) >= 0;
    }

    public static boolean s(short[] sArr, short s4) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        int length = sArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                i2 = -1;
                break;
            }
            if (s4 == sArr[i2]) {
                break;
            }
            i2++;
        }
        return i2 >= 0;
    }

    public static ArrayList t(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        ArrayList destination = new ArrayList();
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (Object obj : objArr) {
            if (obj != null) {
                destination.add(obj);
            }
        }
        return destination;
    }

    public static int u(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        return objArr.length - 1;
    }

    public static int v(Object[] objArr, Object obj) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        int i2 = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i2 < length) {
                if (objArr[i2] == null) {
                    return i2;
                }
                i2++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i2 < length2) {
            if (obj.equals(objArr[i2])) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static String w(byte[] bArr, String separator, String prefix, String postfix, v0 v0Var, int i2) {
        if ((i2 & 2) != 0) {
            prefix = "";
        }
        if ((i2 & 4) != 0) {
            postfix = "";
        }
        if ((i2 & 32) != 0) {
            v0Var = null;
        }
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter("...", "truncated");
        StringBuilder buffer = new StringBuilder();
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter("...", "truncated");
        buffer.append((CharSequence) prefix);
        int i4 = 0;
        for (byte b4 : bArr) {
            i4++;
            if (i4 > 1) {
                buffer.append((CharSequence) separator);
            }
            if (v0Var != null) {
                buffer.append((CharSequence) v0Var.invoke(Byte.valueOf(b4)));
            } else {
                buffer.append((CharSequence) String.valueOf((int) b4));
            }
        }
        buffer.append((CharSequence) postfix);
        String sb = buffer.toString();
        Intrinsics.checkNotNullExpressionValue(sb, "toString(...)");
        return sb;
    }

    public static String x(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(", ", "separator");
        Intrinsics.checkNotNullParameter("", "prefix");
        Intrinsics.checkNotNullParameter("", "postfix");
        Intrinsics.checkNotNullParameter("...", "truncated");
        StringBuilder buffer = new StringBuilder();
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(", ", "separator");
        Intrinsics.checkNotNullParameter("", "prefix");
        Intrinsics.checkNotNullParameter("", "postfix");
        Intrinsics.checkNotNullParameter("...", "truncated");
        buffer.append((CharSequence) "");
        int i2 = 0;
        for (Object obj : objArr) {
            i2++;
            if (i2 > 1) {
                buffer.append((CharSequence) ", ");
            }
            kotlin.text.l.a(buffer, obj, null);
        }
        buffer.append((CharSequence) "");
        String sb = buffer.toString();
        Intrinsics.checkNotNullExpressionValue(sb, "toString(...)");
        return sb;
    }

    public static char y(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static List z(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        int length = objArr.length;
        if (length == 0) {
            return C1405I.f11931d;
        }
        if (length == 1) {
            return C1440x.a(objArr[0]);
        }
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        return new ArrayList(new C1432p(objArr, false));
    }
}
