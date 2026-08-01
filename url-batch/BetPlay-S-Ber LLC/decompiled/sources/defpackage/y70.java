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

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public abstract class y70 {
    public static final byte[] a;
    public static final nn b = l70.B(new String[0]);
    public static final z00 c;
    public static final xw d;
    public static final TimeZone e;
    public static final f00 f;
    public static final String g;

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0179, code lost:
    
        continue;
     */
    static {
        int i;
        byte[] bArr = new byte[0];
        a = bArr;
        p8 p8Var = new p8();
        p8Var.u(bArr, 0);
        c = new z00(0L, p8Var);
        t8 t8Var = t8.i;
        t8[] t8VarArr = {vg.h("efbbbf"), vg.h("feff"), vg.h("fffe"), vg.h("0000ffff"), vg.h("ffff0000")};
        ArrayList arrayList = new ArrayList(new w6(t8VarArr, false));
        if (arrayList.size() > 1) {
            Collections.sort(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(5);
        for (int i2 = 0; i2 < 5; i2++) {
            t8 t8Var2 = t8VarArr[i2];
            arrayList2.add(-1);
        }
        Integer[] numArr = (Integer[]) arrayList2.toArray(new Integer[0]);
        Object[] copyOf = Arrays.copyOf(numArr, numArr.length);
        ArrayList arrayList3 = copyOf.length == 0 ? new ArrayList() : new ArrayList(new w6(copyOf, true));
        int i3 = 0;
        int i4 = 0;
        while (i3 < 5) {
            t8 t8Var3 = t8VarArr[i3];
            int i5 = i4 + 1;
            int size = arrayList.size();
            int size2 = arrayList.size();
            if (size < 0) {
                o8.d(size, ").", "fromIndex (0) is greater than toIndex (");
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
                int compareTo = comparable == t8Var3 ? 0 : comparable == null ? -1 : t8Var3 == null ? 1 : comparable.compareTo(t8Var3);
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
        if (((t8) arrayList.get(0)).a() <= 0) {
            o8.j("the empty byte string is not a supported option");
            return;
        }
        int i8 = 0;
        while (i8 < arrayList.size()) {
            t8 t8Var4 = (t8) arrayList.get(i8);
            int i9 = i8 + 1;
            int i10 = i9;
            while (i10 < arrayList.size()) {
                t8 t8Var5 = (t8) arrayList.get(i10);
                t8Var5.getClass();
                t8Var4.getClass();
                if (t8Var5.f(t8Var4, t8Var4.a())) {
                    if (t8Var5.a() == t8Var4.a()) {
                        throw new IllegalArgumentException(("duplicate option: " + t8Var5).toString());
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
        p8 p8Var2 = new p8();
        l70.a(0L, p8Var2, 0, arrayList, 0, arrayList.size(), arrayList3);
        int[] iArr = new int[(int) (p8Var2.g / 4)];
        int i11 = 0;
        while (!p8Var2.n()) {
            iArr[i11] = p8Var2.readInt();
            i11++;
        }
        d = new xw((t8[]) Arrays.copyOf(t8VarArr, 5), iArr);
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        timeZone.getClass();
        e = timeZone;
        f = new f00(1);
        String n0 = l40.n0(bw.class.getName(), "okhttp3.");
        if (n0.endsWith("Client")) {
            n0 = n0.substring(0, n0.length() - 6);
        }
        g = n0;
    }

    public static final boolean a(yo yoVar, yo yoVar2) {
        yoVar.getClass();
        yoVar2.getClass();
        return op.d(yoVar.d, yoVar2.d) && yoVar.e == yoVar2.e && op.d(yoVar.a, yoVar2.a);
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
            if (!op.d(e3.getMessage(), "bio == null")) {
                throw e3;
            }
        } catch (Exception unused) {
        }
    }

    public static final int d(int i, int i2, String str, String str2) {
        while (i < i2) {
            if (l40.f0(str2, str.charAt(i))) {
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

    public static final long h(y00 y00Var) {
        String a2 = y00Var.k.a("Content-Length");
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
        List unmodifiableList = Collections.unmodifiableList(eb.a0(Arrays.copyOf(objArr2, objArr2.length)));
        unmodifiableList.getClass();
        return unmodifiableList;
    }

    public static final int j(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (op.i(charAt, 31) <= 0 || op.i(charAt, 127) >= 0) {
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

    public static final Charset p(r8 r8Var, Charset charset) {
        r8Var.getClass();
        charset.getClass();
        int g2 = r8Var.g(d);
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
            Charset charset5 = v9.a;
            Charset charset6 = v9.c;
            if (charset6 != null) {
                return charset6;
            }
            Charset forName = Charset.forName("UTF-32BE");
            forName.getClass();
            v9.c = forName;
            return forName;
        }
        if (g2 != 4) {
            throw new AssertionError();
        }
        Charset charset7 = v9.a;
        Charset charset8 = v9.b;
        if (charset8 != null) {
            return charset8;
        }
        Charset forName2 = Charset.forName("UTF-32LE");
        forName2.getClass();
        v9.b = forName2;
        return forName2;
    }

    public static final int q(r8 r8Var) {
        r8Var.getClass();
        return (r8Var.readByte() & 255) | ((r8Var.readByte() & 255) << 16) | ((r8Var.readByte() & 255) << 8);
    }

    public static final boolean r(q30 q30Var, int i) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeUnit.getClass();
        long nanoTime = System.nanoTime();
        long c2 = q30Var.a().e() ? q30Var.a().c() - nanoTime : Long.MAX_VALUE;
        q30Var.a().d(Math.min(c2, timeUnit.toNanos(i)) + nanoTime);
        try {
            p8 p8Var = new p8();
            while (q30Var.b(8192L, p8Var) != -1) {
                p8Var.skip(p8Var.g);
            }
            if (c2 == Long.MAX_VALUE) {
                q30Var.a().a();
                return true;
            }
            q30Var.a().d(nanoTime + c2);
            return true;
        } catch (InterruptedIOException unused) {
            if (c2 == Long.MAX_VALUE) {
                q30Var.a().a();
                return false;
            }
            q30Var.a().d(nanoTime + c2);
            return false;
        } catch (Throwable th) {
            if (c2 == Long.MAX_VALUE) {
                q30Var.a().a();
            } else {
                q30Var.a().d(nanoTime + c2);
            }
            throw th;
        }
    }

    public static final nn s(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            mn mnVar = (mn) it.next();
            t8 t8Var = mnVar.a;
            t8 t8Var2 = mnVar.b;
            String h = t8Var.h();
            String h2 = t8Var2.h();
            arrayList.add(h);
            arrayList.add(l40.q0(h2).toString());
        }
        return new nn((String[]) arrayList.toArray(new String[0]));
    }

    public static final String t(yo yoVar, boolean z) {
        yoVar.getClass();
        int i = yoVar.e;
        String str = yoVar.d;
        if (l40.g0(str, ":")) {
            str = "[" + str + ']';
        }
        if (!z) {
            String str2 = yoVar.a;
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
