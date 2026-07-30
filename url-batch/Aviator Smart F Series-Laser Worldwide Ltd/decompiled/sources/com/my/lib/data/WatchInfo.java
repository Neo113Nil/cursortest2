package com.my.lib.data;

import com.my.lib.enums.LicenseModel;
import com.my.lib.enums.PaymentModel;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class WatchInfo {
    private String avatarUrl;
    private String language;
    private LicenseModel licenseModel;
    private String name;
    private final PaymentModel payModel;
    private String resolution;
    private SubscriptionInfo subscriptionInfo;
    private String supportedLanguages;
    private String thirdUuid;
    private String thuResolution;
    private final String wid;

    public WatchInfo(PaymentModel payModel, String wid) {
        s.checkNotNullParameter(payModel, "payModel");
        s.checkNotNullParameter(wid, "wid");
        this.payModel = payModel;
        this.wid = wid;
        this.licenseModel = LicenseModel.KNOWN_DEVICE;
        this.thirdUuid = "";
        this.name = "";
        this.avatarUrl = "";
        this.resolution = "";
        this.thuResolution = "";
        this.language = "";
        this.supportedLanguages = "";
    }

    public static /* synthetic */ WatchInfo copy$default(WatchInfo watchInfo, PaymentModel paymentModel, String str, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            paymentModel = watchInfo.payModel;
        }
        if ((i8 & 2) != 0) {
            str = watchInfo.wid;
        }
        return watchInfo.copy(paymentModel, str);
    }

    public final PaymentModel component1() {
        return this.payModel;
    }

    public final String component2() {
        return this.wid;
    }

    public final WatchInfo copy(PaymentModel payModel, String wid) {
        s.checkNotNullParameter(payModel, "payModel");
        s.checkNotNullParameter(wid, "wid");
        return new WatchInfo(payModel, wid);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WatchInfo)) {
            return false;
        }
        WatchInfo watchInfo = (WatchInfo) obj;
        return this.payModel == watchInfo.payModel && s.areEqual(this.wid, watchInfo.wid);
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final LicenseModel getLicenseModel() {
        return this.licenseModel;
    }

    public final String getName() {
        return this.name;
    }

    public final PaymentModel getPayModel() {
        return this.payModel;
    }

    public final String getResolution() {
        return this.resolution;
    }

    public final SubscriptionInfo getSubscriptionInfo() {
        return this.subscriptionInfo;
    }

    public final String getSupportedLanguages() {
        return this.supportedLanguages;
    }

    public final String getThirdUuid() {
        return this.thirdUuid;
    }

    public final String getThuResolution() {
        return this.thuResolution;
    }

    public final String getWid() {
        return this.wid;
    }

    public int hashCode() {
        return this.wid.hashCode() + (this.payModel.hashCode() * 31);
    }

    public final void setAvatarUrl(String str) {
        s.checkNotNullParameter(str, "<set-?>");
        this.avatarUrl = str;
    }

    public final void setLanguage(String str) {
        s.checkNotNullParameter(str, "<set-?>");
        this.language = str;
    }

    public final void setLicenseModel(LicenseModel licenseModel) {
        s.checkNotNullParameter(licenseModel, "<set-?>");
        this.licenseModel = licenseModel;
    }

    public final void setName(String str) {
        s.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final void setResolution(String str) {
        s.checkNotNullParameter(str, "<set-?>");
        this.resolution = str;
    }

    public final void setSubscriptionInfo(SubscriptionInfo subscriptionInfo) {
        this.subscriptionInfo = subscriptionInfo;
    }

    public final void setSupportedLanguages(String str) {
        s.checkNotNullParameter(str, "<set-?>");
        this.supportedLanguages = str;
    }

    public final void setThirdUuid(String str) {
        s.checkNotNullParameter(str, "<set-?>");
        this.thirdUuid = str;
    }

    public final void setThuResolution(String str) {
        s.checkNotNullParameter(str, "<set-?>");
        this.thuResolution = str;
    }

    public String toString() {
        return "WatchInfo(payModel=" + this.payModel + ", wid=" + this.wid + ")";
    }
}
