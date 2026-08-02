package com.withpersona.sdk2.inquiry.featureflag.network;

import com.google.common.math.DoubleUtils;
import com.squareup.workflow1.Worker;
import com.withpersona.sdk2.inquiry.featureflag.FeatureFlagManager;
import com.withpersona.sdk2.inquiry.workflows.WorkflowWorker;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.SafeFlow;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/withpersona/sdk2/inquiry/featureflag/network/FeatureFlagWorker;", "Lcom/squareup/workflow1/Worker;", "Lcom/withpersona/sdk2/inquiry/featureflag/network/FeatureFlagWorker$Response;", "Lcom/withpersona/sdk2/inquiry/workflows/WorkflowWorker;", "Response", "com/withpersona/sdk2/inquiry/featureflag/network/FeatureFlagWorker_Factory_Impl", "feature-flag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class FeatureFlagWorker implements Worker<Response>, WorkflowWorker {
    public final FeatureFlagManager featureFlagManager;
    public final FeatureFlagService featureFlagService;
    public final String sessionToken;

    public abstract class Response {

        public final class Error extends Response {
            public static final Error INSTANCE = new Error();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Error);
            }

            public final int hashCode() {
                return 727805021;
            }

            public final String toString() {
                return "Error";
            }
        }

        public final class Success extends Response {
            public final FeatureFlagResponse data;

            public Success(FeatureFlagResponse featureFlagResponse) {
                this.data = featureFlagResponse;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Success) && Intrinsics.areEqual(this.data, ((Success) obj).data);
            }

            public final int hashCode() {
                FeatureFlagResponse featureFlagResponse = this.data;
                if (featureFlagResponse == null) {
                    return 0;
                }
                return featureFlagResponse.hashCode();
            }

            public final String toString() {
                return "Success(data=" + this.data + ")";
            }
        }
    }

    public FeatureFlagWorker(String str, FeatureFlagManager featureFlagManager, FeatureFlagService featureFlagService) {
        str.getClass();
        featureFlagManager.getClass();
        featureFlagService.getClass();
        this.sessionToken = str;
        this.featureFlagManager = featureFlagManager;
        this.featureFlagService = featureFlagService;
    }

    @Override // com.squareup.workflow1.Worker
    public final boolean doesSameWorkAs(Worker worker) {
        return Worker.DefaultImpls.doesSameWorkAs(this, worker);
    }

    @Override // com.squareup.workflow1.Worker
    /* renamed from: run */
    public final Flow getWork() {
        return new SafeFlow(new FeatureFlagWorker$run$1(this, null));
    }

    @Override // com.withpersona.sdk2.inquiry.workflows.WorkflowWorker
    public final boolean doesSameWorkAs(WorkflowWorker workflowWorker) {
        return DoubleUtils.doesSameWorkAs(this, workflowWorker);
    }
}
