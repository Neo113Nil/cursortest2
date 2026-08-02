package com.squareup.cash.work.tinygraph.real;

import androidx.credentials.Credential;
import com.squareup.cash.work.tinygraph.BaseRepositoryKt;
import com.squareup.cash.work.tinygraph.models.LocationStatus;
import com.squareup.cash.work.tinygraph.setting.SettingDao;
import com.squareup.util.coroutines.FlowExtensionsKt$combine$$inlined$combine$1;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import xyz.block.genie.state.StateBindingsKt$$ExternalSyntheticLambda0;

/* loaded from: classes7.dex */
public final class RealLocationRepository extends Credential {
    public final SettingDao dao;

    public RealLocationRepository(SettingDao settingDao, Flow flow) {
        super(flow);
        this.dao = settingDao;
    }

    public static ChannelFlowTransformLatest getAllByMerchantId$default(RealLocationRepository realLocationRepository, String str) {
        LocationStatus locationStatus = LocationStatus.ACTIVE;
        str.getClass();
        RealLocationRepository$getById$1 realLocationRepository$getById$1 = new RealLocationRepository$getById$1(realLocationRepository, str, null, 1);
        StateBindingsKt$$ExternalSyntheticLambda0 stateBindingsKt$$ExternalSyntheticLambda0 = new StateBindingsKt$$ExternalSyntheticLambda0(str);
        return FlowKt.transformLatest(new FlowExtensionsKt$combine$$inlined$combine$1(19, BaseRepositoryKt.toFlow(realLocationRepository$getById$1), stateBindingsKt$$ExternalSyntheticLambda0), new FlowExtensionsKt$combine$$inlined$combine$1.AnonymousClass3(null, (Flow) realLocationRepository.data, stateBindingsKt$$ExternalSyntheticLambda0, 3));
    }
}
