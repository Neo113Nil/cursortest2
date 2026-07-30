package Q0;

import M0.C0061t;
import M0.InterfaceC0051i;
import M0.P;
import M0.Z;
import R0.u;

/* loaded from: classes.dex */
public final class q extends F0.j implements E0.p {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n f861f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(n nVar) {
        super(2);
        this.f861f = nVar;
    }

    @Override // E0.p
    public final Object f(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        w0.g gVar = (w0.g) obj2;
        w0.h key = gVar.getKey();
        w0.g f2 = this.f861f.f855i.f(key);
        if (key != C0061t.f687f) {
            return Integer.valueOf(gVar != f2 ? Integer.MIN_VALUE : intValue + 1);
        }
        P p2 = (P) f2;
        P p3 = (P) gVar;
        while (true) {
            if (p3 != null) {
                if (p3 == p2 || !(p3 instanceof u)) {
                    break;
                }
                InterfaceC0051i interfaceC0051i = (InterfaceC0051i) Z.f651f.get((Z) p3);
                p3 = interfaceC0051i != null ? interfaceC0051i.getParent() : null;
            } else {
                p3 = null;
                break;
            }
        }
        if (p3 == p2) {
            if (p2 != null) {
                intValue++;
            }
            return Integer.valueOf(intValue);
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + p3 + ", expected child of " + p2 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }
}
