package P5;

import H5.C0147g;
import H5.InterfaceC0146f;
import H5.x0;
import M5.t;
import M5.v;
import o5.InterfaceC0569i;
import x5.InterfaceC0743l;

/* loaded from: classes.dex */
public final class c implements InterfaceC0146f, x0 {

    /* renamed from: f, reason: collision with root package name */
    public final C0147g f1883f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d f1884g;

    public c(d dVar, C0147g c0147g) {
        this.f1884g = dVar;
        this.f1883f = c0147g;
    }

    @Override // H5.x0
    public final void a(t tVar, int i7) {
        this.f1883f.a(tVar, i7);
    }

    @Override // H5.InterfaceC0146f
    public final v f(Object obj, InterfaceC0743l interfaceC0743l) {
        d dVar = this.f1884g;
        b bVar = new b(dVar, this, 1);
        v f7 = this.f1883f.f((k5.v) obj, bVar);
        if (f7 != null) {
            d.f1885g.set(dVar, null);
        }
        return f7;
    }

    @Override // o5.InterfaceC0564d
    public final InterfaceC0569i getContext() {
        return this.f1883f.f1079j;
    }

    @Override // H5.InterfaceC0146f
    public final void i(Object obj) {
        this.f1883f.i(obj);
    }

    @Override // o5.InterfaceC0564d
    public final void resumeWith(Object obj) {
        this.f1883f.resumeWith(obj);
    }
}
