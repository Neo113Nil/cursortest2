package r2;

import a2.AbstractC1241b;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o2.InterfaceC3316J;
import q2.EnumC3383a;
import s2.AbstractC3414e;

/* renamed from: r2.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3393c extends AbstractC3414e {

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f43541g = AtomicIntegerFieldUpdater.newUpdater(C3393c.class, "consumed$volatile");
    private volatile /* synthetic */ int consumed$volatile;

    /* renamed from: e, reason: collision with root package name */
    private final q2.t f43542e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f43543f;

    public /* synthetic */ C3393c(q2.t tVar, boolean z4, CoroutineContext coroutineContext, int i4, EnumC3383a enumC3383a, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(tVar, z4, (i5 & 4) != 0 ? kotlin.coroutines.g.f41113b : coroutineContext, (i5 & 8) != 0 ? -3 : i4, (i5 & 16) != 0 ? EnumC3383a.f43420b : enumC3383a);
    }

    private final void p() {
        if (this.f43543f && f43541g.getAndSet(this, 1) != 0) {
            throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
        }
    }

    @Override // s2.AbstractC3414e, r2.InterfaceC3396f
    public Object a(InterfaceC3397g interfaceC3397g, kotlin.coroutines.d dVar) {
        if (this.f45962c != -3) {
            Object a4 = super.a(interfaceC3397g, dVar);
            return a4 == AbstractC1241b.f() ? a4 : Unit.f41027a;
        }
        p();
        Object c4 = AbstractC3400j.c(interfaceC3397g, this.f43542e, this.f43543f, dVar);
        return c4 == AbstractC1241b.f() ? c4 : Unit.f41027a;
    }

    @Override // s2.AbstractC3414e
    protected String g() {
        return "channel=" + this.f43542e;
    }

    @Override // s2.AbstractC3414e
    protected Object i(q2.r rVar, kotlin.coroutines.d dVar) {
        Object c4 = AbstractC3400j.c(new s2.w(rVar), this.f43542e, this.f43543f, dVar);
        return c4 == AbstractC1241b.f() ? c4 : Unit.f41027a;
    }

    @Override // s2.AbstractC3414e
    protected AbstractC3414e j(CoroutineContext coroutineContext, int i4, EnumC3383a enumC3383a) {
        return new C3393c(this.f43542e, this.f43543f, coroutineContext, i4, enumC3383a);
    }

    @Override // s2.AbstractC3414e
    public InterfaceC3396f k() {
        return new C3393c(this.f43542e, this.f43543f, null, 0, null, 28, null);
    }

    @Override // s2.AbstractC3414e
    public q2.t n(InterfaceC3316J interfaceC3316J) {
        p();
        return this.f45962c == -3 ? this.f43542e : super.n(interfaceC3316J);
    }

    public C3393c(q2.t tVar, boolean z4, CoroutineContext coroutineContext, int i4, EnumC3383a enumC3383a) {
        super(coroutineContext, i4, enumC3383a);
        this.f43542e = tVar;
        this.f43543f = z4;
        this.consumed$volatile = 0;
    }
}
