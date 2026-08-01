package j1;

import H0.e;
import X0.d;
import X0.g;
import i1.k;
import i1.m;
import i1.p;
import i1.q;
import i1.u;
import i1.v;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
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
import p1.C0285b;
import q1.l;
import v1.f;
import v1.i;
import v1.n;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f2604a;

    /* renamed from: b, reason: collision with root package name */
    public static final k f2605b = l.F(new String[0]);

    /* renamed from: c, reason: collision with root package name */
    public static final v f2606c;
    public static final TimeZone d;

    /* renamed from: e, reason: collision with root package name */
    public static final g f2607e;

    /* renamed from: f, reason: collision with root package name */
    public static final String f2608f;

    /* JADX WARN: Code restructure failed: missing block: B:79:0x0199, code lost:
    
        continue;
     */
    static {
        int i;
        byte[] bArr = new byte[0];
        f2604a = bArr;
        f fVar = new f();
        fVar.p(0, 0, bArr);
        long j2 = 0;
        f2606c = new v(j2, fVar, 0);
        if (j2 < 0 || j2 > j2 || 0 < j2) {
            throw new ArrayIndexOutOfBoundsException();
        }
        i iVar = i.d;
        i[] iVarArr = {e.g("efbbbf"), e.g("feff"), e.g("fffe"), e.g("0000ffff"), e.g("ffff0000")};
        ArrayList arrayList = new ArrayList(new Q0.e(iVarArr, false));
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
        ArrayList arrayList3 = copyOf.length == 0 ? new ArrayList() : new ArrayList(new Q0.e(copyOf, true));
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
        q.b(0L, fVar2, 0, arrayList, 0, arrayList.size(), arrayList3);
        int[] iArr = new int[(int) (fVar2.f4074b / 4)];
        int i11 = 0;
        while (!fVar2.e()) {
            iArr[i11] = fVar2.j();
            i11++;
        }
        Object[] copyOf2 = Arrays.copyOf(iVarArr, 5);
        d.d(copyOf2, "copyOf(this, size)");
        new n((i[]) copyOf2);
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        d.b(timeZone);
        d = timeZone;
        f2607e = new g(1);
        String t02 = e1.d.t0(p.class.getName(), "okhttp3.");
        if (t02.endsWith("Client")) {
            t02 = t02.substring(0, t02.length() - 6);
            d.d(t02, "substring(...)");
        }
        f2608f = t02;
    }

    public static final boolean a(m mVar, m mVar2) {
        d.e(mVar, "<this>");
        d.e(mVar2, "other");
        return d.a(mVar.d, mVar2.d) && mVar.f2456e == mVar2.f2456e && d.a(mVar.f2453a, mVar2.f2453a);
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
            if (e1.d.j0(str2, str.charAt(i))) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final boolean f(v1.v vVar, TimeUnit timeUnit) {
        d.e(timeUnit, "timeUnit");
        try {
            return r(vVar, 100, timeUnit);
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

    public static final long i(u uVar) {
        String a2 = uVar.f2527f.a("Content-Length");
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
        List list;
        d.e(objArr, "elements");
        Object[] objArr2 = (Object[]) objArr.clone();
        Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length);
        d.e(copyOf, "elements");
        if (copyOf.length > 0) {
            list = Arrays.asList(copyOf);
            d.d(list, "asList(...)");
        } else {
            list = Q0.q.f671a;
        }
        List unmodifiableList = Collections.unmodifiableList(list);
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

    public static final int q(v1.p pVar) {
        d.e(pVar, "<this>");
        return (pVar.g() & 255) | ((pVar.g() & 255) << 16) | ((pVar.g() & 255) << 8);
    }

    public static final boolean r(v1.v vVar, int i, TimeUnit timeUnit) {
        d.e(timeUnit, "timeUnit");
        long nanoTime = System.nanoTime();
        long c2 = vVar.a().e() ? vVar.a().c() - nanoTime : Long.MAX_VALUE;
        vVar.a().d(Math.min(c2, timeUnit.toNanos(i)) + nanoTime);
        try {
            f fVar = new f();
            while (vVar.b(fVar, 8192L) != -1) {
                fVar.m(fVar.f4074b);
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

    public static final k s(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0285b c0285b = (C0285b) it.next();
            String h = c0285b.f3406a.h();
            String h2 = c0285b.f3407b.h();
            arrayList.add(h);
            arrayList.add(e1.d.y0(h2).toString());
        }
        return new k((String[]) arrayList.toArray(new String[0]));
    }

    public static final String t(m mVar, boolean z2) {
        d.e(mVar, "<this>");
        String str = mVar.d;
        if (e1.d.k0(str, ":")) {
            str = "[" + str + ']';
        }
        int i = mVar.f2456e;
        if (!z2) {
            String str2 = mVar.f2453a;
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

    public static final String w(String str, int i, int i2) {
        int l2 = l(str, i, i2);
        String substring = str.substring(l2, m(str, l2, i2));
        d.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }
}
