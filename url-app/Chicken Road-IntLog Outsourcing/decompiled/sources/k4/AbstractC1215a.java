package k4;

import n2.AbstractC1341c;
import t4.InterfaceC1445p;

/* renamed from: k4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1215a implements InterfaceC1221g {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1222h f10715a;

    public AbstractC1215a(InterfaceC1222h interfaceC1222h) {
        this.f10715a = interfaceC1222h;
    }

    @Override // k4.InterfaceC1223i
    public final /* bridge */ InterfaceC1223i A(InterfaceC1223i interfaceC1223i) {
        return AbstractC1341c.A(this, interfaceC1223i);
    }

    @Override // k4.InterfaceC1223i
    public /* bridge */ InterfaceC1223i c(InterfaceC1222h interfaceC1222h) {
        return AbstractC1341c.x(this, interfaceC1222h);
    }

    @Override // k4.InterfaceC1221g
    public final InterfaceC1222h getKey() {
        return this.f10715a;
    }

    @Override // k4.InterfaceC1223i
    public /* bridge */ InterfaceC1221g o(InterfaceC1222h interfaceC1222h) {
        return AbstractC1341c.n(this, interfaceC1222h);
    }

    @Override // k4.InterfaceC1223i
    public final Object q(Object obj, InterfaceC1445p interfaceC1445p) {
        return interfaceC1445p.invoke(obj, this);
    }
}
