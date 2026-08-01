package v1;

import i1.p;
import r1.C0367q;
import r1.InterfaceC0358h;
import r1.N;
import r1.V;
import w1.s;

/* loaded from: classes.dex */
public final class j extends j1.i implements p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f4457b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(g gVar) {
        super(2);
        this.f4457b = gVar;
    }

    @Override // i1.p
    public final Object d(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        a1.g gVar = (a1.g) obj2;
        a1.h key = gVar.getKey();
        a1.g d2 = this.f4457b.f4453b.d(key);
        if (key != C0367q.f4090b) {
            return Integer.valueOf(gVar != d2 ? Integer.MIN_VALUE : intValue + 1);
        }
        N n2 = (N) d2;
        N n3 = (N) gVar;
        while (true) {
            if (n3 != null) {
                if (n3 == n2 || !(n3 instanceof s)) {
                    break;
                }
                InterfaceC0358h interfaceC0358h = (InterfaceC0358h) V.f4061b.get((V) n3);
                n3 = interfaceC0358h != null ? interfaceC0358h.getParent() : null;
            } else {
                n3 = null;
                break;
            }
        }
        if (n3 == n2) {
            if (n2 != null) {
                intValue++;
            }
            return Integer.valueOf(intValue);
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + n3 + ", expected child of " + n2 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }
}
