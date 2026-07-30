package t7;

import a8.d;
import d6.q;
import e6.m;
import f8.f;
import f8.g0;
import f8.i;
import f8.v;
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
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import s7.k;
import s7.l;
import s7.p;
import s7.s;
import s7.t;
import z6.g;
import z6.h;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f8932a;

    /* renamed from: b, reason: collision with root package name */
    public static final k f8933b = d.O(new String[0]);

    /* renamed from: c, reason: collision with root package name */
    public static final t f8934c;

    /* renamed from: d, reason: collision with root package name */
    public static final v f8935d;

    /* renamed from: e, reason: collision with root package name */
    public static final TimeZone f8936e;

    /* renamed from: f, reason: collision with root package name */
    public static final g f8937f;

    /* renamed from: g, reason: collision with root package name */
    public static final String f8938g;

    /* JADX WARN: Code restructure failed: missing block: B:43:0x011d, code lost:
    
        continue;
     */
    static {
        int i7 = 0;
        byte[] bArr = new byte[0];
        f8932a = bArr;
        f fVar = new f();
        fVar.write(bArr, 0, 0);
        long j8 = 0;
        f8934c = new t(j8, fVar);
        if (j8 < 0 || j8 > j8 || 0 < j8) {
            throw new ArrayIndexOutOfBoundsException();
        }
        i iVar = i.f3600i;
        i[] iVarArr = {m4.f.i("efbbbf"), m4.f.i("feff"), m4.f.i("fffe"), m4.f.i("0000ffff"), m4.f.i("ffff0000")};
        ArrayList arrayList = new ArrayList(new e6.i(iVarArr, false));
        if (arrayList.size() > 1) {
            Collections.sort(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(5);
        for (int i8 = 0; i8 < 5; i8++) {
            i iVar2 = iVarArr[i8];
            arrayList2.add(-1);
        }
        Integer[] numArr = (Integer[]) arrayList2.toArray(new Integer[0]);
        ArrayList Y = m.Y(Arrays.copyOf(numArr, numArr.length));
        int i9 = 0;
        int i10 = 0;
        while (i9 < 5) {
            Y.set(m.V(arrayList, iVarArr[i9]), Integer.valueOf(i10));
            i9++;
            i10++;
        }
        if (((i) arrayList.get(0)).e() <= 0) {
            throw new IllegalArgumentException("the empty byte string is not a supported option");
        }
        int i11 = 0;
        while (i11 < arrayList.size()) {
            i iVar3 = (i) arrayList.get(i11);
            int i12 = i11 + 1;
            int i13 = i12;
            while (i13 < arrayList.size()) {
                i iVar4 = (i) arrayList.get(i13);
                iVar4.getClass();
                r6.k.f(iVar3, "prefix");
                if (iVar4.x(0, iVar3, iVar3.e())) {
                    if (iVar4.e() == iVar3.e()) {
                        throw new IllegalArgumentException(("duplicate option: " + iVar4).toString());
                    }
                    if (((Number) Y.get(i13)).intValue() > ((Number) Y.get(i11)).intValue()) {
                        arrayList.remove(i13);
                        Y.remove(i13);
                    } else {
                        i13++;
                    }
                }
            }
            i11 = i12;
        }
        f fVar2 = new f();
        a8.m.l(0L, fVar2, 0, arrayList, 0, arrayList.size(), Y);
        int[] iArr = new int[(int) (fVar2.f3598g / 4)];
        while (!fVar2.c()) {
            iArr[i7] = fVar2.readInt();
            i7++;
        }
        Object[] copyOf = Arrays.copyOf(iVarArr, 5);
        r6.k.e(copyOf, "copyOf(this, size)");
        f8935d = new v((i[]) copyOf, iArr);
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        r6.k.c(timeZone);
        f8936e = timeZone;
        f8937f = new g("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        f8938g = h.O(h.N(p.class.getName(), "okhttp3."), "Client");
    }

    public static final boolean a(l lVar, l lVar2) {
        r6.k.f(lVar, "<this>");
        r6.k.f(lVar2, "other");
        return r6.k.a(lVar.f8611d, lVar2.f8611d) && lVar.f8612e == lVar2.f8612e && r6.k.a(lVar.f8608a, lVar2.f8608a);
    }

    public static final int b(long j8) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        if (j8 < 0) {
            throw new IllegalStateException("timeout".concat(" < 0").toString());
        }
        if (timeUnit == null) {
            throw new IllegalStateException("unit == null");
        }
        long millis = timeUnit.toMillis(j8);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException("timeout".concat(" too large.").toString());
        }
        if (millis != 0 || j8 <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException("timeout".concat(" too small.").toString());
    }

    public static final void c(Closeable closeable) {
        r6.k.f(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e9) {
            throw e9;
        } catch (Exception unused) {
        }
    }

    public static final void d(Socket socket) {
        r6.k.f(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e9) {
            throw e9;
        } catch (RuntimeException e10) {
            if (!r6.k.a(e10.getMessage(), "bio == null")) {
                throw e10;
            }
        } catch (Exception unused) {
        }
    }

    public static final int e(int i7, int i8, String str, String str2) {
        while (i7 < i8) {
            if (h.x(str2, str.charAt(i7))) {
                return i7;
            }
            i7++;
        }
        return i8;
    }

    public static final int f(String str, char c4, int i7, int i8) {
        while (i7 < i8) {
            if (str.charAt(i7) == c4) {
                return i7;
            }
            i7++;
        }
        return i8;
    }

    public static final String g(String str, Object... objArr) {
        r6.k.f(str, "format");
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
    }

    public static final boolean h(String[] strArr, String[] strArr2, Comparator comparator) {
        r6.k.f(strArr, "<this>");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                q h3 = r6.k.h(strArr2);
                while (h3.hasNext()) {
                    if (comparator.compare(str, (String) h3.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final long i(s sVar) {
        String a3 = sVar.f8688k.a("Content-Length");
        if (a3 == null) {
            return -1L;
        }
        try {
            return Long.parseLong(a3);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static final List j(Object... objArr) {
        r6.k.f(objArr, "elements");
        Object[] objArr2 = (Object[]) objArr.clone();
        List unmodifiableList = Collections.unmodifiableList(m.X(Arrays.copyOf(objArr2, objArr2.length)));
        r6.k.e(unmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return unmodifiableList;
    }

    public static final int k(String str) {
        int length = str.length();
        for (int i7 = 0; i7 < length; i7++) {
            char charAt = str.charAt(i7);
            if (r6.k.g(charAt, 31) <= 0 || r6.k.g(charAt, 127) >= 0) {
                return i7;
            }
        }
        return -1;
    }

    public static final int l(int i7, int i8, String str) {
        while (i7 < i8) {
            char charAt = str.charAt(i7);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i7;
            }
            i7++;
        }
        return i8;
    }

    public static final int m(int i7, int i8, String str) {
        int i9 = i8 - 1;
        if (i7 <= i9) {
            while (true) {
                char charAt = str.charAt(i9);
                if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                    return i9 + 1;
                }
                if (i9 == i7) {
                    break;
                }
                i9--;
            }
        }
        return i7;
    }

    public static final String[] n(String[] strArr, String[] strArr2, Comparator comparator) {
        r6.k.f(strArr2, "other");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i7 = 0;
            while (true) {
                if (i7 >= length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i7]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i7++;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final boolean o(String str) {
        r6.k.f(str, "name");
        return str.equalsIgnoreCase("Authorization") || str.equalsIgnoreCase("Cookie") || str.equalsIgnoreCase("Proxy-Authorization") || str.equalsIgnoreCase("Set-Cookie");
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

    public static final Charset q(f8.h hVar, Charset charset) {
        r6.k.f(hVar, "<this>");
        r6.k.f(charset, "default");
        int M = hVar.M(f8935d);
        if (M == -1) {
            return charset;
        }
        if (M == 0) {
            Charset charset2 = StandardCharsets.UTF_8;
            r6.k.e(charset2, "UTF_8");
            return charset2;
        }
        if (M == 1) {
            Charset charset3 = StandardCharsets.UTF_16BE;
            r6.k.e(charset3, "UTF_16BE");
            return charset3;
        }
        if (M == 2) {
            Charset charset4 = StandardCharsets.UTF_16LE;
            r6.k.e(charset4, "UTF_16LE");
            return charset4;
        }
        if (M == 3) {
            Charset charset5 = z6.a.f10114a;
            Charset charset6 = z6.a.f10116c;
            if (charset6 != null) {
                return charset6;
            }
            Charset forName = Charset.forName("UTF-32BE");
            r6.k.e(forName, "forName(...)");
            z6.a.f10116c = forName;
            return forName;
        }
        if (M != 4) {
            throw new AssertionError();
        }
        Charset charset7 = z6.a.f10114a;
        Charset charset8 = z6.a.f10115b;
        if (charset8 != null) {
            return charset8;
        }
        Charset forName2 = Charset.forName("UTF-32LE");
        r6.k.e(forName2, "forName(...)");
        z6.a.f10115b = forName2;
        return forName2;
    }

    public static final int r(f8.h hVar) {
        r6.k.f(hVar, "<this>");
        return (hVar.readByte() & 255) | ((hVar.readByte() & 255) << 16) | ((hVar.readByte() & 255) << 8);
    }

    public static final boolean s(g0 g0Var, int i7) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        r6.k.f(timeUnit, "timeUnit");
        long nanoTime = System.nanoTime();
        long c4 = g0Var.a().e() ? g0Var.a().c() - nanoTime : Long.MAX_VALUE;
        g0Var.a().d(Math.min(c4, timeUnit.toNanos(i7)) + nanoTime);
        try {
            f fVar = new f();
            while (g0Var.v(8192L, fVar) != -1) {
                fVar.skip(fVar.f3598g);
            }
            if (c4 == Long.MAX_VALUE) {
                g0Var.a().a();
                return true;
            }
            g0Var.a().d(nanoTime + c4);
            return true;
        } catch (InterruptedIOException unused) {
            if (c4 == Long.MAX_VALUE) {
                g0Var.a().a();
                return false;
            }
            g0Var.a().d(nanoTime + c4);
            return false;
        } catch (Throwable th) {
            if (c4 == Long.MAX_VALUE) {
                g0Var.a().a();
            } else {
                g0Var.a().d(nanoTime + c4);
            }
            throw th;
        }
    }

    public static final k t(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            z7.b bVar = (z7.b) it.next();
            i iVar = bVar.f10139a;
            i iVar2 = bVar.f10140b;
            String C = iVar.C();
            String C2 = iVar2.C();
            arrayList.add(C);
            arrayList.add(h.W(C2).toString());
        }
        return new k((String[]) arrayList.toArray(new String[0]));
    }

    public static final String u(l lVar, boolean z8) {
        r6.k.f(lVar, "<this>");
        int i7 = lVar.f8612e;
        String str = lVar.f8611d;
        if (h.y(str, ":")) {
            str = "[" + str + ']';
        }
        if (!z8) {
            String str2 = lVar.f8608a;
            r6.k.f(str2, "scheme");
            if (i7 == (str2.equals("http") ? 80 : str2.equals("https") ? 443 : -1)) {
                return str;
            }
        }
        return str + ':' + i7;
    }

    public static final List v(List list) {
        r6.k.f(list, "<this>");
        List unmodifiableList = Collections.unmodifiableList(e6.l.x0(list));
        r6.k.e(unmodifiableList, "unmodifiableList(toMutableList())");
        return unmodifiableList;
    }

    public static final int w(String str, int i7) {
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
        return i7;
    }

    public static final String x(int i7, int i8, String str) {
        int l8 = l(i7, i8, str);
        String substring = str.substring(l8, m(l8, i8, str));
        r6.k.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }
}
