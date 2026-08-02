package com.squareup.cash.stablecoin.presenters.widgets.state;

import com.squareup.cash.blockers.views.FileBlockerView$6$2$1;
import com.squareup.cash.crypto.backend.balance.RealCryptoBalanceRepo;
import com.squareup.cash.data.contacts.ContactModifiablePermissions$shouldShowRequestPermissionRationale$4;
import com.squareup.cash.stablecoin.backend.real.RealStablecoinActivityRepo$Factory$Impl;
import com.squareup.cash.stablecoin.capability.api.StablecoinCapability;
import com.squareup.cash.stablecoin.capability.real.RealStablecoinCapabilityHelper;
import com.squareup.preferences.KeyValue;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StartedLazily;

/* loaded from: classes7.dex */
public final class RealStablecoinHomeWidgetStateManager {
    public static final StablecoinHomeWidgetState INITIAL = new StablecoinHomeWidgetState(null, false, false);
    public final ReadonlyStateFlow widgetState;

    public RealStablecoinHomeWidgetStateManager(RealCryptoBalanceRepo realCryptoBalanceRepo, RealStablecoinCapabilityHelper realStablecoinCapabilityHelper, RealStablecoinActivityRepo$Factory$Impl realStablecoinActivityRepo$Factory$Impl, CoroutineScope coroutineScope) {
        KeyValue keyValue = (KeyValue) realStablecoinActivityRepo$Factory$Impl.delegateFactory.sandboxer.invoke();
        keyValue.getClass();
        FlowKt__MergeKt$flatMapConcat$$inlined$map$1 stablecoinBalance = realCryptoBalanceRepo.getStablecoinBalance();
        FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 flowKt__ZipKt$combine$$inlined$unsafeFlow$1 = new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(realStablecoinCapabilityHelper.isAvailableFlow(StablecoinCapability.FIAT_TO_STABLECOIN_MARKET_BUY), realStablecoinCapabilityHelper.isAvailableFlow(StablecoinCapability.BITCOIN_TO_STABLECOIN_MARKET_CONVERT), new FileBlockerView$6$2$1(3, null, 5), 0);
        Flow observe = keyValue.observe();
        Boolean bool = Boolean.FALSE;
        StartedLazily startedLazily = SharingStarted.Companion.Eagerly;
        this.widgetState = FlowKt.stateIn(FlowKt.combine(stablecoinBalance, flowKt__ZipKt$combine$$inlined$unsafeFlow$1, FlowKt.stateIn(observe, coroutineScope, startedLazily, bool), new ContactModifiablePermissions$shouldShowRequestPermissionRationale$4(4, null, 1)), coroutineScope, startedLazily, INITIAL);
    }
}
