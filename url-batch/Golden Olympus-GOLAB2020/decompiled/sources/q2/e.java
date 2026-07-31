package q2;

import a2.AbstractC1241b;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import o2.AbstractC3317a;
import o2.C3361w0;
import o2.D0;

/* loaded from: classes3.dex */
public abstract class e extends AbstractC3317a implements d {

    /* renamed from: e, reason: collision with root package name */
    private final d f43477e;

    public e(CoroutineContext coroutineContext, d dVar, boolean z4, boolean z5) {
        super(coroutineContext, z4, z5);
        this.f43477e = dVar;
    }

    @Override // o2.D0
    public void H(Throwable th) {
        CancellationException H02 = D0.H0(this, th, null, 1, null);
        this.f43477e.cancel(H02);
        F(H02);
    }

    protected final d T0() {
        return this.f43477e;
    }

    @Override // o2.D0, o2.InterfaceC3359v0
    public final void cancel(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new C3361w0(L(), null, this);
        }
        H(cancellationException);
    }

    @Override // q2.t
    public Object d() {
        return this.f43477e.d();
    }

    @Override // q2.t
    public Object e(kotlin.coroutines.d dVar) {
        Object e4 = this.f43477e.e(dVar);
        AbstractC1241b.f();
        return e4;
    }

    @Override // q2.t
    public Object i(kotlin.coroutines.d dVar) {
        return this.f43477e.i(dVar);
    }

    @Override // q2.t
    public f iterator() {
        return this.f43477e.iterator();
    }

    @Override // q2.u
    public boolean j(Throwable th) {
        return this.f43477e.j(th);
    }

    @Override // q2.u
    public void q(Function1 function1) {
        this.f43477e.q(function1);
    }

    @Override // q2.u
    public Object r(Object obj) {
        return this.f43477e.r(obj);
    }

    @Override // q2.u
    public Object s(Object obj, kotlin.coroutines.d dVar) {
        return this.f43477e.s(obj, dVar);
    }

    @Override // q2.u
    public boolean t() {
        return this.f43477e.t();
    }

    @Override // o2.D0, o2.InterfaceC3359v0
    public /* synthetic */ void cancel() {
        H(new C3361w0(L(), null, this));
    }

    @Override // o2.D0, o2.InterfaceC3359v0
    public final /* synthetic */ boolean cancel(Throwable th) {
        H(new C3361w0(L(), null, this));
        return true;
    }

    public final d S0() {
        return this;
    }
}
