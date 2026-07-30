package f7;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b extends g7.e {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3442k = AtomicIntegerFieldUpdater.newUpdater(b.class, "consumed$volatile");
    private volatile /* synthetic */ int consumed$volatile;

    /* renamed from: i, reason: collision with root package name */
    public final e7.t f3443i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f3444j;

    public /* synthetic */ b(e7.t tVar, boolean z8) {
        this(tVar, z8, h6.j.f4661f, -3, e7.a.f2833f);
    }

    @Override // g7.e, f7.f
    public final Object b(g gVar, h6.d dVar) {
        int i7 = this.f4484g;
        i6.a aVar = i6.a.f4956f;
        if (i7 == -3) {
            boolean z8 = this.f3444j;
            if (z8 && f3442k.getAndSet(this, 1) != 0) {
                throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
            }
            Object i8 = f0.i(gVar, this.f3443i, z8, dVar);
            if (i8 == aVar) {
                return i8;
            }
        } else {
            Object b9 = super.b(gVar, dVar);
            if (b9 == aVar) {
                return b9;
            }
        }
        return d6.z.f2639a;
    }

    @Override // g7.e
    public final String c() {
        return "channel=" + this.f3443i;
    }

    @Override // g7.e
    public final Object d(e7.r rVar, a0.e0 e0Var) {
        Object i7 = f0.i(new g7.y(rVar), this.f3443i, this.f3444j, e0Var);
        return i7 == i6.a.f4956f ? i7 : d6.z.f2639a;
    }

    @Override // g7.e
    public final g7.e e(h6.i iVar, int i7, e7.a aVar) {
        return new b(this.f3443i, this.f3444j, iVar, i7, aVar);
    }

    @Override // g7.e
    public final f f() {
        return new b(this.f3443i, this.f3444j);
    }

    @Override // g7.e
    public final e7.t g(c7.x xVar) {
        if (!this.f3444j || f3442k.getAndSet(this, 1) == 0) {
            return this.f4484g == -3 ? this.f3443i : super.g(xVar);
        }
        throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
    }

    public b(e7.t tVar, boolean z8, h6.i iVar, int i7, e7.a aVar) {
        super(iVar, i7, aVar);
        this.f3443i = tVar;
        this.f3444j = z8;
        this.consumed$volatile = 0;
    }
}
