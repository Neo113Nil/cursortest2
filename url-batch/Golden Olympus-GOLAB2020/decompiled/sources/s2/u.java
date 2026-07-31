package s2;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.M;
import r2.InterfaceC3397g;

/* loaded from: classes3.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    private static final h2.n f46028a;

    /* synthetic */ class a extends kotlin.jvm.internal.p implements h2.n {

        /* renamed from: b, reason: collision with root package name */
        public static final a f46029b = new a();

        a() {
            super(3, InterfaceC3397g.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // h2.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC3397g interfaceC3397g, Object obj, kotlin.coroutines.d dVar) {
            return interfaceC3397g.emit(obj, dVar);
        }
    }

    static {
        a aVar = a.f46029b;
        Intrinsics.checkNotNull(aVar, "null cannot be cast to non-null type kotlin.Function3<kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>, kotlin.Any?, kotlin.coroutines.Continuation<kotlin.Unit>, kotlin.Any?>");
        f46028a = (h2.n) M.e(aVar, 3);
    }
}
