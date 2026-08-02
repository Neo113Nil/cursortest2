package H3;

import E.AbstractC0005f;
import G3.C0051b;
import G3.n;
import G3.p;
import G3.s;
import G3.y;
import G3.z;
import N3.C0079c;
import O3.d;
import O3.l;
import T3.g;
import T3.j;
import T3.v;
import a2.i;
import d3.e;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import w3.AbstractC1510g;
import w3.C1509f;
import w3.o;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f1103a;

    /* renamed from: b, reason: collision with root package name */
    public static final n f1104b = l.s(new String[0]);

    /* renamed from: c, reason: collision with root package name */
    public static final z f1105c;

    /* renamed from: d, reason: collision with root package name */
    public static final TimeZone f1106d;

    /* renamed from: e, reason: collision with root package name */
    public static final C1509f f1107e;

    /* renamed from: f, reason: collision with root package name */
    public static final String f1108f;

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0177, code lost:
    
        continue;
     */
    static {
        int i4;
        byte[] bArr = new byte[0];
        f1103a = bArr;
        g gVar = new g();
        gVar.u(0, bArr);
        f1105c = new z(0, gVar, 0);
        C0051b.c(bArr);
        j jVar = j.f2976d;
        j[] jVarArr = {i.l("efbbbf"), i.l("feff"), i.l("fffe"), i.l("0000ffff"), i.l("ffff0000")};
        ArrayList arrayList = new ArrayList(new e(jVarArr, false));
        if (arrayList.size() > 1) {
            Collections.sort(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(5);
        for (int i5 = 0; i5 < 5; i5++) {
            j jVar2 = jVarArr[i5];
            arrayList2.add(-1);
        }
        Integer[] numArr = (Integer[]) arrayList2.toArray(new Integer[0]);
        Object[] elements = Arrays.copyOf(numArr, numArr.length);
        kotlin.jvm.internal.i.e(elements, "elements");
        ArrayList arrayList3 = elements.length == 0 ? new ArrayList() : new ArrayList(new e(elements, true));
        int i6 = 0;
        int i7 = 0;
        while (i6 < 5) {
            j jVar3 = jVarArr[i6];
            int i8 = i7 + 1;
            int size = arrayList.size();
            int size2 = arrayList.size();
            if (size < 0) {
                throw new IllegalArgumentException(AbstractC0005f.k(size, "fromIndex (0) is greater than toIndex (", ")."));
            }
            if (size > size2) {
                throw new IndexOutOfBoundsException(AbstractC0005f.l("toIndex (", size, ") is greater than size (", size2, ")."));
            }
            int i9 = size - 1;
            int i10 = 0;
            while (true) {
                if (i10 > i9) {
                    i4 = -(i10 + 1);
                    break;
                }
                i4 = (i10 + i9) >>> 1;
                Comparable comparable = (Comparable) arrayList.get(i4);
                int compareTo = comparable == jVar3 ? 0 : comparable == null ? -1 : jVar3 == null ? 1 : comparable.compareTo(jVar3);
                if (compareTo < 0) {
                    i10 = i4 + 1;
                } else if (compareTo > 0) {
                    i9 = i4 - 1;
                }
            }
            arrayList3.set(i4, Integer.valueOf(i7));
            i6++;
            i7 = i8;
        }
        if (((j) arrayList.get(0)).a() <= 0) {
            throw new IllegalArgumentException("the empty byte string is not a supported option");
        }
        int i11 = 0;
        while (i11 < arrayList.size()) {
            j prefix = (j) arrayList.get(i11);
            int i12 = i11 + 1;
            int i13 = i12;
            while (i13 < arrayList.size()) {
                j jVar4 = (j) arrayList.get(i13);
                jVar4.getClass();
                kotlin.jvm.internal.i.e(prefix, "prefix");
                if (jVar4.f(prefix, prefix.a())) {
                    if (jVar4.a() == prefix.a()) {
                        throw new IllegalArgumentException(("duplicate option: " + jVar4).toString());
                    }
                    if (((Number) arrayList3.get(i13)).intValue() > ((Number) arrayList3.get(i11)).intValue()) {
                        arrayList.remove(i13);
                        arrayList3.remove(i13);
                    } else {
                        i13++;
                    }
                }
            }
            i11 = i12;
        }
        g gVar2 = new g();
        d.f(0L, gVar2, 0, arrayList, 0, arrayList.size(), arrayList3);
        int[] iArr = new int[(int) (gVar2.f2975b / 4)];
        int i14 = 0;
        while (!gVar2.b()) {
            iArr[i14] = gVar2.readInt();
            i14++;
        }
        Object[] copyOf = Arrays.copyOf(jVarArr, 5);
        kotlin.jvm.internal.i.d(copyOf, "copyOf(this, size)");
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        kotlin.jvm.internal.i.b(timeZone);
        f1106d = timeZone;
        f1107e = new C1509f("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        String m02 = AbstractC1510g.m0(s.class.getName(), "okhttp3.");
        if (o.V(m02, "Client")) {
            m02 = m02.substring(0, m02.length() - 6);
            kotlin.jvm.internal.i.d(m02, "substring(...)");
        }
        f1108f = m02;
    }

    public static final boolean a(p pVar, p other) {
        kotlin.jvm.internal.i.e(pVar, "<this>");
        kotlin.jvm.internal.i.e(other, "other");
        return kotlin.jvm.internal.i.a(pVar.f950d, other.f950d) && pVar.f951e == other.f951e && kotlin.jvm.internal.i.a(pVar.f947a, other.f947a);
    }

    public static final int b(long j4) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (j4 < 0) {
            throw new IllegalStateException(kotlin.jvm.internal.i.h(" < 0", "timeout").toString());
        }
        if (timeUnit == null) {
            throw new IllegalStateException("unit == null");
        }
        long millis = timeUnit.toMillis(j4);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException(kotlin.jvm.internal.i.h(" too large.", "timeout").toString());
        }
        if (millis != 0 || j4 <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException(kotlin.jvm.internal.i.h(" too small.", "timeout").toString());
    }

    public static final void c(Closeable closeable) {
        kotlin.jvm.internal.i.e(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e4) {
            throw e4;
        } catch (Exception unused) {
        }
    }

    public static final void d(Socket socket) {
        kotlin.jvm.internal.i.e(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e4) {
            throw e4;
        } catch (RuntimeException e5) {
            if (!kotlin.jvm.internal.i.a(e5.getMessage(), "bio == null")) {
                throw e5;
            }
        } catch (Exception unused) {
        }
    }

    public static final int e(int i4, int i5, String str, String str2) {
        while (i4 < i5) {
            int i6 = i4 + 1;
            if (AbstractC1510g.b0(str2, str.charAt(i4))) {
                return i4;
            }
            i4 = i6;
        }
        return i5;
    }

    public static final int f(String str, char c4, int i4, int i5) {
        while (i4 < i5) {
            int i6 = i4 + 1;
            if (str.charAt(i4) == c4) {
                return i4;
            }
            i4 = i6;
        }
        return i5;
    }

    public static final String g(String format, Object... objArr) {
        kotlin.jvm.internal.i.e(format, "format");
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, format, Arrays.copyOf(copyOf, copyOf.length));
    }

    public static final boolean h(String[] strArr, String[] strArr2, Comparator comparator) {
        kotlin.jvm.internal.i.e(strArr, "<this>");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            int length = strArr.length;
            int i4 = 0;
            while (i4 < length) {
                String str = strArr[i4];
                i4++;
                int i5 = 0;
                while (true) {
                    if (i5 < strArr2.length) {
                        int i6 = i5 + 1;
                        try {
                            if (comparator.compare(str, strArr2[i5]) == 0) {
                                return true;
                            }
                            i5 = i6;
                        } catch (ArrayIndexOutOfBoundsException e4) {
                            throw new NoSuchElementException(e4.getMessage());
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final long i(y yVar) {
        String b4 = yVar.f1038f.b("Content-Length");
        if (b4 == null) {
            return -1L;
        }
        try {
            return Long.parseLong(b4);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static final List j(Object... elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        Object[] objArr = (Object[]) elements.clone();
        List unmodifiableList = Collections.unmodifiableList(d3.j.W(Arrays.copyOf(objArr, objArr.length)));
        kotlin.jvm.internal.i.d(unmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return unmodifiableList;
    }

    public static final int k(String str) {
        int length = str.length();
        int i4 = 0;
        while (i4 < length) {
            int i5 = i4 + 1;
            char charAt = str.charAt(i4);
            if (kotlin.jvm.internal.i.f(charAt, 31) <= 0 || kotlin.jvm.internal.i.f(charAt, 127) >= 0) {
                return i4;
            }
            i4 = i5;
        }
        return -1;
    }

    public static final int l(int i4, int i5, String str) {
        while (i4 < i5) {
            int i6 = i4 + 1;
            char charAt = str.charAt(i4);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i4;
            }
            i4 = i6;
        }
        return i5;
    }

    public static final int m(int i4, int i5, String str) {
        int i6 = i5 - 1;
        if (i4 <= i6) {
            while (true) {
                int i7 = i6 - 1;
                char charAt = str.charAt(i6);
                if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                    return i6 + 1;
                }
                if (i6 == i4) {
                    break;
                }
                i6 = i7;
            }
        }
        return i4;
    }

    public static final String[] n(String[] strArr, String[] other, Comparator comparator) {
        kotlin.jvm.internal.i.e(other, "other");
        ArrayList arrayList = new ArrayList();
        int length = strArr.length;
        int i4 = 0;
        while (i4 < length) {
            String str = strArr[i4];
            i4++;
            int length2 = other.length;
            int i5 = 0;
            while (true) {
                if (i5 < length2) {
                    String str2 = other[i5];
                    i5++;
                    if (comparator.compare(str, str2) == 0) {
                        arrayList.add(str);
                        break;
                    }
                }
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    public static final boolean o(String name) {
        kotlin.jvm.internal.i.e(name, "name");
        return name.equalsIgnoreCase("Authorization") || name.equalsIgnoreCase("Cookie") || name.equalsIgnoreCase("Proxy-Authorization") || name.equalsIgnoreCase("Set-Cookie");
    }

    public static final int p(char c4) {
        if ('0' <= c4 && c4 < ':') {
            return c4 - '0';
        }
        if ('a' <= c4 && c4 < 'g') {
            return c4 - 'W';
        }
        if ('A' > c4 || c4 >= 'G') {
            return -1;
        }
        return c4 - '7';
    }

    public static final int q(T3.i iVar) {
        kotlin.jvm.internal.i.e(iVar, "<this>");
        return (iVar.readByte() & 255) | ((iVar.readByte() & 255) << 16) | ((iVar.readByte() & 255) << 8);
    }

    public static final boolean r(v vVar, int i4) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        kotlin.jvm.internal.i.e(timeUnit, "timeUnit");
        long nanoTime = System.nanoTime();
        long c4 = vVar.d().e() ? vVar.d().c() - nanoTime : Long.MAX_VALUE;
        vVar.d().d(Math.min(c4, timeUnit.toNanos(i4)) + nanoTime);
        try {
            g gVar = new g();
            while (vVar.j(gVar, 8192L) != -1) {
                gVar.skip(gVar.f2975b);
            }
            if (c4 == Long.MAX_VALUE) {
                vVar.d().a();
                return true;
            }
            vVar.d().d(nanoTime + c4);
            return true;
        } catch (InterruptedIOException unused) {
            if (c4 == Long.MAX_VALUE) {
                vVar.d().a();
                return false;
            }
            vVar.d().d(nanoTime + c4);
            return false;
        } catch (Throwable th) {
            if (c4 == Long.MAX_VALUE) {
                vVar.d().a();
            } else {
                vVar.d().d(nanoTime + c4);
            }
            throw th;
        }
    }

    public static final n s(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0079c c0079c = (C0079c) it.next();
            j jVar = c0079c.f1834a;
            j jVar2 = c0079c.f1835b;
            String h2 = jVar.h();
            String h4 = jVar2.h();
            arrayList.add(h2);
            arrayList.add(AbstractC1510g.r0(h4).toString());
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return new n((String[]) array);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    public static final String t(p pVar, boolean z) {
        kotlin.jvm.internal.i.e(pVar, "<this>");
        int i4 = pVar.f951e;
        String str = pVar.f950d;
        if (AbstractC1510g.c0(str, StringUtils.PROCESS_POSTFIX_DELIMITER)) {
            str = "[" + str + ']';
        }
        if (!z) {
            String scheme = pVar.f947a;
            kotlin.jvm.internal.i.e(scheme, "scheme");
            if (i4 == (scheme.equals("http") ? 80 : scheme.equals("https") ? 443 : -1)) {
                return str;
            }
        }
        return str + ':' + i4;
    }

    public static final List u(List list) {
        kotlin.jvm.internal.i.e(list, "<this>");
        List unmodifiableList = Collections.unmodifiableList(d3.i.o0(list));
        kotlin.jvm.internal.i.d(unmodifiableList, "unmodifiableList(toMutableList())");
        return unmodifiableList;
    }

    public static final int v(int i4, String str) {
        Long valueOf;
        if (str == null) {
            valueOf = null;
        } else {
            try {
                valueOf = Long.valueOf(Long.parseLong(str));
            } catch (NumberFormatException unused) {
                return i4;
            }
        }
        if (valueOf == null) {
            return i4;
        }
        long longValue = valueOf.longValue();
        if (longValue > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (longValue < 0) {
            return 0;
        }
        return (int) longValue;
    }

    public static final String w(int i4, int i5, String str) {
        int l4 = l(i4, i5, str);
        String substring = str.substring(l4, m(l4, i5, str));
        kotlin.jvm.internal.i.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final void x(IOException iOException, List list) {
        kotlin.jvm.internal.i.e(iOException, "<this>");
        if (list.size() > 1) {
            System.out.println(list);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d.c(iOException, (Exception) it.next());
        }
    }
}
