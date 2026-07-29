package com.youappi.sdk.ui.views;

import android.view.View;
import com.youappi.sdk.BaseAd;
import com.youappi.sdk.ads.AdListener;
import com.youappi.sdk.logic.IAdEventListener;
import com.youappi.sdk.logic.IAssetResolver;
import com.youappi.sdk.ui.model.AdViewModel;

/* loaded from: classes2.dex */
public interface IAdView<T extends AdViewModel, P extends AdListener> {
    View getView();

    void loadAd();

    void onPause();

    void onResume();

    void onStart();

    void onUserInteraction();

    void setAdItem(T t);

    void setAssetResolver(IAssetResolver iAssetResolver);

    void setDeviceId(String str);

    void setInternalEventListener(IAdEventListener iAdEventListener);

    void setListener(P p);

    void setStateListener(BaseAd.AdStateListener adStateListener);

    void show();
}
