package okhttp3.internal.huc;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okio.d;
import okio.y0;

/* loaded from: classes5.dex */
abstract class OutputStreamRequestBody extends RequestBody {
    boolean closed;
    private long expectedContentLength;
    private OutputStream outputStream;
    private y0 timeout;

    OutputStreamRequestBody() {
    }

    @Override // okhttp3.RequestBody
    public long contentLength() {
        return this.expectedContentLength;
    }

    @Override // okhttp3.RequestBody
    public final MediaType contentType() {
        return null;
    }

    protected void initOutputStream(final d dVar, final long j8) {
        this.timeout = dVar.timeout();
        this.expectedContentLength = j8;
        this.outputStream = new OutputStream() { // from class: okhttp3.internal.huc.OutputStreamRequestBody.1
            private long bytesReceived;

            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                OutputStreamRequestBody.this.closed = true;
                long j9 = j8;
                if (j9 == -1 || this.bytesReceived >= j9) {
                    dVar.close();
                    return;
                }
                throw new ProtocolException("expected " + j8 + " bytes but received " + this.bytesReceived);
            }

            @Override // java.io.OutputStream, java.io.Flushable
            public void flush() {
                if (OutputStreamRequestBody.this.closed) {
                    return;
                }
                dVar.flush();
            }

            @Override // java.io.OutputStream
            public void write(int i8) {
                write(new byte[]{(byte) i8}, 0, 1);
            }

            @Override // java.io.OutputStream
            public void write(byte[] bArr, int i8, int i9) {
                if (OutputStreamRequestBody.this.closed) {
                    throw new IOException("closed");
                }
                long j9 = j8;
                if (j9 == -1 || this.bytesReceived + i9 <= j9) {
                    this.bytesReceived += i9;
                    try {
                        dVar.write(bArr, i8, i9);
                        return;
                    } catch (InterruptedIOException e8) {
                        throw new SocketTimeoutException(e8.getMessage());
                    }
                }
                throw new ProtocolException("expected " + j8 + " bytes but received " + this.bytesReceived + i9);
            }
        };
    }

    public final boolean isClosed() {
        return this.closed;
    }

    public final OutputStream outputStream() {
        return this.outputStream;
    }

    public Request prepareToSendRequest(Request request) {
        return request;
    }

    public final y0 timeout() {
        return this.timeout;
    }
}
