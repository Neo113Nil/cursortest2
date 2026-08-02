package com.withpersona.sdk2.inquiry.ui.network;

import com.squareup.workflow1.Worker;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import com.withpersona.sdk2.inquiry.workflows.WorkflowWorker;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.SafeFlow;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/UiAddressAutocompleteWorker;", "Lcom/squareup/workflow1/Worker;", "Lcom/withpersona/sdk2/inquiry/ui/network/UiAddressAutocompleteWorker$Response;", "Lcom/withpersona/sdk2/inquiry/workflows/WorkflowWorker;", "Response", "dev/chrisbanes/haze/Pool", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class UiAddressAutocompleteWorker implements Worker<Response>, WorkflowWorker {
    public final String addressText;
    public final String sessionToken;
    public final UiComponent triggeringComponent;
    public final UiService uiService;

    public abstract class Response {

        public final class Error extends Response {
        }

        public final class Success extends Response {
            public final List results;

            public Success(List list) {
                list.getClass();
                this.results = list;
            }
        }
    }

    public UiAddressAutocompleteWorker(String str, UiComponent uiComponent, String str2, UiService uiService) {
        this.sessionToken = str;
        this.triggeringComponent = uiComponent;
        this.addressText = str2;
        this.uiService = uiService;
    }

    @Override // com.squareup.workflow1.Worker
    public final boolean doesSameWorkAs(Worker worker) {
        worker.getClass();
        if (worker instanceof UiAddressAutocompleteWorker) {
            return Intrinsics.areEqual(this.addressText, ((UiAddressAutocompleteWorker) worker).addressText);
        }
        return false;
    }

    @Override // com.squareup.workflow1.Worker
    /* renamed from: run */
    public final Flow getWork() {
        return new SafeFlow(new UiAddressAutocompleteWorker$run$1(this, null));
    }

    @Override // com.withpersona.sdk2.inquiry.workflows.WorkflowWorker
    public final boolean doesSameWorkAs(WorkflowWorker workflowWorker) {
        if (workflowWorker instanceof UiAddressAutocompleteWorker) {
            return Intrinsics.areEqual(this.addressText, ((UiAddressAutocompleteWorker) workflowWorker).addressText);
        }
        return false;
    }
}
