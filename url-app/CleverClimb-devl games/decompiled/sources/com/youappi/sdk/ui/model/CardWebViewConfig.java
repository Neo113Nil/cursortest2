package com.youappi.sdk.ui.model;

import android.content.Context;
import com.google.gson.a.c;
import com.tapjoy.TJAdUnitConstants;
import com.youappi.sdk.net.model.AdItem;
import com.youappi.sdk.net.model.CardConfig;
import com.youappi.sdk.net.model.DeviceOrientation;
import com.youappi.sdk.net.model.EventUrls;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class CardWebViewConfig {

    @c(a = "button")
    private CardConfig.ButtonDescriptor _buttonDescriptor;

    @c(a = "eventUrls")
    private EventUrls _eventUrls;

    @c(a = "iconUrl")
    private String _iconUrl;

    @c(a = "landscapeImages")
    private ArrayList<String> _landscapeImageUrlList;

    @c(a = "portraitImages")
    private ArrayList<String> _portraitImageUrlList;

    @c(a = "rating")
    private Double _rating;

    @c(a = "redirectUrl")
    private String _redirectUrl;

    @c(a = TJAdUnitConstants.String.TITLE)
    private String _title;

    @c(a = "staticAssetUrls")
    private CardConfig.AssetUrls assetUrls;

    @c(a = "deviceOrientation")
    private String deviceOrientation;
    private boolean showNativeControls;

    public CardWebViewConfig(CardConfig cardConfig, AdItem.PromotedItem promotedItem, CardConfig.AssetUrls assetUrls) {
        this._redirectUrl = promotedItem.getClickThroughUrl();
        this._buttonDescriptor = cardConfig.getButtonDescriptor();
        this._eventUrls = cardConfig.getEventUrls();
        this._title = promotedItem.getTitle();
        this._iconUrl = promotedItem.getIconUrl();
        this._rating = promotedItem.getRating();
        this.assetUrls = assetUrls;
        this._landscapeImageUrlList = cardConfig.getLandscapeImageUrlList();
        this._portraitImageUrlList = cardConfig.getPortraitImageUrlList();
    }

    public static DeviceOrientation getDeviceOrientation(Context context) {
        return context.getResources().getConfiguration().orientation == 2 ? DeviceOrientation.Landscape : DeviceOrientation.Portrait;
    }

    public CardConfig.ButtonDescriptor getButtonDescriptor() {
        return this._buttonDescriptor;
    }

    public EventUrls getEventUrls() {
        return this._eventUrls;
    }

    public String getIconUrl() {
        return this._iconUrl;
    }

    public ArrayList<String> getLandscapeImageUrlList() {
        return this._landscapeImageUrlList;
    }

    public ArrayList<String> getPortraitImageUrlList() {
        return this._portraitImageUrlList;
    }

    public double getRating() {
        return this._rating.doubleValue();
    }

    public String getRedirectUrl() {
        return this._redirectUrl;
    }

    public CardConfig.AssetUrls getStaticAssetUrls() {
        return this.assetUrls;
    }

    public String getTitle() {
        return this._title;
    }

    public boolean isShowNativeControls() {
        return this.showNativeControls;
    }

    public void setDeviceOrientation(String str) {
        this.deviceOrientation = str;
    }

    public void setShowNativeControls(boolean z) {
        this.showNativeControls = z;
    }
}
