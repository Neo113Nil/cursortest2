package E6;

import C4.p;
import D6.C;
import D6.q;
import D6.s;
import D6.w;
import K6.C0133d;
import T6.f;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.collections.A;
import kotlin.collections.o;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final TimeZone f712a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f713b;

    static {
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        Intrinsics.b(timeZone);
        f712a = timeZone;
        String name = w.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        f713b = StringsKt.E(StringsKt.D(name, "okhttp3."));
    }

    public static final boolean a(s sVar, s other) {
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return Intrinsics.a(sVar.f565d, other.f565d) && sVar.f566e == other.f566e && Intrinsics.a(sVar.f562a, other.f562a);
    }

    public static final int b(long j) {
        TimeUnit unit = TimeUnit.MILLISECONDS;
        Intrinsics.checkNotNullParameter("timeout", "name");
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j < 0) {
            throw new IllegalStateException("timeout < 0".toString());
        }
        long millis = unit.toMillis(j);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException("timeout too large".toString());
        }
        if (millis != 0 || j <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException("timeout too small".toString());
    }

    public static final void c(Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e7) {
            throw e7;
        } catch (RuntimeException e8) {
            if (!Intrinsics.a(e8.getMessage(), "bio == null")) {
                throw e8;
            }
        } catch (Exception unused) {
        }
    }

    public static final String d(String format, Object... args) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(args, args.length);
        String format2 = String.format(locale, format, Arrays.copyOf(copyOf, copyOf.length));
        Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
        return format2;
    }

    public static final long e(C c7) {
        Intrinsics.checkNotNullParameter(c7, "<this>");
        String a7 = c7.f431n.a("Content-Length");
        if (a7 != null) {
            byte[] bArr = c.f709a;
            Intrinsics.checkNotNullParameter(a7, "<this>");
            try {
                return Long.parseLong(a7);
            } catch (NumberFormatException unused) {
            }
        }
        return -1L;
    }

    public static final boolean f(T6.w wVar, int i2) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Intrinsics.checkNotNullParameter(wVar, "<this>");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        long nanoTime = System.nanoTime();
        long c7 = wVar.b().e() ? wVar.b().c() - nanoTime : Long.MAX_VALUE;
        wVar.b().d(Math.min(c7, timeUnit.toNanos(i2)) + nanoTime);
        try {
            f fVar = new f();
            while (wVar.o(8192L, fVar) != -1) {
                fVar.skip(fVar.f2617e);
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

    public static final q g(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        C4.d dVar = new C4.d(2);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0133d c0133d = (C0133d) it.next();
            dVar.a(c0133d.f1506a.k(), c0133d.f1507b.k());
        }
        return dVar.d();
    }

    public static final String h(s sVar, boolean z7) {
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        String str = sVar.f565d;
        int i2 = sVar.f566e;
        if (StringsKt.u(str, ":", false)) {
            str = p.i("[", str, ']');
        }
        if (!z7) {
            String scheme = sVar.f562a;
            Intrinsics.checkNotNullParameter(scheme, "scheme");
            if (i2 == (Intrinsics.a(scheme, "http") ? 80 : Intrinsics.a(scheme, "https") ? 443 : -1)) {
                return str;
            }
        }
        return str + ':' + i2;
    }

    public static final List i(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            return A.f6115d;
        }
        if (list.size() == 1) {
            List singletonList = Collections.singletonList(list.get(0));
            Intrinsics.checkNotNullExpressionValue(singletonList, "singletonList(...)");
            return singletonList;
        }
        Object[] array = list.toArray();
        Intrinsics.checkNotNullExpressionValue(array, "toArray(...)");
        List unmodifiableList = Collections.unmodifiableList(o.b(array));
        Intrinsics.checkNotNullExpressionValue(unmodifiableList, "unmodifiableList(...)");
        Intrinsics.c(unmodifiableList, "null cannot be cast to non-null type kotlin.collections.List<T of okhttp3.internal._UtilJvmKt.toImmutableList>");
        return unmodifiableList;
    }

    public static final List j(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return A.f6115d;
        }
        if (objArr.length == 1) {
            List singletonList = Collections.singletonList(objArr[0]);
            Intrinsics.checkNotNullExpressionValue(singletonList, "singletonList(...)");
            return singletonList;
        }
        List unmodifiableList = Collections.unmodifiableList(o.b((Object[]) objArr.clone()));
        Intrinsics.checkNotNullExpressionValue(unmodifiableList, "unmodifiableList(...)");
        return unmodifiableList;
    }
}
