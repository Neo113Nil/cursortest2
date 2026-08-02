package com.withpersona.sdk2.inquiry.internal;

import com.withpersona.sdk2.inquiry.workflows.WorkflowWorker;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.SafeFlow;

/* loaded from: classes9.dex */
public final class RestoreUiStepStateWorker implements WorkflowWorker {
    public final String inquiryId;
    public final String sessionToken;
    public final String stepName;
    public final UiStepSavedStateHelper uiStepSavedStateHelper;

    public interface Output {

        public final class Failure implements Output {
            public static final Failure INSTANCE = new Failure();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Failure);
            }

            public final int hashCode() {
                return -1486380735;
            }

            public final String toString() {
                return "Failure";
            }
        }

        public final class Success implements Output {
            public final List components;

            public Success(List list) {
                this.components = list;
            }
        }
    }

    public RestoreUiStepStateWorker(UiStepSavedStateHelper uiStepSavedStateHelper, String str, String str2, String str3) {
        uiStepSavedStateHelper.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.uiStepSavedStateHelper = uiStepSavedStateHelper;
        this.sessionToken = str;
        this.inquiryId = str2;
        this.stepName = str3;
    }

    @Override // com.withpersona.sdk2.inquiry.workflows.WorkflowWorker
    public final boolean doesSameWorkAs(WorkflowWorker workflowWorker) {
        if (!(workflowWorker instanceof RestoreUiStepStateWorker)) {
            return false;
        }
        RestoreUiStepStateWorker restoreUiStepStateWorker = (RestoreUiStepStateWorker) workflowWorker;
        return Intrinsics.areEqual(restoreUiStepStateWorker.sessionToken, this.sessionToken) && Intrinsics.areEqual(restoreUiStepStateWorker.inquiryId, this.inquiryId) && Intrinsics.areEqual(restoreUiStepStateWorker.stepName, this.stepName);
    }

    @Override // com.withpersona.sdk2.inquiry.workflows.WorkflowWorker
    public final Flow run() {
        return new SafeFlow(new TransitionWorker$run$1(this, null, 12));
    }
}
