package kotlinx.coroutines.flow;

import java.util.List;

/* loaded from: classes5.dex */
public interface j extends t, i {
    @Override // kotlinx.coroutines.flow.t, kotlinx.coroutines.flow.n, kotlinx.coroutines.flow.e, kotlinx.coroutines.flow.a
    /* synthetic */ Object collect(f fVar, kotlin.coroutines.c cVar);

    boolean compareAndSet(Object obj, Object obj2);

    /* synthetic */ Object emit(Object obj, kotlin.coroutines.c cVar);

    @Override // kotlinx.coroutines.flow.t, kotlinx.coroutines.flow.n
    /* synthetic */ List getReplayCache();

    @Override // kotlinx.coroutines.flow.i
    /* synthetic */ t getSubscriptionCount();

    @Override // kotlinx.coroutines.flow.t
    Object getValue();

    /* synthetic */ void resetReplayCache();

    void setValue(Object obj);

    /* synthetic */ boolean tryEmit(Object obj);
}
