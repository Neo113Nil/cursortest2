package I;

import k2.InterfaceC0550w;

/* renamed from: I.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0112o0 implements InterfaceC0088c0, InterfaceC0550w {

    /* renamed from: d, reason: collision with root package name */
    public final P1.i f2292d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0088c0 f2293e;

    public C0112o0(InterfaceC0088c0 interfaceC0088c0, P1.i iVar) {
        this.f2292d = iVar;
        this.f2293e = interfaceC0088c0;
    }

    @Override // I.X0
    public final Object getValue() {
        return this.f2293e.getValue();
    }

    @Override // I.InterfaceC0088c0
    public final void setValue(Object obj) {
        this.f2293e.setValue(obj);
    }

    @Override // k2.InterfaceC0550w
    public final P1.i u() {
        return this.f2292d;
    }
}
