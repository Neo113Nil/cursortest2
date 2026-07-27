package n3;

import H1.f;
import M2.C0249a;
import M2.J;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.y;
import m3.l;
import m3.m;
import m3.p;
import m3.r;
import m3.w;
import m3.x;
import n.AbstractC0864b;
import t3.C1212c;
import z2.C1403G;
import z2.C1432p;
import z2.C1441y;
import z3.C1448f;
import z3.C1451i;
import z3.F;
import z3.InterfaceC1450h;
import z3.u;
import z3.z;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f8558a;

    /* renamed from: b, reason: collision with root package name */
    public static final l f8559b = u3.l.o0(new String[0]);

    /* renamed from: c, reason: collision with root package name */
    public static final x f8560c;

    /* renamed from: d, reason: collision with root package name */
    public static final u f8561d;

    /* renamed from: e, reason: collision with root package name */
    public static final TimeZone f8562e;

    /* renamed from: f, reason: collision with root package name */
    public static final Regex f8563f;

    /* renamed from: g, reason: collision with root package name */
    public static final String f8564g;

    /* JADX WARN: Code restructure failed: missing block: B:43:0x013b, code lost:
    
        continue;
     */
    static {
        int i2 = 0;
        byte[] source = new byte[0];
        f8558a = source;
        Intrinsics.checkNotNullParameter(source, "<this>");
        C1448f c1448f = new C1448f();
        Intrinsics.checkNotNullParameter(source, "source");
        c1448f.w(source, 0, 0);
        long j4 = 0;
        Intrinsics.checkNotNullParameter(c1448f, "<this>");
        f8560c = new x((p) null, j4, c1448f);
        Intrinsics.checkNotNullParameter(source, "<this>");
        if (j4 < 0 || j4 > j4 || 0 < j4) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i4 = u.f12034j;
        C1451i c1451i = C1451i.f12000j;
        C1451i[] byteStrings = {f.m("efbbbf"), f.m("feff"), f.m("fffe"), f.m("0000ffff"), f.m("ffff0000")};
        Intrinsics.checkNotNullParameter(byteStrings, "byteStrings");
        Intrinsics.checkNotNullParameter(byteStrings, "<this>");
        Intrinsics.checkNotNullParameter(byteStrings, "<this>");
        ArrayList arrayList = new ArrayList(new C1432p(byteStrings, false));
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        if (arrayList.size() > 1) {
            Collections.sort(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(5);
        for (int i5 = 0; i5 < 5; i5++) {
            C1451i c1451i2 = byteStrings[i5];
            arrayList2.add(-1);
        }
        Integer[] numArr = (Integer[]) arrayList2.toArray(new Integer[0]);
        ArrayList f4 = C1441y.f(Arrays.copyOf(numArr, numArr.length));
        int i6 = 0;
        int i7 = 0;
        while (i6 < 5) {
            f4.set(C1441y.c(arrayList, byteStrings[i6]), Integer.valueOf(i7));
            i6++;
            i7++;
        }
        if (((C1451i) arrayList.get(0)).c() <= 0) {
            throw new IllegalArgumentException("the empty byte string is not a supported option");
        }
        int i8 = 0;
        while (i8 < arrayList.size()) {
            C1451i prefix = (C1451i) arrayList.get(i8);
            int i9 = i8 + 1;
            int i10 = i9;
            while (i10 < arrayList.size()) {
                C1451i c1451i3 = (C1451i) arrayList.get(i10);
                c1451i3.getClass();
                Intrinsics.checkNotNullParameter(prefix, "prefix");
                if (c1451i3.r(0, prefix, prefix.c())) {
                    if (c1451i3.c() == prefix.c()) {
                        throw new IllegalArgumentException(("duplicate option: " + c1451i3).toString());
                    }
                    if (((Number) f4.get(i10)).intValue() > ((Number) f4.get(i8)).intValue()) {
                        arrayList.remove(i10);
                        f4.remove(i10);
                    } else {
                        i10++;
                    }
                }
            }
            i8 = i9;
        }
        C1448f c1448f2 = new C1448f();
        AbstractC0864b.m(0L, c1448f2, 0, arrayList, 0, arrayList.size(), f4);
        int[] iArr = new int[(int) (c1448f2.f11999e / 4)];
        while (!c1448f2.a()) {
            iArr[i2] = c1448f2.k();
            i2++;
        }
        Object[] copyOf = Arrays.copyOf(byteStrings, 5);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        f8561d = new u((C1451i[]) copyOf, iArr);
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        Intrinsics.c(timeZone);
        f8562e = timeZone;
        f8563f = new Regex("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        String name = r.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "OkHttpClient::class.java.name");
        f8564g = y.E(y.D(name, "okhttp3."), "Client");
    }

    public static final boolean a(m mVar, m other) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return Intrinsics.a(mVar.f8396d, other.f8396d) && mVar.f8397e == other.f8397e && Intrinsics.a(mVar.f8393a, other.f8393a);
    }

    public static final int b(long j4, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter("timeout", "name");
        if (j4 < 0) {
            throw new IllegalStateException("timeout < 0".toString());
        }
        if (timeUnit == null) {
            throw new IllegalStateException("unit == null");
        }
        long millis = timeUnit.toMillis(j4);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException("timeout too large.".toString());
        }
        if (millis != 0 || j4 <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException("timeout too small.".toString());
    }

    public static final void c(Closeable closeable) {
        Intrinsics.checkNotNullParameter(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e4) {
            throw e4;
        } catch (Exception unused) {
        }
    }

    public static final void d(Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e4) {
            throw e4;
        } catch (RuntimeException e5) {
            if (!Intrinsics.a(e5.getMessage(), "bio == null")) {
                throw e5;
            }
        } catch (Exception unused) {
        }
    }

    public static final int e(int i2, int i4, String str, String delimiters) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        while (i2 < i4) {
            if (y.o(delimiters, str.charAt(i2))) {
                return i2;
            }
            i2++;
        }
        return i4;
    }

    public static final int f(String str, char c4, int i2, int i4) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        while (i2 < i4) {
            if (str.charAt(i2) == c4) {
                return i2;
            }
            i2++;
        }
        return i4;
    }

    public static final boolean g(F f4, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(f4, "<this>");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        try {
            return t(f4, 100, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final String h(String format, Object... args) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(args, args.length);
        String format2 = String.format(locale, format, Arrays.copyOf(copyOf, copyOf.length));
        Intrinsics.checkNotNullExpressionValue(format2, "format(locale, format, *args)");
        return format2;
    }

    public static final boolean i(String[] strArr, String[] strArr2, Comparator comparator) {
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                C0249a f4 = J.f(strArr2);
                while (f4.hasNext()) {
                    if (comparator.compare(str, (String) f4.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final long j(w wVar) {
        Intrinsics.checkNotNullParameter(wVar, "<this>");
        String e4 = wVar.f8478l.e("Content-Length");
        if (e4 == null) {
            return -1L;
        }
        Intrinsics.checkNotNullParameter(e4, "<this>");
        try {
            return Long.parseLong(e4);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static final List k(Object... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] objArr = (Object[]) elements.clone();
        List unmodifiableList = Collections.unmodifiableList(C1441y.e(Arrays.copyOf(objArr, objArr.length)));
        Intrinsics.checkNotNullExpressionValue(unmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return unmodifiableList;
    }

    public static final int l(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (Intrinsics.e(charAt, 31) <= 0 || Intrinsics.e(charAt, 127) >= 0) {
                return i2;
            }
        }
        return -1;
    }

    public static final int m(String str, int i2, int i4) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        while (i2 < i4) {
            char charAt = str.charAt(i2);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i2;
            }
            i2++;
        }
        return i4;
    }

    public static final int n(String str, int i2, int i4) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int i5 = i4 - 1;
        if (i2 <= i5) {
            while (true) {
                char charAt = str.charAt(i5);
                if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                    return i5 + 1;
                }
                if (i5 == i2) {
                    break;
                }
                i5--;
            }
        }
        return i2;
    }

    public static final String[] o(String[] strArr, String[] other, Comparator comparator) {
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

    public static final boolean p(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return kotlin.text.u.i(true, name, "Authorization") || kotlin.text.u.i(true, name, "Cookie") || kotlin.text.u.i(true, name, "Proxy-Authorization") || kotlin.text.u.i(true, name, "Set-Cookie");
    }

    public static final int q(char c4) {
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

    public static final Charset r(InterfaceC1450h interfaceC1450h, Charset charset) {
        Charset charset2;
        Intrinsics.checkNotNullParameter(interfaceC1450h, "<this>");
        Intrinsics.checkNotNullParameter(charset, "default");
        int q2 = interfaceC1450h.q(f8561d);
        if (q2 == -1) {
            return charset;
        }
        if (q2 == 0) {
            Charset UTF_8 = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
            return UTF_8;
        }
        if (q2 == 1) {
            Charset UTF_16BE = StandardCharsets.UTF_16BE;
            Intrinsics.checkNotNullExpressionValue(UTF_16BE, "UTF_16BE");
            return UTF_16BE;
        }
        if (q2 == 2) {
            Charset UTF_16LE = StandardCharsets.UTF_16LE;
            Intrinsics.checkNotNullExpressionValue(UTF_16LE, "UTF_16LE");
            return UTF_16LE;
        }
        if (q2 == 3) {
            Charsets.f7509a.getClass();
            charset2 = Charsets.f7511c;
            if (charset2 == null) {
                charset2 = Charset.forName("UTF-32BE");
                Intrinsics.checkNotNullExpressionValue(charset2, "forName(...)");
                Charsets.f7511c = charset2;
            }
        } else {
            if (q2 != 4) {
                throw new AssertionError();
            }
            Charsets.f7509a.getClass();
            charset2 = Charsets.f7510b;
            if (charset2 == null) {
                charset2 = Charset.forName("UTF-32LE");
                Intrinsics.checkNotNullExpressionValue(charset2, "forName(...)");
                Charsets.f7510b = charset2;
            }
        }
        return charset2;
    }

    public static final int s(z zVar) {
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        return (zVar.d() & 255) | ((zVar.d() & 255) << 16) | ((zVar.d() & 255) << 8);
    }

    public static final boolean t(F f4, int i2, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(f4, "<this>");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        long nanoTime = System.nanoTime();
        long c4 = f4.c().e() ? f4.c().c() - nanoTime : Long.MAX_VALUE;
        f4.c().d(Math.min(c4, timeUnit.toNanos(i2)) + nanoTime);
        try {
            C1448f c1448f = new C1448f();
            while (f4.l(c1448f, 8192L) != -1) {
                c1448f.s(c1448f.f11999e);
            }
            if (c4 == Long.MAX_VALUE) {
                f4.c().a();
            } else {
                f4.c().d(nanoTime + c4);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (c4 == Long.MAX_VALUE) {
                f4.c().a();
            } else {
                f4.c().d(nanoTime + c4);
            }
            return false;
        } catch (Throwable th) {
            if (c4 == Long.MAX_VALUE) {
                f4.c().a();
            } else {
                f4.c().d(nanoTime + c4);
            }
            throw th;
        }
    }

    public static final l u(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1212c c1212c = (C1212c) it.next();
            String name = c1212c.f10762a.C();
            String value = c1212c.f10763b.C();
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            arrayList.add(name);
            arrayList.add(y.M(value).toString());
        }
        return new l((String[]) arrayList.toArray(new String[0]));
    }

    public static final String v(m mVar, boolean z4) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        boolean p4 = y.p(mVar.f8396d, ":");
        String str = mVar.f8396d;
        if (p4) {
            str = "[" + str + ']';
        }
        int i2 = mVar.f8397e;
        if (!z4) {
            String scheme = mVar.f8393a;
            Intrinsics.checkNotNullParameter(scheme, "scheme");
            if (i2 == (Intrinsics.a(scheme, "http") ? 80 : Intrinsics.a(scheme, "https") ? 443 : -1)) {
                return str;
            }
        }
        return str + ':' + i2;
    }

    public static final List w(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List unmodifiableList = Collections.unmodifiableList(C1403G.I(list));
        Intrinsics.checkNotNullExpressionValue(unmodifiableList, "unmodifiableList(toMutableList())");
        return unmodifiableList;
    }

    public static final int x(int i2, String str) {
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

    public static final String y(String str, int i2, int i4) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int m4 = m(str, i2, i4);
        String substring = str.substring(m4, n(str, m4, i4));
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }
}
