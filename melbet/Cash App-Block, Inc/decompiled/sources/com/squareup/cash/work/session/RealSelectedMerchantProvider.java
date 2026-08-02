package com.squareup.cash.work.session;

import com.squareup.cash.wallet.views.PageTagSlotKt$$ExternalSyntheticLambda0;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes7.dex */
public final class RealSelectedMerchantProvider {
    public final Lazy merchantIdentifierFlow$delegate = LazyKt.lazy(new PageTagSlotKt$$ExternalSyntheticLambda0(this, 28));
    public final SquareAccountStore squareAccountStore;

    public RealSelectedMerchantProvider(SquareAccountStore squareAccountStore) {
        this.squareAccountStore = squareAccountStore;
    }

    public final Flow getMerchantIdentifierFlow() {
        return (Flow) this.merchantIdentifierFlow$delegate.getValue();
    }
}
