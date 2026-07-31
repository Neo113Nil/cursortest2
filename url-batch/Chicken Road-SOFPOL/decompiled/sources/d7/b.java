package d7;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class b extends e7.e {
    public static final /* synthetic */ AtomicIntegerFieldUpdater i = AtomicIntegerFieldUpdater.newUpdater(b.class, "consumed$volatile");
    private volatile /* synthetic */ int consumed$volatile;

    /* renamed from: g, reason: collision with root package name */
    public final c7.q f2335g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f2336h;

    public /* synthetic */ b(c7.q qVar, boolean z3) {
        this(qVar, z3, g6.i.f3046d, -3, c7.a.f1760d);
    }

    @Override // e7.e
    public final String a() {
        return "channel=" + this.f2335g;
    }

    @Override // d7.f
    public final Object c(g gVar, g6.c cVar) {
        int i8 = this.f2546e;
        h6.a aVar = h6.a.f3204d;
        c6.m mVar = c6.m.f1757a;
        if (i8 == -3) {
            boolean z3 = this.f2336h;
            if (z3 && i.getAndSet(this, 1) != 0) {
                throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
            }
            Object g3 = e0.g(gVar, this.f2335g, z3, cVar);
            if (g3 == aVar) {
                return g3;
            }
        } else {
            Object b8 = a7.x.b(new b0.c(gVar, this, null, 4), cVar);
            if (b8 != aVar) {
                b8 = mVar;
            }
            if (b8 == aVar) {
                return b8;
            }
        }
        return mVar;
    }

    @Override // e7.e
    public final Object d(c7.p pVar, b0.d dVar) {
        Object g3 = e0.g(new e7.t(pVar), this.f2335g, this.f2336h, dVar);
        return g3 == h6.a.f3204d ? g3 : c6.m.f1757a;
    }

    @Override // e7.e
    public final e7.e e(g6.h hVar, int i8, c7.a aVar) {
        return new b(this.f2335g, this.f2336h, hVar, i8, aVar);
    }

    @Override // e7.e
    public final f f() {
        return new b(this.f2335g, this.f2336h);
    }

    @Override // e7.e
    public final c7.q g(a7.u uVar) {
        if (!this.f2336h || i.getAndSet(this, 1) == 0) {
            return this.f2546e == -3 ? this.f2335g : super.g(uVar);
        }
        throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
    }

    public b(c7.q qVar, boolean z3, g6.h hVar, int i8, c7.a aVar) {
        super(hVar, i8, aVar);
        this.f2335g = qVar;
        this.f2336h = z3;
        this.consumed$volatile = 0;
    }
}
