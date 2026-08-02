package com.squareup.cash.work.data.real;

import com.squareup.cash.wallet.views.PageTagSlotKt$$ExternalSyntheticLambda0;
import com.squareup.cash.work.session.RealSelectedMerchantProvider;
import com.squareup.cash.work.tinygraph.real.RealMerchantRepository;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes7.dex */
public final class RealSelectedMerchantDataProvider {
    public final RealMerchantRepository merchantRepository;
    public final CoroutineScope scope;
    public final Lazy selectedMerchantFlow$delegate = LazyKt.lazy(new PageTagSlotKt$$ExternalSyntheticLambda0(this, 23));
    public final RealSelectedMerchantProvider selectedMerchantProvider;

    public RealSelectedMerchantDataProvider(RealSelectedMerchantProvider realSelectedMerchantProvider, RealMerchantRepository realMerchantRepository, CoroutineScope coroutineScope) {
        this.selectedMerchantProvider = realSelectedMerchantProvider;
        this.merchantRepository = realMerchantRepository;
        this.scope = coroutineScope;
    }

    public final Flow getSelectedMerchantFlow() {
        return (Flow) this.selectedMerchantFlow$delegate.getValue();
    }
}
