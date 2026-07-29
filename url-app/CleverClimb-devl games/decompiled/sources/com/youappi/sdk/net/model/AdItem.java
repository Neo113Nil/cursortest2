package com.youappi.sdk.net.model;

import com.google.gson.a.c;
import com.tapjoy.TJAdUnitConstants;
import com.youappi.sdk.AdType;
import com.youappi.sdk.mediation.admob.ParamNames;
import java.io.Serializable;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class AdItem implements Serializable {

    @c(a = ParamNames.AD_UNIT_ID)
    private String _adUnitID;

    @c(a = "campaignId")
    private int _campaignId;

    @c(a = "promotedItem")
    private PromotedItem _promotedItem;

    @c(a = "adId")
    private String adId;

    @c(a = "moat")
    private MoatDetails moatDetails;
    private String responseId;

    public enum AdvertiserType {
        AdvertiserApp,
        AdvertiserBrand
    }

    public static class MoatConfig implements Serializable {

        @c(a = "partnerCodeVideo")
        private String partnerCodeVideo;

        @c(a = "partnerCodeWebView")
        private String partnerCodeWebView;

        public String getPartnerCodeVideo() {
            return this.partnerCodeVideo;
        }

        public String getPartnerCodeWebView() {
            return this.partnerCodeWebView;
        }
    }

    public static class MoatDetails implements Serializable {

        @c(a = "cardParams")
        private Map<String, String> cardParams;

        @c(a = "config")
        private MoatConfig config;

        @c(a = "params")
        private Map<String, String> params;

        public Map<String, String> getCardParams() {
            return this.cardParams;
        }

        public MoatConfig getConfig() {
            return this.config;
        }

        public Map<String, String> getParams() {
            return this.params;
        }
    }

    public static class PromotedItem implements Serializable {

        @c(a = "advertiserId")
        private String _advertiserId;

        @c(a = "clickThroughUrl")
        private String _clickThroughUrl;

        @c(a = "iconUrl")
        private String _iconUrl;

        @c(a = "promotedItemId")
        private String _promotedItemId;

        @c(a = "rating")
        private Double _rating;

        @c(a = "redirectUrl")
        private String _redirectUrl;

        @c(a = TJAdUnitConstants.String.TITLE)
        private String _title;

        @c(a = "type")
        private String _type;

        public PromotedItem(String str, String str2, String str3, String str4, String str5, String str6, double d2, String str7) {
            this._title = str;
            this._promotedItemId = str2;
            this._advertiserId = str3;
            this._type = str4;
            this._clickThroughUrl = str5;
            this._rating = Double.valueOf(d2);
            this._iconUrl = str6;
            this._redirectUrl = str7;
        }

        public String getAdvertiserId() {
            return this._advertiserId;
        }

        public String getClickThroughUrl() {
            return this._clickThroughUrl;
        }

        public String getIconUrl() {
            return this._iconUrl;
        }

        public String getPromotedItemId() {
            return this._promotedItemId;
        }

        public Double getRating() {
            return this._rating;
        }

        public String getRedirectUrl() {
            return this._redirectUrl;
        }

        public String getTitle() {
            return this._title;
        }

        public AdvertiserType getType() {
            return this._type.equals("AdvertiserBrand") ? AdvertiserType.AdvertiserBrand : AdvertiserType.AdvertiserApp;
        }

        public void setClickThroughUrl(String str) {
            this._clickThroughUrl = str;
        }
    }

    public boolean equals(Object obj) {
        return obj != null && getClass().equals(obj.getClass()) && this._campaignId == ((AdItem) obj)._campaignId;
    }

    public String getAdId() {
        return this.adId;
    }

    public abstract AdType getAdType();

    public String getAdUnitID() {
        return this._adUnitID;
    }

    public int getCampaignId() {
        return this._campaignId;
    }

    public abstract CardConfig getCardConfig();

    public abstract EventUrls getEventUrls();

    public MoatDetails getMoatDetails() {
        return this.moatDetails;
    }

    public PromotedItem getPromotedItem() {
        return this._promotedItem;
    }

    public String getResponseId() {
        return this.responseId;
    }

    public int hashCode() {
        return this._campaignId + getClass().hashCode();
    }

    public void setAdId(String str) {
        this.adId = str;
    }

    public void setAdUnitID(String str) {
        this._adUnitID = str;
    }

    public void setCampaignId(int i) {
        this._campaignId = i;
    }

    public void setMoatDetails(MoatDetails moatDetails) {
        this.moatDetails = moatDetails;
    }

    public void setPromotedItem(PromotedItem promotedItem) {
        this._promotedItem = promotedItem;
    }

    public void setResponseId(String str) {
        this.responseId = str;
    }
}
