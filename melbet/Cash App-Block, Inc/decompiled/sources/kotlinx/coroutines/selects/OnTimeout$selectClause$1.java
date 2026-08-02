package kotlinx.coroutines.selects;

import com.squareup.cash.ui.MainActivity$$ExternalSyntheticLambda8;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.JobKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class OnTimeout$selectClause$1 extends FunctionReferenceImpl implements Function3 {
    public static final OnTimeout$selectClause$1 INSTANCE = new OnTimeout$selectClause$1(3, OnTimeout.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        OnTimeout onTimeout = (OnTimeout) obj;
        SelectInstance selectInstance = (SelectInstance) obj2;
        long j = onTimeout.timeMillis;
        if (j <= 0) {
            ((SelectImplementation) selectInstance).internalResult = Unit.INSTANCE;
        } else {
            MainActivity$$ExternalSyntheticLambda8 mainActivity$$ExternalSyntheticLambda8 = new MainActivity$$ExternalSyntheticLambda8(14, selectInstance, onTimeout);
            selectInstance.getClass();
            SelectImplementation selectImplementation = (SelectImplementation) selectInstance;
            CoroutineContext coroutineContext = selectImplementation.context;
            selectImplementation.disposableHandleOrSegment = JobKt.getDelay(coroutineContext).invokeOnTimeout(j, mainActivity$$ExternalSyntheticLambda8, coroutineContext);
        }
        return Unit.INSTANCE;
    }
}
