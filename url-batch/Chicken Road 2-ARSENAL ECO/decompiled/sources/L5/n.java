package L5;

import o5.InterfaceC0564d;
import o5.InterfaceC0569i;
import q5.AbstractC0607c;

/* loaded from: classes.dex */
public final class n implements InterfaceC0564d, q5.d {

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC0607c f1517f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC0569i f1518g;

    public n(AbstractC0607c abstractC0607c, InterfaceC0569i interfaceC0569i) {
        this.f1517f = abstractC0607c;
        this.f1518g = interfaceC0569i;
    }

    @Override // q5.d
    public final q5.d getCallerFrame() {
        return this.f1517f;
    }

    @Override // o5.InterfaceC0564d
    public final InterfaceC0569i getContext() {
        return this.f1518g;
    }

    @Override // o5.InterfaceC0564d
    public final void resumeWith(Object obj) {
        this.f1517f.resumeWith(obj);
    }
}
