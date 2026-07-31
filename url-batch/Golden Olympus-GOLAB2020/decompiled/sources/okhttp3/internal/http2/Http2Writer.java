package okhttp3.internal.http2;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Hpack;
import okio.C3372e;
import okio.f;

@Metadata
/* loaded from: classes3.dex */
public final class Http2Writer implements Closeable, AutoCloseable {

    /* renamed from: h, reason: collision with root package name */
    public static final Companion f43065h = new Companion(null);

    /* renamed from: i, reason: collision with root package name */
    private static final Logger f43066i = Logger.getLogger(Http2.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private final f f43067b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f43068c;

    /* renamed from: d, reason: collision with root package name */
    private final C3372e f43069d;

    /* renamed from: e, reason: collision with root package name */
    private int f43070e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f43071f;

    /* renamed from: g, reason: collision with root package name */
    private final Hpack.Writer f43072g;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public Http2Writer(f sink, boolean z4) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.f43067b = sink;
        this.f43068c = z4;
        C3372e c3372e = new C3372e();
        this.f43069d = c3372e;
        this.f43070e = 16384;
        this.f43072g = new Hpack.Writer(0, false, c3372e, 3, null);
    }

    private final void Z(int i4, long j4) {
        while (j4 > 0) {
            long min = Math.min(this.f43070e, j4);
            j4 -= min;
            p(i4, (int) min, 9, j4 == 0 ? 4 : 0);
            this.f43067b.write(this.f43069d, min);
        }
    }

    public final synchronized void J(int i4, ErrorCode errorCode, byte[] debugData) {
        try {
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            Intrinsics.checkNotNullParameter(debugData, "debugData");
            if (this.f43071f) {
                throw new IOException("closed");
            }
            if (errorCode.d() == -1) {
                throw new IllegalArgumentException("errorCode.httpCode == -1");
            }
            p(0, debugData.length + 8, 7, 0);
            this.f43067b.t(i4);
            this.f43067b.t(errorCode.d());
            if (!(debugData.length == 0)) {
                this.f43067b.L(debugData);
            }
            this.f43067b.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void N(boolean z4, int i4, List headerBlock) {
        Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
        if (this.f43071f) {
            throw new IOException("closed");
        }
        this.f43072g.g(headerBlock);
        long l02 = this.f43069d.l0();
        long min = Math.min(this.f43070e, l02);
        int i5 = l02 == min ? 4 : 0;
        if (z4) {
            i5 |= 1;
        }
        p(i4, (int) min, 1, i5);
        this.f43067b.write(this.f43069d, min);
        if (l02 > min) {
            Z(i4, l02 - min);
        }
    }

    public final int Q() {
        return this.f43070e;
    }

    public final synchronized void U(boolean z4, int i4, int i5) {
        if (this.f43071f) {
            throw new IOException("closed");
        }
        p(0, 8, 6, z4 ? 1 : 0);
        this.f43067b.t(i4);
        this.f43067b.t(i5);
        this.f43067b.flush();
    }

    public final synchronized void V(int i4, int i5, List requestHeaders) {
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        if (this.f43071f) {
            throw new IOException("closed");
        }
        this.f43072g.g(requestHeaders);
        long l02 = this.f43069d.l0();
        int min = (int) Math.min(this.f43070e - 4, l02);
        long j4 = min;
        p(i4, min + 4, 5, l02 == j4 ? 4 : 0);
        this.f43067b.t(i5 & Integer.MAX_VALUE);
        this.f43067b.write(this.f43069d, j4);
        if (l02 > j4) {
            Z(i4, l02 - j4);
        }
    }

    public final synchronized void W(int i4, ErrorCode errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        if (this.f43071f) {
            throw new IOException("closed");
        }
        if (errorCode.d() == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        p(i4, 4, 3, 0);
        this.f43067b.t(errorCode.d());
        this.f43067b.flush();
    }

    public final synchronized void X(Settings settings) {
        try {
            Intrinsics.checkNotNullParameter(settings, "settings");
            if (this.f43071f) {
                throw new IOException("closed");
            }
            int i4 = 0;
            p(0, settings.i() * 6, 4, 0);
            while (i4 < 10) {
                if (settings.f(i4)) {
                    this.f43067b.s(i4 != 4 ? i4 != 7 ? i4 : 4 : 3);
                    this.f43067b.t(settings.a(i4));
                }
                i4++;
            }
            this.f43067b.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void Y(int i4, long j4) {
        if (this.f43071f) {
            throw new IOException("closed");
        }
        if (j4 == 0 || j4 > 2147483647L) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j4).toString());
        }
        p(i4, 4, 8, 0);
        this.f43067b.t((int) j4);
        this.f43067b.flush();
    }

    public final synchronized void a(Settings peerSettings) {
        try {
            Intrinsics.checkNotNullParameter(peerSettings, "peerSettings");
            if (this.f43071f) {
                throw new IOException("closed");
            }
            this.f43070e = peerSettings.e(this.f43070e);
            if (peerSettings.b() != -1) {
                this.f43072g.e(peerSettings.b());
            }
            p(0, 0, 4, 1);
            this.f43067b.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f43071f = true;
        this.f43067b.close();
    }

    public final synchronized void flush() {
        if (this.f43071f) {
            throw new IOException("closed");
        }
        this.f43067b.flush();
    }

    public final synchronized void m() {
        try {
            if (this.f43071f) {
                throw new IOException("closed");
            }
            if (this.f43068c) {
                Logger logger = f43066i;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(Util.s(">> CONNECTION " + Http2.f42935b.l(), new Object[0]));
                }
                this.f43067b.M(Http2.f42935b);
                this.f43067b.flush();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void n(boolean z4, int i4, C3372e c3372e, int i5) {
        if (this.f43071f) {
            throw new IOException("closed");
        }
        o(i4, z4 ? 1 : 0, c3372e, i5);
    }

    public final void o(int i4, int i5, C3372e c3372e, int i6) {
        p(i4, i6, 0, i5);
        if (i6 > 0) {
            f fVar = this.f43067b;
            Intrinsics.checkNotNull(c3372e);
            fVar.write(c3372e, i6);
        }
    }

    public final void p(int i4, int i5, int i6, int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        Logger logger = f43066i;
        if (logger.isLoggable(Level.FINE)) {
            i8 = i4;
            i9 = i5;
            i10 = i6;
            i11 = i7;
            logger.fine(Http2.f42934a.c(false, i8, i9, i10, i11));
        } else {
            i8 = i4;
            i9 = i5;
            i10 = i6;
            i11 = i7;
        }
        if (i9 > this.f43070e) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f43070e + ": " + i9).toString());
        }
        if ((Integer.MIN_VALUE & i8) != 0) {
            throw new IllegalArgumentException(("reserved bit set: " + i8).toString());
        }
        Util.b0(this.f43067b, i9);
        this.f43067b.w(i10 & KotlinVersion.MAX_COMPONENT_VALUE);
        this.f43067b.w(i11 & KotlinVersion.MAX_COMPONENT_VALUE);
        this.f43067b.t(Integer.MAX_VALUE & i8);
    }
}
