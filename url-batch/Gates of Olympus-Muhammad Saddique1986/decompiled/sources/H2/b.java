package H2;

import A1.i;
import G2.l;
import G2.n;
import G2.r;
import G2.v;
import N2.C0204b;
import R1.p;
import S1.m;
import T2.C0231f;
import T2.C0234i;
import T2.F;
import T2.InterfaceC0233h;
import T2.u;
import T2.z;
import f2.j;
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
import l0.c;
import n2.AbstractC0721a;
import n2.AbstractC0730j;
import n2.C0728h;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f2632a;

    /* renamed from: b, reason: collision with root package name */
    public static final l f2633b = c.I(new String[0]);

    /* renamed from: c, reason: collision with root package name */
    public static final v f2634c;

    /* renamed from: d, reason: collision with root package name */
    public static final u f2635d;

    /* renamed from: e, reason: collision with root package name */
    public static final TimeZone f2636e;

    /* renamed from: f, reason: collision with root package name */
    public static final C0728h f2637f;

    /* renamed from: g, reason: collision with root package name */
    public static final String f2638g;

    /* JADX WARN: Code restructure failed: missing block: B:43:0x011e, code lost:
    
        continue;
     */
    static {
        int i3 = 0;
        byte[] bArr = new byte[0];
        f2632a = bArr;
        C0231f c0231f = new C0231f();
        c0231f.z(bArr, 0, 0);
        long j3 = 0;
        f2634c = new v(null, j3, c0231f, 0);
        if (j3 < 0 || j3 > j3 || 0 < j3) {
            throw new ArrayIndexOutOfBoundsException();
        }
        C0234i c0234i = C0234i.f4410g;
        C0234i[] c0234iArr = {i.j("efbbbf"), i.j("feff"), i.j("fffe"), i.j("0000ffff"), i.j("ffff0000")};
        ArrayList arrayList = new ArrayList(new S1.i(c0234iArr, false));
        if (arrayList.size() > 1) {
            Collections.sort(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(5);
        for (int i4 = 0; i4 < 5; i4++) {
            C0234i c0234i2 = c0234iArr[i4];
            arrayList2.add(-1);
        }
        Integer[] numArr = (Integer[]) arrayList2.toArray(new Integer[0]);
        ArrayList C02 = m.C0(Arrays.copyOf(numArr, numArr.length));
        int i5 = 0;
        int i6 = 0;
        while (i5 < 5) {
            C02.set(m.y0(arrayList, c0234iArr[i5]), Integer.valueOf(i6));
            i5++;
            i6++;
        }
        if (((C0234i) arrayList.get(0)).b() <= 0) {
            throw new IllegalArgumentException("the empty byte string is not a supported option");
        }
        int i7 = 0;
        while (i7 < arrayList.size()) {
            C0234i c0234i3 = (C0234i) arrayList.get(i7);
            int i8 = i7 + 1;
            int i9 = i8;
            while (i9 < arrayList.size()) {
                C0234i c0234i4 = (C0234i) arrayList.get(i9);
                c0234i4.getClass();
                j.f(c0234i3, "prefix");
                if (c0234i4.j(0, c0234i3, c0234i3.b())) {
                    if (c0234i4.b() == c0234i3.b()) {
                        throw new IllegalArgumentException(("duplicate option: " + c0234i4).toString());
                    }
                    if (((Number) C02.get(i9)).intValue() > ((Number) C02.get(i7)).intValue()) {
                        arrayList.remove(i9);
                        C02.remove(i9);
                    } else {
                        i9++;
                    }
                }
            }
            i7 = i8;
        }
        C0231f c0231f2 = new C0231f();
        c.i(0L, c0231f2, 0, arrayList, 0, arrayList.size(), C02);
        int[] iArr = new int[(int) (c0231f2.f4409e / 4)];
        while (!c0231f2.a()) {
            iArr[i3] = c0231f2.q();
            i3++;
        }
        Object[] copyOf = Arrays.copyOf(c0234iArr, 5);
        j.e(copyOf, "copyOf(this, size)");
        f2635d = new u((C0234i[]) copyOf, iArr);
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        j.c(timeZone);
        f2636e = timeZone;
        f2637f = new C0728h("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        f2638g = AbstractC0730j.R(AbstractC0730j.Q(r.class.getName(), "okhttp3."), "Client");
    }

    public static final boolean a(n nVar, n nVar2) {
        j.f(nVar, "<this>");
        j.f(nVar2, "other");
        return j.a(nVar.f2218d, nVar2.f2218d) && nVar.f2219e == nVar2.f2219e && j.a(nVar.f2215a, nVar2.f2215a);
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
        j.f(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e3) {
            throw e3;
        } catch (Exception unused) {
        }
    }

    public static final void d(Socket socket) {
        j.f(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e3) {
            throw e3;
        } catch (RuntimeException e4) {
            if (!j.a(e4.getMessage(), "bio == null")) {
                throw e4;
            }
        } catch (Exception unused) {
        }
    }

    public static final int e(int i3, int i4, String str, String str2) {
        while (i3 < i4) {
            if (AbstractC0730j.B(str2, str.charAt(i3))) {
                return i3;
            }
            i3++;
        }
        return i4;
    }

    public static final int f(String str, char c2, int i3, int i4) {
        while (i3 < i4) {
            if (str.charAt(i3) == c2) {
                return i3;
            }
            i3++;
        }
        return i4;
    }

    public static final boolean g(F f3, TimeUnit timeUnit) {
        j.f(timeUnit, "timeUnit");
        try {
            return t(f3, 100, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final String h(String str, Object... objArr) {
        j.f(str, "format");
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
    }

    public static final boolean i(String[] strArr, String[] strArr2, Comparator comparator) {
        j.f(strArr, "<this>");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                p h3 = j.h(strArr2);
                while (h3.hasNext()) {
                    if (comparator.compare(str, (String) h3.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final long j(G2.u uVar) {
        String b3 = uVar.f2299i.b("Content-Length");
        if (b3 == null) {
            return -1L;
        }
        try {
            return Long.parseLong(b3);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static final List k(Object... objArr) {
        j.f(objArr, "elements");
        Object[] objArr2 = (Object[]) objArr.clone();
        List unmodifiableList = Collections.unmodifiableList(m.A0(Arrays.copyOf(objArr2, objArr2.length)));
        j.e(unmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return unmodifiableList;
    }

    public static final int l(String str) {
        int length = str.length();
        for (int i3 = 0; i3 < length; i3++) {
            char charAt = str.charAt(i3);
            if (j.g(charAt, 31) <= 0 || j.g(charAt, 127) >= 0) {
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
        j.f(strArr2, "other");
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
        j.f(str, "name");
        return str.equalsIgnoreCase("Authorization") || str.equalsIgnoreCase("Cookie") || str.equalsIgnoreCase("Proxy-Authorization") || str.equalsIgnoreCase("Set-Cookie");
    }

    public static final int q(char c2) {
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

    public static final Charset r(InterfaceC0233h interfaceC0233h, Charset charset) {
        Charset charset2;
        j.f(interfaceC0233h, "<this>");
        j.f(charset, "default");
        int C = interfaceC0233h.C(f2635d);
        if (C == -1) {
            return charset;
        }
        if (C == 0) {
            Charset charset3 = StandardCharsets.UTF_8;
            j.e(charset3, "UTF_8");
            return charset3;
        }
        if (C == 1) {
            Charset charset4 = StandardCharsets.UTF_16BE;
            j.e(charset4, "UTF_16BE");
            return charset4;
        }
        if (C == 2) {
            Charset charset5 = StandardCharsets.UTF_16LE;
            j.e(charset5, "UTF_16LE");
            return charset5;
        }
        if (C == 3) {
            Charset charset6 = AbstractC0721a.f7347a;
            charset2 = AbstractC0721a.f7349c;
            if (charset2 == null) {
                charset2 = Charset.forName("UTF-32BE");
                j.e(charset2, "forName(...)");
                AbstractC0721a.f7349c = charset2;
            }
        } else {
            if (C != 4) {
                throw new AssertionError();
            }
            Charset charset7 = AbstractC0721a.f7347a;
            charset2 = AbstractC0721a.f7348b;
            if (charset2 == null) {
                charset2 = Charset.forName("UTF-32LE");
                j.e(charset2, "forName(...)");
                AbstractC0721a.f7348b = charset2;
            }
        }
        return charset2;
    }

    public static final int s(z zVar) {
        j.f(zVar, "<this>");
        return (zVar.d() & 255) | ((zVar.d() & 255) << 16) | ((zVar.d() & 255) << 8);
    }

    public static final boolean t(F f3, int i3, TimeUnit timeUnit) {
        j.f(timeUnit, "timeUnit");
        long nanoTime = System.nanoTime();
        long c2 = f3.c().e() ? f3.c().c() - nanoTime : Long.MAX_VALUE;
        f3.c().d(Math.min(c2, timeUnit.toNanos(i3)) + nanoTime);
        try {
            C0231f c0231f = new C0231f();
            while (f3.f(c0231f, 8192L) != -1) {
                c0231f.v(c0231f.f4409e);
            }
            if (c2 == Long.MAX_VALUE) {
                f3.c().a();
            } else {
                f3.c().d(nanoTime + c2);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (c2 == Long.MAX_VALUE) {
                f3.c().a();
            } else {
                f3.c().d(nanoTime + c2);
            }
            return false;
        } catch (Throwable th) {
            if (c2 == Long.MAX_VALUE) {
                f3.c().a();
            } else {
                f3.c().d(nanoTime + c2);
            }
            throw th;
        }
    }

    public static final l u(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0204b c0204b = (C0204b) it.next();
            String o3 = c0204b.f3586a.o();
            String o4 = c0204b.f3587b.o();
            arrayList.add(o3);
            arrayList.add(AbstractC0730j.Y(o4).toString());
        }
        return new l((String[]) arrayList.toArray(new String[0]));
    }

    public static final String v(n nVar, boolean z3) {
        j.f(nVar, "<this>");
        String str = nVar.f2218d;
        if (AbstractC0730j.C(str, ":")) {
            str = "[" + str + ']';
        }
        int i3 = nVar.f2219e;
        if (!z3) {
            String str2 = nVar.f2215a;
            j.f(str2, "scheme");
            if (i3 == (str2.equals("http") ? 80 : str2.equals("https") ? 443 : -1)) {
                return str;
            }
        }
        return str + ':' + i3;
    }

    public static final List w(List list) {
        j.f(list, "<this>");
        List unmodifiableList = Collections.unmodifiableList(S1.l.b1(list));
        j.e(unmodifiableList, "unmodifiableList(toMutableList())");
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
        j.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }
}
