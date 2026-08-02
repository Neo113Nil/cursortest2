package defpackage;

import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lhm extends UploadDataProvider {
    private final ByteBuffer a;

    public lhm(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
    }

    @Override // org.chromium.net.UploadDataProvider
    public final long getLength() {
        return this.a.limit();
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            throw new IllegalStateException("Cronet passed a buffer with no bytes remaining");
        }
        int remaining = byteBuffer.remaining();
        ByteBuffer byteBuffer2 = this.a;
        if (remaining >= byteBuffer2.remaining()) {
            byteBuffer.put(byteBuffer2);
        } else {
            int limit = byteBuffer2.limit();
            byteBuffer.put(byteBuffer2);
        }
        uploadDataSink.onReadSucceeded(false);
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void rewind(UploadDataSink uploadDataSink) {
        uploadDataSink.onRewindSucceeded();
    }
}
