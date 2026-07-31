package t0;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import o2.m0;
import t0.g;

/* loaded from: classes.dex */
public final class j0 implements g {

    /* renamed from: b, reason: collision with root package name */
    private int f21786b;

    /* renamed from: c, reason: collision with root package name */
    private float f21787c = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    private float f21788d = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    private g.a f21789e;

    /* renamed from: f, reason: collision with root package name */
    private g.a f21790f;

    /* renamed from: g, reason: collision with root package name */
    private g.a f21791g;

    /* renamed from: h, reason: collision with root package name */
    private g.a f21792h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f21793i;

    /* renamed from: j, reason: collision with root package name */
    private i0 f21794j;

    /* renamed from: k, reason: collision with root package name */
    private ByteBuffer f21795k;

    /* renamed from: l, reason: collision with root package name */
    private ShortBuffer f21796l;

    /* renamed from: m, reason: collision with root package name */
    private ByteBuffer f21797m;

    /* renamed from: n, reason: collision with root package name */
    private long f21798n;

    /* renamed from: o, reason: collision with root package name */
    private long f21799o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f21800p;

    public j0() {
        g.a aVar = g.a.f21741e;
        this.f21789e = aVar;
        this.f21790f = aVar;
        this.f21791g = aVar;
        this.f21792h = aVar;
        ByteBuffer byteBuffer = g.f21740a;
        this.f21795k = byteBuffer;
        this.f21796l = byteBuffer.asShortBuffer();
        this.f21797m = byteBuffer;
        this.f21786b = -1;
    }

    @Override // t0.g
    public void a() {
        this.f21787c = 1.0f;
        this.f21788d = 1.0f;
        g.a aVar = g.a.f21741e;
        this.f21789e = aVar;
        this.f21790f = aVar;
        this.f21791g = aVar;
        this.f21792h = aVar;
        ByteBuffer byteBuffer = g.f21740a;
        this.f21795k = byteBuffer;
        this.f21796l = byteBuffer.asShortBuffer();
        this.f21797m = byteBuffer;
        this.f21786b = -1;
        this.f21793i = false;
        this.f21794j = null;
        this.f21798n = 0L;
        this.f21799o = 0L;
        this.f21800p = false;
    }

    @Override // t0.g
    public boolean b() {
        return this.f21790f.f21742a != -1 && (Math.abs(this.f21787c - 1.0f) >= 1.0E-4f || Math.abs(this.f21788d - 1.0f) >= 1.0E-4f || this.f21790f.f21742a != this.f21789e.f21742a);
    }

    @Override // t0.g
    public boolean c() {
        i0 i0Var;
        return this.f21800p && ((i0Var = this.f21794j) == null || i0Var.k() == 0);
    }

    @Override // t0.g
    public ByteBuffer d() {
        int k7;
        i0 i0Var = this.f21794j;
        if (i0Var != null && (k7 = i0Var.k()) > 0) {
            if (this.f21795k.capacity() < k7) {
                ByteBuffer order = ByteBuffer.allocateDirect(k7).order(ByteOrder.nativeOrder());
                this.f21795k = order;
                this.f21796l = order.asShortBuffer();
            } else {
                this.f21795k.clear();
                this.f21796l.clear();
            }
            i0Var.j(this.f21796l);
            this.f21799o += k7;
            this.f21795k.limit(k7);
            this.f21797m = this.f21795k;
        }
        ByteBuffer byteBuffer = this.f21797m;
        this.f21797m = g.f21740a;
        return byteBuffer;
    }

    @Override // t0.g
    public void e() {
        i0 i0Var = this.f21794j;
        if (i0Var != null) {
            i0Var.s();
        }
        this.f21800p = true;
    }

    @Override // t0.g
    public void f(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            i0 i0Var = (i0) o2.a.e(this.f21794j);
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f21798n += remaining;
            i0Var.t(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    @Override // t0.g
    public void flush() {
        if (b()) {
            g.a aVar = this.f21789e;
            this.f21791g = aVar;
            g.a aVar2 = this.f21790f;
            this.f21792h = aVar2;
            if (this.f21793i) {
                this.f21794j = new i0(aVar.f21742a, aVar.f21743b, this.f21787c, this.f21788d, aVar2.f21742a);
            } else {
                i0 i0Var = this.f21794j;
                if (i0Var != null) {
                    i0Var.i();
                }
            }
        }
        this.f21797m = g.f21740a;
        this.f21798n = 0L;
        this.f21799o = 0L;
        this.f21800p = false;
    }

    @Override // t0.g
    public g.a g(g.a aVar) {
        if (aVar.f21744c != 2) {
            throw new g.b(aVar);
        }
        int i7 = this.f21786b;
        if (i7 == -1) {
            i7 = aVar.f21742a;
        }
        this.f21789e = aVar;
        g.a aVar2 = new g.a(i7, aVar.f21743b, 2);
        this.f21790f = aVar2;
        this.f21793i = true;
        return aVar2;
    }

    public long h(long j7) {
        if (this.f21799o >= 1024) {
            long l7 = this.f21798n - ((i0) o2.a.e(this.f21794j)).l();
            int i7 = this.f21792h.f21742a;
            int i8 = this.f21791g.f21742a;
            return i7 == i8 ? m0.N0(j7, l7, this.f21799o) : m0.N0(j7, l7 * i7, this.f21799o * i8);
        }
        double d7 = this.f21787c;
        double d8 = j7;
        Double.isNaN(d7);
        Double.isNaN(d8);
        return (long) (d7 * d8);
    }

    public void i(float f7) {
        if (this.f21788d != f7) {
            this.f21788d = f7;
            this.f21793i = true;
        }
    }

    public void j(float f7) {
        if (this.f21787c != f7) {
            this.f21787c = f7;
            this.f21793i = true;
        }
    }
}
