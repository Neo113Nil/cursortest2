package kotlinx.coroutines.flow;

import java.util.List;

/* loaded from: classes5.dex */
public interface i extends n, f {
    @Override // kotlinx.coroutines.flow.n, kotlinx.coroutines.flow.e, kotlinx.coroutines.flow.a
    /* synthetic */ Object collect(f fVar, kotlin.coroutines.c cVar);

    Object emit(Object obj, kotlin.coroutines.c cVar);

    @Override // kotlinx.coroutines.flow.n
    /* synthetic */ List getReplayCache();

    t getSubscriptionCount();

    void resetReplayCache();

    boolean tryEmit(Object obj);
}
