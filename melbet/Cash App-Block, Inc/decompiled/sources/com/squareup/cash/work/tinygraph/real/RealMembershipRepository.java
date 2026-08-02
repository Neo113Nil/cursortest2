package com.squareup.cash.work.tinygraph.real;

import androidx.credentials.Credential;
import com.nimbusds.jose.jca.JCAContext;
import com.squareup.cash.graphics.swampgl.EngineSurfaceTarget$destroyInternal$1;
import com.squareup.cash.profile.views.OpenSourceKt$$ExternalSyntheticLambda9;
import com.squareup.cash.wallet.views.CardTransitionKt$$ExternalSyntheticLambda4;
import com.squareup.cash.work.tinygraph.BaseRepositoryKt;
import com.squareup.cash.work.tinygraph.models.EntityType;
import com.squareup.cash.work.tinygraph.models.Membership;
import com.squareup.util.coroutines.FlowExtensionsKt$combine$$inlined$combine$1;
import com.squareup.workflow1.WorkerWorkflow$render$1;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;

/* loaded from: classes7.dex */
public final class RealMembershipRepository extends Credential {
    public final JCAContext dao;

    public RealMembershipRepository(JCAContext jCAContext, Flow flow) {
        super(flow);
        this.dao = jCAContext;
    }

    public static ChannelFlowTransformLatest getMemberships$default(RealMembershipRepository realMembershipRepository, EntityType entityType, EntityType entityType2, String str) {
        EngineSurfaceTarget$destroyInternal$1 engineSurfaceTarget$destroyInternal$1 = new EngineSurfaceTarget$destroyInternal$1(realMembershipRepository, entityType, entityType2, str, null, 1);
        CardTransitionKt$$ExternalSyntheticLambda4 cardTransitionKt$$ExternalSyntheticLambda4 = new CardTransitionKt$$ExternalSyntheticLambda4(entityType, entityType2, str, 20);
        Flow flow = (Flow) realMembershipRepository.data;
        return FlowKt.transformLatest(new FlowExtensionsKt$combine$$inlined$combine$1(21, BaseRepositoryKt.toFlow(engineSurfaceTarget$destroyInternal$1), cardTransitionKt$$ExternalSyntheticLambda4), new FlowExtensionsKt$combine$$inlined$combine$1.AnonymousClass3(null, flow, cardTransitionKt$$ExternalSyntheticLambda4, 5));
    }

    public final FlowKt__MergeKt$flatMapConcat$$inlined$map$1 getMembership(EntityType entityType, String str, EntityType entityType2, String str2) {
        entityType.getClass();
        str.getClass();
        entityType2.getClass();
        str2.getClass();
        RealMembershipRepository$getMembership$1 realMembershipRepository$getMembership$1 = new RealMembershipRepository$getMembership$1(this, entityType, str, entityType2, str2, null);
        return new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new WorkerWorkflow$render$1(realMembershipRepository$getMembership$1, null, 9), new RealJobRepository$getById$$inlined$getEntity$1(BaseRepositoryKt.events((Flow) this.data, new OpenSourceKt$$ExternalSyntheticLambda9(entityType, str, entityType2, str2), Reflection.factory.getOrCreateKotlinClass(Membership.class)), 2));
    }
}
