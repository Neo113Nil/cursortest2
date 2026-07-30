package u5;

import androidx.room.o;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedBlockingQueue f9081a;

    /* renamed from: b, reason: collision with root package name */
    public final Random f9082b = new Random();

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f9083c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9084d = false;

    /* renamed from: e, reason: collision with root package name */
    public final d f9085e;

    /* renamed from: f, reason: collision with root package name */
    public WritableByteChannel f9086f;

    /* renamed from: g, reason: collision with root package name */
    public final Thread f9087g;

    public g(d dVar, int i7) {
        Thread newThread = d.f9062n.newThread(new o(9, this));
        this.f9087g = newThread;
        d.f9063o.getClass();
        newThread.setName("TubeSockWriter-" + i7);
        this.f9085e = dVar;
        this.f9081a = new LinkedBlockingQueue();
    }

    public final ByteBuffer a(byte b9, byte[] bArr) {
        int length = bArr.length;
        ByteBuffer allocate = ByteBuffer.allocate(bArr.length + (length < 126 ? 6 : length <= 65535 ? 8 : 14));
        allocate.put((byte) (b9 | Byte.MIN_VALUE));
        if (length < 126) {
            allocate.put((byte) (length | 128));
        } else if (length <= 65535) {
            allocate.put((byte) 254);
            allocate.putShort((short) length);
        } else {
            allocate.put((byte) 255);
            allocate.putInt(0);
            allocate.putInt(length);
        }
        byte[] bArr2 = new byte[4];
        this.f9082b.nextBytes(bArr2);
        allocate.put(bArr2);
        for (int i7 = 0; i7 < bArr.length; i7++) {
            allocate.put((byte) (bArr[i7] ^ bArr2[i7 % 4]));
        }
        allocate.flip();
        return allocate;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001e, code lost:
    
        r2.f9084d = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void b(byte b9, byte[] bArr) {
        try {
            ByteBuffer a3 = a(b9, bArr);
            if (this.f9083c && (this.f9084d || b9 != 8)) {
                throw new e("Shouldn't be sending");
            }
            this.f9081a.add(a3);
        } catch (Throwable th) {
            throw th;
        }
    }
}
