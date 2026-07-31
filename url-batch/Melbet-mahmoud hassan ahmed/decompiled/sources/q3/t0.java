package q3;

/* loaded from: classes.dex */
public final class t0 extends r0<Boolean> {

    /* renamed from: c, reason: collision with root package name */
    public final h<?> f20320c;

    public t0(h<?> hVar, j4.i<Boolean> iVar) {
        super(4, iVar);
        this.f20320c = hVar;
    }

    @Override // q3.u0
    public final /* bridge */ /* synthetic */ void c(p pVar, boolean z6) {
    }

    @Override // q3.h0
    public final o3.d[] f(z<?> zVar) {
        if (zVar.t().get(this.f20320c) == null) {
            return null;
        }
        throw null;
    }

    @Override // q3.h0
    public final boolean g(z<?> zVar) {
        if (zVar.t().get(this.f20320c) == null) {
            return false;
        }
        throw null;
    }

    @Override // q3.r0
    public final void h(z<?> zVar) {
        if (zVar.t().remove(this.f20320c) == null) {
            this.f20314b.e(Boolean.FALSE);
        } else {
            zVar.s();
            throw null;
        }
    }
}
