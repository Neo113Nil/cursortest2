package defpackage;

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

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public abstract class cb0 {
    public static final byte[] a;
    public static final kp b = kr.L(new String[0]);
    public static final o30 c;
    public static final oz d;
    public static final TimeZone e;
    public static final t20 f;
    public static final String g;

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0179, code lost:
    
        continue;
     */
    static {
        int i;
        byte[] bArr = new byte[0];
        a = bArr;
        h9 h9Var = new h9();
        h9Var.u(bArr, 0);
        c = new o30(0L, h9Var);
        l9 l9Var = l9.i;
        l9[] l9VarArr = {ej.g("efbbbf"), ej.g("feff"), ej.g("fffe"), ej.g("0000ffff"), ej.g("ffff0000")};
        ArrayList arrayList = new ArrayList(new p6(l9VarArr, false));
        if (arrayList.size() > 1) {
            Collections.sort(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(5);
        for (int i2 = 0; i2 < 5; i2++) {
            l9 l9Var2 = l9VarArr[i2];
            arrayList2.add(-1);
        }
        Integer[] numArr = (Integer[]) arrayList2.toArray(new Integer[0]);
        Object[] copyOf = Arrays.copyOf(numArr, numArr.length);
        ArrayList arrayList3 = copyOf.length == 0 ? new ArrayList() : new ArrayList(new p6(copyOf, true));
        int i3 = 0;
        int i4 = 0;
        while (i3 < 5) {
            l9 l9Var3 = l9VarArr[i3];
            int i5 = i4 + 1;
            int size = arrayList.size();
            int size2 = arrayList.size();
            if (size < 0) {
                g9.c(size, ").", "fromIndex (0) is greater than toIndex (");
                return;
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
                int compareTo = comparable == l9Var3 ? 0 : comparable == null ? -1 : l9Var3 == null ? 1 : comparable.compareTo(l9Var3);
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
        if (((l9) arrayList.get(0)).a() <= 0) {
            g9.i("the empty byte string is not a supported option");
            return;
        }
        int i8 = 0;
        while (i8 < arrayList.size()) {
            l9 l9Var4 = (l9) arrayList.get(i8);
            int i9 = i8 + 1;
            int i10 = i9;
            while (i10 < arrayList.size()) {
                l9 l9Var5 = (l9) arrayList.get(i10);
                l9Var5.getClass();
                l9Var4.getClass();
                if (l9Var5.f(l9Var4, l9Var4.a())) {
                    if (l9Var5.a() == l9Var4.a()) {
                        throw new IllegalArgumentException(("duplicate option: " + l9Var5).toString());
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
        h9 h9Var2 = new h9();
        kr.c(0L, h9Var2, 0, arrayList, 0, arrayList.size(), arrayList3);
        int[] iArr = new int[(int) (h9Var2.g / 4)];
        int i11 = 0;
        while (!h9Var2.g()) {
            iArr[i11] = h9Var2.readInt();
            i11++;
        }
        d = new oz((l9[]) Arrays.copyOf(l9VarArr, 5), iArr);
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        timeZone.getClass();
        e = timeZone;
        f = new t20(1);
        String d0 = f70.d0(xy.class.getName(), "okhttp3.");
        if (d0.endsWith("Client")) {
            d0 = d0.substring(0, d0.length() - 6);
        }
        g = d0;
    }

    public static final boolean a(uq uqVar, uq uqVar2) {
        uqVar.getClass();
        uqVar2.getClass();
        return kr.b(uqVar.d, uqVar2.d) && uqVar.e == uqVar2.e && kr.b(uqVar.a, uqVar2.a);
    }

    public static final void b(Closeable closeable) {
        closeable.getClass();
        try {
            closeable.close();
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception unused) {
        }
    }

    public static final void c(Socket socket) {
        socket.getClass();
        try {
            socket.close();
        } catch (AssertionError e2) {
            throw e2;
        } catch (RuntimeException e3) {
            if (!kr.b(e3.getMessage(), "bio == null")) {
                throw e3;
            }
        } catch (Exception unused) {
        }
    }

    public static final int d(int i, int i2, String str, String str2) {
        while (i < i2) {
            if (f70.V(str2, str.charAt(i))) {
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

    public static final String f(String str, Object... objArr) {
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0036, code lost:
    
        r2 = r2 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean g(String[] strArr, String[] strArr2, Comparator comparator) {
        strArr.getClass();
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

    public static final long h(n30 n30Var) {
        String a2 = n30Var.k.a("Content-Length");
        if (a2 == null) {
            return -1L;
        }
        try {
            return Long.parseLong(a2);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static final List i(Object... objArr) {
        Object[] objArr2 = (Object[]) objArr.clone();
        List unmodifiableList = Collections.unmodifiableList(xb.i0(Arrays.copyOf(objArr2, objArr2.length)));
        unmodifiableList.getClass();
        return unmodifiableList;
    }

    public static final int j(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (kr.k(charAt, 31) <= 0 || kr.k(charAt, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }

    public static final int k(String str, int i, int i2) {
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int l(String str, int i, int i2) {
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

    public static final String[] m(String[] strArr, String[] strArr2, Comparator comparator) {
        strArr2.getClass();
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
        str.getClass();
        return str.equalsIgnoreCase("Authorization") || str.equalsIgnoreCase("Cookie") || str.equalsIgnoreCase("Proxy-Authorization") || str.equalsIgnoreCase("Set-Cookie");
    }

    public static final int o(char c2) {
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

    public static final Charset p(j9 j9Var, Charset charset) {
        j9Var.getClass();
        charset.getClass();
        int j = j9Var.j(d);
        if (j == -1) {
            return charset;
        }
        if (j == 0) {
            Charset charset2 = StandardCharsets.UTF_8;
            charset2.getClass();
            return charset2;
        }
        if (j == 1) {
            Charset charset3 = StandardCharsets.UTF_16BE;
            charset3.getClass();
            return charset3;
        }
        if (j == 2) {
            Charset charset4 = StandardCharsets.UTF_16LE;
            charset4.getClass();
            return charset4;
        }
        if (j == 3) {
            Charset charset5 = la.a;
            Charset charset6 = la.c;
            if (charset6 != null) {
                return charset6;
            }
            Charset forName = Charset.forName("UTF-32BE");
            forName.getClass();
            la.c = forName;
            return forName;
        }
        if (j != 4) {
            throw new AssertionError();
        }
        Charset charset7 = la.a;
        Charset charset8 = la.b;
        if (charset8 != null) {
            return charset8;
        }
        Charset forName2 = Charset.forName("UTF-32LE");
        forName2.getClass();
        la.b = forName2;
        return forName2;
    }

    public static final int q(j9 j9Var) {
        j9Var.getClass();
        return (j9Var.readByte() & 255) | ((j9Var.readByte() & 255) << 16) | ((j9Var.readByte() & 255) << 8);
    }

    public static final boolean r(h60 h60Var, int i) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeUnit.getClass();
        long nanoTime = System.nanoTime();
        long c2 = h60Var.a().e() ? h60Var.a().c() - nanoTime : Long.MAX_VALUE;
        h60Var.a().d(Math.min(c2, timeUnit.toNanos(i)) + nanoTime);
        try {
            h9 h9Var = new h9();
            while (h60Var.b(8192L, h9Var) != -1) {
                h9Var.skip(h9Var.g);
            }
            if (c2 == Long.MAX_VALUE) {
                h60Var.a().a();
                return true;
            }
            h60Var.a().d(nanoTime + c2);
            return true;
        } catch (InterruptedIOException unused) {
            if (c2 == Long.MAX_VALUE) {
                h60Var.a().a();
                return false;
            }
            h60Var.a().d(nanoTime + c2);
            return false;
        } catch (Throwable th) {
            if (c2 == Long.MAX_VALUE) {
                h60Var.a().a();
            } else {
                h60Var.a().d(nanoTime + c2);
            }
            throw th;
        }
    }

    public static final kp s(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            gp gpVar = (gp) it.next();
            l9 l9Var = gpVar.a;
            l9 l9Var2 = gpVar.b;
            String h = l9Var.h();
            String h2 = l9Var2.h();
            arrayList.add(h);
            arrayList.add(f70.g0(h2).toString());
        }
        return new kp((String[]) arrayList.toArray(new String[0]));
    }

    public static final String t(uq uqVar, boolean z) {
        uqVar.getClass();
        int i = uqVar.e;
        String str = uqVar.d;
        if (f70.W(str, ":")) {
            str = "[" + str + ']';
        }
        if (!z) {
            String str2 = uqVar.a;
            str2.getClass();
            if (i == (str2.equals("http") ? 80 : str2.equals("https") ? 443 : -1)) {
                return str;
            }
        }
        return str + ':' + i;
    }

    public static final List u(List list) {
        list.getClass();
        List unmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        unmodifiableList.getClass();
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
}
