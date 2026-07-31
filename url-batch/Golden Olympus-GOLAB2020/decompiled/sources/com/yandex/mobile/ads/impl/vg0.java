package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.rf0;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.KotlinVersion;
import kotlin.jvm.internal.Intrinsics;
import okio.C3372e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class vg0 implements Closeable, AutoCloseable {

    /* renamed from: g, reason: collision with root package name */
    private static final Logger f33612g = Logger.getLogger(mg0.class.getName());

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final okio.f f33613a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f33614b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C3372e f33615c;

    /* renamed from: d, reason: collision with root package name */
    private int f33616d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f33617e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final rf0.b f33618f;

    public vg0(@NotNull okio.f sink, boolean z4) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.f33613a = sink;
        this.f33614b = z4;
        C3372e c3372e = new C3372e();
        this.f33615c = c3372e;
        this.f33616d = 16384;
        this.f33618f = new rf0.b(c3372e);
    }

    public final synchronized void a(@NotNull ox1 peerSettings) {
        try {
            Intrinsics.checkNotNullParameter(peerSettings, "peerSettings");
            if (this.f33617e) {
                throw new IOException("closed");
            }
            this.f33616d = peerSettings.b(this.f33616d);
            if (peerSettings.a() != -1) {
                this.f33618f.b(peerSettings.a());
            }
            a(0, 0, 4, 1);
            this.f33613a.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final int b() {
        return this.f33616d;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f33617e = true;
        this.f33613a.close();
    }

    public final synchronized void flush() {
        if (this.f33617e) {
            throw new IOException("closed");
        }
        this.f33613a.flush();
    }

    public final synchronized void b(@NotNull ox1 settings) {
        try {
            Intrinsics.checkNotNullParameter(settings, "settings");
            if (this.f33617e) {
                throw new IOException("closed");
            }
            int i4 = 0;
            a(0, settings.d() * 6, 4, 0);
            while (i4 < 10) {
                if (settings.c(i4)) {
                    this.f33613a.s(i4 != 4 ? i4 != 7 ? i4 : 4 : 3);
                    this.f33613a.t(settings.a(i4));
                }
                i4++;
            }
            this.f33613a.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void a() {
        try {
            if (!this.f33617e) {
                if (this.f33614b) {
                    Logger logger = f33612g;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(v82.a(">> CONNECTION " + mg0.f29050b.l(), new Object[0]));
                    }
                    this.f33613a.M(mg0.f29050b);
                    this.f33613a.flush();
                    return;
                }
                return;
            }
            throw new IOException("closed");
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void a(boolean z4, int i4, @Nullable C3372e c3372e, int i5) {
        if (!this.f33617e) {
            a(i4, i5, 0, z4 ? 1 : 0);
            if (i5 > 0) {
                okio.f fVar = this.f33613a;
                Intrinsics.checkNotNull(c3372e);
                fVar.write(c3372e, i5);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void a(int i4, @NotNull i50 errorCode, @NotNull byte[] debugData) {
        try {
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            Intrinsics.checkNotNullParameter(debugData, "debugData");
            if (!this.f33617e) {
                if (errorCode.a() != -1) {
                    a(0, debugData.length + 8, 7, 0);
                    this.f33613a.t(i4);
                    this.f33613a.t(errorCode.a());
                    if (!(debugData.length == 0)) {
                        this.f33613a.L(debugData);
                    }
                    this.f33613a.flush();
                } else {
                    throw new IllegalArgumentException("errorCode.httpCode == -1");
                }
            } else {
                throw new IOException("closed");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void a(int i4, @NotNull ArrayList headerBlock, boolean z4) {
        Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
        if (!this.f33617e) {
            this.f33618f.a(headerBlock);
            long l02 = this.f33615c.l0();
            long min = Math.min(this.f33616d, l02);
            int i5 = l02 == min ? 4 : 0;
            if (z4) {
                i5 |= 1;
            }
            a(i4, (int) min, 1, i5);
            this.f33613a.write(this.f33615c, min);
            if (l02 > min) {
                long j4 = l02 - min;
                while (j4 > 0) {
                    long min2 = Math.min(this.f33616d, j4);
                    j4 -= min2;
                    a(i4, (int) min2, 9, j4 == 0 ? 4 : 0);
                    this.f33613a.write(this.f33615c, min2);
                }
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void a(int i4, int i5, boolean z4) {
        if (!this.f33617e) {
            a(0, 8, 6, z4 ? 1 : 0);
            this.f33613a.t(i4);
            this.f33613a.t(i5);
            this.f33613a.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void a(int i4, @NotNull i50 errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        if (!this.f33617e) {
            if (errorCode.a() != -1) {
                a(i4, 4, 3, 0);
                this.f33613a.t(errorCode.a());
                this.f33613a.flush();
            } else {
                throw new IllegalArgumentException("Failed requirement.");
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void a(int i4, long j4) {
        if (this.f33617e) {
            throw new IOException("closed");
        }
        if (j4 != 0 && j4 <= 2147483647L) {
            a(i4, 4, 8, 0);
            this.f33613a.t((int) j4);
            this.f33613a.flush();
        } else {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j4).toString());
        }
    }

    public final void a(int i4, int i5, int i6, int i7) {
        Logger logger = f33612g;
        if (logger.isLoggable(Level.FINE)) {
            mg0.f29049a.getClass();
            logger.fine(mg0.a(false, i4, i5, i6, i7));
        }
        int i8 = this.f33616d;
        if (i5 > i8) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + i8 + ": " + i5).toString());
        }
        if ((Integer.MIN_VALUE & i4) == 0) {
            v82.a(this.f33613a, i5);
            this.f33613a.w(i6 & KotlinVersion.MAX_COMPONENT_VALUE);
            this.f33613a.w(i7 & KotlinVersion.MAX_COMPONENT_VALUE);
            this.f33613a.t(i4 & Integer.MAX_VALUE);
            return;
        }
        throw new IllegalArgumentException(("reserved bit set: " + i4).toString());
    }
}
