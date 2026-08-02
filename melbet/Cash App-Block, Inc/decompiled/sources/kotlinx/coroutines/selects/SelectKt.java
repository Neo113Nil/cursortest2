package kotlinx.coroutines.selects;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.selects.SelectImplementation;
import kotlinx.coroutines.selects.SelectImplementation.ClauseData;

/* loaded from: classes3.dex */
public abstract class SelectKt {
    public static final Symbol STATE_REG = new Symbol("STATE_REG", 0);
    public static final Symbol STATE_COMPLETED = new Symbol("STATE_COMPLETED", 0);
    public static final Symbol STATE_CANCELLED = new Symbol("STATE_CANCELLED", 0);
    public static final Symbol NO_RESULT = new Symbol("NO_RESULT", 0);
    public static final Symbol PARAM_CLAUSE_0 = new Symbol("PARAM_CLAUSE_0", 0);

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onTimeout(SelectImplementation selectImplementation, long j, Function1 function1) {
        OnTimeout onTimeout = new OnTimeout(j);
        OnTimeout$selectClause$1 onTimeout$selectClause$1 = OnTimeout$selectClause$1.INSTANCE;
        TypeIntrinsics.beforeCheckcastToFunctionOfArity(3, onTimeout$selectClause$1);
        SelectImplementation.ClauseData clauseData = selectImplementation.new ClauseData(onTimeout, onTimeout$selectClause$1, SelectKt$DUMMY_PROCESS_RESULT_FUNCTION$1.INSTANCE, PARAM_CLAUSE_0, (SuspendLambda) function1, null);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = SelectImplementation.state$volatile$FU;
        selectImplementation.register(clauseData, false);
    }
}
