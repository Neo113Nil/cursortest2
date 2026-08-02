package com.squareup.cash.work.presenters;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import com.squareup.cash.sharesheet.RealShareTargetsManager$addSmsTarget$$inlined$map$1;
import com.squareup.cash.work.data.real.RealBrandDetailsDataLoader;
import com.squareup.cash.work.data.real.RealSelectedMerchantDataProvider;
import com.squareup.cash.work.tinygraph.models.Merchant;
import com.squareup.cash.work.tinygraph.real.RealMerchantRepository;
import com.squareup.cash.work.viewmodels.SellerCardViewModel;
import com.squareup.protos.cash.api.Error;
import kotlin.collections.EmptyMap;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes7.dex */
public final class RealSellerCardViewModelProducer {
    public final RealBrandDetailsDataLoader brandDetailsDataLoader;
    public final RealMerchantRepository merchantRepository;
    public final RealSelectedMerchantDataProvider selectedMerchantDataProvider;

    public RealSellerCardViewModelProducer(RealBrandDetailsDataLoader realBrandDetailsDataLoader, RealMerchantRepository realMerchantRepository, Error.Code.Companion companion, RealSelectedMerchantDataProvider realSelectedMerchantDataProvider) {
        this.brandDetailsDataLoader = realBrandDetailsDataLoader;
        this.merchantRepository = realMerchantRepository;
        this.selectedMerchantDataProvider = realSelectedMerchantDataProvider;
    }

    public final SellerCardViewModel collectSelectedMerchantViewModel(Composer composer) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(1279362540);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = this.selectedMerchantDataProvider.getSelectedMerchantFlow();
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue, null, null, gapComposer, 48, 2);
        boolean changed = gapComposer.changed((Merchant) collectAsState.getValue());
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (changed || rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = FlowKt.distinctUntilChanged(new RealShareTargetsManager$addSmsTarget$$inlined$map$1((StateFlow) this.brandDetailsDataLoader.state$delegate.getValue(), this, (Merchant) collectAsState.getValue(), 8));
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        Merchant merchant = (Merchant) collectAsState.getValue();
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        SellerCardViewModel sellerCardViewModel = (SellerCardViewModel) Updater.collectAsState((Flow) rememberedValue2, Error.Code.Companion.toSellerCardViewModel(merchant, emptyMap), null, gapComposer, 0, 2).getValue();
        gapComposer.end(false);
        return sellerCardViewModel;
    }
}
