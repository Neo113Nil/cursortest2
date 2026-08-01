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

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public abstract class r70 {
    public static final byte[] a;
    public static final ym b = zo.z(new String[0]);
    public static final j00 c;
    public static final lw d;
    public static final TimeZone e;
    public static final qz f;
    public static final String g;

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0179, code lost:
    
        continue;
     */
    static {
        int i;
        byte[] bArr = new byte[0];
        a = bArr;
        u8 u8Var = new u8();
        u8Var.u(bArr, 0);
        c = new j00(0L, u8Var);
        y8 y8Var = y8.i;
        y8[] y8VarArr = {dh.h("efbbbf"), dh.h("feff"), dh.h("fffe"), dh.h("0000ffff"), dh.h("ffff0000")};
        ArrayList arrayList = new ArrayList(new f6(y8VarArr, false));
        if (arrayList.size() > 1) {
            Collections.sort(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(5);
        for (int i2 = 0; i2 < 5; i2++) {
            y8 y8Var2 = y8VarArr[i2];
            arrayList2.add(-1);
        }
        Integer[] numArr = (Integer[]) arrayList2.toArray(new Integer[0]);
        Object[] copyOf = Arrays.copyOf(numArr, numArr.length);
        ArrayList arrayList3 = copyOf.length == 0 ? new ArrayList() : new ArrayList(new f6(copyOf, true));
        int i3 = 0;
        int i4 = 0;
        while (i3 < 5) {
            y8 y8Var3 = y8VarArr[i3];
            int i5 = i4 + 1;
            int size = arrayList.size();
            int size2 = arrayList.size();
            if (size < 0) {
                t8.d(size, ").", "fromIndex (0) is greater than toIndex (");
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
                int compareTo = comparable == y8Var3 ? 0 : comparable == null ? -1 : y8Var3 == null ? 1 : comparable.compareTo(y8Var3);
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
        if (((y8) arrayList.get(0)).a() <= 0) {
            t8.k("the empty byte string is not a supported option");
            return;
        }
        int i8 = 0;
        while (i8 < arrayList.size()) {
            y8 y8Var4 = (y8) arrayList.get(i8);
            int i9 = i8 + 1;
            int i10 = i9;
            while (i10 < arrayList.size()) {
                y8 y8Var5 = (y8) arrayList.get(i10);
                y8Var5.getClass();
                y8Var4.getClass();
                if (y8Var5.f(y8Var4, y8Var4.a())) {
                    if (y8Var5.a() == y8Var4.a()) {
                        throw new IllegalArgumentException(("duplicate option: " + y8Var5).toString());
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
        u8 u8Var2 = new u8();
        jw.k(0L, u8Var2, 0, arrayList, 0, arrayList.size(), arrayList3);
        int[] iArr = new int[(int) (u8Var2.g / 4)];
        int i11 = 0;
        while (!u8Var2.n()) {
            iArr[i11] = u8Var2.readInt();
            i11++;
        }
        d = new lw((y8[]) Arrays.copyOf(y8VarArr, 5), iArr);
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        timeZone.getClass();
        e = timeZone;
        f = new qz(1);
        String v0 = c40.v0(uv.class.getName(), "okhttp3.");
        if (v0.endsWith("Client")) {
            v0 = v0.substring(0, v0.length() - 6);
        }
        g = v0;
    }

    public static final boolean a(jo joVar, jo joVar2) {
        joVar.getClass();
        joVar2.getClass();
        return zo.b(joVar.d, joVar2.d) && joVar.e == joVar2.e && zo.b(joVar.a, joVar2.a);
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
            if (!zo.b(e3.getMessage(), "bio == null")) {
                throw e3;
            }
        } catch (Exception unused) {
        }
    }

    public static final int d(int i, int i2, String str, String str2) {
        while (i < i2) {
            if (c40.n0(str2, str.charAt(i))) {
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

    public static final long h(i00 i00Var) {
        String a2 = i00Var.k.a("Content-Length");
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
        List unmodifiableList = Collections.unmodifiableList(cb.F0(Arrays.copyOf(objArr2, objArr2.length)));
        unmodifiableList.getClass();
        return unmodifiableList;
    }

    public static final int j(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (zo.k(charAt, 31) <= 0 || zo.k(charAt, 127) >= 0) {
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

    public static final Charset p(w8 w8Var, Charset charset) {
        w8Var.getClass();
        charset.getClass();
        int g2 = w8Var.g(d);
        if (g2 == -1) {
            return charset;
        }
        if (g2 == 0) {
            Charset charset2 = StandardCharsets.UTF_8;
            charset2.getClass();
            return charset2;
        }
        if (g2 == 1) {
            Charset charset3 = StandardCharsets.UTF_16BE;
            charset3.getClass();
            return charset3;
        }
        if (g2 == 2) {
            Charset charset4 = StandardCharsets.UTF_16LE;
            charset4.getClass();
            return charset4;
        }
        if (g2 == 3) {
            Charset charset5 = z9.a;
            Charset charset6 = z9.c;
            if (charset6 != null) {
                return charset6;
            }
            Charset forName = Charset.forName("UTF-32BE");
            forName.getClass();
            z9.c = forName;
            return forName;
        }
        if (g2 != 4) {
            throw new AssertionError();
        }
        Charset charset7 = z9.a;
        Charset charset8 = z9.b;
        if (charset8 != null) {
            return charset8;
        }
        Charset forName2 = Charset.forName("UTF-32LE");
        forName2.getClass();
        z9.b = forName2;
        return forName2;
    }

    public static final int q(w8 w8Var) {
        w8Var.getClass();
        return (w8Var.readByte() & 255) | ((w8Var.readByte() & 255) << 16) | ((w8Var.readByte() & 255) << 8);
    }

    public static final boolean r(f30 f30Var, int i) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeUnit.getClass();
        long nanoTime = System.nanoTime();
        long c2 = f30Var.a().e() ? f30Var.a().c() - nanoTime : Long.MAX_VALUE;
        f30Var.a().d(Math.min(c2, timeUnit.toNanos(i)) + nanoTime);
        try {
            u8 u8Var = new u8();
            while (f30Var.b(8192L, u8Var) != -1) {
                u8Var.skip(u8Var.g);
            }
            if (c2 == Long.MAX_VALUE) {
                f30Var.a().a();
                return true;
            }
            f30Var.a().d(nanoTime + c2);
            return true;
        } catch (InterruptedIOException unused) {
            if (c2 == Long.MAX_VALUE) {
                f30Var.a().a();
                return false;
            }
            f30Var.a().d(nanoTime + c2);
            return false;
        } catch (Throwable th) {
            if (c2 == Long.MAX_VALUE) {
                f30Var.a().a();
            } else {
                f30Var.a().d(nanoTime + c2);
            }
            throw th;
        }
    }

    public static final ym s(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            um umVar = (um) it.next();
            y8 y8Var = umVar.a;
            y8 y8Var2 = umVar.b;
            String h = y8Var.h();
            String h2 = y8Var2.h();
            arrayList.add(h);
            arrayList.add(c40.y0(h2).toString());
        }
        return new ym((String[]) arrayList.toArray(new String[0]));
    }

    public static final String t(jo joVar, boolean z) {
        joVar.getClass();
        int i = joVar.e;
        String str = joVar.d;
        if (c40.o0(str, ":")) {
            str = "[" + str + ']';
        }
        if (!z) {
            String str2 = joVar.a;
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
