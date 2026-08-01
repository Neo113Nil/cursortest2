package q1;

import C1.f;
import C1.h;
import C1.i;
import C1.n;
import C1.p;
import C1.v;
import I0.e;
import e1.d;
import e1.g;
import j0.AbstractC0142a;
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
import p1.k;
import p1.m;
import p1.q;
import p1.t;
import p1.u;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f3491a;

    /* renamed from: b, reason: collision with root package name */
    public static final k f3492b = AbstractC0142a.k(new String[0]);

    /* renamed from: c, reason: collision with root package name */
    public static final u f3493c;
    public static final n d;

    /* renamed from: e, reason: collision with root package name */
    public static final TimeZone f3494e;

    /* renamed from: f, reason: collision with root package name */
    public static final g f3495f;

    /* renamed from: g, reason: collision with root package name */
    public static final String f3496g;

    /* JADX WARN: Code restructure failed: missing block: B:79:0x019d, code lost:
    
        continue;
     */
    static {
        int i;
        byte[] bArr = new byte[0];
        f3491a = bArr;
        f fVar = new f();
        fVar.r(0, 0, bArr);
        long j2 = 0;
        f3493c = new u(null, j2, fVar, 0);
        if (j2 < 0 || j2 > j2 || 0 < j2) {
            throw new ArrayIndexOutOfBoundsException();
        }
        i iVar = i.d;
        i[] iVarArr = {e.f("efbbbf"), e.f("feff"), e.f("fffe"), e.f("0000ffff"), e.f("ffff0000")};
        ArrayList arrayList = new ArrayList(new W0.e(iVarArr, false));
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
        d.e(copyOf, "elements");
        ArrayList arrayList3 = copyOf.length == 0 ? new ArrayList() : new ArrayList(new W0.e(copyOf, true));
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
                d.e(iVar4, "prefix");
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
        x1.d.g(0L, fVar2, 0, arrayList, 0, arrayList.size(), arrayList3);
        int[] iArr = new int[(int) (fVar2.f182b / 4)];
        int i11 = 0;
        while (!fVar2.g()) {
            iArr[i11] = fVar2.l();
            i11++;
        }
        Object[] copyOf2 = Arrays.copyOf(iVarArr, 5);
        d.d(copyOf2, "copyOf(this, size)");
        d = new n((i[]) copyOf2, iArr);
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        d.b(timeZone);
        f3494e = timeZone;
        f3495f = new g(1);
        String F = l1.d.F(q.class.getName(), "okhttp3.");
        if (F.endsWith("Client")) {
            F = F.substring(0, F.length() - 6);
            d.d(F, "substring(...)");
        }
        f3496g = F;
    }

    public static final boolean a(m mVar, m mVar2) {
        d.e(mVar, "<this>");
        d.e(mVar2, "other");
        return d.a(mVar.d, mVar2.d) && mVar.f3366e == mVar2.f3366e && d.a(mVar.f3363a, mVar2.f3363a);
    }

    public static final void b(Closeable closeable) {
        d.e(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception unused) {
        }
    }

    public static final void c(Socket socket) {
        d.e(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e2) {
            throw e2;
        } catch (RuntimeException e3) {
            if (!d.a(e3.getMessage(), "bio == null")) {
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
            if (l1.d.v(str2, str.charAt(i))) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final boolean f(v vVar, TimeUnit timeUnit) {
        d.e(timeUnit, "timeUnit");
        try {
            return s(vVar, 100, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final String g(String str, Object... objArr) {
        d.e(str, "format");
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
        d.e(strArr, "<this>");
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

    public static final long i(t tVar) {
        String a2 = tVar.f3433f.a("Content-Length");
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
        d.e(objArr, "elements");
        Object[] objArr2 = (Object[]) objArr.clone();
        List unmodifiableList = Collections.unmodifiableList(W0.i.l0(Arrays.copyOf(objArr2, objArr2.length)));
        d.d(unmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return unmodifiableList;
    }

    public static final int k(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (d.f(charAt, 31) <= 0 || d.f(charAt, 127) >= 0) {
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
        d.e(strArr2, "other");
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
        d.e(str, "name");
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
        d.e(hVar, "<this>");
        d.e(charset, "default");
        int d2 = hVar.d(d);
        if (d2 == -1) {
            return charset;
        }
        if (d2 == 0) {
            Charset charset3 = StandardCharsets.UTF_8;
            d.d(charset3, "UTF_8");
            return charset3;
        }
        if (d2 == 1) {
            Charset charset4 = StandardCharsets.UTF_16BE;
            d.d(charset4, "UTF_16BE");
            return charset4;
        }
        if (d2 == 2) {
            Charset charset5 = StandardCharsets.UTF_16LE;
            d.d(charset5, "UTF_16LE");
            return charset5;
        }
        if (d2 == 3) {
            Charset charset6 = l1.a.f3159a;
            charset2 = l1.a.f3161c;
            if (charset2 == null) {
                charset2 = Charset.forName("UTF-32BE");
                d.d(charset2, "forName(...)");
                l1.a.f3161c = charset2;
            }
        } else {
            if (d2 != 4) {
                throw new AssertionError();
            }
            Charset charset7 = l1.a.f3159a;
            charset2 = l1.a.f3160b;
            if (charset2 == null) {
                charset2 = Charset.forName("UTF-32LE");
                d.d(charset2, "forName(...)");
                l1.a.f3160b = charset2;
            }
        }
        return charset2;
    }

    public static final int r(p pVar) {
        d.e(pVar, "<this>");
        return (pVar.i() & 255) | ((pVar.i() & 255) << 16) | ((pVar.i() & 255) << 8);
    }

    public static final boolean s(v vVar, int i, TimeUnit timeUnit) {
        d.e(timeUnit, "timeUnit");
        long nanoTime = System.nanoTime();
        long c2 = vVar.a().e() ? vVar.a().c() - nanoTime : Long.MAX_VALUE;
        vVar.a().d(Math.min(c2, timeUnit.toNanos(i)) + nanoTime);
        try {
            f fVar = new f();
            while (vVar.b(fVar, 8192L) != -1) {
                fVar.o(fVar.f182b);
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

    public static final k t(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            w1.b bVar = (w1.b) it.next();
            String h = bVar.f4084a.h();
            String h2 = bVar.f4085b.h();
            arrayList.add(h);
            arrayList.add(l1.d.K(h2).toString());
        }
        return new k((String[]) arrayList.toArray(new String[0]));
    }

    public static final String u(m mVar, boolean z2) {
        d.e(mVar, "<this>");
        String str = mVar.d;
        if (l1.d.w(str, ":")) {
            str = "[" + str + ']';
        }
        int i = mVar.f3366e;
        if (!z2) {
            String str2 = mVar.f3363a;
            d.e(str2, "scheme");
            if (i == (str2.equals("http") ? 80 : str2.equals("https") ? 443 : -1)) {
                return str;
            }
        }
        return str + ':' + i;
    }

    public static final List v(List list) {
        d.e(list, "<this>");
        List unmodifiableList = Collections.unmodifiableList(W0.h.q0(list));
        d.d(unmodifiableList, "unmodifiableList(toMutableList())");
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
        d.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }
}
