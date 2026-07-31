package I;

import e2.InterfaceC0426e;
import java.util.concurrent.CancellationException;
import q2.AbstractC0837y;

/* loaded from: classes.dex */
public final class T implements A0 {

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0426e f2759d;

    /* renamed from: e, reason: collision with root package name */
    public final v2.c f2760e;

    /* renamed from: f, reason: collision with root package name */
    public q2.m0 f2761f;

    public T(V1.i iVar, InterfaceC0426e interfaceC0426e) {
        this.f2759d = interfaceC0426e;
        this.f2760e = AbstractC0837y.a(iVar);
    }

    @Override // I.A0
    public final void a() {
        q2.m0 m0Var = this.f2761f;
        if (m0Var != null) {
            m0Var.F(new V());
        }
        this.f2761f = null;
    }

    @Override // I.A0
    public final void b() {
        q2.m0 m0Var = this.f2761f;
        if (m0Var != null) {
            CancellationException cancellationException = new CancellationException("Old job was still running!");
            cancellationException.initCause(null);
            m0Var.a(cancellationException);
        }
        this.f2761f = AbstractC0837y.r(this.f2760e, null, null, this.f2759d, 3);
    }

    @Override // I.A0
    public final void c() {
        q2.m0 m0Var = this.f2761f;
        if (m0Var != null) {
            m0Var.F(new V());
        }
        this.f2761f = null;
    }
}
