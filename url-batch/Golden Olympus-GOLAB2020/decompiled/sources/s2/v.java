package s2;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o2.InterfaceC3359v0;
import t2.C3428C;

/* loaded from: classes3.dex */
public abstract class v {

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ t f46030i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(t tVar) {
            super(2);
            this.f46030i = tVar;
        }

        public final Integer a(int i4, CoroutineContext.Element element) {
            CoroutineContext.b key = element.getKey();
            CoroutineContext.Element element2 = this.f46030i.f46023m.get(key);
            if (key != InterfaceC3359v0.f42105N2) {
                return Integer.valueOf(element != element2 ? Integer.MIN_VALUE : i4 + 1);
            }
            InterfaceC3359v0 interfaceC3359v0 = (InterfaceC3359v0) element2;
            Intrinsics.checkNotNull(element, "null cannot be cast to non-null type kotlinx.coroutines.Job");
            InterfaceC3359v0 b4 = v.b((InterfaceC3359v0) element, interfaceC3359v0);
            if (b4 == interfaceC3359v0) {
                if (interfaceC3359v0 != null) {
                    i4++;
                }
                return Integer.valueOf(i4);
            }
            throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + b4 + ", expected child of " + interfaceC3359v0 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Number) obj).intValue(), (CoroutineContext.Element) obj2);
        }
    }

    public static final void a(t tVar, CoroutineContext coroutineContext) {
        if (((Number) coroutineContext.fold(0, new a(tVar))).intValue() == tVar.f46024n) {
            return;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + tVar.f46023m + ",\n\t\tbut emission happened in " + coroutineContext + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
    }

    public static final InterfaceC3359v0 b(InterfaceC3359v0 interfaceC3359v0, InterfaceC3359v0 interfaceC3359v02) {
        while (interfaceC3359v0 != null) {
            if (interfaceC3359v0 == interfaceC3359v02 || !(interfaceC3359v0 instanceof C3428C)) {
                return interfaceC3359v0;
            }
            interfaceC3359v0 = interfaceC3359v0.getParent();
        }
        return null;
    }
}
