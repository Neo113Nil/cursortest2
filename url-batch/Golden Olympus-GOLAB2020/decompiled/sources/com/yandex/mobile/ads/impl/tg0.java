package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.i50;
import com.yandex.mobile.ads.impl.rf0;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.Intrinsics;
import okio.C3372e;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class tg0 implements Closeable, AutoCloseable {

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private static final Logger f32422e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f32423f = 0;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final okio.g f32424a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f32425b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final b f32426c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final rf0.a f32427d;

    public static final class a {
        public static int a(int i4, int i5, int i6) {
            if ((i5 & 8) != 0) {
                i4--;
            }
            if (i6 <= i4) {
                return i4 - i6;
            }
            throw new IOException("PROTOCOL_ERROR padding " + i6 + " > remaining length " + i4);
        }

        @NotNull
        public static Logger a() {
            return tg0.f32422e;
        }
    }

    public static final class b implements okio.B {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final okio.g f32428a;

        /* renamed from: b, reason: collision with root package name */
        private int f32429b;

        /* renamed from: c, reason: collision with root package name */
        private int f32430c;

        /* renamed from: d, reason: collision with root package name */
        private int f32431d;

        /* renamed from: e, reason: collision with root package name */
        private int f32432e;

        /* renamed from: f, reason: collision with root package name */
        private int f32433f;

        public b(@NotNull okio.g source) {
            Intrinsics.checkNotNullParameter(source, "source");
            this.f32428a = source;
        }

        private final void b() {
            int i4 = this.f32431d;
            int a4 = v82.a(this.f32428a);
            this.f32432e = a4;
            this.f32429b = a4;
            int a5 = v82.a(this.f32428a.readByte());
            this.f32430c = v82.a(this.f32428a.readByte());
            int i5 = tg0.f32423f;
            if (a.a().isLoggable(Level.FINE)) {
                Logger a6 = a.a();
                mg0 mg0Var = mg0.f29049a;
                int i6 = this.f32431d;
                int i7 = this.f32429b;
                int i8 = this.f32430c;
                mg0Var.getClass();
                a6.fine(mg0.a(true, i6, i7, a5, i8));
            }
            int readInt = this.f32428a.readInt() & Integer.MAX_VALUE;
            this.f32431d = readInt;
            if (a5 == 9) {
                if (readInt != i4) {
                    throw new IOException("TYPE_CONTINUATION streamId changed");
                }
            } else {
                throw new IOException(a5 + " != TYPE_CONTINUATION");
            }
        }

        public final int a() {
            return this.f32432e;
        }

        public final void c(int i4) {
            this.f32429b = i4;
        }

        @Override // okio.B, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        public final void d(int i4) {
            this.f32433f = i4;
        }

        public final void e(int i4) {
            this.f32431d = i4;
        }

        @Override // okio.B
        public final long read(@NotNull C3372e sink, long j4) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            while (true) {
                int i4 = this.f32432e;
                if (i4 != 0) {
                    long read = this.f32428a.read(sink, Math.min(j4, i4));
                    if (read == -1) {
                        return -1L;
                    }
                    this.f32432e -= (int) read;
                    return read;
                }
                this.f32428a.H(this.f32433f);
                this.f32433f = 0;
                if ((this.f32430c & 4) != 0) {
                    return -1L;
                }
                b();
            }
        }

        @Override // okio.B
        @NotNull
        public final okio.C timeout() {
            return this.f32428a.timeout();
        }

        public final void a(int i4) {
            this.f32430c = i4;
        }

        public final void b(int i4) {
            this.f32432e = i4;
        }
    }

    public interface c {
        void a(int i4, int i5, @NotNull okio.g gVar, boolean z4);

        void a(int i4, int i5, boolean z4);

        void a(int i4, long j4);

        void a(int i4, @NotNull i50 i50Var);

        void a(int i4, @NotNull i50 i50Var, @NotNull okio.h hVar);

        void a(int i4, @NotNull List list);

        void a(@NotNull ox1 ox1Var);

        void a(boolean z4, int i4, @NotNull List list);
    }

    static {
        Logger logger = Logger.getLogger(mg0.class.getName());
        Intrinsics.checkNotNullExpressionValue(logger, "getLogger(...)");
        f32422e = logger;
    }

    public tg0(@NotNull okio.g source, boolean z4) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f32424a = source;
        this.f32425b = z4;
        b bVar = new b(source);
        this.f32426c = bVar;
        this.f32427d = new rf0.a(bVar);
    }

    private final void b(c cVar, int i4, int i5) {
        if (i4 != 5) {
            throw new IOException("TYPE_PRIORITY length: " + i4 + " != 5");
        }
        if (i5 == 0) {
            throw new IOException("TYPE_PRIORITY streamId == 0");
        }
        this.f32424a.readInt();
        this.f32424a.readByte();
        byte[] bArr = v82.f33550a;
        cVar.getClass();
    }

    private final void c(c cVar, int i4, int i5) {
        if (i4 != 4) {
            throw new IOException("TYPE_RST_STREAM length: " + i4 + " != 4");
        }
        if (i5 == 0) {
            throw new IOException("TYPE_RST_STREAM streamId == 0");
        }
        int readInt = this.f32424a.readInt();
        i50.f27089c.getClass();
        i50 a4 = i50.a.a(readInt);
        if (a4 != null) {
            cVar.a(i5, a4);
            return;
        }
        throw new IOException("TYPE_RST_STREAM unexpected error code: " + readInt);
    }

    private final void d(c cVar, int i4, int i5) {
        if (i4 != 4) {
            throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + i4);
        }
        long a4 = v82.a(this.f32424a.readInt());
        if (a4 == 0) {
            throw new IOException("windowSizeIncrement was 0");
        }
        cVar.a(i5, a4);
    }

    public final boolean a(boolean z4, @NotNull c handler) {
        int readByte;
        Intrinsics.checkNotNullParameter(handler, "handler");
        try {
            this.f32424a.O(9L);
            int a4 = v82.a(this.f32424a);
            if (a4 > 16384) {
                throw new IOException("FRAME_SIZE_ERROR: " + a4);
            }
            int a5 = v82.a(this.f32424a.readByte());
            int a6 = v82.a(this.f32424a.readByte());
            int readInt = this.f32424a.readInt() & Integer.MAX_VALUE;
            Logger logger = f32422e;
            if (logger.isLoggable(Level.FINE)) {
                mg0.f29049a.getClass();
                logger.fine(mg0.a(true, readInt, a4, a5, a6));
            }
            if (z4 && a5 != 4) {
                mg0.f29049a.getClass();
                throw new IOException("Expected a SETTINGS frame but was " + mg0.a(a5));
            }
            switch (a5) {
                case 0:
                    if (readInt == 0) {
                        throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
                    }
                    boolean z5 = (a6 & 1) != 0;
                    if ((a6 & 32) != 0) {
                        throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
                    }
                    readByte = (a6 & 8) != 0 ? this.f32424a.readByte() & 255 : 0;
                    handler.a(readInt, a.a(a4, a6, readByte), this.f32424a, z5);
                    this.f32424a.H(readByte);
                    return true;
                case 1:
                    if (readInt == 0) {
                        throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
                    }
                    boolean z6 = (a6 & 1) != 0;
                    readByte = (a6 & 8) != 0 ? this.f32424a.readByte() & 255 : 0;
                    if ((a6 & 32) != 0) {
                        this.f32424a.readInt();
                        this.f32424a.readByte();
                        handler.getClass();
                        a4 -= 5;
                    }
                    this.f32426c.b(a.a(a4, a6, readByte));
                    b bVar = this.f32426c;
                    bVar.c(bVar.a());
                    this.f32426c.d(readByte);
                    this.f32426c.a(a6);
                    this.f32426c.e(readInt);
                    this.f32427d.c();
                    handler.a(z6, readInt, this.f32427d.a());
                    return true;
                case 2:
                    b(handler, a4, readInt);
                    return true;
                case 3:
                    c(handler, a4, readInt);
                    return true;
                case 4:
                    b(handler, a4, a6, readInt);
                    return true;
                case 5:
                    if (readInt == 0) {
                        throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
                    }
                    readByte = (a6 & 8) != 0 ? this.f32424a.readByte() & 255 : 0;
                    int readInt2 = this.f32424a.readInt() & Integer.MAX_VALUE;
                    this.f32426c.b(a.a(a4 - 4, a6, readByte));
                    b bVar2 = this.f32426c;
                    bVar2.c(bVar2.a());
                    this.f32426c.d(readByte);
                    this.f32426c.a(a6);
                    this.f32426c.e(readInt);
                    this.f32427d.c();
                    handler.a(readInt2, this.f32427d.a());
                    return true;
                case 6:
                    a(handler, a4, a6, readInt);
                    return true;
                case 7:
                    a(handler, a4, readInt);
                    return true;
                case 8:
                    d(handler, a4, readInt);
                    return true;
                default:
                    this.f32424a.H(a4);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f32424a.close();
    }

    private final void b(c cVar, int i4, int i5, int i6) {
        int readInt;
        if (i6 != 0) {
            throw new IOException("TYPE_SETTINGS streamId != 0");
        }
        if ((i5 & 1) != 0) {
            if (i4 == 0) {
                cVar.getClass();
                return;
            }
            throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
        }
        if (i4 % 6 == 0) {
            ox1 ox1Var = new ox1();
            kotlin.ranges.d o4 = kotlin.ranges.g.o(kotlin.ranges.g.p(0, i4), 6);
            int b4 = o4.b();
            int d4 = o4.d();
            int e4 = o4.e();
            if ((e4 > 0 && b4 <= d4) || (e4 < 0 && d4 <= b4)) {
                while (true) {
                    int a4 = v82.a(this.f32424a.readShort());
                    readInt = this.f32424a.readInt();
                    if (a4 != 2) {
                        if (a4 == 3) {
                            a4 = 4;
                        } else if (a4 != 4) {
                            if (a4 == 5 && (readInt < 16384 || readInt > 16777215)) {
                                break;
                            }
                        } else {
                            if (readInt < 0) {
                                throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                            }
                            a4 = 7;
                        }
                    } else if (readInt != 0 && readInt != 1) {
                        throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                    }
                    ox1Var.a(a4, readInt);
                    if (b4 == d4) {
                        break;
                    } else {
                        b4 += e4;
                    }
                }
                throw new IOException("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: " + readInt);
            }
            cVar.a(ox1Var);
            return;
        }
        throw new IOException("TYPE_SETTINGS length % 6 != 0: " + i4);
    }

    public final void a(@NotNull c handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        if (this.f32425b) {
            if (!a(true, handler)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        okio.g gVar = this.f32424a;
        okio.h hVar = mg0.f29050b;
        okio.h d4 = gVar.d(hVar.v());
        Logger logger = f32422e;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(v82.a("<< CONNECTION " + d4.l(), new Object[0]));
        }
        if (Intrinsics.areEqual(hVar, d4)) {
            return;
        }
        throw new IOException("Expected a connection header but was " + d4.y());
    }

    private final void a(c cVar, int i4, int i5) {
        if (i4 < 8) {
            throw new IOException("TYPE_GOAWAY length < 8: " + i4);
        }
        if (i5 == 0) {
            int readInt = this.f32424a.readInt();
            int readInt2 = this.f32424a.readInt();
            int i6 = i4 - 8;
            i50.f27089c.getClass();
            i50 a4 = i50.a.a(readInt2);
            if (a4 != null) {
                okio.h hVar = okio.h.f43271f;
                if (i6 > 0) {
                    hVar = this.f32424a.d(i6);
                }
                cVar.a(readInt, a4, hVar);
                return;
            }
            throw new IOException("TYPE_GOAWAY unexpected error code: " + readInt2);
        }
        throw new IOException("TYPE_GOAWAY streamId != 0");
    }

    private final void a(c cVar, int i4, int i5, int i6) {
        if (i4 == 8) {
            if (i6 == 0) {
                cVar.a(this.f32424a.readInt(), this.f32424a.readInt(), (i5 & 1) != 0);
                return;
            }
            throw new IOException("TYPE_PING streamId != 0");
        }
        throw new IOException("TYPE_PING length != 8: " + i4);
    }
}
