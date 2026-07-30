package S1;

import b2.C0270a;
import b2.InterfaceC0271b;
import java.util.Set;

/* loaded from: classes.dex */
public final class s implements InterfaceC0271b {

    /* renamed from: a, reason: collision with root package name */
    public final Set f2505a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0271b f2506b;

    public s(Set set, InterfaceC0271b interfaceC0271b) {
        this.f2505a = set;
        this.f2506b = interfaceC0271b;
    }

    @Override // b2.InterfaceC0271b
    public final void a(C0270a c0270a) {
        if (this.f2505a.contains(P1.b.class)) {
            this.f2506b.a(c0270a);
            return;
        }
        throw new E1.i("Attempting to publish an undeclared event " + c0270a + ".");
    }
}
