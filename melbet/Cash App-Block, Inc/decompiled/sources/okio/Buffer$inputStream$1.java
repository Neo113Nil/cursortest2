package okio;

import com.google.android.gms.internal.measurement.zzacv;
import com.google.android.gms.internal.measurement.zzmu;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.DataFormatException;

/* loaded from: classes9.dex */
public final class Buffer$inputStream$1 extends InputStream {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object this$0;

    public Buffer$inputStream$1(zzmu zzmuVar, zzacv zzacvVar) {
        this.$r8$classId = 2;
        this.this$0 = zzacvVar;
    }

    private final void close$okio$Buffer$inputStream$1() {
    }

    @Override // java.io.InputStream
    public int available() {
        switch (this.$r8$classId) {
            case 0:
                return (int) Math.min(((Buffer) this.this$0).size, 2147483647L);
            default:
                return super.available();
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        switch (this.$r8$classId) {
            case 0:
                break;
            default:
                super.close();
                break;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.$r8$classId;
        Object obj = this.this$0;
        switch (i3) {
            case 0:
                bArr.getClass();
                return ((Buffer) obj).read(bArr, i, i2);
            case 1:
                zzmu zzmuVar = (zzmu) obj;
                try {
                    int inflate = zzmuVar.zza.inflate(bArr, i, i2);
                    if (inflate > 0) {
                        return inflate;
                    }
                    if (i2 == 0) {
                        return 0;
                    }
                    if (zzmuVar.zza.getRemaining() == 0) {
                        return -1;
                    }
                    int remaining = zzmuVar.zza.getRemaining();
                    StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 70 + String.valueOf(remaining).length());
                    sb.append("Read no bytes (requested up to ");
                    sb.append(i2);
                    sb.append(") but did not reach end of stream, had ");
                    sb.append(remaining);
                    throw new IOException(sb.toString());
                } catch (DataFormatException e) {
                    throw new IOException(e);
                }
            default:
                return ((zzacv) obj).zzK(i, i2, bArr);
        }
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        switch (this.$r8$classId) {
            case 2:
                if (j <= 0) {
                    return 0L;
                }
                int i = j > 2147483647L ? Integer.MAX_VALUE : (int) j;
                ((zzacv) this.this$0).zzL(i);
                return i;
            default:
                return super.skip(j);
        }
    }

    public String toString() {
        switch (this.$r8$classId) {
            case 0:
                return ((Buffer) this.this$0) + ".inputStream()";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ Buffer$inputStream$1(Closeable closeable, int i) {
        this.$r8$classId = i;
        this.this$0 = closeable;
    }

    @Override // java.io.InputStream
    public final int read() {
        int i = this.$r8$classId;
        Object obj = this.this$0;
        switch (i) {
            case 0:
                Buffer buffer = (Buffer) obj;
                if (buffer.size > 0) {
                    return buffer.readByte() & 255;
                }
                return -1;
            case 1:
                byte[] bArr = new byte[1];
                if (read(bArr, 0, 1) == -1) {
                    return -1;
                }
                return bArr[0];
            default:
                byte[] bArr2 = new byte[1];
                if (((zzacv) obj).zzK(0, 1, bArr2) == -1) {
                    return -1;
                }
                return bArr2[0];
        }
    }
}
