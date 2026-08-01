package t1;

import A1.m;
import F1.f;
import F1.i;
import F1.n;
import F1.p;
import F1.v;
import K0.e;
import W0.d;
import W0.h;
import h.AbstractC0112a;
import h1.g;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
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
import s1.j;
import s1.l;
import s1.o;
import s1.r;
import s1.s;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f3898a;

    /* renamed from: b, reason: collision with root package name */
    public static final j f3899b = AbstractC0112a.n(new String[0]);

    /* renamed from: c, reason: collision with root package name */
    public static final s f3900c;
    public static final n d;

    /* renamed from: e, reason: collision with root package name */
    public static final TimeZone f3901e;

    /* renamed from: f, reason: collision with root package name */
    public static final g f3902f;

    /* renamed from: g, reason: collision with root package name */
    public static final String f3903g;

    /* JADX WARN: Code restructure failed: missing block: B:79:0x019d, code lost:
    
        continue;
     */
    static {
        int i;
        byte[] bArr = new byte[0];
        f3898a = bArr;
        f fVar = new f();
        fVar.r(0, 0, bArr);
        long j2 = 0;
        f3900c = new s(null, j2, fVar, 0);
        if (j2 < 0 || j2 > j2 || 0 < j2) {
            throw new ArrayIndexOutOfBoundsException();
        }
        i iVar = i.d;
        i[] iVarArr = {e.f("efbbbf"), e.f("feff"), e.f("fffe"), e.f("0000ffff"), e.f("ffff0000")};
        ArrayList arrayList = new ArrayList(new d(iVarArr, false));
        if (arrayList.size() > 1) {
            Collections.sort(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(5);
        for (int i2 = 0; i2 < 5; i2++) {
            i iVar2 = iVarArr[i2];
            arrayList2.add(-1);
        }
        Integer[] numArr = (Integer[]) arrayList2.toArray(new Integer[0]);
        Object[] copyOf = Arrays.copyOf(numArr, numArr.length);
        h1.d.e(copyOf, "elements");
        ArrayList arrayList3 = copyOf.length == 0 ? new ArrayList() : new ArrayList(new d(copyOf, true));
        int i3 = 0;
        int i4 = 0;
        while (i3 < 5) {
            i iVar3 = iVarArr[i3];
            int i5 = i4 + 1;
            int size = arrayList.size();
            int size2 = arrayList.size();
            if (size < 0) {
                throw new IllegalArgumentException("fromIndex (0) is greater than toIndex (" + size + ").");
            }
            if (size > size2) {
                throw new IndexOutOfBoundsException("toIndex (" + size + ") is greater than size (" + size2 + ").");
            }
            int i6 = size - 1;
            int i7 = 0;
            while (true) {
                if (i7 > i6) {
                    i = -(i7 + 1);
                    break;
                }
                i = (i7 + i6) >>> 1;
                Comparable comparable = (Comparable) arrayList.get(i);
                int compareTo = comparable == iVar3 ? 0 : comparable == null ? -1 : iVar3 == null ? 1 : comparable.compareTo(iVar3);
                if (compareTo < 0) {
                    i7 = i + 1;
                } else if (compareTo > 0) {
                    i6 = i - 1;
                }
            }
            arrayList3.set(i, Integer.valueOf(i4));
            i3++;
            i4 = i5;
        }
        if (((i) arrayList.get(0)).a() <= 0) {
            throw new IllegalArgumentException("the empty byte string is not a supported option");
        }
        int i8 = 0;
        while (i8 < arrayList.size()) {
            i iVar4 = (i) arrayList.get(i8);
            int i9 = i8 + 1;
            int i10 = i9;
            while (i10 < arrayList.size()) {
                i iVar5 = (i) arrayList.get(i10);
                iVar5.getClass();
                h1.d.e(iVar4, "prefix");
                if (iVar5.f(iVar4, iVar4.a())) {
                    if (iVar5.a() == iVar4.a()) {
                        throw new IllegalArgumentException(("duplicate option: " + iVar5).toString());
                    }
                    if (((Number) arrayList3.get(i10)).intValue() > ((Number) arrayList3.get(i8)).intValue()) {
                        arrayList.remove(i10);
                        arrayList3.remove(i10);
                    } else {
                        i10++;
                    }
                }
            }
            i8 = i9;
        }
        f fVar2 = new f();
        m.e(0L, fVar2, 0, arrayList, 0, arrayList.size(), arrayList3);
        int[] iArr = new int[(int) (fVar2.f247b / 4)];
        int i11 = 0;
        while (!fVar2.g()) {
            iArr[i11] = fVar2.l();
            i11++;
        }
        Object[] copyOf2 = Arrays.copyOf(iVarArr, 5);
        h1.d.d(copyOf2, "copyOf(this, size)");
        d = new n((i[]) copyOf2, iArr);
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        h1.d.b(timeZone);
        f3901e = timeZone;
        f3902f = new g(1);
        String K2 = o1.d.K(o.class.getName(), "okhttp3.");
        if (K2.endsWith("Client")) {
            K2 = K2.substring(0, K2.length() - 6);
            h1.d.d(K2, "substring(...)");
        }
        f3903g = K2;
    }

    public static final boolean a(l lVar, l lVar2) {
        h1.d.e(lVar, "<this>");
        h1.d.e(lVar2, "other");
        return h1.d.a(lVar.d, lVar2.d) && lVar.f3652e == lVar2.f3652e && h1.d.a(lVar.f3649a, lVar2.f3649a);
    }

    public static final void b(Closeable closeable) {
        h1.d.e(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception unused) {
        }
    }

    public static final void c(Socket socket) {
        h1.d.e(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e2) {
            throw e2;
        } catch (RuntimeException e3) {
            if (!h1.d.a(e3.getMessage(), "bio == null")) {
                throw e3;
            }
        } catch (Exception unused) {
        }
    }

    public static final int d(String str, char c2, int i, int i2) {
        while (i < i2) {
            if (str.charAt(i) == c2) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int e(String str, String str2, int i, int i2) {
        while (i < i2) {
            if (o1.d.z(str2, str.charAt(i))) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final boolean f(v vVar, TimeUnit timeUnit) {
        h1.d.e(timeUnit, "timeUnit");
        try {
            return s(vVar, 100, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final String g(String str, Object... objArr) {
        h1.d.e(str, "format");
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0038, code lost:
    
        r2 = r2 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean h(String[] strArr, String[] strArr2, Comparator comparator) {
        h1.d.e(strArr, "<this>");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                String str = strArr[i];
                int i2 = 0;
                while (true) {
                    if (i2 < strArr2.length) {
                        int i3 = i2 + 1;
                        try {
                            if (comparator.compare(str, strArr2[i2]) == 0) {
                                return true;
                            }
                            i2 = i3;
                        } catch (ArrayIndexOutOfBoundsException e2) {
                            throw new NoSuchElementException(e2.getMessage());
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final long i(r rVar) {
        String a2 = rVar.f3706f.a("Content-Length");
        if (a2 == null) {
            return -1L;
        }
        try {
            return Long.parseLong(a2);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static final List j(Object... objArr) {
        h1.d.e(objArr, "elements");
        Object[] objArr2 = (Object[]) objArr.clone();
        List unmodifiableList = Collections.unmodifiableList(h.n0(Arrays.copyOf(objArr2, objArr2.length)));
        h1.d.d(unmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return unmodifiableList;
    }

    public static final int k(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (h1.d.f(charAt, 31) <= 0 || h1.d.f(charAt, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }

    public static final int l(String str, int i, int i2) {
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int m(String str, int i, int i2) {
        int i3 = i2 - 1;
        if (i <= i3) {
            while (true) {
                char charAt = str.charAt(i3);
                if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                    return i3 + 1;
                }
                if (i3 == i) {
                    break;
                }
                i3--;
            }
        }
        return i;
    }

    public static final String[] n(String[] strArr, String[] strArr2, Comparator comparator) {
        h1.d.e(strArr2, "other");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i++;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final boolean o(String str) {
        h1.d.e(str, "name");
        return str.equalsIgnoreCase("Authorization") || str.equalsIgnoreCase("Cookie") || str.equalsIgnoreCase("Proxy-Authorization") || str.equalsIgnoreCase("Set-Cookie");
    }

    public static final int p(char c2) {
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

    public static final Charset q(F1.h hVar, Charset charset) {
        Charset charset2;
        h1.d.e(hVar, "<this>");
        h1.d.e(charset, "default");
        int c2 = hVar.c(d);
        if (c2 == -1) {
            return charset;
        }
        if (c2 == 0) {
            Charset charset3 = StandardCharsets.UTF_8;
            h1.d.d(charset3, "UTF_8");
            return charset3;
        }
        if (c2 == 1) {
            Charset charset4 = StandardCharsets.UTF_16BE;
            h1.d.d(charset4, "UTF_16BE");
            return charset4;
        }
        if (c2 == 2) {
            Charset charset5 = StandardCharsets.UTF_16LE;
            h1.d.d(charset5, "UTF_16LE");
            return charset5;
        }
        if (c2 == 3) {
            Charset charset6 = o1.a.f3416a;
            charset2 = o1.a.f3418c;
            if (charset2 == null) {
                charset2 = Charset.forName("UTF-32BE");
                h1.d.d(charset2, "forName(...)");
                o1.a.f3418c = charset2;
            }
        } else {
            if (c2 != 4) {
                throw new AssertionError();
            }
            Charset charset7 = o1.a.f3416a;
            charset2 = o1.a.f3417b;
            if (charset2 == null) {
                charset2 = Charset.forName("UTF-32LE");
                h1.d.d(charset2, "forName(...)");
                o1.a.f3417b = charset2;
            }
        }
        return charset2;
    }

    public static final int r(p pVar) {
        h1.d.e(pVar, "<this>");
        return (pVar.i() & 255) | ((pVar.i() & 255) << 16) | ((pVar.i() & 255) << 8);
    }

    public static final boolean s(v vVar, int i, TimeUnit timeUnit) {
        h1.d.e(timeUnit, "timeUnit");
        long nanoTime = System.nanoTime();
        long c2 = vVar.a().e() ? vVar.a().c() - nanoTime : Long.MAX_VALUE;
        vVar.a().d(Math.min(c2, timeUnit.toNanos(i)) + nanoTime);
        try {
            f fVar = new f();
            while (vVar.d(fVar, 8192L) != -1) {
                fVar.o(fVar.f247b);
            }
            if (c2 == Long.MAX_VALUE) {
                vVar.a().a();
            } else {
                vVar.a().d(nanoTime + c2);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (c2 == Long.MAX_VALUE) {
                vVar.a().a();
            } else {
                vVar.a().d(nanoTime + c2);
            }
            return false;
        } catch (Throwable th) {
            if (c2 == Long.MAX_VALUE) {
                vVar.a().a();
            } else {
                vVar.a().d(nanoTime + c2);
            }
            throw th;
        }
    }

    public static final j t(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            z1.b bVar = (z1.b) it.next();
            String h2 = bVar.f4424a.h();
            String h3 = bVar.f4425b.h();
            arrayList.add(h2);
            arrayList.add(o1.d.S(h3).toString());
        }
        return new j((String[]) arrayList.toArray(new String[0]));
    }

    public static final String u(l lVar, boolean z2) {
        h1.d.e(lVar, "<this>");
        String str = lVar.d;
        if (o1.d.A(str, ":")) {
            str = "[" + str + ']';
        }
        int i = lVar.f3652e;
        if (!z2) {
            String str2 = lVar.f3649a;
            h1.d.e(str2, "scheme");
            if (i == (str2.equals("http") ? 80 : str2.equals("https") ? 443 : -1)) {
                return str;
            }
        }
        return str + ':' + i;
    }

    public static final List v(List list) {
        h1.d.e(list, "<this>");
        List unmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        h1.d.d(unmodifiableList, "unmodifiableList(toMutableList())");
        return unmodifiableList;
    }

    public static final int w(String str, int i) {
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
        return i;
    }

    public static final String x(String str, int i, int i2) {
        int l2 = l(str, i, i2);
        String substring = str.substring(l2, m(str, l2, i2));
        h1.d.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }
}
