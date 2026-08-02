package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class hox extends how {
    public final ByteBuffer a = ByteBuffer.allocate(23).order(ByteOrder.LITTLE_ENDIAN);

    protected hox() {
    }

    private final void j() {
        ByteBuffer byteBuffer = this.a;
        byteBuffer.flip();
        while (byteBuffer.remaining() >= 16) {
            h(byteBuffer);
        }
        byteBuffer.compact();
    }

    @Override // defpackage.how, defpackage.hpc
    public final void b(byte[] bArr, int i) {
        ByteBuffer order = ByteBuffer.wrap(bArr, 0, i).order(ByteOrder.LITTLE_ENDIAN);
        int remaining = order.remaining();
        ByteBuffer byteBuffer = this.a;
        if (remaining <= byteBuffer.remaining()) {
            byteBuffer.put(order);
            g();
            return;
        }
        int position = 16 - byteBuffer.position();
        for (int i2 = 0; i2 < position; i2++) {
            byteBuffer.put(order.get());
        }
        j();
        while (order.remaining() >= 16) {
            h(order);
        }
        byteBuffer.put(order);
    }

    protected abstract hpa f();

    public final void g() {
        if (this.a.remaining() < 8) {
            j();
        }
    }

    protected abstract void h(ByteBuffer byteBuffer);

    protected void i(ByteBuffer byteBuffer) {
        throw null;
    }

    @Override // defpackage.hpc
    public final hpa k() {
        j();
        ByteBuffer byteBuffer = this.a;
        byteBuffer.flip();
        if (byteBuffer.remaining() > 0) {
            i(byteBuffer);
            byteBuffer.position(byteBuffer.limit());
        }
        return f();
    }
}
