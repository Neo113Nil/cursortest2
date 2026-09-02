package Y5;

import F5.j;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import l5.C0503g;
import n6.f;
import n6.h;
import n6.i;
import y1.C0760d;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f3099a = new byte[0];

    /* JADX WARN: Code restructure failed: missing block: B:71:0x014e, code lost:
    
        continue;
     */
    static {
        int i7;
        i iVar = i.f5525i;
        i[] iVarArr = {C0760d.c("efbbbf"), C0760d.c("feff"), C0760d.c("fffe0000"), C0760d.c("fffe"), C0760d.c("0000feff")};
        ArrayList arrayList = new ArrayList(new C0503g(iVarArr, false));
        if (arrayList.size() > 1) {
            Collections.sort(arrayList);
        }
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i8 = 0; i8 < size; i8++) {
            arrayList2.add(-1);
        }
        int i9 = 0;
        int i10 = 0;
        while (i9 < 5) {
            i iVar2 = iVarArr[i9];
            int i11 = i10 + 1;
            int size2 = arrayList.size();
            int size3 = arrayList.size();
            if (size2 < 0) {
                throw new IllegalArgumentException(C1.c.g("fromIndex (0) is greater than toIndex (", size2, ")."));
            }
            if (size2 > size3) {
                throw new IndexOutOfBoundsException("toIndex (" + size2 + ") is greater than size (" + size3 + ").");
            }
            int i12 = size2 - 1;
            int i13 = 0;
            while (true) {
                if (i13 > i12) {
                    i7 = -(i13 + 1);
                    break;
                }
                i7 = (i13 + i12) >>> 1;
                Comparable comparable = (Comparable) arrayList.get(i7);
                int compareTo = comparable == iVar2 ? 0 : comparable == null ? -1 : iVar2 == null ? 1 : comparable.compareTo(iVar2);
                if (compareTo < 0) {
                    i13 = i7 + 1;
                } else if (compareTo > 0) {
                    i12 = i7 - 1;
                }
            }
            arrayList2.set(i7, Integer.valueOf(i10));
            i9++;
            i10 = i11;
        }
        if (((i) arrayList.get(0)).a() <= 0) {
            throw new IllegalArgumentException("the empty byte string is not a supported option");
        }
        int i14 = 0;
        while (i14 < arrayList.size()) {
            i prefix = (i) arrayList.get(i14);
            int i15 = i14 + 1;
            int i16 = i15;
            while (i16 < arrayList.size()) {
                i iVar3 = (i) arrayList.get(i16);
                iVar3.getClass();
                kotlin.jvm.internal.i.e(prefix, "prefix");
                if (iVar3.f(prefix, prefix.a())) {
                    if (iVar3.a() == prefix.a()) {
                        throw new IllegalArgumentException(("duplicate option: " + iVar3).toString());
                    }
                    if (((Number) arrayList2.get(i16)).intValue() > ((Number) arrayList2.get(i14)).intValue()) {
                        arrayList.remove(i16);
                        ((Number) arrayList2.remove(i16)).intValue();
                    } else {
                        i16++;
                    }
                }
            }
            i14 = i15;
        }
        f fVar = new f();
        n6.b.c(0L, fVar, 0, arrayList, 0, arrayList.size(), arrayList2);
        int i17 = (int) (fVar.f5524g / 4);
        int[] iArr = new int[i17];
        for (int i18 = 0; i18 < i17; i18++) {
            iArr[i18] = fVar.readInt();
        }
        Object[] copyOf = Arrays.copyOf(iVarArr, 5);
        kotlin.jvm.internal.i.d(copyOf, "copyOf(...)");
    }

    public static final void a(Closeable closeable) {
        kotlin.jvm.internal.i.e(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e4) {
            throw e4;
        } catch (Exception unused) {
        }
    }

    public static final int b(int i7, int i8, String str, String str2) {
        kotlin.jvm.internal.i.e(str, "<this>");
        while (i7 < i8) {
            if (j.M(str2, str.charAt(i7))) {
                return i7;
            }
            i7++;
        }
        return i8;
    }

    public static final int c(String str, char c7, int i7, int i8) {
        kotlin.jvm.internal.i.e(str, "<this>");
        while (i7 < i8) {
            if (str.charAt(i7) == c7) {
                return i7;
            }
            i7++;
        }
        return i8;
    }

    public static final boolean d(String[] strArr, String[] strArr2, Comparator comparator) {
        kotlin.jvm.internal.i.e(strArr, "<this>");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final int e(String str) {
        int length = str.length();
        for (int i7 = 0; i7 < length; i7++) {
            char charAt = str.charAt(i7);
            if (kotlin.jvm.internal.i.g(charAt, 31) <= 0 || kotlin.jvm.internal.i.g(charAt, 127) >= 0) {
                return i7;
            }
        }
        return -1;
    }

    public static final int f(String str, int i7, int i8) {
        kotlin.jvm.internal.i.e(str, "<this>");
        while (i7 < i8) {
            char charAt = str.charAt(i7);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i7;
            }
            i7++;
        }
        return i8;
    }

    public static final int g(String str, int i7, int i8) {
        kotlin.jvm.internal.i.e(str, "<this>");
        int i9 = i8 - 1;
        if (i7 <= i9) {
            while (true) {
                char charAt = str.charAt(i9);
                if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                    return i9 + 1;
                }
                if (i9 == i7) {
                    break;
                }
                i9--;
            }
        }
        return i7;
    }

    public static final String[] h(String[] strArr, String[] other, Comparator comparator) {
        kotlin.jvm.internal.i.e(strArr, "<this>");
        kotlin.jvm.internal.i.e(other, "other");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = other.length;
            int i7 = 0;
            while (true) {
                if (i7 >= length) {
                    break;
                }
                if (comparator.compare(str, other[i7]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i7++;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final boolean i(String name) {
        kotlin.jvm.internal.i.e(name, "name");
        return name.equalsIgnoreCase("Authorization") || name.equalsIgnoreCase("Cookie") || name.equalsIgnoreCase("Proxy-Authorization") || name.equalsIgnoreCase("Set-Cookie");
    }

    public static final int j(char c7) {
        if ('0' <= c7 && c7 < ':') {
            return c7 - '0';
        }
        if ('a' <= c7 && c7 < 'g') {
            return c7 - 'W';
        }
        if ('A' > c7 || c7 >= 'G') {
            return -1;
        }
        return c7 - '7';
    }

    public static final int k(h hVar) {
        kotlin.jvm.internal.i.e(hVar, "<this>");
        return (hVar.readByte() & 255) | ((hVar.readByte() & 255) << 16) | ((hVar.readByte() & 255) << 8);
    }

    public static final int l(String str, int i7) {
        if (str != null) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong > 2147483647L) {
                    return Integer.MAX_VALUE;
                }
                if (parseLong < 0) {
                    return 0;
                }
                return (int) parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        return i7;
    }

    public static final String m(String str, int i7, int i8) {
        int f7 = f(str, i7, i8);
        String substring = str.substring(f7, g(str, f7, i8));
        kotlin.jvm.internal.i.d(substring, "substring(...)");
        return substring;
    }
}
