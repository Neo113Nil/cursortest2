package okhttp3.internal.ws;

import com.baidu.mapapi.http.wrapper.HttpManager;
import com.google.common.net.HttpHeaders;
import j6.m;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import kotlin.collections.q;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kotlin.text.t;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.EventListener;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.ws.RealWebSocket;
import okhttp3.internal.ws.WebSocketReader;
import okio.ByteString;
import okio.d;
import okio.e;
import y5.w;

/* loaded from: classes5.dex */
public final class RealWebSocket implements WebSocket, WebSocketReader.FrameCallback {
    private static final long CANCEL_AFTER_CLOSE_MILLIS = 60000;
    public static final long DEFAULT_MINIMUM_DEFLATE_SIZE = 1024;
    private static final long MAX_QUEUE_SIZE = 16777216;
    private boolean awaitingPong;
    private Call call;
    private boolean enqueuedClose;
    private WebSocketExtensions extensions;
    private boolean failed;
    private final String key;
    private final WebSocketListener listener;
    private final ArrayDeque<Object> messageAndCloseQueue;
    private long minimumDeflateSize;
    private String name;
    private final Request originalRequest;
    private final long pingIntervalMillis;
    private final ArrayDeque<ByteString> pongQueue;
    private long queueSize;
    private final Random random;
    private WebSocketReader reader;
    private int receivedCloseCode;
    private String receivedCloseReason;
    private int receivedPingCount;
    private int receivedPongCount;
    private int sentPingCount;
    private Streams streams;
    private TaskQueue taskQueue;
    private WebSocketWriter writer;
    private Task writerTask;
    public static final Companion Companion = new Companion(null);
    private static final List<Protocol> ONLY_HTTP1 = q.listOf(Protocol.HTTP_1_1);

    public static final class Close {
        private final long cancelAfterCloseMillis;
        private final int code;
        private final ByteString reason;

        public Close(int i8, ByteString byteString, long j8) {
            this.code = i8;
            this.reason = byteString;
            this.cancelAfterCloseMillis = j8;
        }

        public final long getCancelAfterCloseMillis() {
            return this.cancelAfterCloseMillis;
        }

        public final int getCode() {
            return this.code;
        }

        public final ByteString getReason() {
            return this.reason;
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public static final class Message {
        private final ByteString data;
        private final int formatOpcode;

        public Message(int i8, ByteString data) {
            s.checkNotNullParameter(data, "data");
            this.formatOpcode = i8;
            this.data = data;
        }

        public final ByteString getData() {
            return this.data;
        }

        public final int getFormatOpcode() {
            return this.formatOpcode;
        }
    }

    public static abstract class Streams implements Closeable {
        private final boolean client;
        private final d sink;
        private final e source;

        public Streams(boolean z7, e source, d sink) {
            s.checkNotNullParameter(source, "source");
            s.checkNotNullParameter(sink, "sink");
            this.client = z7;
            this.source = source;
            this.sink = sink;
        }

        public final boolean getClient() {
            return this.client;
        }

        public final d getSink() {
            return this.sink;
        }

        public final e getSource() {
            return this.source;
        }
    }

    private final class WriterTask extends Task {
        final /* synthetic */ RealWebSocket this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WriterTask(RealWebSocket this$0) {
            super(s.stringPlus(this$0.name, " writer"), false, 2, null);
            s.checkNotNullParameter(this$0, "this$0");
            this.this$0 = this$0;
        }

        @Override // okhttp3.internal.concurrent.Task
        public long runOnce() {
            try {
                return this.this$0.writeOneFrame$okhttp() ? 0L : -1L;
            } catch (IOException e8) {
                this.this$0.failWebSocket(e8, null);
                return -1L;
            }
        }
    }

    public RealWebSocket(TaskRunner taskRunner, Request originalRequest, WebSocketListener listener, Random random, long j8, WebSocketExtensions webSocketExtensions, long j9) {
        s.checkNotNullParameter(taskRunner, "taskRunner");
        s.checkNotNullParameter(originalRequest, "originalRequest");
        s.checkNotNullParameter(listener, "listener");
        s.checkNotNullParameter(random, "random");
        this.originalRequest = originalRequest;
        this.listener = listener;
        this.random = random;
        this.pingIntervalMillis = j8;
        this.extensions = webSocketExtensions;
        this.minimumDeflateSize = j9;
        this.taskQueue = taskRunner.newQueue();
        this.pongQueue = new ArrayDeque<>();
        this.messageAndCloseQueue = new ArrayDeque<>();
        this.receivedCloseCode = -1;
        if (!s.areEqual(HttpManager.HTTP_GET, originalRequest.method())) {
            throw new IllegalArgumentException(s.stringPlus("Request must be GET: ", originalRequest.method()).toString());
        }
        ByteString.a aVar = ByteString.Companion;
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        w wVar = w.INSTANCE;
        this.key = ByteString.a.of$default(aVar, bArr, 0, 0, 3, null).base64();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isValid(WebSocketExtensions webSocketExtensions) {
        if (!webSocketExtensions.unknownValues && webSocketExtensions.clientMaxWindowBits == null) {
            return webSocketExtensions.serverMaxWindowBits == null || new m(8, 15).contains(webSocketExtensions.serverMaxWindowBits.intValue());
        }
        return false;
    }

    private final void runWriter() {
        if (!Util.assertionsEnabled || Thread.holdsLock(this)) {
            Task task = this.writerTask;
            if (task != null) {
                TaskQueue.schedule$default(this.taskQueue, task, 0L, 2, null);
                return;
            }
            return;
        }
        throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + this);
    }

    public final void awaitTermination(long j8, TimeUnit timeUnit) {
        s.checkNotNullParameter(timeUnit, "timeUnit");
        this.taskQueue.idleLatch().await(j8, timeUnit);
    }

    @Override // okhttp3.WebSocket
    public void cancel() {
        Call call = this.call;
        s.checkNotNull(call);
        call.cancel();
    }

    public final void checkUpgradeSuccess$okhttp(Response response, Exchange exchange) {
        s.checkNotNullParameter(response, "response");
        if (response.code() != 101) {
            throw new ProtocolException("Expected HTTP 101 response but was '" + response.code() + ' ' + response.message() + '\'');
        }
        String header$default = Response.header$default(response, "Connection", null, 2, null);
        if (!t.equals(HttpHeaders.UPGRADE, header$default, true)) {
            throw new ProtocolException("Expected 'Connection' header value 'Upgrade' but was '" + ((Object) header$default) + '\'');
        }
        String header$default2 = Response.header$default(response, HttpHeaders.UPGRADE, null, 2, null);
        if (!t.equals("websocket", header$default2, true)) {
            throw new ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + ((Object) header$default2) + '\'');
        }
        String header$default3 = Response.header$default(response, HttpHeaders.SEC_WEBSOCKET_ACCEPT, null, 2, null);
        String base64 = ByteString.Companion.encodeUtf8(s.stringPlus(this.key, WebSocketProtocol.ACCEPT_MAGIC)).sha1().base64();
        if (s.areEqual(base64, header$default3)) {
            if (exchange == null) {
                throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
            }
            return;
        }
        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + base64 + "' but was '" + ((Object) header$default3) + '\'');
    }

    @Override // okhttp3.WebSocket
    public boolean close(int i8, String str) {
        return close(i8, str, 60000L);
    }

    public final void connect(OkHttpClient client) {
        s.checkNotNullParameter(client, "client");
        if (this.originalRequest.header(HttpHeaders.SEC_WEBSOCKET_EXTENSIONS) != null) {
            failWebSocket(new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), null);
            return;
        }
        OkHttpClient build = client.newBuilder().eventListener(EventListener.NONE).protocols(ONLY_HTTP1).build();
        final Request build2 = this.originalRequest.newBuilder().header(HttpHeaders.UPGRADE, "websocket").header("Connection", HttpHeaders.UPGRADE).header(HttpHeaders.SEC_WEBSOCKET_KEY, this.key).header(HttpHeaders.SEC_WEBSOCKET_VERSION, "13").header(HttpHeaders.SEC_WEBSOCKET_EXTENSIONS, "permessage-deflate").build();
        RealCall realCall = new RealCall(build, build2, true);
        this.call = realCall;
        s.checkNotNull(realCall);
        realCall.enqueue(new Callback() { // from class: okhttp3.internal.ws.RealWebSocket$connect$1
            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException e8) {
                s.checkNotNullParameter(call, "call");
                s.checkNotNullParameter(e8, "e");
                RealWebSocket.this.failWebSocket(e8, null);
            }

            @Override // okhttp3.Callback
            public void onResponse(Call call, Response response) {
                boolean isValid;
                ArrayDeque arrayDeque;
                s.checkNotNullParameter(call, "call");
                s.checkNotNullParameter(response, "response");
                Exchange exchange = response.exchange();
                try {
                    RealWebSocket.this.checkUpgradeSuccess$okhttp(response, exchange);
                    s.checkNotNull(exchange);
                    RealWebSocket.Streams newWebSocketStreams = exchange.newWebSocketStreams();
                    WebSocketExtensions parse = WebSocketExtensions.Companion.parse(response.headers());
                    RealWebSocket.this.extensions = parse;
                    isValid = RealWebSocket.this.isValid(parse);
                    if (!isValid) {
                        RealWebSocket realWebSocket = RealWebSocket.this;
                        synchronized (realWebSocket) {
                            arrayDeque = realWebSocket.messageAndCloseQueue;
                            arrayDeque.clear();
                            realWebSocket.close(1010, "unexpected Sec-WebSocket-Extensions in response header");
                        }
                    }
                    try {
                        RealWebSocket.this.initReaderAndWriter(Util.okHttpName + " WebSocket " + build2.url().redact(), newWebSocketStreams);
                        RealWebSocket.this.getListener$okhttp().onOpen(RealWebSocket.this, response);
                        RealWebSocket.this.loopReader();
                    } catch (Exception e8) {
                        RealWebSocket.this.failWebSocket(e8, null);
                    }
                } catch (IOException e9) {
                    if (exchange != null) {
                        exchange.webSocketUpgradeFailed();
                    }
                    RealWebSocket.this.failWebSocket(e9, response);
                    Util.closeQuietly(response);
                }
            }
        });
    }

    public final void failWebSocket(Exception e8, Response response) {
        s.checkNotNullParameter(e8, "e");
        synchronized (this) {
            if (this.failed) {
                return;
            }
            this.failed = true;
            Streams streams = this.streams;
            this.streams = null;
            WebSocketReader webSocketReader = this.reader;
            this.reader = null;
            WebSocketWriter webSocketWriter = this.writer;
            this.writer = null;
            this.taskQueue.shutdown();
            w wVar = w.INSTANCE;
            try {
                this.listener.onFailure(this, e8, response);
            } finally {
                if (streams != null) {
                    Util.closeQuietly(streams);
                }
                if (webSocketReader != null) {
                    Util.closeQuietly(webSocketReader);
                }
                if (webSocketWriter != null) {
                    Util.closeQuietly(webSocketWriter);
                }
            }
        }
    }

    public final WebSocketListener getListener$okhttp() {
        return this.listener;
    }

    public final void initReaderAndWriter(String name, Streams streams) {
        s.checkNotNullParameter(name, "name");
        s.checkNotNullParameter(streams, "streams");
        WebSocketExtensions webSocketExtensions = this.extensions;
        s.checkNotNull(webSocketExtensions);
        synchronized (this) {
            try {
                this.name = name;
                this.streams = streams;
                this.writer = new WebSocketWriter(streams.getClient(), streams.getSink(), this.random, webSocketExtensions.perMessageDeflate, webSocketExtensions.noContextTakeover(streams.getClient()), this.minimumDeflateSize);
                this.writerTask = new WriterTask(this);
                long j8 = this.pingIntervalMillis;
                if (j8 != 0) {
                    final long nanos = TimeUnit.MILLISECONDS.toNanos(j8);
                    TaskQueue taskQueue = this.taskQueue;
                    final String stringPlus = s.stringPlus(name, " ping");
                    taskQueue.schedule(new Task(stringPlus, this, nanos) { // from class: okhttp3.internal.ws.RealWebSocket$initReaderAndWriter$lambda-3$$inlined$schedule$1
                        final /* synthetic */ String $name;
                        final /* synthetic */ long $pingIntervalNanos$inlined;
                        final /* synthetic */ RealWebSocket this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(stringPlus, false, 2, null);
                            this.$name = stringPlus;
                            this.this$0 = this;
                            this.$pingIntervalNanos$inlined = nanos;
                        }

                        @Override // okhttp3.internal.concurrent.Task
                        public long runOnce() {
                            this.this$0.writePingFrame$okhttp();
                            return this.$pingIntervalNanos$inlined;
                        }
                    }, nanos);
                }
                if (!this.messageAndCloseQueue.isEmpty()) {
                    runWriter();
                }
                w wVar = w.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.reader = new WebSocketReader(streams.getClient(), streams.getSource(), this, webSocketExtensions.perMessageDeflate, webSocketExtensions.noContextTakeover(!streams.getClient()));
    }

    public final void loopReader() {
        while (this.receivedCloseCode == -1) {
            WebSocketReader webSocketReader = this.reader;
            s.checkNotNull(webSocketReader);
            webSocketReader.processNextFrame();
        }
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadClose(int i8, String reason) {
        Streams streams;
        WebSocketReader webSocketReader;
        WebSocketWriter webSocketWriter;
        s.checkNotNullParameter(reason, "reason");
        if (i8 == -1) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        synchronized (this) {
            try {
                if (this.receivedCloseCode != -1) {
                    throw new IllegalStateException("already closed".toString());
                }
                this.receivedCloseCode = i8;
                this.receivedCloseReason = reason;
                streams = null;
                if (this.enqueuedClose && this.messageAndCloseQueue.isEmpty()) {
                    Streams streams2 = this.streams;
                    this.streams = null;
                    webSocketReader = this.reader;
                    this.reader = null;
                    webSocketWriter = this.writer;
                    this.writer = null;
                    this.taskQueue.shutdown();
                    streams = streams2;
                } else {
                    webSocketReader = null;
                    webSocketWriter = null;
                }
                w wVar = w.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        try {
            this.listener.onClosing(this, i8, reason);
            if (streams != null) {
                this.listener.onClosed(this, i8, reason);
            }
        } finally {
            if (streams != null) {
                Util.closeQuietly(streams);
            }
            if (webSocketReader != null) {
                Util.closeQuietly(webSocketReader);
            }
            if (webSocketWriter != null) {
                Util.closeQuietly(webSocketWriter);
            }
        }
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadMessage(String text) {
        s.checkNotNullParameter(text, "text");
        this.listener.onMessage(this, text);
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public synchronized void onReadPing(ByteString payload) {
        try {
            s.checkNotNullParameter(payload, "payload");
            if (!this.failed && (!this.enqueuedClose || !this.messageAndCloseQueue.isEmpty())) {
                this.pongQueue.add(payload);
                runWriter();
                this.receivedPingCount++;
            }
        } finally {
        }
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public synchronized void onReadPong(ByteString payload) {
        s.checkNotNullParameter(payload, "payload");
        this.receivedPongCount++;
        this.awaitingPong = false;
    }

    public final synchronized boolean pong(ByteString payload) {
        try {
            s.checkNotNullParameter(payload, "payload");
            if (!this.failed && (!this.enqueuedClose || !this.messageAndCloseQueue.isEmpty())) {
                this.pongQueue.add(payload);
                runWriter();
                return true;
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final boolean processNextFrame() {
        try {
            WebSocketReader webSocketReader = this.reader;
            s.checkNotNull(webSocketReader);
            webSocketReader.processNextFrame();
            return this.receivedCloseCode == -1;
        } catch (Exception e8) {
            failWebSocket(e8, null);
            return false;
        }
    }

    @Override // okhttp3.WebSocket
    public synchronized long queueSize() {
        return this.queueSize;
    }

    public final synchronized int receivedPingCount() {
        return this.receivedPingCount;
    }

    public final synchronized int receivedPongCount() {
        return this.receivedPongCount;
    }

    @Override // okhttp3.WebSocket
    public Request request() {
        return this.originalRequest;
    }

    @Override // okhttp3.WebSocket
    public boolean send(String text) {
        s.checkNotNullParameter(text, "text");
        return send(ByteString.Companion.encodeUtf8(text), 1);
    }

    public final synchronized int sentPingCount() {
        return this.sentPingCount;
    }

    public final void tearDown() {
        this.taskQueue.shutdown();
        this.taskQueue.idleLatch().await(10L, TimeUnit.SECONDS);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0073 A[Catch: all -> 0x007c, TRY_ENTER, TryCatch #2 {all -> 0x007c, blocks: (B:21:0x0073, B:29:0x007e, B:31:0x0082, B:32:0x0092, B:35:0x00a1, B:39:0x00a4, B:40:0x00a5, B:41:0x00a6, B:43:0x00aa, B:45:0x00bc, B:46:0x00d7, B:47:0x00dc, B:34:0x0093), top: B:19:0x0071 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c7 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00cd A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d3 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007e A[Catch: all -> 0x007c, TryCatch #2 {all -> 0x007c, blocks: (B:21:0x0073, B:29:0x007e, B:31:0x0082, B:32:0x0092, B:35:0x00a1, B:39:0x00a4, B:40:0x00a5, B:41:0x00a6, B:43:0x00aa, B:45:0x00bc, B:46:0x00d7, B:47:0x00dc, B:34:0x0093), top: B:19:0x0071 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean writeOneFrame$okhttp() {
        Streams streams;
        String str;
        WebSocketReader webSocketReader;
        WebSocketWriter webSocketWriter;
        int i8;
        synchronized (this) {
            try {
                if (this.failed) {
                    return false;
                }
                WebSocketWriter webSocketWriter2 = this.writer;
                ByteString poll = this.pongQueue.poll();
                final boolean z7 = true;
                Object obj = null;
                try {
                    if (poll == null) {
                        Object poll2 = this.messageAndCloseQueue.poll();
                        if (poll2 instanceof Close) {
                            i8 = this.receivedCloseCode;
                            str = this.receivedCloseReason;
                            if (i8 != -1) {
                                streams = this.streams;
                                this.streams = null;
                                webSocketReader = this.reader;
                                this.reader = null;
                                webSocketWriter = this.writer;
                                this.writer = null;
                                this.taskQueue.shutdown();
                            } else {
                                long cancelAfterCloseMillis = ((Close) poll2).getCancelAfterCloseMillis();
                                TaskQueue taskQueue = this.taskQueue;
                                final String stringPlus = s.stringPlus(this.name, " cancel");
                                taskQueue.schedule(new Task(stringPlus, z7, this) { // from class: okhttp3.internal.ws.RealWebSocket$writeOneFrame$lambda-8$$inlined$execute$default$1
                                    final /* synthetic */ boolean $cancelable;
                                    final /* synthetic */ String $name;
                                    final /* synthetic */ RealWebSocket this$0;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(stringPlus, z7);
                                        this.$name = stringPlus;
                                        this.$cancelable = z7;
                                        this.this$0 = this;
                                    }

                                    @Override // okhttp3.internal.concurrent.Task
                                    public long runOnce() {
                                        this.this$0.cancel();
                                        return -1L;
                                    }
                                }, TimeUnit.MILLISECONDS.toNanos(cancelAfterCloseMillis));
                                streams = null;
                                webSocketReader = null;
                                webSocketWriter = null;
                            }
                            obj = poll2;
                            w wVar = w.INSTANCE;
                            if (poll == null) {
                                s.checkNotNull(webSocketWriter2);
                                webSocketWriter2.writePong(poll);
                            } else if (obj instanceof Message) {
                                Message message = (Message) obj;
                                s.checkNotNull(webSocketWriter2);
                                webSocketWriter2.writeMessageFrame(message.getFormatOpcode(), message.getData());
                                synchronized (this) {
                                    this.queueSize -= message.getData().size();
                                }
                            } else {
                                if (!(obj instanceof Close)) {
                                    throw new AssertionError();
                                }
                                Close close = (Close) obj;
                                s.checkNotNull(webSocketWriter2);
                                webSocketWriter2.writeClose(close.getCode(), close.getReason());
                                if (streams != null) {
                                    WebSocketListener webSocketListener = this.listener;
                                    s.checkNotNull(str);
                                    webSocketListener.onClosed(this, i8, str);
                                }
                            }
                            return true;
                        }
                        if (poll2 == null) {
                            return false;
                        }
                        streams = null;
                        str = null;
                        webSocketReader = null;
                        webSocketWriter = null;
                        obj = poll2;
                    } else {
                        streams = null;
                        str = null;
                        webSocketReader = null;
                        webSocketWriter = null;
                    }
                    if (poll == null) {
                    }
                    return true;
                } finally {
                    if (streams != null) {
                        Util.closeQuietly(streams);
                    }
                    if (webSocketReader != null) {
                        Util.closeQuietly(webSocketReader);
                    }
                    if (webSocketWriter != null) {
                        Util.closeQuietly(webSocketWriter);
                    }
                }
                i8 = -1;
                w wVar2 = w.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void writePingFrame$okhttp() {
        synchronized (this) {
            try {
                if (this.failed) {
                    return;
                }
                WebSocketWriter webSocketWriter = this.writer;
                if (webSocketWriter == null) {
                    return;
                }
                int i8 = this.awaitingPong ? this.sentPingCount : -1;
                this.sentPingCount++;
                this.awaitingPong = true;
                w wVar = w.INSTANCE;
                if (i8 == -1) {
                    try {
                        webSocketWriter.writePing(ByteString.EMPTY);
                        return;
                    } catch (IOException e8) {
                        failWebSocket(e8, null);
                        return;
                    }
                }
                failWebSocket(new SocketTimeoutException("sent ping but didn't receive pong within " + this.pingIntervalMillis + "ms (after " + (i8 - 1) + " successful ping/pongs)"), null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized boolean close(int i8, String str, long j8) {
        ByteString byteString;
        try {
            WebSocketProtocol.INSTANCE.validateCloseCode(i8);
            if (str != null) {
                byteString = ByteString.Companion.encodeUtf8(str);
                if (byteString.size() > 123) {
                    throw new IllegalArgumentException(s.stringPlus("reason.size() > 123: ", str).toString());
                }
            } else {
                byteString = null;
            }
            if (!this.failed && !this.enqueuedClose) {
                this.enqueuedClose = true;
                this.messageAndCloseQueue.add(new Close(i8, byteString, j8));
                runWriter();
                return true;
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadMessage(ByteString bytes) {
        s.checkNotNullParameter(bytes, "bytes");
        this.listener.onMessage(this, bytes);
    }

    @Override // okhttp3.WebSocket
    public boolean send(ByteString bytes) {
        s.checkNotNullParameter(bytes, "bytes");
        return send(bytes, 2);
    }

    private final synchronized boolean send(ByteString byteString, int i8) {
        if (!this.failed && !this.enqueuedClose) {
            if (this.queueSize + byteString.size() > MAX_QUEUE_SIZE) {
                close(1001, null);
                return false;
            }
            this.queueSize += byteString.size();
            this.messageAndCloseQueue.add(new Message(i8, byteString));
            runWriter();
            return true;
        }
        return false;
    }
}
