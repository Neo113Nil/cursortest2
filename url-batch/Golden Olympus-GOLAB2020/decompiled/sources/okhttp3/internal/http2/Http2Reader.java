package okhttp3.internal.http2;

import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.d;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Hpack;
import okio.B;
import okio.C;
import okio.C3372e;
import okio.g;
import okio.h;

@Metadata
/* loaded from: classes3.dex */
public final class Http2Reader implements Closeable, AutoCloseable {

    /* renamed from: f, reason: collision with root package name */
    public static final Companion f43025f = new Companion(null);

    /* renamed from: g, reason: collision with root package name */
    private static final Logger f43026g;

    /* renamed from: b, reason: collision with root package name */
    private final g f43027b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f43028c;

    /* renamed from: d, reason: collision with root package name */
    private final ContinuationSource f43029d;

    /* renamed from: e, reason: collision with root package name */
    private final Hpack.Reader f43030e;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Logger a() {
            return Http2Reader.f43026g;
        }

        public final int b(int i4, int i5, int i6) {
            if ((i5 & 8) != 0) {
                i4--;
            }
            if (i6 <= i4) {
                return i4 - i6;
            }
            throw new IOException("PROTOCOL_ERROR padding " + i6 + " > remaining length " + i4);
        }

        private Companion() {
        }
    }

    @Metadata
    public static final class ContinuationSource implements B {

        /* renamed from: b, reason: collision with root package name */
        private final g f43031b;

        /* renamed from: c, reason: collision with root package name */
        private int f43032c;

        /* renamed from: d, reason: collision with root package name */
        private int f43033d;

        /* renamed from: e, reason: collision with root package name */
        private int f43034e;

        /* renamed from: f, reason: collision with root package name */
        private int f43035f;

        /* renamed from: g, reason: collision with root package name */
        private int f43036g;

        public ContinuationSource(g source) {
            Intrinsics.checkNotNullParameter(source, "source");
            this.f43031b = source;
        }

        private final void n() {
            int i4 = this.f43034e;
            int J3 = Util.J(this.f43031b);
            this.f43035f = J3;
            this.f43032c = J3;
            int d4 = Util.d(this.f43031b.readByte(), KotlinVersion.MAX_COMPONENT_VALUE);
            this.f43033d = Util.d(this.f43031b.readByte(), KotlinVersion.MAX_COMPONENT_VALUE);
            Companion companion = Http2Reader.f43025f;
            if (companion.a().isLoggable(Level.FINE)) {
                companion.a().fine(Http2.f42934a.c(true, this.f43034e, this.f43032c, d4, this.f43033d));
            }
            int readInt = this.f43031b.readInt() & Integer.MAX_VALUE;
            this.f43034e = readInt;
            if (d4 == 9) {
                if (readInt != i4) {
                    throw new IOException("TYPE_CONTINUATION streamId changed");
                }
            } else {
                throw new IOException(d4 + " != TYPE_CONTINUATION");
            }
        }

        public final void J(int i4) {
            this.f43032c = i4;
        }

        public final void N(int i4) {
            this.f43036g = i4;
        }

        public final void Q(int i4) {
            this.f43034e = i4;
        }

        @Override // okio.B, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        public final int m() {
            return this.f43035f;
        }

        public final void o(int i4) {
            this.f43033d = i4;
        }

        public final void p(int i4) {
            this.f43035f = i4;
        }

        @Override // okio.B
        public long read(C3372e sink, long j4) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            while (true) {
                int i4 = this.f43035f;
                if (i4 != 0) {
                    long read = this.f43031b.read(sink, Math.min(j4, i4));
                    if (read == -1) {
                        return -1L;
                    }
                    this.f43035f -= (int) read;
                    return read;
                }
                this.f43031b.H(this.f43036g);
                this.f43036g = 0;
                if ((this.f43033d & 4) != 0) {
                    return -1L;
                }
                n();
            }
        }

        @Override // okio.B
        public C timeout() {
            return this.f43031b.timeout();
        }
    }

    @Metadata
    public interface Handler {
        void a();

        void b(boolean z4, Settings settings);

        void c(boolean z4, int i4, int i5, List list);

        void d(int i4, long j4);

        void e(boolean z4, int i4, g gVar, int i5);

        void f(boolean z4, int i4, int i5);

        void g(int i4, int i5, int i6, boolean z4);

        void h(int i4, ErrorCode errorCode);

        void i(int i4, int i5, List list);

        void j(int i4, ErrorCode errorCode, h hVar);
    }

    static {
        Logger logger = Logger.getLogger(Http2.class.getName());
        Intrinsics.checkNotNullExpressionValue(logger, "getLogger(Http2::class.java.name)");
        f43026g = logger;
    }

    public Http2Reader(g source, boolean z4) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f43027b = source;
        this.f43028c = z4;
        ContinuationSource continuationSource = new ContinuationSource(source);
        this.f43029d = continuationSource;
        this.f43030e = new Hpack.Reader(continuationSource, Base64Utils.IO_BUFFER_SIZE, 0, 4, null);
    }

    private final void J(Handler handler, int i4, int i5, int i6) {
        if (i4 < 8) {
            throw new IOException("TYPE_GOAWAY length < 8: " + i4);
        }
        if (i6 != 0) {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
        int readInt = this.f43027b.readInt();
        int readInt2 = this.f43027b.readInt();
        int i7 = i4 - 8;
        ErrorCode a4 = ErrorCode.f42886c.a(readInt2);
        if (a4 == null) {
            throw new IOException("TYPE_GOAWAY unexpected error code: " + readInt2);
        }
        h hVar = h.f43271f;
        if (i7 > 0) {
            hVar = this.f43027b.d(i7);
        }
        handler.j(readInt, a4, hVar);
    }

    private final List N(int i4, int i5, int i6, int i7) {
        this.f43029d.p(i4);
        ContinuationSource continuationSource = this.f43029d;
        continuationSource.J(continuationSource.m());
        this.f43029d.N(i5);
        this.f43029d.o(i6);
        this.f43029d.Q(i7);
        this.f43030e.k();
        return this.f43030e.e();
    }

    private final void Q(Handler handler, int i4, int i5, int i6) {
        if (i6 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        boolean z4 = (i5 & 1) != 0;
        int d4 = (i5 & 8) != 0 ? Util.d(this.f43027b.readByte(), KotlinVersion.MAX_COMPONENT_VALUE) : 0;
        if ((i5 & 32) != 0) {
            V(handler, i6);
            i4 -= 5;
        }
        handler.c(z4, i6, -1, N(f43025f.b(i4, i5, d4), d4, i5, i6));
    }

    private final void U(Handler handler, int i4, int i5, int i6) {
        if (i4 != 8) {
            throw new IOException("TYPE_PING length != 8: " + i4);
        }
        if (i6 != 0) {
            throw new IOException("TYPE_PING streamId != 0");
        }
        handler.f((i5 & 1) != 0, this.f43027b.readInt(), this.f43027b.readInt());
    }

    private final void V(Handler handler, int i4) {
        int readInt = this.f43027b.readInt();
        handler.g(i4, readInt & Integer.MAX_VALUE, Util.d(this.f43027b.readByte(), KotlinVersion.MAX_COMPONENT_VALUE) + 1, (Integer.MIN_VALUE & readInt) != 0);
    }

    private final void W(Handler handler, int i4, int i5, int i6) {
        if (i4 == 5) {
            if (i6 == 0) {
                throw new IOException("TYPE_PRIORITY streamId == 0");
            }
            V(handler, i6);
        } else {
            throw new IOException("TYPE_PRIORITY length: " + i4 + " != 5");
        }
    }

    private final void X(Handler handler, int i4, int i5, int i6) {
        if (i6 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        int d4 = (i5 & 8) != 0 ? Util.d(this.f43027b.readByte(), KotlinVersion.MAX_COMPONENT_VALUE) : 0;
        handler.i(i6, this.f43027b.readInt() & Integer.MAX_VALUE, N(f43025f.b(i4 - 4, i5, d4), d4, i5, i6));
    }

    private final void Y(Handler handler, int i4, int i5, int i6) {
        if (i4 != 4) {
            throw new IOException("TYPE_RST_STREAM length: " + i4 + " != 4");
        }
        if (i6 == 0) {
            throw new IOException("TYPE_RST_STREAM streamId == 0");
        }
        int readInt = this.f43027b.readInt();
        ErrorCode a4 = ErrorCode.f42886c.a(readInt);
        if (a4 != null) {
            handler.h(i6, a4);
            return;
        }
        throw new IOException("TYPE_RST_STREAM unexpected error code: " + readInt);
    }

    private final void Z(Handler handler, int i4, int i5, int i6) {
        int readInt;
        if (i6 != 0) {
            throw new IOException("TYPE_SETTINGS streamId != 0");
        }
        if ((i5 & 1) != 0) {
            if (i4 != 0) {
                throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
            }
            handler.a();
            return;
        }
        if (i4 % 6 != 0) {
            throw new IOException("TYPE_SETTINGS length % 6 != 0: " + i4);
        }
        Settings settings = new Settings();
        d o4 = kotlin.ranges.g.o(kotlin.ranges.g.p(0, i4), 6);
        int b4 = o4.b();
        int d4 = o4.d();
        int e4 = o4.e();
        if ((e4 > 0 && b4 <= d4) || (e4 < 0 && d4 <= b4)) {
            while (true) {
                int e5 = Util.e(this.f43027b.readShort(), 65535);
                readInt = this.f43027b.readInt();
                if (e5 != 2) {
                    if (e5 == 3) {
                        e5 = 4;
                    } else if (e5 != 4) {
                        if (e5 == 5 && (readInt < 16384 || readInt > 16777215)) {
                            break;
                        }
                    } else {
                        if (readInt < 0) {
                            throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                        }
                        e5 = 7;
                    }
                } else if (readInt != 0 && readInt != 1) {
                    throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                }
                settings.h(e5, readInt);
                if (b4 == d4) {
                    break;
                } else {
                    b4 += e4;
                }
            }
            throw new IOException("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: " + readInt);
        }
        handler.b(false, settings);
    }

    private final void a0(Handler handler, int i4, int i5, int i6) {
        if (i4 != 4) {
            throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + i4);
        }
        long f4 = Util.f(this.f43027b.readInt(), 2147483647L);
        if (f4 == 0) {
            throw new IOException("windowSizeIncrement was 0");
        }
        handler.d(i6, f4);
    }

    private final void p(Handler handler, int i4, int i5, int i6) {
        if (i6 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        boolean z4 = (i5 & 1) != 0;
        if ((i5 & 32) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        int d4 = (i5 & 8) != 0 ? Util.d(this.f43027b.readByte(), KotlinVersion.MAX_COMPONENT_VALUE) : 0;
        handler.e(z4, i6, this.f43027b, f43025f.b(i4, i5, d4));
        this.f43027b.H(d4);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f43027b.close();
    }

    public final boolean n(boolean z4, Handler handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        try {
            this.f43027b.O(9L);
            int J3 = Util.J(this.f43027b);
            if (J3 > 16384) {
                throw new IOException("FRAME_SIZE_ERROR: " + J3);
            }
            int d4 = Util.d(this.f43027b.readByte(), KotlinVersion.MAX_COMPONENT_VALUE);
            int d5 = Util.d(this.f43027b.readByte(), KotlinVersion.MAX_COMPONENT_VALUE);
            int readInt = this.f43027b.readInt() & Integer.MAX_VALUE;
            Logger logger = f43026g;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(Http2.f42934a.c(true, readInt, J3, d4, d5));
            }
            if (z4 && d4 != 4) {
                throw new IOException("Expected a SETTINGS frame but was " + Http2.f42934a.b(d4));
            }
            switch (d4) {
                case 0:
                    p(handler, J3, d5, readInt);
                    return true;
                case 1:
                    Q(handler, J3, d5, readInt);
                    return true;
                case 2:
                    W(handler, J3, d5, readInt);
                    return true;
                case 3:
                    Y(handler, J3, d5, readInt);
                    return true;
                case 4:
                    Z(handler, J3, d5, readInt);
                    return true;
                case 5:
                    X(handler, J3, d5, readInt);
                    return true;
                case 6:
                    U(handler, J3, d5, readInt);
                    return true;
                case 7:
                    J(handler, J3, d5, readInt);
                    return true;
                case 8:
                    a0(handler, J3, d5, readInt);
                    return true;
                default:
                    this.f43027b.H(J3);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    public final void o(Handler handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        if (this.f43028c) {
            if (!n(true, handler)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        g gVar = this.f43027b;
        h hVar = Http2.f42935b;
        h d4 = gVar.d(hVar.v());
        Logger logger = f43026g;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(Util.s("<< CONNECTION " + d4.l(), new Object[0]));
        }
        if (Intrinsics.areEqual(hVar, d4)) {
            return;
        }
        throw new IOException("Expected a connection header but was " + d4.y());
    }
}
