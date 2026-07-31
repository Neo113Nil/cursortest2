package D1;

import n2.InterfaceC0700f;
import n2.InterfaceC0701g;

/* loaded from: classes.dex */
public final class A implements InterfaceC0700f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f514d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0700f f515e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C f516f;

    public /* synthetic */ A(InterfaceC0700f interfaceC0700f, C c3, int i3) {
        this.f514d = i3;
        this.f515e = interfaceC0700f;
        this.f516f = c3;
    }

    @Override // n2.InterfaceC0700f
    public final Object collect(InterfaceC0701g interfaceC0701g, P1.d dVar) {
        switch (this.f514d) {
            case 0:
                Object collect = this.f515e.collect(new z(interfaceC0701g, this.f516f, 0), dVar);
                if (collect != Q1.a.f3113d) {
                    break;
                }
                break;
            default:
                Object collect2 = this.f515e.collect(new z(interfaceC0701g, this.f516f, 1), dVar);
                if (collect2 != Q1.a.f3113d) {
                    break;
                }
                break;
        }
        return L1.z.f2729a;
    }
}
