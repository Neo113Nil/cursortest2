package c8;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public long f2012d;

    /* renamed from: e, reason: collision with root package name */
    public long f2013e;

    /* renamed from: a, reason: collision with root package name */
    public final ByteBuffer f2009a = ByteBuffer.allocate(23).order(ByteOrder.LITTLE_ENDIAN);

    /* renamed from: b, reason: collision with root package name */
    public final int f2010b = 16;

    /* renamed from: c, reason: collision with root package name */
    public final int f2011c = 16;

    /* renamed from: f, reason: collision with root package name */
    public int f2014f = 0;

    public d() {
        long j = 0;
        this.f2012d = j;
        this.f2013e = j;
    }

    public final void a() {
        ByteBuffer byteBuffer = this.f2009a;
        byteBuffer.flip();
        while (byteBuffer.remaining() >= this.f2011c) {
            b(byteBuffer);
        }
        byteBuffer.compact();
    }

    public final void b(ByteBuffer byteBuffer) {
        long j = byteBuffer.getLong();
        long j3 = byteBuffer.getLong();
        long rotateLeft = (Long.rotateLeft(j * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.f2012d;
        this.f2012d = rotateLeft;
        long rotateLeft2 = Long.rotateLeft(rotateLeft, 27);
        long j10 = this.f2013e;
        this.f2012d = ((rotateLeft2 + j10) * 5) + 1390208809;
        long rotateLeft3 = (Long.rotateLeft(j3 * 5545529020109919103L, 33) * (-8663945395140668459L)) ^ j10;
        this.f2013e = rotateLeft3;
        this.f2013e = ((Long.rotateLeft(rotateLeft3, 31) + this.f2012d) * 5) + 944331445;
        this.f2014f += 16;
    }

    public final d c(byte[] bArr) {
        ByteBuffer order = ByteBuffer.wrap(bArr, 0, bArr.length).order(ByteOrder.LITTLE_ENDIAN);
        int remaining = order.remaining();
        ByteBuffer byteBuffer = this.f2009a;
        if (remaining <= byteBuffer.remaining()) {
            byteBuffer.put(order);
            if (byteBuffer.remaining() < 8) {
                a();
            }
            return this;
        }
        int position = this.f2010b - byteBuffer.position();
        for (int i3 = 0; i3 < position; i3++) {
            byteBuffer.put(order.get());
        }
        a();
        while (order.remaining() >= this.f2011c) {
            b(order);
        }
        byteBuffer.put(order);
        return this;
    }
}
