package kotlinx.coroutines.selects;

import f6.l;
import f6.q;
import kotlin.jvm.internal.r;
import kotlinx.coroutines.internal.g0;
import kotlinx.coroutines.n;
import y5.w;

/* loaded from: classes5.dex */
public abstract class SelectKt {
    private static final int TRY_SELECT_ALREADY_SELECTED = 3;
    private static final int TRY_SELECT_CANCELLED = 2;
    private static final int TRY_SELECT_REREGISTER = 1;
    private static final int TRY_SELECT_SUCCESSFUL = 0;
    private static final q DUMMY_PROCESS_RESULT_FUNCTION = new q() { // from class: kotlinx.coroutines.selects.SelectKt$DUMMY_PROCESS_RESULT_FUNCTION$1
        @Override // f6.q
        public final Void invoke(Object obj, Object obj2, Object obj3) {
            return null;
        }
    };
    private static final g0 STATE_REG = new g0("STATE_REG");
    private static final g0 STATE_COMPLETED = new g0("STATE_COMPLETED");
    private static final g0 STATE_CANCELLED = new g0("STATE_CANCELLED");
    private static final g0 NO_RESULT = new g0("NO_RESULT");
    private static final g0 PARAM_CLAUSE_0 = new g0("PARAM_CLAUSE_0");

    public static /* synthetic */ void OnCancellationConstructor$annotations() {
    }

    public static /* synthetic */ void ProcessResultFunction$annotations() {
    }

    public static /* synthetic */ void RegistrationFunction$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TrySelectDetailedResult TrySelectDetailedResult(int i8) {
        if (i8 == 0) {
            return TrySelectDetailedResult.SUCCESSFUL;
        }
        if (i8 == 1) {
            return TrySelectDetailedResult.REREGISTER;
        }
        if (i8 == 2) {
            return TrySelectDetailedResult.CANCELLED;
        }
        if (i8 == 3) {
            return TrySelectDetailedResult.ALREADY_SELECTED;
        }
        throw new IllegalStateException(("Unexpected internal result: " + i8).toString());
    }

    public static final g0 getPARAM_CLAUSE_0() {
        return PARAM_CLAUSE_0;
    }

    public static final <R> Object select(l lVar, kotlin.coroutines.c cVar) {
        SelectImplementation selectImplementation = new SelectImplementation(cVar.getContext());
        lVar.invoke(selectImplementation);
        return selectImplementation.doSelect(cVar);
    }

    private static final <R> Object select$$forInline(l lVar, kotlin.coroutines.c cVar) {
        r.mark(3);
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean tryResume(n nVar, l lVar) {
        Object tryResume = nVar.tryResume(w.INSTANCE, null, lVar);
        if (tryResume == null) {
            return false;
        }
        nVar.completeResume(tryResume);
        return true;
    }
}
