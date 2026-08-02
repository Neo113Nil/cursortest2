package okhttp3.internal.ws;

import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.Closeable;
import java.net.ProtocolException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.zip.Inflater;
import okhttp3.WebSocketListener;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.InflaterSource;
import okio.RealBufferedSource;
import org.apache.commons.imaging.formats.pnm.PnmConstants;
import org.bouncycastle.crypto.hpke.HPKE;

/* loaded from: classes9.dex */
public final class WebSocketReader implements Closeable {
    public boolean closed;
    public final Buffer controlFrameBuffer;
    public final RealWebSocket frameCallback;
    public long frameLength;
    public boolean isControlFrame;
    public boolean isFinalFrame;
    public final byte[] maskKey;
    public final Buffer messageFrameBuffer;
    public MessageDeflater messageInflater;
    public final boolean noContextTakeover;
    public int opcode;
    public final boolean perMessageDeflate;
    public boolean readingCompressedMessage;
    public boolean receivedCloseFrame;
    public final BufferedSource source;

    public WebSocketReader(BufferedSource bufferedSource, RealWebSocket realWebSocket, boolean z, boolean z2) {
        bufferedSource.getClass();
        this.source = bufferedSource;
        this.frameCallback = realWebSocket;
        this.perMessageDeflate = z;
        this.noContextTakeover = z2;
        this.controlFrameBuffer = new Buffer();
        this.messageFrameBuffer = new Buffer();
        this.maskKey = null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.closed) {
            return;
        }
        this.closed = true;
        MessageDeflater messageDeflater = this.messageInflater;
        if (messageDeflater != null) {
            _UtilCommonKt.closeQuietly(messageDeflater);
        }
        _UtilCommonKt.closeQuietly(this.source);
    }

    public final void processNextFrame() {
        if (this.closed) {
            a$$ExternalSyntheticBUOutline0.m$1("closed");
            return;
        }
        readHeader();
        if (this.isControlFrame) {
            readControlFrame();
            return;
        }
        int i = this.opcode;
        if (i != 1 && i != 2) {
            TimeZone timeZone = _UtilJvmKt.UTC;
            String hexString = Integer.toHexString(i);
            hexString.getClass();
            throw new ProtocolException("Unknown opcode: ".concat(hexString));
        }
        while (!this.receivedCloseFrame) {
            long j = this.frameLength;
            Buffer buffer = this.messageFrameBuffer;
            if (j > 0) {
                this.source.readFully(buffer, j);
            }
            if (this.isFinalFrame) {
                if (this.readingCompressedMessage) {
                    MessageDeflater messageDeflater = this.messageInflater;
                    if (messageDeflater == null) {
                        messageDeflater = new MessageDeflater(this.noContextTakeover, 1);
                        this.messageInflater = messageDeflater;
                    }
                    Buffer buffer2 = messageDeflater.deflatedBytes;
                    if (buffer2.size != 0) {
                        a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
                        return;
                    }
                    Inflater inflater = (Inflater) messageDeflater.deflater;
                    if (inflater == null) {
                        inflater = new Inflater(true);
                        messageDeflater.deflater = inflater;
                    }
                    InflaterSource inflaterSource = (InflaterSource) messageDeflater.deflaterSink;
                    if (inflaterSource == null) {
                        inflaterSource = new InflaterSource(new RealBufferedSource(buffer2), inflater);
                        messageDeflater.deflaterSink = inflaterSource;
                    }
                    if (messageDeflater.noContextTakeover) {
                        inflater.reset();
                    }
                    buffer2.writeAll(buffer);
                    buffer2.m4336writeInt(65535);
                    long bytesRead = inflater.getBytesRead() + buffer2.size;
                    do {
                        inflaterSource.readOrInflate(buffer, Long.MAX_VALUE);
                        if (inflater.getBytesRead() >= bytesRead) {
                            break;
                        }
                    } while (!inflater.finished());
                    if (inflater.getBytesRead() < bytesRead) {
                        buffer2.clear();
                        inflaterSource.close();
                        messageDeflater.deflaterSink = null;
                        messageDeflater.deflater = null;
                    }
                }
                RealWebSocket realWebSocket = this.frameCallback;
                WebSocketListener webSocketListener = realWebSocket.listener;
                if (i == 1) {
                    webSocketListener.onMessage(realWebSocket, buffer.readUtf8());
                    return;
                }
                ByteString readByteString = buffer.readByteString(buffer.size);
                readByteString.getClass();
                webSocketListener.onMessage(realWebSocket, readByteString);
                return;
            }
            while (!this.receivedCloseFrame) {
                readHeader();
                if (!this.isControlFrame) {
                    break;
                } else {
                    readControlFrame();
                }
            }
            if (this.opcode != 0) {
                int i2 = this.opcode;
                TimeZone timeZone2 = _UtilJvmKt.UTC;
                String hexString2 = Integer.toHexString(i2);
                hexString2.getClass();
                throw new ProtocolException("Expected continuation opcode. Got: ".concat(hexString2));
            }
        }
        a$$ExternalSyntheticBUOutline0.m$4("closed");
    }

    public final void readControlFrame() {
        String str;
        short s;
        long j = this.frameLength;
        if (j > 0) {
            this.source.readFully(this.controlFrameBuffer, j);
        }
        switch (this.opcode) {
            case 8:
                Buffer buffer = this.controlFrameBuffer;
                long j2 = buffer.size;
                if (j2 == 1) {
                    throw new ProtocolException("Malformed close payload length of 1.");
                }
                if (j2 != 0) {
                    s = buffer.readShort();
                    str = this.controlFrameBuffer.readUtf8();
                    String m = (s < 1000 || s >= 5000) ? JsonLogicResult$Success$$ExternalSyntheticOutline0.m(s, "Code must be in range [1000,5000): ") : ((1004 > s || s >= 1007) && (1015 > s || s >= 3000)) ? null : JsonLogicResult$Success$$ExternalSyntheticOutline0.m((int) s, "Code ", " is reserved and may not be used.");
                    if (m != null) {
                        throw new ProtocolException(m);
                    }
                } else {
                    str = "";
                    s = 1005;
                }
                RealWebSocket realWebSocket = this.frameCallback;
                if (s == -1) {
                    a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
                    return;
                }
                synchronized (realWebSocket) {
                    if (realWebSocket.receivedCloseCode != -1) {
                        throw new IllegalStateException("already closed");
                    }
                    realWebSocket.receivedCloseCode = s;
                    realWebSocket.receivedCloseReason = str;
                }
                realWebSocket.listener.onClosing(realWebSocket, s, str);
                this.receivedCloseFrame = true;
                return;
            case 9:
                RealWebSocket realWebSocket2 = this.frameCallback;
                Buffer buffer2 = this.controlFrameBuffer;
                ByteString readByteString = buffer2.readByteString(buffer2.size);
                synchronized (realWebSocket2) {
                    try {
                        readByteString.getClass();
                        if (!realWebSocket2.failed && (!realWebSocket2.enqueuedClose || !realWebSocket2.messageAndCloseQueue.isEmpty())) {
                            realWebSocket2.pongQueue.add(readByteString);
                            realWebSocket2.runWriter();
                            return;
                        }
                        return;
                    } finally {
                    }
                }
            case 10:
                RealWebSocket realWebSocket3 = this.frameCallback;
                Buffer buffer3 = this.controlFrameBuffer;
                ByteString readByteString2 = buffer3.readByteString(buffer3.size);
                synchronized (realWebSocket3) {
                    readByteString2.getClass();
                    realWebSocket3.awaitingPong = false;
                }
                return;
            default:
                int i = this.opcode;
                TimeZone timeZone = _UtilJvmKt.UTC;
                String hexString = Integer.toHexString(i);
                hexString.getClass();
                throw new ProtocolException("Unknown control opcode: ".concat(hexString));
        }
    }

    public final void readHeader() {
        boolean z;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        if (this.receivedCloseFrame) {
            a$$ExternalSyntheticBUOutline0.m$4("closed");
            return;
        }
        BufferedSource bufferedSource = this.source;
        long timeoutNanos = bufferedSource.timeout().timeoutNanos();
        bufferedSource.timeout().clearTimeout();
        try {
            byte readByte = bufferedSource.readByte();
            byte[] bArr = _UtilCommonKt.EMPTY_BYTE_ARRAY;
            bufferedSource.timeout().timeout(timeoutNanos, timeUnit);
            int i = readByte & 15;
            this.opcode = i;
            boolean z2 = (readByte & 128) != 0;
            this.isFinalFrame = z2;
            boolean z3 = (readByte & 8) != 0;
            this.isControlFrame = z3;
            if (z3 && !z2) {
                throw new ProtocolException("Control frames must be final.");
            }
            boolean z4 = (readByte & 64) != 0;
            if (i == 1 || i == 2) {
                if (!z4) {
                    z = false;
                } else {
                    if (!this.perMessageDeflate) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                    z = true;
                }
                this.readingCompressedMessage = z;
            } else if (z4) {
                throw new ProtocolException("Unexpected rsv1 flag");
            }
            if ((readByte & PnmConstants.PNM_SEPARATOR) != 0) {
                throw new ProtocolException("Unexpected rsv2 flag");
            }
            if ((readByte & 16) != 0) {
                throw new ProtocolException("Unexpected rsv3 flag");
            }
            byte readByte2 = bufferedSource.readByte();
            boolean z5 = (readByte2 & 128) != 0;
            if (z5) {
                throw new ProtocolException("Server-sent frames must not be masked.");
            }
            long j = readByte2 & Byte.MAX_VALUE;
            this.frameLength = j;
            if (j == 126) {
                this.frameLength = bufferedSource.readShort() & HPKE.aead_EXPORT_ONLY;
            } else if (j == 127) {
                long readLong = bufferedSource.readLong();
                this.frameLength = readLong;
                if (readLong < 0) {
                    long j2 = this.frameLength;
                    TimeZone timeZone = _UtilJvmKt.UTC;
                    String hexString = Long.toHexString(j2);
                    hexString.getClass();
                    throw new ProtocolException("Frame length 0x" + hexString + " > 0x7FFFFFFFFFFFFFFF");
                }
            }
            if (this.isControlFrame && this.frameLength > 125) {
                throw new ProtocolException("Control frame must be less than 125B.");
            }
            if (z5) {
                byte[] bArr2 = this.maskKey;
                bArr2.getClass();
                bufferedSource.readFully(bArr2);
            }
        } catch (Throwable th) {
            bufferedSource.timeout().timeout(timeoutNanos, timeUnit);
            throw th;
        }
    }
}
