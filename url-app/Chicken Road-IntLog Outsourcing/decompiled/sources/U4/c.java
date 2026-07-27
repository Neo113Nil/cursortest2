package U4;

import B0.o;
import B4.k;
import g4.C0462g;
import j5.f;
import j5.i;
import j5.n;
import j5.q;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import l1.j;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f3176a = new byte[0];

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0149, code lost:
    
        continue;
     */
    static {
        int i2;
        i iVar = i.f10496d;
        i[] iVarArr = {j.d("efbbbf"), j.d("feff"), j.d("fffe0000"), j.d("fffe"), j.d("0000feff")};
        ArrayList arrayList = new ArrayList(new C0462g(iVarArr, false));
        if (arrayList.size() > 1) {
            Collections.sort(arrayList);
        }
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            arrayList2.add(-1);
        }
        int i6 = 0;
        int i7 = 0;
        while (i6 < 5) {
            i iVar2 = iVarArr[i6];
            int i8 = i7 + 1;
            int size2 = arrayList.size();
            int size3 = arrayList.size();
            if (size2 < 0) {
                throw new IllegalArgumentException(o.g(size2, "fromIndex (0) is greater than toIndex (", ")."));
            }
            if (size2 > size3) {
                throw new IndexOutOfBoundsException("toIndex (" + size2 + ") is greater than size (" + size3 + ").");
            }
            int i9 = size2 - 1;
            int i10 = 0;
            while (true) {
                if (i10 > i9) {
                    i2 = -(i10 + 1);
                    break;
                }
                i2 = (i10 + i9) >>> 1;
                Comparable comparable = (Comparable) arrayList.get(i2);
                int compareTo = comparable == iVar2 ? 0 : comparable == null ? -1 : iVar2 == null ? 1 : comparable.compareTo(iVar2);
                if (compareTo < 0) {
                    i10 = i2 + 1;
                } else if (compareTo > 0) {
                    i9 = i2 - 1;
                }
            }
            arrayList2.set(i2, Integer.valueOf(i7));
            i6++;
            i7 = i8;
        }
        if (((i) arrayList.get(0)).a() <= 0) {
            throw new IllegalArgumentException("the empty byte string is not a supported option");
        }
        int i11 = 0;
        while (i11 < arrayList.size()) {
            i prefix = (i) arrayList.get(i11);
            int i12 = i11 + 1;
            int i13 = i12;
            while (i13 < arrayList.size()) {
                i iVar3 = (i) arrayList.get(i13);
                iVar3.getClass();
                kotlin.jvm.internal.i.e(prefix, "prefix");
                if (iVar3.f(prefix, prefix.a())) {
                    if (iVar3.a() == prefix.a()) {
                        throw new IllegalArgumentException(("duplicate option: " + iVar3).toString());
                    }
                    if (((Number) arrayList2.get(i13)).intValue() > ((Number) arrayList2.get(i11)).intValue()) {
                        arrayList.remove(i13);
                        ((Number) arrayList2.remove(i13)).intValue();
                    } else {
                        i13++;
                    }
                }
            }
            i11 = i12;
        }
        f fVar = new f();
        j5.b.c(0L, fVar, 0, arrayList, 0, arrayList.size(), arrayList2);
        int i14 = (int) (fVar.f10495b / 4);
        int[] iArr = new int[i14];
        for (int i15 = 0; i15 < i14; i15++) {
            iArr[i15] = fVar.q();
        }
        Object[] copyOf = Arrays.copyOf(iVarArr, 5);
        kotlin.jvm.internal.i.d(copyOf, "copyOf(...)");
        new n((i[]) copyOf);
    }

    public static final void a(long j2, long j6, long j7) {
        if ((j6 | j7) < 0 || j6 > j2 || j2 - j6 < j7) {
            throw new ArrayIndexOutOfBoundsException("length=" + j2 + ", offset=" + j6 + ", count=" + j6);
        }
    }

    public static final void b(Closeable closeable) {
        kotlin.jvm.internal.i.e(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e3) {
            throw e3;
        } catch (Exception unused) {
        }
    }

    public static final int c(String str, char c2, int i2, int i3) {
        kotlin.jvm.internal.i.e(str, "<this>");
        while (i2 < i3) {
            if (str.charAt(i2) == c2) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static final int d(String str, int i2, int i3, String str2) {
        kotlin.jvm.internal.i.e(str, "<this>");
        while (i2 < i3) {
            if (k.S(str2, str.charAt(i2))) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static final boolean e(String[] strArr, String[] strArr2, Comparator comparator) {
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

    public static final int f(String str) {
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (kotlin.jvm.internal.i.g(charAt, 31) <= 0 || kotlin.jvm.internal.i.g(charAt, 127) >= 0) {
                return i2;
            }
        }
        return -1;
    }

    public static final int g(String str, int i2, int i3) {
        kotlin.jvm.internal.i.e(str, "<this>");
        while (i2 < i3) {
            char charAt = str.charAt(i2);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static final int h(String str, int i2, int i3) {
        kotlin.jvm.internal.i.e(str, "<this>");
        int i6 = i3 - 1;
        if (i2 <= i6) {
            while (true) {
                char charAt = str.charAt(i6);
                if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                    return i6 + 1;
                }
                if (i6 == i2) {
                    break;
                }
                i6--;
            }
        }
        return i2;
    }

    public static final String[] i(String[] strArr, String[] other, Comparator comparator) {
        kotlin.jvm.internal.i.e(strArr, "<this>");
        kotlin.jvm.internal.i.e(other, "other");
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

    public static final boolean j(String name) {
        kotlin.jvm.internal.i.e(name, "name");
        return name.equalsIgnoreCase("Authorization") || name.equalsIgnoreCase("Cookie") || name.equalsIgnoreCase("Proxy-Authorization") || name.equalsIgnoreCase("Set-Cookie");
    }

    public static final int k(char c2) {
        if ('0' <= c2 && c2 < ':') {
            return c2 - '0';
        }
        if ('a' <= c2 && c2 < 'g') {
            return c2 - 'W';
        }
        if ('A' > c2 || c2 >= 'G') {
            return -1;
        }
        return c2 - '7';
    }

    public static final int l(q qVar) {
        kotlin.jvm.internal.i.e(qVar, "<this>");
        return (qVar.c() & 255) | ((qVar.c() & 255) << 16) | ((qVar.c() & 255) << 8);
    }

    public static final int m(int i2, String str) {
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

    public static final String n(String str, int i2, int i3) {
        int g6 = g(str, i2, i3);
        String substring = str.substring(g6, h(str, g6, i3));
        kotlin.jvm.internal.i.d(substring, "substring(...)");
        return substring;
    }
}
