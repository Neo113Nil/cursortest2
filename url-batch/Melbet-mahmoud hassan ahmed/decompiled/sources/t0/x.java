package t0;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import t0.g;

/* loaded from: classes.dex */
public abstract class x implements g {

    /* renamed from: b, reason: collision with root package name */
    protected g.a f21877b;

    /* renamed from: c, reason: collision with root package name */
    protected g.a f21878c;

    /* renamed from: d, reason: collision with root package name */
    private g.a f21879d;

    /* renamed from: e, reason: collision with root package name */
    private g.a f21880e;

    /* renamed from: f, reason: collision with root package name */
    private ByteBuffer f21881f;

    /* renamed from: g, reason: collision with root package name */
    private ByteBuffer f21882g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f21883h;

    public x() {
        ByteBuffer byteBuffer = g.f21740a;
        this.f21881f = byteBuffer;
        this.f21882g = byteBuffer;
        g.a aVar = g.a.f21741e;
        this.f21879d = aVar;
        this.f21880e = aVar;
        this.f21877b = aVar;
        this.f21878c = aVar;
    }

    @Override // t0.g
    public final void a() {
        flush();
        this.f21881f = g.f21740a;
        g.a aVar = g.a.f21741e;
        this.f21879d = aVar;
        this.f21880e = aVar;
        this.f21877b = aVar;
        this.f21878c = aVar;
        l();
    }

    @Override // t0.g
    public boolean b() {
        return this.f21880e != g.a.f21741e;
    }

    @Override // t0.g
    public boolean c() {
        return this.f21883h && this.f21882g == g.f21740a;
    }

    @Override // t0.g
    public ByteBuffer d() {
        ByteBuffer byteBuffer = this.f21882g;
        this.f21882g = g.f21740a;
        return byteBuffer;
    }

    @Override // t0.g
    public final void e() {
        this.f21883h = true;
        k();
    }

    @Override // t0.g
    public final void flush() {
        this.f21882g = g.f21740a;
        this.f21883h = false;
        this.f21877b = this.f21879d;
        this.f21878c = this.f21880e;
        j();
    }

    @Override // t0.g
    public final g.a g(g.a aVar) {
        this.f21879d = aVar;
        this.f21880e = i(aVar);
        return b() ? this.f21880e : g.a.f21741e;
    }

    protected final boolean h() {
        return this.f21882g.hasRemaining();
    }

    protected abstract g.a i(g.a aVar);

    protected void j() {
    }

    protected void k() {
    }

    protected void l() {
    }

    protected final ByteBuffer m(int i7) {
        if (this.f21881f.capacity() < i7) {
            this.f21881f = ByteBuffer.allocateDirect(i7).order(ByteOrder.nativeOrder());
        } else {
            this.f21881f.clear();
        }
        ByteBuffer byteBuffer = this.f21881f;
        this.f21882g = byteBuffer;
        return byteBuffer;
    }
}
