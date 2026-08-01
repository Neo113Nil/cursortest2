package je;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b extends ke.e {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f5138t = AtomicIntegerFieldUpdater.newUpdater(b.class, "consumed$volatile");
    private volatile /* synthetic */ int consumed$volatile;

    /* renamed from: r, reason: collision with root package name */
    public final ie.g f5139r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f5140s;

    public /* synthetic */ b(ie.g gVar, boolean z10) {
        this(gVar, z10, kotlin.coroutines.g.f5592d, -3, ie.a.f4712d);
    }

    @Override // ke.e
    public final String b() {
        return "channel=" + this.f5139r;
    }

    @Override // ke.e, je.e
    public final Object c(f fVar, ld.a aVar) {
        if (this.f5513e != -3) {
            Object c10 = super.c(fVar, aVar);
            return c10 == md.a.f6622d ? c10 : Unit.f5554a;
        }
        boolean z10 = this.f5140s;
        if (z10 && f5138t.getAndSet(this, 1) == 1) {
            kotlin.collections.i0.l("ReceiveChannel.consumeAsFlow can be collected just once");
            return null;
        }
        Object h10 = b0.h(fVar, this.f5139r, z10, aVar);
        return h10 == md.a.f6622d ? h10 : Unit.f5554a;
    }

    @Override // ke.e
    public final Object d(ie.n nVar, ld.a aVar) {
        Object h10 = b0.h(new ke.t(nVar), this.f5139r, this.f5140s, aVar);
        return h10 == md.a.f6622d ? h10 : Unit.f5554a;
    }

    @Override // ke.e
    public final ke.e e(CoroutineContext coroutineContext, int i3, ie.a aVar) {
        return new b(this.f5139r, this.f5140s, coroutineContext, i3, aVar);
    }

    @Override // ke.e
    public final e f() {
        return new b(this.f5139r, this.f5140s);
    }

    @Override // ke.e
    public final ie.g g(ge.x xVar) {
        if (!this.f5140s || f5138t.getAndSet(this, 1) != 1) {
            return this.f5513e == -3 ? this.f5139r : super.g(xVar);
        }
        kotlin.collections.i0.l("ReceiveChannel.consumeAsFlow can be collected just once");
        return null;
    }

    public b(ie.g gVar, boolean z10, CoroutineContext coroutineContext, int i3, ie.a aVar) {
        super(coroutineContext, i3, aVar);
        this.f5139r = gVar;
        this.f5140s = z10;
    }
}
