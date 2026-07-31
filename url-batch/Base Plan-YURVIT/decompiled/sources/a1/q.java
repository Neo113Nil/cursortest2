package a1;

import W0.C0079t;
import W0.InterfaceC0069i;
import W0.P;
import W0.Z;
import b1.u;

/* loaded from: classes.dex */
public final class q extends P0.i implements O0.p {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n f1170f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(n nVar) {
        super(2);
        this.f1170f = nVar;
    }

    @Override // O0.p
    public final Object i(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        G0.g gVar = (G0.g) obj2;
        G0.h key = gVar.getKey();
        G0.g m2 = this.f1170f.f1164i.m(key);
        if (key != C0079t.f974f) {
            return Integer.valueOf(gVar != m2 ? Integer.MIN_VALUE : intValue + 1);
        }
        P p2 = (P) m2;
        P p3 = (P) gVar;
        while (true) {
            if (p3 != null) {
                if (p3 == p2 || !(p3 instanceof u)) {
                    break;
                }
                InterfaceC0069i interfaceC0069i = (InterfaceC0069i) Z.f940f.get((Z) p3);
                p3 = interfaceC0069i != null ? interfaceC0069i.getParent() : null;
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
