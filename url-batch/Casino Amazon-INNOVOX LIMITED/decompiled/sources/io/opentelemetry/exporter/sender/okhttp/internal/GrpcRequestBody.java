package io.opentelemetry.exporter.sender.okhttp.internal;

import io.opentelemetry.exporter.internal.compression.Compressor;
import io.opentelemetry.exporter.internal.marshal.Marshaler;
import java.io.IOException;
import javax.annotation.Nullable;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.Buffer;
import okio.BufferedSink;
import okio.Okio;

/* loaded from: classes3.dex */
public final class GrpcRequestBody extends RequestBody {
    private static final byte COMPRESSED_FLAG = 1;
    private static final MediaType GRPC_MEDIA_TYPE = MediaType.parse("application/grpc");
    private static final int HEADER_LENGTH = 5;
    private static final byte UNCOMPRESSED_FLAG = 0;

    @Nullable
    private final Compressor compressor;
    private final int contentLength;
    private final Marshaler marshaler;
    private final int messageSize;

    public GrpcRequestBody(Marshaler marshaler, @Nullable Compressor compressor) {
        this.marshaler = marshaler;
        this.compressor = compressor;
        int binarySerializedSize = marshaler.getBinarySerializedSize();
        this.messageSize = binarySerializedSize;
        if (compressor != null) {
            this.contentLength = -1;
        } else {
            this.contentLength = binarySerializedSize + 5;
        }
    }

    @Override // okhttp3.RequestBody
    @Nullable
    /* renamed from: contentType */
    public MediaType get$contentType() {
        return GRPC_MEDIA_TYPE;
    }

    @Override // okhttp3.RequestBody
    public long contentLength() {
        return this.contentLength;
    }

    @Override // okhttp3.RequestBody
    public void writeTo(BufferedSink bufferedSink) throws IOException {
        if (this.compressor == null) {
            bufferedSink.writeByte(0);
            bufferedSink.writeInt(this.messageSize);
            this.marshaler.writeBinaryTo(bufferedSink.outputStream());
            return;
        }
        Buffer buffer = new Buffer();
        try {
            BufferedSink buffer2 = Okio.buffer(Okio.sink(this.compressor.compress(buffer.outputStream())));
            try {
                this.marshaler.writeBinaryTo(buffer2.outputStream());
                if (buffer2 != null) {
                    buffer2.close();
                }
                bufferedSink.writeByte(1);
                int size = (int) buffer.size();
                bufferedSink.writeInt(size);
                bufferedSink.write(buffer, size);
                buffer.close();
            } finally {
            }
        } catch (Throwable th) {
            try {
                buffer.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
