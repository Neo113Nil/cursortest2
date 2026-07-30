package defpackage;

import com.facebook.gamingservices.internal.TournamentShareDialogURIBuilder;
import j$.util.DesugarTimeZone;
import java.io.Closeable;
import java.io.InterruptedIOException;
import java.net.Socket;
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
import kotlin.text.Regex;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class n33 {
    public static final byte[] a;
    public static final mx0 b = z71.J(new String[0]);
    public static final x92 c;
    public static final TimeZone d;
    public static final Regex e;
    public static final String f;

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e8, code lost:
    
        continue;
     */
    static {
        byte[] bArr = new byte[0];
        a = bArr;
        fq fqVar = new fq();
        fqVar.C(0, bArr);
        c = new x92(0L, fqVar);
        int i = tw1.n;
        dr drVar = dr.p;
        dr[] drVarArr = {nj.g("efbbbf"), nj.g("feff"), nj.g("fffe"), nj.g("0000ffff"), nj.g("ffff0000")};
        ArrayList arrayList = new ArrayList(new ai(drVarArr, false));
        uv.m(arrayList);
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList2.add(-1);
        }
        int i3 = 0;
        int i4 = 0;
        while (i3 < 5) {
            arrayList2.set(qv.e(arrayList, drVarArr[i3]), Integer.valueOf(i4));
            i3++;
            i4++;
        }
        if (((dr) arrayList.get(0)).c() <= 0) {
            lh.e("the empty byte string is not a supported option");
            return;
        }
        int i5 = 0;
        while (i5 < arrayList.size()) {
            dr drVar2 = (dr) arrayList.get(i5);
            int i6 = i5 + 1;
            int i7 = i6;
            while (i7 < arrayList.size()) {
                dr drVar3 = (dr) arrayList.get(i7);
                drVar3.getClass();
                drVar2.getClass();
                if (drVar3.k(0, drVar2, drVar2.c())) {
                    if (drVar3.c() == drVar2.c()) {
                        ch2.g(drVar3, "duplicate option: ");
                        return;
                    } else if (((Number) arrayList2.get(i7)).intValue() > ((Number) arrayList2.get(i5)).intValue()) {
                        arrayList.remove(i7);
                        arrayList2.remove(i7);
                    } else {
                        i7++;
                    }
                }
            }
            i5 = i6;
        }
        fq fqVar2 = new fq();
        bd3.l(0L, fqVar2, 0, arrayList, 0, arrayList.size(), arrayList2);
        int i8 = (int) (fqVar2.n / 4);
        int[] iArr = new int[i8];
        for (int i9 = 0; i9 < i8; i9++) {
            iArr[i9] = fqVar2.readInt();
        }
        TimeZone timeZone = DesugarTimeZone.getTimeZone("GMT");
        timeZone.getClass();
        d = timeZone;
        e = new Regex("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        String C = up2.C(fu1.class.getName(), "okhttp3.");
        if (up2.r(C, "Client")) {
            C = C.substring(0, C.length() - 6);
        }
        f = C;
    }

    public static final boolean a(kz0 kz0Var, kz0 kz0Var2) {
        kz0Var.getClass();
        kz0Var2.getClass();
        return Intrinsics.b(kz0Var.d, kz0Var2.d) && kz0Var.e == kz0Var2.e && Intrinsics.b(kz0Var.a, kz0Var2.a);
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
            if (!Intrinsics.b(e3.getMessage(), "bio == null")) {
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

    public static final int e(String str, int i, int i2, String str2) {
        while (i < i2) {
            if (up2.p(str2, str.charAt(i))) {
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

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0034, code lost:
    
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
                            ch2.k(e2.getMessage());
                            return false;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final long h(w92 w92Var) {
        String a2 = w92Var.r.a("Content-Length");
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
        List unmodifiableList = Collections.unmodifiableList(qv.g(Arrays.copyOf(objArr2, objArr2.length)));
        unmodifiableList.getClass();
        return unmodifiableList;
    }

    public static final int j(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Intrinsics.c(charAt, 31) <= 0 || Intrinsics.c(charAt, 127) >= 0) {
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
        strArr.getClass();
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
        return tp2.i(str, "Authorization", true) || tp2.i(str, "Cookie", true) || tp2.i(str, "Proxy-Authorization", true) || tp2.i(str, "Set-Cookie", true);
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

    public static final int p(pq pqVar) {
        pqVar.getClass();
        return (pqVar.readByte() & 255) | ((pqVar.readByte() & 255) << 16) | ((pqVar.readByte() & 255) << 8);
    }

    public static final boolean q(pn2 pn2Var, int i) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeUnit.getClass();
        long nanoTime = System.nanoTime();
        long c2 = pn2Var.e().e() ? pn2Var.e().c() - nanoTime : Long.MAX_VALUE;
        pn2Var.e().d(Math.min(c2, timeUnit.toNanos(i)) + nanoTime);
        try {
            fq fqVar = new fq();
            while (pn2Var.h(8192L, fqVar) != -1) {
                fqVar.skip(fqVar.n);
            }
            if (c2 == Long.MAX_VALUE) {
                pn2Var.e().a();
                return true;
            }
            pn2Var.e().d(nanoTime + c2);
            return true;
        } catch (InterruptedIOException unused) {
            if (c2 == Long.MAX_VALUE) {
                pn2Var.e().a();
                return false;
            }
            pn2Var.e().d(nanoTime + c2);
            return false;
        } catch (Throwable th) {
            if (c2 == Long.MAX_VALUE) {
                pn2Var.e().a();
            } else {
                pn2Var.e().d(nanoTime + c2);
            }
            throw th;
        }
    }

    public static final mx0 r(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            kx0 kx0Var = (kx0) it.next();
            dr drVar = kx0Var.a;
            dr drVar2 = kx0Var.b;
            String p = drVar.p();
            String p2 = drVar2.p();
            arrayList.add(p);
            arrayList.add(up2.K(p2).toString());
        }
        return new mx0((String[]) arrayList.toArray(new String[0]));
    }

    public static final String s(kz0 kz0Var, boolean z) {
        kz0Var.getClass();
        String str = kz0Var.d;
        int i = kz0Var.e;
        if (up2.q(str, ":")) {
            str = "[" + str + ']';
        }
        if (!z) {
            String str2 = kz0Var.a;
            str2.getClass();
            if (i == (str2.equals("http") ? 80 : str2.equals(TournamentShareDialogURIBuilder.scheme) ? 443 : -1)) {
                return str;
            }
        }
        return str + ':' + i;
    }

    public static final List t(List list) {
        list.getClass();
        List unmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        unmodifiableList.getClass();
        return unmodifiableList;
    }

    public static final int u(int i, String str) {
        if (str == null) {
            return i;
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
            return i;
        }
    }
}
