package com.withpersona.sdk2.inquiry.integration;

import android.content.Context;
import androidx.activity.result.ActivityResultLauncher;
import com.google.common.math.DoubleUtils;
import com.squareup.workflow1.Worker;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.workflows.WorkflowWorker;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.SafeFlow;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/withpersona/sdk2/inquiry/integration/IntegrationBrowserWorker;", "Lcom/withpersona/sdk2/inquiry/workflows/WorkflowWorker;", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationBrowserWorker$Output$Complete;", "Lcom/squareup/workflow1/Worker;", "Complete", "Factory", "integration_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class IntegrationBrowserWorker implements WorkflowWorker, Worker<IntegrationBrowserWorker$Output$Complete> {
    public final Context applicationContext;
    public final ActivityResultLauncher customTabsLauncher;
    public final NextStep.Integration.IntegrationStepBrowserType integrationStepBrowserType;
    public final String redirectPath;
    public final String url;
    public final boolean useAuthTab;

    public interface Factory {
    }

    public IntegrationBrowserWorker(Context context, ActivityResultLauncher activityResultLauncher, String str, String str2, boolean z, NextStep.Integration.IntegrationStepBrowserType integrationStepBrowserType) {
        context.getClass();
        activityResultLauncher.getClass();
        str.getClass();
        str2.getClass();
        integrationStepBrowserType.getClass();
        this.applicationContext = context;
        this.customTabsLauncher = activityResultLauncher;
        this.url = str;
        this.redirectPath = str2;
        this.useAuthTab = z;
        this.integrationStepBrowserType = integrationStepBrowserType;
    }

    @Override // com.squareup.workflow1.Worker
    public final boolean doesSameWorkAs(Worker worker) {
        return Worker.DefaultImpls.doesSameWorkAs(this, worker);
    }

    @Override // com.withpersona.sdk2.inquiry.workflows.WorkflowWorker
    public final Flow run() {
        return new SafeFlow(new IntegrationBrowserWorker$run$1(this, null));
    }

    @Override // com.withpersona.sdk2.inquiry.workflows.WorkflowWorker
    public final boolean doesSameWorkAs(WorkflowWorker workflowWorker) {
        return DoubleUtils.doesSameWorkAs(this, workflowWorker);
    }
}
