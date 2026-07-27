package p2;

import G1.j;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedBlockingQueue f9109a;

    /* renamed from: b, reason: collision with root package name */
    public final Random f9110b = new Random();

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f9111c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9112d = false;

    /* renamed from: e, reason: collision with root package name */
    public final e f9113e;

    /* renamed from: f, reason: collision with root package name */
    public WritableByteChannel f9114f;

    /* renamed from: g, reason: collision with root package name */
    public final Thread f9115g;

    public h(e eVar, int i2) {
        Thread newThread = e.f9090n.newThread(new j(7, this));
        this.f9115g = newThread;
        e.f9091o.getClass();
        newThread.setName("TubeSockWriter-" + i2);
        this.f9113e = eVar;
        this.f9109a = new LinkedBlockingQueue();
    }

    public final ByteBuffer a(byte b4, byte[] bArr) {
        int length = bArr.length;
        ByteBuffer allocate = ByteBuffer.allocate(bArr.length + (length < 126 ? 6 : length <= 65535 ? 8 : 14));
        allocate.put((byte) (b4 | Byte.MIN_VALUE));
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
        this.f9110b.nextBytes(bArr2);
        allocate.put(bArr2);
        for (int i2 = 0; i2 < bArr.length; i2++) {
            allocate.put((byte) (bArr[i2] ^ bArr2[i2 % 4]));
        }
        allocate.flip();
        return allocate;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001e, code lost:
    
        r2.f9112d = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void b(byte b4, byte[] bArr) {
        try {
            ByteBuffer a4 = a(b4, bArr);
            if (this.f9111c && (this.f9112d || b4 != 8)) {
                throw new f("Shouldn't be sending");
            }
            this.f9109a.add(a4);
        } catch (Throwable th) {
            throw th;
        }
    }
}
