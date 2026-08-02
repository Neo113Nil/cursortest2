package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public interface MutableSharedFlow extends SharedFlow, FlowCollector {
    @Override // kotlinx.coroutines.flow.FlowCollector
    Object emit(Object obj, Continuation continuation);

    void resetReplayCache();

    boolean tryEmit(Object obj);
}
