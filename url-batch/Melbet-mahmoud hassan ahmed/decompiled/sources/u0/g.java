package u0;

import java.nio.ByteBuffer;
import r0.p1;

/* loaded from: classes.dex */
public class g extends u0.a {

    /* renamed from: g, reason: collision with root package name */
    public final c f22410g;

    /* renamed from: h, reason: collision with root package name */
    public ByteBuffer f22411h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f22412i;

    /* renamed from: j, reason: collision with root package name */
    public long f22413j;

    /* renamed from: k, reason: collision with root package name */
    public ByteBuffer f22414k;

    /* renamed from: l, reason: collision with root package name */
    private final int f22415l;

    /* renamed from: m, reason: collision with root package name */
    private final int f22416m;

    public static final class a extends IllegalStateException {

        /* renamed from: f, reason: collision with root package name */
        public final int f22417f;

        /* renamed from: g, reason: collision with root package name */
        public final int f22418g;

        public a(int i7, int i8) {
            super("Buffer too small (" + i7 + " < " + i8 + ")");
            this.f22417f = i7;
            this.f22418g = i8;
        }
    }

    static {
        p1.a("goog.exo.decoder");
    }

    public g(int i7) {
        this(i7, 0);
    }

    public g(int i7, int i8) {
        this.f22410g = new c();
        this.f22415l = i7;
        this.f22416m = i8;
    }

    private ByteBuffer q(int i7) {
        int i8 = this.f22415l;
        if (i8 == 1) {
            return ByteBuffer.allocate(i7);
        }
        if (i8 == 2) {
            return ByteBuffer.allocateDirect(i7);
        }
        ByteBuffer byteBuffer = this.f22411h;
        throw new a(byteBuffer == null ? 0 : byteBuffer.capacity(), i7);
    }

    public static g u() {
        return new g(0);
    }

    @Override // u0.a
    public void h() {
        super.h();
        ByteBuffer byteBuffer = this.f22411h;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f22414k;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f22412i = false;
    }

    public void r(int i7) {
        int i8 = i7 + this.f22416m;
        ByteBuffer byteBuffer = this.f22411h;
        if (byteBuffer == null) {
            this.f22411h = q(i8);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i9 = i8 + position;
        if (capacity >= i9) {
            this.f22411h = byteBuffer;
            return;
        }
        ByteBuffer q7 = q(i9);
        q7.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            q7.put(byteBuffer);
        }
        this.f22411h = q7;
    }

    public final void s() {
        ByteBuffer byteBuffer = this.f22411h;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f22414k;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final boolean t() {
        return j(1073741824);
    }

    public void v(int i7) {
        ByteBuffer byteBuffer = this.f22414k;
        if (byteBuffer == null || byteBuffer.capacity() < i7) {
            this.f22414k = ByteBuffer.allocate(i7);
        } else {
            this.f22414k.clear();
        }
    }
}
