package u3;

import a4.c;
import b4.l;
import g4.h;
import g4.i;
import g4.n;
import g4.v;
import i3.d;
import i3.f;
import java.io.Closeable;
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
import t3.j;
import t3.k;
import t3.o;
import t3.s;
import t3.t;
import x2.e;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f3581a;

    /* renamed from: b, reason: collision with root package name */
    public static final j f3582b = r1.b.p(new String[0]);

    /* renamed from: c, reason: collision with root package name */
    public static final t f3583c;
    public static final n d;

    /* renamed from: e, reason: collision with root package name */
    public static final TimeZone f3584e;

    /* renamed from: f, reason: collision with root package name */
    public static final f f3585f;

    /* renamed from: g, reason: collision with root package name */
    public static final String f3586g;

    /* JADX WARN: Code restructure failed: missing block: B:79:0x019e, code lost:
    
        continue;
     */
    static {
        int i;
        byte[] bArr = new byte[0];
        f3581a = bArr;
        g4.f fVar = new g4.f();
        fVar.v(bArr, 0);
        long j2 = 0;
        f3583c = new t(j2, fVar);
        if (j2 < 0 || j2 > j2 || 0 < j2) {
            throw new ArrayIndexOutOfBoundsException();
        }
        i iVar = i.i;
        i[] iVarArr = {o2.f.f("efbbbf"), o2.f.f("feff"), o2.f.f("fffe"), o2.f.f("0000ffff"), o2.f.f("ffff0000")};
        ArrayList arrayList = new ArrayList(new e(iVarArr, false));
        if (arrayList.size() > 1) {
            Collections.sort(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(5);
        for (int i4 = 0; i4 < 5; i4++) {
            i iVar2 = iVarArr[i4];
            arrayList2.add(-1);
        }
        Integer[] numArr = (Integer[]) arrayList2.toArray(new Integer[0]);
        Object[] copyOf = Arrays.copyOf(numArr, numArr.length);
        d.e(copyOf, "elements");
        ArrayList arrayList3 = copyOf.length == 0 ? new ArrayList() : new ArrayList(new e(copyOf, true));
        int i5 = 0;
        int i6 = 0;
        while (i5 < 5) {
            i iVar3 = iVarArr[i5];
            int i7 = i6 + 1;
            int size = arrayList.size();
            int size2 = arrayList.size();
            if (size < 0) {
                throw new IllegalArgumentException("fromIndex (0) is greater than toIndex (" + size + ").");
            }
            if (size > size2) {
                throw new IndexOutOfBoundsException("toIndex (" + size + ") is greater than size (" + size2 + ").");
            }
            int i8 = size - 1;
            int i9 = 0;
            while (true) {
                if (i9 > i8) {
                    i = -(i9 + 1);
                    break;
                }
                i = (i9 + i8) >>> 1;
                Comparable comparable = (Comparable) arrayList.get(i);
                int compareTo = comparable == iVar3 ? 0 : comparable == null ? -1 : iVar3 == null ? 1 : comparable.compareTo(iVar3);
                if (compareTo < 0) {
                    i9 = i + 1;
                } else if (compareTo > 0) {
                    i8 = i - 1;
                }
            }
            arrayList3.set(i, Integer.valueOf(i6));
            i5++;
            i6 = i7;
        }
        if (((i) arrayList.get(0)).a() <= 0) {
            throw new IllegalArgumentException("the empty byte string is not a supported option");
        }
        int i10 = 0;
        while (i10 < arrayList.size()) {
            i iVar4 = (i) arrayList.get(i10);
            int i11 = i10 + 1;
            int i12 = i11;
            while (i12 < arrayList.size()) {
                i iVar5 = (i) arrayList.get(i12);
                iVar5.getClass();
                d.e(iVar4, "prefix");
                if (iVar5.f(iVar4, iVar4.a())) {
                    if (iVar5.a() == iVar4.a()) {
                        throw new IllegalArgumentException(("duplicate option: " + iVar5).toString());
                    }
                    if (((Number) arrayList3.get(i12)).intValue() > ((Number) arrayList3.get(i10)).intValue()) {
                        arrayList.remove(i12);
                        arrayList3.remove(i12);
                    } else {
                        i12++;
                    }
                }
            }
            i10 = i11;
        }
        g4.f fVar2 = new g4.f();
        l.c(0L, fVar2, 0, arrayList, 0, arrayList.size(), arrayList3);
        int[] iArr = new int[(int) (fVar2.f1935g / 4)];
        int i13 = 0;
        while (!fVar2.n()) {
            iArr[i13] = fVar2.readInt();
            i13++;
        }
        Object[] copyOf2 = Arrays.copyOf(iVarArr, 5);
        d.d(copyOf2, "copyOf(this, size)");
        d = new n((i[]) copyOf2, iArr);
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        d.b(timeZone);
        f3584e = timeZone;
        f3585f = new f(1);
        String A0 = p3.d.A0(o.class.getName(), "okhttp3.");
        if (A0.endsWith("Client")) {
            A0 = A0.substring(0, A0.length() - 6);
            d.d(A0, "substring(...)");
        }
        f3586g = A0;
    }

    public static final boolean a(k kVar, k kVar2) {
        d.e(kVar, "<this>");
        d.e(kVar2, "other");
        return d.a(kVar.d, kVar2.d) && kVar.f3458e == kVar2.f3458e && d.a(kVar.f3455a, kVar2.f3455a);
    }

    public static final void b(Closeable closeable) {
        d.e(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e4) {
            throw e4;
        } catch (Exception unused) {
        }
    }

    public static final void c(Socket socket) {
        d.e(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e4) {
            throw e4;
        } catch (RuntimeException e5) {
            if (!d.a(e5.getMessage(), "bio == null")) {
                throw e5;
            }
        } catch (Exception unused) {
        }
    }

    public static final int d(int i, int i4, String str, String str2) {
        while (i < i4) {
            if (p3.d.r0(str2, str.charAt(i))) {
                return i;
            }
            i++;
        }
        return i4;
    }

    public static final int e(String str, char c5, int i, int i4) {
        while (i < i4) {
            if (str.charAt(i) == c5) {
                return i;
            }
            i++;
        }
        return i4;
    }

    public static final String f(String str, Object... objArr) {
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
    public static final boolean g(String[] strArr, String[] strArr2, Comparator comparator) {
        d.e(strArr, "<this>");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                String str = strArr[i];
                int i4 = 0;
                while (true) {
                    if (i4 < strArr2.length) {
                        int i5 = i4 + 1;
                        try {
                            if (comparator.compare(str, strArr2[i4]) == 0) {
                                return true;
                            }
                            i4 = i5;
                        } catch (ArrayIndexOutOfBoundsException e4) {
                            throw new NoSuchElementException(e4.getMessage());
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final long h(s sVar) {
        String a5 = sVar.f3523k.a("Content-Length");
        if (a5 == null) {
            return -1L;
        }
        try {
            return Long.parseLong(a5);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static final List i(Object... objArr) {
        d.e(objArr, "elements");
        Object[] objArr2 = (Object[]) objArr.clone();
        List unmodifiableList = Collections.unmodifiableList(x2.i.B(Arrays.copyOf(objArr2, objArr2.length)));
        d.d(unmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return unmodifiableList;
    }

    public static final int j(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (d.f(charAt, 31) <= 0 || d.f(charAt, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }

    public static final int k(String str, int i, int i4) {
        while (i < i4) {
            char charAt = str.charAt(i);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i;
            }
            i++;
        }
        return i4;
    }

    public static final int l(String str, int i, int i4) {
        int i5 = i4 - 1;
        if (i <= i5) {
            while (true) {
                char charAt = str.charAt(i5);
                if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                    return i5 + 1;
                }
                if (i5 == i) {
                    break;
                }
                i5--;
            }
        }
        return i;
    }

    public static final String[] m(String[] strArr, String[] strArr2, Comparator comparator) {
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

    public static final boolean n(String str) {
        d.e(str, "name");
        return str.equalsIgnoreCase("Authorization") || str.equalsIgnoreCase("Cookie") || str.equalsIgnoreCase("Proxy-Authorization") || str.equalsIgnoreCase("Set-Cookie");
    }

    public static final int o(char c5) {
        if ('0' <= c5 && c5 < ':') {
            return c5 - '0';
        }
        if ('a' <= c5 && c5 < 'g') {
            return c5 - 'W';
        }
        if ('A' > c5 || c5 >= 'G') {
            return -1;
        }
        return c5 - '7';
    }

    public static final Charset p(h hVar, Charset charset) {
        d.e(hVar, "<this>");
        d.e(charset, "default");
        int h = hVar.h(d);
        if (h == -1) {
            return charset;
        }
        if (h == 0) {
            Charset charset2 = StandardCharsets.UTF_8;
            d.d(charset2, "UTF_8");
            return charset2;
        }
        if (h == 1) {
            Charset charset3 = StandardCharsets.UTF_16BE;
            d.d(charset3, "UTF_16BE");
            return charset3;
        }
        if (h == 2) {
            Charset charset4 = StandardCharsets.UTF_16LE;
            d.d(charset4, "UTF_16LE");
            return charset4;
        }
        if (h == 3) {
            Charset charset5 = p3.a.f3089a;
            Charset charset6 = p3.a.f3091c;
            if (charset6 != null) {
                return charset6;
            }
            Charset forName = Charset.forName("UTF-32BE");
            d.d(forName, "forName(...)");
            p3.a.f3091c = forName;
            return forName;
        }
        if (h != 4) {
            throw new AssertionError();
        }
        Charset charset7 = p3.a.f3089a;
        Charset charset8 = p3.a.f3090b;
        if (charset8 != null) {
            return charset8;
        }
        Charset forName2 = Charset.forName("UTF-32LE");
        d.d(forName2, "forName(...)");
        p3.a.f3090b = forName2;
        return forName2;
    }

    public static final int q(h hVar) {
        d.e(hVar, "<this>");
        return (hVar.readByte() & 255) | ((hVar.readByte() & 255) << 16) | ((hVar.readByte() & 255) << 8);
    }

    public static final boolean r(v vVar, int i) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        d.e(timeUnit, "timeUnit");
        long nanoTime = System.nanoTime();
        long c5 = vVar.a().e() ? vVar.a().c() - nanoTime : Long.MAX_VALUE;
        vVar.a().d(Math.min(c5, timeUnit.toNanos(i)) + nanoTime);
        try {
            g4.f fVar = new g4.f();
            while (vVar.c(8192L, fVar) != -1) {
                fVar.skip(fVar.f1935g);
            }
            if (c5 == Long.MAX_VALUE) {
                vVar.a().a();
                return true;
            }
            vVar.a().d(nanoTime + c5);
            return true;
        } catch (InterruptedIOException unused) {
            if (c5 == Long.MAX_VALUE) {
                vVar.a().a();
                return false;
            }
            vVar.a().d(nanoTime + c5);
            return false;
        } catch (Throwable th) {
            if (c5 == Long.MAX_VALUE) {
                vVar.a().a();
            } else {
                vVar.a().d(nanoTime + c5);
            }
            throw th;
        }
    }

    public static final j s(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            i iVar = cVar.f148a;
            i iVar2 = cVar.f149b;
            String h = iVar.h();
            String h5 = iVar2.h();
            arrayList.add(h);
            arrayList.add(p3.d.E0(h5).toString());
        }
        return new j((String[]) arrayList.toArray(new String[0]));
    }

    public static final String t(k kVar, boolean z4) {
        d.e(kVar, "<this>");
        int i = kVar.f3458e;
        String str = kVar.d;
        if (p3.d.s0(str, ":")) {
            str = "[" + str + ']';
        }
        if (!z4) {
            String str2 = kVar.f3455a;
            d.e(str2, "scheme");
            if (i == (str2.equals("http") ? 80 : str2.equals("https") ? 443 : -1)) {
                return str;
            }
        }
        return str + ':' + i;
    }

    public static final List u(List list) {
        d.e(list, "<this>");
        List unmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        d.d(unmodifiableList, "unmodifiableList(toMutableList())");
        return unmodifiableList;
    }

    public static final int v(String str, int i) {
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

    public static final String w(String str, int i, int i4) {
        int k4 = k(str, i, i4);
        String substring = str.substring(k4, l(str, k4, i4));
        d.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }
}
