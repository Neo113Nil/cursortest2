package okhttp3;

import android.support.v4.media.session.PlaybackStateCompat;
import cn.hutool.core.text.l;
import com.baidu.mapapi.http.HttpClient;
import java.io.Closeable;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import okhttp3.internal.http1.HeadersReader;
import okio.ByteString;
import okio.c;
import okio.e;
import okio.j0;
import okio.m0;
import okio.x0;
import okio.y0;

/* loaded from: classes5.dex */
public final class MultipartReader implements Closeable {
    public static final Companion Companion = new Companion(null);
    private static final m0 afterBoundaryOptions;
    private final String boundary;
    private boolean closed;
    private final ByteString crlfDashDashBoundary;
    private PartSource currentPart;
    private final ByteString dashDashBoundary;
    private boolean noMoreParts;
    private int partCount;
    private final e source;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        public final m0 getAfterBoundaryOptions() {
            return MultipartReader.afterBoundaryOptions;
        }
    }

    public static final class Part implements Closeable {
        private final e body;
        private final Headers headers;

        public Part(Headers headers, e body) {
            s.checkNotNullParameter(headers, "headers");
            s.checkNotNullParameter(body, "body");
            this.headers = headers;
            this.body = body;
        }

        public final e body() {
            return this.body;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.body.close();
        }

        public final Headers headers() {
            return this.headers;
        }
    }

    private final class PartSource implements x0 {
        final /* synthetic */ MultipartReader this$0;
        private final y0 timeout;

        public PartSource(MultipartReader this$0) {
            s.checkNotNullParameter(this$0, "this$0");
            this.this$0 = this$0;
            this.timeout = new y0();
        }

        @Override // okio.x0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (s.areEqual(this.this$0.currentPart, this)) {
                this.this$0.currentPart = null;
            }
        }

        @Override // okio.x0
        public long read(c sink, long j8) {
            s.checkNotNullParameter(sink, "sink");
            if (j8 < 0) {
                throw new IllegalArgumentException(s.stringPlus("byteCount < 0: ", Long.valueOf(j8)).toString());
            }
            if (!s.areEqual(this.this$0.currentPart, this)) {
                throw new IllegalStateException("closed".toString());
            }
            y0 timeout = this.this$0.source.timeout();
            y0 y0Var = this.timeout;
            MultipartReader multipartReader = this.this$0;
            long timeoutNanos = timeout.timeoutNanos();
            long minTimeout = y0.Companion.minTimeout(y0Var.timeoutNanos(), timeout.timeoutNanos());
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            timeout.timeout(minTimeout, timeUnit);
            if (!timeout.hasDeadline()) {
                if (y0Var.hasDeadline()) {
                    timeout.deadlineNanoTime(y0Var.deadlineNanoTime());
                }
                try {
                    long currentPartBytesRemaining = multipartReader.currentPartBytesRemaining(j8);
                    long read = currentPartBytesRemaining == 0 ? -1L : multipartReader.source.read(sink, currentPartBytesRemaining);
                    timeout.timeout(timeoutNanos, timeUnit);
                    if (y0Var.hasDeadline()) {
                        timeout.clearDeadline();
                    }
                    return read;
                } catch (Throwable th) {
                    timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                    if (y0Var.hasDeadline()) {
                        timeout.clearDeadline();
                    }
                    throw th;
                }
            }
            long deadlineNanoTime = timeout.deadlineNanoTime();
            if (y0Var.hasDeadline()) {
                timeout.deadlineNanoTime(Math.min(timeout.deadlineNanoTime(), y0Var.deadlineNanoTime()));
            }
            try {
                long currentPartBytesRemaining2 = multipartReader.currentPartBytesRemaining(j8);
                long read2 = currentPartBytesRemaining2 == 0 ? -1L : multipartReader.source.read(sink, currentPartBytesRemaining2);
                timeout.timeout(timeoutNanos, timeUnit);
                if (y0Var.hasDeadline()) {
                    timeout.deadlineNanoTime(deadlineNanoTime);
                }
                return read2;
            } catch (Throwable th2) {
                timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                if (y0Var.hasDeadline()) {
                    timeout.deadlineNanoTime(deadlineNanoTime);
                }
                throw th2;
            }
        }

        @Override // okio.x0
        public y0 timeout() {
            return this.timeout;
        }
    }

    static {
        m0.a aVar = m0.Companion;
        ByteString.a aVar2 = ByteString.Companion;
        afterBoundaryOptions = aVar.of(aVar2.encodeUtf8("\r\n"), aVar2.encodeUtf8(HttpClient.ENDFLAG), aVar2.encodeUtf8(l.SPACE), aVar2.encodeUtf8("\t"));
    }

    public MultipartReader(e source, String boundary) {
        s.checkNotNullParameter(source, "source");
        s.checkNotNullParameter(boundary, "boundary");
        this.source = source;
        this.boundary = boundary;
        this.dashDashBoundary = new c().writeUtf8(HttpClient.ENDFLAG).writeUtf8(boundary).readByteString();
        this.crlfDashDashBoundary = new c().writeUtf8("\r\n--").writeUtf8(boundary).readByteString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long currentPartBytesRemaining(long j8) {
        this.source.require(this.crlfDashDashBoundary.size());
        long indexOf = this.source.getBuffer().indexOf(this.crlfDashDashBoundary);
        return indexOf == -1 ? Math.min(j8, (this.source.getBuffer().size() - this.crlfDashDashBoundary.size()) + 1) : Math.min(j8, indexOf);
    }

    public final String boundary() {
        return this.boundary;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.closed) {
            return;
        }
        this.closed = true;
        this.currentPart = null;
        this.source.close();
    }

    public final Part nextPart() {
        if (!(!this.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        if (this.noMoreParts) {
            return null;
        }
        if (this.partCount == 0 && this.source.rangeEquals(0L, this.dashDashBoundary)) {
            this.source.skip(this.dashDashBoundary.size());
        } else {
            while (true) {
                long currentPartBytesRemaining = currentPartBytesRemaining(PlaybackStateCompat.ACTION_PLAY_FROM_URI);
                if (currentPartBytesRemaining == 0) {
                    break;
                }
                this.source.skip(currentPartBytesRemaining);
            }
            this.source.skip(this.crlfDashDashBoundary.size());
        }
        boolean z7 = false;
        while (true) {
            int select = this.source.select(afterBoundaryOptions);
            if (select == -1) {
                throw new ProtocolException("unexpected characters after boundary");
            }
            if (select == 0) {
                this.partCount++;
                Headers readHeaders = new HeadersReader(this.source).readHeaders();
                PartSource partSource = new PartSource(this);
                this.currentPart = partSource;
                return new Part(readHeaders, j0.buffer(partSource));
            }
            if (select == 1) {
                if (z7) {
                    throw new ProtocolException("unexpected characters after boundary");
                }
                if (this.partCount == 0) {
                    throw new ProtocolException("expected at least 1 part");
                }
                this.noMoreParts = true;
                return null;
            }
            if (select == 2 || select == 3) {
                z7 = true;
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MultipartReader(ResponseBody response) {
        this(r0, r3);
        s.checkNotNullParameter(response, "response");
        e source = response.source();
        MediaType contentType = response.contentType();
        String parameter = contentType == null ? null : contentType.parameter("boundary");
        if (parameter != null) {
            return;
        }
        throw new ProtocolException("expected the Content-Type to have a boundary parameter");
    }
}
