package com.youappi.sdk.net.model;

import com.google.gson.a.c;
import com.mopub.mobileads.VastExtensionXmlManager;
import com.tapjoy.TapjoyConstants;
import com.youappi.sdk.ads.YAAdRequest;
import com.youappi.sdk.mediation.admob.ParamNames;
import com.youappi.sdk.net.trackers.a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class ProductRequestItem {

    @c(a = TapjoyConstants.TJC_NOTIFICATION_DEVICE_PREFIX)
    private Device _device;

    @c(a = "geo")
    private GeoLocation _geoLocation;

    @c(a = "publisherApp")
    private PublisherApp _publisher;

    @c(a = "user")
    private User _user;

    public static class Device {
        public static final String TYPE_PHONE = "smartphone";
        public static final String TYPE_TABLET = "tablet";
        public static final String TYPE_TV = "tv";

        @c(a = "deviceId")
        private String _deviceId;

        @c(a = "deviceIdType")
        private String _deviceIdType;

        @c(a = "deviceOrientation")
        private DeviceOrientation _deviceOrientation;

        @c(a = "extInfo")
        private ExternalInfo _extInfo;

        @c(a = "deviceLanguage")
        private String _language;

        @c(a = "deviceModel")
        private String _model;

        @c(a = "deviceOs")
        private String _os;

        @c(a = "deviceOsVersion")
        private String _osVersion;

        @c(a = "deviceType")
        private String _type;

        @c(a = "userAgent")
        private String _userAgent;

        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes.dex */
        public @interface DeviceType {
        }

        public Device(String str, String str2, String str3, String str4, String str5, String str6, String str7, DeviceOrientation deviceOrientation, String str8, Float f, Float f2, Float f3) {
            this._model = str;
            this._os = str2;
            this._osVersion = str3;
            this._deviceId = str4;
            this._userAgent = str6;
            this._type = str7;
            this._deviceIdType = str5;
            this._deviceOrientation = deviceOrientation;
            this._language = str8;
            this._extInfo = new ExternalInfo(f, f2, f3);
        }
    }

    public static class ExternalInfo {

        @c(a = "batteryLevel")
        private Float _deviceBatteryLevel;

        @c(a = "externalMemoryLevel")
        private Float _externalMemoryLevel;

        @c(a = "internalMemoryLevel")
        private Float _internalMemoryLevel;

        public ExternalInfo(Float f, Float f2, Float f3) {
            this._deviceBatteryLevel = f;
            this._internalMemoryLevel = f2;
            this._externalMemoryLevel = f3;
        }
    }

    public static class GeoLocation {

        @c(a = "latitude")
        private double _lat;

        @c(a = "longitude")
        private double _lon;

        public GeoLocation(double d2, double d3) {
            this._lat = d2;
            this._lon = d3;
        }

        public double getLat() {
            return this._lat;
        }

        public double getLon() {
            return this._lon;
        }
    }

    public static class PublisherApp {
        public static final String UNIT_TYPE_CARD = "interstitialAd";
        public static final String UNIT_TYPE_REWARDED_VIDEO = "rewardedVideo";
        public static final String UNIT_TYPE_VIDEO = "interstitialVideo";

        @c(a = ParamNames.ACCESS_TOKEN)
        private String _accessToken;

        @c(a = ParamNames.AD_UNIT_ID)
        private String _adUnitId;

        @c(a = "adUnitType")
        private String _adUnitType;

        @c(a = "appId")
        private String _appId;

        @c(a = "appVersion")
        private String _appVersion;

        @c(a = "developmentPlatform")
        private String _developmentPlatform;

        @c(a = "mediation")
        private String _mediation;

        @c(a = "sdkVersion")
        private String _sdkVersion;

        @c(a = "viewabilityTrackers")
        private List<String> _viewabilityTrackers = new ArrayList();

        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes.dex */
        public @interface AdUnitType {
        }

        public PublisherApp(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            this._accessToken = str;
            this._appId = str2;
            this._adUnitType = str3;
            this._adUnitId = str4;
            this._sdkVersion = str5;
            this._mediation = str6;
            this._appVersion = str7;
            if (a.a()) {
                this._viewabilityTrackers.add(VastExtensionXmlManager.MOAT);
            }
            this._developmentPlatform = str8;
        }

        public void setAdUnitType(String str) {
            this._adUnitType = str;
        }
    }

    public static class User {

        @c(a = "age")
        private final Integer age;

        @c(a = "customParams")
        private Map<String, String> customParams;

        @c(a = "gender")
        private final YAAdRequest.Gender gender;

        @c(a = "userConsent")
        private boolean hasUserConsent;

        @c(a = "ageRestrictedUser")
        private boolean isAgeRestrictedUser;

        @c(a = "sendApps")
        private final boolean sendApps;

        public User(boolean z, boolean z2, Map<String, String> map, Integer num, YAAdRequest.Gender gender, boolean z3) {
            this.hasUserConsent = z;
            this.isAgeRestrictedUser = z2;
            this.customParams = map;
            this.age = num;
            this.gender = gender;
            this.sendApps = z3;
        }
    }

    public ProductRequestItem(PublisherApp publisherApp, Device device, User user) {
        this._publisher = publisherApp;
        this._device = device;
        this._user = user;
    }

    public Device getDevice() {
        return this._device;
    }

    public GeoLocation getGeoLocation() {
        return this._geoLocation;
    }

    public PublisherApp getPublisher() {
        return this._publisher;
    }

    public void setGeoLocation(GeoLocation geoLocation) {
        this._geoLocation = geoLocation;
    }
}
