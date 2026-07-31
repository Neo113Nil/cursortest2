package B2;

import A2.o;
import A2.q;
import A2.y;
import A2.z;
import H2.C0081c;
import I2.d;
import M1.B;
import M1.i;
import M1.l;
import M1.m;
import N2.C0150f;
import N2.C0153i;
import N2.F;
import N2.InterfaceC0152h;
import N2.u;
import h2.AbstractC0439a;
import h2.AbstractC0447i;
import h2.C0446h;
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
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f415a;

    /* renamed from: b, reason: collision with root package name */
    public static final o f416b = d.G(new String[0]);

    /* renamed from: c, reason: collision with root package name */
    public static final z f417c;

    /* renamed from: d, reason: collision with root package name */
    public static final u f418d;

    /* renamed from: e, reason: collision with root package name */
    public static final TimeZone f419e;

    /* renamed from: f, reason: collision with root package name */
    public static final C0446h f420f;

    /* renamed from: g, reason: collision with root package name */
    public static final String f421g;

    /* JADX WARN: Code restructure failed: missing block: B:43:0x011e, code lost:
    
        continue;
     */
    static {
        int i3 = 0;
        byte[] bArr = new byte[0];
        f415a = bArr;
        C0150f c0150f = new C0150f();
        c0150f.O(bArr, 0, 0);
        long j3 = 0;
        f417c = new z(null, j3, c0150f, 0);
        if (j3 < 0 || j3 > j3 || 0 < j3) {
            throw new ArrayIndexOutOfBoundsException();
        }
        C0153i c0153i = C0153i.f2930g;
        C0153i[] c0153iArr = {F0.a.j("efbbbf"), F0.a.j("feff"), F0.a.j("fffe"), F0.a.j("0000ffff"), F0.a.j("ffff0000")};
        ArrayList arrayList = new ArrayList(new i(c0153iArr, false));
        if (arrayList.size() > 1) {
            Collections.sort(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(5);
        for (int i4 = 0; i4 < 5; i4++) {
            C0153i c0153i2 = c0153iArr[i4];
            arrayList2.add(-1);
        }
        Integer[] numArr = (Integer[]) arrayList2.toArray(new Integer[0]);
        ArrayList e02 = m.e0(Arrays.copyOf(numArr, numArr.length));
        int i5 = 0;
        int i6 = 0;
        while (i5 < 5) {
            e02.set(m.a0(arrayList, c0153iArr[i5]), Integer.valueOf(i6));
            i5++;
            i6++;
        }
        if (((C0153i) arrayList.get(0)).b() <= 0) {
            throw new IllegalArgumentException("the empty byte string is not a supported option");
        }
        int i7 = 0;
        while (i7 < arrayList.size()) {
            C0153i c0153i3 = (C0153i) arrayList.get(i7);
            int i8 = i7 + 1;
            int i9 = i8;
            while (i9 < arrayList.size()) {
                C0153i c0153i4 = (C0153i) arrayList.get(i9);
                c0153i4.getClass();
                Z1.i.f(c0153i3, "prefix");
                if (c0153i4.j(0, c0153i3, c0153i3.b())) {
                    if (c0153i4.b() == c0153i3.b()) {
                        throw new IllegalArgumentException(("duplicate option: " + c0153i4).toString());
                    }
                    if (((Number) e02.get(i9)).intValue() > ((Number) e02.get(i7)).intValue()) {
                        arrayList.remove(i9);
                        e02.remove(i9);
                    } else {
                        i9++;
                    }
                }
            }
            i7 = i8;
        }
        C0150f c0150f2 = new C0150f();
        B.p(0L, c0150f2, 0, arrayList, 0, arrayList.size(), e02);
        int[] iArr = new int[(int) (c0150f2.f2929e / 4)];
        while (!c0150f2.a()) {
            iArr[i3] = c0150f2.o();
            i3++;
        }
        Object[] copyOf = Arrays.copyOf(c0153iArr, 5);
        Z1.i.e(copyOf, "copyOf(this, size)");
        f418d = new u((C0153i[]) copyOf, iArr);
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        Z1.i.c(timeZone);
        f419e = timeZone;
        f420f = new C0446h("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        f421g = AbstractC0447i.A0(AbstractC0447i.z0(A2.u.class.getName(), "okhttp3."), "Client");
    }

    public static final boolean a(q qVar, q qVar2) {
        Z1.i.f(qVar, "<this>");
        Z1.i.f(qVar2, "other");
        return Z1.i.a(qVar.f132d, qVar2.f132d) && qVar.f133e == qVar2.f133e && Z1.i.a(qVar.f129a, qVar2.f129a);
    }

    public static final int b(long j3, TimeUnit timeUnit) {
        if (j3 < 0) {
            throw new IllegalStateException("timeout".concat(" < 0").toString());
        }
        long millis = timeUnit.toMillis(j3);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException("timeout".concat(" too large.").toString());
        }
        if (millis != 0 || j3 <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException("timeout".concat(" too small.").toString());
    }

    public static final void c(Closeable closeable) {
        Z1.i.f(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e3) {
            throw e3;
        } catch (Exception unused) {
        }
    }

    public static final void d(Socket socket) {
        Z1.i.f(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e3) {
            throw e3;
        } catch (RuntimeException e4) {
            if (!Z1.i.a(e4.getMessage(), "bio == null")) {
                throw e4;
            }
        } catch (Exception unused) {
        }
    }

    public static final int e(int i3, int i4, String str, String str2) {
        while (i3 < i4) {
            if (AbstractC0447i.k0(str2, str.charAt(i3))) {
                return i3;
            }
            i3++;
        }
        return i4;
    }

    public static final int f(String str, char c3, int i3, int i4) {
        while (i3 < i4) {
            if (str.charAt(i3) == c3) {
                return i3;
            }
            i3++;
        }
        return i4;
    }

    public static final boolean g(F f3, TimeUnit timeUnit) {
        Z1.i.f(timeUnit, "timeUnit");
        try {
            return t(f3, 100, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final String h(String str, Object... objArr) {
        Z1.i.f(str, "format");
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
    }

    public static final boolean i(String[] strArr, String[] strArr2, Comparator comparator) {
        Z1.i.f(strArr, "<this>");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                L1.q h3 = Z1.i.h(strArr2);
                while (h3.hasNext()) {
                    if (comparator.compare(str, (String) h3.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final long j(y yVar) {
        String b2 = yVar.f216i.b("Content-Length");
        if (b2 == null) {
            return -1L;
        }
        try {
            return Long.parseLong(b2);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static final List k(Object... objArr) {
        Z1.i.f(objArr, "elements");
        Object[] objArr2 = (Object[]) objArr.clone();
        List unmodifiableList = Collections.unmodifiableList(m.c0(Arrays.copyOf(objArr2, objArr2.length)));
        Z1.i.e(unmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return unmodifiableList;
    }

    public static final int l(String str) {
        int length = str.length();
        for (int i3 = 0; i3 < length; i3++) {
            char charAt = str.charAt(i3);
            if (Z1.i.g(charAt, 31) <= 0 || Z1.i.g(charAt, 127) >= 0) {
                return i3;
            }
        }
        return -1;
    }

    public static final int m(int i3, int i4, String str) {
        while (i3 < i4) {
            char charAt = str.charAt(i3);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i3;
            }
            i3++;
        }
        return i4;
    }

    public static final int n(int i3, int i4, String str) {
        int i5 = i4 - 1;
        if (i3 <= i5) {
            while (true) {
                char charAt = str.charAt(i5);
                if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                    return i5 + 1;
                }
                if (i5 == i3) {
                    break;
                }
                i5--;
            }
        }
        return i3;
    }

    public static final String[] o(String[] strArr, String[] strArr2, Comparator comparator) {
        Z1.i.f(strArr2, "other");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i3]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i3++;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final boolean p(String str) {
        Z1.i.f(str, "name");
        return str.equalsIgnoreCase("Authorization") || str.equalsIgnoreCase("Cookie") || str.equalsIgnoreCase("Proxy-Authorization") || str.equalsIgnoreCase("Set-Cookie");
    }

    public static final int q(char c3) {
        if ('0' <= c3 && c3 < ':') {
            return c3 - '0';
        }
        if ('a' <= c3 && c3 < 'g') {
            return c3 - 'W';
        }
        if ('A' > c3 || c3 >= 'G') {
            return -1;
        }
        return c3 - '7';
    }

    public static final Charset r(InterfaceC0152h interfaceC0152h, Charset charset) {
        Charset charset2;
        Z1.i.f(interfaceC0152h, "<this>");
        Z1.i.f(charset, "default");
        int G3 = interfaceC0152h.G(f418d);
        if (G3 == -1) {
            return charset;
        }
        if (G3 == 0) {
            Charset charset3 = StandardCharsets.UTF_8;
            Z1.i.e(charset3, "UTF_8");
            return charset3;
        }
        if (G3 == 1) {
            Charset charset4 = StandardCharsets.UTF_16BE;
            Z1.i.e(charset4, "UTF_16BE");
            return charset4;
        }
        if (G3 == 2) {
            Charset charset5 = StandardCharsets.UTF_16LE;
            Z1.i.e(charset5, "UTF_16LE");
            return charset5;
        }
        if (G3 == 3) {
            Charset charset6 = AbstractC0439a.f5056a;
            charset2 = AbstractC0439a.f5058c;
            if (charset2 == null) {
                charset2 = Charset.forName("UTF-32BE");
                Z1.i.e(charset2, "forName(...)");
                AbstractC0439a.f5058c = charset2;
            }
        } else {
            if (G3 != 4) {
                throw new AssertionError();
            }
            Charset charset7 = AbstractC0439a.f5056a;
            charset2 = AbstractC0439a.f5057b;
            if (charset2 == null) {
                charset2 = Charset.forName("UTF-32LE");
                Z1.i.e(charset2, "forName(...)");
                AbstractC0439a.f5057b = charset2;
            }
        }
        return charset2;
    }

    public static final int s(N2.z zVar) {
        Z1.i.f(zVar, "<this>");
        return (zVar.e() & 255) | ((zVar.e() & 255) << 16) | ((zVar.e() & 255) << 8);
    }

    public static final boolean t(F f3, int i3, TimeUnit timeUnit) {
        Z1.i.f(timeUnit, "timeUnit");
        long nanoTime = System.nanoTime();
        long c3 = f3.c().e() ? f3.c().c() - nanoTime : Long.MAX_VALUE;
        f3.c().d(Math.min(c3, timeUnit.toNanos(i3)) + nanoTime);
        try {
            C0150f c0150f = new C0150f();
            while (f3.l(c0150f, 8192L) != -1) {
                c0150f.x(c0150f.f2929e);
            }
            if (c3 == Long.MAX_VALUE) {
                f3.c().a();
            } else {
                f3.c().d(nanoTime + c3);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (c3 == Long.MAX_VALUE) {
                f3.c().a();
            } else {
                f3.c().d(nanoTime + c3);
            }
            return false;
        } catch (Throwable th) {
            if (c3 == Long.MAX_VALUE) {
                f3.c().a();
            } else {
                f3.c().d(nanoTime + c3);
            }
            throw th;
        }
    }

    public static final o u(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0081c c0081c = (C0081c) it.next();
            String o3 = c0081c.f1934a.o();
            String o4 = c0081c.f1935b.o();
            arrayList.add(o3);
            arrayList.add(AbstractC0447i.H0(o4).toString());
        }
        return new o((String[]) arrayList.toArray(new String[0]));
    }

    public static final String v(q qVar, boolean z3) {
        Z1.i.f(qVar, "<this>");
        String str = qVar.f132d;
        if (AbstractC0447i.l0(str, ":")) {
            str = "[" + str + ']';
        }
        int i3 = qVar.f133e;
        if (!z3) {
            String str2 = qVar.f129a;
            Z1.i.f(str2, "scheme");
            if (i3 == (str2.equals("http") ? 80 : str2.equals("https") ? 443 : -1)) {
                return str;
            }
        }
        return str + ':' + i3;
    }

    public static final List w(List list) {
        Z1.i.f(list, "<this>");
        List unmodifiableList = Collections.unmodifiableList(l.D0(list));
        Z1.i.e(unmodifiableList, "unmodifiableList(toMutableList())");
        return unmodifiableList;
    }

    public static final int x(String str, int i3) {
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
        return i3;
    }

    public static final String y(int i3, int i4, String str) {
        int m3 = m(i3, i4, str);
        String substring = str.substring(m3, n(m3, i4, str));
        Z1.i.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }
}
