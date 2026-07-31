package I;

import q2.InterfaceC0835w;

/* renamed from: I.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0166o0 implements InterfaceC0142c0, InterfaceC0835w {

    /* renamed from: d, reason: collision with root package name */
    public final V1.i f2849d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0142c0 f2850e;

    public C0166o0(InterfaceC0142c0 interfaceC0142c0, V1.i iVar) {
        this.f2849d = iVar;
        this.f2850e = interfaceC0142c0;
    }

    @Override // I.W0
    public final Object getValue() {
        return this.f2850e.getValue();
    }

    @Override // q2.InterfaceC0835w
    public final V1.i q() {
        return this.f2849d;
    }

    @Override // I.InterfaceC0142c0
    public final void setValue(Object obj) {
        this.f2850e.setValue(obj);
    }
}
