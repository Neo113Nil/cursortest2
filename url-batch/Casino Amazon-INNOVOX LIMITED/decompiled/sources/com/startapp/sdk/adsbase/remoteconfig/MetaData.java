package com.startapp.sdk.adsbase.remoteconfig;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.onesignal.location.internal.common.LocationConstants;
import com.startapp.json.TypeInfo;
import com.startapp.sdk.adsbase.b;
import com.startapp.sdk.adsbase.consent.ConsentConfig;
import com.startapp.sdk.adsbase.crashreport.ANRRemoteConfig;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.EnabledConfig;
import com.startapp.sdk.components.a;
import com.startapp.sdk.internal.af;
import com.startapp.sdk.internal.c7;
import com.startapp.sdk.internal.d2;
import com.startapp.sdk.internal.f0;
import com.startapp.sdk.internal.l7;
import com.startapp.sdk.internal.m0;
import com.startapp.sdk.internal.n8;
import com.startapp.sdk.internal.nb;
import com.startapp.sdk.internal.o8;
import com.startapp.sdk.internal.ob;
import com.startapp.sdk.internal.pa;
import com.startapp.sdk.internal.pb;
import com.startapp.sdk.internal.qb;
import com.startapp.sdk.internal.w6;
import com.startapp.sdk.internal.y5;
import com.startapp.sdk.internal.z1;
import com.startapp.sdk.internal.z6;
import com.startapp.sdk.internal.zh;
import com.startapp.sdk.sensors.SensorsData;
import com.startapp.sdk.triggeredlinks.TriggeredLinksMetadata;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public class MetaData implements Serializable {
    private static final Object d = new Object();
    private static final AtomicBoolean e = new AtomicBoolean();
    public static final HashSet f = new HashSet(Collections.singletonList(y5.f505a));
    public static final List g = Arrays.asList("https://adsmetadata.startappservice.com/adsmetadata/api/v1.0/", "https://adsmetadata.mobileadexchange.net/adsmetadata/api/v1.0/", "https://d26xw8rp6mlgfg.cloudfront.net/adsmetadata/api/v1.0/");
    public static final String h = "https://req.startappservice.com/1.5/";
    public static final int[] i = {60, 60, 240};
    public static final HashSet j = new HashSet(Arrays.asList("com.facebook.katana", "com.yandex.browser"));
    private static volatile MetaData k = new MetaData();
    private static final AtomicInteger l = new AtomicInteger();
    private static final long serialVersionUID = 8428286125005641780L;
    private long IABDisplayImpressionDelayInSeconds;
    private long IABVideoImpressionDelayInSeconds;
    private boolean SupportIABViewability;

    /* renamed from: a, reason: collision with root package name */
    private transient boolean f152a;
    private String adClickURL;

    @TypeInfo(complex = true, name = "debug")
    private AdDebuggerMetadata adDebugger;

    @TypeInfo(complex = true, parser = EnabledConfig.Parser.class)
    private EnabledConfig adLoadWaitForMetadata;
    private String adPlatformBannerHostSecured;
    private String adPlatformHostSecured;
    private String adPlatformNativeHostSecured;
    private String adPlatformOverlayHostSecured;
    private boolean adsPreCachingEnabled;

    @TypeInfo(complex = true)
    private AdvertisingIdResolverMetadata air;
    private boolean alwaysSendToken;

    @TypeInfo(complex = true)
    private AnalyticsConfig analytics;

    @TypeInfo(complex = true)
    private ANRRemoteConfig anrConfig;

    @TypeInfo(complex = true)
    private AppSessionConfig appSession;
    private String assetsBaseUrlSecured;
    private transient boolean b;

    @TypeInfo(complex = true)
    private BluetoothConfig btConfig;
    private transient ArrayList c;
    private String calcProd;
    private boolean chromeCustomeTabsExternal;
    private boolean chromeCustomeTabsInternal;
    private boolean closeAdAfterClick;
    private boolean compressionEnabled;

    @TypeInfo(complex = true)
    private ConnectivityHelperMetadata connectivity;

    @TypeInfo(complex = true)
    private ConsentConfig consentDetails;
    private boolean disableSendAdvertisingId;
    private boolean dns;

    @TypeInfo(complex = true, name = "tracer")
    private EventTracerMetadata eventTracerMetadata;
    private double flh;

    @TypeInfo(complex = true, name = "http")
    private HttpClientConfig httpClientConfig;
    private double httpPost;
    private String impressionURL;

    @TypeInfo(complex = true)
    private ImpressionsTrackingMetadata impressionsTracking;
    private boolean inAppBrowser;

    @TypeInfo(type = HashSet.class)
    private Set<String> installersList;
    private boolean isToken1Mandatory;
    private String lastVersion;

    @TypeInfo(complex = true)
    private LocationMetadata location;
    private String metadataUpdateVersion;

    @TypeInfo(complex = true)
    private MotionMetadata motion;

    @TypeInfo(complex = true)
    private MraidMetadata mraid;
    private int notVisibleBannerReloadInterval;
    private boolean omSdkEnabled;
    private long omSdkTimeout;
    private int[] periodicEventIntMin;
    private int[] periodicForegroundEventSec;
    private boolean periodicInfoEventEnabled;
    private boolean periodicMetaDataEnabled;
    private int periodicMetaDataIntervalInMinutes;

    @TypeInfo(type = HashSet.class)
    private Set<String> preInstalledPackages;
    private String profileId;

    @TypeInfo(complex = true)
    private RcdMetadata rcd;

    @TypeInfo(complex = true)
    private RscMetadata rsc;

    @TypeInfo(complex = true)
    private SensorsConfig sensorsConfig;

    @TypeInfo(complex = true)
    private SensorsData sensorsData;
    private int sessionMaxBackgroundTime;
    private boolean simpleToken2;

    @TypeInfo(complex = true)
    private StaleDcConfig staleDc;
    private int stopAutoLoadAmount;
    private int stopAutoLoadPreCacheAmount;

    @TypeInfo(complex = true)
    private TelephonyMetadata telephony;

    @TypeInfo(complex = true)
    private TopicsClientMetadata topics;
    private String trackDownloadHost;

    @TypeInfo(complex = true)
    private TriggeredLinksMetadata triggeredLinks;
    private boolean trueNetEnabled;
    private String vastRecorderHost;

    @TypeInfo(complex = true, name = "wvf")
    private WvfMetadata webViewFactory;
    private boolean webViewSecured;

    @TypeInfo(complex = true)
    private SimpleTokenConfig SimpleToken = new SimpleTokenConfig();

    @TypeInfo(type = ArrayList.class)
    private List<String> metaDataHosts = g;

    public MetaData() {
        String str = h;
        this.adPlatformHostSecured = str;
        this.trackDownloadHost = str;
        this.sessionMaxBackgroundTime = 1800;
        this.profileId = null;
        this.installersList = f;
        this.preInstalledPackages = j;
        this.simpleToken2 = true;
        this.alwaysSendToken = true;
        this.isToken1Mandatory = true;
        this.compressionEnabled = false;
        this.periodicMetaDataEnabled = false;
        this.periodicMetaDataIntervalInMinutes = 360;
        this.periodicInfoEventEnabled = false;
        this.periodicEventIntMin = i;
        this.inAppBrowser = true;
        this.SupportIABViewability = true;
        this.IABDisplayImpressionDelayInSeconds = 1L;
        this.IABVideoImpressionDelayInSeconds = 2L;
        this.sensorsConfig = new SensorsConfig();
        this.btConfig = new BluetoothConfig();
        this.assetsBaseUrlSecured = "";
        this.notVisibleBannerReloadInterval = 3600;
        this.analytics = new AnalyticsConfig();
        this.f152a = false;
        this.b = false;
        this.c = new ArrayList();
        this.metadataUpdateVersion = "5.3.2";
        this.dns = false;
        this.stopAutoLoadAmount = 3;
        this.stopAutoLoadPreCacheAmount = 3;
        this.trueNetEnabled = false;
        this.webViewSecured = true;
        this.omSdkEnabled = false;
        this.omSdkTimeout = 5000L;
        this.chromeCustomeTabsInternal = true;
        this.chromeCustomeTabsExternal = true;
        this.disableSendAdvertisingId = false;
        this.staleDc = new StaleDcConfig();
        this.telephony = new TelephonyMetadata();
        this.anrConfig = new ANRRemoteConfig();
        this.impressionsTracking = null;
        this.connectivity = new ConnectivityHelperMetadata();
        this.webViewFactory = null;
        this.appSession = new AppSessionConfig();
        this.topics = null;
        this.mraid = null;
        this.eventTracerMetadata = null;
    }

    public static MetaData A() {
        return k;
    }

    public static Object D() {
        return d;
    }

    private static void a(MetaData metaData) {
        synchronized (d) {
            metaData.c.addAll(k.c);
            k = metaData;
        }
    }

    public final String B() {
        return this.lastVersion;
    }

    public final LocationMetadata C() {
        return this.location;
    }

    public final List E() {
        List<String> list = this.metaDataHosts;
        if (list == null || list.isEmpty()) {
            list = g;
        }
        return Collections.unmodifiableList(list);
    }

    public final MotionMetadata F() {
        return this.motion;
    }

    public final MraidMetadata G() {
        return this.mraid;
    }

    public final int H() {
        return this.notVisibleBannerReloadInterval;
    }

    public final long I() {
        return Math.max(0L, this.omSdkTimeout);
    }

    public final int J() {
        return this.periodicMetaDataIntervalInMinutes;
    }

    public final Set K() {
        Set set = this.preInstalledPackages;
        if (set == null) {
            set = j;
        }
        return Collections.unmodifiableSet(set);
    }

    public final String L() {
        return this.profileId;
    }

    public final RcdMetadata M() {
        return this.rcd;
    }

    public final RscMetadata N() {
        return this.rsc;
    }

    public final SensorsConfig O() {
        return this.sensorsConfig;
    }

    public final SensorsData P() {
        return this.sensorsData;
    }

    public final long Q() {
        return TimeUnit.SECONDS.toMillis(this.sessionMaxBackgroundTime);
    }

    public final SimpleTokenConfig R() {
        return this.SimpleToken;
    }

    public final StaleDcConfig S() {
        return this.staleDc;
    }

    public final int T() {
        return this.stopAutoLoadAmount;
    }

    public final int U() {
        return this.stopAutoLoadPreCacheAmount;
    }

    public final TelephonyMetadata V() {
        return this.telephony;
    }

    public final String W() {
        String str = this.trackDownloadHost;
        if (str != null) {
            return str;
        }
        String str2 = this.adPlatformHostSecured;
        return str2 != null ? str2 : h;
    }

    public final String X() {
        return this.vastRecorderHost;
    }

    public final WvfMetadata Y() {
        return this.webViewFactory;
    }

    public final boolean Z() {
        return this.adsPreCachingEnabled;
    }

    public final boolean a0() {
        return this.alwaysSendToken;
    }

    public final int b(Context context) {
        return a(context, this.periodicEventIntMin);
    }

    public final boolean b0() {
        return this.compressionEnabled;
    }

    public final AdDebuggerMetadata c() {
        return this.adDebugger;
    }

    public final boolean c0() {
        WeakHashMap weakHashMap = zh.f528a;
        return this.inAppBrowser;
    }

    public final EnabledConfig d() {
        return this.adLoadWaitForMetadata;
    }

    public final boolean d0() {
        return this.omSdkEnabled;
    }

    public final String e() {
        String str = this.adPlatformHostSecured;
        return str != null ? str : h;
    }

    public final boolean e0() {
        return this.periodicForegroundEventSec != null;
    }

    public final boolean equals(Object obj) {
        if (obj != null && getClass() == obj.getClass()) {
            MetaData metaData = (MetaData) obj;
            if (this.sessionMaxBackgroundTime == metaData.sessionMaxBackgroundTime && this.simpleToken2 == metaData.simpleToken2 && this.alwaysSendToken == metaData.alwaysSendToken && this.isToken1Mandatory == metaData.isToken1Mandatory && this.compressionEnabled == metaData.compressionEnabled && Double.compare(this.httpPost, metaData.httpPost) == 0 && this.periodicMetaDataEnabled == metaData.periodicMetaDataEnabled && this.periodicMetaDataIntervalInMinutes == metaData.periodicMetaDataIntervalInMinutes && this.periodicInfoEventEnabled == metaData.periodicInfoEventEnabled && this.inAppBrowser == metaData.inAppBrowser && this.SupportIABViewability == metaData.SupportIABViewability && this.IABDisplayImpressionDelayInSeconds == metaData.IABDisplayImpressionDelayInSeconds && this.IABVideoImpressionDelayInSeconds == metaData.IABVideoImpressionDelayInSeconds && this.notVisibleBannerReloadInterval == metaData.notVisibleBannerReloadInterval && this.dns == metaData.dns && this.adsPreCachingEnabled == metaData.adsPreCachingEnabled && this.stopAutoLoadAmount == metaData.stopAutoLoadAmount && this.stopAutoLoadPreCacheAmount == metaData.stopAutoLoadPreCacheAmount && this.trueNetEnabled == metaData.trueNetEnabled && this.webViewSecured == metaData.webViewSecured && this.omSdkEnabled == metaData.omSdkEnabled && this.omSdkTimeout == metaData.omSdkTimeout && this.chromeCustomeTabsInternal == metaData.chromeCustomeTabsInternal && this.chromeCustomeTabsExternal == metaData.chromeCustomeTabsExternal && this.closeAdAfterClick == metaData.closeAdAfterClick && this.disableSendAdvertisingId == metaData.disableSendAdvertisingId && Double.compare(this.flh, metaData.flh) == 0 && zh.a((Object) this.SimpleToken, (Object) metaData.SimpleToken) && zh.a((Object) this.consentDetails, (Object) metaData.consentDetails) && zh.a((Object) this.calcProd, (Object) metaData.calcProd) && zh.a(this.metaDataHosts, metaData.metaDataHosts) && zh.a((Object) this.adPlatformHostSecured, (Object) metaData.adPlatformHostSecured) && zh.a((Object) this.trackDownloadHost, (Object) metaData.trackDownloadHost) && zh.a((Object) this.vastRecorderHost, (Object) metaData.vastRecorderHost) && zh.a((Object) this.adPlatformBannerHostSecured, (Object) metaData.adPlatformBannerHostSecured) && zh.a((Object) this.adPlatformOverlayHostSecured, (Object) metaData.adPlatformOverlayHostSecured) && zh.a((Object) this.adPlatformNativeHostSecured, (Object) metaData.adPlatformNativeHostSecured) && zh.a((Object) this.profileId, (Object) metaData.profileId) && zh.a(this.installersList, metaData.installersList) && zh.a(this.preInstalledPackages, metaData.preInstalledPackages) && Arrays.equals(this.periodicEventIntMin, metaData.periodicEventIntMin) && Arrays.equals(this.periodicForegroundEventSec, metaData.periodicForegroundEventSec) && zh.a((Object) this.sensorsConfig, (Object) metaData.sensorsConfig) && zh.a((Object) this.btConfig, (Object) metaData.btConfig) && zh.a((Object) this.impressionURL, (Object) metaData.impressionURL) && zh.a((Object) this.adClickURL, (Object) metaData.adClickURL) && zh.a((Object) this.assetsBaseUrlSecured, (Object) metaData.assetsBaseUrlSecured) && zh.a((Object) this.httpClientConfig, (Object) metaData.httpClientConfig) && zh.a((Object) this.analytics, (Object) metaData.analytics) && zh.a((Object) this.metadataUpdateVersion, (Object) metaData.metadataUpdateVersion) && zh.a((Object) this.adLoadWaitForMetadata, (Object) metaData.adLoadWaitForMetadata) && zh.a((Object) this.triggeredLinks, (Object) metaData.triggeredLinks) && zh.a((Object) this.rsc, (Object) metaData.rsc) && zh.a((Object) this.rcd, (Object) metaData.rcd) && zh.a((Object) this.staleDc, (Object) metaData.staleDc) && zh.a((Object) this.motion, (Object) metaData.motion) && zh.a((Object) this.sensorsData, (Object) metaData.sensorsData) && zh.a((Object) this.air, (Object) metaData.air) && zh.a((Object) this.telephony, (Object) metaData.telephony) && zh.a((Object) this.anrConfig, (Object) metaData.anrConfig) && zh.a((Object) this.location, (Object) metaData.location) && zh.a((Object) this.impressionsTracking, (Object) metaData.impressionsTracking) && zh.a((Object) this.connectivity, (Object) metaData.connectivity) && zh.a((Object) this.adDebugger, (Object) metaData.adDebugger) && zh.a((Object) this.webViewFactory, (Object) metaData.webViewFactory) && zh.a((Object) this.appSession, (Object) metaData.appSession) && zh.a((Object) this.topics, (Object) metaData.topics) && zh.a((Object) this.mraid, (Object) metaData.mraid) && zh.a((Object) this.eventTracerMetadata, (Object) metaData.eventTracerMetadata) && zh.a((Object) this.lastVersion, (Object) metaData.lastVersion)) {
                return true;
            }
        }
        return false;
    }

    public final AdvertisingIdResolverMetadata f() {
        return this.air;
    }

    public final boolean f0() {
        return this.periodicInfoEventEnabled;
    }

    public final AnalyticsConfig g() {
        return this.analytics;
    }

    public final boolean g0() {
        return this.periodicMetaDataEnabled;
    }

    public final ANRRemoteConfig h() {
        return this.anrConfig;
    }

    public final boolean h0() {
        return this.b;
    }

    public final int hashCode() {
        Object[] objArr = {this.SimpleToken, this.consentDetails, this.calcProd, this.metaDataHosts, this.adPlatformHostSecured, this.trackDownloadHost, this.vastRecorderHost, this.adPlatformBannerHostSecured, this.adPlatformOverlayHostSecured, this.adPlatformNativeHostSecured, Integer.valueOf(this.sessionMaxBackgroundTime), this.profileId, this.installersList, this.preInstalledPackages, Boolean.valueOf(this.simpleToken2), Boolean.valueOf(this.alwaysSendToken), Boolean.valueOf(this.isToken1Mandatory), Boolean.valueOf(this.compressionEnabled), Double.valueOf(this.httpPost), Boolean.valueOf(this.periodicMetaDataEnabled), Integer.valueOf(this.periodicMetaDataIntervalInMinutes), Boolean.valueOf(this.periodicInfoEventEnabled), this.periodicEventIntMin, this.periodicForegroundEventSec, Boolean.valueOf(this.inAppBrowser), Boolean.valueOf(this.SupportIABViewability), Long.valueOf(this.IABDisplayImpressionDelayInSeconds), Long.valueOf(this.IABVideoImpressionDelayInSeconds), this.sensorsConfig, this.btConfig, this.impressionURL, this.adClickURL, this.assetsBaseUrlSecured, this.httpClientConfig, Integer.valueOf(this.notVisibleBannerReloadInterval), this.analytics, this.metadataUpdateVersion, Boolean.valueOf(this.dns), Boolean.valueOf(this.adsPreCachingEnabled), Integer.valueOf(this.stopAutoLoadAmount), Integer.valueOf(this.stopAutoLoadPreCacheAmount), Boolean.valueOf(this.trueNetEnabled), Boolean.valueOf(this.webViewSecured), Boolean.valueOf(this.omSdkEnabled), Long.valueOf(this.omSdkTimeout), Boolean.valueOf(this.chromeCustomeTabsInternal), Boolean.valueOf(this.chromeCustomeTabsExternal), Boolean.valueOf(this.closeAdAfterClick), Boolean.valueOf(this.disableSendAdvertisingId), this.adLoadWaitForMetadata, Double.valueOf(this.flh), this.triggeredLinks, this.rsc, this.rcd, this.staleDc, this.motion, this.sensorsData, this.air, this.telephony, this.anrConfig, this.location, this.impressionsTracking, this.connectivity, this.adDebugger, this.webViewFactory, this.appSession, this.topics, this.mraid, this.eventTracerMetadata, this.lastVersion};
        WeakHashMap weakHashMap = zh.f528a;
        return Arrays.deepHashCode(objArr);
    }

    public final AppSessionConfig i() {
        return this.appSession;
    }

    public final boolean i0() {
        return this.SupportIABViewability;
    }

    public final String j() {
        String str = this.assetsBaseUrlSecured;
        return str != null ? str : "";
    }

    public final boolean j0() {
        return this.isToken1Mandatory;
    }

    public final BluetoothConfig k() {
        return this.btConfig;
    }

    public final void k0() {
        this.b = true;
    }

    public final String l() {
        return this.calcProd;
    }

    public final boolean m() {
        return this.chromeCustomeTabsExternal;
    }

    public final boolean n() {
        return this.chromeCustomeTabsInternal;
    }

    public final boolean o() {
        return this.closeAdAfterClick;
    }

    public final ConnectivityHelperMetadata p() {
        return this.connectivity;
    }

    public final ConsentConfig q() {
        return this.consentDetails;
    }

    public final boolean r() {
        return this.disableSendAdvertisingId;
    }

    public final EventTracerMetadata s() {
        return this.eventTracerMetadata;
    }

    public final String t() {
        int indexOf;
        String str = k.adPlatformHostSecured;
        if (str == null) {
            str = h;
        }
        String str2 = (Build.VERSION.SDK_INT > 26 || this.webViewSecured) ? "https" : "http";
        return (str.startsWith(str2.concat("://")) || (indexOf = str.indexOf(58)) == -1) ? str : str2.concat(str.substring(indexOf));
    }

    public final HttpClientConfig u() {
        return this.httpClientConfig;
    }

    public final double v() {
        return this.httpPost;
    }

    public final long w() {
        return this.IABDisplayImpressionDelayInSeconds;
    }

    public final long x() {
        return this.IABVideoImpressionDelayInSeconds;
    }

    public final ImpressionsTrackingMetadata y() {
        return this.impressionsTracking;
    }

    public final Set z() {
        return this.installersList;
    }

    public static boolean c(Context context) {
        if (e.getAndSet(true)) {
            return false;
        }
        MetaData metaData = (MetaData) z6.b(context, "StartappMetadata");
        MetaData metaData2 = new MetaData();
        if (metaData != null) {
            boolean a2 = zh.a((Serializable) metaData, (Serializable) metaData2);
            if ("5.3.2".equals(metaData.metadataUpdateVersion) && a2) {
                n8 n8Var = new n8(o8.e);
                n8Var.d = "metadata_null";
                n8Var.a();
            }
            metaData.f152a = false;
            metaData.b = false;
            metaData.c = new ArrayList();
            a(metaData);
        } else {
            a(metaData2);
        }
        k.a();
        return true;
    }

    public final boolean b() {
        return !this.dns;
    }

    public static void a(Context context, MetaData metaData, MetaDataRequest$RequestReason metaDataRequest$RequestReason, boolean z) {
        ArrayList arrayList;
        int i2;
        WeakHashMap weakHashMap = zh.f528a;
        synchronized (d) {
            arrayList = new ArrayList(k.c);
            k.c.clear();
            metaData.c = k.c;
            metaData.a();
            metaData.metadataUpdateVersion = "5.3.2";
            z6.c(context, "StartappMetadata", metaData);
            i2 = 0;
            metaData.f152a = false;
            metaData.b = true;
            if (!zh.a((Object) k, (Object) metaData)) {
                z = true;
            }
            k = metaData;
            if (zh.c(context)) {
                try {
                    af afVar = (af) a.a(context).G.a();
                    afVar.edit().putInt("totalSessions", afVar.getInt("totalSessions", 0) + 1).apply();
                } catch (Throwable th) {
                    n8.a(th);
                }
            }
        }
        boolean z2 = ((Random) zh.d.a()).nextDouble() < k.flh;
        Handler handler = z2 ? new Handler(Looper.getMainLooper()) : null;
        int size = arrayList.size();
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            qb qbVar = (qb) obj;
            if (z2) {
                handler.post(new nb(qbVar, metaDataRequest$RequestReason, z));
            } else {
                qbVar.a(metaDataRequest$RequestReason, z);
            }
        }
    }

    public static void a(MetaDataRequest$RequestReason metaDataRequest$RequestReason) {
        ArrayList arrayList;
        int i2;
        synchronized (d) {
            arrayList = new ArrayList(k.c);
            k.c.clear();
            i2 = 0;
            k.f152a = false;
        }
        int size = arrayList.size();
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((qb) obj).a();
        }
    }

    public final void a(Context context, AdPreferences adPreferences, MetaDataRequest$RequestReason metaDataRequest$RequestReason, boolean z, b bVar, boolean z2) {
        if (context == null) {
            if (bVar != null) {
                bVar.a(metaDataRequest$RequestReason, false);
                return;
            }
            return;
        }
        if (!z && bVar != null) {
            bVar.a(metaDataRequest$RequestReason, false);
        }
        synchronized (d) {
            if (k.b && !z2) {
                if (!z || bVar == null) {
                    return;
                }
                bVar.a(metaDataRequest$RequestReason, false);
                return;
            }
            if (!k.f152a || z2) {
                this.f152a = true;
                this.b = false;
                pa paVar = a.a(context).K;
                final AtomicInteger atomicInteger = l;
                Objects.requireNonNull(atomicInteger);
                l7 l7Var = new l7(context, paVar, adPreferences, metaDataRequest$RequestReason, new c7() { // from class: com.startapp.sdk.adsbase.remoteconfig.MetaData$$ExternalSyntheticLambda0
                    @Override // com.startapp.sdk.internal.c7
                    public final Object call() {
                        int i2;
                        i2 = atomicInteger.get();
                        return Integer.valueOf(i2);
                    }
                }, atomicInteger.incrementAndGet());
                if (bVar != null) {
                    ((w6) paVar.a()).a(bVar, l7Var);
                }
                l7Var.b();
            }
            if (z && bVar != null) {
                k.a(bVar);
            }
        }
    }

    public final void a(qb qbVar) {
        synchronized (d) {
            this.c.add(qbVar);
        }
    }

    public final int a(Context context) {
        return a(context, this.periodicForegroundEventSec);
    }

    private static int a(Context context, int[] iArr) {
        if (iArr == null || iArr.length < 3) {
            iArr = i;
        }
        if (m0.a(context, LocationConstants.ANDROID_FINE_LOCATION_PERMISSION_STRING)) {
            int i2 = iArr[0];
            return i2 <= 0 ? i[0] : i2;
        }
        if (m0.a(context, LocationConstants.ANDROID_COARSE_LOCATION_PERMISSION_STRING)) {
            int i3 = iArr[1];
            return i3 <= 0 ? i[1] : i3;
        }
        return iArr[2];
    }

    public final String a(AdPreferences.Placement placement) {
        int i2 = ob.f363a[placement.ordinal()];
        if (i2 == 1) {
            String str = this.adPlatformBannerHostSecured;
            if (str != null) {
                return str;
            }
            String str2 = this.adPlatformHostSecured;
            return str2 != null ? str2 : h;
        }
        if (i2 == 2) {
            String str3 = this.adPlatformOverlayHostSecured;
            if (str3 != null) {
                return str3;
            }
            String str4 = this.adPlatformHostSecured;
            return str4 != null ? str4 : h;
        }
        if (i2 != 3) {
            String str5 = this.adPlatformHostSecured;
            return str5 != null ? str5 : h;
        }
        String str6 = this.adPlatformNativeHostSecured;
        if (str6 != null) {
            return str6;
        }
        String str7 = this.adPlatformHostSecured;
        return str7 != null ? str7 : h;
    }

    public final void a() {
        ArrayList arrayList;
        String str = this.adPlatformHostSecured;
        String str2 = h;
        if (str != null) {
            str2 = str.replace("%AdPlatformProtocol%", "1.5");
        }
        this.adPlatformHostSecured = str2;
        List<String> list = this.metaDataHosts;
        if (list != null) {
            arrayList = new ArrayList(list.size());
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                String next = it.next();
                String replace = next != null ? next.replace("%AdPlatformProtocol%", "1.5") : null;
                if (replace != null) {
                    arrayList.add(replace);
                }
            }
        } else {
            arrayList = null;
        }
        this.metaDataHosts = arrayList;
        String str3 = this.adPlatformBannerHostSecured;
        this.adPlatformBannerHostSecured = str3 != null ? str3.replace("%AdPlatformProtocol%", "1.5") : null;
        String str4 = this.adPlatformOverlayHostSecured;
        this.adPlatformOverlayHostSecured = str4 != null ? str4.replace("%AdPlatformProtocol%", "1.5") : null;
        String str5 = this.adPlatformNativeHostSecured;
        this.adPlatformNativeHostSecured = str5 != null ? str5.replace("%AdPlatformProtocol%", "1.5") : null;
    }

    public static void a(Context context, String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        if (!z1.a(context, "close_button")) {
            WeakHashMap weakHashMap = zh.f528a;
            new d2(context, str.concat("close_button.png"), new pb(context, "close_button"), 0).a();
        }
        WeakHashMap weakHashMap2 = zh.f528a;
        for (String str2 : f0.l) {
            if (!z1.a(context, str2)) {
                new d2(context, str + str2 + ".png", new pb(context, str2), 0).a();
            }
        }
        WeakHashMap weakHashMap3 = zh.f528a;
        for (String str3 : f0.m) {
            if (!z1.a(context, str3)) {
                new d2(context, str + str3 + ".png", new pb(context, str3), 0).a();
            }
        }
        if (z1.a(context, "logo")) {
            return;
        }
        new d2(context, str.concat("logo.png"), new pb(context, "logo"), 0).a();
    }
}
