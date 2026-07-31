package m6;

/* loaded from: classes.dex */
public abstract class a<T> extends v1 implements y5.d<T>, l0 {

    /* renamed from: g, reason: collision with root package name */
    private final y5.g f19266g;

    public a(y5.g gVar, boolean z6, boolean z7) {
        super(z7);
        if (z6) {
            S((o1) gVar.get(o1.f19317c));
        }
        this.f19266g = gVar.plus(this);
    }

    @Override // m6.v1
    public final void R(Throwable th) {
        h0.a(this.f19266g, th);
    }

    @Override // m6.v1
    public String Y() {
        String b7 = e0.b(this.f19266g);
        if (b7 == null) {
            return super.Y();
        }
        return '\"' + b7 + "\":" + super.Y();
    }

    @Override // m6.v1, m6.o1
    public boolean b() {
        return super.b();
    }

    @Override // m6.l0
    public y5.g c() {
        return this.f19266g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // m6.v1
    protected final void d0(Object obj) {
        if (!(obj instanceof y)) {
            v0(obj);
        } else {
            y yVar = (y) obj;
            u0(yVar.f19365a, yVar.a());
        }
    }

    @Override // y5.d
    public final y5.g getContext() {
        return this.f19266g;
    }

    @Override // y5.d
    public final void resumeWith(Object obj) {
        Object W = W(c0.d(obj, null, 1, null));
        if (W == w1.f19352b) {
            return;
        }
        t0(W);
    }

    protected void t0(Object obj) {
        p(obj);
    }

    protected void u0(Throwable th, boolean z6) {
    }

    protected void v0(T t6) {
    }

    public final <R> void w0(n0 n0Var, R r7, f6.p<? super R, ? super y5.d<? super T>, ? extends Object> pVar) {
        n0Var.d(pVar, r7, this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m6.v1
    public String z() {
        return kotlin.jvm.internal.i.i(q0.a(this), " was cancelled");
    }
}
