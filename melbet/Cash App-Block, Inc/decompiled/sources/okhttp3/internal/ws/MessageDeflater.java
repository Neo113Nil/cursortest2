package okhttp3.internal.ws;

import java.io.Closeable;
import java.util.zip.Deflater;
import okio.Buffer;
import okio.DeflaterSink;
import okio.InflaterSource;
import okio.RealBufferedSink;

/* loaded from: classes9.dex */
public final class MessageDeflater implements Closeable {
    public final /* synthetic */ int $r8$classId;
    public final Buffer deflatedBytes;
    public Object deflater;
    public Closeable deflaterSink;
    public final boolean noContextTakeover;

    public MessageDeflater(boolean z, int i) {
        this.$r8$classId = i;
        switch (i) {
            case 1:
                this.noContextTakeover = z;
                this.deflatedBytes = new Buffer();
                break;
            default:
                this.noContextTakeover = z;
                Buffer buffer = new Buffer();
                this.deflatedBytes = buffer;
                Deflater deflater = new Deflater(-1, true);
                this.deflater = deflater;
                this.deflaterSink = new DeflaterSink(new RealBufferedSink(buffer), deflater);
                break;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.$r8$classId) {
            case 0:
                ((DeflaterSink) this.deflaterSink).close();
                break;
            default:
                InflaterSource inflaterSource = (InflaterSource) this.deflaterSink;
                if (inflaterSource != null) {
                    inflaterSource.close();
                }
                this.deflaterSink = null;
                this.deflater = null;
                break;
        }
    }
}
