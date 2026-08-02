package defpackage;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bhl implements bhk {
    private final /* synthetic */ int a;
    private final Object b;

    public bhl(ByteBuffer byteBuffer, int i) {
        this.a = i;
        this.b = byteBuffer;
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
    }

    @Override // defpackage.bhk
    public final int a() {
        int d;
        short d2;
        if (this.a != 0) {
            d = d() << 8;
            d2 = d();
        } else {
            d = d() << 8;
            d2 = d();
        }
        return d2 | d;
    }

    @Override // defpackage.bhk
    public final int b(byte[] bArr, int i) {
        int i2 = 0;
        if (this.a != 0) {
            ByteBuffer byteBuffer = (ByteBuffer) this.b;
            int min = Math.min(i, byteBuffer.remaining());
            if (min == 0) {
                return -1;
            }
            byteBuffer.get(bArr, 0, min);
            return min;
        }
        int i3 = 0;
        while (i2 < i) {
            i3 = ((InputStream) this.b).read(bArr, i2, i - i2);
            if (i3 == -1) {
                break;
            }
            i2 += i3;
        }
        if (i2 == 0 && i3 == -1) {
            throw new bhj();
        }
        return i2;
    }

    @Override // defpackage.bhk
    public final long c(long j) {
        if (this.a != 0) {
            ByteBuffer byteBuffer = (ByteBuffer) this.b;
            int min = (int) Math.min(byteBuffer.remaining(), j);
            byteBuffer.position(byteBuffer.position() + min);
            return min;
        }
        if (j < 0) {
            return 0L;
        }
        long j2 = j;
        while (j2 > 0) {
            InputStream inputStream = (InputStream) this.b;
            long skip = inputStream.skip(j2);
            if (skip > 0) {
                j2 -= skip;
            } else {
                if (inputStream.read() == -1) {
                    break;
                }
                j2--;
            }
        }
        return j - j2;
    }

    @Override // defpackage.bhk
    public final short d() {
        int i = this.a;
        Object obj = this.b;
        if (i != 0) {
            ByteBuffer byteBuffer = (ByteBuffer) obj;
            if (byteBuffer.remaining() > 0) {
                return (short) (byteBuffer.get() & 255);
            }
            throw new bhj();
        }
        int read = ((InputStream) obj).read();
        if (read != -1) {
            return (short) read;
        }
        throw new bhj();
    }

    public bhl(InputStream inputStream, int i) {
        this.a = i;
        this.b = inputStream;
    }
}
