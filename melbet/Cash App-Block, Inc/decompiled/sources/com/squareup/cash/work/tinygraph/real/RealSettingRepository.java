package com.squareup.cash.work.tinygraph.real;

import androidx.credentials.Credential;
import androidx.glance.session.SessionWorker$doWork$2$1;
import com.squareup.cash.work.tinygraph.BaseRepositoryKt;
import com.squareup.cash.work.tinygraph.setting.SettingDao;
import com.squareup.util.coroutines.FlowExtensionsKt$combine$$inlined$combine$1;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import xyz.block.genie.state.StateBindingsKt$$ExternalSyntheticLambda0;

/* loaded from: classes7.dex */
public final class RealSettingRepository extends Credential {
    public final SettingDao dao;

    public RealSettingRepository(SettingDao settingDao, Flow flow) {
        super(flow);
        this.dao = settingDao;
    }

    public final ChannelFlowTransformLatest getAllByMerchantId(String str) {
        str.getClass();
        Continuation continuation = null;
        int i = 11;
        SessionWorker$doWork$2$1 sessionWorker$doWork$2$1 = new SessionWorker$doWork$2$1(this, str, continuation, i);
        StateBindingsKt$$ExternalSyntheticLambda0 stateBindingsKt$$ExternalSyntheticLambda0 = new StateBindingsKt$$ExternalSyntheticLambda0(str, i);
        return FlowKt.transformLatest(new FlowExtensionsKt$combine$$inlined$combine$1(23, BaseRepositoryKt.toFlow(sessionWorker$doWork$2$1), stateBindingsKt$$ExternalSyntheticLambda0), new FlowExtensionsKt$combine$$inlined$combine$1.AnonymousClass3(continuation, (Flow) this.data, stateBindingsKt$$ExternalSyntheticLambda0, 7));
    }
}
