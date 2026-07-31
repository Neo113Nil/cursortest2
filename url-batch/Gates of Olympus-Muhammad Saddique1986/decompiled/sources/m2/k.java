package m2;

import e2.InterfaceC0422a;
import e2.InterfaceC0424c;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class k implements InterfaceC0656f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7008a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f7009b;

    /* renamed from: c, reason: collision with root package name */
    public final f2.k f7010c;

    /* JADX WARN: Multi-variable type inference failed */
    public k(InterfaceC0656f interfaceC0656f, InterfaceC0424c interfaceC0424c, int i3) {
        this.f7008a = i3;
        switch (i3) {
            case 1:
                this.f7009b = interfaceC0656f;
                this.f7010c = (f2.k) interfaceC0424c;
                break;
            default:
                this.f7009b = interfaceC0656f;
                this.f7010c = (f2.k) interfaceC0424c;
                break;
        }
    }

    @Override // m2.InterfaceC0656f
    public final Iterator iterator() {
        switch (this.f7008a) {
            case 0:
                return new C0655e(this);
            case 1:
                return new l(this);
            default:
                return new O.c(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(InterfaceC0422a interfaceC0422a, InterfaceC0424c interfaceC0424c) {
        this.f7008a = 2;
        f2.j.f(interfaceC0424c, "getNextValue");
        this.f7010c = (f2.k) interfaceC0422a;
        this.f7009b = interfaceC0424c;
    }
}
