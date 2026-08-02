package Z;

import E.AbstractC0005f;
import T.A;
import T.C0097o;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class f extends X.e {

    /* renamed from: c, reason: collision with root package name */
    public C0097o f3779c;

    /* renamed from: d, reason: collision with root package name */
    public final b f3780d = new b();

    /* renamed from: e, reason: collision with root package name */
    public ByteBuffer f3781e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3782f;

    /* renamed from: g, reason: collision with root package name */
    public long f3783g;

    /* renamed from: h, reason: collision with root package name */
    public ByteBuffer f3784h;

    /* renamed from: i, reason: collision with root package name */
    public final int f3785i;

    static {
        A.a("media3.decoder");
    }

    public f(int i4) {
        this.f3785i = i4;
    }

    public void h() {
        this.f3496b = 0;
        ByteBuffer byteBuffer = this.f3781e;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f3784h;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f3782f = false;
    }

    public final ByteBuffer i(int i4) {
        int i5 = this.f3785i;
        if (i5 == 1) {
            return ByteBuffer.allocate(i4);
        }
        if (i5 == 2) {
            return ByteBuffer.allocateDirect(i4);
        }
        ByteBuffer byteBuffer = this.f3781e;
        throw new e(AbstractC0005f.l("Buffer too small (", byteBuffer == null ? 0 : byteBuffer.capacity(), " < ", i4, ")"));
    }

    public final void j(int i4) {
        ByteBuffer byteBuffer = this.f3781e;
        if (byteBuffer == null) {
            this.f3781e = i(i4);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i5 = i4 + position;
        if (capacity >= i5) {
            this.f3781e = byteBuffer;
            return;
        }
        ByteBuffer i6 = i(i5);
        i6.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            i6.put(byteBuffer);
        }
        this.f3781e = i6;
    }

    public final void k() {
        ByteBuffer byteBuffer = this.f3781e;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f3784h;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
