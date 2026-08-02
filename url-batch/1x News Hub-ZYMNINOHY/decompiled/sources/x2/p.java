package x2;

import d2.InterfaceC0303f;
import t2.C1209t;
import t2.InterfaceC1199i;
import t2.U;
import t2.e0;

/* loaded from: classes.dex */
public final class p extends kotlin.jvm.internal.k implements l2.p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m f10796e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(m mVar) {
        super(2);
        this.f10796e = mVar;
    }

    @Override // l2.p
    public final Object invoke(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        InterfaceC0303f interfaceC0303f = (InterfaceC0303f) obj2;
        d2.g key = interfaceC0303f.getKey();
        InterfaceC0303f h3 = this.f10796e.f10791e.h(key);
        if (key != C1209t.f10441b) {
            return Integer.valueOf(interfaceC0303f != h3 ? Integer.MIN_VALUE : intValue + 1);
        }
        U u3 = (U) h3;
        U u4 = (U) interfaceC0303f;
        while (true) {
            if (u4 != null) {
                if (u4 == u3 || !(u4 instanceof y2.s)) {
                    break;
                }
                InterfaceC1199i interfaceC1199i = (InterfaceC1199i) e0.f10414b.get((e0) u4);
                u4 = interfaceC1199i != null ? interfaceC1199i.getParent() : null;
            } else {
                u4 = null;
                break;
            }
        }
        if (u4 == u3) {
            if (u3 != null) {
                intValue++;
            }
            return Integer.valueOf(intValue);
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + u4 + ", expected child of " + u3 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }
}
