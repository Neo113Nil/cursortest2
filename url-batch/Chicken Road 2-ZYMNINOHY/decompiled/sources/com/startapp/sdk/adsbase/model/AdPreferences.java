package com.startapp.sdk.adsbase.model;

import android.content.Context;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.SDKAdPreferences;
import com.startapp.sdk.internal.e7;
import com.startapp.sdk.internal.fh;
import com.startapp.sdk.internal.gh;
import com.startapp.sdk.internal.si;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class AdPreferences implements Serializable {
    public static final String TYPE_APP_WALL = "APP_WALL";
    public static final String TYPE_BANNER = "BANNER";
    public static final String TYPE_INAPP_EXIT = "INAPP_EXIT";
    public static final String TYPE_SCRINGO_TOOLBAR = "SCRINGO_TOOLBAR";
    public static final String TYPE_TEXT = "TEXT";
    private static final long serialVersionUID = 5287002180723228322L;
    private String adTag;
    private String age;
    private Boolean ai;
    private Integer autoLoadAmount;
    private Set<String> categories;
    private Set<String> categoriesExclude;
    protected boolean forceFullpage;
    protected boolean forceOfferWall2D;
    protected boolean forceOfferWall3D;
    protected boolean forceOverlay;
    private SDKAdPreferences.Gender gender;
    private boolean hardwareAccelerated;
    private boolean isPreCached;
    private String keywords;
    private Double latitude;
    private Double longitude;
    protected Double minCpm;
    protected Set<String> packageInclude;
    private String placementId;
    private String productId;
    private boolean testMode;
    protected Ad.AdType type;
    private boolean videoMuted;

    public enum Placement {
        INAPP_FULL_SCREEN(1),
        INAPP_BANNER(2),
        INAPP_OFFER_WALL(3),
        INAPP_SPLASH(4),
        INAPP_OVERLAY(5),
        INAPP_NATIVE(6),
        DEVICE_SIDEBAR(7),
        INAPP_RETURN(8),
        INAPP_BROWSER(9);

        private final int index;

        Placement(int i4) {
            this.index = i4;
        }

        public static Placement getByIndex(int i4) {
            Placement placement = INAPP_FULL_SCREEN;
            for (Placement placement2 : values()) {
                if (placement2.getIndex() == i4) {
                    return placement2;
                }
            }
            return placement;
        }

        public int getIndex() {
            return this.index;
        }

        public boolean isInterstitial() {
            return this == INAPP_FULL_SCREEN || this == INAPP_OFFER_WALL || this == INAPP_OVERLAY;
        }
    }

    public AdPreferences() {
        this.type = null;
        this.packageInclude = null;
        this.forceOfferWall3D = false;
        this.forceOfferWall2D = false;
        this.forceFullpage = false;
        this.forceOverlay = false;
        this.minCpm = null;
        this.testMode = false;
        this.longitude = null;
        this.latitude = null;
        this.keywords = null;
        this.gender = null;
        this.age = null;
        this.ai = null;
        this.videoMuted = false;
        this.adTag = null;
        this.hardwareAccelerated = fh.f6918a.f7012m;
        this.categories = null;
        this.categoriesExclude = null;
    }

    public AdPreferences addCategory(String str) {
        if (this.categories == null) {
            this.categories = new HashSet();
        }
        this.categories.add(str);
        return this;
    }

    public AdPreferences addCategoryExclude(String str) {
        if (this.categoriesExclude == null) {
            this.categoriesExclude = new HashSet();
        }
        this.categoriesExclude.add(str);
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AdPreferences adPreferences = (AdPreferences) obj;
            if (this.forceOfferWall3D == adPreferences.forceOfferWall3D && this.forceOfferWall2D == adPreferences.forceOfferWall2D && this.forceFullpage == adPreferences.forceFullpage && this.forceOverlay == adPreferences.forceOverlay && this.testMode == adPreferences.testMode && this.videoMuted == adPreferences.videoMuted && this.hardwareAccelerated == adPreferences.hardwareAccelerated && this.type == adPreferences.type && si.a(this.packageInclude, adPreferences.packageInclude) && si.a((Object) this.minCpm, (Object) adPreferences.minCpm) && si.a((Object) this.longitude, (Object) adPreferences.longitude) && si.a((Object) this.latitude, (Object) adPreferences.latitude) && si.a((Object) this.keywords, (Object) adPreferences.keywords) && this.gender == adPreferences.gender && si.a((Object) this.age, (Object) adPreferences.age) && si.a((Object) this.ai, (Object) adPreferences.ai) && si.a((Object) this.adTag, (Object) adPreferences.adTag) && si.a((Object) this.productId, (Object) adPreferences.productId) && si.a((Object) this.autoLoadAmount, (Object) adPreferences.autoLoadAmount) && this.isPreCached == adPreferences.isPreCached && si.a(this.categories, adPreferences.categories) && si.a(this.categoriesExclude, adPreferences.categoriesExclude) && si.a((Object) this.placementId, (Object) adPreferences.placementId)) {
                return true;
            }
        }
        return false;
    }

    public String getAdTag() {
        return this.adTag;
    }

    public String getAge(Context context) {
        String str = this.age;
        if (str != null) {
            return str;
        }
        gh ghVar = fh.f6918a;
        if (ghVar.f7000a == null) {
            SDKAdPreferences sDKAdPreferences = (SDKAdPreferences) e7.b(context, "shared_prefs_sdk_ad_prefs");
            if (sDKAdPreferences == null) {
                ghVar.f7000a = new SDKAdPreferences();
            } else {
                ghVar.f7000a = sDKAdPreferences;
            }
        }
        return ghVar.f7000a.getAge();
    }

    public Boolean getAi() {
        return this.ai;
    }

    public Boolean getAs() {
        return Boolean.FALSE;
    }

    public Integer getAutoLoadAmount() {
        return this.autoLoadAmount;
    }

    public Set<String> getCategories() {
        return this.categories;
    }

    public Set<String> getCategoriesExclude() {
        return this.categoriesExclude;
    }

    public String getCustomProductId() {
        return this.productId;
    }

    public SDKAdPreferences.Gender getGender(Context context) {
        SDKAdPreferences.Gender gender = this.gender;
        if (gender != null) {
            return gender;
        }
        gh ghVar = fh.f6918a;
        if (ghVar.f7000a == null) {
            SDKAdPreferences sDKAdPreferences = (SDKAdPreferences) e7.b(context, "shared_prefs_sdk_ad_prefs");
            if (sDKAdPreferences == null) {
                ghVar.f7000a = new SDKAdPreferences();
            } else {
                ghVar.f7000a = sDKAdPreferences;
            }
        }
        return ghVar.f7000a.getGender();
    }

    public String getKeywords() {
        return this.keywords;
    }

    public Double getLatitude() {
        return this.latitude;
    }

    public Double getLongitude() {
        return this.longitude;
    }

    public Double getMinCpm() {
        return this.minCpm;
    }

    public String getPlacementId() {
        return this.placementId;
    }

    public Ad.AdType getType() {
        return this.type;
    }

    public int hashCode() {
        Object[] objArr = {this.type, this.packageInclude, Boolean.valueOf(this.forceOfferWall3D), Boolean.valueOf(this.forceOfferWall2D), Boolean.valueOf(this.forceFullpage), Boolean.valueOf(this.forceOverlay), this.minCpm, Boolean.valueOf(this.testMode), this.longitude, this.latitude, this.keywords, this.gender, this.age, this.ai, Boolean.valueOf(this.videoMuted), this.adTag, this.productId, Boolean.valueOf(this.hardwareAccelerated), this.autoLoadAmount, Boolean.valueOf(this.isPreCached), this.categories, this.categoriesExclude, this.placementId};
        WeakHashMap weakHashMap = si.f7575a;
        return Arrays.deepHashCode(objArr);
    }

    public boolean isForceFullpage() {
        return this.forceFullpage;
    }

    public boolean isForceOfferWall2D() {
        return this.forceOfferWall2D;
    }

    public boolean isForceOfferWall3D() {
        return this.forceOfferWall3D;
    }

    public boolean isForceOverlay() {
        return this.forceOverlay;
    }

    public boolean isHardwareAccelerated() {
        return this.hardwareAccelerated;
    }

    public boolean isPreCached() {
        return this.isPreCached;
    }

    public boolean isSimpleToken() {
        return true;
    }

    public boolean isTestMode() {
        return this.testMode;
    }

    public boolean isVideoMuted() {
        return this.videoMuted;
    }

    public void makePreCached() {
        this.isPreCached = true;
    }

    public AdPreferences muteVideo() {
        this.videoMuted = true;
        return this;
    }

    public AdPreferences setAdTag(String str) {
        this.adTag = str;
        return this;
    }

    public AdPreferences setAge(Integer num) {
        this.age = Integer.toString(num.intValue());
        return this;
    }

    public AdPreferences setAi(Boolean bool) {
        this.ai = bool;
        return this;
    }

    public AdPreferences setAs(Boolean bool) {
        return this;
    }

    public void setAutoLoadAmount(int i4) {
        if (i4 > 0) {
            this.autoLoadAmount = Integer.valueOf(i4);
        }
    }

    public AdPreferences setCustomProductId(String str) {
        this.productId = str;
        return this;
    }

    public AdPreferences setGender(SDKAdPreferences.Gender gender) {
        this.gender = gender;
        return this;
    }

    public void setHardwareAccelerated(boolean z) {
        this.hardwareAccelerated = z;
    }

    public AdPreferences setKeywords(String str) {
        this.keywords = str;
        return this;
    }

    public AdPreferences setLatitude(double d4) {
        this.latitude = Double.valueOf(d4);
        return this;
    }

    public AdPreferences setLongitude(double d4) {
        this.longitude = Double.valueOf(d4);
        return this;
    }

    public void setMinCpm(Double d4) {
        this.minCpm = d4;
    }

    public void setPlacementId(String str) {
        this.placementId = str;
    }

    public AdPreferences setTestMode(boolean z) {
        this.testMode = z;
        return this;
    }

    public void setType(Ad.AdType adType) {
        this.type = adType;
    }

    public AdPreferences setAge(String str) {
        this.age = str;
        return this;
    }

    public AdPreferences(AdPreferences adPreferences) {
        this.type = null;
        this.packageInclude = null;
        this.forceOfferWall3D = false;
        this.forceOfferWall2D = false;
        this.forceFullpage = false;
        this.forceOverlay = false;
        this.minCpm = null;
        this.testMode = false;
        this.longitude = null;
        this.latitude = null;
        this.keywords = null;
        this.gender = null;
        this.age = null;
        this.ai = null;
        this.videoMuted = false;
        this.adTag = null;
        this.hardwareAccelerated = fh.f6918a.f7012m;
        this.categories = null;
        this.categoriesExclude = null;
        this.type = adPreferences.type;
        if (adPreferences.packageInclude != null) {
            this.packageInclude = new HashSet(adPreferences.packageInclude);
        }
        this.minCpm = adPreferences.minCpm;
        this.forceOfferWall3D = adPreferences.forceOfferWall3D;
        this.forceOfferWall2D = adPreferences.forceOfferWall2D;
        this.forceFullpage = adPreferences.forceFullpage;
        this.forceOverlay = adPreferences.forceOverlay;
        this.testMode = adPreferences.testMode;
        this.longitude = adPreferences.longitude;
        this.latitude = adPreferences.latitude;
        this.keywords = adPreferences.keywords;
        this.gender = adPreferences.gender;
        this.age = adPreferences.age;
        this.ai = adPreferences.ai;
        this.videoMuted = adPreferences.videoMuted;
        this.adTag = adPreferences.adTag;
        this.hardwareAccelerated = adPreferences.hardwareAccelerated;
        this.autoLoadAmount = adPreferences.autoLoadAmount;
        this.isPreCached = adPreferences.isPreCached;
        this.productId = adPreferences.productId;
        if (adPreferences.categories != null) {
            this.categories = new HashSet(adPreferences.categories);
        }
        if (adPreferences.categoriesExclude != null) {
            this.categoriesExclude = new HashSet(adPreferences.categoriesExclude);
        }
        this.placementId = adPreferences.placementId;
    }
}
