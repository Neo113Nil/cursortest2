package okhttp3.internal.http2;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Hpack;
import okio.c;
import okio.d;

/* loaded from: classes5.dex */
public final class Http2Writer implements Closeable {
    public static final Companion Companion = new Companion(null);
    private static final Logger logger = Logger.getLogger(Http2.class.getName());
    private final boolean client;
    private boolean closed;
    private final c hpackBuffer;
    private final Hpack.Writer hpackWriter;
    private int maxFrameSize;
    private final d sink;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public Http2Writer(d sink, boolean z7) {
        s.checkNotNullParameter(sink, "sink");
        this.sink = sink;
        this.client = z7;
        c cVar = new c();
        this.hpackBuffer = cVar;
        this.maxFrameSize = 16384;
        this.hpackWriter = new Hpack.Writer(0, false, cVar, 3, null);
    }

    private final void writeContinuationFrames(int i8, long j8) {
        while (j8 > 0) {
            long min = Math.min(this.maxFrameSize, j8);
            j8 -= min;
            frameHeader(i8, (int) min, 9, j8 == 0 ? 4 : 0);
            this.sink.write(this.hpackBuffer, min);
        }
    }

    public final synchronized void applyAndAckSettings(Settings peerSettings) {
        try {
            s.checkNotNullParameter(peerSettings, "peerSettings");
            if (this.closed) {
                throw new IOException("closed");
            }
            this.maxFrameSize = peerSettings.getMaxFrameSize(this.maxFrameSize);
            if (peerSettings.getHeaderTableSize() != -1) {
                this.hpackWriter.resizeHeaderTable(peerSettings.getHeaderTableSize());
            }
            frameHeader(0, 0, 4, 1);
            this.sink.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.closed = true;
        this.sink.close();
    }

    public final synchronized void connectionPreface() {
        try {
            if (this.closed) {
                throw new IOException("closed");
            }
            if (this.client) {
                Logger logger2 = logger;
                if (logger2.isLoggable(Level.FINE)) {
                    logger2.fine(Util.format(s.stringPlus(">> CONNECTION ", Http2.CONNECTION_PREFACE.hex()), new Object[0]));
                }
                this.sink.write(Http2.CONNECTION_PREFACE);
                this.sink.flush();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void data(boolean z7, int i8, c cVar, int i9) {
        if (this.closed) {
            throw new IOException("closed");
        }
        dataFrame(i8, z7 ? 1 : 0, cVar, i9);
    }

    public final void dataFrame(int i8, int i9, c cVar, int i10) {
        frameHeader(i8, i10, 0, i9);
        if (i10 > 0) {
            d dVar = this.sink;
            s.checkNotNull(cVar);
            dVar.write(cVar, i10);
        }
    }

    public final synchronized void flush() {
        if (this.closed) {
            throw new IOException("closed");
        }
        this.sink.flush();
    }

    public final void frameHeader(int i8, int i9, int i10, int i11) {
        Logger logger2 = logger;
        if (logger2.isLoggable(Level.FINE)) {
            logger2.fine(Http2.INSTANCE.frameLog(false, i8, i9, i10, i11));
        }
        if (i9 > this.maxFrameSize) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.maxFrameSize + ": " + i9).toString());
        }
        if ((Integer.MIN_VALUE & i8) != 0) {
            throw new IllegalArgumentException(s.stringPlus("reserved bit set: ", Integer.valueOf(i8)).toString());
        }
        Util.writeMedium(this.sink, i9);
        this.sink.writeByte(i10 & 255);
        this.sink.writeByte(i11 & 255);
        this.sink.writeInt(i8 & Integer.MAX_VALUE);
    }

    public final Hpack.Writer getHpackWriter() {
        return this.hpackWriter;
    }

    public final synchronized void goAway(int i8, ErrorCode errorCode, byte[] debugData) {
        try {
            s.checkNotNullParameter(errorCode, "errorCode");
            s.checkNotNullParameter(debugData, "debugData");
            if (this.closed) {
                throw new IOException("closed");
            }
            if (errorCode.getHttpCode() == -1) {
                throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
            }
            frameHeader(0, debugData.length + 8, 7, 0);
            this.sink.writeInt(i8);
            this.sink.writeInt(errorCode.getHttpCode());
            if (!(debugData.length == 0)) {
                this.sink.write(debugData);
            }
            this.sink.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void headers(boolean z7, int i8, List<Header> headerBlock) {
        s.checkNotNullParameter(headerBlock, "headerBlock");
        if (this.closed) {
            throw new IOException("closed");
        }
        this.hpackWriter.writeHeaders(headerBlock);
        long size = this.hpackBuffer.size();
        long min = Math.min(this.maxFrameSize, size);
        int i9 = size == min ? 4 : 0;
        if (z7) {
            i9 |= 1;
        }
        frameHeader(i8, (int) min, 1, i9);
        this.sink.write(this.hpackBuffer, min);
        if (size > min) {
            writeContinuationFrames(i8, size - min);
        }
    }

    public final int maxDataLength() {
        return this.maxFrameSize;
    }

    public final synchronized void ping(boolean z7, int i8, int i9) {
        if (this.closed) {
            throw new IOException("closed");
        }
        frameHeader(0, 8, 6, z7 ? 1 : 0);
        this.sink.writeInt(i8);
        this.sink.writeInt(i9);
        this.sink.flush();
    }

    public final synchronized void pushPromise(int i8, int i9, List<Header> requestHeaders) {
        s.checkNotNullParameter(requestHeaders, "requestHeaders");
        if (this.closed) {
            throw new IOException("closed");
        }
        this.hpackWriter.writeHeaders(requestHeaders);
        long size = this.hpackBuffer.size();
        int min = (int) Math.min(this.maxFrameSize - 4, size);
        long j8 = min;
        frameHeader(i8, min + 4, 5, size == j8 ? 4 : 0);
        this.sink.writeInt(i9 & Integer.MAX_VALUE);
        this.sink.write(this.hpackBuffer, j8);
        if (size > j8) {
            writeContinuationFrames(i8, size - j8);
        }
    }

    public final synchronized void rstStream(int i8, ErrorCode errorCode) {
        s.checkNotNullParameter(errorCode, "errorCode");
        if (this.closed) {
            throw new IOException("closed");
        }
        if (errorCode.getHttpCode() == -1) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        frameHeader(i8, 4, 3, 0);
        this.sink.writeInt(errorCode.getHttpCode());
        this.sink.flush();
    }

    public final synchronized void settings(Settings settings) {
        try {
            s.checkNotNullParameter(settings, "settings");
            if (this.closed) {
                throw new IOException("closed");
            }
            int i8 = 0;
            frameHeader(0, settings.size() * 6, 4, 0);
            while (i8 < 10) {
                int i9 = i8 + 1;
                if (settings.isSet(i8)) {
                    this.sink.writeShort(i8 != 4 ? i8 != 7 ? i8 : 4 : 3);
                    this.sink.writeInt(settings.get(i8));
                }
                i8 = i9;
            }
            this.sink.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void windowUpdate(int i8, long j8) {
        if (this.closed) {
            throw new IOException("closed");
        }
        if (j8 == 0 || j8 > 2147483647L) {
            throw new IllegalArgumentException(s.stringPlus("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: ", Long.valueOf(j8)).toString());
        }
        frameHeader(i8, 4, 8, 0);
        this.sink.writeInt((int) j8);
        this.sink.flush();
    }
}
