package Z1;

import A.C0022s;
import u2.InterfaceC1228a;
import u2.InterfaceC1229b;

/* loaded from: classes.dex */
public final class r implements InterfaceC1229b {

    /* renamed from: c, reason: collision with root package name */
    public static final C0022s f4598c = new C0022s(11);

    /* renamed from: d, reason: collision with root package name */
    public static final f f4599d = new f(1);

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC1228a f4600a;

    /* renamed from: b, reason: collision with root package name */
    public volatile InterfaceC1229b f4601b;

    public r(C0022s c0022s, InterfaceC1229b interfaceC1229b) {
        this.f4600a = c0022s;
        this.f4601b = interfaceC1229b;
    }

    public final void a(InterfaceC1228a interfaceC1228a) {
        InterfaceC1229b interfaceC1229b;
        InterfaceC1229b interfaceC1229b2;
        InterfaceC1229b interfaceC1229b3 = this.f4601b;
        f fVar = f4599d;
        if (interfaceC1229b3 != fVar) {
            interfaceC1228a.b(interfaceC1229b3);
            return;
        }
        synchronized (this) {
            interfaceC1229b = this.f4601b;
            if (interfaceC1229b != fVar) {
                interfaceC1229b2 = interfaceC1229b;
            } else {
                this.f4600a = new q(this.f4600a, 0, interfaceC1228a);
                interfaceC1229b2 = null;
            }
        }
        if (interfaceC1229b2 != null) {
            interfaceC1228a.b(interfaceC1229b);
        }
    }

    @Override // u2.InterfaceC1229b
    public final Object get() {
        return this.f4601b.get();
    }
}
