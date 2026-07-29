package com.youappi.sdk.ui.model;

import com.youappi.sdk.AdType;
import com.youappi.sdk.net.model.AdItem;
import com.youappi.sdk.net.model.ConfigurationItem;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class AdViewModel<T extends AdItem> {
    private T _adItem;
    private final ConfigurationItem _configurationItem;

    public AdViewModel(T t, ConfigurationItem configurationItem) {
        this._adItem = t;
        this._configurationItem = configurationItem;
    }

    public T getAdItem() {
        return this._adItem;
    }

    public AdType getAdType() {
        return this._adItem.getAdType();
    }

    public abstract List<String> getAssetUrls();

    public void setAdItem(T t) {
        this._adItem = t;
    }
}
