package H4;

import k4.InterfaceC1221g;
import k4.InterfaceC1222h;
import k4.InterfaceC1223i;
import t4.InterfaceC1445p;

/* loaded from: classes.dex */
public final class p implements InterfaceC1223i {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f1197a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1223i f1198b;

    public p(Throwable th, InterfaceC1223i interfaceC1223i) {
        this.f1197a = th;
        this.f1198b = interfaceC1223i;
    }

    @Override // k4.InterfaceC1223i
    public final InterfaceC1223i A(InterfaceC1223i interfaceC1223i) {
        return this.f1198b.A(interfaceC1223i);
    }

    @Override // k4.InterfaceC1223i
    public final InterfaceC1223i c(InterfaceC1222h interfaceC1222h) {
        return this.f1198b.c(interfaceC1222h);
    }

    @Override // k4.InterfaceC1223i
    public final InterfaceC1221g o(InterfaceC1222h interfaceC1222h) {
        return this.f1198b.o(interfaceC1222h);
    }

    @Override // k4.InterfaceC1223i
    public final Object q(Object obj, InterfaceC1445p interfaceC1445p) {
        return this.f1198b.q(obj, interfaceC1445p);
    }
}
