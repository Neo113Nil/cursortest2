package okhttp3;

import android.content.res.TypedArray;
import android.os.Trace;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.TuplesKt;
import kotlin.UnsignedKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt___StringsKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http.StatusLine;
import okhttp3.internal.platform.Android10Platform;
import okhttp3.internal.platform.Platform;
import okio.Buffer;
import okio.Buffer$inputStream$1;
import okio.BufferedSource;
import okio.ByteString;
import okio.FileSystem;
import okio.ForwardingSource;
import okio.Path;
import okio.Path$$ExternalSyntheticBUOutline0;
import okio.RealBufferedSink;
import okio.RealBufferedSource;
import okio.Source;
import okio.Utf8;
import papa.InteractionEngine;
import papa.InteractionEngine$sendEvent$realEventScope$1;
import papa.InteractionEngine.RealRunningInteraction;
import papa.InteractionTrace;
import papa.InteractionTrace$Companion$$ExternalSyntheticLambda0;
import papa.InteractionTrigger;
import papa.InteractionUpdated;
import papa.MainThreadTriggerStack;
import papa.SafeTrace;
import papa.SentEvent;

/* loaded from: classes3.dex */
public final class Cache implements Closeable, Flushable {
    public final DiskLruCache cache;

    public abstract class Companion {
        public static final void checkElementIndex$kotlinx_collections_immutable(int i, int i2) {
            if (i < 0 || i >= i2) {
                Path$$ExternalSyntheticBUOutline0.m(Recorder$$ExternalSyntheticOutline2.m("index: ", i, i2, ", size: "));
            }
        }

        public static final void checkPositionIndex$kotlinx_collections_immutable(int i, int i2) {
            if (i < 0 || i > i2) {
                Path$$ExternalSyntheticBUOutline0.m(Recorder$$ExternalSyntheticOutline2.m("index: ", i, i2, ", size: "));
            }
        }

        public static final void checkRangeIndexes$kotlinx_collections_immutable(int i, int i2, int i3) {
            if (i < 0 || i2 > i3) {
                Path$$ExternalSyntheticBUOutline0.m(i3, Recorder$$ExternalSyntheticOutline2.m107m(i, i2, "fromIndex: ", ", toIndex: ", ", size: "));
            } else {
                if (i <= i2) {
                    return;
                }
                a$$ExternalSyntheticBUOutline0.m$3(Recorder$$ExternalSyntheticOutline2.m("fromIndex: ", i, i2, " > toIndex: "));
            }
        }

        public static final void closeFinally(AutoCloseable autoCloseable, Throwable th) {
            boolean isTerminated;
            if (autoCloseable != null) {
                if (th != null) {
                    try {
                        JsonLogicResult$Success$$ExternalSyntheticOutline0.m(autoCloseable);
                        return;
                    } catch (Throwable th2) {
                        ExceptionsKt__ExceptionsKt.addSuppressed(th, th2);
                        return;
                    }
                }
                if (autoCloseable instanceof AutoCloseable) {
                    autoCloseable.close();
                    return;
                }
                if (!(autoCloseable instanceof ExecutorService)) {
                    if (autoCloseable instanceof TypedArray) {
                        ((TypedArray) autoCloseable).recycle();
                        return;
                    } else {
                        Path$$ExternalSyntheticBUOutline0.m$3();
                        return;
                    }
                }
                ExecutorService executorService = (ExecutorService) autoCloseable;
                if (executorService == ForkJoinPool.commonPool() || (isTerminated = executorService.isTerminated())) {
                    return;
                }
                executorService.shutdown();
                boolean z = false;
                while (!isTerminated) {
                    try {
                        isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                    } catch (InterruptedException unused) {
                        if (!z) {
                            executorService.shutdownNow();
                            z = true;
                        }
                    }
                }
                if (z) {
                    Thread.currentThread().interrupt();
                }
            }
        }

        public static boolean isEndToEnd(String str) {
            return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x002b, code lost:
        
            if (r6 == 0) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x002e, code lost:
        
            r0 = java.lang.Integer.toString(r10, kotlin.text.CharsKt.checkRadix(16));
            r0.getClass();
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0046, code lost:
        
            throw new java.lang.NumberFormatException("Expected a digit or '-' but was 0x".concat(r0));
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static int readInt$okhttp(RealBufferedSource realBufferedSource) {
            try {
                Buffer buffer = realBufferedSource.bufferField;
                realBufferedSource.require(1L);
                long j = 0;
                while (true) {
                    long j2 = j + 1;
                    if (!realBufferedSource.request(j2)) {
                        break;
                    }
                    byte b = buffer.getByte(j);
                    if ((b < 48 || b > 57) && (j != 0 || b != 45)) {
                        break;
                    }
                    j = j2;
                }
                long readDecimalLong = buffer.readDecimalLong();
                String readUtf8LineStrict = realBufferedSource.readUtf8LineStrict(Long.MAX_VALUE);
                if (readDecimalLong >= 0 && readDecimalLong <= 2147483647L && readUtf8LineStrict.length() <= 0) {
                    return (int) readDecimalLong;
                }
                throw new IOException("expected an int but was \"" + readDecimalLong + readUtf8LineStrict + '\"');
            } catch (NumberFormatException e) {
                a$$ExternalSyntheticBUOutline0.m$4(e.getMessage());
                return 0;
            }
        }

        /* renamed from: startInteraction-SxA4cEA$default, reason: not valid java name */
        public static InteractionEngine.RealRunningInteraction m4319startInteractionSxA4cEA$default(InteractionEngine$sendEvent$realEventScope$1 interactionEngine$sendEvent$realEventScope$1, InteractionTrigger interactionTrigger, InteractionTrace interactionTrace, int i) {
            InteractionTrace takeOverInteractionTrace;
            if ((i & 1) != 0) {
                interactionTrigger = MainThreadTriggerStack.getEarliestInteractionTrigger();
            }
            InteractionTrigger interactionTrigger2 = interactionTrigger;
            if ((i & 2) != 0) {
                if (interactionTrigger2 == null || (takeOverInteractionTrace = interactionTrigger2.takeOverInteractionTrace()) == null) {
                    SentEvent sentEvent = interactionEngine$sendEvent$realEventScope$1.this$0.eventInScope;
                    sentEvent.getClass();
                    String obj = sentEvent.event.toString();
                    obj.getClass();
                    int nanoTime = (int) (System.nanoTime() % 2147483647L);
                    SafeTrace.beginAsyncSection(obj, nanoTime);
                    interactionTrace = new InteractionTrace$Companion$$ExternalSyntheticLambda0(obj, nanoTime);
                } else {
                    interactionTrace = takeOverInteractionTrace;
                }
            }
            InteractionTrace interactionTrace2 = interactionTrace;
            Duration.Companion companion = Duration.Companion;
            long duration = DurationKt.toDuration(1, DurationUnit.MINUTES);
            InteractionEngine interactionEngine = interactionEngine$sendEvent$realEventScope$1.this$0;
            SentEvent sentEvent2 = interactionEngine$sendEvent$realEventScope$1.$sentEvent;
            if (Trace.isEnabled()) {
                Trace.beginSection(androidx.tracing.Trace.truncatedTraceSectionLabel(StringsKt___StringsKt.take(127, "PAPA-startInteraction:" + sentEvent2.event)));
                Trace.endSection();
            }
            InteractionEngine.RealRunningInteraction realRunningInteraction = interactionEngine$sendEvent$realEventScope$1.this$0.new RealRunningInteraction(interactionTrigger2, interactionTrace2, duration);
            interactionEngine.runningInteractions.add(realRunningInteraction);
            interactionEngine.updateListener.onInteractionUpdate(new InteractionUpdated.Started(sentEvent2, realRunningInteraction));
            return realRunningInteraction;
        }

        public static Set varyFields(Headers headers) {
            int size = headers.size();
            TreeSet treeSet = null;
            for (int i = 0; i < size; i++) {
                if ("Vary".equalsIgnoreCase(headers.name(i))) {
                    String value = headers.value(i);
                    if (treeSet == null) {
                        StringCompanionObject.INSTANCE.getClass();
                        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
                        comparator.getClass();
                        treeSet = new TreeSet(comparator);
                    }
                    Iterator it = StringsKt.split$default(value, new char[]{','}, 6).iterator();
                    while (it.hasNext()) {
                        treeSet.add(StringsKt.trim((String) it.next()).toString());
                    }
                }
            }
            return treeSet == null ? EmptySet.INSTANCE : treeSet;
        }
    }

    public Cache(FileSystem fileSystem, Path path, long j) {
        fileSystem.getClass();
        TaskRunner taskRunner = TaskRunner.INSTANCE;
        taskRunner.getClass();
        this.cache = new DiskLruCache(fileSystem, path, j, taskRunner);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.cache.close();
    }

    @Override // java.io.Flushable
    public final void flush() {
        this.cache.flush();
    }

    public final void remove$okhttp(Request request) {
        request.getClass();
        DiskLruCache diskLruCache = this.cache;
        HttpUrl httpUrl = request.url;
        httpUrl.getClass();
        ByteString.Companion companion = ByteString.Companion;
        String hex = ByteString.Companion.encodeUtf8(httpUrl.url).digest$okio("MD5").hex();
        synchronized (diskLruCache) {
            hex.getClass();
            diskLruCache.initialize();
            diskLruCache.checkNotClosed();
            DiskLruCache.validateKey(hex);
            DiskLruCache.Entry entry = (DiskLruCache.Entry) diskLruCache.lruEntries.get(hex);
            if (entry == null) {
                return;
            }
            diskLruCache.removeEntry$okhttp(entry);
            if (diskLruCache.size <= diskLruCache.maxSize) {
                diskLruCache.mostRecentTrimFailed = false;
            }
        }
    }

    /* loaded from: classes9.dex */
    public final class CacheResponseBody extends ResponseBody {
        public final RealBufferedSource bodySource;
        public final String contentLength;
        public final String contentType;
        public final DiskLruCache.Snapshot snapshot;

        public CacheResponseBody(DiskLruCache.Snapshot snapshot, String str, String str2) {
            this.snapshot = snapshot;
            this.contentType = str;
            this.contentLength = str2;
            this.bodySource = new RealBufferedSource(new AnonymousClass1(snapshot.getSource(1), this));
        }

        @Override // okhttp3.ResponseBody
        public final long contentLength() {
            String str = this.contentLength;
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

        @Override // okhttp3.ResponseBody
        public final MediaType contentType() {
            String str = this.contentType;
            if (str != null) {
                Regex regex = MediaType.TYPE_SUBTYPE;
                try {
                    return UnsignedKt.get(str);
                } catch (IllegalArgumentException unused) {
                }
            }
            return null;
        }

        public final DiskLruCache.Snapshot getSnapshot() {
            return this.snapshot;
        }

        @Override // okhttp3.ResponseBody
        public final BufferedSource source() {
            return this.bodySource;
        }

        /* renamed from: okhttp3.Cache$CacheResponseBody$1, reason: invalid class name */
        public final class AnonymousClass1 extends ForwardingSource {
            public final /* synthetic */ int $r8$classId = 1;
            public Object this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(Source source, CacheResponseBody cacheResponseBody) {
                super(source);
                this.this$0 = cacheResponseBody;
            }

            @Override // okio.ForwardingSource, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                switch (this.$r8$classId) {
                    case 0:
                        ((CacheResponseBody) this.this$0).snapshot.close();
                        super.close();
                        break;
                    default:
                        super.close();
                        break;
                }
            }

            @Override // okio.ForwardingSource, okio.Source
            public long read(Buffer buffer, long j) {
                switch (this.$r8$classId) {
                    case 1:
                        try {
                            return super.read(buffer, j);
                        } catch (Exception e) {
                            this.this$0 = e;
                            throw e;
                        }
                    default:
                        return super.read(buffer, j);
                }
            }

            public /* synthetic */ AnonymousClass1(Source source) {
                super(source);
            }
        }
    }

    /* loaded from: classes9.dex */
    public final class Entry {
        public static final String RECEIVED_MILLIS;
        public static final String SENT_MILLIS;
        public final int code;
        public final Handshake handshake;
        public final String message;
        public final Protocol protocol;
        public final long receivedResponseMillis;
        public final String requestMethod;
        public final Headers responseHeaders;
        public final long sentRequestMillis;
        public final HttpUrl url;
        public final Headers varyHeaders;

        static {
            Android10Platform android10Platform = Platform.platform;
            Platform.platform.getClass();
            SENT_MILLIS = "OkHttp-Sent-Millis";
            Platform.platform.getClass();
            RECEIVED_MILLIS = "OkHttp-Received-Millis";
        }

        public Entry(Source source) {
            HttpUrl httpUrl;
            TlsVersion tlsVersion;
            source.getClass();
            try {
                RealBufferedSource realBufferedSource = new RealBufferedSource(source);
                String readUtf8LineStrict = realBufferedSource.readUtf8LineStrict(Long.MAX_VALUE);
                try {
                    HttpUrl.Builder builder = new HttpUrl.Builder();
                    builder.parse$okhttp(null, readUtf8LineStrict);
                    httpUrl = builder.build();
                } catch (IllegalArgumentException unused) {
                    httpUrl = null;
                }
                if (httpUrl == null) {
                    IOException iOException = new IOException("Cache corruption for ".concat(readUtf8LineStrict));
                    Android10Platform android10Platform = Platform.platform;
                    Platform.platform.log(5, "cache corruption", iOException);
                    throw iOException;
                }
                this.url = httpUrl;
                this.requestMethod = realBufferedSource.readUtf8LineStrict(Long.MAX_VALUE);
                Headers.Builder builder2 = new Headers.Builder();
                int readInt$okhttp = Companion.readInt$okhttp(realBufferedSource);
                for (int i = 0; i < readInt$okhttp; i++) {
                    builder2.addLenient$okhttp(realBufferedSource.readUtf8LineStrict(Long.MAX_VALUE));
                }
                this.varyHeaders = builder2.build();
                StatusLine parse = TuplesKt.parse(realBufferedSource.readUtf8LineStrict(Long.MAX_VALUE));
                this.protocol = (Protocol) parse.protocol;
                this.code = parse.code;
                this.message = (String) parse.message;
                Headers.Builder builder3 = new Headers.Builder();
                int readInt$okhttp2 = Companion.readInt$okhttp(realBufferedSource);
                for (int i2 = 0; i2 < readInt$okhttp2; i2++) {
                    builder3.addLenient$okhttp(realBufferedSource.readUtf8LineStrict(Long.MAX_VALUE));
                }
                String str = SENT_MILLIS;
                String str2 = builder3.get(str);
                String str3 = RECEIVED_MILLIS;
                String str4 = builder3.get(str3);
                builder3.removeAll(str);
                builder3.removeAll(str3);
                this.sentRequestMillis = str2 != null ? Long.parseLong(str2) : 0L;
                this.receivedResponseMillis = str4 != null ? Long.parseLong(str4) : 0L;
                this.responseHeaders = builder3.build();
                if (this.url.isHttps()) {
                    String readUtf8LineStrict2 = realBufferedSource.readUtf8LineStrict(Long.MAX_VALUE);
                    if (readUtf8LineStrict2.length() > 0) {
                        throw new IOException("expected \"\" but was \"" + readUtf8LineStrict2 + '\"');
                    }
                    CipherSuite m4320forJavaName = CipherSuite.Companion.m4320forJavaName(realBufferedSource.readUtf8LineStrict(Long.MAX_VALUE));
                    List readCertificateList = readCertificateList(realBufferedSource);
                    List readCertificateList2 = readCertificateList(realBufferedSource);
                    if (realBufferedSource.exhausted()) {
                        tlsVersion = TlsVersion.SSL_3_0;
                    } else {
                        HttpUrl.Companion companion = TlsVersion.Companion;
                        String readUtf8LineStrict3 = realBufferedSource.readUtf8LineStrict(Long.MAX_VALUE);
                        companion.getClass();
                        tlsVersion = HttpUrl.Companion.forJavaName(readUtf8LineStrict3);
                    }
                    readCertificateList.getClass();
                    readCertificateList2.getClass();
                    this.handshake = new Handshake(tlsVersion, m4320forJavaName, _UtilJvmKt.toImmutableList(readCertificateList2), new Handshake$Companion$$ExternalSyntheticLambda0(_UtilJvmKt.toImmutableList(readCertificateList), 0));
                } else {
                    this.handshake = null;
                }
                source.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    Utf8.closeFinally(source, th);
                    throw th2;
                }
            }
        }

        public static List readCertificateList(RealBufferedSource realBufferedSource) {
            int readInt$okhttp = Companion.readInt$okhttp(realBufferedSource);
            if (readInt$okhttp == -1) {
                return EmptyList.INSTANCE;
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(readInt$okhttp);
                int i = 0;
                for (int i2 = 0; i2 < readInt$okhttp; i2++) {
                    String readUtf8LineStrict = realBufferedSource.readUtf8LineStrict(Long.MAX_VALUE);
                    Buffer buffer = new Buffer();
                    ByteString.Companion companion = ByteString.Companion;
                    ByteString decodeBase64 = ByteString.Companion.decodeBase64(readUtf8LineStrict);
                    if (decodeBase64 == null) {
                        throw new IOException("Corrupt certificate in cache entry");
                    }
                    buffer.m4333write(decodeBase64);
                    arrayList.add(certificateFactory.generateCertificate(new Buffer$inputStream$1(buffer, i)));
                }
                return arrayList;
            } catch (CertificateException e) {
                a$$ExternalSyntheticBUOutline0.m$4(e.getMessage());
                return null;
            }
        }

        public static void writeCertList(RealBufferedSink realBufferedSink, List list) {
            try {
                realBufferedSink.writeDecimalLong(list.size());
                realBufferedSink.writeByte(10);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    byte[] encoded = ((Certificate) it.next()).getEncoded();
                    ByteString.Companion companion = ByteString.Companion;
                    encoded.getClass();
                    realBufferedSink.writeUtf8(ByteString.Companion.of$default(encoded).base64());
                    realBufferedSink.writeByte(10);
                }
            } catch (CertificateEncodingException e) {
                a$$ExternalSyntheticBUOutline0.m$4(e.getMessage());
            }
        }

        public final boolean matches(Request request, Response response) {
            if (!Intrinsics.areEqual(this.url, request.url) || !Intrinsics.areEqual(this.requestMethod, request.method)) {
                return false;
            }
            Headers headers = this.varyHeaders;
            headers.getClass();
            Set<String> varyFields = Companion.varyFields(response.headers);
            if ((varyFields instanceof Collection) && varyFields.isEmpty()) {
                return true;
            }
            for (String str : varyFields) {
                if (!Intrinsics.areEqual(headers.values(str), request.headers.values(str))) {
                    return false;
                }
            }
            return true;
        }

        public final Response response(DiskLruCache.Snapshot snapshot) {
            Headers headers = this.responseHeaders;
            String str = headers.get("Content-Type");
            String str2 = headers.get("Content-Length");
            Request request = new Request(this.url, this.varyHeaders, this.requestMethod, 8);
            ResponseBody$Companion$asResponseBody$1 responseBody$Companion$asResponseBody$1 = ResponseBody.EMPTY;
            new ArrayList(20);
            Protocol protocol = this.protocol;
            protocol.getClass();
            String str3 = this.message;
            str3.getClass();
            Headers.Builder newBuilder = headers.newBuilder();
            CacheResponseBody cacheResponseBody = new CacheResponseBody(snapshot, str, str2);
            int i = this.code;
            if (i >= 0) {
                return new Response(request, protocol, str3, i, this.handshake, newBuilder.build(), cacheResponseBody, null, null, null, null, this.sentRequestMillis, this.receivedResponseMillis, null, TrailersSource.EMPTY);
            }
            Path$$ExternalSyntheticBUOutline0.m((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "code < 0: "));
            return null;
        }

        public final void writeTo(com.android.volley.Response response) {
            Handshake handshake;
            HttpUrl httpUrl = this.url;
            Headers headers = this.responseHeaders;
            Headers headers2 = this.varyHeaders;
            RealBufferedSink realBufferedSink = new RealBufferedSink(response.newSink(0));
            try {
                realBufferedSink.writeUtf8(httpUrl.url);
                realBufferedSink.writeByte(10);
                realBufferedSink.writeUtf8(this.requestMethod);
                realBufferedSink.writeByte(10);
                realBufferedSink.writeDecimalLong(headers2.size());
                realBufferedSink.writeByte(10);
                int size = headers2.size();
                for (int i = 0; i < size; i++) {
                    realBufferedSink.writeUtf8(headers2.name(i));
                    realBufferedSink.writeUtf8(": ");
                    realBufferedSink.writeUtf8(headers2.value(i));
                    realBufferedSink.writeByte(10);
                }
                Protocol protocol = this.protocol;
                int i2 = this.code;
                String str = this.message;
                protocol.getClass();
                str.getClass();
                StringBuilder sb = new StringBuilder();
                if (protocol == Protocol.HTTP_1_0) {
                    sb.append("HTTP/1.0");
                } else {
                    sb.append("HTTP/1.1");
                }
                sb.append(' ');
                sb.append(i2);
                sb.append(' ');
                sb.append(str);
                realBufferedSink.writeUtf8(sb.toString());
                realBufferedSink.writeByte(10);
                realBufferedSink.writeDecimalLong(headers.size() + 2);
                realBufferedSink.writeByte(10);
                int size2 = headers.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    realBufferedSink.writeUtf8(headers.name(i3));
                    realBufferedSink.writeUtf8(": ");
                    realBufferedSink.writeUtf8(headers.value(i3));
                    realBufferedSink.writeByte(10);
                }
                realBufferedSink.writeUtf8(SENT_MILLIS);
                realBufferedSink.writeUtf8(": ");
                realBufferedSink.writeDecimalLong(this.sentRequestMillis);
                realBufferedSink.writeByte(10);
                realBufferedSink.writeUtf8(RECEIVED_MILLIS);
                realBufferedSink.writeUtf8(": ");
                realBufferedSink.writeDecimalLong(this.receivedResponseMillis);
                realBufferedSink.writeByte(10);
                if (httpUrl.isHttps() && (handshake = this.handshake) != null) {
                    realBufferedSink.writeByte(10);
                    realBufferedSink.writeUtf8(handshake.cipherSuite.javaName);
                    realBufferedSink.writeByte(10);
                    writeCertList(realBufferedSink, handshake.peerCertificates());
                    writeCertList(realBufferedSink, handshake.localCertificates);
                    realBufferedSink.writeUtf8(handshake.tlsVersion.javaName);
                    realBufferedSink.writeByte(10);
                }
                realBufferedSink.close();
            } finally {
            }
        }

        public Entry(Response response) {
            Headers build;
            Request request = response.request;
            this.url = request.url;
            Response response2 = response.networkResponse;
            response2.getClass();
            Headers headers = response2.request.headers;
            Headers headers2 = response.headers;
            Set varyFields = Companion.varyFields(headers2);
            if (varyFields.isEmpty()) {
                build = Headers.EMPTY;
            } else {
                Headers.Builder builder = new Headers.Builder();
                int size = headers.size();
                for (int i = 0; i < size; i++) {
                    String name = headers.name(i);
                    if (varyFields.contains(name)) {
                        builder.add(name, headers.value(i));
                    }
                }
                build = builder.build();
            }
            this.varyHeaders = build;
            this.requestMethod = request.method;
            this.protocol = response.protocol;
            this.code = response.code;
            this.message = response.message;
            this.responseHeaders = headers2;
            this.handshake = response.handshake;
            this.sentRequestMillis = response.sentRequestAtMillis;
            this.receivedResponseMillis = response.receivedResponseAtMillis;
        }
    }
}
