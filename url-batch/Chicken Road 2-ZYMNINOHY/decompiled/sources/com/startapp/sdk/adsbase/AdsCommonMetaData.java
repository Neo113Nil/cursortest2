package com.startapp.sdk.adsbase;

import android.content.Context;
import com.startapp.json.TypeInfo;
import com.startapp.sdk.adsbase.adrules.AdRules;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataStyle;
import com.startapp.sdk.internal.d9;
import com.startapp.sdk.internal.e7;
import com.startapp.sdk.internal.e9;
import com.startapp.sdk.internal.si;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class AdsCommonMetaData implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f6302a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final HashSet f6303b = new HashSet(Arrays.asList("BOLD"));

    /* renamed from: c, reason: collision with root package name */
    public static final Integer f6304c = -16777216;

    /* renamed from: d, reason: collision with root package name */
    public static final Integer f6305d = -14803426;

    /* renamed from: e, reason: collision with root package name */
    public static final Integer f6306e = -1;

    /* renamed from: f, reason: collision with root package name */
    private static AdsCommonMetaData f6307f = new AdsCommonMetaData();
    private static final long serialVersionUID = -7993856006767514058L;

    @TypeInfo(complex = true)
    private AdRules adRules;
    private boolean appPresence;
    private boolean autoInterstitialEnabled;
    private int defaultActivitiesBetweenAds;
    private int defaultSecondsBetweenAds;
    private boolean disableInAppStore;
    private boolean disableTwoClicks;
    private boolean enableForceExternalBrowser;
    private boolean enableSmartRedirect;
    private boolean enforceForeground;
    private Long explicitLoadIntervalMillis;
    private int forceExternalBrowserDaysInterval;
    private Integer itemDescriptionTextColor;

    @TypeInfo(type = HashSet.class)
    private Set<String> itemDescriptionTextDecoration;
    private Integer itemDescriptionTextSize;
    private Integer itemTitleTextColor;

    @TypeInfo(type = HashSet.class)
    private Set<String> itemTitleTextDecoration;
    private Integer itemTitleTextSize;
    private Integer poweredByBackgroundColor;
    private Integer poweredByTextColor;
    private long smartRedirectLoadedTimeout;
    private int smartRedirectTimeout;

    @TypeInfo(type = HashMap.class, value = MetaDataStyle.class)
    private HashMap<String, MetaDataStyle> templates;

    @TypeInfo(complex = true)
    private VideoConfig video;
    private String acMetadataUpdateVersion = "5.3.0";
    private Integer probability3D = 0;
    private Integer homeProbability3D = 80;
    private Integer fullpageOfferWallProbability = 100;
    private Integer fullpageOverlayProbability = 0;
    private Integer backgroundGradientTop = -14606047;
    private Integer backgroundGradientBottom = -14606047;
    private Integer maxAds = 10;
    private Integer titleBackgroundColor = -14803426;
    private String titleContent = "Recommended for you";
    private Integer titleTextSize = 18;
    private Integer titleTextColor = -1;

    @TypeInfo(type = HashSet.class)
    private Set<String> titleTextDecoration = f6303b;
    private Integer titleLineColor = f6304c;
    private Integer itemGradientTop = -14014151;
    private Integer itemGradientBottom = -8750199;

    public AdsCommonMetaData() {
        HashSet hashSet = MetaDataStyle.f6523a;
        this.itemTitleTextSize = 18;
        this.itemTitleTextColor = -1;
        this.itemTitleTextDecoration = MetaDataStyle.f6523a;
        this.itemDescriptionTextSize = MetaDataStyle.f6524b;
        this.itemDescriptionTextColor = MetaDataStyle.f6525c;
        this.itemDescriptionTextDecoration = MetaDataStyle.f6526d;
        this.templates = new HashMap<>();
        this.adRules = new AdRules();
        this.poweredByBackgroundColor = f6305d;
        this.poweredByTextColor = f6306e;
        this.smartRedirectTimeout = 5;
        this.smartRedirectLoadedTimeout = 1000L;
        this.enableSmartRedirect = true;
        this.autoInterstitialEnabled = true;
        this.defaultActivitiesBetweenAds = 1;
        this.defaultSecondsBetweenAds = 0;
        this.disableTwoClicks = false;
        this.appPresence = true;
        this.disableInAppStore = false;
        this.video = new VideoConfig();
        this.forceExternalBrowserDaysInterval = 7;
        this.enableForceExternalBrowser = false;
        this.enforceForeground = false;
    }

    public static void a(Context context) {
        AdsCommonMetaData adsCommonMetaData = (AdsCommonMetaData) e7.b(context, "StartappAdsMetadata");
        AdsCommonMetaData adsCommonMetaData2 = new AdsCommonMetaData();
        if (adsCommonMetaData == null) {
            f6307f = adsCommonMetaData2;
            return;
        }
        boolean a3 = si.a((Serializable) adsCommonMetaData, (Serializable) adsCommonMetaData2);
        if ("5.3.0".equals(adsCommonMetaData.acMetadataUpdateVersion) && a3) {
            d9 d9Var = new d9(e9.f6839e);
            d9Var.f6792d = "metadata_null";
            d9Var.a();
        }
        adsCommonMetaData.adRules.a();
        f6307f = adsCommonMetaData;
    }

    public static AdsCommonMetaData k() {
        return f6307f;
    }

    public final String A() {
        return this.titleContent;
    }

    public final Integer B() {
        return this.titleLineColor;
    }

    public final Integer C() {
        return this.titleTextColor;
    }

    public final Set D() {
        return this.titleTextDecoration;
    }

    public final Integer E() {
        return this.titleTextSize;
    }

    public final VideoConfig F() {
        return this.video;
    }

    public final boolean G() {
        return this.appPresence;
    }

    public final boolean H() {
        return this.autoInterstitialEnabled;
    }

    public final boolean I() {
        return this.disableInAppStore;
    }

    public final boolean J() {
        return this.disableTwoClicks;
    }

    public final boolean K() {
        return this.enableSmartRedirect;
    }

    public final boolean L() {
        return this.enforceForeground;
    }

    public final AdRules b() {
        return this.adRules;
    }

    public final int c() {
        return this.backgroundGradientBottom.intValue();
    }

    public final int d() {
        return this.backgroundGradientTop.intValue();
    }

    public final int e() {
        return this.forceExternalBrowserDaysInterval;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AdsCommonMetaData adsCommonMetaData = (AdsCommonMetaData) obj;
            if (this.smartRedirectTimeout == adsCommonMetaData.smartRedirectTimeout && this.smartRedirectLoadedTimeout == adsCommonMetaData.smartRedirectLoadedTimeout && this.enableSmartRedirect == adsCommonMetaData.enableSmartRedirect && this.autoInterstitialEnabled == adsCommonMetaData.autoInterstitialEnabled && this.defaultActivitiesBetweenAds == adsCommonMetaData.defaultActivitiesBetweenAds && this.defaultSecondsBetweenAds == adsCommonMetaData.defaultSecondsBetweenAds && this.disableTwoClicks == adsCommonMetaData.disableTwoClicks && this.appPresence == adsCommonMetaData.appPresence && this.disableInAppStore == adsCommonMetaData.disableInAppStore && this.forceExternalBrowserDaysInterval == adsCommonMetaData.forceExternalBrowserDaysInterval && this.enableForceExternalBrowser == adsCommonMetaData.enableForceExternalBrowser && this.enforceForeground == adsCommonMetaData.enforceForeground && si.a((Object) this.acMetadataUpdateVersion, (Object) adsCommonMetaData.acMetadataUpdateVersion) && si.a((Object) this.probability3D, (Object) adsCommonMetaData.probability3D) && si.a((Object) this.homeProbability3D, (Object) adsCommonMetaData.homeProbability3D) && si.a((Object) this.fullpageOfferWallProbability, (Object) adsCommonMetaData.fullpageOfferWallProbability) && si.a((Object) this.fullpageOverlayProbability, (Object) adsCommonMetaData.fullpageOverlayProbability) && si.a((Object) this.backgroundGradientTop, (Object) adsCommonMetaData.backgroundGradientTop) && si.a((Object) this.backgroundGradientBottom, (Object) adsCommonMetaData.backgroundGradientBottom) && si.a((Object) this.maxAds, (Object) adsCommonMetaData.maxAds) && si.a((Object) this.explicitLoadIntervalMillis, (Object) adsCommonMetaData.explicitLoadIntervalMillis) && si.a((Object) this.titleBackgroundColor, (Object) adsCommonMetaData.titleBackgroundColor) && si.a((Object) this.titleContent, (Object) adsCommonMetaData.titleContent) && si.a((Object) this.titleTextSize, (Object) adsCommonMetaData.titleTextSize) && si.a((Object) this.titleTextColor, (Object) adsCommonMetaData.titleTextColor) && si.a(this.titleTextDecoration, adsCommonMetaData.titleTextDecoration) && si.a((Object) this.titleLineColor, (Object) adsCommonMetaData.titleLineColor) && si.a((Object) this.itemGradientTop, (Object) adsCommonMetaData.itemGradientTop) && si.a((Object) this.itemGradientBottom, (Object) adsCommonMetaData.itemGradientBottom) && si.a((Object) this.itemTitleTextSize, (Object) adsCommonMetaData.itemTitleTextSize) && si.a((Object) this.itemTitleTextColor, (Object) adsCommonMetaData.itemTitleTextColor) && si.a(this.itemTitleTextDecoration, adsCommonMetaData.itemTitleTextDecoration) && si.a((Object) this.itemDescriptionTextSize, (Object) adsCommonMetaData.itemDescriptionTextSize) && si.a((Object) this.itemDescriptionTextColor, (Object) adsCommonMetaData.itemDescriptionTextColor) && si.a(this.itemDescriptionTextDecoration, adsCommonMetaData.itemDescriptionTextDecoration) && si.a((Object) this.templates, (Object) adsCommonMetaData.templates) && si.a((Object) this.adRules, (Object) adsCommonMetaData.adRules) && si.a((Object) this.poweredByBackgroundColor, (Object) adsCommonMetaData.poweredByBackgroundColor) && si.a((Object) this.poweredByTextColor, (Object) adsCommonMetaData.poweredByTextColor) && si.a((Object) this.video, (Object) adsCommonMetaData.video)) {
                return true;
            }
        }
        return false;
    }

    public final int f() {
        return this.defaultActivitiesBetweenAds;
    }

    public final int g() {
        return this.defaultSecondsBetweenAds;
    }

    public final Long h() {
        return this.explicitLoadIntervalMillis;
    }

    public final int hashCode() {
        Object[] objArr = {this.acMetadataUpdateVersion, this.probability3D, this.homeProbability3D, this.fullpageOfferWallProbability, this.fullpageOverlayProbability, this.backgroundGradientTop, this.backgroundGradientBottom, this.maxAds, this.explicitLoadIntervalMillis, this.titleBackgroundColor, this.titleContent, this.titleTextSize, this.titleTextColor, this.titleTextDecoration, this.titleLineColor, this.itemGradientTop, this.itemGradientBottom, this.itemTitleTextSize, this.itemTitleTextColor, this.itemTitleTextDecoration, this.itemDescriptionTextSize, this.itemDescriptionTextColor, this.itemDescriptionTextDecoration, this.templates, this.adRules, this.poweredByBackgroundColor, this.poweredByTextColor, Integer.valueOf(this.smartRedirectTimeout), Long.valueOf(this.smartRedirectLoadedTimeout), Boolean.valueOf(this.enableSmartRedirect), Boolean.valueOf(this.autoInterstitialEnabled), Integer.valueOf(this.defaultActivitiesBetweenAds), Integer.valueOf(this.defaultSecondsBetweenAds), Boolean.valueOf(this.disableTwoClicks), Boolean.valueOf(this.appPresence), Boolean.valueOf(this.disableInAppStore), this.video, Integer.valueOf(this.forceExternalBrowserDaysInterval), Boolean.valueOf(this.enableForceExternalBrowser), Boolean.valueOf(this.enforceForeground)};
        WeakHashMap weakHashMap = si.f7575a;
        return Arrays.deepHashCode(objArr);
    }

    public final int i() {
        return this.fullpageOfferWallProbability.intValue();
    }

    public final int j() {
        return this.fullpageOverlayProbability.intValue();
    }

    public final Integer l() {
        return this.itemDescriptionTextColor;
    }

    public final Set m() {
        return this.itemDescriptionTextDecoration;
    }

    public final Integer n() {
        return this.itemDescriptionTextSize;
    }

    public final int o() {
        return this.itemGradientBottom.intValue();
    }

    public final int p() {
        return this.itemGradientTop.intValue();
    }

    public final Integer q() {
        return this.itemTitleTextColor;
    }

    public final Set r() {
        return this.itemTitleTextDecoration;
    }

    public final Integer s() {
        return this.itemTitleTextSize;
    }

    public final int t() {
        return this.maxAds.intValue();
    }

    public final Integer u() {
        return this.poweredByBackgroundColor;
    }

    public final Integer v() {
        return this.poweredByTextColor;
    }

    public final int w() {
        return this.probability3D.intValue();
    }

    public final long x() {
        return this.smartRedirectLoadedTimeout;
    }

    public final long y() {
        return TimeUnit.SECONDS.toMillis(this.smartRedirectTimeout);
    }

    public final Integer z() {
        return this.titleBackgroundColor;
    }

    public final MetaDataStyle a(String str) {
        return this.templates.get(str);
    }

    public final boolean a() {
        return this.enableForceExternalBrowser;
    }

    public static void a(Context context, AdsCommonMetaData adsCommonMetaData) {
        synchronized (f6302a) {
            adsCommonMetaData.acMetadataUpdateVersion = "5.3.0";
            f6307f = adsCommonMetaData;
            e7.c(context, "StartappAdsMetadata", adsCommonMetaData);
        }
    }
}
