package o2;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* renamed from: o2.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3317a extends D0 implements InterfaceC3359v0, kotlin.coroutines.d, InterfaceC3316J {

    /* renamed from: d, reason: collision with root package name */
    private final CoroutineContext f42043d;

    public AbstractC3317a(CoroutineContext coroutineContext, boolean z4, boolean z5) {
        super(z5);
        if (z4) {
            h0((InterfaceC3359v0) coroutineContext.get(InterfaceC3359v0.f42105N2));
        }
        this.f42043d = coroutineContext.plus(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o2.D0
    public String L() {
        return N.a(this) + " was cancelled";
    }

    protected void O0(Object obj) {
        C(obj);
    }

    public final void R0(L l4, Object obj, Function2 function2) {
        l4.d(function2, obj, this);
    }

    @Override // o2.D0
    public final void g0(Throwable th) {
        AbstractC3315I.a(this.f42043d, th);
    }

    @Override // kotlin.coroutines.d
    public final CoroutineContext getContext() {
        return this.f42043d;
    }

    @Override // o2.D0, o2.InterfaceC3359v0
    public boolean isActive() {
        return super.isActive();
    }

    @Override // o2.InterfaceC3316J
    public CoroutineContext n() {
        return this.f42043d;
    }

    @Override // o2.D0
    public String q0() {
        String b4 = AbstractC3312F.b(this.f42043d);
        if (b4 == null) {
            return super.q0();
        }
        return '\"' + b4 + "\":" + super.q0();
    }

    @Override // kotlin.coroutines.d
    public final void resumeWith(Object obj) {
        Object o02 = o0(AbstractC3311E.d(obj, null, 1, null));
        if (o02 == E0.f41992b) {
            return;
        }
        O0(o02);
    }

    @Override // o2.D0
    protected final void x0(Object obj) {
        if (!(obj instanceof C3308B)) {
            Q0(obj);
        } else {
            C3308B c3308b = (C3308B) obj;
            P0(c3308b.f41962a, c3308b.a());
        }
    }

    protected void Q0(Object obj) {
    }

    protected void P0(Throwable th, boolean z4) {
    }
}
