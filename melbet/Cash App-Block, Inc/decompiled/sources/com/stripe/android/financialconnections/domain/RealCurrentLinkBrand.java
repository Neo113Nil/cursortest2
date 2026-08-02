package com.stripe.android.financialconnections.domain;

import com.squareup.cash.filament.util.IblLoaderKt;
import com.squareup.wire.internal.FieldBinding$$ExternalSyntheticLambda5;
import com.stripe.android.core.networking.MarkdownParser$$ExternalSyntheticLambda0;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeState;
import com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepositoryImpl;
import com.stripe.android.financialconnections.repository.RealConsumerSessionRepository;
import com.stripe.android.model.LinkBrand;
import com.stripe.android.uicore.utils.FlowToStateFlow;

/* loaded from: classes8.dex */
public final class RealCurrentLinkBrand {
    public final FinancialConnectionsSheetNativeState initialState;
    public final FlowToStateFlow stateFlow;

    public RealCurrentLinkBrand(FinancialConnectionsSheetNativeState financialConnectionsSheetNativeState, FinancialConnectionsManifestRepositoryImpl financialConnectionsManifestRepositoryImpl, RealConsumerSessionRepository realConsumerSessionRepository) {
        financialConnectionsSheetNativeState.getClass();
        financialConnectionsManifestRepositoryImpl.getClass();
        realConsumerSessionRepository.getClass();
        this.initialState = financialConnectionsSheetNativeState;
        this.stateFlow = IblLoaderKt.combineAsStateFlow(IblLoaderKt.mapAsStateFlow(realConsumerSessionRepository.consumerSessionFlow, new MarkdownParser$$ExternalSyntheticLambda0(9)), IblLoaderKt.mapAsStateFlow(financialConnectionsManifestRepositoryImpl.syncFlow, new MarkdownParser$$ExternalSyntheticLambda0(10)), new FieldBinding$$ExternalSyntheticLambda5(this, 4));
    }

    public final LinkBrand invoke() {
        return (LinkBrand) this.stateFlow.produceValue.invoke();
    }
}
