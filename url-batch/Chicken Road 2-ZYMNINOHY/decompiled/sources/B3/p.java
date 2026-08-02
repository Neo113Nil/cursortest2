package B3;

import f3.InterfaceC0428f;
import f3.InterfaceC0429g;
import x3.C1559t;
import x3.InterfaceC1549i;
import x3.T;
import x3.d0;

/* loaded from: classes.dex */
public final class p extends kotlin.jvm.internal.j implements o3.p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m f248e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(m mVar) {
        super(2);
        this.f248e = mVar;
    }

    @Override // o3.p
    public final Object invoke(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        InterfaceC0428f interfaceC0428f = (InterfaceC0428f) obj2;
        InterfaceC0429g key = interfaceC0428f.getKey();
        InterfaceC0428f n = this.f248e.f242b.n(key);
        if (key != C1559t.f16059b) {
            return Integer.valueOf(interfaceC0428f != n ? Integer.MIN_VALUE : intValue + 1);
        }
        T t4 = (T) n;
        T t5 = (T) interfaceC0428f;
        while (true) {
            if (t5 != null) {
                if (t5 == t4 || !(t5 instanceof C3.s)) {
                    break;
                }
                InterfaceC1549i interfaceC1549i = (InterfaceC1549i) d0.f16030b.get((d0) t5);
                t5 = interfaceC1549i != null ? interfaceC1549i.getParent() : null;
            } else {
                t5 = null;
                break;
            }
        }
        if (t5 == t4) {
            if (t4 != null) {
                intValue++;
            }
            return Integer.valueOf(intValue);
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + t5 + ", expected child of " + t4 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }
}
