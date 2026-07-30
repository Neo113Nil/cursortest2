package okhttp3.internal;

import android.support.v4.media.session.PlaybackStateCompat;
import com.google.common.net.HttpHeaders;
import f6.l;
import j6.m;
import j6.v;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.Field;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
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
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.f0;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.r;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.w;
import kotlin.jvm.internal.x;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.d;
import kotlin.text.t;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http2.Header;
import okhttp3.internal.io.FileSystem;
import okio.ByteString;
import okio.c;
import okio.e;
import okio.m0;
import okio.v0;
import okio.x0;

/* loaded from: classes5.dex */
public final class Util {
    public static final byte[] EMPTY_BYTE_ARRAY;
    public static final Headers EMPTY_HEADERS = Headers.Companion.of(new String[0]);
    public static final RequestBody EMPTY_REQUEST;
    public static final ResponseBody EMPTY_RESPONSE;
    private static final m0 UNICODE_BOMS;
    public static final TimeZone UTC;
    private static final Regex VERIFY_AS_IP_ADDRESS;
    public static final boolean assertionsEnabled;
    public static final String okHttpName;
    public static final String userAgent = "okhttp/4.11.0-SNAPSHOT";

    static {
        String removePrefix;
        String removeSuffix;
        byte[] bArr = new byte[0];
        EMPTY_BYTE_ARRAY = bArr;
        EMPTY_RESPONSE = ResponseBody.Companion.create$default(ResponseBody.Companion, bArr, (MediaType) null, 1, (Object) null);
        EMPTY_REQUEST = RequestBody.Companion.create$default(RequestBody.Companion, bArr, (MediaType) null, 0, 0, 7, (Object) null);
        m0.a aVar = m0.Companion;
        ByteString.a aVar2 = ByteString.Companion;
        UNICODE_BOMS = aVar.of(aVar2.decodeHex("efbbbf"), aVar2.decodeHex("feff"), aVar2.decodeHex("fffe"), aVar2.decodeHex("0000ffff"), aVar2.decodeHex("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        s.checkNotNull(timeZone);
        UTC = timeZone;
        VERIFY_AS_IP_ADDRESS = new Regex("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        assertionsEnabled = false;
        String name = OkHttpClient.class.getName();
        s.checkNotNullExpressionValue(name, "OkHttpClient::class.java.name");
        removePrefix = StringsKt__StringsKt.removePrefix(name, (CharSequence) "okhttp3.");
        removeSuffix = StringsKt__StringsKt.removeSuffix(removePrefix, (CharSequence) "Client");
        okHttpName = removeSuffix;
    }

    public static final <E> void addIfAbsent(List<E> list, E e8) {
        s.checkNotNullParameter(list, "<this>");
        if (list.contains(e8)) {
            return;
        }
        list.add(e8);
    }

    public static final int and(byte b8, int i8) {
        return b8 & i8;
    }

    public static final EventListener.Factory asFactory(final EventListener eventListener) {
        s.checkNotNullParameter(eventListener, "<this>");
        return new EventListener.Factory() { // from class: okhttp3.internal.b
            @Override // okhttp3.EventListener.Factory
            public final EventListener create(Call call) {
                EventListener m1435asFactory$lambda8;
                m1435asFactory$lambda8 = Util.m1435asFactory$lambda8(EventListener.this, call);
                return m1435asFactory$lambda8;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: asFactory$lambda-8, reason: not valid java name */
    public static final EventListener m1435asFactory$lambda8(EventListener this_asFactory, Call it) {
        s.checkNotNullParameter(this_asFactory, "$this_asFactory");
        s.checkNotNullParameter(it, "it");
        return this_asFactory;
    }

    public static final void assertThreadDoesntHoldLock(Object obj) {
        s.checkNotNullParameter(obj, "<this>");
        if (assertionsEnabled && Thread.holdsLock(obj)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + obj);
        }
    }

    public static final void assertThreadHoldsLock(Object obj) {
        s.checkNotNullParameter(obj, "<this>");
        if (!assertionsEnabled || Thread.holdsLock(obj)) {
            return;
        }
        throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + obj);
    }

    public static final boolean canParseAsIpAddress(String str) {
        s.checkNotNullParameter(str, "<this>");
        return VERIFY_AS_IP_ADDRESS.matches(str);
    }

    public static final boolean canReuseConnectionFor(HttpUrl httpUrl, HttpUrl other) {
        s.checkNotNullParameter(httpUrl, "<this>");
        s.checkNotNullParameter(other, "other");
        return s.areEqual(httpUrl.host(), other.host()) && httpUrl.port() == other.port() && s.areEqual(httpUrl.scheme(), other.scheme());
    }

    public static final int checkDuration(String name, long j8, TimeUnit timeUnit) {
        s.checkNotNullParameter(name, "name");
        if (j8 < 0) {
            throw new IllegalStateException(s.stringPlus(name, " < 0").toString());
        }
        if (timeUnit == null) {
            throw new IllegalStateException("unit == null".toString());
        }
        long millis = timeUnit.toMillis(j8);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException(s.stringPlus(name, " too large.").toString());
        }
        if (millis != 0 || j8 <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException(s.stringPlus(name, " too small.").toString());
    }

    public static final void checkOffsetAndCount(long j8, long j9, long j10) {
        if ((j9 | j10) < 0 || j9 > j8 || j8 - j9 < j10) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void closeQuietly(Closeable closeable) {
        s.checkNotNullParameter(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e8) {
            throw e8;
        } catch (Exception unused) {
        }
    }

    public static final String[] concat(String[] strArr, String value) {
        s.checkNotNullParameter(strArr, "<this>");
        s.checkNotNullParameter(value, "value");
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length + 1);
        s.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        String[] strArr2 = (String[]) copyOf;
        strArr2[ArraysKt___ArraysKt.getLastIndex(strArr2)] = value;
        return strArr2;
    }

    public static final int delimiterOffset(String str, String delimiters, int i8, int i9) {
        boolean contains$default;
        s.checkNotNullParameter(str, "<this>");
        s.checkNotNullParameter(delimiters, "delimiters");
        while (i8 < i9) {
            int i10 = i8 + 1;
            contains$default = StringsKt__StringsKt.contains$default((CharSequence) delimiters, str.charAt(i8), false, 2, (Object) null);
            if (contains$default) {
                return i8;
            }
            i8 = i10;
        }
        return i9;
    }

    public static /* synthetic */ int delimiterOffset$default(String str, String str2, int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = str.length();
        }
        return delimiterOffset(str, str2, i8, i9);
    }

    public static final boolean discard(x0 x0Var, int i8, TimeUnit timeUnit) {
        s.checkNotNullParameter(x0Var, "<this>");
        s.checkNotNullParameter(timeUnit, "timeUnit");
        try {
            return skipAll(x0Var, i8, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final <T> List<T> filterList(Iterable<? extends T> iterable, l predicate) {
        s.checkNotNullParameter(iterable, "<this>");
        s.checkNotNullParameter(predicate, "predicate");
        List<T> emptyList = CollectionsKt__CollectionsKt.emptyList();
        for (T t7 : iterable) {
            if (((Boolean) predicate.invoke(t7)).booleanValue()) {
                if (emptyList.isEmpty()) {
                    emptyList = new ArrayList<>();
                }
                x.asMutableList(emptyList).add(t7);
            }
        }
        return emptyList;
    }

    public static final String format(String format, Object... args) {
        s.checkNotNullParameter(format, "format");
        s.checkNotNullParameter(args, "args");
        w wVar = w.INSTANCE;
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(args, args.length);
        String format2 = String.format(locale, format, Arrays.copyOf(copyOf, copyOf.length));
        s.checkNotNullExpressionValue(format2, "format(locale, format, *args)");
        return format2;
    }

    public static final boolean hasIntersection(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        s.checkNotNullParameter(strArr, "<this>");
        s.checkNotNullParameter(comparator, "comparator");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            int length = strArr.length;
            int i8 = 0;
            while (i8 < length) {
                String str = strArr[i8];
                i8++;
                Iterator it = h.iterator(strArr2);
                while (it.hasNext()) {
                    if (comparator.compare(str, (String) it.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final long headersContentLength(Response response) {
        s.checkNotNullParameter(response, "<this>");
        String str = response.headers().get("Content-Length");
        if (str == null) {
            return -1L;
        }
        return toLongOrDefault(str, -1L);
    }

    public static final void ignoreIoExceptions(f6.a block) {
        s.checkNotNullParameter(block, "block");
        try {
            block.invoke();
        } catch (IOException unused) {
        }
    }

    @SafeVarargs
    public static final <T> List<T> immutableListOf(T... elements) {
        List listOf;
        s.checkNotNullParameter(elements, "elements");
        Object[] objArr = (Object[]) elements.clone();
        listOf = CollectionsKt__CollectionsKt.listOf(Arrays.copyOf(objArr, objArr.length));
        List<T> unmodifiableList = Collections.unmodifiableList(listOf);
        s.checkNotNullExpressionValue(unmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return unmodifiableList;
    }

    public static final int indexOf(String[] strArr, String value, Comparator<String> comparator) {
        s.checkNotNullParameter(strArr, "<this>");
        s.checkNotNullParameter(value, "value");
        s.checkNotNullParameter(comparator, "comparator");
        int length = strArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            if (comparator.compare(strArr[i8], value) == 0) {
                return i8;
            }
        }
        return -1;
    }

    public static final int indexOfControlOrNonAscii(String str) {
        s.checkNotNullParameter(str, "<this>");
        int length = str.length();
        int i8 = 0;
        while (i8 < length) {
            int i9 = i8 + 1;
            char charAt = str.charAt(i8);
            if (s.compare((int) charAt, 31) <= 0 || s.compare((int) charAt, 127) >= 0) {
                return i8;
            }
            i8 = i9;
        }
        return -1;
    }

    public static final int indexOfFirstNonAsciiWhitespace(String str, int i8, int i9) {
        s.checkNotNullParameter(str, "<this>");
        while (i8 < i9) {
            int i10 = i8 + 1;
            char charAt = str.charAt(i8);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i8;
            }
            i8 = i10;
        }
        return i9;
    }

    public static /* synthetic */ int indexOfFirstNonAsciiWhitespace$default(String str, int i8, int i9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i8 = 0;
        }
        if ((i10 & 2) != 0) {
            i9 = str.length();
        }
        return indexOfFirstNonAsciiWhitespace(str, i8, i9);
    }

    public static final int indexOfLastNonAsciiWhitespace(String str, int i8, int i9) {
        s.checkNotNullParameter(str, "<this>");
        int i10 = i9 - 1;
        if (i8 <= i10) {
            while (true) {
                int i11 = i10 - 1;
                char charAt = str.charAt(i10);
                if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                    return i10 + 1;
                }
                if (i10 == i8) {
                    break;
                }
                i10 = i11;
            }
        }
        return i8;
    }

    public static /* synthetic */ int indexOfLastNonAsciiWhitespace$default(String str, int i8, int i9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i8 = 0;
        }
        if ((i10 & 2) != 0) {
            i9 = str.length();
        }
        return indexOfLastNonAsciiWhitespace(str, i8, i9);
    }

    public static final int indexOfNonWhitespace(String str, int i8) {
        s.checkNotNullParameter(str, "<this>");
        int length = str.length();
        while (i8 < length) {
            int i9 = i8 + 1;
            char charAt = str.charAt(i8);
            if (charAt != ' ' && charAt != '\t') {
                return i8;
            }
            i8 = i9;
        }
        return str.length();
    }

    public static /* synthetic */ int indexOfNonWhitespace$default(String str, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i8 = 0;
        }
        return indexOfNonWhitespace(str, i8);
    }

    public static final String[] intersect(String[] strArr, String[] other, Comparator<? super String> comparator) {
        s.checkNotNullParameter(strArr, "<this>");
        s.checkNotNullParameter(other, "other");
        s.checkNotNullParameter(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        int length = strArr.length;
        int i8 = 0;
        while (i8 < length) {
            String str = strArr[i8];
            i8++;
            int length2 = other.length;
            int i9 = 0;
            while (true) {
                if (i9 < length2) {
                    String str2 = other[i9];
                    i9++;
                    if (comparator.compare(str, str2) == 0) {
                        arrayList.add(str);
                        break;
                    }
                }
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    public static final boolean isCivilized(FileSystem fileSystem, File file) {
        s.checkNotNullParameter(fileSystem, "<this>");
        s.checkNotNullParameter(file, "file");
        v0 sink = fileSystem.sink(file);
        try {
            try {
                fileSystem.delete(file);
                kotlin.io.b.closeFinally(sink, null);
                return true;
            } catch (IOException unused) {
                y5.w wVar = y5.w.INSTANCE;
                kotlin.io.b.closeFinally(sink, null);
                fileSystem.delete(file);
                return false;
            }
        } finally {
        }
    }

    public static final boolean isHealthy(Socket socket, e source) {
        s.checkNotNullParameter(socket, "<this>");
        s.checkNotNullParameter(source, "source");
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                boolean z7 = !source.exhausted();
                socket.setSoTimeout(soTimeout);
                return z7;
            } catch (Throwable th) {
                socket.setSoTimeout(soTimeout);
                throw th;
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public static final boolean isSensitiveHeader(String name) {
        s.checkNotNullParameter(name, "name");
        return t.equals(name, "Authorization", true) || t.equals(name, "Cookie", true) || t.equals(name, HttpHeaders.PROXY_AUTHORIZATION, true) || t.equals(name, "Set-Cookie", true);
    }

    public static final void notify(Object obj) {
        s.checkNotNullParameter(obj, "<this>");
        obj.notify();
    }

    public static final void notifyAll(Object obj) {
        s.checkNotNullParameter(obj, "<this>");
        obj.notifyAll();
    }

    public static final int parseHexDigit(char c8) {
        if ('0' <= c8 && c8 < ':') {
            return c8 - '0';
        }
        if ('a' <= c8 && c8 < 'g') {
            return c8 - 'W';
        }
        if ('A' > c8 || c8 >= 'G') {
            return -1;
        }
        return c8 - '7';
    }

    public static final String peerName(Socket socket) {
        s.checkNotNullParameter(socket, "<this>");
        SocketAddress remoteSocketAddress = socket.getRemoteSocketAddress();
        if (!(remoteSocketAddress instanceof InetSocketAddress)) {
            return remoteSocketAddress.toString();
        }
        String hostName = ((InetSocketAddress) remoteSocketAddress).getHostName();
        s.checkNotNullExpressionValue(hostName, "address.hostName");
        return hostName;
    }

    public static final Charset readBomAsCharset(e eVar, Charset charset) {
        s.checkNotNullParameter(eVar, "<this>");
        s.checkNotNullParameter(charset, "default");
        int select = eVar.select(UNICODE_BOMS);
        if (select == -1) {
            return charset;
        }
        if (select == 0) {
            Charset UTF_8 = StandardCharsets.UTF_8;
            s.checkNotNullExpressionValue(UTF_8, "UTF_8");
            return UTF_8;
        }
        if (select == 1) {
            Charset UTF_16BE = StandardCharsets.UTF_16BE;
            s.checkNotNullExpressionValue(UTF_16BE, "UTF_16BE");
            return UTF_16BE;
        }
        if (select == 2) {
            Charset UTF_16LE = StandardCharsets.UTF_16LE;
            s.checkNotNullExpressionValue(UTF_16LE, "UTF_16LE");
            return UTF_16LE;
        }
        if (select == 3) {
            return d.INSTANCE.UTF32_BE();
        }
        if (select == 4) {
            return d.INSTANCE.UTF32_LE();
        }
        throw new AssertionError();
    }

    public static final <T> T readFieldOrNull(Object instance, Class<T> fieldType, String fieldName) {
        T t7;
        Object readFieldOrNull;
        s.checkNotNullParameter(instance, "instance");
        s.checkNotNullParameter(fieldType, "fieldType");
        s.checkNotNullParameter(fieldName, "fieldName");
        Class<?> cls = instance.getClass();
        while (true) {
            t7 = null;
            if (s.areEqual(cls, Object.class)) {
                if (s.areEqual(fieldName, "delegate") || (readFieldOrNull = readFieldOrNull(instance, Object.class, "delegate")) == null) {
                    return null;
                }
                return (T) readFieldOrNull(readFieldOrNull, fieldType, fieldName);
            }
            try {
                Field declaredField = cls.getDeclaredField(fieldName);
                declaredField.setAccessible(true);
                Object obj = declaredField.get(instance);
                if (!fieldType.isInstance(obj)) {
                    break;
                }
                t7 = fieldType.cast(obj);
                break;
            } catch (NoSuchFieldException unused) {
                cls = cls.getSuperclass();
                s.checkNotNullExpressionValue(cls, "c.superclass");
            }
        }
        return t7;
    }

    public static final int readMedium(e eVar) {
        s.checkNotNullParameter(eVar, "<this>");
        return and(eVar.readByte(), 255) | (and(eVar.readByte(), 255) << 16) | (and(eVar.readByte(), 255) << 8);
    }

    public static final boolean skipAll(x0 x0Var, int i8, TimeUnit timeUnit) {
        s.checkNotNullParameter(x0Var, "<this>");
        s.checkNotNullParameter(timeUnit, "timeUnit");
        long nanoTime = System.nanoTime();
        long deadlineNanoTime = x0Var.timeout().hasDeadline() ? x0Var.timeout().deadlineNanoTime() - nanoTime : Long.MAX_VALUE;
        x0Var.timeout().deadlineNanoTime(Math.min(deadlineNanoTime, timeUnit.toNanos(i8)) + nanoTime);
        try {
            c cVar = new c();
            while (x0Var.read(cVar, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1) {
                cVar.clear();
            }
            if (deadlineNanoTime == Long.MAX_VALUE) {
                x0Var.timeout().clearDeadline();
            } else {
                x0Var.timeout().deadlineNanoTime(nanoTime + deadlineNanoTime);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (deadlineNanoTime == Long.MAX_VALUE) {
                x0Var.timeout().clearDeadline();
            } else {
                x0Var.timeout().deadlineNanoTime(nanoTime + deadlineNanoTime);
            }
            return false;
        } catch (Throwable th) {
            if (deadlineNanoTime == Long.MAX_VALUE) {
                x0Var.timeout().clearDeadline();
            } else {
                x0Var.timeout().deadlineNanoTime(nanoTime + deadlineNanoTime);
            }
            throw th;
        }
    }

    public static final ThreadFactory threadFactory(final String name, final boolean z7) {
        s.checkNotNullParameter(name, "name");
        return new ThreadFactory() { // from class: okhttp3.internal.a
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread m1436threadFactory$lambda1;
                m1436threadFactory$lambda1 = Util.m1436threadFactory$lambda1(name, z7, runnable);
                return m1436threadFactory$lambda1;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: threadFactory$lambda-1, reason: not valid java name */
    public static final Thread m1436threadFactory$lambda1(String name, boolean z7, Runnable runnable) {
        s.checkNotNullParameter(name, "$name");
        Thread thread = new Thread(runnable, name);
        thread.setDaemon(z7);
        return thread;
    }

    public static final void threadName(String name, f6.a block) {
        s.checkNotNullParameter(name, "name");
        s.checkNotNullParameter(block, "block");
        Thread currentThread = Thread.currentThread();
        String name2 = currentThread.getName();
        currentThread.setName(name);
        try {
            block.invoke();
        } finally {
            r.finallyStart(1);
            currentThread.setName(name2);
            r.finallyEnd(1);
        }
    }

    public static final List<Header> toHeaderList(Headers headers) {
        m until;
        s.checkNotNullParameter(headers, "<this>");
        until = v.until(0, headers.size());
        ArrayList arrayList = new ArrayList(kotlin.collections.r.collectionSizeOrDefault(until, 10));
        Iterator it = until.iterator();
        while (it.hasNext()) {
            int nextInt = ((f0) it).nextInt();
            arrayList.add(new Header(headers.name(nextInt), headers.value(nextInt)));
        }
        return arrayList;
    }

    public static final Headers toHeaders(List<Header> list) {
        s.checkNotNullParameter(list, "<this>");
        Headers.Builder builder = new Headers.Builder();
        for (Header header : list) {
            builder.addLenient$okhttp(header.component1().utf8(), header.component2().utf8());
        }
        return builder.build();
    }

    public static final String toHexString(long j8) {
        String hexString = Long.toHexString(j8);
        s.checkNotNullExpressionValue(hexString, "toHexString(this)");
        return hexString;
    }

    public static final String toHostHeader(HttpUrl httpUrl, boolean z7) {
        boolean contains$default;
        String host;
        s.checkNotNullParameter(httpUrl, "<this>");
        contains$default = StringsKt__StringsKt.contains$default((CharSequence) httpUrl.host(), (CharSequence) ":", false, 2, (Object) null);
        if (contains$default) {
            host = '[' + httpUrl.host() + ']';
        } else {
            host = httpUrl.host();
        }
        if (!z7 && httpUrl.port() == HttpUrl.Companion.defaultPort(httpUrl.scheme())) {
            return host;
        }
        return host + ':' + httpUrl.port();
    }

    public static /* synthetic */ String toHostHeader$default(HttpUrl httpUrl, boolean z7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z7 = false;
        }
        return toHostHeader(httpUrl, z7);
    }

    public static final <T> List<T> toImmutableList(List<? extends T> list) {
        s.checkNotNullParameter(list, "<this>");
        List<T> unmodifiableList = Collections.unmodifiableList(CollectionsKt___CollectionsKt.toMutableList((Collection) list));
        s.checkNotNullExpressionValue(unmodifiableList, "unmodifiableList(toMutableList())");
        return unmodifiableList;
    }

    public static final <K, V> Map<K, V> toImmutableMap(Map<K, ? extends V> map) {
        Map<K, V> emptyMap;
        s.checkNotNullParameter(map, "<this>");
        if (map.isEmpty()) {
            emptyMap = kotlin.collections.m0.emptyMap();
            return emptyMap;
        }
        Map<K, V> unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
        s.checkNotNullExpressionValue(unmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        return unmodifiableMap;
    }

    public static final long toLongOrDefault(String str, long j8) {
        s.checkNotNullParameter(str, "<this>");
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j8;
        }
    }

    public static final int toNonNegativeInt(String str, int i8) {
        Long valueOf;
        if (str == null) {
            valueOf = null;
        } else {
            try {
                valueOf = Long.valueOf(Long.parseLong(str));
            } catch (NumberFormatException unused) {
                return i8;
            }
        }
        if (valueOf == null) {
            return i8;
        }
        long longValue = valueOf.longValue();
        if (longValue > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (longValue < 0) {
            return 0;
        }
        return (int) longValue;
    }

    public static final String trimSubstring(String str, int i8, int i9) {
        s.checkNotNullParameter(str, "<this>");
        int indexOfFirstNonAsciiWhitespace = indexOfFirstNonAsciiWhitespace(str, i8, i9);
        String substring = str.substring(indexOfFirstNonAsciiWhitespace, indexOfLastNonAsciiWhitespace(str, indexOfFirstNonAsciiWhitespace, i9));
        s.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String trimSubstring$default(String str, int i8, int i9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i8 = 0;
        }
        if ((i10 & 2) != 0) {
            i9 = str.length();
        }
        return trimSubstring(str, i8, i9);
    }

    public static final void wait(Object obj) {
        s.checkNotNullParameter(obj, "<this>");
        obj.wait();
    }

    public static final Throwable withSuppressed(Exception exc, List<? extends Exception> suppressed) {
        s.checkNotNullParameter(exc, "<this>");
        s.checkNotNullParameter(suppressed, "suppressed");
        if (suppressed.size() > 1) {
            System.out.println(suppressed);
        }
        Iterator<? extends Exception> it = suppressed.iterator();
        while (it.hasNext()) {
            y5.b.addSuppressed(exc, it.next());
        }
        return exc;
    }

    public static final void writeMedium(okio.d dVar, int i8) {
        s.checkNotNullParameter(dVar, "<this>");
        dVar.writeByte((i8 >>> 16) & 255);
        dVar.writeByte((i8 >>> 8) & 255);
        dVar.writeByte(i8 & 255);
    }

    public static final int and(short s7, int i8) {
        return s7 & i8;
    }

    public static final int delimiterOffset(String str, char c8, int i8, int i9) {
        s.checkNotNullParameter(str, "<this>");
        while (i8 < i9) {
            int i10 = i8 + 1;
            if (str.charAt(i8) == c8) {
                return i8;
            }
            i8 = i10;
        }
        return i9;
    }

    public static /* synthetic */ int delimiterOffset$default(String str, char c8, int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = str.length();
        }
        return delimiterOffset(str, c8, i8, i9);
    }

    public static final String toHexString(int i8) {
        String hexString = Integer.toHexString(i8);
        s.checkNotNullExpressionValue(hexString, "toHexString(this)");
        return hexString;
    }

    public static final long and(int i8, long j8) {
        return i8 & j8;
    }

    public static final void closeQuietly(Socket socket) {
        s.checkNotNullParameter(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e8) {
            throw e8;
        } catch (RuntimeException e9) {
            if (!s.areEqual(e9.getMessage(), "bio == null")) {
                throw e9;
            }
        } catch (Exception unused) {
        }
    }

    public static final void closeQuietly(ServerSocket serverSocket) {
        s.checkNotNullParameter(serverSocket, "<this>");
        try {
            serverSocket.close();
        } catch (RuntimeException e8) {
            throw e8;
        } catch (Exception unused) {
        }
    }

    public static final int skipAll(c cVar, byte b8) {
        s.checkNotNullParameter(cVar, "<this>");
        int i8 = 0;
        while (!cVar.exhausted() && cVar.getByte(0L) == b8) {
            i8++;
            cVar.readByte();
        }
        return i8;
    }
}
