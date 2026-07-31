package com.yandex.mobile.ads.impl;

import W1.AbstractC1233c;
import com.ironsource.C1463f4;
import com.ironsource.b9;
import com.yandex.mobile.ads.impl.ff0;
import com.yandex.mobile.ads.impl.m50;
import com.yandex.mobile.ads.impl.mh0;
import com.yandex.mobile.ads.impl.sp1;
import com.yandex.mobile.ads.impl.sq1;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import kotlin.KotlinVersion;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.AbstractC3237c;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import okio.C3372e;
import okio.h;
import okio.s;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class v82 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final byte[] f33550a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public static final ff0 f33551b = ff0.b.a(new String[0]);

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public static final rq1 f33552c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public static final TimeZone f33553d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private static final Regex f33554e;

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f33555f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    public static final String f33556g;

    static {
        byte[] bArr = new byte[0];
        f33550a = bArr;
        f33552c = sq1.a.a(bArr);
        sp1.a.a(bArr);
        s.a aVar = okio.s.f43291d;
        h.a aVar2 = okio.h.f43270e;
        aVar.d(aVar2.b("efbbbf"), aVar2.b("feff"), aVar2.b("fffe"), aVar2.b("0000ffff"), aVar2.b("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        Intrinsics.checkNotNull(timeZone);
        f33553d = timeZone;
        f33554e = new Regex("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        f33555f = false;
        String name = td1.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        f33556g = StringsKt.w0(StringsKt.v0(name, "com.monetization.ads.embedded.okhttp.src.main.kotlin.okhttplib."), "Client");
    }

    public static final int a(byte b4) {
        return b4 & 255;
    }

    public static final int a(char c4) {
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

    public static final boolean c(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return StringsKt.w(name, "Authorization", true) || StringsKt.w(name, "Cookie", true) || StringsKt.w(name, "Proxy-Authorization", true) || StringsKt.w(name, "Set-Cookie", true);
    }

    public static final int a(short s4) {
        return s4 & 65535;
    }

    public static final int b(int i4, int i5, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
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

    public static final long a(int i4) {
        return i4 & 2147483647L;
    }

    public static final void a(@NotNull ArrayList arrayList, Object obj) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        if (arrayList.contains(obj)) {
            return;
        }
        arrayList.add(obj);
    }

    @NotNull
    public static final String[] b(@NotNull String[] strArr, @NotNull String[] other, @NotNull Comparator<? super String> comparator) {
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = other.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    break;
                }
                if (comparator.compare(str, other[i4]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i4++;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    @NotNull
    public static final m50.b a(@NotNull final m50.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return new m50.b() { // from class: com.yandex.mobile.ads.impl.Qh
            @Override // com.yandex.mobile.ads.impl.m50.b
            public final m50 a(wm wmVar) {
                m50 a4;
                a4 = v82.a(m50.this, wmVar);
                return a4;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m50 a(m50 this_asFactory, wm it) {
        Intrinsics.checkNotNullParameter(this_asFactory, "$this_asFactory");
        Intrinsics.checkNotNullParameter(it, "it");
        return this_asFactory;
    }

    public static final boolean a(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return f33554e.d(str);
    }

    public static final int a(long j4, @Nullable TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(C1463f4.f16211f, "name");
        if (j4 < 0) {
            throw new IllegalStateException((C1463f4.f16211f + " < 0").toString());
        }
        if (timeUnit != null) {
            long millis = timeUnit.toMillis(j4);
            if (millis > 2147483647L) {
                throw new IllegalArgumentException((C1463f4.f16211f + " too large.").toString());
            }
            if (millis != 0 || j4 <= 0) {
                return (int) millis;
            }
            throw new IllegalArgumentException((C1463f4.f16211f + " too small.").toString());
        }
        throw new IllegalStateException("unit == null");
    }

    @NotNull
    public static final <T> List<T> b(@NotNull List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<T> unmodifiableList = Collections.unmodifiableList(CollectionsKt.toMutableList((Collection) list));
        Intrinsics.checkNotNullExpressionValue(unmodifiableList, "unmodifiableList(...)");
        return unmodifiableList;
    }

    public static final void a(@NotNull Closeable closeable) {
        Intrinsics.checkNotNullParameter(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e4) {
            throw e4;
        } catch (Exception unused) {
        }
    }

    public static final void a(@NotNull Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e4) {
            throw e4;
        } catch (RuntimeException e5) {
            if (!Intrinsics.areEqual(e5.getMessage(), "bio == null")) {
                throw e5;
            }
        } catch (Exception unused) {
        }
    }

    public static final int a(int i4, int i5, @NotNull String str, @NotNull String delimiters) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        while (i4 < i5) {
            if (StringsKt.O(delimiters, str.charAt(i4), false, 2, null)) {
                return i4;
            }
            i4++;
        }
        return i5;
    }

    public static final int a(@NotNull String str, char c4, int i4, int i5) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        while (i4 < i5) {
            if (str.charAt(i4) == c4) {
                return i4;
            }
            i4++;
        }
        return i5;
    }

    @NotNull
    public static final String a(@NotNull String format, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        kotlin.jvm.internal.L l4 = kotlin.jvm.internal.L.f41137a;
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(args, args.length);
        String format2 = String.format(locale, format, Arrays.copyOf(copyOf, copyOf.length));
        Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
        return format2;
    }

    public static final boolean a(@NotNull String[] strArr, @Nullable String[] strArr2, @NotNull Comparator<? super String> comparator) {
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                Iterator a4 = AbstractC3237c.a(strArr2);
                while (a4.hasNext()) {
                    if (comparator.compare(str, (String) a4.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final long a(@NotNull oq1 oq1Var) {
        Intrinsics.checkNotNullParameter(oq1Var, "<this>");
        String a4 = oq1Var.g().a("Content-Length");
        if (a4 != null) {
            Intrinsics.checkNotNullParameter(a4, "<this>");
            try {
                return Long.parseLong(a4);
            } catch (NumberFormatException unused) {
            }
        }
        return -1L;
    }

    @SafeVarargs
    @NotNull
    public static final <T> List<T> a(@NotNull T... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] objArr = (Object[]) elements.clone();
        List<T> unmodifiableList = Collections.unmodifiableList(CollectionsKt.listOf(Arrays.copyOf(objArr, objArr.length)));
        Intrinsics.checkNotNullExpressionValue(unmodifiableList, "unmodifiableList(...)");
        return unmodifiableList;
    }

    public static final int a(int i4, int i5, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        while (i4 < i5) {
            char charAt = str.charAt(i4);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i4;
            }
            i4++;
        }
        return i5;
    }

    public static final boolean a(@NotNull Socket socket, @NotNull okio.g source) {
        Intrinsics.checkNotNullParameter(socket, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                return !source.v();
            } finally {
                socket.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public static final int a(@NotNull okio.g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return (gVar.readByte() & 255) | ((gVar.readByte() & 255) << 16) | ((gVar.readByte() & 255) << 8);
    }

    public static final int a(@NotNull C3372e c3372e) {
        Intrinsics.checkNotNullParameter(c3372e, "<this>");
        int i4 = 0;
        while (!c3372e.v() && c3372e.U(0L) == 61) {
            i4++;
            c3372e.readByte();
        }
        return i4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0053, code lost:
    
        if (r5 == Long.MAX_VALUE) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0078, code lost:
    
        r11.timeout().deadlineNanoTime(r0 + r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0080, code lost:
    
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0070, code lost:
    
        r11.timeout().clearDeadline();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006e, code lost:
    
        if (r5 != Long.MAX_VALUE) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean a(@NotNull okio.B b4, int i4, @NotNull TimeUnit timeUnit) {
        boolean z4;
        Intrinsics.checkNotNullParameter(b4, "<this>");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        long nanoTime = System.nanoTime();
        long deadlineNanoTime = b4.timeout().hasDeadline() ? b4.timeout().deadlineNanoTime() - nanoTime : Long.MAX_VALUE;
        b4.timeout().deadlineNanoTime(Math.min(deadlineNanoTime, timeUnit.toNanos(i4)) + nanoTime);
        try {
            C3372e c3372e = new C3372e();
            while (b4.read(c3372e, 8192L) != -1) {
                c3372e.m();
            }
            z4 = true;
        } catch (InterruptedIOException unused) {
            z4 = false;
        } catch (Throwable th) {
            if (deadlineNanoTime == Long.MAX_VALUE) {
                b4.timeout().clearDeadline();
            } else {
                b4.timeout().deadlineNanoTime(nanoTime + deadlineNanoTime);
            }
            throw th;
        }
    }

    @NotNull
    public static final ThreadFactory a(@NotNull final String name, final boolean z4) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new ThreadFactory() { // from class: com.yandex.mobile.ads.impl.Ph
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread a4;
                a4 = v82.a(name, z4, runnable);
                return a4;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread a(String name, boolean z4, Runnable runnable) {
        Intrinsics.checkNotNullParameter(name, "$name");
        Thread thread = new Thread(runnable, name);
        thread.setDaemon(z4);
        return thread;
    }

    @NotNull
    public static final ff0 a(@NotNull List<af0> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ff0.a aVar = new ff0.a();
        for (af0 af0Var : list) {
            aVar.a(af0Var.f23265a.y(), af0Var.f23266b.y());
        }
        return aVar.a();
    }

    @NotNull
    public static final String a(@NotNull mh0 mh0Var, boolean z4) {
        String g4;
        Intrinsics.checkNotNullParameter(mh0Var, "<this>");
        if (StringsKt.P(mh0Var.g(), StringUtils.PROCESS_POSTFIX_DELIMITER, false, 2, null)) {
            g4 = b9.i.f15550d + mh0Var.g() + b9.i.f15552e;
        } else {
            g4 = mh0Var.g();
        }
        if (!z4 && mh0Var.i() == mh0.b.a(mh0Var.k())) {
            return g4;
        }
        return g4 + StringUtils.PROCESS_POSTFIX_DELIMITER + mh0Var.i();
    }

    public static final int a(int i4, @Nullable String str) {
        if (str == null) {
            return i4;
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
            return i4;
        }
    }

    @NotNull
    public static final Exception a(@NotNull IOException iOException, @NotNull List suppressed) {
        Intrinsics.checkNotNullParameter(iOException, "<this>");
        Intrinsics.checkNotNullParameter(suppressed, "suppressed");
        if (suppressed.size() > 1) {
            System.out.getClass();
        }
        Iterator it = suppressed.iterator();
        while (it.hasNext()) {
            AbstractC1233c.a(iOException, (Exception) it.next());
        }
        return iOException;
    }

    public static final void a(@NotNull okio.f fVar, int i4) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        fVar.w((i4 >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        fVar.w((i4 >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        fVar.w(i4 & KotlinVersion.MAX_COMPONENT_VALUE);
    }
}
