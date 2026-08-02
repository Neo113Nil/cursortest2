package com.squareup.workflow1;

import com.squareup.workflow1.WorkflowAction;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.NotCompleted;

/* loaded from: classes8.dex */
public final class Workflows__WorkflowActionKt$action$2 extends WorkflowAction {
    public final /* synthetic */ Object $apply;
    public final /* synthetic */ Object $name;
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ Workflows__WorkflowActionKt$action$2(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.$apply = obj;
        this.$name = obj2;
    }

    @Override // com.squareup.workflow1.WorkflowAction
    public final void apply(WorkflowAction.Updater updater) {
        int i = this.$r8$classId;
        Object obj = this.$apply;
        switch (i) {
            case 0:
                ((Function1) obj).invoke(updater);
                break;
            default:
                CancellableContinuationImpl cancellableContinuationImpl = (CancellableContinuationImpl) this.$name;
                if (cancellableContinuationImpl.getState$kotlinx_coroutines_core() instanceof NotCompleted) {
                    ((WorkflowAction) obj).apply(updater);
                    Result.Companion companion = Result.Companion;
                    cancellableContinuationImpl.resumeWith(Unit.INSTANCE);
                    break;
                }
                break;
        }
    }

    public final String toString() {
        switch (this.$r8$classId) {
            case 0:
                return "WorkflowAction(" + ((String) ((Workflows__WorkflowActionKt$action$1) this.$name).invoke()) + ")@" + hashCode();
            default:
                return "sendAndAwaitApplication(" + ((WorkflowAction) this.$apply) + ')';
        }
    }
}
