package okhttp3.internal;

import W1.AbstractC1233c;
import f2.AbstractC2420c;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.AbstractC3219i;
import kotlin.collections.CollectionsKt;
import kotlin.collections.E;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.AbstractC3237c;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.L;
import kotlin.ranges.IntRange;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Header;
import okhttp3.internal.io.FileSystem;
import okio.B;
import okio.C3372e;
import okio.f;
import okio.g;
import okio.h;
import okio.s;
import okio.z;

@Metadata
/* loaded from: classes3.dex */
public final class Util {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f42589a;

    /* renamed from: b, reason: collision with root package name */
    public static final Headers f42590b = Headers.f42387c.g(new String[0]);

    /* renamed from: c, reason: collision with root package name */
    public static final ResponseBody f42591c;

    /* renamed from: d, reason: collision with root package name */
    public static final RequestBody f42592d;

    /* renamed from: e, reason: collision with root package name */
    private static final s f42593e;

    /* renamed from: f, reason: collision with root package name */
    public static final TimeZone f42594f;

    /* renamed from: g, reason: collision with root package name */
    private static final Regex f42595g;

    /* renamed from: h, reason: collision with root package name */
    public static final boolean f42596h;

    /* renamed from: i, reason: collision with root package name */
    public static final String f42597i;

    static {
        byte[] bArr = new byte[0];
        f42589a = bArr;
        f42591c = ResponseBody.Companion.c(ResponseBody.f42570b, bArr, null, 1, null);
        f42592d = RequestBody.Companion.c(RequestBody.f42534a, bArr, null, 0, 0, 7, null);
        s.a aVar = s.f43291d;
        h.a aVar2 = h.f43270e;
        f42593e = aVar.d(aVar2.b("efbbbf"), aVar2.b("feff"), aVar2.b("fffe"), aVar2.b("0000ffff"), aVar2.b("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        Intrinsics.checkNotNull(timeZone);
        f42594f = timeZone;
        f42595g = new Regex("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        f42596h = false;
        String name = OkHttpClient.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "OkHttpClient::class.java.name");
        f42597i = StringsKt.w0(StringsKt.v0(name, "okhttp3."), "Client");
    }

    public static final int A(String str, int i4, int i5) {
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

    public static /* synthetic */ int B(String str, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i4 = 0;
        }
        if ((i6 & 2) != 0) {
            i5 = str.length();
        }
        return A(str, i4, i5);
    }

    public static final int C(String str, int i4) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int length = str.length();
        while (i4 < length) {
            char charAt = str.charAt(i4);
            if (charAt != ' ' && charAt != '\t') {
                return i4;
            }
            i4++;
        }
        return str.length();
    }

    public static final String[] D(String[] strArr, String[] other, Comparator comparator) {
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

    public static final boolean E(FileSystem fileSystem, File file) {
        Intrinsics.checkNotNullParameter(fileSystem, "<this>");
        Intrinsics.checkNotNullParameter(file, "file");
        z b4 = fileSystem.b(file);
        try {
            try {
                fileSystem.f(file);
                AbstractC2420c.a(b4, null);
                return true;
            } catch (IOException unused) {
                Unit unit = Unit.f41027a;
                AbstractC2420c.a(b4, null);
                fileSystem.f(file);
                return false;
            }
        } finally {
        }
    }

    public static final boolean F(Socket socket, g source) {
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

    public static final boolean G(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return StringsKt.w(name, "Authorization", true) || StringsKt.w(name, "Cookie", true) || StringsKt.w(name, "Proxy-Authorization", true) || StringsKt.w(name, "Set-Cookie", true);
    }

    public static final int H(char c4) {
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

    public static final Charset I(g gVar, Charset charset) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Intrinsics.checkNotNullParameter(charset, "default");
        int T3 = gVar.T(f42593e);
        if (T3 == -1) {
            return charset;
        }
        if (T3 == 0) {
            Charset UTF_8 = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
            return UTF_8;
        }
        if (T3 == 1) {
            Charset UTF_16BE = StandardCharsets.UTF_16BE;
            Intrinsics.checkNotNullExpressionValue(UTF_16BE, "UTF_16BE");
            return UTF_16BE;
        }
        if (T3 == 2) {
            Charset UTF_16LE = StandardCharsets.UTF_16LE;
            Intrinsics.checkNotNullExpressionValue(UTF_16LE, "UTF_16LE");
            return UTF_16LE;
        }
        if (T3 == 3) {
            return Charsets.f41245a.a();
        }
        if (T3 == 4) {
            return Charsets.f41245a.b();
        }
        throw new AssertionError();
    }

    public static final int J(g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return d(gVar.readByte(), KotlinVersion.MAX_COMPONENT_VALUE) | (d(gVar.readByte(), KotlinVersion.MAX_COMPONENT_VALUE) << 16) | (d(gVar.readByte(), KotlinVersion.MAX_COMPONENT_VALUE) << 8);
    }

    public static final int K(C3372e c3372e, byte b4) {
        Intrinsics.checkNotNullParameter(c3372e, "<this>");
        int i4 = 0;
        while (!c3372e.v() && c3372e.U(0L) == b4) {
            i4++;
            c3372e.readByte();
        }
        return i4;
    }

    public static final boolean L(B b4, int i4, TimeUnit timeUnit) {
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
            if (deadlineNanoTime == Long.MAX_VALUE) {
                b4.timeout().clearDeadline();
                return true;
            }
            b4.timeout().deadlineNanoTime(nanoTime + deadlineNanoTime);
            return true;
        } catch (InterruptedIOException unused) {
            if (deadlineNanoTime == Long.MAX_VALUE) {
                b4.timeout().clearDeadline();
                return false;
            }
            b4.timeout().deadlineNanoTime(nanoTime + deadlineNanoTime);
            return false;
        } catch (Throwable th) {
            if (deadlineNanoTime == Long.MAX_VALUE) {
                b4.timeout().clearDeadline();
            } else {
                b4.timeout().deadlineNanoTime(nanoTime + deadlineNanoTime);
            }
            throw th;
        }
    }

    public static final ThreadFactory M(final String name, final boolean z4) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new ThreadFactory() { // from class: G2.b
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread N3;
                N3 = Util.N(name, z4, runnable);
                return N3;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread N(String name, boolean z4, Runnable runnable) {
        Intrinsics.checkNotNullParameter(name, "$name");
        Thread thread = new Thread(runnable, name);
        thread.setDaemon(z4);
        return thread;
    }

    public static final List O(Headers headers) {
        Intrinsics.checkNotNullParameter(headers, "<this>");
        IntRange p4 = kotlin.ranges.g.p(0, headers.size());
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(p4, 10));
        Iterator it = p4.iterator();
        while (it.hasNext()) {
            int a4 = ((E) it).a();
            arrayList.add(new Header(headers.d(a4), headers.f(a4)));
        }
        return arrayList;
    }

    public static final Headers P(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Headers.Builder builder = new Headers.Builder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Header header = (Header) it.next();
            builder.c(header.a().y(), header.b().y());
        }
        return builder.d();
    }

    public static final String Q(int i4) {
        String hexString = Integer.toHexString(i4);
        Intrinsics.checkNotNullExpressionValue(hexString, "toHexString(this)");
        return hexString;
    }

    public static final String R(long j4) {
        String hexString = Long.toHexString(j4);
        Intrinsics.checkNotNullExpressionValue(hexString, "toHexString(this)");
        return hexString;
    }

    public static final String S(HttpUrl httpUrl, boolean z4) {
        String h4;
        Intrinsics.checkNotNullParameter(httpUrl, "<this>");
        if (StringsKt.P(httpUrl.h(), StringUtils.PROCESS_POSTFIX_DELIMITER, false, 2, null)) {
            h4 = '[' + httpUrl.h() + ']';
        } else {
            h4 = httpUrl.h();
        }
        if (!z4 && httpUrl.l() == HttpUrl.f42390k.c(httpUrl.p())) {
            return h4;
        }
        return h4 + ':' + httpUrl.l();
    }

    public static /* synthetic */ String T(HttpUrl httpUrl, boolean z4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z4 = false;
        }
        return S(httpUrl, z4);
    }

    public static final List U(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List unmodifiableList = Collections.unmodifiableList(CollectionsKt.toMutableList((Collection) list));
        Intrinsics.checkNotNullExpressionValue(unmodifiableList, "unmodifiableList(toMutableList())");
        return unmodifiableList;
    }

    public static final Map V(Map map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        if (map.isEmpty()) {
            return MapsKt.emptyMap();
        }
        Map unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
        Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        return unmodifiableMap;
    }

    public static final long W(String str, long j4) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j4;
        }
    }

    public static final int X(String str, int i4) {
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
        return i4;
    }

    public static final String Y(String str, int i4, int i5) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int y4 = y(str, i4, i5);
        String substring = str.substring(y4, A(str, y4, i5));
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String Z(String str, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i4 = 0;
        }
        if ((i6 & 2) != 0) {
            i5 = str.length();
        }
        return Y(str, i4, i5);
    }

    public static final Throwable a0(Exception exc, List suppressed) {
        Intrinsics.checkNotNullParameter(exc, "<this>");
        Intrinsics.checkNotNullParameter(suppressed, "suppressed");
        Iterator it = suppressed.iterator();
        while (it.hasNext()) {
            AbstractC1233c.a(exc, (Exception) it.next());
        }
        return exc;
    }

    public static final void b0(f fVar, int i4) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        fVar.w((i4 >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        fVar.w((i4 >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        fVar.w(i4 & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    public static final void c(List list, Object obj) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.contains(obj)) {
            return;
        }
        list.add(obj);
    }

    public static final int d(byte b4, int i4) {
        return b4 & i4;
    }

    public static final int e(short s4, int i4) {
        return s4 & i4;
    }

    public static final long f(int i4, long j4) {
        return i4 & j4;
    }

    public static final EventListener.Factory g(final EventListener eventListener) {
        Intrinsics.checkNotNullParameter(eventListener, "<this>");
        return new EventListener.Factory() { // from class: G2.a
            @Override // okhttp3.EventListener.Factory
            public final EventListener a(Call call) {
                EventListener h4;
                h4 = Util.h(EventListener.this, call);
                return h4;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EventListener h(EventListener this_asFactory, Call it) {
        Intrinsics.checkNotNullParameter(this_asFactory, "$this_asFactory");
        Intrinsics.checkNotNullParameter(it, "it");
        return this_asFactory;
    }

    public static final boolean i(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return f42595g.d(str);
    }

    public static final boolean j(HttpUrl httpUrl, HttpUrl other) {
        Intrinsics.checkNotNullParameter(httpUrl, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return Intrinsics.areEqual(httpUrl.h(), other.h()) && httpUrl.l() == other.l() && Intrinsics.areEqual(httpUrl.p(), other.p());
    }

    public static final void k(long j4, long j5, long j6) {
        if ((j5 | j6) < 0 || j5 > j4 || j4 - j5 < j6) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void l(Closeable closeable) {
        Intrinsics.checkNotNullParameter(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e4) {
            throw e4;
        } catch (Exception unused) {
        }
    }

    public static final void m(Socket socket) {
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

    public static final String[] n(String[] strArr, String value) {
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length + 1);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        String[] strArr2 = (String[]) copyOf;
        strArr2[AbstractC3219i.M(strArr2)] = value;
        return strArr2;
    }

    public static final int o(String str, char c4, int i4, int i5) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        while (i4 < i5) {
            if (str.charAt(i4) == c4) {
                return i4;
            }
            i4++;
        }
        return i5;
    }

    public static final int p(String str, String delimiters, int i4, int i5) {
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

    public static /* synthetic */ int q(String str, char c4, int i4, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i4 = 0;
        }
        if ((i6 & 4) != 0) {
            i5 = str.length();
        }
        return o(str, c4, i4, i5);
    }

    public static final boolean r(B b4, int i4, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(b4, "<this>");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        try {
            return L(b4, i4, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final String s(String format, Object... args) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        L l4 = L.f41137a;
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(args, args.length);
        String format2 = String.format(locale, format, Arrays.copyOf(copyOf, copyOf.length));
        Intrinsics.checkNotNullExpressionValue(format2, "format(locale, format, *args)");
        return format2;
    }

    public static final boolean t(String[] strArr, String[] strArr2, Comparator comparator) {
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

    public static final long u(Response response) {
        Intrinsics.checkNotNullParameter(response, "<this>");
        String b4 = response.W().b("Content-Length");
        if (b4 != null) {
            return W(b4, -1L);
        }
        return -1L;
    }

    public static final List v(Object... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] objArr = (Object[]) elements.clone();
        List unmodifiableList = Collections.unmodifiableList(CollectionsKt.listOf(Arrays.copyOf(objArr, objArr.length)));
        Intrinsics.checkNotNullExpressionValue(unmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return unmodifiableList;
    }

    public static final int w(String[] strArr, String value, Comparator comparator) {
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        int length = strArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (comparator.compare(strArr[i4], value) == 0) {
                return i4;
            }
        }
        return -1;
    }

    public static final int x(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int length = str.length();
        for (int i4 = 0; i4 < length; i4++) {
            char charAt = str.charAt(i4);
            if (Intrinsics.compare((int) charAt, 31) <= 0 || Intrinsics.compare((int) charAt, 127) >= 0) {
                return i4;
            }
        }
        return -1;
    }

    public static final int y(String str, int i4, int i5) {
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

    public static /* synthetic */ int z(String str, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i4 = 0;
        }
        if ((i6 & 2) != 0) {
            i5 = str.length();
        }
        return y(str, i4, i5);
    }
}
