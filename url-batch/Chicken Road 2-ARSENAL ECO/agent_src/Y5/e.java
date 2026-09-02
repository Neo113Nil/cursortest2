package Y5;

import F5.j;
import F5.q;
import X5.n;
import X5.o;
import X5.s;
import X5.w;
import e6.C0358d;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.i;
import l5.AbstractC0505i;
import l5.C0512p;
import n6.f;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final TimeZone f3102a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f3103b;

    static {
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        i.b(timeZone);
        f3102a = timeZone;
        String Y3 = j.Y(s.class.getName(), "okhttp3.");
        if (q.B(Y3, "Client")) {
            Y3 = Y3.substring(0, Y3.length() - 6);
            i.d(Y3, "substring(...)");
        }
        f3103b = Y3;
    }

    public static final boolean a(o oVar, o other) {
        i.e(oVar, "<this>");
        i.e(other, "other");
        return i.a(oVar.f2977d, other.f2977d) && oVar.f2978e == other.f2978e && i.a(oVar.f2974a, other.f2974a);
    }

    public static final int b(long j4) {
        TimeUnit unit = TimeUnit.MILLISECONDS;
        i.e(unit, "unit");
        if (j4 < 0) {
            throw new IllegalStateException("timeout".concat(" < 0").toString());
        }
        long millis = unit.toMillis(j4);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException("timeout".concat(" too large").toString());
        }
        if (millis != 0 || j4 <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException("timeout".concat(" too small").toString());
    }

    public static final void c(Socket socket) {
        i.e(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e4) {
            throw e4;
        } catch (RuntimeException e7) {
            if (!i.a(e7.getMessage(), "bio == null")) {
                throw e7;
            }
        } catch (Exception unused) {
        }
    }

    public static final String d(String format, Object... objArr) {
        i.e(format, "format");
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, format, Arrays.copyOf(copyOf, copyOf.length));
    }

    public static final long e(w wVar) {
        String a7 = wVar.f3066k.a("Content-Length");
        if (a7 == null) {
            return -1L;
        }
        byte[] bArr = c.f3099a;
        try {
            return Long.parseLong(a7);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static final boolean f(n6.w wVar, int i7) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        i.e(timeUnit, "timeUnit");
        long nanoTime = System.nanoTime();
        long c7 = wVar.b().e() ? wVar.b().c() - nanoTime : Long.MAX_VALUE;
        wVar.b().d(Math.min(c7, timeUnit.toNanos(i7)) + nanoTime);
        try {
            f fVar = new f();
            while (wVar.i(8192L, fVar) != -1) {
                fVar.skip(fVar.f5524g);
            }
            if (c7 == Long.MAX_VALUE) {
                wVar.b().a();
                return true;
            }
            wVar.b().d(nanoTime + c7);
            return true;
        } catch (InterruptedIOException unused) {
            if (c7 == Long.MAX_VALUE) {
                wVar.b().a();
                return false;
            }
            wVar.b().d(nanoTime + c7);
            return false;
        } catch (Throwable th) {
            if (c7 == Long.MAX_VALUE) {
                wVar.b().a();
            } else {
                wVar.b().d(nanoTime + c7);
            }
            throw th;
        }
    }

    public static final n g(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0358d c0358d = (C0358d) it.next();
            n6.i iVar = c0358d.f4053a;
            n6.i iVar2 = c0358d.f4054b;
            String k4 = iVar.k();
            String k7 = iVar2.k();
            arrayList.add(k4);
            arrayList.add(j.h0(k7).toString());
        }
        return new n((String[]) arrayList.toArray(new String[0]));
    }

    public static final String h(o oVar, boolean z5) {
        i.e(oVar, "<this>");
        int i7 = oVar.f2978e;
        String str = oVar.f2977d;
        if (j.L(str, ":", false)) {
            str = "[" + str + ']';
        }
        if (!z5) {
            String scheme = oVar.f2974a;
            i.e(scheme, "scheme");
            if (i7 == (scheme.equals("http") ? 80 : scheme.equals("https") ? 443 : -1)) {
                return str;
            }
        }
        return str + ':' + i7;
    }

    public static final List i(List list) {
        i.e(list, "<this>");
        if (list.isEmpty()) {
            return C0512p.f5303f;
        }
        if (list.size() == 1) {
            List singletonList = Collections.singletonList(list.get(0));
            i.d(singletonList, "singletonList(...)");
            return singletonList;
        }
        Object[] array = list.toArray();
        i.d(array, "toArray(...)");
        List unmodifiableList = Collections.unmodifiableList(AbstractC0505i.E(array));
        i.d(unmodifiableList, "unmodifiableList(...)");
        return unmodifiableList;
    }

    public static final List j(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return C0512p.f5303f;
        }
        if (objArr.length == 1) {
            List singletonList = Collections.singletonList(objArr[0]);
            i.d(singletonList, "singletonList(...)");
            return singletonList;
        }
        List unmodifiableList = Collections.unmodifiableList(AbstractC0505i.E((Object[]) objArr.clone()));
        i.d(unmodifiableList, "unmodifiableList(...)");
        return unmodifiableList;
    }
}
