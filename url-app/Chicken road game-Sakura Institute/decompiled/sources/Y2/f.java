package Y2;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class f extends M2.m implements Function2 {

    /* renamed from: o, reason: collision with root package name */
    public static final f f4419o = new f(2, g.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        long longValue = ((Number) obj).longValue();
        m mVar = (m) obj2;
        m mVar2 = g.f4420a;
        e eVar = mVar.f4444e;
        Intrinsics.c(eVar);
        return new m(longValue, mVar, eVar, 0);
    }
}
