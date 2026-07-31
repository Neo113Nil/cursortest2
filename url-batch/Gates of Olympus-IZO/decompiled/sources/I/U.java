package I;

import java.util.concurrent.CancellationException;
import k2.AbstractC0552y;

/* loaded from: classes.dex */
public final class U implements B0 {

    /* renamed from: d, reason: collision with root package name */
    public final Y1.e f2204d;

    /* renamed from: e, reason: collision with root package name */
    public final p2.c f2205e;

    /* renamed from: f, reason: collision with root package name */
    public k2.m0 f2206f;

    public U(P1.i iVar, Y1.e eVar) {
        this.f2204d = eVar;
        this.f2205e = AbstractC0552y.a(iVar);
    }

    @Override // I.B0
    public final void a() {
        k2.m0 m0Var = this.f2206f;
        if (m0Var != null) {
            m0Var.w(new W());
        }
        this.f2206f = null;
    }

    @Override // I.B0
    public final void b() {
        k2.m0 m0Var = this.f2206f;
        if (m0Var != null) {
            CancellationException cancellationException = new CancellationException("Old job was still running!");
            cancellationException.initCause(null);
            m0Var.a(cancellationException);
        }
        this.f2206f = AbstractC0552y.q(this.f2205e, null, null, this.f2204d, 3);
    }

    @Override // I.B0
    public final void c() {
        k2.m0 m0Var = this.f2206f;
        if (m0Var != null) {
            m0Var.w(new W());
        }
        this.f2206f = null;
    }
}
