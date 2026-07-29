package b.a;

import android.support.v4.media.session.PlaybackStateCompat;
import b.ab;
import b.ad;
import b.t;
import b.v;
import c.e;
import c.f;
import c.r;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: Util.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f1853a = new byte[0];

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f1854b = new String[0];

    /* renamed from: c, reason: collision with root package name */
    public static final ad f1855c = ad.a((v) null, f1853a);

    /* renamed from: d, reason: collision with root package name */
    public static final ab f1856d = ab.a((v) null, f1853a);
    private static final f h = f.b("efbbbf");
    private static final f i = f.b("feff");
    private static final f j = f.b("fffe");
    private static final f k = f.b("0000ffff");
    private static final f l = f.b("ffff0000");
    public static final Charset e = Charset.forName("UTF-8");
    private static final Charset m = Charset.forName("UTF-16BE");
    private static final Charset n = Charset.forName("UTF-16LE");
    private static final Charset o = Charset.forName("UTF-32BE");
    private static final Charset p = Charset.forName("UTF-32LE");
    public static final TimeZone f = TimeZone.getTimeZone("GMT");
    public static final Comparator<String> g = new Comparator<String>() { // from class: b.a.c.1
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(String str, String str2) {
            return str.compareTo(str2);
        }
    };
    private static final Pattern q = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    public static void a(long j2, long j3, long j4) {
        if ((j3 | j4) < 0 || j3 > j2 || j2 - j3 < j4) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static void a(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e2) {
                if (!a(e2)) {
                    throw e2;
                }
            } catch (RuntimeException e3) {
                throw e3;
            } catch (Exception unused) {
            }
        }
    }

    public static boolean a(r rVar, int i2, TimeUnit timeUnit) {
        try {
            return b(rVar, i2, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static boolean b(r rVar, int i2, TimeUnit timeUnit) throws IOException {
        long nanoTime = System.nanoTime();
        long d2 = rVar.a().f_() ? rVar.a().d() - nanoTime : Long.MAX_VALUE;
        rVar.a().a(Math.min(d2, timeUnit.toNanos(i2)) + nanoTime);
        try {
            c.c cVar = new c.c();
            while (rVar.a(cVar, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1) {
                cVar.s();
            }
            if (d2 == Long.MAX_VALUE) {
                rVar.a().f();
            } else {
                rVar.a().a(nanoTime + d2);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (d2 == Long.MAX_VALUE) {
                rVar.a().f();
            } else {
                rVar.a().a(nanoTime + d2);
            }
            return false;
        } catch (Throwable th) {
            if (d2 == Long.MAX_VALUE) {
                rVar.a().f();
            } else {
                rVar.a().a(nanoTime + d2);
            }
            throw th;
        }
    }

    public static <T> List<T> a(List<T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    public static <T> List<T> a(T... tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    public static ThreadFactory a(final String str, final boolean z) {
        return new ThreadFactory() { // from class: b.a.c.2
            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable, str);
                thread.setDaemon(z);
                return thread;
            }
        };
    }

    public static String[] a(Comparator<? super String> comparator, String[] strArr, String[] strArr2) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i2]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i2++;
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static boolean b(Comparator<String> comparator, String[] strArr, String[] strArr2) {
        if (strArr == null || strArr2 == null || strArr.length == 0 || strArr2.length == 0) {
            return false;
        }
        for (String str : strArr) {
            for (String str2 : strArr2) {
                if (comparator.compare(str, str2) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String a(t tVar, boolean z) {
        String f2;
        if (tVar.f().contains(":")) {
            f2 = "[" + tVar.f() + "]";
        } else {
            f2 = tVar.f();
        }
        if (!z && tVar.g() == t.a(tVar.b())) {
            return f2;
        }
        return f2 + ":" + tVar.g();
    }

    public static boolean a(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    public static int a(Comparator<String> comparator, String[] strArr, String str) {
        int length = strArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (comparator.compare(strArr[i2], str) == 0) {
                return i2;
            }
        }
        return -1;
    }

    public static String[] a(String[] strArr, String str) {
        String[] strArr2 = new String[strArr.length + 1];
        System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
        strArr2[strArr2.length - 1] = str;
        return strArr2;
    }

    public static int a(String str, int i2, int i3) {
        while (i2 < i3) {
            switch (str.charAt(i2)) {
                case '\t':
                case '\n':
                case '\f':
                case '\r':
                case ' ':
                    i2++;
                default:
                    return i2;
            }
        }
        return i3;
    }

    public static int b(String str, int i2, int i3) {
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            switch (str.charAt(i4)) {
                case '\t':
                case '\n':
                case '\f':
                case '\r':
                case ' ':
                default:
                    return i4 + 1;
            }
        }
        return i2;
    }

    public static String c(String str, int i2, int i3) {
        int a2 = a(str, i2, i3);
        return str.substring(a2, b(str, a2, i3));
    }

    public static int a(String str, int i2, int i3, String str2) {
        while (i2 < i3) {
            if (str2.indexOf(str.charAt(i2)) != -1) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static int a(String str, int i2, int i3, char c2) {
        while (i2 < i3) {
            if (str.charAt(i2) == c2) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static String a(String str) {
        try {
            String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
            if (lowerCase.isEmpty()) {
                return null;
            }
            if (d(lowerCase)) {
                return null;
            }
            return lowerCase;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    private static boolean d(String str) {
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (charAt <= 31 || charAt >= 127 || " #%/:?@[\\]".indexOf(charAt) != -1) {
                return true;
            }
        }
        return false;
    }

    public static int b(String str) {
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt <= 31 || charAt >= 127) {
                return i2;
            }
        }
        return -1;
    }

    public static boolean c(String str) {
        return q.matcher(str).matches();
    }

    public static String a(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static Charset a(e eVar, Charset charset) throws IOException {
        if (eVar.a(0L, h)) {
            eVar.h(h.g());
            return e;
        }
        if (eVar.a(0L, i)) {
            eVar.h(i.g());
            return m;
        }
        if (eVar.a(0L, j)) {
            eVar.h(j.g());
            return n;
        }
        if (eVar.a(0L, k)) {
            eVar.h(k.g());
            return o;
        }
        if (!eVar.a(0L, l)) {
            return charset;
        }
        eVar.h(l.g());
        return p;
    }
}
