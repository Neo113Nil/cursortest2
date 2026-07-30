package okhttp3.internal.http2;

import com.google.firebase.analytics.FirebaseAnalytics;
import f6.a;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskQueue$execute$1;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2Reader;
import okhttp3.internal.platform.Platform;
import okio.ByteString;
import okio.c;
import okio.d;
import okio.e;
import okio.j0;
import y5.w;

/* loaded from: classes5.dex */
public final class Http2Connection implements Closeable {
    public static final int AWAIT_PING = 3;
    public static final Companion Companion = new Companion(null);
    private static final Settings DEFAULT_SETTINGS;
    public static final int DEGRADED_PING = 2;
    public static final int DEGRADED_PONG_TIMEOUT_NS = 1000000000;
    public static final int INTERVAL_PING = 1;
    public static final int OKHTTP_CLIENT_WINDOW_SIZE = 16777216;
    private long awaitPingsSent;
    private long awaitPongsReceived;
    private final boolean client;
    private final String connectionName;
    private final Set<Integer> currentPushRequests;
    private long degradedPingsSent;
    private long degradedPongDeadlineNs;
    private long degradedPongsReceived;
    private long intervalPingsSent;
    private long intervalPongsReceived;
    private boolean isShutdown;
    private int lastGoodStreamId;
    private final Listener listener;
    private int nextStreamId;
    private final Settings okHttpSettings;
    private Settings peerSettings;
    private final PushObserver pushObserver;
    private final TaskQueue pushQueue;
    private long readBytesAcknowledged;
    private long readBytesTotal;
    private final ReaderRunnable readerRunnable;
    private final TaskQueue settingsListenerQueue;
    private final Socket socket;
    private final Map<Integer, Http2Stream> streams;
    private final TaskRunner taskRunner;
    private long writeBytesMaximum;
    private long writeBytesTotal;
    private final Http2Writer writer;
    private final TaskQueue writerQueue;

    public static final class Builder {
        private boolean client;
        public String connectionName;
        private Listener listener;
        private int pingIntervalMillis;
        private PushObserver pushObserver;
        public d sink;
        public Socket socket;
        public e source;
        private final TaskRunner taskRunner;

        public Builder(boolean z7, TaskRunner taskRunner) {
            s.checkNotNullParameter(taskRunner, "taskRunner");
            this.client = z7;
            this.taskRunner = taskRunner;
            this.listener = Listener.REFUSE_INCOMING_STREAMS;
            this.pushObserver = PushObserver.CANCEL;
        }

        public static /* synthetic */ Builder socket$default(Builder builder, Socket socket, String str, e eVar, d dVar, int i8, Object obj) {
            if ((i8 & 2) != 0) {
                str = Util.peerName(socket);
            }
            if ((i8 & 4) != 0) {
                eVar = j0.buffer(j0.source(socket));
            }
            if ((i8 & 8) != 0) {
                dVar = j0.buffer(j0.sink(socket));
            }
            return builder.socket(socket, str, eVar, dVar);
        }

        public final Http2Connection build() {
            return new Http2Connection(this);
        }

        public final boolean getClient$okhttp() {
            return this.client;
        }

        public final String getConnectionName$okhttp() {
            String str = this.connectionName;
            if (str != null) {
                return str;
            }
            s.throwUninitializedPropertyAccessException("connectionName");
            return null;
        }

        public final Listener getListener$okhttp() {
            return this.listener;
        }

        public final int getPingIntervalMillis$okhttp() {
            return this.pingIntervalMillis;
        }

        public final PushObserver getPushObserver$okhttp() {
            return this.pushObserver;
        }

        public final d getSink$okhttp() {
            d dVar = this.sink;
            if (dVar != null) {
                return dVar;
            }
            s.throwUninitializedPropertyAccessException("sink");
            return null;
        }

        public final Socket getSocket$okhttp() {
            Socket socket = this.socket;
            if (socket != null) {
                return socket;
            }
            s.throwUninitializedPropertyAccessException("socket");
            return null;
        }

        public final e getSource$okhttp() {
            e eVar = this.source;
            if (eVar != null) {
                return eVar;
            }
            s.throwUninitializedPropertyAccessException(FirebaseAnalytics.Param.SOURCE);
            return null;
        }

        public final TaskRunner getTaskRunner$okhttp() {
            return this.taskRunner;
        }

        public final Builder listener(Listener listener) {
            s.checkNotNullParameter(listener, "listener");
            setListener$okhttp(listener);
            return this;
        }

        public final Builder pingIntervalMillis(int i8) {
            setPingIntervalMillis$okhttp(i8);
            return this;
        }

        public final Builder pushObserver(PushObserver pushObserver) {
            s.checkNotNullParameter(pushObserver, "pushObserver");
            setPushObserver$okhttp(pushObserver);
            return this;
        }

        public final void setClient$okhttp(boolean z7) {
            this.client = z7;
        }

        public final void setConnectionName$okhttp(String str) {
            s.checkNotNullParameter(str, "<set-?>");
            this.connectionName = str;
        }

        public final void setListener$okhttp(Listener listener) {
            s.checkNotNullParameter(listener, "<set-?>");
            this.listener = listener;
        }

        public final void setPingIntervalMillis$okhttp(int i8) {
            this.pingIntervalMillis = i8;
        }

        public final void setPushObserver$okhttp(PushObserver pushObserver) {
            s.checkNotNullParameter(pushObserver, "<set-?>");
            this.pushObserver = pushObserver;
        }

        public final void setSink$okhttp(d dVar) {
            s.checkNotNullParameter(dVar, "<set-?>");
            this.sink = dVar;
        }

        public final void setSocket$okhttp(Socket socket) {
            s.checkNotNullParameter(socket, "<set-?>");
            this.socket = socket;
        }

        public final void setSource$okhttp(e eVar) {
            s.checkNotNullParameter(eVar, "<set-?>");
            this.source = eVar;
        }

        public final Builder socket(Socket socket) {
            s.checkNotNullParameter(socket, "socket");
            return socket$default(this, socket, null, null, null, 14, null);
        }

        public final Builder socket(Socket socket, String peerName) {
            s.checkNotNullParameter(socket, "socket");
            s.checkNotNullParameter(peerName, "peerName");
            return socket$default(this, socket, peerName, null, null, 12, null);
        }

        public final Builder socket(Socket socket, String peerName, e source) {
            s.checkNotNullParameter(socket, "socket");
            s.checkNotNullParameter(peerName, "peerName");
            s.checkNotNullParameter(source, "source");
            return socket$default(this, socket, peerName, source, null, 8, null);
        }

        public final Builder socket(Socket socket, String peerName, e source, d sink) {
            String stringPlus;
            s.checkNotNullParameter(socket, "socket");
            s.checkNotNullParameter(peerName, "peerName");
            s.checkNotNullParameter(source, "source");
            s.checkNotNullParameter(sink, "sink");
            setSocket$okhttp(socket);
            if (getClient$okhttp()) {
                stringPlus = Util.okHttpName + ' ' + peerName;
            } else {
                stringPlus = s.stringPlus("MockWebServer ", peerName);
            }
            setConnectionName$okhttp(stringPlus);
            setSource$okhttp(source);
            setSink$okhttp(sink);
            return this;
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        public final Settings getDEFAULT_SETTINGS() {
            return Http2Connection.DEFAULT_SETTINGS;
        }
    }

    public static abstract class Listener {
        public static final Companion Companion = new Companion(null);
        public static final Listener REFUSE_INCOMING_STREAMS = new Listener() { // from class: okhttp3.internal.http2.Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS$1
            @Override // okhttp3.internal.http2.Http2Connection.Listener
            public void onStream(Http2Stream stream) {
                s.checkNotNullParameter(stream, "stream");
                stream.close(ErrorCode.REFUSED_STREAM, null);
            }
        };

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public void onSettings(Http2Connection connection, Settings settings) {
            s.checkNotNullParameter(connection, "connection");
            s.checkNotNullParameter(settings, "settings");
        }

        public abstract void onStream(Http2Stream http2Stream);
    }

    public final class ReaderRunnable implements Http2Reader.Handler, a {
        private final Http2Reader reader;
        final /* synthetic */ Http2Connection this$0;

        public ReaderRunnable(Http2Connection this$0, Http2Reader reader) {
            s.checkNotNullParameter(this$0, "this$0");
            s.checkNotNullParameter(reader, "reader");
            this.this$0 = this$0;
            this.reader = reader;
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void ackSettings() {
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void alternateService(int i8, String origin, ByteString protocol, String host, int i9, long j8) {
            s.checkNotNullParameter(origin, "origin");
            s.checkNotNullParameter(protocol, "protocol");
            s.checkNotNullParameter(host, "host");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r13v1 */
        /* JADX WARN: Type inference failed for: r13v2, types: [T, okhttp3.internal.http2.Settings] */
        /* JADX WARN: Type inference failed for: r13v3 */
        public final void applyAndAckSettings(boolean z7, Settings settings) {
            ?? r13;
            long initialWindowSize;
            int i8;
            Http2Stream[] http2StreamArr;
            s.checkNotNullParameter(settings, "settings");
            final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            Http2Writer writer = this.this$0.getWriter();
            final Http2Connection http2Connection = this.this$0;
            synchronized (writer) {
                synchronized (http2Connection) {
                    try {
                        Settings peerSettings = http2Connection.getPeerSettings();
                        if (z7) {
                            r13 = settings;
                        } else {
                            Settings settings2 = new Settings();
                            settings2.merge(peerSettings);
                            settings2.merge(settings);
                            r13 = settings2;
                        }
                        ref$ObjectRef.element = r13;
                        initialWindowSize = r13.getInitialWindowSize() - peerSettings.getInitialWindowSize();
                        i8 = 0;
                        if (initialWindowSize != 0 && !http2Connection.getStreams$okhttp().isEmpty()) {
                            Object[] array = http2Connection.getStreams$okhttp().values().toArray(new Http2Stream[0]);
                            if (array == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                            }
                            http2StreamArr = (Http2Stream[]) array;
                            http2Connection.setPeerSettings((Settings) ref$ObjectRef.element);
                            TaskQueue taskQueue = http2Connection.settingsListenerQueue;
                            final String stringPlus = s.stringPlus(http2Connection.getConnectionName$okhttp(), " onSettings");
                            final boolean z8 = true;
                            taskQueue.schedule(new Task(stringPlus, z8, http2Connection, ref$ObjectRef) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$applyAndAckSettings$lambda-7$lambda-6$$inlined$execute$default$1
                                final /* synthetic */ boolean $cancelable;
                                final /* synthetic */ String $name;
                                final /* synthetic */ Ref$ObjectRef $newPeerSettings$inlined;
                                final /* synthetic */ Http2Connection this$0;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(stringPlus, z8);
                                    this.$name = stringPlus;
                                    this.$cancelable = z8;
                                    this.this$0 = http2Connection;
                                    this.$newPeerSettings$inlined = ref$ObjectRef;
                                }

                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // okhttp3.internal.concurrent.Task
                                public long runOnce() {
                                    this.this$0.getListener$okhttp().onSettings(this.this$0, (Settings) this.$newPeerSettings$inlined.element);
                                    return -1L;
                                }
                            }, 0L);
                            w wVar = w.INSTANCE;
                        }
                        http2StreamArr = null;
                        http2Connection.setPeerSettings((Settings) ref$ObjectRef.element);
                        TaskQueue taskQueue2 = http2Connection.settingsListenerQueue;
                        final String stringPlus2 = s.stringPlus(http2Connection.getConnectionName$okhttp(), " onSettings");
                        final boolean z82 = true;
                        taskQueue2.schedule(new Task(stringPlus2, z82, http2Connection, ref$ObjectRef) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$applyAndAckSettings$lambda-7$lambda-6$$inlined$execute$default$1
                            final /* synthetic */ boolean $cancelable;
                            final /* synthetic */ String $name;
                            final /* synthetic */ Ref$ObjectRef $newPeerSettings$inlined;
                            final /* synthetic */ Http2Connection this$0;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(stringPlus2, z82);
                                this.$name = stringPlus2;
                                this.$cancelable = z82;
                                this.this$0 = http2Connection;
                                this.$newPeerSettings$inlined = ref$ObjectRef;
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // okhttp3.internal.concurrent.Task
                            public long runOnce() {
                                this.this$0.getListener$okhttp().onSettings(this.this$0, (Settings) this.$newPeerSettings$inlined.element);
                                return -1L;
                            }
                        }, 0L);
                        w wVar2 = w.INSTANCE;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                try {
                    http2Connection.getWriter().applyAndAckSettings((Settings) ref$ObjectRef.element);
                } catch (IOException e8) {
                    http2Connection.failConnection(e8);
                }
                w wVar3 = w.INSTANCE;
            }
            if (http2StreamArr != null) {
                int length = http2StreamArr.length;
                while (i8 < length) {
                    Http2Stream http2Stream = http2StreamArr[i8];
                    i8++;
                    synchronized (http2Stream) {
                        http2Stream.addBytesToWriteWindow(initialWindowSize);
                        w wVar4 = w.INSTANCE;
                    }
                }
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void data(boolean z7, int i8, e source, int i9) {
            s.checkNotNullParameter(source, "source");
            if (this.this$0.pushedStream$okhttp(i8)) {
                this.this$0.pushDataLater$okhttp(i8, source, i9, z7);
                return;
            }
            Http2Stream stream = this.this$0.getStream(i8);
            if (stream == null) {
                this.this$0.writeSynResetLater$okhttp(i8, ErrorCode.PROTOCOL_ERROR);
                long j8 = i9;
                this.this$0.updateConnectionFlowControl$okhttp(j8);
                source.skip(j8);
                return;
            }
            stream.receiveData(source, i9);
            if (z7) {
                stream.receiveHeaders(Util.EMPTY_HEADERS, true);
            }
        }

        public final Http2Reader getReader$okhttp() {
            return this.reader;
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void goAway(int i8, ErrorCode errorCode, ByteString debugData) {
            int i9;
            Object[] array;
            s.checkNotNullParameter(errorCode, "errorCode");
            s.checkNotNullParameter(debugData, "debugData");
            debugData.size();
            Http2Connection http2Connection = this.this$0;
            synchronized (http2Connection) {
                i9 = 0;
                array = http2Connection.getStreams$okhttp().values().toArray(new Http2Stream[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                }
                http2Connection.isShutdown = true;
                w wVar = w.INSTANCE;
            }
            Http2Stream[] http2StreamArr = (Http2Stream[]) array;
            int length = http2StreamArr.length;
            while (i9 < length) {
                Http2Stream http2Stream = http2StreamArr[i9];
                i9++;
                if (http2Stream.getId() > i8 && http2Stream.isLocallyInitiated()) {
                    http2Stream.receiveRstStream(ErrorCode.REFUSED_STREAM);
                    this.this$0.removeStream$okhttp(http2Stream.getId());
                }
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void headers(boolean z7, int i8, int i9, List<Header> headerBlock) {
            s.checkNotNullParameter(headerBlock, "headerBlock");
            if (this.this$0.pushedStream$okhttp(i8)) {
                this.this$0.pushHeadersLater$okhttp(i8, headerBlock, z7);
                return;
            }
            final Http2Connection http2Connection = this.this$0;
            synchronized (http2Connection) {
                Http2Stream stream = http2Connection.getStream(i8);
                if (stream != null) {
                    w wVar = w.INSTANCE;
                    stream.receiveHeaders(Util.toHeaders(headerBlock), z7);
                    return;
                }
                if (http2Connection.isShutdown) {
                    return;
                }
                if (i8 <= http2Connection.getLastGoodStreamId$okhttp()) {
                    return;
                }
                if (i8 % 2 == http2Connection.getNextStreamId$okhttp() % 2) {
                    return;
                }
                final Http2Stream http2Stream = new Http2Stream(i8, http2Connection, false, z7, Util.toHeaders(headerBlock));
                http2Connection.setLastGoodStreamId$okhttp(i8);
                http2Connection.getStreams$okhttp().put(Integer.valueOf(i8), http2Stream);
                TaskQueue newQueue = http2Connection.taskRunner.newQueue();
                final String str = http2Connection.getConnectionName$okhttp() + '[' + i8 + "] onStream";
                final boolean z8 = true;
                newQueue.schedule(new Task(str, z8, http2Connection, http2Stream) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$headers$lambda-2$$inlined$execute$default$1
                    final /* synthetic */ boolean $cancelable;
                    final /* synthetic */ String $name;
                    final /* synthetic */ Http2Stream $newStream$inlined;
                    final /* synthetic */ Http2Connection this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(str, z8);
                        this.$name = str;
                        this.$cancelable = z8;
                        this.this$0 = http2Connection;
                        this.$newStream$inlined = http2Stream;
                    }

                    @Override // okhttp3.internal.concurrent.Task
                    public long runOnce() {
                        try {
                            this.this$0.getListener$okhttp().onStream(this.$newStream$inlined);
                            return -1L;
                        } catch (IOException e8) {
                            Platform.Companion.get().log(s.stringPlus("Http2Connection.Listener failure for ", this.this$0.getConnectionName$okhttp()), 4, e8);
                            try {
                                this.$newStream$inlined.close(ErrorCode.PROTOCOL_ERROR, e8);
                                return -1L;
                            } catch (IOException unused) {
                                return -1L;
                            }
                        }
                    }
                }, 0L);
            }
        }

        @Override // f6.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m1437invoke();
            return w.INSTANCE;
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void ping(boolean z7, final int i8, final int i9) {
            if (!z7) {
                TaskQueue taskQueue = this.this$0.writerQueue;
                final String stringPlus = s.stringPlus(this.this$0.getConnectionName$okhttp(), " ping");
                final Http2Connection http2Connection = this.this$0;
                final boolean z8 = true;
                taskQueue.schedule(new Task(stringPlus, z8, http2Connection, i8, i9) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$ping$$inlined$execute$default$1
                    final /* synthetic */ boolean $cancelable;
                    final /* synthetic */ String $name;
                    final /* synthetic */ int $payload1$inlined;
                    final /* synthetic */ int $payload2$inlined;
                    final /* synthetic */ Http2Connection this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(stringPlus, z8);
                        this.$name = stringPlus;
                        this.$cancelable = z8;
                        this.this$0 = http2Connection;
                        this.$payload1$inlined = i8;
                        this.$payload2$inlined = i9;
                    }

                    @Override // okhttp3.internal.concurrent.Task
                    public long runOnce() {
                        this.this$0.writePing(true, this.$payload1$inlined, this.$payload2$inlined);
                        return -1L;
                    }
                }, 0L);
                return;
            }
            Http2Connection http2Connection2 = this.this$0;
            synchronized (http2Connection2) {
                try {
                    if (i8 == 1) {
                        http2Connection2.intervalPongsReceived++;
                    } else if (i8 != 2) {
                        if (i8 == 3) {
                            http2Connection2.awaitPongsReceived++;
                            http2Connection2.notifyAll();
                        }
                        w wVar = w.INSTANCE;
                    } else {
                        http2Connection2.degradedPongsReceived++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void priority(int i8, int i9, int i10, boolean z7) {
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void pushPromise(int i8, int i9, List<Header> requestHeaders) {
            s.checkNotNullParameter(requestHeaders, "requestHeaders");
            this.this$0.pushRequestLater$okhttp(i9, requestHeaders);
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void rstStream(int i8, ErrorCode errorCode) {
            s.checkNotNullParameter(errorCode, "errorCode");
            if (this.this$0.pushedStream$okhttp(i8)) {
                this.this$0.pushResetLater$okhttp(i8, errorCode);
                return;
            }
            Http2Stream removeStream$okhttp = this.this$0.removeStream$okhttp(i8);
            if (removeStream$okhttp == null) {
                return;
            }
            removeStream$okhttp.receiveRstStream(errorCode);
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void settings(final boolean z7, final Settings settings) {
            s.checkNotNullParameter(settings, "settings");
            TaskQueue taskQueue = this.this$0.writerQueue;
            final String stringPlus = s.stringPlus(this.this$0.getConnectionName$okhttp(), " applyAndAckSettings");
            final boolean z8 = true;
            taskQueue.schedule(new Task(stringPlus, z8, this, z7, settings) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$settings$$inlined$execute$default$1
                final /* synthetic */ boolean $cancelable;
                final /* synthetic */ boolean $clearPrevious$inlined;
                final /* synthetic */ String $name;
                final /* synthetic */ Settings $settings$inlined;
                final /* synthetic */ Http2Connection.ReaderRunnable this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(stringPlus, z8);
                    this.$name = stringPlus;
                    this.$cancelable = z8;
                    this.this$0 = this;
                    this.$clearPrevious$inlined = z7;
                    this.$settings$inlined = settings;
                }

                @Override // okhttp3.internal.concurrent.Task
                public long runOnce() {
                    this.this$0.applyAndAckSettings(this.$clearPrevious$inlined, this.$settings$inlined);
                    return -1L;
                }
            }, 0L);
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void windowUpdate(int i8, long j8) {
            if (i8 == 0) {
                Http2Connection http2Connection = this.this$0;
                synchronized (http2Connection) {
                    http2Connection.writeBytesMaximum = http2Connection.getWriteBytesMaximum() + j8;
                    http2Connection.notifyAll();
                    w wVar = w.INSTANCE;
                }
                return;
            }
            Http2Stream stream = this.this$0.getStream(i8);
            if (stream != null) {
                synchronized (stream) {
                    stream.addBytesToWriteWindow(j8);
                    w wVar2 = w.INSTANCE;
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [okhttp3.internal.http2.ErrorCode] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Closeable, okhttp3.internal.http2.Http2Reader] */
        /* renamed from: invoke, reason: collision with other method in class */
        public void m1437invoke() {
            ErrorCode errorCode;
            ErrorCode errorCode2 = ErrorCode.INTERNAL_ERROR;
            IOException e8 = null;
            try {
                try {
                    this.reader.readConnectionPreface(this);
                    while (this.reader.nextFrame(false, this)) {
                    }
                    ErrorCode errorCode3 = ErrorCode.NO_ERROR;
                    try {
                        this.this$0.close$okhttp(errorCode3, ErrorCode.CANCEL, null);
                        errorCode = errorCode3;
                    } catch (IOException e9) {
                        e8 = e9;
                        ErrorCode errorCode4 = ErrorCode.PROTOCOL_ERROR;
                        Http2Connection http2Connection = this.this$0;
                        http2Connection.close$okhttp(errorCode4, errorCode4, e8);
                        errorCode = http2Connection;
                        errorCode2 = this.reader;
                        Util.closeQuietly((Closeable) errorCode2);
                    }
                } catch (Throwable th) {
                    th = th;
                    this.this$0.close$okhttp(errorCode, errorCode2, e8);
                    Util.closeQuietly(this.reader);
                    throw th;
                }
            } catch (IOException e10) {
                e8 = e10;
            } catch (Throwable th2) {
                th = th2;
                errorCode = errorCode2;
                this.this$0.close$okhttp(errorCode, errorCode2, e8);
                Util.closeQuietly(this.reader);
                throw th;
            }
            errorCode2 = this.reader;
            Util.closeQuietly((Closeable) errorCode2);
        }
    }

    static {
        Settings settings = new Settings();
        settings.set(7, 65535);
        settings.set(5, 16384);
        DEFAULT_SETTINGS = settings;
    }

    public Http2Connection(Builder builder) {
        s.checkNotNullParameter(builder, "builder");
        boolean client$okhttp = builder.getClient$okhttp();
        this.client = client$okhttp;
        this.listener = builder.getListener$okhttp();
        this.streams = new LinkedHashMap();
        String connectionName$okhttp = builder.getConnectionName$okhttp();
        this.connectionName = connectionName$okhttp;
        this.nextStreamId = builder.getClient$okhttp() ? 3 : 2;
        TaskRunner taskRunner$okhttp = builder.getTaskRunner$okhttp();
        this.taskRunner = taskRunner$okhttp;
        TaskQueue newQueue = taskRunner$okhttp.newQueue();
        this.writerQueue = newQueue;
        this.pushQueue = taskRunner$okhttp.newQueue();
        this.settingsListenerQueue = taskRunner$okhttp.newQueue();
        this.pushObserver = builder.getPushObserver$okhttp();
        Settings settings = new Settings();
        if (builder.getClient$okhttp()) {
            settings.set(7, 16777216);
        }
        this.okHttpSettings = settings;
        this.peerSettings = DEFAULT_SETTINGS;
        this.writeBytesMaximum = r2.getInitialWindowSize();
        this.socket = builder.getSocket$okhttp();
        this.writer = new Http2Writer(builder.getSink$okhttp(), client$okhttp);
        this.readerRunnable = new ReaderRunnable(this, new Http2Reader(builder.getSource$okhttp(), client$okhttp));
        this.currentPushRequests = new LinkedHashSet();
        if (builder.getPingIntervalMillis$okhttp() != 0) {
            final long nanos = TimeUnit.MILLISECONDS.toNanos(builder.getPingIntervalMillis$okhttp());
            final String stringPlus = s.stringPlus(connectionName$okhttp, " ping");
            newQueue.schedule(new Task(stringPlus, this, nanos) { // from class: okhttp3.internal.http2.Http2Connection$special$$inlined$schedule$1
                final /* synthetic */ String $name;
                final /* synthetic */ long $pingIntervalNanos$inlined;
                final /* synthetic */ Http2Connection this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(stringPlus, false, 2, null);
                    this.$name = stringPlus;
                    this.this$0 = this;
                    this.$pingIntervalNanos$inlined = nanos;
                }

                @Override // okhttp3.internal.concurrent.Task
                public long runOnce() {
                    long j8;
                    long j9;
                    boolean z7;
                    synchronized (this.this$0) {
                        long j10 = this.this$0.intervalPongsReceived;
                        j8 = this.this$0.intervalPingsSent;
                        if (j10 < j8) {
                            z7 = true;
                        } else {
                            j9 = this.this$0.intervalPingsSent;
                            this.this$0.intervalPingsSent = j9 + 1;
                            z7 = false;
                        }
                    }
                    if (z7) {
                        this.this$0.failConnection(null);
                        return -1L;
                    }
                    this.this$0.writePing(false, 1, 0);
                    return this.$pingIntervalNanos$inlined;
                }
            }, nanos);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void failConnection(IOException iOException) {
        ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
        close$okhttp(errorCode, errorCode, iOException);
    }

    public static /* synthetic */ void start$default(Http2Connection http2Connection, boolean z7, TaskRunner taskRunner, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z7 = true;
        }
        if ((i8 & 2) != 0) {
            taskRunner = TaskRunner.INSTANCE;
        }
        http2Connection.start(z7, taskRunner);
    }

    public final synchronized void awaitPong() {
        while (this.awaitPongsReceived < this.awaitPingsSent) {
            wait();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        close$okhttp(ErrorCode.NO_ERROR, ErrorCode.CANCEL, null);
    }

    public final void close$okhttp(ErrorCode connectionCode, ErrorCode streamCode, IOException iOException) {
        int i8;
        Object[] objArr;
        s.checkNotNullParameter(connectionCode, "connectionCode");
        s.checkNotNullParameter(streamCode, "streamCode");
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        try {
            shutdown(connectionCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            try {
                if (!getStreams$okhttp().isEmpty()) {
                    objArr = getStreams$okhttp().values().toArray(new Http2Stream[0]);
                    if (objArr == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    }
                    getStreams$okhttp().clear();
                } else {
                    objArr = null;
                }
                w wVar = w.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        Http2Stream[] http2StreamArr = (Http2Stream[]) objArr;
        if (http2StreamArr != null) {
            for (Http2Stream http2Stream : http2StreamArr) {
                try {
                    http2Stream.close(streamCode, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            getWriter().close();
        } catch (IOException unused3) {
        }
        try {
            getSocket$okhttp().close();
        } catch (IOException unused4) {
        }
        this.writerQueue.shutdown();
        this.pushQueue.shutdown();
        this.settingsListenerQueue.shutdown();
    }

    public final void flush() {
        this.writer.flush();
    }

    public final boolean getClient$okhttp() {
        return this.client;
    }

    public final String getConnectionName$okhttp() {
        return this.connectionName;
    }

    public final int getLastGoodStreamId$okhttp() {
        return this.lastGoodStreamId;
    }

    public final Listener getListener$okhttp() {
        return this.listener;
    }

    public final int getNextStreamId$okhttp() {
        return this.nextStreamId;
    }

    public final Settings getOkHttpSettings() {
        return this.okHttpSettings;
    }

    public final Settings getPeerSettings() {
        return this.peerSettings;
    }

    public final long getReadBytesAcknowledged() {
        return this.readBytesAcknowledged;
    }

    public final long getReadBytesTotal() {
        return this.readBytesTotal;
    }

    public final ReaderRunnable getReaderRunnable() {
        return this.readerRunnable;
    }

    public final Socket getSocket$okhttp() {
        return this.socket;
    }

    public final synchronized Http2Stream getStream(int i8) {
        return this.streams.get(Integer.valueOf(i8));
    }

    public final Map<Integer, Http2Stream> getStreams$okhttp() {
        return this.streams;
    }

    public final long getWriteBytesMaximum() {
        return this.writeBytesMaximum;
    }

    public final long getWriteBytesTotal() {
        return this.writeBytesTotal;
    }

    public final Http2Writer getWriter() {
        return this.writer;
    }

    public final synchronized boolean isHealthy(long j8) {
        if (this.isShutdown) {
            return false;
        }
        if (this.degradedPongsReceived < this.degradedPingsSent) {
            if (j8 >= this.degradedPongDeadlineNs) {
                return false;
            }
        }
        return true;
    }

    public final Http2Stream newStream(List<Header> requestHeaders, boolean z7) {
        s.checkNotNullParameter(requestHeaders, "requestHeaders");
        return newStream(0, requestHeaders, z7);
    }

    public final synchronized int openStreamCount() {
        return this.streams.size();
    }

    public final void pushDataLater$okhttp(final int i8, e source, final int i9, final boolean z7) {
        s.checkNotNullParameter(source, "source");
        final c cVar = new c();
        long j8 = i9;
        source.require(j8);
        source.read(cVar, j8);
        TaskQueue taskQueue = this.pushQueue;
        final String str = this.connectionName + '[' + i8 + "] onData";
        final boolean z8 = true;
        taskQueue.schedule(new Task(str, z8, this, i8, cVar, i9, z7) { // from class: okhttp3.internal.http2.Http2Connection$pushDataLater$$inlined$execute$default$1
            final /* synthetic */ c $buffer$inlined;
            final /* synthetic */ int $byteCount$inlined;
            final /* synthetic */ boolean $cancelable;
            final /* synthetic */ boolean $inFinished$inlined;
            final /* synthetic */ String $name;
            final /* synthetic */ int $streamId$inlined;
            final /* synthetic */ Http2Connection this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(str, z8);
                this.$name = str;
                this.$cancelable = z8;
                this.this$0 = this;
                this.$streamId$inlined = i8;
                this.$buffer$inlined = cVar;
                this.$byteCount$inlined = i9;
                this.$inFinished$inlined = z7;
            }

            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                PushObserver pushObserver;
                Set set;
                try {
                    pushObserver = this.this$0.pushObserver;
                    boolean onData = pushObserver.onData(this.$streamId$inlined, this.$buffer$inlined, this.$byteCount$inlined, this.$inFinished$inlined);
                    if (onData) {
                        this.this$0.getWriter().rstStream(this.$streamId$inlined, ErrorCode.CANCEL);
                    }
                    if (!onData && !this.$inFinished$inlined) {
                        return -1L;
                    }
                    synchronized (this.this$0) {
                        set = this.this$0.currentPushRequests;
                        set.remove(Integer.valueOf(this.$streamId$inlined));
                    }
                    return -1L;
                } catch (IOException unused) {
                    return -1L;
                }
            }
        }, 0L);
    }

    public final void pushHeadersLater$okhttp(final int i8, final List<Header> requestHeaders, final boolean z7) {
        s.checkNotNullParameter(requestHeaders, "requestHeaders");
        TaskQueue taskQueue = this.pushQueue;
        final String str = this.connectionName + '[' + i8 + "] onHeaders";
        final boolean z8 = true;
        taskQueue.schedule(new Task(str, z8, this, i8, requestHeaders, z7) { // from class: okhttp3.internal.http2.Http2Connection$pushHeadersLater$$inlined$execute$default$1
            final /* synthetic */ boolean $cancelable;
            final /* synthetic */ boolean $inFinished$inlined;
            final /* synthetic */ String $name;
            final /* synthetic */ List $requestHeaders$inlined;
            final /* synthetic */ int $streamId$inlined;
            final /* synthetic */ Http2Connection this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(str, z8);
                this.$name = str;
                this.$cancelable = z8;
                this.this$0 = this;
                this.$streamId$inlined = i8;
                this.$requestHeaders$inlined = requestHeaders;
                this.$inFinished$inlined = z7;
            }

            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                PushObserver pushObserver;
                Set set;
                pushObserver = this.this$0.pushObserver;
                boolean onHeaders = pushObserver.onHeaders(this.$streamId$inlined, this.$requestHeaders$inlined, this.$inFinished$inlined);
                if (onHeaders) {
                    try {
                        this.this$0.getWriter().rstStream(this.$streamId$inlined, ErrorCode.CANCEL);
                    } catch (IOException unused) {
                        return -1L;
                    }
                }
                if (!onHeaders && !this.$inFinished$inlined) {
                    return -1L;
                }
                synchronized (this.this$0) {
                    set = this.this$0.currentPushRequests;
                    set.remove(Integer.valueOf(this.$streamId$inlined));
                }
                return -1L;
            }
        }, 0L);
    }

    public final void pushRequestLater$okhttp(final int i8, final List<Header> requestHeaders) {
        s.checkNotNullParameter(requestHeaders, "requestHeaders");
        synchronized (this) {
            if (this.currentPushRequests.contains(Integer.valueOf(i8))) {
                writeSynResetLater$okhttp(i8, ErrorCode.PROTOCOL_ERROR);
                return;
            }
            this.currentPushRequests.add(Integer.valueOf(i8));
            TaskQueue taskQueue = this.pushQueue;
            final String str = this.connectionName + '[' + i8 + "] onRequest";
            final boolean z7 = true;
            taskQueue.schedule(new Task(str, z7, this, i8, requestHeaders) { // from class: okhttp3.internal.http2.Http2Connection$pushRequestLater$$inlined$execute$default$1
                final /* synthetic */ boolean $cancelable;
                final /* synthetic */ String $name;
                final /* synthetic */ List $requestHeaders$inlined;
                final /* synthetic */ int $streamId$inlined;
                final /* synthetic */ Http2Connection this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(str, z7);
                    this.$name = str;
                    this.$cancelable = z7;
                    this.this$0 = this;
                    this.$streamId$inlined = i8;
                    this.$requestHeaders$inlined = requestHeaders;
                }

                @Override // okhttp3.internal.concurrent.Task
                public long runOnce() {
                    PushObserver pushObserver;
                    Set set;
                    pushObserver = this.this$0.pushObserver;
                    if (!pushObserver.onRequest(this.$streamId$inlined, this.$requestHeaders$inlined)) {
                        return -1L;
                    }
                    try {
                        this.this$0.getWriter().rstStream(this.$streamId$inlined, ErrorCode.CANCEL);
                        synchronized (this.this$0) {
                            set = this.this$0.currentPushRequests;
                            set.remove(Integer.valueOf(this.$streamId$inlined));
                        }
                        return -1L;
                    } catch (IOException unused) {
                        return -1L;
                    }
                }
            }, 0L);
        }
    }

    public final void pushResetLater$okhttp(final int i8, final ErrorCode errorCode) {
        s.checkNotNullParameter(errorCode, "errorCode");
        TaskQueue taskQueue = this.pushQueue;
        final String str = this.connectionName + '[' + i8 + "] onReset";
        final boolean z7 = true;
        taskQueue.schedule(new Task(str, z7, this, i8, errorCode) { // from class: okhttp3.internal.http2.Http2Connection$pushResetLater$$inlined$execute$default$1
            final /* synthetic */ boolean $cancelable;
            final /* synthetic */ ErrorCode $errorCode$inlined;
            final /* synthetic */ String $name;
            final /* synthetic */ int $streamId$inlined;
            final /* synthetic */ Http2Connection this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(str, z7);
                this.$name = str;
                this.$cancelable = z7;
                this.this$0 = this;
                this.$streamId$inlined = i8;
                this.$errorCode$inlined = errorCode;
            }

            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                PushObserver pushObserver;
                Set set;
                pushObserver = this.this$0.pushObserver;
                pushObserver.onReset(this.$streamId$inlined, this.$errorCode$inlined);
                synchronized (this.this$0) {
                    set = this.this$0.currentPushRequests;
                    set.remove(Integer.valueOf(this.$streamId$inlined));
                    w wVar = w.INSTANCE;
                }
                return -1L;
            }
        }, 0L);
    }

    public final Http2Stream pushStream(int i8, List<Header> requestHeaders, boolean z7) {
        s.checkNotNullParameter(requestHeaders, "requestHeaders");
        if (!this.client) {
            return newStream(i8, requestHeaders, z7);
        }
        throw new IllegalStateException("Client cannot push requests.".toString());
    }

    public final boolean pushedStream$okhttp(int i8) {
        return i8 != 0 && (i8 & 1) == 0;
    }

    public final synchronized Http2Stream removeStream$okhttp(int i8) {
        Http2Stream remove;
        remove = this.streams.remove(Integer.valueOf(i8));
        notifyAll();
        return remove;
    }

    public final void sendDegradedPingLater$okhttp() {
        synchronized (this) {
            long j8 = this.degradedPongsReceived;
            long j9 = this.degradedPingsSent;
            if (j8 < j9) {
                return;
            }
            this.degradedPingsSent = j9 + 1;
            this.degradedPongDeadlineNs = System.nanoTime() + 1000000000;
            w wVar = w.INSTANCE;
            TaskQueue taskQueue = this.writerQueue;
            final String stringPlus = s.stringPlus(this.connectionName, " ping");
            final boolean z7 = true;
            taskQueue.schedule(new Task(stringPlus, z7, this) { // from class: okhttp3.internal.http2.Http2Connection$sendDegradedPingLater$$inlined$execute$default$1
                final /* synthetic */ boolean $cancelable;
                final /* synthetic */ String $name;
                final /* synthetic */ Http2Connection this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(stringPlus, z7);
                    this.$name = stringPlus;
                    this.$cancelable = z7;
                    this.this$0 = this;
                }

                @Override // okhttp3.internal.concurrent.Task
                public long runOnce() {
                    this.this$0.writePing(false, 2, 0);
                    return -1L;
                }
            }, 0L);
        }
    }

    public final void setLastGoodStreamId$okhttp(int i8) {
        this.lastGoodStreamId = i8;
    }

    public final void setNextStreamId$okhttp(int i8) {
        this.nextStreamId = i8;
    }

    public final void setPeerSettings(Settings settings) {
        s.checkNotNullParameter(settings, "<set-?>");
        this.peerSettings = settings;
    }

    public final void setSettings(Settings settings) {
        s.checkNotNullParameter(settings, "settings");
        synchronized (this.writer) {
            synchronized (this) {
                if (this.isShutdown) {
                    throw new ConnectionShutdownException();
                }
                getOkHttpSettings().merge(settings);
                w wVar = w.INSTANCE;
            }
            getWriter().settings(settings);
        }
    }

    public final void shutdown(ErrorCode statusCode) {
        s.checkNotNullParameter(statusCode, "statusCode");
        synchronized (this.writer) {
            Ref$IntRef ref$IntRef = new Ref$IntRef();
            synchronized (this) {
                if (this.isShutdown) {
                    return;
                }
                this.isShutdown = true;
                ref$IntRef.element = getLastGoodStreamId$okhttp();
                w wVar = w.INSTANCE;
                getWriter().goAway(ref$IntRef.element, statusCode, Util.EMPTY_BYTE_ARRAY);
            }
        }
    }

    public final void start() {
        start$default(this, false, null, 3, null);
    }

    public final synchronized void updateConnectionFlowControl$okhttp(long j8) {
        long j9 = this.readBytesTotal + j8;
        this.readBytesTotal = j9;
        long j10 = j9 - this.readBytesAcknowledged;
        if (j10 >= this.okHttpSettings.getInitialWindowSize() / 2) {
            writeWindowUpdateLater$okhttp(0, j10);
            this.readBytesAcknowledged += j10;
        }
    }

    public final void writeData(int i8, boolean z7, c cVar, long j8) {
        int min;
        long j9;
        if (j8 == 0) {
            this.writer.data(z7, i8, cVar, 0);
            return;
        }
        while (j8 > 0) {
            synchronized (this) {
                while (getWriteBytesTotal() >= getWriteBytesMaximum()) {
                    try {
                        try {
                            if (!getStreams$okhttp().containsKey(Integer.valueOf(i8))) {
                                throw new IOException("stream closed");
                            }
                            wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                min = Math.min((int) Math.min(j8, getWriteBytesMaximum() - getWriteBytesTotal()), getWriter().maxDataLength());
                j9 = min;
                this.writeBytesTotal = getWriteBytesTotal() + j9;
                w wVar = w.INSTANCE;
            }
            j8 -= j9;
            this.writer.data(z7 && j8 == 0, i8, cVar, min);
        }
    }

    public final void writeHeaders$okhttp(int i8, boolean z7, List<Header> alternating) {
        s.checkNotNullParameter(alternating, "alternating");
        this.writer.headers(z7, i8, alternating);
    }

    public final void writePing(boolean z7, int i8, int i9) {
        try {
            this.writer.ping(z7, i8, i9);
        } catch (IOException e8) {
            failConnection(e8);
        }
    }

    public final void writePingAndAwaitPong() {
        writePing();
        awaitPong();
    }

    public final void writeSynReset$okhttp(int i8, ErrorCode statusCode) {
        s.checkNotNullParameter(statusCode, "statusCode");
        this.writer.rstStream(i8, statusCode);
    }

    public final void writeSynResetLater$okhttp(final int i8, final ErrorCode errorCode) {
        s.checkNotNullParameter(errorCode, "errorCode");
        TaskQueue taskQueue = this.writerQueue;
        final String str = this.connectionName + '[' + i8 + "] writeSynReset";
        final boolean z7 = true;
        taskQueue.schedule(new Task(str, z7, this, i8, errorCode) { // from class: okhttp3.internal.http2.Http2Connection$writeSynResetLater$$inlined$execute$default$1
            final /* synthetic */ boolean $cancelable;
            final /* synthetic */ ErrorCode $errorCode$inlined;
            final /* synthetic */ String $name;
            final /* synthetic */ int $streamId$inlined;
            final /* synthetic */ Http2Connection this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(str, z7);
                this.$name = str;
                this.$cancelable = z7;
                this.this$0 = this;
                this.$streamId$inlined = i8;
                this.$errorCode$inlined = errorCode;
            }

            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                try {
                    this.this$0.writeSynReset$okhttp(this.$streamId$inlined, this.$errorCode$inlined);
                    return -1L;
                } catch (IOException e8) {
                    this.this$0.failConnection(e8);
                    return -1L;
                }
            }
        }, 0L);
    }

    public final void writeWindowUpdateLater$okhttp(final int i8, final long j8) {
        TaskQueue taskQueue = this.writerQueue;
        final String str = this.connectionName + '[' + i8 + "] windowUpdate";
        final boolean z7 = true;
        taskQueue.schedule(new Task(str, z7, this, i8, j8) { // from class: okhttp3.internal.http2.Http2Connection$writeWindowUpdateLater$$inlined$execute$default$1
            final /* synthetic */ boolean $cancelable;
            final /* synthetic */ String $name;
            final /* synthetic */ int $streamId$inlined;
            final /* synthetic */ long $unacknowledgedBytesRead$inlined;
            final /* synthetic */ Http2Connection this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(str, z7);
                this.$name = str;
                this.$cancelable = z7;
                this.this$0 = this;
                this.$streamId$inlined = i8;
                this.$unacknowledgedBytesRead$inlined = j8;
            }

            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                try {
                    this.this$0.getWriter().windowUpdate(this.$streamId$inlined, this.$unacknowledgedBytesRead$inlined);
                    return -1L;
                } catch (IOException e8) {
                    this.this$0.failConnection(e8);
                    return -1L;
                }
            }
        }, 0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0059 A[Catch: all -> 0x0016, TryCatch #1 {all -> 0x0016, blocks: (B:6:0x0007, B:8:0x0010, B:9:0x0019, B:11:0x001d, B:13:0x0037, B:15:0x0043, B:19:0x0053, B:21:0x0059, B:22:0x0064, B:37:0x0096, B:38:0x009b), top: B:5:0x0007, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Http2Stream newStream(int i8, List<Header> list, boolean z7) {
        int nextStreamId$okhttp;
        Http2Stream http2Stream;
        boolean z8;
        boolean z9 = !z7;
        synchronized (this.writer) {
            try {
                synchronized (this) {
                    try {
                        if (getNextStreamId$okhttp() > 1073741823) {
                            shutdown(ErrorCode.REFUSED_STREAM);
                        }
                        if (this.isShutdown) {
                            throw new ConnectionShutdownException();
                        }
                        nextStreamId$okhttp = getNextStreamId$okhttp();
                        setNextStreamId$okhttp(getNextStreamId$okhttp() + 2);
                        http2Stream = new Http2Stream(nextStreamId$okhttp, this, z9, false, null);
                        if (z7 && getWriteBytesTotal() < getWriteBytesMaximum() && http2Stream.getWriteBytesTotal() < http2Stream.getWriteBytesMaximum()) {
                            z8 = false;
                            if (http2Stream.isOpen()) {
                                getStreams$okhttp().put(Integer.valueOf(nextStreamId$okhttp), http2Stream);
                            }
                            w wVar = w.INSTANCE;
                        }
                        z8 = true;
                        if (http2Stream.isOpen()) {
                        }
                        w wVar2 = w.INSTANCE;
                    } finally {
                    }
                }
                if (i8 == 0) {
                    getWriter().headers(z9, nextStreamId$okhttp, list);
                } else {
                    if (!(true ^ getClient$okhttp())) {
                        throw new IllegalArgumentException("client streams shouldn't have associated stream IDs".toString());
                    }
                    getWriter().pushPromise(i8, nextStreamId$okhttp, list);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z8) {
            this.writer.flush();
        }
        return http2Stream;
    }

    public final void start(boolean z7) {
        start$default(this, z7, null, 2, null);
    }

    public final void start(boolean z7, TaskRunner taskRunner) {
        s.checkNotNullParameter(taskRunner, "taskRunner");
        if (z7) {
            this.writer.connectionPreface();
            this.writer.settings(this.okHttpSettings);
            if (this.okHttpSettings.getInitialWindowSize() != 65535) {
                this.writer.windowUpdate(0, r5 - 65535);
            }
        }
        taskRunner.newQueue().schedule(new TaskQueue$execute$1(this.connectionName, true, this.readerRunnable), 0L);
    }

    public final void writePing() {
        synchronized (this) {
            this.awaitPingsSent++;
        }
        writePing(false, 3, 1330343787);
    }
}
