package p6;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class d extends kotlin.jvm.internal.n implements Function2 {

    /* renamed from: e, reason: collision with root package name */
    public static final d f7232e = new d(2, e.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        long longValue = ((Number) obj).longValue();
        k kVar = (k) obj2;
        k kVar2 = e.f7233a;
        c cVar = kVar.f7256e;
        Intrinsics.b(cVar);
        return new k(longValue, kVar, cVar, 0);
    }
}
