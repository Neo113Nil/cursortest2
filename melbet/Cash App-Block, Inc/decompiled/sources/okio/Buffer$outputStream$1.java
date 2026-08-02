package okio;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.libraries.places.internal.zzccs;
import java.io.OutputStream;

/* loaded from: classes9.dex */
public final class Buffer$outputStream$1 extends OutputStream {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object this$0;

    public /* synthetic */ Buffer$outputStream$1(Object obj, int i) {
        this.$r8$classId = i;
        this.this$0 = obj;
    }

    private final void close$okio$Buffer$outputStream$1() {
    }

    private final void flush$okio$Buffer$outputStream$1() {
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        switch (this.$r8$classId) {
            case 0:
                break;
            case 1:
            default:
                super.close();
                break;
            case 2:
                ((RealBufferedSink) this.this$0).close();
                break;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        switch (this.$r8$classId) {
            case 0:
                break;
            case 1:
            default:
                super.flush();
                break;
            case 2:
                RealBufferedSink realBufferedSink = (RealBufferedSink) this.this$0;
                if (!realBufferedSink.closed) {
                    realBufferedSink.flush();
                    break;
                }
                break;
        }
    }

    public String toString() {
        int i = this.$r8$classId;
        Object obj = this.this$0;
        switch (i) {
            case 0:
                return ((Buffer) obj) + ".outputStream()";
            case 1:
            default:
                return super.toString();
            case 2:
                return ((RealBufferedSink) obj) + ".outputStream()";
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        int i2 = this.$r8$classId;
        Object obj = this.this$0;
        switch (i2) {
            case 0:
                ((Buffer) obj).m4335writeByte(i);
                break;
            case 1:
                ((zzccs) obj).zzk(0, 1, new byte[]{(byte) i});
                break;
            default:
                RealBufferedSink realBufferedSink = (RealBufferedSink) obj;
                if (!realBufferedSink.closed) {
                    realBufferedSink.bufferField.m4335writeByte((int) ((byte) i));
                    realBufferedSink.emitCompleteSegments();
                    break;
                } else {
                    a$$ExternalSyntheticBUOutline0.m$4("closed");
                    break;
                }
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        int i3 = this.$r8$classId;
        Object obj = this.this$0;
        switch (i3) {
            case 0:
                bArr.getClass();
                ((Buffer) obj).write(bArr, i, i2);
                break;
            case 1:
                ((zzccs) obj).zzk(i, i2, bArr);
                break;
            default:
                bArr.getClass();
                RealBufferedSink realBufferedSink = (RealBufferedSink) obj;
                if (!realBufferedSink.closed) {
                    realBufferedSink.bufferField.write(bArr, i, i2);
                    realBufferedSink.emitCompleteSegments();
                    break;
                } else {
                    a$$ExternalSyntheticBUOutline0.m$4("closed");
                    break;
                }
        }
    }
}
