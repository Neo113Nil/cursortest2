package d3;

import b3.e;
import c3.k;
import c3.m;
import c3.q;
import c3.u;
import c3.v;
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
import k3.d;
import l0.g;
import n2.o;
import p3.f;
import p3.h;
import p3.i;
import p3.n;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f1490a;

    /* renamed from: b, reason: collision with root package name */
    public static final k f1491b = d.Q(new String[0]);
    public static final v c;

    /* renamed from: d, reason: collision with root package name */
    public static final n f1492d;

    /* renamed from: e, reason: collision with root package name */
    public static final TimeZone f1493e;

    /* renamed from: f, reason: collision with root package name */
    public static final b3.d f1494f;
    public static final String g;

    /* JADX WARN: Code restructure failed: missing block: B:79:0x019e, code lost:
    
        continue;
     */
    static {
        int i4;
        byte[] bArr = new byte[0];
        f1490a = bArr;
        f fVar = new f();
        fVar.v(bArr, 0);
        long j4 = 0;
        c = new v(j4, fVar);
        if (j4 < 0 || j4 > j4 || 0 < j4) {
            throw new ArrayIndexOutOfBoundsException();
        }
        i iVar = i.f3029i;
        i[] iVarArr = {g2.f.j("efbbbf"), g2.f.j("feff"), g2.f.j("fffe"), g2.f.j("0000ffff"), g2.f.j("ffff0000")};
        ArrayList arrayList = new ArrayList(new n2.d(iVarArr, false));
        if (arrayList.size() > 1) {
            Collections.sort(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(5);
        for (int i5 = 0; i5 < 5; i5++) {
            i iVar2 = iVarArr[i5];
            arrayList2.add(-1);
        }
        Integer[] numArr = (Integer[]) arrayList2.toArray(new Integer[0]);
        Object[] copyOf = Arrays.copyOf(numArr, numArr.length);
        u2.c.e(copyOf, "elements");
        ArrayList arrayList3 = copyOf.length == 0 ? new ArrayList() : new ArrayList(new n2.d(copyOf, true));
        int i6 = 0;
        int i7 = 0;
        while (i6 < 5) {
            i iVar3 = iVarArr[i6];
            int i8 = i7 + 1;
            int size = arrayList.size();
            int size2 = arrayList.size();
            if (size < 0) {
                throw new IllegalArgumentException("fromIndex (0) is greater than toIndex (" + size + ").");
            }
            if (size > size2) {
                throw new IndexOutOfBoundsException("toIndex (" + size + ") is greater than size (" + size2 + ").");
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
                int compareTo = comparable == iVar3 ? 0 : comparable == null ? -1 : iVar3 == null ? 1 : comparable.compareTo(iVar3);
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
        if (((i) arrayList.get(0)).a() <= 0) {
            throw new IllegalArgumentException("the empty byte string is not a supported option");
        }
        int i11 = 0;
        while (i11 < arrayList.size()) {
            i iVar4 = (i) arrayList.get(i11);
            int i12 = i11 + 1;
            int i13 = i12;
            while (i13 < arrayList.size()) {
                i iVar5 = (i) arrayList.get(i13);
                iVar5.getClass();
                u2.c.e(iVar4, "prefix");
                if (iVar5.f(iVar4, iVar4.a())) {
                    if (iVar5.a() == iVar4.a()) {
                        throw new IllegalArgumentException(("duplicate option: " + iVar5).toString());
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
        f fVar2 = new f();
        g.c(0L, fVar2, 0, arrayList, 0, arrayList.size(), arrayList3);
        int[] iArr = new int[(int) (fVar2.g / 4)];
        int i14 = 0;
        while (!fVar2.n()) {
            iArr[i14] = fVar2.readInt();
            i14++;
        }
        Object[] copyOf2 = Arrays.copyOf(iVarArr, 5);
        u2.c.d(copyOf2, "copyOf(this, size)");
        f1492d = new n((i[]) copyOf2, iArr);
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        u2.c.b(timeZone);
        f1493e = timeZone;
        f1494f = new b3.d(0);
        String m02 = e.m0(q.class.getName(), "okhttp3.");
        if (m02.endsWith("Client")) {
            m02 = m02.substring(0, m02.length() - 6);
            u2.c.d(m02, "substring(...)");
        }
        g = m02;
    }

    public static final boolean a(m mVar, m mVar2) {
        u2.c.e(mVar, "<this>");
        u2.c.e(mVar2, "other");
        return u2.c.a(mVar.f1078d, mVar2.f1078d) && mVar.f1079e == mVar2.f1079e && u2.c.a(mVar.f1076a, mVar2.f1076a);
    }

    public static final void b(Closeable closeable) {
        u2.c.e(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e4) {
            throw e4;
        } catch (Exception unused) {
        }
    }

    public static final void c(Socket socket) {
        u2.c.e(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e4) {
            throw e4;
        } catch (RuntimeException e5) {
            if (!u2.c.a(e5.getMessage(), "bio == null")) {
                throw e5;
            }
        } catch (Exception unused) {
        }
    }

    public static final int d(String str, char c4, int i4, int i5) {
        while (i4 < i5) {
            if (str.charAt(i4) == c4) {
                return i4;
            }
            i4++;
        }
        return i5;
    }

    public static final int e(String str, String str2, int i4, int i5) {
        while (i4 < i5) {
            if (e.c0(str2, str.charAt(i4))) {
                return i4;
            }
            i4++;
        }
        return i5;
    }

    public static final String f(String str, Object... objArr) {
        u2.c.e(str, "format");
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
        u2.c.e(strArr, "<this>");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            int length = strArr.length;
            int i4 = 0;
            while (i4 < length) {
                String str = strArr[i4];
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

    public static final long h(u uVar) {
        String a4 = uVar.f1144k.a("Content-Length");
        if (a4 == null) {
            return -1L;
        }
        try {
            return Long.parseLong(a4);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static final List i(Object... objArr) {
        List list;
        u2.c.e(objArr, "elements");
        Object[] objArr2 = (Object[]) objArr.clone();
        Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length);
        u2.c.e(copyOf, "elements");
        if (copyOf.length > 0) {
            list = Arrays.asList(copyOf);
            u2.c.d(list, "asList(...)");
        } else {
            list = o.f2953f;
        }
        List unmodifiableList = Collections.unmodifiableList(list);
        u2.c.d(unmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return unmodifiableList;
    }

    public static final int j(String str) {
        int length = str.length();
        for (int i4 = 0; i4 < length; i4++) {
            char charAt = str.charAt(i4);
            if (u2.c.f(charAt, 31) <= 0 || u2.c.f(charAt, 127) >= 0) {
                return i4;
            }
        }
        return -1;
    }

    public static final int k(String str, int i4, int i5) {
        while (i4 < i5) {
            char charAt = str.charAt(i4);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i4;
            }
            i4++;
        }
        return i5;
    }

    public static final int l(String str, int i4, int i5) {
        int i6 = i5 - 1;
        if (i4 <= i6) {
            while (true) {
                char charAt = str.charAt(i6);
                if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                    return i6 + 1;
                }
                if (i6 == i4) {
                    break;
                }
                i6--;
            }
        }
        return i4;
    }

    public static final String[] m(String[] strArr, String[] strArr2, Comparator comparator) {
        u2.c.e(strArr2, "other");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i4]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i4++;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final boolean n(String str) {
        u2.c.e(str, "name");
        return str.equalsIgnoreCase("Authorization") || str.equalsIgnoreCase("Cookie") || str.equalsIgnoreCase("Proxy-Authorization") || str.equalsIgnoreCase("Set-Cookie");
    }

    public static final int o(char c4) {
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

    public static final Charset p(h hVar, Charset charset) {
        u2.c.e(hVar, "<this>");
        u2.c.e(charset, "default");
        int g4 = hVar.g(f1492d);
        if (g4 == -1) {
            return charset;
        }
        if (g4 == 0) {
            Charset charset2 = StandardCharsets.UTF_8;
            u2.c.d(charset2, "UTF_8");
            return charset2;
        }
        if (g4 == 1) {
            Charset charset3 = StandardCharsets.UTF_16BE;
            u2.c.d(charset3, "UTF_16BE");
            return charset3;
        }
        if (g4 == 2) {
            Charset charset4 = StandardCharsets.UTF_16LE;
            u2.c.d(charset4, "UTF_16LE");
            return charset4;
        }
        if (g4 == 3) {
            Charset charset5 = b3.a.f967a;
            Charset charset6 = b3.a.c;
            if (charset6 != null) {
                return charset6;
            }
            Charset forName = Charset.forName("UTF-32BE");
            u2.c.d(forName, "forName(...)");
            b3.a.c = forName;
            return forName;
        }
        if (g4 != 4) {
            throw new AssertionError();
        }
        Charset charset7 = b3.a.f967a;
        Charset charset8 = b3.a.f968b;
        if (charset8 != null) {
            return charset8;
        }
        Charset forName2 = Charset.forName("UTF-32LE");
        u2.c.d(forName2, "forName(...)");
        b3.a.f968b = forName2;
        return forName2;
    }

    public static final int q(h hVar) {
        u2.c.e(hVar, "<this>");
        return (hVar.readByte() & 255) | ((hVar.readByte() & 255) << 16) | ((hVar.readByte() & 255) << 8);
    }

    public static final boolean r(p3.v vVar, int i4) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        u2.c.e(timeUnit, "timeUnit");
        long nanoTime = System.nanoTime();
        long c4 = vVar.a().e() ? vVar.a().c() - nanoTime : Long.MAX_VALUE;
        vVar.a().d(Math.min(c4, timeUnit.toNanos(i4)) + nanoTime);
        try {
            f fVar = new f();
            while (vVar.c(8192L, fVar) != -1) {
                fVar.skip(fVar.g);
            }
            if (c4 == Long.MAX_VALUE) {
                vVar.a().a();
                return true;
            }
            vVar.a().d(nanoTime + c4);
            return true;
        } catch (InterruptedIOException unused) {
            if (c4 == Long.MAX_VALUE) {
                vVar.a().a();
                return false;
            }
            vVar.a().d(nanoTime + c4);
            return false;
        } catch (Throwable th) {
            if (c4 == Long.MAX_VALUE) {
                vVar.a().a();
            } else {
                vVar.a().d(nanoTime + c4);
            }
            throw th;
        }
    }

    public static final k s(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            j3.b bVar = (j3.b) it.next();
            i iVar = bVar.f2406a;
            i iVar2 = bVar.f2407b;
            String h = iVar.h();
            String h4 = iVar2.h();
            arrayList.add(h);
            arrayList.add(e.q0(h4).toString());
        }
        return new k((String[]) arrayList.toArray(new String[0]));
    }

    public static final String t(m mVar, boolean z3) {
        u2.c.e(mVar, "<this>");
        int i4 = mVar.f1079e;
        String str = mVar.f1078d;
        if (e.d0(str, ":")) {
            str = "[" + str + ']';
        }
        if (!z3) {
            String str2 = mVar.f1076a;
            u2.c.e(str2, "scheme");
            if (i4 == (str2.equals("http") ? 80 : str2.equals("https") ? 443 : -1)) {
                return str;
            }
        }
        return str + ':' + i4;
    }

    public static final List u(List list) {
        u2.c.e(list, "<this>");
        List unmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        u2.c.d(unmodifiableList, "unmodifiableList(toMutableList())");
        return unmodifiableList;
    }

    public static final int v(String str, int i4) {
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
        return i4;
    }

    public static final String w(String str, int i4, int i5) {
        int k4 = k(str, i4, i5);
        String substring = str.substring(k4, l(str, k4, i5));
        u2.c.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }
}
