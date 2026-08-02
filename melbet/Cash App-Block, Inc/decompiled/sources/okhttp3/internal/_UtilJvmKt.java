package okhttp3.internal;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.internal.http2.Header;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Path$$ExternalSyntheticBUOutline0;
import okio.Source;

/* loaded from: classes3.dex */
public abstract class _UtilJvmKt {
    public static final TimeZone UTC;
    public static final String okHttpName;

    static {
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        timeZone.getClass();
        UTC = timeZone;
        okHttpName = StringsKt.removeSuffix(StringsKt.removePrefix("okhttp3.", OkHttpClient.class.getName()), "Client");
    }

    public static final boolean canReuseConnectionFor(HttpUrl httpUrl, HttpUrl httpUrl2) {
        httpUrl.getClass();
        httpUrl2.getClass();
        return Intrinsics.areEqual(httpUrl.host, httpUrl2.host) && httpUrl.port == httpUrl2.port && Intrinsics.areEqual(httpUrl.scheme, httpUrl2.scheme);
    }

    public static final int checkDuration(String str, long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        if (j < 0) {
            Path$$ExternalSyntheticBUOutline0.m((Object) str.concat(" < 0"));
            return 0;
        }
        long millis = timeUnit.toMillis(j);
        if (millis > 2147483647L) {
            Path$$ExternalSyntheticBUOutline0.m$1((Object) str.concat(" too large"));
            return 0;
        }
        if (millis != 0 || j <= 0) {
            return (int) millis;
        }
        Path$$ExternalSyntheticBUOutline0.m$1((Object) str.concat(" too small"));
        return 0;
    }

    public static final void closeQuietly(Socket socket) {
        socket.getClass();
        try {
            socket.close();
        } catch (AssertionError e) {
            throw e;
        } catch (RuntimeException e2) {
            if (!Intrinsics.areEqual(e2.getMessage(), "bio == null")) {
                throw e2;
            }
        } catch (Exception unused) {
        }
    }

    public static final String format(String str, Object... objArr) {
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
    }

    public static final long headersContentLength(Response response) {
        String str = response.headers.get("Content-Length");
        if (str == null) {
            return -1L;
        }
        byte[] bArr = _UtilCommonKt.EMPTY_BYTE_ARRAY;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static final Charset readBomAsCharset(BufferedSource bufferedSource, Charset charset) {
        bufferedSource.getClass();
        charset.getClass();
        int select = bufferedSource.select(_UtilCommonKt.UNICODE_BOMS);
        if (select == -1) {
            return charset;
        }
        if (select == 0) {
            return Charsets.UTF_8;
        }
        if (select == 1) {
            return Charsets.UTF_16BE;
        }
        if (select == 2) {
            Charsets.INSTANCE.getClass();
            Charset charset2 = Charsets.utf_32le;
            if (charset2 != null) {
                return charset2;
            }
            Charset forName = Charset.forName("UTF-32LE");
            forName.getClass();
            Charsets.utf_32le = forName;
            return forName;
        }
        if (select == 3) {
            return Charsets.UTF_16LE;
        }
        if (select != 4) {
            Path$$ExternalSyntheticBUOutline0.m$2();
            return null;
        }
        Charsets.INSTANCE.getClass();
        Charset charset3 = Charsets.utf_32be;
        if (charset3 != null) {
            return charset3;
        }
        Charset forName2 = Charset.forName("UTF-32BE");
        forName2.getClass();
        Charsets.utf_32be = forName2;
        return forName2;
    }

    public static final boolean skipAll(Source source, int i) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeUnit.getClass();
        long nanoTime = System.nanoTime();
        long deadlineNanoTime = source.timeout().hasDeadline() ? source.timeout().deadlineNanoTime() - nanoTime : Long.MAX_VALUE;
        source.timeout().deadlineNanoTime(Math.min(deadlineNanoTime, timeUnit.toNanos(i)) + nanoTime);
        try {
            Buffer buffer = new Buffer();
            while (source.read(buffer, 8192L) != -1) {
                buffer.clear();
            }
            if (deadlineNanoTime == Long.MAX_VALUE) {
                source.timeout().clearDeadline();
                return true;
            }
            source.timeout().deadlineNanoTime(nanoTime + deadlineNanoTime);
            return true;
        } catch (InterruptedIOException unused) {
            if (deadlineNanoTime == Long.MAX_VALUE) {
                source.timeout().clearDeadline();
                return false;
            }
            source.timeout().deadlineNanoTime(nanoTime + deadlineNanoTime);
            return false;
        } catch (Throwable th) {
            if (deadlineNanoTime == Long.MAX_VALUE) {
                source.timeout().clearDeadline();
            } else {
                source.timeout().deadlineNanoTime(nanoTime + deadlineNanoTime);
            }
            throw th;
        }
    }

    public static final Headers toHeaders(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Header header = (Header) it.next();
            ByteString byteString = header.name;
            ByteString byteString2 = header.value;
            String utf8 = byteString.utf8();
            String utf82 = byteString2.utf8();
            arrayList.add(utf8);
            arrayList.add(StringsKt.trim(utf82).toString());
        }
        return new Headers((String[]) arrayList.toArray(new String[0]));
    }

    public static final String toHostHeader(HttpUrl httpUrl, boolean z) {
        httpUrl.getClass();
        String str = httpUrl.host;
        int i = httpUrl.port;
        if (StringsKt.contains((CharSequence) str, (CharSequence) ":", false)) {
            str = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(']', "[", str);
        }
        if (!z) {
            String str2 = httpUrl.scheme;
            str2.getClass();
            if (i == (str2.equals("http") ? 80 : str2.equals("https") ? 443 : -1)) {
                return str;
            }
        }
        return str + ':' + i;
    }

    public static final List toImmutableList(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return EmptyList.INSTANCE;
        }
        if (list.size() == 1) {
            List singletonList = Collections.singletonList(list.get(0));
            singletonList.getClass();
            return singletonList;
        }
        Object[] array2 = list.toArray();
        array2.getClass();
        List unmodifiableList = Collections.unmodifiableList(ArraysKt___ArraysJvmKt.asList(array2));
        unmodifiableList.getClass();
        unmodifiableList.getClass();
        return unmodifiableList;
    }

    public static final List toImmutableList(Object[] objArr) {
        if (objArr != null && objArr.length != 0) {
            if (objArr.length == 1) {
                List singletonList = Collections.singletonList(objArr[0]);
                singletonList.getClass();
                return singletonList;
            }
            List unmodifiableList = Collections.unmodifiableList(ArraysKt___ArraysJvmKt.asList((Object[]) objArr.clone()));
            unmodifiableList.getClass();
            return unmodifiableList;
        }
        return EmptyList.INSTANCE;
    }
}
