package com.drake.net.cache;

import com.google.common.net.HttpHeaders;
import com.just.agentweb.DefaultWebClient;
import java.io.Closeable;
import java.io.File;
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
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.w;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.t;
import okhttp3.CipherSuite;
import okhttp3.Handshake;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.OkHttpUtils;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.TlsVersion;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheRequest;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.http.RealResponseBody;
import okhttp3.internal.http.StatusLine;
import okhttp3.internal.platform.Platform;
import okio.ByteString;
import okio.j0;
import okio.l;
import okio.m;
import okio.v0;
import okio.x0;
import okio.y0;

/* loaded from: classes3.dex */
public final class a implements Closeable, Flushable {
    public static final b Companion = new b(null);
    private static final int ENTRY_BODY = 1;
    private static final int ENTRY_METADATA = 0;
    private final DiskLruCache cache;
    private int writeAbortCount;
    private int writeSuccessCount;

    /* renamed from: com.drake.net.cache.a$a, reason: collision with other inner class name */
    private static final class C0254a extends ResponseBody {
        private final okio.e bodySource;
        private final String contentLength;
        private final String contentType;
        private final DiskLruCache.Snapshot snapshot;

        /* renamed from: com.drake.net.cache.a$a$a, reason: collision with other inner class name */
        public static final class C0255a extends m {
            final /* synthetic */ C0254a this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0255a(x0 x0Var, C0254a c0254a) {
                super(x0Var);
                this.this$0 = c0254a;
            }

            @Override // okio.m, okio.x0, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                this.this$0.getSnapshot().close();
                super.close();
            }
        }

        public C0254a(DiskLruCache.Snapshot snapshot, String str, String str2) {
            s.checkNotNullParameter(snapshot, "snapshot");
            this.snapshot = snapshot;
            this.contentType = str;
            this.contentLength = str2;
            this.bodySource = j0.buffer(new C0255a(snapshot.getSource(1), this));
        }

        @Override // okhttp3.ResponseBody
        public long contentLength() {
            String str = this.contentLength;
            if (str != null) {
                return Util.toLongOrDefault(str, -1L);
            }
            return -1L;
        }

        @Override // okhttp3.ResponseBody
        public MediaType contentType() {
            String str = this.contentType;
            if (str != null) {
                return MediaType.Companion.parse(str);
            }
            return null;
        }

        public final DiskLruCache.Snapshot getSnapshot() {
            return this.snapshot;
        }

        @Override // okhttp3.ResponseBody
        public okio.e source() {
            return this.bodySource;
        }
    }

    private final class d implements CacheRequest {
        private final v0 body;
        private final v0 cacheOut;
        private boolean done;
        private final DiskLruCache.Editor editor;
        final /* synthetic */ a this$0;

        /* renamed from: com.drake.net.cache.a$d$a, reason: collision with other inner class name */
        public static final class C0257a extends l {
            final /* synthetic */ a this$0;
            final /* synthetic */ d this$1;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0257a(a aVar, d dVar, v0 v0Var) {
                super(v0Var);
                this.this$0 = aVar;
                this.this$1 = dVar;
            }

            @Override // okio.l, okio.v0, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                a aVar = this.this$0;
                d dVar = this.this$1;
                synchronized (aVar) {
                    if (dVar.getDone()) {
                        return;
                    }
                    dVar.setDone(true);
                    aVar.setWriteSuccessCount$net_release(aVar.getWriteSuccessCount$net_release() + 1);
                    super.close();
                    this.this$1.editor.commit();
                }
            }
        }

        public d(a aVar, DiskLruCache.Editor editor) {
            s.checkNotNullParameter(editor, "editor");
            this.this$0 = aVar;
            this.editor = editor;
            v0 newSink = editor.newSink(1);
            this.cacheOut = newSink;
            this.body = new C0257a(aVar, this, newSink);
        }

        @Override // okhttp3.internal.cache.CacheRequest
        public void abort() {
            a aVar = this.this$0;
            synchronized (aVar) {
                if (this.done) {
                    return;
                }
                this.done = true;
                aVar.setWriteAbortCount$net_release(aVar.getWriteAbortCount$net_release() + 1);
                Util.closeQuietly(this.cacheOut);
                try {
                    this.editor.abort();
                } catch (IOException unused) {
                }
            }
        }

        @Override // okhttp3.internal.cache.CacheRequest
        public v0 body() {
            return this.body;
        }

        public final boolean getDone() {
            return this.done;
        }

        public final void setDone(boolean z7) {
            this.done = z7;
        }
    }

    public static final class e implements x0 {
        final /* synthetic */ okio.d $cacheBody;
        final /* synthetic */ CacheRequest $cacheRequest;
        final /* synthetic */ okio.e $source;
        private boolean cacheRequestClosed;

        e(okio.e eVar, CacheRequest cacheRequest, okio.d dVar) {
            this.$source = eVar;
            this.$cacheRequest = cacheRequest;
            this.$cacheBody = dVar;
        }

        @Override // okio.x0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!this.cacheRequestClosed && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                this.cacheRequestClosed = true;
                this.$cacheRequest.abort();
            }
            this.$source.close();
        }

        @Override // okio.x0
        public long read(okio.c sink, long j8) {
            s.checkNotNullParameter(sink, "sink");
            try {
                long read = this.$source.read(sink, j8);
                if (read != -1) {
                    sink.copyTo(this.$cacheBody.getBuffer(), sink.size() - read, read);
                    this.$cacheBody.emitCompleteSegments();
                    return read;
                }
                if (!this.cacheRequestClosed) {
                    this.cacheRequestClosed = true;
                    this.$cacheBody.close();
                }
                return -1L;
            } catch (IOException e8) {
                if (!this.cacheRequestClosed) {
                    this.cacheRequestClosed = true;
                    this.$cacheRequest.abort();
                }
                throw e8;
            }
        }

        @Override // okio.x0
        public y0 timeout() {
            return this.$source.timeout();
        }
    }

    public static final class f implements Iterator, g6.d {
        private boolean canRemove;
        private final Iterator<DiskLruCache.Snapshot> delegate;
        private String nextUrl;

        f(a aVar) {
            this.delegate = aVar.getCache().snapshots();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.nextUrl != null) {
                return true;
            }
            this.canRemove = false;
            while (this.delegate.hasNext()) {
                try {
                    try {
                        continue;
                        this.nextUrl = j0.buffer(this.delegate.next().getSource(0)).readUtf8LineStrict();
                        return true;
                    } finally {
                    }
                } catch (IOException unused) {
                }
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.canRemove) {
                throw new IllegalStateException("remove() before next()".toString());
            }
            this.delegate.remove();
        }

        @Override // java.util.Iterator
        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            String str = this.nextUrl;
            s.checkNotNull(str);
            this.nextUrl = null;
            this.canRemove = true;
            return str;
        }
    }

    public a(DiskLruCache cache) {
        s.checkNotNullParameter(cache, "cache");
        this.cache = cache;
    }

    private final void abortQuietly(DiskLruCache.Editor editor) {
        if (editor != null) {
            try {
                editor.abort();
            } catch (IOException unused) {
            }
        }
    }

    public static final String key(Request request) {
        return Companion.key(request);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.cache.close();
    }

    public final void delete() {
        this.cache.delete();
    }

    public final File directory() {
        return this.cache.getDirectory();
    }

    public final void evictAll() {
        this.cache.evictAll();
    }

    @Override // java.io.Flushable
    public void flush() {
        this.cache.flush();
    }

    public final Response get$net_release(Request request) {
        s.checkNotNullParameter(request, "request");
        try {
            DiskLruCache.Snapshot snapshot = this.cache.get(Companion.key(request));
            if (snapshot == null) {
                return null;
            }
            try {
                Response response = new c(snapshot.getSource(0)).response(snapshot, request.body());
                t4.b bVar = (t4.b) request.tag(t4.b.class);
                Long valueOf = bVar != null ? Long.valueOf(bVar.m1480unboximpl()) : null;
                if (valueOf == null || System.currentTimeMillis() - response.receivedResponseAtMillis() <= valueOf.longValue()) {
                    return response.newBuilder().request(request).build();
                }
                return null;
            } catch (IOException unused) {
                Util.closeQuietly(snapshot);
                return null;
            }
        } catch (IOException unused2) {
        }
    }

    public final DiskLruCache getCache() {
        return this.cache;
    }

    public final int getWriteAbortCount$net_release() {
        return this.writeAbortCount;
    }

    public final int getWriteSuccessCount$net_release() {
        return this.writeSuccessCount;
    }

    public final void initialize() {
        this.cache.initialize();
    }

    public final boolean isClosed() {
        return this.cache.isClosed();
    }

    public final long maxSize() {
        return this.cache.getMaxSize();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0039 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Response put$net_release(Response response) {
        DiskLruCache.Editor editor;
        d dVar;
        s.checkNotNullParameter(response, "response");
        if (!response.isSuccessful()) {
            return response;
        }
        c cVar = new c(response);
        try {
            editor = DiskLruCache.edit$default(this.cache, Companion.key(response.request()), 0L, 2, null);
        } catch (IOException unused) {
            editor = null;
        }
        if (editor == null) {
            return response;
        }
        try {
            cVar.writeTo(editor);
            dVar = new d(this, editor);
        } catch (IOException unused2) {
            abortQuietly(editor);
            dVar = null;
            if (dVar != null) {
            }
        }
        if (dVar != null) {
            return response;
        }
        okio.d buffer = j0.buffer(dVar.body());
        ResponseBody body = response.body();
        if (body == null) {
            return response;
        }
        return response.newBuilder().body(new RealResponseBody(Response.header$default(response, "Content-Type", null, 2, null), body.contentLength(), j0.buffer(new e(body.source(), dVar, buffer)))).build();
    }

    public final void remove$net_release(Request request) {
        s.checkNotNullParameter(request, "request");
        this.cache.remove(Companion.key(request));
    }

    public final void setWriteAbortCount$net_release(int i8) {
        this.writeAbortCount = i8;
    }

    public final void setWriteSuccessCount$net_release(int i8) {
        this.writeSuccessCount = i8;
    }

    public final long size() {
        return this.cache.size();
    }

    public final void update$net_release(Response cached, Response network) {
        DiskLruCache.Editor editor;
        s.checkNotNullParameter(cached, "cached");
        s.checkNotNullParameter(network, "network");
        c cVar = new c(network);
        ResponseBody body = cached.body();
        s.checkNotNull(body, "null cannot be cast to non-null type com.drake.net.cache.ForceCache.CacheResponseBody");
        try {
            editor = ((C0254a) body).getSnapshot().edit();
            if (editor == null) {
                return;
            }
            try {
                cVar.writeTo(editor);
                editor.commit();
            } catch (IOException unused) {
                abortQuietly(editor);
            }
        } catch (IOException unused2) {
            editor = null;
        }
    }

    public final Iterator<String> urls() {
        return new f(this);
    }

    public final synchronized int writeAbortCount() {
        return this.writeAbortCount;
    }

    public final synchronized int writeSuccessCount() {
        return this.writeSuccessCount;
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(o oVar) {
            this();
        }

        private final Set<String> varyFields(Headers headers) {
            Set<String> emptySet;
            List split$default;
            Comparator case_insensitive_order;
            int size = headers.size();
            TreeSet treeSet = null;
            for (int i8 = 0; i8 < size; i8++) {
                if (t.equals(HttpHeaders.VARY, headers.name(i8), true)) {
                    String value = headers.value(i8);
                    if (treeSet == null) {
                        case_insensitive_order = t.getCASE_INSENSITIVE_ORDER(w.INSTANCE);
                        treeSet = new TreeSet(case_insensitive_order);
                    }
                    split$default = StringsKt__StringsKt.split$default((CharSequence) value, new char[]{','}, false, 0, 6, (Object) null);
                    Iterator it = split$default.iterator();
                    while (it.hasNext()) {
                        treeSet.add(StringsKt__StringsKt.trim((CharSequence) it.next()).toString());
                    }
                }
            }
            if (treeSet != null) {
                return treeSet;
            }
            emptySet = kotlin.collections.x0.emptySet();
            return emptySet;
        }

        public final boolean hasVaryAll(Response response) {
            s.checkNotNullParameter(response, "<this>");
            return varyFields(response.headers()).contains("*");
        }

        public final String key(Request request) {
            s.checkNotNullParameter(request, "request");
            t4.a aVar = (t4.a) request.tag(t4.a.class);
            String m1473unboximpl = aVar != null ? aVar.m1473unboximpl() : null;
            if (m1473unboximpl == null) {
                m1473unboximpl = request.method() + request.url();
            }
            return ByteString.Companion.encodeUtf8(m1473unboximpl).sha1().hex();
        }

        public final int readInt$net_release(okio.e source) {
            s.checkNotNullParameter(source, "source");
            try {
                long readDecimalLong = source.readDecimalLong();
                String readUtf8LineStrict = source.readUtf8LineStrict();
                if (readDecimalLong >= 0 && readDecimalLong <= 2147483647L && readUtf8LineStrict.length() <= 0) {
                    return (int) readDecimalLong;
                }
                throw new IOException("expected an int but was \"" + readDecimalLong + readUtf8LineStrict + '\"');
            } catch (NumberFormatException e8) {
                throw new IOException(e8.getMessage());
            }
        }

        public final Headers varyHeaders(Response response) {
            s.checkNotNullParameter(response, "<this>");
            Response networkResponse = response.networkResponse();
            s.checkNotNull(networkResponse);
            return varyHeaders(networkResponse.request().headers(), response.headers());
        }

        public final boolean varyMatches(Response cachedResponse, Headers cachedRequest, Request newRequest) {
            s.checkNotNullParameter(cachedResponse, "cachedResponse");
            s.checkNotNullParameter(cachedRequest, "cachedRequest");
            s.checkNotNullParameter(newRequest, "newRequest");
            Set<String> varyFields = varyFields(cachedResponse.headers());
            if ((varyFields instanceof Collection) && varyFields.isEmpty()) {
                return true;
            }
            for (String str : varyFields) {
                if (!s.areEqual(cachedRequest.values(str), newRequest.headers(str))) {
                    return false;
                }
            }
            return true;
        }

        private final Headers varyHeaders(Headers headers, Headers headers2) {
            Set<String> varyFields = varyFields(headers2);
            if (varyFields.isEmpty()) {
                return Util.EMPTY_HEADERS;
            }
            Headers.Builder builder = new Headers.Builder();
            int size = headers.size();
            for (int i8 = 0; i8 < size; i8++) {
                String name = headers.name(i8);
                if (varyFields.contains(name)) {
                    builder.add(name, headers.value(i8));
                }
            }
            return builder.build();
        }
    }

    private static final class c {
        public static final C0256a Companion = new C0256a(null);
        private static final String RECEIVED_MILLIS;
        private static final String SENT_MILLIS;
        private final int code;
        private final Handshake handshake;
        private final String message;
        private final Protocol protocol;
        private final long receivedResponseMillis;
        private final String requestMethod;
        private final Headers responseHeaders;
        private final long sentRequestMillis;
        private final String url;
        private final Headers varyHeaders;

        /* renamed from: com.drake.net.cache.a$c$a, reason: collision with other inner class name */
        public static final class C0256a {
            private C0256a() {
            }

            public /* synthetic */ C0256a(o oVar) {
                this();
            }
        }

        static {
            StringBuilder sb = new StringBuilder();
            Platform.Companion companion = Platform.Companion;
            sb.append(companion.get().getPrefix());
            sb.append("-Sent-Millis");
            SENT_MILLIS = sb.toString();
            RECEIVED_MILLIS = companion.get().getPrefix() + "-Received-Millis";
        }

        public c(x0 rawSource) {
            s.checkNotNullParameter(rawSource, "rawSource");
            try {
                okio.e buffer = j0.buffer(rawSource);
                this.url = buffer.readUtf8LineStrict();
                this.requestMethod = buffer.readUtf8LineStrict();
                Headers.Builder builder = new Headers.Builder();
                int readInt$net_release = a.Companion.readInt$net_release(buffer);
                for (int i8 = 0; i8 < readInt$net_release; i8++) {
                    OkHttpUtils.addLenient(builder, buffer.readUtf8LineStrict());
                }
                this.varyHeaders = builder.build();
                StatusLine parse = StatusLine.Companion.parse(buffer.readUtf8LineStrict());
                this.protocol = parse.protocol;
                this.code = parse.code;
                this.message = parse.message;
                Headers.Builder builder2 = new Headers.Builder();
                int readInt$net_release2 = a.Companion.readInt$net_release(buffer);
                for (int i9 = 0; i9 < readInt$net_release2; i9++) {
                    OkHttpUtils.addLenient(builder2, buffer.readUtf8LineStrict());
                }
                String str = SENT_MILLIS;
                String str2 = builder2.get(str);
                String str3 = RECEIVED_MILLIS;
                String str4 = builder2.get(str3);
                builder2.removeAll(str);
                builder2.removeAll(str3);
                this.sentRequestMillis = str2 != null ? Long.parseLong(str2) : 0L;
                this.receivedResponseMillis = str4 != null ? Long.parseLong(str4) : 0L;
                this.responseHeaders = builder2.build();
                if (isHttps()) {
                    String readUtf8LineStrict = buffer.readUtf8LineStrict();
                    if (readUtf8LineStrict.length() > 0) {
                        throw new IOException("expected \"\" but was \"" + readUtf8LineStrict + '\"');
                    }
                    this.handshake = Handshake.Companion.get(!buffer.exhausted() ? TlsVersion.Companion.forJavaName(buffer.readUtf8LineStrict()) : TlsVersion.SSL_3_0, CipherSuite.Companion.forJavaName(buffer.readUtf8LineStrict()), readCertificateList(buffer), readCertificateList(buffer));
                } else {
                    this.handshake = null;
                }
                rawSource.close();
            } catch (Throwable th) {
                rawSource.close();
                throw th;
            }
        }

        private final boolean isHttps() {
            return t.startsWith$default(this.url, DefaultWebClient.HTTPS_SCHEME, false, 2, null);
        }

        private final List<Certificate> readCertificateList(okio.e eVar) {
            int readInt$net_release = a.Companion.readInt$net_release(eVar);
            if (readInt$net_release == -1) {
                return CollectionsKt__CollectionsKt.emptyList();
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(readInt$net_release);
                for (int i8 = 0; i8 < readInt$net_release; i8++) {
                    String readUtf8LineStrict = eVar.readUtf8LineStrict();
                    okio.c cVar = new okio.c();
                    ByteString decodeBase64 = ByteString.Companion.decodeBase64(readUtf8LineStrict);
                    s.checkNotNull(decodeBase64);
                    cVar.write(decodeBase64);
                    arrayList.add(certificateFactory.generateCertificate(cVar.inputStream()));
                }
                return arrayList;
            } catch (CertificateException e8) {
                throw new IOException(e8.getMessage());
            }
        }

        private final void writeCertList(okio.d dVar, List<? extends Certificate> list) {
            try {
                dVar.writeDecimalLong(list.size()).writeByte(10);
                Iterator<? extends Certificate> it = list.iterator();
                while (it.hasNext()) {
                    byte[] bytes = it.next().getEncoded();
                    ByteString.a aVar = ByteString.Companion;
                    s.checkNotNullExpressionValue(bytes, "bytes");
                    dVar.writeUtf8(ByteString.a.of$default(aVar, bytes, 0, 0, 3, null).base64()).writeByte(10);
                }
            } catch (CertificateEncodingException e8) {
                throw new IOException(e8.getMessage());
            }
        }

        public final Response response(DiskLruCache.Snapshot snapshot, RequestBody requestBody) {
            s.checkNotNullParameter(snapshot, "snapshot");
            String str = this.responseHeaders.get("Content-Type");
            String str2 = this.responseHeaders.get("Content-Length");
            Response.Builder receivedResponseAtMillis = new Response.Builder().request(new Request.Builder().url(this.url).method(this.requestMethod, requestBody).headers(this.varyHeaders).build()).protocol(this.protocol).code(this.code).message(this.message).headers(this.responseHeaders).handshake(this.handshake).sentRequestAtMillis(this.sentRequestMillis).receivedResponseAtMillis(this.receivedResponseMillis);
            return receivedResponseAtMillis.cacheResponse(receivedResponseAtMillis.build()).body(new C0254a(snapshot, str, str2)).build();
        }

        public final void writeTo(DiskLruCache.Editor editor) {
            y5.w wVar;
            s.checkNotNullParameter(editor, "editor");
            okio.d buffer = j0.buffer(editor.newSink(0));
            Throwable th = null;
            try {
                buffer.writeUtf8(this.url).writeByte(10);
                buffer.writeUtf8(this.requestMethod).writeByte(10);
                buffer.writeDecimalLong(this.varyHeaders.size()).writeByte(10);
                int size = this.varyHeaders.size();
                for (int i8 = 0; i8 < size; i8++) {
                    buffer.writeUtf8(this.varyHeaders.name(i8)).writeUtf8(": ").writeUtf8(this.varyHeaders.value(i8)).writeByte(10);
                }
                buffer.writeUtf8(new StatusLine(this.protocol, this.code, this.message).toString()).writeByte(10);
                buffer.writeDecimalLong(this.responseHeaders.size() + 2).writeByte(10);
                int size2 = this.responseHeaders.size();
                for (int i9 = 0; i9 < size2; i9++) {
                    buffer.writeUtf8(this.responseHeaders.name(i9)).writeUtf8(": ").writeUtf8(this.responseHeaders.value(i9)).writeByte(10);
                }
                buffer.writeUtf8(SENT_MILLIS).writeUtf8(": ").writeDecimalLong(this.sentRequestMillis).writeByte(10);
                buffer.writeUtf8(RECEIVED_MILLIS).writeUtf8(": ").writeDecimalLong(this.receivedResponseMillis).writeByte(10);
                if (isHttps()) {
                    buffer.writeByte(10);
                    Handshake handshake = this.handshake;
                    s.checkNotNull(handshake);
                    buffer.writeUtf8(handshake.cipherSuite().javaName()).writeByte(10);
                    writeCertList(buffer, this.handshake.peerCertificates());
                    writeCertList(buffer, this.handshake.localCertificates());
                    buffer.writeUtf8(this.handshake.tlsVersion().javaName()).writeByte(10);
                }
                wVar = y5.w.INSTANCE;
            } catch (Throwable th2) {
                th = th2;
                wVar = null;
            }
            if (buffer != null) {
                try {
                    buffer.close();
                } catch (Throwable th3) {
                    if (th == null) {
                        th = th3;
                    } else {
                        y5.b.addSuppressed(th, th3);
                    }
                }
            }
            if (th != null) {
                throw th;
            }
            s.checkNotNull(wVar);
        }

        public c(Response response) {
            s.checkNotNullParameter(response, "response");
            this.url = response.request().url().toString();
            this.varyHeaders = a.Companion.varyHeaders(response);
            this.requestMethod = response.request().method();
            this.protocol = response.protocol();
            this.code = response.code();
            this.message = response.message();
            this.responseHeaders = response.headers();
            this.handshake = response.handshake();
            this.sentRequestMillis = response.sentRequestAtMillis();
            this.receivedResponseMillis = response.receivedResponseAtMillis();
        }
    }
}
