package okhttp3.internal.ws;

import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import okhttp3.Call;
import okhttp3.Protocol;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.ws.WebSocketReader;
import okio.f;
import okio.g;
import okio.h;

@Metadata
/* loaded from: classes3.dex */
public final class RealWebSocket implements WebSocket, WebSocketReader.FrameCallback {

    /* renamed from: y, reason: collision with root package name */
    public static final Companion f43175y = new Companion(null);

    /* renamed from: z, reason: collision with root package name */
    private static final List f43176z = CollectionsKt.listOf(Protocol.HTTP_1_1);

    /* renamed from: a, reason: collision with root package name */
    private final WebSocketListener f43177a;

    /* renamed from: b, reason: collision with root package name */
    private final Random f43178b;

    /* renamed from: c, reason: collision with root package name */
    private final long f43179c;

    /* renamed from: d, reason: collision with root package name */
    private WebSocketExtensions f43180d;

    /* renamed from: e, reason: collision with root package name */
    private long f43181e;

    /* renamed from: f, reason: collision with root package name */
    private final String f43182f;

    /* renamed from: g, reason: collision with root package name */
    private Call f43183g;

    /* renamed from: h, reason: collision with root package name */
    private Task f43184h;

    /* renamed from: i, reason: collision with root package name */
    private WebSocketReader f43185i;

    /* renamed from: j, reason: collision with root package name */
    private WebSocketWriter f43186j;

    /* renamed from: k, reason: collision with root package name */
    private TaskQueue f43187k;

    /* renamed from: l, reason: collision with root package name */
    private String f43188l;

    /* renamed from: m, reason: collision with root package name */
    private Streams f43189m;

    /* renamed from: n, reason: collision with root package name */
    private final ArrayDeque f43190n;

    /* renamed from: o, reason: collision with root package name */
    private final ArrayDeque f43191o;

    /* renamed from: p, reason: collision with root package name */
    private long f43192p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f43193q;

    /* renamed from: r, reason: collision with root package name */
    private int f43194r;

    /* renamed from: s, reason: collision with root package name */
    private String f43195s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f43196t;

    /* renamed from: u, reason: collision with root package name */
    private int f43197u;

    /* renamed from: v, reason: collision with root package name */
    private int f43198v;

    /* renamed from: w, reason: collision with root package name */
    private int f43199w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f43200x;

    @Metadata
    public static final class Close {

        /* renamed from: a, reason: collision with root package name */
        private final int f43204a;

        /* renamed from: b, reason: collision with root package name */
        private final h f43205b;

        /* renamed from: c, reason: collision with root package name */
        private final long f43206c;

        public Close(int i4, h hVar, long j4) {
            this.f43204a = i4;
            this.f43205b = hVar;
            this.f43206c = j4;
        }

        public final long a() {
            return this.f43206c;
        }

        public final int b() {
            return this.f43204a;
        }

        public final h c() {
            return this.f43205b;
        }
    }

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata
    public static final class Message {

        /* renamed from: a, reason: collision with root package name */
        private final int f43207a;

        /* renamed from: b, reason: collision with root package name */
        private final h f43208b;

        public final h a() {
            return this.f43208b;
        }

        public final int b() {
            return this.f43207a;
        }
    }

    @Metadata
    public static abstract class Streams implements Closeable {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f43209b;

        /* renamed from: c, reason: collision with root package name */
        private final g f43210c;

        /* renamed from: d, reason: collision with root package name */
        private final f f43211d;

        public Streams(boolean z4, g source, f sink) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(sink, "sink");
            this.f43209b = z4;
            this.f43210c = source;
            this.f43211d = sink;
        }

        public final boolean m() {
            return this.f43209b;
        }

        public final f n() {
            return this.f43211d;
        }

        public final g o() {
            return this.f43210c;
        }
    }

    @Metadata
    private final class WriterTask extends Task {
        public WriterTask() {
            super(RealWebSocket.this.f43188l + " writer", false, 2, null);
        }

        @Override // okhttp3.internal.concurrent.Task
        public long f() {
            try {
                return RealWebSocket.this.t() ? 0L : -1L;
            } catch (IOException e4) {
                RealWebSocket.this.n(e4, null);
                return -1L;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean q(WebSocketExtensions webSocketExtensions) {
        if (!webSocketExtensions.f43221f && webSocketExtensions.f43217b == null) {
            return webSocketExtensions.f43219d == null || new IntRange(8, 15).h(webSocketExtensions.f43219d.intValue());
        }
        return false;
    }

    private final void s() {
        if (!Util.f42596h || Thread.holdsLock(this)) {
            Task task = this.f43184h;
            if (task != null) {
                TaskQueue.j(this.f43187k, task, 0L, 2, null);
                return;
            }
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void a(h bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        this.f43177a.e(this, bytes);
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void b(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f43177a.d(this, text);
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public synchronized void c(h payload) {
        try {
            Intrinsics.checkNotNullParameter(payload, "payload");
            if (!this.f43196t && (!this.f43193q || !this.f43191o.isEmpty())) {
                this.f43190n.add(payload);
                s();
                this.f43198v++;
            }
        } finally {
        }
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public synchronized void d(h payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.f43199w++;
        this.f43200x = false;
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void e(int i4, String reason) {
        Streams streams;
        WebSocketReader webSocketReader;
        WebSocketWriter webSocketWriter;
        Intrinsics.checkNotNullParameter(reason, "reason");
        if (i4 == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        synchronized (this) {
            try {
                if (this.f43194r != -1) {
                    throw new IllegalStateException("already closed");
                }
                this.f43194r = i4;
                this.f43195s = reason;
                streams = null;
                if (this.f43193q && this.f43191o.isEmpty()) {
                    Streams streams2 = this.f43189m;
                    this.f43189m = null;
                    webSocketReader = this.f43185i;
                    this.f43185i = null;
                    webSocketWriter = this.f43186j;
                    this.f43186j = null;
                    this.f43187k.n();
                    streams = streams2;
                } else {
                    webSocketReader = null;
                    webSocketWriter = null;
                }
                Unit unit = Unit.f41027a;
            } catch (Throwable th) {
                throw th;
            }
        }
        try {
            this.f43177a.b(this, i4, reason);
            if (streams != null) {
                this.f43177a.a(this, i4, reason);
            }
        } finally {
            if (streams != null) {
                Util.l(streams);
            }
            if (webSocketReader != null) {
                Util.l(webSocketReader);
            }
            if (webSocketWriter != null) {
                Util.l(webSocketWriter);
            }
        }
    }

    public void j() {
        Call call = this.f43183g;
        Intrinsics.checkNotNull(call);
        call.cancel();
    }

    public final void k(Response response, Exchange exchange) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (response.J() != 101) {
            throw new ProtocolException("Expected HTTP 101 response but was '" + response.J() + ' ' + response.Y() + '\'');
        }
        String V3 = Response.V(response, "Connection", null, 2, null);
        if (!StringsKt.w("Upgrade", V3, true)) {
            throw new ProtocolException("Expected 'Connection' header value 'Upgrade' but was '" + V3 + '\'');
        }
        String V4 = Response.V(response, "Upgrade", null, 2, null);
        if (!StringsKt.w("websocket", V4, true)) {
            throw new ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + V4 + '\'');
        }
        String V5 = Response.V(response, "Sec-WebSocket-Accept", null, 2, null);
        String c4 = h.f43270e.d(this.f43182f + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").t().c();
        if (Intrinsics.areEqual(c4, V5)) {
            if (exchange == null) {
                throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
            }
            return;
        }
        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + c4 + "' but was '" + V5 + '\'');
    }

    public boolean l(int i4, String str) {
        return m(i4, str, 60000L);
    }

    public final synchronized boolean m(int i4, String str, long j4) {
        h hVar;
        try {
            WebSocketProtocol.f43222a.c(i4);
            if (str != null) {
                hVar = h.f43270e.d(str);
                if (hVar.v() > 123) {
                    throw new IllegalArgumentException(("reason.size() > 123: " + str).toString());
                }
            } else {
                hVar = null;
            }
            if (!this.f43196t && !this.f43193q) {
                this.f43193q = true;
                this.f43191o.add(new Close(i4, hVar, j4));
                s();
                return true;
            }
            return false;
        } finally {
        }
    }

    public final void n(Exception e4, Response response) {
        Intrinsics.checkNotNullParameter(e4, "e");
        synchronized (this) {
            if (this.f43196t) {
                return;
            }
            this.f43196t = true;
            Streams streams = this.f43189m;
            this.f43189m = null;
            WebSocketReader webSocketReader = this.f43185i;
            this.f43185i = null;
            WebSocketWriter webSocketWriter = this.f43186j;
            this.f43186j = null;
            this.f43187k.n();
            Unit unit = Unit.f41027a;
            try {
                this.f43177a.c(this, e4, response);
            } finally {
                if (streams != null) {
                    Util.l(streams);
                }
                if (webSocketReader != null) {
                    Util.l(webSocketReader);
                }
                if (webSocketWriter != null) {
                    Util.l(webSocketWriter);
                }
            }
        }
    }

    public final WebSocketListener o() {
        return this.f43177a;
    }

    public final void p(String name, Streams streams) {
        Throwable th;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(streams, "streams");
        WebSocketExtensions webSocketExtensions = this.f43180d;
        Intrinsics.checkNotNull(webSocketExtensions);
        synchronized (this) {
            try {
                this.f43188l = name;
                this.f43189m = streams;
                this.f43186j = new WebSocketWriter(streams.m(), streams.n(), this.f43178b, webSocketExtensions.f43216a, webSocketExtensions.a(streams.m()), this.f43181e);
                this.f43184h = new WriterTask();
                long j4 = this.f43179c;
                if (j4 != 0) {
                    try {
                        final long nanos = TimeUnit.MILLISECONDS.toNanos(j4);
                        final String str = name + " ping";
                        this.f43187k.i(new Task(str) { // from class: okhttp3.internal.ws.RealWebSocket$initReaderAndWriter$lambda$3$$inlined$schedule$1
                            @Override // okhttp3.internal.concurrent.Task
                            public long f() {
                                this.u();
                                return nanos;
                            }
                        }, nanos);
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                if (!this.f43191o.isEmpty()) {
                    s();
                }
                Unit unit = Unit.f41027a;
                this.f43185i = new WebSocketReader(streams.m(), streams.o(), this, webSocketExtensions.f43216a, webSocketExtensions.a(!streams.m()));
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    public final void r() {
        while (this.f43194r == -1) {
            WebSocketReader webSocketReader = this.f43185i;
            Intrinsics.checkNotNull(webSocketReader);
            webSocketReader.m();
        }
    }

    public final boolean t() {
        String str;
        WebSocketReader webSocketReader;
        WebSocketWriter webSocketWriter;
        int i4;
        Streams streams;
        synchronized (this) {
            try {
                if (this.f43196t) {
                    return false;
                }
                WebSocketWriter webSocketWriter2 = this.f43186j;
                Object poll = this.f43190n.poll();
                final boolean z4 = true;
                Object obj = null;
                if (poll == null) {
                    Object poll2 = this.f43191o.poll();
                    if (poll2 instanceof Close) {
                        i4 = this.f43194r;
                        str = this.f43195s;
                        if (i4 != -1) {
                            streams = this.f43189m;
                            this.f43189m = null;
                            webSocketReader = this.f43185i;
                            this.f43185i = null;
                            webSocketWriter = this.f43186j;
                            this.f43186j = null;
                            this.f43187k.n();
                        } else {
                            long a4 = ((Close) poll2).a();
                            TaskQueue taskQueue = this.f43187k;
                            final String str2 = this.f43188l + " cancel";
                            taskQueue.i(new Task(str2, z4) { // from class: okhttp3.internal.ws.RealWebSocket$writeOneFrame$lambda$8$$inlined$execute$default$1
                                @Override // okhttp3.internal.concurrent.Task
                                public long f() {
                                    this.j();
                                    return -1L;
                                }
                            }, TimeUnit.MILLISECONDS.toNanos(a4));
                            streams = null;
                            webSocketReader = null;
                            webSocketWriter = null;
                        }
                    } else {
                        if (poll2 == null) {
                            return false;
                        }
                        str = null;
                        webSocketReader = null;
                        webSocketWriter = null;
                        i4 = -1;
                        streams = null;
                    }
                    obj = poll2;
                } else {
                    str = null;
                    webSocketReader = null;
                    webSocketWriter = null;
                    i4 = -1;
                    streams = null;
                }
                Unit unit = Unit.f41027a;
                try {
                    if (poll != null) {
                        Intrinsics.checkNotNull(webSocketWriter2);
                        webSocketWriter2.f((h) poll);
                    } else if (obj instanceof Message) {
                        Message message = (Message) obj;
                        Intrinsics.checkNotNull(webSocketWriter2);
                        webSocketWriter2.c(message.b(), message.a());
                        synchronized (this) {
                            this.f43192p -= message.a().v();
                        }
                    } else {
                        if (!(obj instanceof Close)) {
                            throw new AssertionError();
                        }
                        Close close = (Close) obj;
                        Intrinsics.checkNotNull(webSocketWriter2);
                        webSocketWriter2.a(close.b(), close.c());
                        if (streams != null) {
                            WebSocketListener webSocketListener = this.f43177a;
                            Intrinsics.checkNotNull(str);
                            webSocketListener.a(this, i4, str);
                        }
                    }
                    return true;
                } finally {
                    if (streams != null) {
                        Util.l(streams);
                    }
                    if (webSocketReader != null) {
                        Util.l(webSocketReader);
                    }
                    if (webSocketWriter != null) {
                        Util.l(webSocketWriter);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void u() {
        synchronized (this) {
            try {
                if (this.f43196t) {
                    return;
                }
                WebSocketWriter webSocketWriter = this.f43186j;
                if (webSocketWriter == null) {
                    return;
                }
                int i4 = this.f43200x ? this.f43197u : -1;
                this.f43197u++;
                this.f43200x = true;
                Unit unit = Unit.f41027a;
                if (i4 == -1) {
                    try {
                        webSocketWriter.e(h.f43271f);
                        return;
                    } catch (IOException e4) {
                        n(e4, null);
                        return;
                    }
                }
                n(new SocketTimeoutException("sent ping but didn't receive pong within " + this.f43179c + "ms (after " + (i4 - 1) + " successful ping/pongs)"), null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
