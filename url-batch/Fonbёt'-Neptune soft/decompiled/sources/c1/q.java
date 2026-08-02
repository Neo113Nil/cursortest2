package c1;

import Y0.C0125t;
import Y0.InterfaceC0115i;
import Y0.P;
import Y0.Z;
import d1.u;

/* loaded from: classes.dex */
public final class q extends Q0.i implements P0.p {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n f2028f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(n nVar) {
        super(2);
        this.f2028f = nVar;
    }

    @Override // P0.p
    public final Object h(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        H0.g gVar = (H0.g) obj2;
        H0.h key = gVar.getKey();
        H0.g k2 = this.f2028f.f2022i.k(key);
        if (key != C0125t.f1230f) {
            return Integer.valueOf(gVar != k2 ? Integer.MIN_VALUE : intValue + 1);
        }
        P p2 = (P) k2;
        P p3 = (P) gVar;
        while (true) {
            if (p3 != null) {
                if (p3 == p2 || !(p3 instanceof u)) {
                    break;
                }
                InterfaceC0115i interfaceC0115i = (InterfaceC0115i) Z.f1194f.get((Z) p3);
                p3 = interfaceC0115i != null ? interfaceC0115i.getParent() : null;
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
