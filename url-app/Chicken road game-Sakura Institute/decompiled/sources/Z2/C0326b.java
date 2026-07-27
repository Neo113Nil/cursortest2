package Z2;

import W2.InterfaceC0302y;
import a3.AbstractC0429g;
import a3.C0428f;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* renamed from: Z2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0326b extends AbstractC0429g {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4667l = AtomicIntegerFieldUpdater.newUpdater(C0326b.class, "consumed$volatile");
    private volatile /* synthetic */ int consumed$volatile;

    /* renamed from: j, reason: collision with root package name */
    public final Y2.e f4668j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f4669k;

    public /* synthetic */ C0326b(Y2.e eVar, boolean z4) {
        this(eVar, z4, kotlin.coroutines.i.f7498d, -3, Y2.a.f4398d);
    }

    @Override // a3.AbstractC0429g
    public final String d() {
        return "channel=" + this.f4668j;
    }

    @Override // a3.AbstractC0429g, Z2.InterfaceC0330f
    public final Object e(InterfaceC0331g interfaceC0331g, C2.a aVar) {
        if (this.f4956e != -3) {
            Object e4 = super.e(interfaceC0331g, aVar);
            return e4 == D2.a.f2163d ? e4 : Unit.f7487a;
        }
        boolean z4 = this.f4669k;
        if (z4 && f4667l.getAndSet(this, 1) != 0) {
            throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
        }
        Object i2 = H.i(interfaceC0331g, this.f4668j, z4, aVar);
        return i2 == D2.a.f2163d ? i2 : Unit.f7487a;
    }

    @Override // a3.AbstractC0429g
    public final Object f(Y2.q qVar, C0428f c0428f) {
        Object i2 = H.i(new a3.x(qVar), this.f4668j, this.f4669k, c0428f);
        return i2 == D2.a.f2163d ? i2 : Unit.f7487a;
    }

    @Override // a3.AbstractC0429g
    public final AbstractC0429g g(CoroutineContext coroutineContext, int i2, Y2.a aVar) {
        return new C0326b(this.f4668j, this.f4669k, coroutineContext, i2, aVar);
    }

    @Override // a3.AbstractC0429g
    public final InterfaceC0330f h() {
        return new C0326b(this.f4668j, this.f4669k);
    }

    @Override // a3.AbstractC0429g
    public final Y2.r i(InterfaceC0302y interfaceC0302y) {
        if (!this.f4669k || f4667l.getAndSet(this, 1) == 0) {
            return this.f4956e == -3 ? this.f4668j : super.i(interfaceC0302y);
        }
        throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
    }

    public C0326b(Y2.e eVar, boolean z4, CoroutineContext coroutineContext, int i2, Y2.a aVar) {
        super(coroutineContext, i2, aVar);
        this.f4668j = eVar;
        this.f4669k = z4;
        this.consumed$volatile = 0;
    }
}
