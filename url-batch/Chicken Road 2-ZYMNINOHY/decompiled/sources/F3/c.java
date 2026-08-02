package F3;

import C3.t;
import C3.v;
import c3.C0297i;
import f3.InterfaceC0430h;
import o3.InterfaceC1339l;
import x3.C1546f;
import x3.InterfaceC1545e;
import x3.p0;

/* loaded from: classes.dex */
public final class c implements InterfaceC1545e, p0 {

    /* renamed from: a, reason: collision with root package name */
    public final C1546f f793a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f794b;

    public c(d dVar, C1546f c1546f) {
        this.f794b = dVar;
        this.f793a = c1546f;
    }

    @Override // x3.p0
    public final void a(t tVar, int i4) {
        this.f793a.a(tVar, i4);
    }

    @Override // x3.InterfaceC1545e
    public final v c(Object obj, InterfaceC1339l interfaceC1339l) {
        d dVar = this.f794b;
        b bVar = new b(dVar, this, 1);
        v c4 = this.f793a.c((C0297i) obj, bVar);
        if (c4 != null) {
            d.f795g.set(dVar, null);
        }
        return c4;
    }

    @Override // f3.InterfaceC0425c
    public final InterfaceC0430h getContext() {
        return this.f793a.f16035e;
    }

    @Override // x3.InterfaceC1545e
    public final void i(Object obj) {
        this.f793a.i(obj);
    }

    @Override // f3.InterfaceC0425c
    public final void resumeWith(Object obj) {
        this.f793a.resumeWith(obj);
    }
}
