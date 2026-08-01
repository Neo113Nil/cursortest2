package j1;

import O0.e;
import X0.i;
import e1.d;
import i1.m;
import i1.n;
import i1.p;
import i1.u;
import i1.y;
import i1.z;
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
import p1.C0312b;
import v1.f;
import v1.h;
import v1.j;
import v1.o;
import v1.q;
import v1.w;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f2967a;

    /* renamed from: b, reason: collision with root package name */
    public static final n f2968b = m.m(new String[0]);

    /* renamed from: c, reason: collision with root package name */
    public static final z f2969c;

    /* renamed from: d, reason: collision with root package name */
    public static final o f2970d;

    /* renamed from: e, reason: collision with root package name */
    public static final TimeZone f2971e;

    /* renamed from: f, reason: collision with root package name */
    public static final i f2972f;

    /* renamed from: g, reason: collision with root package name */
    public static final String f2973g;

    /* JADX WARN: Code restructure failed: missing block: B:79:0x019d, code lost:
    
        continue;
     */
    static {
        int i;
        byte[] bArr = new byte[0];
        f2967a = bArr;
        f fVar = new f();
        fVar.r(0, 0, bArr);
        long j2 = 0;
        f2969c = new z(null, j2, fVar, 0);
        if (j2 < 0 || j2 > j2 || 0 < j2) {
            throw new ArrayIndexOutOfBoundsException();
        }
        j jVar = j.f4485d;
        j[] jVarArr = {v1.i.b("efbbbf"), v1.i.b("feff"), v1.i.b("fffe"), v1.i.b("0000ffff"), v1.i.b("ffff0000")};
        ArrayList arrayList = new ArrayList(new e(jVarArr, false));
        if (arrayList.size() > 1) {
            Collections.sort(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(5);
        for (int i2 = 0; i2 < 5; i2++) {
            j jVar2 = jVarArr[i2];
            arrayList2.add(-1);
        }
        Integer[] numArr = (Integer[]) arrayList2.toArray(new Integer[0]);
        Object[] copyOf = Arrays.copyOf(numArr, numArr.length);
        X0.f.e(copyOf, "elements");
        ArrayList arrayList3 = copyOf.length == 0 ? new ArrayList() : new ArrayList(new e(copyOf, true));
        int i3 = 0;
        int i4 = 0;
        while (i3 < 5) {
            j jVar3 = jVarArr[i3];
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
                int compareTo = comparable == jVar3 ? 0 : comparable == null ? -1 : jVar3 == null ? 1 : comparable.compareTo(jVar3);
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
        if (((j) arrayList.get(0)).a() <= 0) {
            throw new IllegalArgumentException("the empty byte string is not a supported option");
        }
        int i8 = 0;
        while (i8 < arrayList.size()) {
            j jVar4 = (j) arrayList.get(i8);
            int i9 = i8 + 1;
            int i10 = i9;
            while (i10 < arrayList.size()) {
                j jVar5 = (j) arrayList.get(i10);
                jVar5.getClass();
                X0.f.e(jVar4, "prefix");
                if (jVar5.f(jVar4, jVar4.a())) {
                    if (jVar5.a() == jVar4.a()) {
                        throw new IllegalArgumentException(("duplicate option: " + jVar5).toString());
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
        m.c(0L, fVar2, 0, arrayList, 0, arrayList.size(), arrayList3);
        int[] iArr = new int[(int) (fVar2.f4484b / 4)];
        int i11 = 0;
        while (!fVar2.g()) {
            iArr[i11] = fVar2.l();
            i11++;
        }
        Object[] copyOf2 = Arrays.copyOf(jVarArr, 5);
        X0.f.d(copyOf2, "copyOf(this, size)");
        f2970d = new o((j[]) copyOf2, iArr);
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        X0.f.b(timeZone);
        f2971e = timeZone;
        f2972f = new i(1);
        String K02 = d.K0(u.class.getName(), "okhttp3.");
        if (K02.endsWith("Client")) {
            K02 = K02.substring(0, K02.length() - 6);
            X0.f.d(K02, "substring(...)");
        }
        f2973g = K02;
    }

    public static final boolean a(p pVar, p pVar2) {
        X0.f.e(pVar, "<this>");
        X0.f.e(pVar2, "other");
        return X0.f.a(pVar.f2715d, pVar2.f2715d) && pVar.f2716e == pVar2.f2716e && X0.f.a(pVar.f2712a, pVar2.f2712a);
    }

    public static final void b(Closeable closeable) {
        X0.f.e(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception unused) {
        }
    }

    public static final void c(Socket socket) {
        X0.f.e(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e2) {
            throw e2;
        } catch (RuntimeException e3) {
            if (!X0.f.a(e3.getMessage(), "bio == null")) {
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
            if (d.A0(str2, str.charAt(i))) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final boolean f(w wVar, TimeUnit timeUnit) {
        X0.f.e(timeUnit, "timeUnit");
        try {
            return s(wVar, 100, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final String g(String str, Object... objArr) {
        X0.f.e(str, "format");
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
        X0.f.e(strArr, "<this>");
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

    public static final long i(y yVar) {
        String a2 = yVar.f2797f.a("Content-Length");
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
        X0.f.e(objArr, "elements");
        Object[] objArr2 = (Object[]) objArr.clone();
        List unmodifiableList = Collections.unmodifiableList(O0.i.c0(Arrays.copyOf(objArr2, objArr2.length)));
        X0.f.d(unmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return unmodifiableList;
    }

    public static final int k(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (X0.f.f(charAt, 31) <= 0 || X0.f.f(charAt, 127) >= 0) {
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
        X0.f.e(strArr2, "other");
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
        X0.f.e(str, "name");
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

    public static final Charset q(h hVar, Charset charset) {
        Charset charset2;
        X0.f.e(hVar, "<this>");
        X0.f.e(charset, "default");
        int b2 = hVar.b(f2970d);
        if (b2 == -1) {
            return charset;
        }
        if (b2 == 0) {
            Charset charset3 = StandardCharsets.UTF_8;
            X0.f.d(charset3, "UTF_8");
            return charset3;
        }
        if (b2 == 1) {
            Charset charset4 = StandardCharsets.UTF_16BE;
            X0.f.d(charset4, "UTF_16BE");
            return charset4;
        }
        if (b2 == 2) {
            Charset charset5 = StandardCharsets.UTF_16LE;
            X0.f.d(charset5, "UTF_16LE");
            return charset5;
        }
        if (b2 == 3) {
            Charset charset6 = e1.a.f2371a;
            charset2 = e1.a.f2373c;
            if (charset2 == null) {
                charset2 = Charset.forName("UTF-32BE");
                X0.f.d(charset2, "forName(...)");
                e1.a.f2373c = charset2;
            }
        } else {
            if (b2 != 4) {
                throw new AssertionError();
            }
            Charset charset7 = e1.a.f2371a;
            charset2 = e1.a.f2372b;
            if (charset2 == null) {
                charset2 = Charset.forName("UTF-32LE");
                X0.f.d(charset2, "forName(...)");
                e1.a.f2372b = charset2;
            }
        }
        return charset2;
    }

    public static final int r(q qVar) {
        X0.f.e(qVar, "<this>");
        return (qVar.i() & 255) | ((qVar.i() & 255) << 16) | ((qVar.i() & 255) << 8);
    }

    public static final boolean s(w wVar, int i, TimeUnit timeUnit) {
        X0.f.e(timeUnit, "timeUnit");
        long nanoTime = System.nanoTime();
        long c2 = wVar.a().e() ? wVar.a().c() - nanoTime : Long.MAX_VALUE;
        wVar.a().d(Math.min(c2, timeUnit.toNanos(i)) + nanoTime);
        try {
            f fVar = new f();
            while (wVar.c(fVar, 8192L) != -1) {
                fVar.o(fVar.f4484b);
            }
            if (c2 == Long.MAX_VALUE) {
                wVar.a().a();
            } else {
                wVar.a().d(nanoTime + c2);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (c2 == Long.MAX_VALUE) {
                wVar.a().a();
            } else {
                wVar.a().d(nanoTime + c2);
            }
            return false;
        } catch (Throwable th) {
            if (c2 == Long.MAX_VALUE) {
                wVar.a().a();
            } else {
                wVar.a().d(nanoTime + c2);
            }
            throw th;
        }
    }

    public static final n t(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0312b c0312b = (C0312b) it.next();
            String h = c0312b.f3772a.h();
            String h2 = c0312b.f3773b.h();
            arrayList.add(h);
            arrayList.add(d.P0(h2).toString());
        }
        return new n((String[]) arrayList.toArray(new String[0]));
    }

    public static final String u(p pVar, boolean z2) {
        X0.f.e(pVar, "<this>");
        String str = pVar.f2715d;
        if (d.B0(str, ":")) {
            str = "[" + str + ']';
        }
        int i = pVar.f2716e;
        if (!z2) {
            String str2 = pVar.f2712a;
            X0.f.e(str2, "scheme");
            if (i == (str2.equals("http") ? 80 : str2.equals("https") ? 443 : -1)) {
                return str;
            }
        }
        return str + ':' + i;
    }

    public static final List v(List list) {
        X0.f.e(list, "<this>");
        List unmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        X0.f.d(unmodifiableList, "unmodifiableList(toMutableList())");
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
        X0.f.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }
}
