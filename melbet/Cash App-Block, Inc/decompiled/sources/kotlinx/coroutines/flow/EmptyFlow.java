package kotlinx.coroutines.flow;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class EmptyFlow implements Flow {
    public static final EmptyFlow INSTANCE = new EmptyFlow();

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        return Unit.INSTANCE;
    }
}
