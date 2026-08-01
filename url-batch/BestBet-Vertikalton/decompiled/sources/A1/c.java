package A1;

import E1.h;
import G1.C0002c;
import H1.l;
import M1.f;
import M1.i;
import M1.n;
import M1.v;
import R0.e;
import b1.g;
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
import r1.d;
import z1.j;
import z1.p;
import z1.s;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f13a;

    /* renamed from: b, reason: collision with root package name */
    public static final j f14b = g.t(new String[0]);

    /* renamed from: c, reason: collision with root package name */
    public static final h f15c;
    public static final n d;

    /* renamed from: e, reason: collision with root package name */
    public static final TimeZone f16e;

    /* renamed from: f, reason: collision with root package name */
    public static final k1.h f17f;

    /* renamed from: g, reason: collision with root package name */
    public static final String f18g;

    /* JADX WARN: Code restructure failed: missing block: B:79:0x019d, code lost:
    
        continue;
     */
    static {
        int i;
        byte[] bArr = new byte[0];
        f13a = bArr;
        f fVar = new f();
        fVar.x(0, 0, bArr);
        long j2 = 0;
        f15c = new h(null, j2, fVar, 1);
        if (j2 < 0 || j2 > j2 || 0 < j2) {
            throw new ArrayIndexOutOfBoundsException();
        }
        i iVar = i.d;
        i[] iVarArr = {e.g("efbbbf"), e.g("feff"), e.g("fffe"), e.g("0000ffff"), e.g("ffff0000")};
        ArrayList arrayList = new ArrayList(new Y0.g(iVarArr, false));
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
        k1.e.e(copyOf, "elements");
        ArrayList arrayList3 = copyOf.length == 0 ? new ArrayList() : new ArrayList(new Y0.g(copyOf, true));
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
                k1.e.e(iVar4, "prefix");
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
        l.m(0L, fVar2, 0, arrayList, 0, arrayList.size(), arrayList3);
        int[] iArr = new int[(int) (fVar2.f799b / 4)];
        int i11 = 0;
        while (!fVar2.a()) {
            iArr[i11] = fVar2.r();
            i11++;
        }
        Object[] copyOf2 = Arrays.copyOf(iVarArr, 5);
        k1.e.d(copyOf2, "copyOf(this, size)");
        d = new n((i[]) copyOf2, iArr);
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        k1.e.b(timeZone);
        f16e = timeZone;
        f17f = new k1.h(1);
        String O2 = d.O(p.class.getName(), "okhttp3.");
        if (r1.l.x(O2, "Client")) {
            O2 = O2.substring(0, O2.length() - 6);
            k1.e.d(O2, "substring(...)");
        }
        f18g = O2;
    }

    public static final boolean a(z1.l lVar, z1.l lVar2) {
        k1.e.e(lVar, "<this>");
        k1.e.e(lVar2, "other");
        return k1.e.a(lVar.d, lVar2.d) && lVar.f4696e == lVar2.f4696e && k1.e.a(lVar.f4693a, lVar2.f4693a);
    }

    public static final void b(Closeable closeable) {
        k1.e.e(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception unused) {
        }
    }

    public static final void c(Socket socket) {
        k1.e.e(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e2) {
            throw e2;
        } catch (RuntimeException e3) {
            if (!k1.e.a(e3.getMessage(), "bio == null")) {
                throw e3;
            }
        } catch (Exception unused) {
        }
    }

    public static final int d(int i, int i2, String str, String str2) {
        while (i < i2) {
            if (d.D(str2, str.charAt(i))) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int e(String str, char c2, int i, int i2) {
        while (i < i2) {
            if (str.charAt(i) == c2) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final boolean f(v vVar, TimeUnit timeUnit) {
        k1.e.e(timeUnit, "timeUnit");
        try {
            return s(vVar, 100, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final String g(String str, Object... objArr) {
        k1.e.e(str, "format");
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
        k1.e.e(strArr, "<this>");
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

    public static final long i(s sVar) {
        String a2 = sVar.f4763f.a("Content-Length");
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
        k1.e.e(objArr, "elements");
        Object[] objArr2 = (Object[]) objArr.clone();
        Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length);
        k1.e.e(copyOf, "elements");
        List unmodifiableList = Collections.unmodifiableList(copyOf.length > 0 ? Y0.i.i0(copyOf) : Y0.s.f1516a);
        k1.e.d(unmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return unmodifiableList;
    }

    public static final int k(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (k1.e.f(charAt, 31) <= 0 || k1.e.f(charAt, 127) >= 0) {
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
        k1.e.e(strArr2, "other");
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
        k1.e.e(str, "name");
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

    public static final Charset q(M1.h hVar, Charset charset) {
        Charset charset2;
        k1.e.e(hVar, "<this>");
        k1.e.e(charset, "default");
        int o2 = hVar.o(d);
        if (o2 == -1) {
            return charset;
        }
        if (o2 == 0) {
            Charset charset3 = StandardCharsets.UTF_8;
            k1.e.d(charset3, "UTF_8");
            return charset3;
        }
        if (o2 == 1) {
            Charset charset4 = StandardCharsets.UTF_16BE;
            k1.e.d(charset4, "UTF_16BE");
            return charset4;
        }
        if (o2 == 2) {
            Charset charset5 = StandardCharsets.UTF_16LE;
            k1.e.d(charset5, "UTF_16LE");
            return charset5;
        }
        if (o2 == 3) {
            Charset charset6 = r1.a.f3833a;
            charset2 = r1.a.f3835c;
            if (charset2 == null) {
                charset2 = Charset.forName("UTF-32BE");
                k1.e.d(charset2, "forName(...)");
                r1.a.f3835c = charset2;
            }
        } else {
            if (o2 != 4) {
                throw new AssertionError();
            }
            Charset charset7 = r1.a.f3833a;
            charset2 = r1.a.f3834b;
            if (charset2 == null) {
                charset2 = Charset.forName("UTF-32LE");
                k1.e.d(charset2, "forName(...)");
                r1.a.f3834b = charset2;
            }
        }
        return charset2;
    }

    public static final int r(M1.p pVar) {
        k1.e.e(pVar, "<this>");
        return (pVar.j() & 255) | ((pVar.j() & 255) << 16) | ((pVar.j() & 255) << 8);
    }

    public static final boolean s(v vVar, int i, TimeUnit timeUnit) {
        k1.e.e(timeUnit, "timeUnit");
        long nanoTime = System.nanoTime();
        long c2 = vVar.b().e() ? vVar.b().c() - nanoTime : Long.MAX_VALUE;
        vVar.b().d(Math.min(c2, timeUnit.toNanos(i)) + nanoTime);
        try {
            f fVar = new f();
            while (vVar.c(fVar, 8192L) != -1) {
                fVar.u(fVar.f799b);
            }
            if (c2 == Long.MAX_VALUE) {
                vVar.b().a();
            } else {
                vVar.b().d(nanoTime + c2);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (c2 == Long.MAX_VALUE) {
                vVar.b().a();
            } else {
                vVar.b().d(nanoTime + c2);
            }
            return false;
        } catch (Throwable th) {
            if (c2 == Long.MAX_VALUE) {
                vVar.b().a();
            } else {
                vVar.b().d(nanoTime + c2);
            }
            throw th;
        }
    }

    public static final j t(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0002c c0002c = (C0002c) it.next();
            String h = c0002c.f369a.h();
            String h2 = c0002c.f370b.h();
            arrayList.add(h);
            arrayList.add(d.T(h2).toString());
        }
        return new j((String[]) arrayList.toArray(new String[0]));
    }

    public static final String u(z1.l lVar, boolean z2) {
        k1.e.e(lVar, "<this>");
        String str = lVar.d;
        if (d.E(str, ":")) {
            str = "[" + str + ']';
        }
        int i = lVar.f4696e;
        if (!z2) {
            String str2 = lVar.f4693a;
            k1.e.e(str2, "scheme");
            if (i == (str2.equals("http") ? 80 : str2.equals("https") ? 443 : -1)) {
                return str;
            }
        }
        return str + ':' + i;
    }

    public static final List v(List list) {
        k1.e.e(list, "<this>");
        List unmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        k1.e.d(unmodifiableList, "unmodifiableList(toMutableList())");
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
        k1.e.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }
}
