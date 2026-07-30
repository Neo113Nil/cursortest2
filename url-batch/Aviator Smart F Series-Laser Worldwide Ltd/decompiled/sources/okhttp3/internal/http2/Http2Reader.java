package okhttp3.internal.http2;

import j6.k;
import j6.m;
import j6.v;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Hpack;
import okio.ByteString;
import okio.c;
import okio.e;
import okio.x0;
import okio.y0;

/* loaded from: classes5.dex */
public final class Http2Reader implements Closeable {
    public static final Companion Companion = new Companion(null);
    private static final Logger logger;
    private final boolean client;
    private final ContinuationSource continuation;
    private final Hpack.Reader hpackReader;
    private final e source;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        public final Logger getLogger() {
            return Http2Reader.logger;
        }

        public final int lengthWithoutPadding(int i8, int i9, int i10) {
            if ((i9 & 8) != 0) {
                i8--;
            }
            if (i10 <= i8) {
                return i8 - i10;
            }
            throw new IOException("PROTOCOL_ERROR padding " + i10 + " > remaining length " + i8);
        }
    }

    public static final class ContinuationSource implements x0 {
        private int flags;
        private int left;
        private int length;
        private int padding;
        private final e source;
        private int streamId;

        public ContinuationSource(e source) {
            s.checkNotNullParameter(source, "source");
            this.source = source;
        }

        private final void readContinuationHeader() {
            int i8 = this.streamId;
            int readMedium = Util.readMedium(this.source);
            this.left = readMedium;
            this.length = readMedium;
            int and = Util.and(this.source.readByte(), 255);
            this.flags = Util.and(this.source.readByte(), 255);
            Companion companion = Http2Reader.Companion;
            if (companion.getLogger().isLoggable(Level.FINE)) {
                companion.getLogger().fine(Http2.INSTANCE.frameLog(true, this.streamId, this.length, and, this.flags));
            }
            int readInt = this.source.readInt() & Integer.MAX_VALUE;
            this.streamId = readInt;
            if (and == 9) {
                if (readInt != i8) {
                    throw new IOException("TYPE_CONTINUATION streamId changed");
                }
            } else {
                throw new IOException(and + " != TYPE_CONTINUATION");
            }
        }

        @Override // okio.x0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        public final int getFlags() {
            return this.flags;
        }

        public final int getLeft() {
            return this.left;
        }

        public final int getLength() {
            return this.length;
        }

        public final int getPadding() {
            return this.padding;
        }

        public final int getStreamId() {
            return this.streamId;
        }

        @Override // okio.x0
        public long read(c sink, long j8) {
            s.checkNotNullParameter(sink, "sink");
            while (true) {
                int i8 = this.left;
                if (i8 != 0) {
                    long read = this.source.read(sink, Math.min(j8, i8));
                    if (read == -1) {
                        return -1L;
                    }
                    this.left -= (int) read;
                    return read;
                }
                this.source.skip(this.padding);
                this.padding = 0;
                if ((this.flags & 4) != 0) {
                    return -1L;
                }
                readContinuationHeader();
            }
        }

        public final void setFlags(int i8) {
            this.flags = i8;
        }

        public final void setLeft(int i8) {
            this.left = i8;
        }

        public final void setLength(int i8) {
            this.length = i8;
        }

        public final void setPadding(int i8) {
            this.padding = i8;
        }

        public final void setStreamId(int i8) {
            this.streamId = i8;
        }

        @Override // okio.x0
        public y0 timeout() {
            return this.source.timeout();
        }
    }

    public interface Handler {
        void ackSettings();

        void alternateService(int i8, String str, ByteString byteString, String str2, int i9, long j8);

        void data(boolean z7, int i8, e eVar, int i9);

        void goAway(int i8, ErrorCode errorCode, ByteString byteString);

        void headers(boolean z7, int i8, int i9, List<Header> list);

        void ping(boolean z7, int i8, int i9);

        void priority(int i8, int i9, int i10, boolean z7);

        void pushPromise(int i8, int i9, List<Header> list);

        void rstStream(int i8, ErrorCode errorCode);

        void settings(boolean z7, Settings settings);

        void windowUpdate(int i8, long j8);
    }

    static {
        Logger logger2 = Logger.getLogger(Http2.class.getName());
        s.checkNotNullExpressionValue(logger2, "getLogger(Http2::class.java.name)");
        logger = logger2;
    }

    public Http2Reader(e source, boolean z7) {
        s.checkNotNullParameter(source, "source");
        this.source = source;
        this.client = z7;
        ContinuationSource continuationSource = new ContinuationSource(source);
        this.continuation = continuationSource;
        this.hpackReader = new Hpack.Reader(continuationSource, 4096, 0, 4, null);
    }

    private final void readData(Handler handler, int i8, int i9, int i10) {
        if (i10 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        boolean z7 = (i9 & 1) != 0;
        if ((i9 & 32) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        int and = (i9 & 8) != 0 ? Util.and(this.source.readByte(), 255) : 0;
        handler.data(z7, i10, this.source, Companion.lengthWithoutPadding(i8, i9, and));
        this.source.skip(and);
    }

    private final void readGoAway(Handler handler, int i8, int i9, int i10) {
        if (i8 < 8) {
            throw new IOException(s.stringPlus("TYPE_GOAWAY length < 8: ", Integer.valueOf(i8)));
        }
        if (i10 != 0) {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
        int readInt = this.source.readInt();
        int readInt2 = this.source.readInt();
        int i11 = i8 - 8;
        ErrorCode fromHttp2 = ErrorCode.Companion.fromHttp2(readInt2);
        if (fromHttp2 == null) {
            throw new IOException(s.stringPlus("TYPE_GOAWAY unexpected error code: ", Integer.valueOf(readInt2)));
        }
        ByteString byteString = ByteString.EMPTY;
        if (i11 > 0) {
            byteString = this.source.readByteString(i11);
        }
        handler.goAway(readInt, fromHttp2, byteString);
    }

    private final List<Header> readHeaderBlock(int i8, int i9, int i10, int i11) {
        this.continuation.setLeft(i8);
        ContinuationSource continuationSource = this.continuation;
        continuationSource.setLength(continuationSource.getLeft());
        this.continuation.setPadding(i9);
        this.continuation.setFlags(i10);
        this.continuation.setStreamId(i11);
        this.hpackReader.readHeaders();
        return this.hpackReader.getAndResetHeaderList();
    }

    private final void readHeaders(Handler handler, int i8, int i9, int i10) {
        if (i10 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        boolean z7 = (i9 & 1) != 0;
        int and = (i9 & 8) != 0 ? Util.and(this.source.readByte(), 255) : 0;
        if ((i9 & 32) != 0) {
            readPriority(handler, i10);
            i8 -= 5;
        }
        handler.headers(z7, i10, -1, readHeaderBlock(Companion.lengthWithoutPadding(i8, i9, and), and, i9, i10));
    }

    private final void readPing(Handler handler, int i8, int i9, int i10) {
        if (i8 != 8) {
            throw new IOException(s.stringPlus("TYPE_PING length != 8: ", Integer.valueOf(i8)));
        }
        if (i10 != 0) {
            throw new IOException("TYPE_PING streamId != 0");
        }
        handler.ping((i9 & 1) != 0, this.source.readInt(), this.source.readInt());
    }

    private final void readPriority(Handler handler, int i8, int i9, int i10) {
        if (i8 == 5) {
            if (i10 == 0) {
                throw new IOException("TYPE_PRIORITY streamId == 0");
            }
            readPriority(handler, i10);
        } else {
            throw new IOException("TYPE_PRIORITY length: " + i8 + " != 5");
        }
    }

    private final void readPushPromise(Handler handler, int i8, int i9, int i10) {
        if (i10 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        int and = (i9 & 8) != 0 ? Util.and(this.source.readByte(), 255) : 0;
        handler.pushPromise(i10, this.source.readInt() & Integer.MAX_VALUE, readHeaderBlock(Companion.lengthWithoutPadding(i8 - 4, i9, and), and, i9, i10));
    }

    private final void readRstStream(Handler handler, int i8, int i9, int i10) {
        if (i8 != 4) {
            throw new IOException("TYPE_RST_STREAM length: " + i8 + " != 4");
        }
        if (i10 == 0) {
            throw new IOException("TYPE_RST_STREAM streamId == 0");
        }
        int readInt = this.source.readInt();
        ErrorCode fromHttp2 = ErrorCode.Companion.fromHttp2(readInt);
        if (fromHttp2 == null) {
            throw new IOException(s.stringPlus("TYPE_RST_STREAM unexpected error code: ", Integer.valueOf(readInt)));
        }
        handler.rstStream(i10, fromHttp2);
    }

    private final void readSettings(Handler handler, int i8, int i9, int i10) {
        m until;
        k step;
        int readInt;
        if (i10 != 0) {
            throw new IOException("TYPE_SETTINGS streamId != 0");
        }
        if ((i9 & 1) != 0) {
            if (i8 != 0) {
                throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
            }
            handler.ackSettings();
            return;
        }
        if (i8 % 6 != 0) {
            throw new IOException(s.stringPlus("TYPE_SETTINGS length % 6 != 0: ", Integer.valueOf(i8)));
        }
        Settings settings = new Settings();
        until = v.until(0, i8);
        step = v.step(until, 6);
        int first = step.getFirst();
        int last = step.getLast();
        int step2 = step.getStep();
        if ((step2 > 0 && first <= last) || (step2 < 0 && last <= first)) {
            while (true) {
                int i11 = first + step2;
                int and = Util.and(this.source.readShort(), 65535);
                readInt = this.source.readInt();
                if (and != 2) {
                    if (and == 3) {
                        and = 4;
                    } else if (and != 4) {
                        if (and == 5 && (readInt < 16384 || readInt > 16777215)) {
                            break;
                        }
                    } else {
                        if (readInt < 0) {
                            throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                        }
                        and = 7;
                    }
                } else if (readInt != 0 && readInt != 1) {
                    throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                }
                settings.set(and, readInt);
                if (first == last) {
                    break;
                } else {
                    first = i11;
                }
            }
            throw new IOException(s.stringPlus("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ", Integer.valueOf(readInt)));
        }
        handler.settings(false, settings);
    }

    private final void readWindowUpdate(Handler handler, int i8, int i9, int i10) {
        if (i8 != 4) {
            throw new IOException(s.stringPlus("TYPE_WINDOW_UPDATE length !=4: ", Integer.valueOf(i8)));
        }
        long and = Util.and(this.source.readInt(), 2147483647L);
        if (and == 0) {
            throw new IOException("windowSizeIncrement was 0");
        }
        handler.windowUpdate(i10, and);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.source.close();
    }

    public final boolean nextFrame(boolean z7, Handler handler) {
        s.checkNotNullParameter(handler, "handler");
        try {
            this.source.require(9L);
            int readMedium = Util.readMedium(this.source);
            if (readMedium > 16384) {
                throw new IOException(s.stringPlus("FRAME_SIZE_ERROR: ", Integer.valueOf(readMedium)));
            }
            int and = Util.and(this.source.readByte(), 255);
            int and2 = Util.and(this.source.readByte(), 255);
            int readInt = this.source.readInt() & Integer.MAX_VALUE;
            Logger logger2 = logger;
            if (logger2.isLoggable(Level.FINE)) {
                logger2.fine(Http2.INSTANCE.frameLog(true, readInt, readMedium, and, and2));
            }
            if (z7 && and != 4) {
                throw new IOException(s.stringPlus("Expected a SETTINGS frame but was ", Http2.INSTANCE.formattedType$okhttp(and)));
            }
            switch (and) {
                case 0:
                    readData(handler, readMedium, and2, readInt);
                    return true;
                case 1:
                    readHeaders(handler, readMedium, and2, readInt);
                    return true;
                case 2:
                    readPriority(handler, readMedium, and2, readInt);
                    return true;
                case 3:
                    readRstStream(handler, readMedium, and2, readInt);
                    return true;
                case 4:
                    readSettings(handler, readMedium, and2, readInt);
                    return true;
                case 5:
                    readPushPromise(handler, readMedium, and2, readInt);
                    return true;
                case 6:
                    readPing(handler, readMedium, and2, readInt);
                    return true;
                case 7:
                    readGoAway(handler, readMedium, and2, readInt);
                    return true;
                case 8:
                    readWindowUpdate(handler, readMedium, and2, readInt);
                    return true;
                default:
                    this.source.skip(readMedium);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    public final void readConnectionPreface(Handler handler) {
        s.checkNotNullParameter(handler, "handler");
        if (this.client) {
            if (!nextFrame(true, handler)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        e eVar = this.source;
        ByteString byteString = Http2.CONNECTION_PREFACE;
        ByteString readByteString = eVar.readByteString(byteString.size());
        Logger logger2 = logger;
        if (logger2.isLoggable(Level.FINE)) {
            logger2.fine(Util.format(s.stringPlus("<< CONNECTION ", readByteString.hex()), new Object[0]));
        }
        if (!s.areEqual(byteString, readByteString)) {
            throw new IOException(s.stringPlus("Expected a connection header but was ", readByteString.utf8()));
        }
    }

    private final void readPriority(Handler handler, int i8) {
        int readInt = this.source.readInt();
        handler.priority(i8, readInt & Integer.MAX_VALUE, Util.and(this.source.readByte(), 255) + 1, (Integer.MIN_VALUE & readInt) != 0);
    }
}
