package com.squareup.cash.work.tinygraph.real;

import androidx.credentials.Credential;
import androidx.glance.session.SessionWorker$doWork$2$1;
import androidx.paging.Pager$pageFetcher$2;
import com.squareup.cash.work.tinygraph.BaseRepositoryKt;
import com.squareup.cash.work.tinygraph.models.Merchant;
import com.squareup.util.coroutines.FlowExtensionsKt$combine$$inlined$combine$1;
import com.squareup.workflow1.WorkerWorkflow$render$1;
import com.stripe.android.StripePaymentController$$ExternalSyntheticLambda1;
import dev.chrisbanes.haze.Pool;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import xyz.block.genie.state.StateBindingsKt$$ExternalSyntheticLambda0;

/* loaded from: classes7.dex */
public final class RealMerchantRepository extends Credential {
    public final Pool dao;

    public RealMerchantRepository(Pool pool, Flow flow) {
        super(flow);
        this.dao = pool;
    }

    public final ChannelFlowTransformLatest getAll() {
        Continuation continuation = null;
        Pager$pageFetcher$2 pager$pageFetcher$2 = new Pager$pageFetcher$2(this, continuation, 13);
        StripePaymentController$$ExternalSyntheticLambda1 stripePaymentController$$ExternalSyntheticLambda1 = new StripePaymentController$$ExternalSyntheticLambda1(1);
        return FlowKt.transformLatest(new FlowExtensionsKt$combine$$inlined$combine$1(22, BaseRepositoryKt.toFlow(pager$pageFetcher$2), stripePaymentController$$ExternalSyntheticLambda1), new FlowExtensionsKt$combine$$inlined$combine$1.AnonymousClass3(continuation, (Flow) this.data, stripePaymentController$$ExternalSyntheticLambda1, 6));
    }

    public final Flow getById(String str) {
        str.getClass();
        Continuation continuation = null;
        int i = 9;
        SessionWorker$doWork$2$1 sessionWorker$doWork$2$1 = new SessionWorker$doWork$2$1(this, str, continuation, i);
        return new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new WorkerWorkflow$render$1(sessionWorker$doWork$2$1, continuation, 10), new RealJobRepository$getById$$inlined$getEntity$1(BaseRepositoryKt.events((Flow) this.data, new StateBindingsKt$$ExternalSyntheticLambda0(str, i), Reflection.factory.getOrCreateKotlinClass(Merchant.class)), 3));
    }
}
