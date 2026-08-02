package okhttp3.internal.http2;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.q2$$ExternalSyntheticLambda8;
import bo.app.x7$$ExternalSyntheticLambda1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$0;
import okhttp3.Headers;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.http2.Hpack;
import okhttp3.internal.http2.Http2Stream;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Path$$ExternalSyntheticBUOutline0;
import okio.RealBufferedSource;
import okio.Source;
import okio.Timeout;
import org.apache.commons.imaging.formats.pnm.PnmConstants;
import org.bouncycastle.crypto.hpke.HPKE;
import papa.InteractionRuleClient$$ExternalSyntheticLambda0;

/* loaded from: classes3.dex */
public final class Http2Reader implements Closeable {
    public static final Logger logger;
    public final ContinuationSource continuation;
    public final Hpack.Reader hpackReader;
    public final BufferedSource source;

    public abstract class Companion {
        public static int lengthWithoutPadding(int i, int i2, int i3) {
            if ((i2 & 8) != 0) {
                i--;
            }
            if (i3 <= i) {
                return i - i3;
            }
            a$$ExternalSyntheticBUOutline0.m$4(Recorder$$ExternalSyntheticOutline2.m("PROTOCOL_ERROR padding ", i3, i, " > remaining length "));
            return 0;
        }
    }

    public final class ContinuationSource implements Source {
        public int flags;
        public int left;
        public int padding;
        public final BufferedSource source;
        public int streamId;

        public ContinuationSource(BufferedSource bufferedSource) {
            bufferedSource.getClass();
            this.source = bufferedSource;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        @Override // okio.Source
        public final long read(Buffer buffer, long j) {
            int i;
            int readInt;
            buffer.getClass();
            do {
                int i2 = this.left;
                BufferedSource bufferedSource = this.source;
                if (i2 == 0) {
                    bufferedSource.skip(this.padding);
                    this.padding = 0;
                    if ((this.flags & 4) == 0) {
                        i = this.streamId;
                        int readMedium = _UtilCommonKt.readMedium(bufferedSource);
                        this.left = readMedium;
                        int readByte = bufferedSource.readByte() & 255;
                        this.flags = bufferedSource.readByte() & 255;
                        Logger logger = Http2Reader.logger;
                        if (logger.isLoggable(Level.FINE)) {
                            ByteString byteString = Http2.CONNECTION_PREFACE;
                            logger.fine(Http2.frameLog(true, this.streamId, readMedium, readByte, this.flags));
                        }
                        readInt = bufferedSource.readInt() & Integer.MAX_VALUE;
                        this.streamId = readInt;
                        if (readByte != 9) {
                            a$$ExternalSyntheticBUOutline0.m$4(Boxes$$ExternalSyntheticOutline1.m(readByte, " != TYPE_CONTINUATION"));
                            return 0L;
                        }
                    }
                } else {
                    long read = bufferedSource.read(buffer, Math.min(j, i2));
                    if (read != -1) {
                        this.left -= (int) read;
                        return read;
                    }
                }
                return -1L;
            } while (readInt == i);
            a$$ExternalSyntheticBUOutline0.m$4("TYPE_CONTINUATION streamId changed");
            return 0L;
        }

        @Override // okio.Source
        public final Timeout timeout() {
            return this.source.timeout();
        }
    }

    static {
        Logger logger2 = Logger.getLogger(Http2.class.getName());
        logger2.getClass();
        logger = logger2;
    }

    public Http2Reader(RealBufferedSource realBufferedSource) {
        realBufferedSource.getClass();
        this.source = realBufferedSource;
        ContinuationSource continuationSource = new ContinuationSource(realBufferedSource);
        this.continuation = continuationSource;
        this.hpackReader = new Hpack.Reader(continuationSource);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.source.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:168:0x023c, code lost:
    
        bo.app.a$$ExternalSyntheticBUOutline0.m$4(defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0.m(r6, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0245, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean nextFrame(boolean z, KClassImpl$Data$$Lambda$0 kClassImpl$Data$$Lambda$0) {
        int readMedium;
        Object[] array2;
        try {
            this.source.require(9L);
            readMedium = _UtilCommonKt.readMedium(this.source);
        } catch (EOFException unused) {
        }
        if (readMedium > 16384) {
            a$$ExternalSyntheticBUOutline0.m$4(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(readMedium, "FRAME_SIZE_ERROR: "));
            return false;
        }
        int readByte = this.source.readByte() & 255;
        byte readByte2 = this.source.readByte();
        int i = readByte2 & 255;
        int readInt = this.source.readInt();
        int i2 = Integer.MAX_VALUE & readInt;
        if (readByte != 8) {
            Logger logger2 = logger;
            if (logger2.isLoggable(Level.FINE)) {
                logger2.fine(Http2.frameLog(true, i2, readMedium, readByte, i));
            }
        }
        int i3 = 4;
        if (z && readByte != 4) {
            a$$ExternalSyntheticBUOutline0.m$4(Http2.formattedType$okhttp(readByte), "Expected a SETTINGS frame but was ");
            return false;
        }
        ErrorCode errorCode = null;
        switch (readByte) {
            case 0:
                readData(kClassImpl$Data$$Lambda$0, readMedium, i, i2);
                return true;
            case 1:
                readHeaders(kClassImpl$Data$$Lambda$0, readMedium, i, i2);
                return true;
            case 2:
                if (readMedium != 5) {
                    a$$ExternalSyntheticBUOutline0.m$4(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(readMedium, "TYPE_PRIORITY length: ", " != 5"));
                    return false;
                }
                if (i2 == 0) {
                    a$$ExternalSyntheticBUOutline0.m$4("TYPE_PRIORITY streamId == 0");
                    return false;
                }
                BufferedSource bufferedSource = this.source;
                bufferedSource.readInt();
                bufferedSource.readByte();
                return true;
            case 3:
                if (readMedium != 4) {
                    a$$ExternalSyntheticBUOutline0.m$4(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(readMedium, "TYPE_RST_STREAM length: ", " != 4"));
                    return false;
                }
                if (i2 == 0) {
                    a$$ExternalSyntheticBUOutline0.m$4("TYPE_RST_STREAM streamId == 0");
                    return false;
                }
                int readInt2 = this.source.readInt();
                ErrorCode.Companion.getClass();
                ErrorCode[] values = ErrorCode.values();
                int length = values.length;
                int i4 = 0;
                while (true) {
                    if (i4 < length) {
                        ErrorCode errorCode2 = values[i4];
                        if (errorCode2.httpCode == readInt2) {
                            errorCode = errorCode2;
                        } else {
                            i4++;
                        }
                    }
                }
                if (errorCode == null) {
                    a$$ExternalSyntheticBUOutline0.m$4(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(readInt2, "TYPE_RST_STREAM unexpected error code: "));
                    return false;
                }
                Http2Connection http2Connection = (Http2Connection) kClassImpl$Data$$Lambda$0.arg$1;
                if (i2 == 0 || (readInt & 1) != 0) {
                    Http2Stream removeStream$okhttp = http2Connection.removeStream$okhttp(i2);
                    if (removeStream$okhttp != null) {
                        synchronized (removeStream$okhttp) {
                            if (removeStream$okhttp.getErrorCode$okhttp() == null) {
                                removeStream$okhttp.errorCode = errorCode;
                                removeStream$okhttp.notifyAll();
                            }
                        }
                        return true;
                    }
                    return true;
                }
                TaskQueue.execute$default(http2Connection.pushQueue, http2Connection.connectionName + '[' + i2 + "] onReset", 0L, new q2$$ExternalSyntheticLambda8(http2Connection, i2, errorCode), 6);
                return true;
            case 4:
                BufferedSource bufferedSource2 = this.source;
                if (i2 != 0) {
                    a$$ExternalSyntheticBUOutline0.m$4("TYPE_SETTINGS streamId != 0");
                    return false;
                }
                if ((readByte2 & 1) != 0) {
                    if (readMedium != 0) {
                        a$$ExternalSyntheticBUOutline0.m$4("FRAME_SIZE_ERROR ack frame should be empty!");
                        return false;
                    }
                    return true;
                }
                if (readMedium % 6 != 0) {
                    a$$ExternalSyntheticBUOutline0.m$4(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(readMedium, "TYPE_SETTINGS length % 6 != 0: "));
                    return false;
                }
                Settings settings = new Settings();
                IntProgression step = RangesKt___RangesKt.step(6, RangesKt___RangesKt.until(0, readMedium));
                int i5 = step.first;
                int i6 = step.last;
                int i7 = step.step;
                if ((i7 > 0 && i5 <= i6) || (i7 < 0 && i6 <= i5)) {
                    while (true) {
                        short readShort = bufferedSource2.readShort();
                        byte[] bArr = _UtilCommonKt.EMPTY_BYTE_ARRAY;
                        int i8 = readShort & HPKE.aead_EXPORT_ONLY;
                        int readInt3 = bufferedSource2.readInt();
                        if (i8 != 2) {
                            if (i8 != 4) {
                                if (i8 == 5 && (readInt3 < 16384 || readInt3 > 16777215)) {
                                }
                            } else if (readInt3 < 0) {
                                a$$ExternalSyntheticBUOutline0.m$4("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                return false;
                            }
                        } else if (readInt3 != 0 && readInt3 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$4("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                            return false;
                        }
                        settings.set(i8, readInt3);
                        if (i5 != i6) {
                            i5 += i7;
                        }
                    }
                }
                Http2Connection http2Connection2 = (Http2Connection) kClassImpl$Data$$Lambda$0.arg$1;
                TaskQueue.execute$default(http2Connection2.writerQueue, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder(), http2Connection2.connectionName, " applyAndAckSettings"), 0L, new InteractionRuleClient$$ExternalSyntheticLambda0(18, kClassImpl$Data$$Lambda$0, settings), 6);
                return true;
            case 5:
                readPushPromise(kClassImpl$Data$$Lambda$0, readMedium, i, i2);
                return true;
            case 6:
                if (readMedium != 8) {
                    a$$ExternalSyntheticBUOutline0.m$4(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(readMedium, "TYPE_PING length != 8: "));
                    return false;
                }
                if (i2 != 0) {
                    a$$ExternalSyntheticBUOutline0.m$4("TYPE_PING streamId != 0");
                    return false;
                }
                int readInt4 = this.source.readInt();
                int readInt5 = this.source.readInt();
                r0 = (readByte2 & 1) != 0 ? 1 : 0;
                Http2Connection http2Connection3 = (Http2Connection) kClassImpl$Data$$Lambda$0.arg$1;
                if (r0 == 0) {
                    TaskQueue.execute$default(http2Connection3.writerQueue, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder(), ((Http2Connection) kClassImpl$Data$$Lambda$0.arg$1).connectionName, " ping"), 0L, new x7$$ExternalSyntheticLambda1((Http2Connection) kClassImpl$Data$$Lambda$0.arg$1, readInt4, readInt5, i3), 6);
                    return true;
                }
                synchronized (http2Connection3) {
                    try {
                        if (readInt4 == 1) {
                            http2Connection3.intervalPongsReceived++;
                        } else if (readInt4 == 2) {
                            http2Connection3.degradedPongsReceived++;
                        } else if (readInt4 == 3) {
                            http2Connection3.notifyAll();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return true;
            case 7:
                if (readMedium < 8) {
                    a$$ExternalSyntheticBUOutline0.m$4(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(readMedium, "TYPE_GOAWAY length < 8: "));
                    return false;
                }
                if (i2 != 0) {
                    a$$ExternalSyntheticBUOutline0.m$4("TYPE_GOAWAY streamId != 0");
                    return false;
                }
                int readInt6 = this.source.readInt();
                int readInt7 = this.source.readInt();
                int i9 = readMedium - 8;
                ErrorCode.Companion.getClass();
                ErrorCode[] values2 = ErrorCode.values();
                int length2 = values2.length;
                int i10 = 0;
                while (true) {
                    if (i10 < length2) {
                        ErrorCode errorCode3 = values2[i10];
                        if (errorCode3.httpCode == readInt7) {
                            errorCode = errorCode3;
                        } else {
                            i10++;
                        }
                    }
                }
                if (errorCode == null) {
                    a$$ExternalSyntheticBUOutline0.m$4(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(readInt7, "TYPE_GOAWAY unexpected error code: "));
                    return false;
                }
                ByteString byteString = ByteString.EMPTY;
                if (i9 > 0) {
                    byteString = this.source.readByteString(i9);
                }
                byteString.getClass();
                byteString.getSize$okio();
                Http2Connection http2Connection4 = (Http2Connection) kClassImpl$Data$$Lambda$0.arg$1;
                synchronized (http2Connection4) {
                    array2 = http2Connection4.streams.values().toArray(new Http2Stream[0]);
                    http2Connection4.isShutdown = true;
                }
                Http2Stream[] http2StreamArr = (Http2Stream[]) array2;
                int length3 = http2StreamArr.length;
                while (r0 < length3) {
                    Http2Stream http2Stream = http2StreamArr[r0];
                    if (http2Stream.id > readInt6 && http2Stream.isLocallyInitiated()) {
                        ErrorCode errorCode4 = ErrorCode.REFUSED_STREAM;
                        synchronized (http2Stream) {
                            if (http2Stream.getErrorCode$okhttp() == null) {
                                http2Stream.errorCode = errorCode4;
                                http2Stream.notifyAll();
                            }
                        }
                        ((Http2Connection) kClassImpl$Data$$Lambda$0.arg$1).removeStream$okhttp(http2Stream.id);
                    }
                    r0++;
                }
                return true;
            case 8:
                try {
                    if (readMedium != 4) {
                        throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + readMedium);
                    }
                    long readInt8 = this.source.readInt() & 2147483647L;
                    if (readInt8 == 0) {
                        throw new IOException("windowSizeIncrement was 0");
                    }
                    Logger logger3 = logger;
                    if (logger3.isLoggable(Level.FINE)) {
                        logger3.fine(Http2.frameLogWindowUpdate(i2, readMedium, readInt8, true));
                    }
                    Http2Connection http2Connection5 = (Http2Connection) kClassImpl$Data$$Lambda$0.arg$1;
                    if (i2 == 0) {
                        synchronized (http2Connection5) {
                            http2Connection5.writeBytesMaximum += readInt8;
                            http2Connection5.notifyAll();
                        }
                        return true;
                    }
                    Http2Stream stream = http2Connection5.getStream(i2);
                    if (stream != null) {
                        synchronized (stream) {
                            stream.writeBytesMaximum += readInt8;
                            if (readInt8 > 0) {
                                stream.notifyAll();
                            }
                        }
                        return true;
                    }
                    return true;
                } catch (Exception e) {
                    logger.fine(Http2.frameLog(true, i2, readMedium, 8, i));
                    throw e;
                }
            default:
                this.source.skip(readMedium);
                return true;
        }
    }

    public final void readData(KClassImpl$Data$$Lambda$0 kClassImpl$Data$$Lambda$0, int i, int i2, final int i3) {
        boolean z;
        int i4;
        boolean z2;
        boolean z3;
        if (i3 == 0) {
            a$$ExternalSyntheticBUOutline0.m$4("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
            return;
        }
        final boolean z4 = true;
        if ((i2 & 1) != 0) {
            z = true;
        } else {
            z = true;
            z4 = false;
        }
        if ((i2 & 32) != 0) {
            a$$ExternalSyntheticBUOutline0.m$4("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
            return;
        }
        if ((i2 & 8) != 0) {
            byte readByte = this.source.readByte();
            byte[] bArr = _UtilCommonKt.EMPTY_BYTE_ARRAY;
            i4 = readByte & 255;
        } else {
            i4 = 0;
        }
        final int lengthWithoutPadding = Companion.lengthWithoutPadding(i, i2, i4);
        BufferedSource bufferedSource = this.source;
        bufferedSource.getClass();
        final Http2Connection http2Connection = (Http2Connection) kClassImpl$Data$$Lambda$0.arg$1;
        if ((i3 == 0 || (i3 & 1) != 0) ? false : z) {
            final Buffer buffer = new Buffer();
            long j = lengthWithoutPadding;
            bufferedSource.require(j);
            bufferedSource.read(buffer, j);
            TaskQueue.execute$default(http2Connection.pushQueue, http2Connection.connectionName + '[' + i3 + "] onData", 0L, new Function0(i3, buffer, lengthWithoutPadding, z4) { // from class: okhttp3.internal.http2.Http2Connection$$ExternalSyntheticLambda4
                public final /* synthetic */ int f$1;
                public final /* synthetic */ Buffer f$2;
                public final /* synthetic */ int f$3;

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Http2Connection http2Connection2 = Http2Connection.this;
                    int i5 = this.f$1;
                    Buffer buffer2 = this.f$2;
                    int i6 = this.f$3;
                    try {
                        http2Connection2.pushObserver.getClass();
                        buffer2.skip(i6);
                        http2Connection2.writer.rstStream(i5, ErrorCode.CANCEL);
                        synchronized (http2Connection2) {
                            http2Connection2.currentPushRequests.remove(Integer.valueOf(i5));
                        }
                    } catch (IOException unused) {
                    }
                    return Unit.INSTANCE;
                }
            }, 6);
        } else {
            Http2Stream stream = http2Connection.getStream(i3);
            if (stream == null) {
                ((Http2Connection) kClassImpl$Data$$Lambda$0.arg$1).writeSynResetLater$okhttp(i3, ErrorCode.PROTOCOL_ERROR);
                long j2 = lengthWithoutPadding;
                ((Http2Connection) kClassImpl$Data$$Lambda$0.arg$1).updateConnectionFlowControl$okhttp(j2);
                bufferedSource.skip(j2);
            } else {
                TimeZone timeZone = _UtilJvmKt.UTC;
                Http2Stream.FramingSource framingSource = stream.source;
                long j3 = lengthWithoutPadding;
                framingSource.getClass();
                long j4 = j3;
                while (true) {
                    Http2Stream http2Stream = Http2Stream.this;
                    if (j4 <= 0) {
                        TimeZone timeZone2 = _UtilJvmKt.UTC;
                        http2Stream.connection.updateConnectionFlowControl$okhttp(j3);
                        Http2Stream.this.connection.flowControlListener.getClass();
                        break;
                    }
                    synchronized (http2Stream) {
                        z2 = framingSource.finished;
                        z3 = framingSource.readBuffer.size + j4 > framingSource.maxByteCount;
                    }
                    if (z3) {
                        bufferedSource.skip(j4);
                        Http2Stream.this.closeLater(ErrorCode.FLOW_CONTROL_ERROR);
                        break;
                    }
                    if (z2) {
                        bufferedSource.skip(j4);
                        break;
                    }
                    long read = bufferedSource.read(framingSource.receiveBuffer, j4);
                    if (read == -1) {
                        Path$$ExternalSyntheticBUOutline0.m$1();
                        return;
                    }
                    j4 -= read;
                    Http2Stream http2Stream2 = Http2Stream.this;
                    synchronized (http2Stream2) {
                        try {
                            if (framingSource.closed) {
                                framingSource.receiveBuffer.clear();
                            } else {
                                Buffer buffer2 = framingSource.readBuffer;
                                boolean z5 = buffer2.size == 0;
                                buffer2.writeAll(framingSource.receiveBuffer);
                                if (z5) {
                                    http2Stream2.notifyAll();
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                if (z4) {
                    stream.receiveHeaders(Headers.EMPTY, true);
                }
            }
        }
        this.source.skip(i4);
    }

    public final List readHeaderBlock(int i, int i2, int i3, int i4) {
        ContinuationSource continuationSource = this.continuation;
        continuationSource.left = i;
        continuationSource.padding = i2;
        continuationSource.flags = i3;
        continuationSource.streamId = i4;
        Hpack.Reader reader = this.hpackReader;
        RealBufferedSource realBufferedSource = reader.source;
        while (!realBufferedSource.exhausted()) {
            byte readByte = realBufferedSource.readByte();
            byte[] bArr = _UtilCommonKt.EMPTY_BYTE_ARRAY;
            int i5 = readByte & 255;
            if (i5 == 128) {
                a$$ExternalSyntheticBUOutline0.m$4("index == 0");
                return null;
            }
            if ((readByte & 128) == 128) {
                int readInt = reader.readInt(i5, 127);
                int i6 = readInt - 1;
                if (i6 >= 0) {
                    Header[] headerArr = Hpack.STATIC_HEADER_TABLE;
                    if (i6 <= headerArr.length - 1) {
                        reader.addHeader(headerArr[i6]);
                    }
                }
                int length = reader.nextHeaderIndex + 1 + (i6 - Hpack.STATIC_HEADER_TABLE.length);
                if (length >= 0) {
                    Header[] headerArr2 = reader.dynamicTable;
                    if (length < headerArr2.length) {
                        Header header = headerArr2[length];
                        header.getClass();
                        reader.addHeader(header);
                    }
                }
                a$$ExternalSyntheticBUOutline0.m$4(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(readInt, "Header index too large "));
                return null;
            }
            if (i5 == 64) {
                Header[] headerArr3 = Hpack.STATIC_HEADER_TABLE;
                ByteString readByteString = reader.readByteString();
                Hpack.checkLowercase(readByteString);
                reader.insertIntoDynamicTable(new Header(readByteString, reader.readByteString()));
            } else if ((readByte & 64) == 64) {
                reader.insertIntoDynamicTable(new Header(reader.getName(reader.readInt(i5, 63) - 1), reader.readByteString()));
            } else if ((readByte & PnmConstants.PNM_SEPARATOR) == 32) {
                int readInt2 = reader.readInt(i5, 31);
                reader.maxDynamicTableByteCount = readInt2;
                if (readInt2 < 0 || readInt2 > 4096) {
                    Path$$ExternalSyntheticBUOutline0.m$3(reader.maxDynamicTableByteCount, "Invalid dynamic table size update ");
                    return null;
                }
                int i7 = reader.dynamicTableByteCount;
                if (readInt2 < i7) {
                    if (readInt2 == 0) {
                        ArraysKt___ArraysJvmKt.fill(r4, 0, reader.dynamicTable.length, null);
                        reader.nextHeaderIndex = reader.dynamicTable.length - 1;
                        reader.headerCount = 0;
                        reader.dynamicTableByteCount = 0;
                    } else {
                        reader.evictToRecoverBytes(i7 - readInt2);
                    }
                }
            } else if (i5 == 16 || i5 == 0) {
                Header[] headerArr4 = Hpack.STATIC_HEADER_TABLE;
                ByteString readByteString2 = reader.readByteString();
                Hpack.checkLowercase(readByteString2);
                reader.addHeader(new Header(readByteString2, reader.readByteString()));
            } else {
                reader.addHeader(new Header(reader.getName(reader.readInt(i5, 15) - 1), reader.readByteString()));
            }
        }
        ArrayList arrayList = reader.headerList;
        List list = CollectionsKt.toList(arrayList);
        arrayList.clear();
        reader.headerListByteCount = 0L;
        return list;
    }

    public final void readHeaders(KClassImpl$Data$$Lambda$0 kClassImpl$Data$$Lambda$0, int i, int i2, int i3) {
        boolean z;
        int i4;
        int i5;
        Http2Connection http2Connection;
        if (i3 == 0) {
            a$$ExternalSyntheticBUOutline0.m$4("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
            return;
        }
        boolean z2 = false;
        boolean z3 = true;
        if ((i2 & 1) != 0) {
            z = true;
        } else {
            z = true;
            z3 = false;
        }
        if ((i2 & 8) != 0) {
            byte readByte = this.source.readByte();
            byte[] bArr = _UtilCommonKt.EMPTY_BYTE_ARRAY;
            i4 = readByte & 255;
        } else {
            i4 = 0;
        }
        if ((i2 & 32) != 0) {
            BufferedSource bufferedSource = this.source;
            bufferedSource.readInt();
            bufferedSource.readByte();
            byte[] bArr2 = _UtilCommonKt.EMPTY_BYTE_ARRAY;
            i5 = i - 5;
        } else {
            i5 = i;
        }
        List readHeaderBlock = readHeaderBlock(Companion.lengthWithoutPadding(i5, i2, i4), i4, i2, i3);
        readHeaderBlock.getClass();
        Http2Connection http2Connection2 = (Http2Connection) kClassImpl$Data$$Lambda$0.arg$1;
        if (i3 != 0 && (i3 & 1) == 0) {
            z2 = z;
        }
        if (z2) {
            TaskQueue.execute$default(http2Connection2.pushQueue, http2Connection2.connectionName + '[' + i3 + "] onHeaders", 0L, new Http2Connection$$ExternalSyntheticLambda5(http2Connection2, i3, readHeaderBlock, z3), 6);
            return;
        }
        synchronized (http2Connection2) {
            try {
                Http2Stream stream = http2Connection2.getStream(i3);
                if (stream != null) {
                    stream.receiveHeaders(_UtilJvmKt.toHeaders(readHeaderBlock), z3);
                    return;
                }
                if (http2Connection2.isShutdown) {
                    return;
                }
                if (i3 <= http2Connection2.lastGoodStreamId) {
                    return;
                }
                if (i3 % 2 == http2Connection2.nextStreamId % 2) {
                    return;
                }
                http2Connection = http2Connection2;
                try {
                    Http2Stream http2Stream = new Http2Stream(i3, http2Connection, false, z3, _UtilJvmKt.toHeaders(readHeaderBlock));
                    http2Connection.lastGoodStreamId = i3;
                    http2Connection.streams.put(Integer.valueOf(i3), http2Stream);
                    TaskQueue.execute$default(http2Connection.taskRunner.newQueue(), http2Connection.connectionName + '[' + i3 + "] onStream", 0L, new InteractionRuleClient$$ExternalSyntheticLambda0(17, http2Connection, http2Stream), 6);
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                http2Connection = http2Connection2;
            }
        }
    }

    public final void readPushPromise(KClassImpl$Data$$Lambda$0 kClassImpl$Data$$Lambda$0, int i, int i2, int i3) {
        int i4;
        if (i3 == 0) {
            a$$ExternalSyntheticBUOutline0.m$4("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
            return;
        }
        if ((i2 & 8) != 0) {
            byte readByte = this.source.readByte();
            byte[] bArr = _UtilCommonKt.EMPTY_BYTE_ARRAY;
            i4 = readByte & 255;
        } else {
            i4 = 0;
        }
        int readInt = this.source.readInt() & Integer.MAX_VALUE;
        List readHeaderBlock = readHeaderBlock(Companion.lengthWithoutPadding(i - 4, i2, i4), i4, i2, i3);
        readHeaderBlock.getClass();
        Http2Connection http2Connection = (Http2Connection) kClassImpl$Data$$Lambda$0.arg$1;
        synchronized (http2Connection) {
            if (http2Connection.currentPushRequests.contains(Integer.valueOf(readInt))) {
                http2Connection.writeSynResetLater$okhttp(readInt, ErrorCode.PROTOCOL_ERROR);
                return;
            }
            http2Connection.currentPushRequests.add(Integer.valueOf(readInt));
            TaskQueue.execute$default(http2Connection.pushQueue, http2Connection.connectionName + '[' + readInt + "] onRequest", 0L, new Http2Connection$$ExternalSyntheticLambda5(http2Connection, readInt, readHeaderBlock), 6);
        }
    }
}
