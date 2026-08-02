package okhttp3.internal.ws;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import bo.app.b2$$ExternalSyntheticLambda0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import okhttp3.EventListener;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal._UtilJvmKt$$ExternalSyntheticLambda0;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RealCall;
import okio.Buffer;
import okio.ByteString;
import okio.Path$$ExternalSyntheticBUOutline0;
import okio.Socket;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import papa.Choreographers$$ExternalSyntheticLambda1;
import papa.internal.LaunchTracker;

/* loaded from: classes9.dex */
public final class RealWebSocket implements WebSocket {
    public static final List ONLY_HTTP1 = CollectionsKt__CollectionsJVMKt.listOf(Protocol.HTTP_1_1);
    public boolean awaitingPong;
    public RealCall call;
    public boolean enqueuedClose;
    public WebSocketExtensions extensions;
    public boolean failed;
    public final String key;
    public final WebSocketListener listener;
    public final ArrayDeque messageAndCloseQueue;
    public final long minimumDeflateSize;
    public String name;
    public final Request originalRequest;
    public final long pingIntervalMillis;
    public final ArrayDeque pongQueue;
    public long queueSize;
    public final Random random;
    public WebSocketReader reader;
    public int receivedCloseCode;
    public String receivedCloseReason;
    public int sentPingCount;
    public LaunchTracker socket;
    public final TaskQueue taskQueue;
    public final long webSocketCloseTimeout;
    public WebSocketWriter writer;
    public WriterTask writerTask;

    public final class Close {
        public final long cancelAfterCloseMillis;
        public final int code;
        public final ByteString reason;

        public Close(int i, long j, ByteString byteString) {
            this.code = i;
            this.reason = byteString;
            this.cancelAfterCloseMillis = j;
        }
    }

    public final class Message {
        public final ByteString data;

        public Message(ByteString byteString) {
            this.data = byteString;
        }
    }

    public final class WriterTask extends Task {
        public WriterTask() {
            super(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder(), RealWebSocket.this.name, " writer"), true);
        }

        @Override // okhttp3.internal.concurrent.Task
        public final long runOnce() {
            RealWebSocket realWebSocket = RealWebSocket.this;
            try {
                return realWebSocket.writeOneFrame$okhttp() ? 0L : -1L;
            } catch (IOException e) {
                RealWebSocket.failWebSocket$default(realWebSocket, e, null, 2);
                return -1L;
            }
        }
    }

    public RealWebSocket(TaskRunner taskRunner, Request request, WebSocketListener webSocketListener, Random random, long j, long j2, long j3) {
        taskRunner.getClass();
        request.getClass();
        this.originalRequest = request;
        this.listener = webSocketListener;
        this.random = random;
        this.pingIntervalMillis = j;
        this.extensions = null;
        this.minimumDeflateSize = j2;
        this.webSocketCloseTimeout = j3;
        this.taskQueue = taskRunner.newQueue();
        this.pongQueue = new ArrayDeque();
        this.messageAndCloseQueue = new ArrayDeque();
        this.receivedCloseCode = -1;
        String str = request.method;
        if (!"GET".equals(str)) {
            Path$$ExternalSyntheticBUOutline0.m$3(str, "Request must be GET: ");
            throw null;
        }
        ByteString.Companion companion = ByteString.Companion;
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        this.key = ByteString.Companion.of$default(bArr).base64();
    }

    public static void failWebSocket$default(RealWebSocket realWebSocket, Exception exc, Response response, int i) {
        WebSocketWriter webSocketWriter;
        if ((i & 2) != 0) {
            response = null;
        }
        boolean z = (i & 4) == 0;
        realWebSocket.getClass();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        synchronized (realWebSocket) {
            try {
                if (realWebSocket.failed) {
                    return;
                }
                realWebSocket.failed = true;
                LaunchTracker launchTracker = realWebSocket.socket;
                WebSocketWriter webSocketWriter2 = realWebSocket.writer;
                ref$ObjectRef.element = webSocketWriter2;
                realWebSocket.writer = null;
                if (!z && webSocketWriter2 != null) {
                    TaskQueue.execute$default(realWebSocket.taskQueue, realWebSocket.name + " writer close", 0L, new b2$$ExternalSyntheticLambda0(14, ref$ObjectRef), 2);
                }
                realWebSocket.taskQueue.shutdown();
                try {
                    realWebSocket.listener.onFailure(realWebSocket, exc, response);
                    if (launchTracker != null) {
                        launchTracker.cancel();
                    }
                    if (!z || (webSocketWriter = (WebSocketWriter) ref$ObjectRef.element) == null) {
                        return;
                    }
                    _UtilCommonKt.closeQuietly(webSocketWriter);
                } finally {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Socket checkUpgradeSuccess$okhttp(Response response) {
        Headers headers = response.headers;
        int i = response.code;
        if (i != 101) {
            StringBuilder sb = new StringBuilder("Expected HTTP 101 response but was '");
            sb.append(i);
            sb.append(' ');
            throw new ProtocolException(CameraState$Type$EnumUnboxingLocalUtility.m(sb, response.message, '\''));
        }
        String str = headers.get("Connection");
        if (str == null) {
            str = null;
        }
        if (!"Upgrade".equalsIgnoreCase(str)) {
            throw new ProtocolException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m('\'', "Expected 'Connection' header value 'Upgrade' but was '", str));
        }
        String str2 = headers.get("Upgrade");
        if (str2 == null) {
            str2 = null;
        }
        if (!"websocket".equalsIgnoreCase(str2)) {
            throw new ProtocolException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m('\'', "Expected 'Upgrade' header value 'websocket' but was '", str2));
        }
        String str3 = headers.get("Sec-WebSocket-Accept");
        String str4 = str3 != null ? str3 : null;
        ByteString.Companion companion = ByteString.Companion;
        String base64 = ByteString.Companion.encodeUtf8(this.key + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").digest$okio(McElieceCCA2KeyGenParameterSpec.SHA1).base64();
        if (Intrinsics.areEqual(base64, str4)) {
            Socket socket = response.socket;
            if (socket != null) {
                return socket;
            }
            throw new ProtocolException("Web Socket socket missing: bad interceptor?");
        }
        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + base64 + "' but was '" + str4 + '\'');
    }

    public final boolean close(int i, String str) {
        String str2;
        long j = this.webSocketCloseTimeout;
        synchronized (this) {
            ByteString byteString = null;
            try {
                if (i < 1000 || i >= 5000) {
                    str2 = "Code must be in range [1000,5000): " + i;
                } else if ((1004 > i || i >= 1007) && (1015 > i || i >= 3000)) {
                    str2 = null;
                } else {
                    str2 = "Code " + i + " is reserved and may not be used.";
                }
                if (str2 != null) {
                    throw new IllegalArgumentException(str2.toString());
                }
                if (str != null) {
                    ByteString.Companion companion = ByteString.Companion;
                    byteString = ByteString.Companion.encodeUtf8(str);
                    if (byteString.data.length > 123) {
                        throw new IllegalArgumentException("reason.size() > 123: ".concat(str).toString());
                    }
                }
                if (!this.failed && !this.enqueuedClose) {
                    this.enqueuedClose = true;
                    this.messageAndCloseQueue.add(new Close(i, j, byteString));
                    runWriter();
                    return true;
                }
                return false;
            } finally {
            }
        }
    }

    public final void connect(OkHttpClient okHttpClient) {
        Request request = this.originalRequest;
        request.getClass();
        if (request.headers.get("Sec-WebSocket-Extensions") != null) {
            failWebSocket$default(this, new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), null, 6);
            return;
        }
        OkHttpClient.Builder newBuilder = okHttpClient.newBuilder();
        EventListener eventListener = EventListener.NONE;
        eventListener.getClass();
        TimeZone timeZone = _UtilJvmKt.UTC;
        newBuilder.eventListenerFactory = new _UtilJvmKt$$ExternalSyntheticLambda0(eventListener);
        newBuilder.protocols(ONLY_HTTP1);
        OkHttpClient okHttpClient2 = new OkHttpClient(newBuilder);
        Request.Builder newBuilder2 = request.newBuilder();
        newBuilder2.header("Upgrade", "websocket");
        newBuilder2.header("Connection", "Upgrade");
        newBuilder2.header("Sec-WebSocket-Key", this.key);
        newBuilder2.header("Sec-WebSocket-Version", "13");
        newBuilder2.header("Sec-WebSocket-Extensions", "permessage-deflate");
        Request request2 = new Request(newBuilder2);
        RealCall realCall = new RealCall(okHttpClient2, request2, true);
        this.call = realCall;
        realCall.enqueue(new RealWebSocket$connect$1(0, this, request2));
    }

    public final void finishReader() {
        int i;
        String str;
        WebSocketReader webSocketReader;
        boolean z;
        synchronized (this) {
            try {
                i = this.receivedCloseCode;
                str = this.receivedCloseReason;
                webSocketReader = this.reader;
                this.reader = null;
                if (this.enqueuedClose && this.messageAndCloseQueue.isEmpty()) {
                    WebSocketWriter webSocketWriter = this.writer;
                    if (webSocketWriter != null) {
                        this.writer = null;
                        TaskQueue.execute$default(this.taskQueue, this.name + " writer close", 0L, new Choreographers$$ExternalSyntheticLambda1(webSocketWriter, 20), 2);
                    }
                    this.taskQueue.shutdown();
                }
                if (!this.failed && this.writer == null) {
                    z = this.receivedCloseCode != -1;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            WebSocketListener webSocketListener = this.listener;
            str.getClass();
            webSocketListener.onClosed(this, i, str);
        }
        if (webSocketReader != null) {
            _UtilCommonKt.closeQuietly(webSocketReader);
        }
    }

    public final void runWriter() {
        TimeZone timeZone = _UtilJvmKt.UTC;
        WriterTask writerTask = this.writerTask;
        if (writerTask != null) {
            this.taskQueue.schedule(writerTask, 0L);
        }
    }

    public final boolean send(String str) {
        str.getClass();
        ByteString.Companion companion = ByteString.Companion;
        ByteString encodeUtf8 = ByteString.Companion.encodeUtf8(str);
        synchronized (this) {
            if (!this.failed && !this.enqueuedClose) {
                long j = this.queueSize;
                byte[] bArr = encodeUtf8.data;
                if (bArr.length + j > 16777216) {
                    close(IptcConstants.IMAGE_RESOURCE_BLOCK_MACINTOSH_PRINT_INFO, null);
                    return false;
                }
                this.queueSize = j + bArr.length;
                this.messageAndCloseQueue.add(new Message(encodeUtf8));
                runWriter();
                return true;
            }
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x00dc, code lost:
    
        if (r0 < 3000) goto L61;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0102 A[Catch: all -> 0x008c, TryCatch #2 {all -> 0x008c, blocks: (B:25:0x0080, B:29:0x008f, B:31:0x0093, B:32:0x009e, B:35:0x00ac, B:39:0x00b0, B:40:0x00b1, B:41:0x00b2, B:43:0x00b6, B:53:0x00de, B:55:0x0102, B:57:0x010c, B:58:0x010f, B:62:0x011a, B:64:0x011e, B:67:0x012d, B:68:0x012f, B:69:0x0130, B:70:0x0139, B:75:0x00f2, B:76:0x013a, B:77:0x013f, B:61:0x0117, B:34:0x009f), top: B:23:0x007e, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0130 A[Catch: all -> 0x008c, TryCatch #2 {all -> 0x008c, blocks: (B:25:0x0080, B:29:0x008f, B:31:0x0093, B:32:0x009e, B:35:0x00ac, B:39:0x00b0, B:40:0x00b1, B:41:0x00b2, B:43:0x00b6, B:53:0x00de, B:55:0x0102, B:57:0x010c, B:58:0x010f, B:62:0x011a, B:64:0x011e, B:67:0x012d, B:68:0x012f, B:69:0x0130, B:70:0x0139, B:75:0x00f2, B:76:0x013a, B:77:0x013f, B:61:0x0117, B:34:0x009f), top: B:23:0x007e, inners: #1, #3 }] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean writeOneFrame$okhttp() {
        WebSocketWriter webSocketWriter;
        Message message;
        String str;
        synchronized (this) {
            try {
                boolean z = false;
                if (this.failed) {
                    return false;
                }
                WebSocketWriter webSocketWriter2 = this.writer;
                Object poll = this.pongQueue.poll();
                String str2 = null;
                int i = -1;
                if (poll == null) {
                    Object poll2 = this.messageAndCloseQueue.poll();
                    if (poll2 instanceof Close) {
                        int i2 = this.receivedCloseCode;
                        str = this.receivedCloseReason;
                        if (i2 != -1) {
                            WebSocketWriter webSocketWriter3 = this.writer;
                            this.writer = null;
                            if (webSocketWriter3 != null && this.reader == null) {
                                z = true;
                            }
                            this.taskQueue.shutdown();
                            webSocketWriter = webSocketWriter3;
                            i = i2;
                            message = poll2;
                        } else {
                            long j = ((Close) poll2).cancelAfterCloseMillis;
                            TaskQueue.execute$default(this.taskQueue, this.name + " cancel", TimeUnit.MILLISECONDS.toNanos(j), new RealWebSocket$$ExternalSyntheticLambda3(this, 0), 4);
                            i = i2;
                            message = poll2;
                            webSocketWriter = null;
                        }
                    } else {
                        if (poll2 == null) {
                            return false;
                        }
                        str = null;
                        message = poll2;
                        webSocketWriter = null;
                    }
                } else {
                    webSocketWriter = null;
                    message = 0;
                    str = null;
                }
                try {
                    if (poll != null) {
                        webSocketWriter2.getClass();
                        webSocketWriter2.writeControlFrame(10, (ByteString) poll);
                    } else if (message instanceof Message) {
                        webSocketWriter2.getClass();
                        webSocketWriter2.writeMessageFrame(message.data);
                        synchronized (this) {
                            this.queueSize -= message.data.data.length;
                        }
                    } else {
                        if (!(message instanceof Close)) {
                            throw new AssertionError();
                        }
                        webSocketWriter2.getClass();
                        int i3 = message.code;
                        ByteString byteString = ((Close) message).reason;
                        ByteString.Companion companion = ByteString.Companion;
                        if (i3 >= 1000 && i3 < 5000) {
                            if (1004 <= i3) {
                                if (i3 < 1007) {
                                    str2 = "Code " + i3 + " is reserved and may not be used.";
                                    if (str2 != null) {
                                        throw new IllegalArgumentException(str2.toString());
                                    }
                                    Buffer buffer = new Buffer();
                                    buffer.m4337writeShort(i3);
                                    if (byteString != null) {
                                        buffer.m4333write(byteString);
                                    }
                                    try {
                                        webSocketWriter2.writeControlFrame(8, buffer.readByteString(buffer.size));
                                        if (z) {
                                            WebSocketListener webSocketListener = this.listener;
                                            str.getClass();
                                            webSocketListener.onClosed(this, i, str);
                                        }
                                    } finally {
                                        webSocketWriter2.writerClosed = true;
                                    }
                                }
                            }
                            if (1015 <= i3) {
                            }
                            if (str2 != null) {
                            }
                        }
                        str2 = "Code must be in range [1000,5000): " + i3;
                        if (str2 != null) {
                        }
                    }
                    return true;
                } finally {
                    if (webSocketWriter != null) {
                        _UtilCommonKt.closeQuietly(webSocketWriter);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
