package E6;

import C4.p;
import T6.f;
import T6.i;
import T6.n;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import kotlin.collections.C0631j;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import q1.h;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f709a = new byte[0];

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0163, code lost:
    
        continue;
     */
    static {
        int i2;
        int i5 = n.f2634e;
        i iVar = i.f2618l;
        i[] byteStrings = {h.k("efbbbf"), h.k("feff"), h.k("fffe0000"), h.k("fffe"), h.k("0000feff")};
        Intrinsics.checkNotNullParameter(byteStrings, "byteStrings");
        Intrinsics.checkNotNullParameter(byteStrings, "<this>");
        Intrinsics.checkNotNullParameter(byteStrings, "<this>");
        ArrayList arrayList = new ArrayList(new C0631j(byteStrings, false));
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        if (arrayList.size() > 1) {
            Collections.sort(arrayList);
        }
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i7 = 0; i7 < size; i7++) {
            arrayList2.add(-1);
        }
        int i8 = 0;
        int i9 = 0;
        while (i8 < 5) {
            i iVar2 = byteStrings[i8];
            int i10 = i9 + 1;
            int size2 = arrayList.size();
            Intrinsics.checkNotNullParameter(arrayList, "<this>");
            int size3 = arrayList.size();
            if (size2 < 0) {
                throw new IllegalArgumentException(p.h(size2, "fromIndex (0) is greater than toIndex (", ")."));
            }
            if (size2 > size3) {
                throw new IndexOutOfBoundsException("toIndex (" + size2 + ") is greater than size (" + size3 + ").");
            }
            int i11 = size2 - 1;
            int i12 = 0;
            while (true) {
                if (i12 > i11) {
                    i2 = -(i12 + 1);
                    break;
                }
                i2 = (i12 + i11) >>> 1;
                Comparable comparable = (Comparable) arrayList.get(i2);
                int compareTo = comparable == iVar2 ? 0 : comparable == null ? -1 : iVar2 == null ? 1 : comparable.compareTo(iVar2);
                if (compareTo < 0) {
                    i12 = i2 + 1;
                } else if (compareTo > 0) {
                    i11 = i2 - 1;
                }
            }
            arrayList2.set(i2, Integer.valueOf(i9));
            i8++;
            i9 = i10;
        }
        if (((i) arrayList.get(0)).a() <= 0) {
            throw new IllegalArgumentException("the empty byte string is not a supported option");
        }
        int i13 = 0;
        while (i13 < arrayList.size()) {
            i prefix = (i) arrayList.get(i13);
            int i14 = i13 + 1;
            int i15 = i14;
            while (i15 < arrayList.size()) {
                i iVar3 = (i) arrayList.get(i15);
                iVar3.getClass();
                Intrinsics.checkNotNullParameter(prefix, "prefix");
                if (iVar3.f(prefix, prefix.a())) {
                    if (iVar3.a() == prefix.a()) {
                        throw new IllegalArgumentException(("duplicate option: " + iVar3).toString());
                    }
                    if (((Number) arrayList2.get(i15)).intValue() > ((Number) arrayList2.get(i13)).intValue()) {
                        arrayList.remove(i15);
                        ((Number) arrayList2.remove(i15)).intValue();
                    } else {
                        i15++;
                    }
                }
            }
            i13 = i14;
        }
        f fVar = new f();
        T6.b.c(0L, fVar, 0, arrayList, 0, arrayList.size(), arrayList2);
        int i16 = (int) (fVar.f2617e / 4);
        int[] iArr = new int[i16];
        for (int i17 = 0; i17 < i16; i17++) {
            iArr[i17] = fVar.readInt();
        }
        Object[] copyOf = Arrays.copyOf(byteStrings, 5);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
    }

    public static final void a(Closeable closeable) {
        Intrinsics.checkNotNullParameter(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e7) {
            throw e7;
        } catch (Exception unused) {
        }
    }

    public static final int b(String str, char c7, int i2, int i5) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        while (i2 < i5) {
            if (str.charAt(i2) == c7) {
                return i2;
            }
            i2++;
        }
        return i5;
    }

    public static final int c(String str, String delimiters, int i2, int i5) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        while (i2 < i5) {
            if (StringsKt.v(delimiters, str.charAt(i2))) {
                return i2;
            }
            i2++;
        }
        return i5;
    }

    public static final boolean d(String[] strArr, String[] strArr2, Comparator comparator) {
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
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
        Intrinsics.checkNotNullParameter(str, "<this>");
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (Intrinsics.d(charAt, 31) <= 0 || Intrinsics.d(charAt, 127) >= 0) {
                return i2;
            }
        }
        return -1;
    }

    public static final int f(String str, int i2, int i5) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        while (i2 < i5) {
            char charAt = str.charAt(i2);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i2;
            }
            i2++;
        }
        return i5;
    }

    public static final int g(String str, int i2, int i5) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int i7 = i5 - 1;
        if (i2 <= i7) {
            while (true) {
                char charAt = str.charAt(i7);
                if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                    return i7 + 1;
                }
                if (i7 == i2) {
                    break;
                }
                i7--;
            }
        }
        return i2;
    }

    public static final String[] h(String[] strArr, String[] other, Comparator comparator) {
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = other.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                if (comparator.compare(str, other[i2]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i2++;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final boolean i(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return kotlin.text.p.g(name, "Authorization") || kotlin.text.p.g(name, "Cookie") || kotlin.text.p.g(name, "Proxy-Authorization") || kotlin.text.p.g(name, "Set-Cookie");
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

    public static final int k(T6.h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        return (hVar.readByte() & 255) | ((hVar.readByte() & 255) << 16) | ((hVar.readByte() & 255) << 8);
    }

    public static final int l(int i2, String str) {
        if (str == null) {
            return i2;
        }
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
            return i2;
        }
    }

    public static final String m(String str, int i2, int i5) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int f7 = f(str, i2, i5);
        String substring = str.substring(f7, g(str, f7, i5));
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }
}
