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

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public abstract class zk0 {
    public static final byte[] a;
    public static final bt b = gk0.z(new String[0]);
    public static final w90 c;
    public static final f50 d;
    public static final TimeZone e;
    public static final d90 f;
    public static final String g;

    /* JADX WARN: Code restructure failed: missing block: B:65:0x016d, code lost:
    
        continue;
     */
    static {
        int i;
        byte[] bArr = new byte[0];
        a = bArr;
        t9 t9Var = new t9();
        t9Var.R(0, bArr);
        c = new w90(0L, t9Var);
        y9 y9Var = y9.i;
        y9[] y9VarArr = {sl.g("efbbbf"), sl.g("feff"), sl.g("fffe"), sl.g("0000ffff"), sl.g("ffff0000")};
        ArrayList arrayList = new ArrayList(new y6(y9VarArr, false));
        if (arrayList.size() > 1) {
            Collections.sort(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(5);
        for (int i2 = 0; i2 < 5; i2++) {
            y9 y9Var2 = y9VarArr[i2];
            arrayList2.add(-1);
        }
        Integer[] numArr = (Integer[]) arrayList2.toArray(new Integer[0]);
        Object[] copyOf = Arrays.copyOf(numArr, numArr.length);
        ArrayList arrayList3 = copyOf.length == 0 ? new ArrayList() : new ArrayList(new y6(copyOf, true));
        int i3 = 0;
        int i4 = 0;
        while (i3 < 5) {
            y9 y9Var3 = y9VarArr[i3];
            int i5 = i4 + 1;
            int size = arrayList.size();
            int size2 = arrayList.size();
            if (size < 0) {
                s9.d(size, ").", "fromIndex (0) is greater than toIndex (");
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
                int j = mv.j((Comparable) arrayList.get(i), y9Var3);
                if (j < 0) {
                    i7 = i + 1;
                } else if (j > 0) {
                    i6 = i - 1;
                }
            }
            arrayList3.set(i, Integer.valueOf(i4));
            i3++;
            i4 = i5;
        }
        if (((y9) arrayList.get(0)).a() <= 0) {
            s9.k("the empty byte string is not a supported option");
            return;
        }
        int i8 = 0;
        while (i8 < arrayList.size()) {
            y9 y9Var4 = (y9) arrayList.get(i8);
            int i9 = i8 + 1;
            int i10 = i9;
            while (i10 < arrayList.size()) {
                y9 y9Var5 = (y9) arrayList.get(i10);
                y9Var5.getClass();
                y9Var4.getClass();
                if (y9Var5.f(y9Var4, y9Var4.a())) {
                    if (y9Var5.a() == y9Var4.a()) {
                        throw new IllegalArgumentException(("duplicate option: " + y9Var5).toString());
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
        t9 t9Var2 = new t9();
        d50.d(0L, t9Var2, 0, arrayList, 0, arrayList.size(), arrayList3);
        int[] iArr = new int[(int) (t9Var2.g / 4)];
        int i11 = 0;
        while (!t9Var2.n()) {
            iArr[i11] = t9Var2.readInt();
            i11++;
        }
        d = new f50((y9[]) Arrays.copyOf(y9VarArr, 5), iArr);
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        timeZone.getClass();
        e = timeZone;
        f = new d90();
        String B = mf0.B(o40.class.getName(), "okhttp3.");
        if (B.endsWith("Client")) {
            B = B.substring(0, B.length() - 6);
        }
        g = B;
    }

    public static final boolean a(ou ouVar, ou ouVar2) {
        ouVar.getClass();
        ouVar2.getClass();
        return mv.c(ouVar.d, ouVar2.d) && ouVar.e == ouVar2.e && mv.c(ouVar.a, ouVar2.a);
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
            if (!mv.c(e3.getMessage(), "bio == null")) {
                throw e3;
            }
        } catch (Exception unused) {
        }
    }

    public static final int d(int i, int i2, String str, String str2) {
        while (i < i2) {
            if (mf0.s(str2, str.charAt(i))) {
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

    public static final long h(v90 v90Var) {
        String a2 = v90Var.k.a("Content-Length");
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
        List unmodifiableList = Collections.unmodifiableList(vc.f0(Arrays.copyOf(objArr2, objArr2.length)));
        unmodifiableList.getClass();
        return unmodifiableList;
    }

    public static final int j(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (mv.i(charAt, 31) <= 0 || mv.i(charAt, 127) >= 0) {
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

    public static final Charset p(w9 w9Var, Charset charset) {
        w9Var.getClass();
        charset.getClass();
        int B = w9Var.B(d);
        if (B == -1) {
            return charset;
        }
        if (B == 0) {
            Charset charset2 = StandardCharsets.UTF_8;
            charset2.getClass();
            return charset2;
        }
        if (B == 1) {
            Charset charset3 = StandardCharsets.UTF_16BE;
            charset3.getClass();
            return charset3;
        }
        if (B == 2) {
            Charset charset4 = StandardCharsets.UTF_16LE;
            charset4.getClass();
            return charset4;
        }
        if (B == 3) {
            Charset charset5 = fb.a;
            Charset charset6 = fb.c;
            if (charset6 != null) {
                return charset6;
            }
            Charset forName = Charset.forName("UTF-32BE");
            forName.getClass();
            fb.c = forName;
            return forName;
        }
        if (B != 4) {
            throw new AssertionError();
        }
        Charset charset7 = fb.a;
        Charset charset8 = fb.b;
        if (charset8 != null) {
            return charset8;
        }
        Charset forName2 = Charset.forName("UTF-32LE");
        forName2.getClass();
        fb.b = forName2;
        return forName2;
    }

    public static final int q(w9 w9Var) {
        w9Var.getClass();
        return (w9Var.readByte() & 255) | ((w9Var.readByte() & 255) << 16) | ((w9Var.readByte() & 255) << 8);
    }

    public static final boolean r(ke0 ke0Var, int i) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeUnit.getClass();
        long nanoTime = System.nanoTime();
        long c2 = ke0Var.a().e() ? ke0Var.a().c() - nanoTime : Long.MAX_VALUE;
        ke0Var.a().d(Math.min(c2, timeUnit.toNanos(i)) + nanoTime);
        try {
            t9 t9Var = new t9();
            while (ke0Var.c(8192L, t9Var) != -1) {
                t9Var.skip(t9Var.g);
            }
            if (c2 == Long.MAX_VALUE) {
                ke0Var.a().a();
                return true;
            }
            ke0Var.a().d(nanoTime + c2);
            return true;
        } catch (InterruptedIOException unused) {
            if (c2 == Long.MAX_VALUE) {
                ke0Var.a().a();
                return false;
            }
            ke0Var.a().d(nanoTime + c2);
            return false;
        } catch (Throwable th) {
            if (c2 == Long.MAX_VALUE) {
                ke0Var.a().a();
            } else {
                ke0Var.a().d(nanoTime + c2);
            }
            throw th;
        }
    }

    public static final bt s(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            xs xsVar = (xs) it.next();
            y9 y9Var = xsVar.a;
            y9 y9Var2 = xsVar.b;
            String h = y9Var.h();
            String h2 = y9Var2.h();
            arrayList.add(h);
            arrayList.add(mf0.E(h2).toString());
        }
        return new bt((String[]) arrayList.toArray(new String[0]));
    }

    public static final String t(ou ouVar, boolean z) {
        ouVar.getClass();
        int i = ouVar.e;
        String str = ouVar.d;
        if (mf0.t(str, ":")) {
            str = "[" + str + ']';
        }
        if (!z) {
            String str2 = ouVar.a;
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
