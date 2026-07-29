package com.youappi.sdk;

import com.youappi.sdk.net.model.CardList;
import com.youappi.sdk.net.model.ProductItem;
import com.youappi.sdk.net.model.RewardedVideoList;
import com.youappi.sdk.net.model.VideoList;
import com.youappi.sdk.ui.model.AdViewModel;
import com.youappi.sdk.ui.model.CardViewModel;
import com.youappi.sdk.ui.model.VideoCardViewModel;
import com.youappi.sdk.ui.views.CardAdView;
import com.youappi.sdk.ui.views.IAdView;
import com.youappi.sdk.ui.views.InterstitialVideoAdView;
import com.youappi.sdk.ui.views.RewardedVideoAdView;

/* loaded from: classes2.dex */
public enum AdType {
    CARD(CardAdView.class, CardList.class, CardViewModel.class),
    VIDEO(InterstitialVideoAdView.class, VideoList.class, VideoCardViewModel.class),
    REWARDED_VIDEO(RewardedVideoAdView.class, RewardedVideoList.class, VideoCardViewModel.class);

    private final Class<? extends AdViewModel> _adViewModelClass;
    private final Class<? extends ProductItem> _productClass;
    private final Class<? extends IAdView> _viewClass;

    AdType(Class cls, Class cls2, Class cls3) {
        this._viewClass = cls;
        this._productClass = cls2;
        this._adViewModelClass = cls3;
    }

    public Class<? extends AdViewModel> getAdViewModelClass() {
        return this._adViewModelClass;
    }

    public Class<? extends ProductItem> getProductClass() {
        return this._productClass;
    }

    public Class<? extends IAdView> getViewClass() {
        return this._viewClass;
    }
}
