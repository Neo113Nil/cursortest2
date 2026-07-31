package com.yandex.mobile.ads.impl;

import b2.AbstractC1372b;
import com.yandex.mobile.ads.impl.du1;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* loaded from: classes3.dex */
final class zq implements yq {

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private static final a f35655f = new a(0);

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private static final Object f35656g = new Object();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final xr0 f35657b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final w50 f35658c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C2111na f35659d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C1821b6 f35660e;

    private static final class a {
        private a() {
        }

        public static final Boolean a(a aVar, xr0 xr0Var, String str) {
            if (!xr0Var.c(str)) {
                xr0Var = null;
            }
            if (xr0Var != null) {
                return Boolean.valueOf(xr0Var.a(str, false));
            }
            return null;
        }

        public static final Integer b(a aVar, xr0 xr0Var, String str) {
            if (!xr0Var.c(str)) {
                xr0Var = null;
            }
            if (xr0Var != null) {
                return Integer.valueOf(xr0Var.b(0, str));
            }
            return null;
        }

        public /* synthetic */ a(int i4) {
            this();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static final class b {

        /* renamed from: A, reason: collision with root package name */
        public static final b f35661A;

        /* renamed from: A0, reason: collision with root package name */
        public static final b f35662A0;

        /* renamed from: B, reason: collision with root package name */
        public static final b f35663B;

        /* renamed from: B0, reason: collision with root package name */
        public static final b f35664B0;

        /* renamed from: C, reason: collision with root package name */
        public static final b f35665C;

        /* renamed from: C0, reason: collision with root package name */
        public static final b f35666C0;

        /* renamed from: D, reason: collision with root package name */
        public static final b f35667D;

        /* renamed from: D0, reason: collision with root package name */
        public static final b f35668D0;

        /* renamed from: E, reason: collision with root package name */
        public static final b f35669E;

        /* renamed from: E0, reason: collision with root package name */
        public static final b f35670E0;

        /* renamed from: F, reason: collision with root package name */
        public static final b f35671F;

        /* renamed from: F0, reason: collision with root package name */
        public static final b f35672F0;

        /* renamed from: G, reason: collision with root package name */
        public static final b f35673G;

        /* renamed from: G0, reason: collision with root package name */
        private static final /* synthetic */ b[] f35674G0;

        /* renamed from: H, reason: collision with root package name */
        public static final b f35675H;

        /* renamed from: I, reason: collision with root package name */
        public static final b f35676I;

        /* renamed from: J, reason: collision with root package name */
        public static final b f35677J;

        /* renamed from: K, reason: collision with root package name */
        public static final b f35678K;

        /* renamed from: L, reason: collision with root package name */
        public static final b f35679L;

        /* renamed from: M, reason: collision with root package name */
        public static final b f35680M;

        /* renamed from: N, reason: collision with root package name */
        public static final b f35681N;

        /* renamed from: O, reason: collision with root package name */
        public static final b f35682O;

        /* renamed from: P, reason: collision with root package name */
        public static final b f35683P;

        /* renamed from: Q, reason: collision with root package name */
        public static final b f35684Q;

        /* renamed from: R, reason: collision with root package name */
        public static final b f35685R;

        /* renamed from: S, reason: collision with root package name */
        public static final b f35686S;

        /* renamed from: T, reason: collision with root package name */
        public static final b f35687T;

        /* renamed from: U, reason: collision with root package name */
        public static final b f35688U;

        /* renamed from: V, reason: collision with root package name */
        public static final b f35689V;

        /* renamed from: W, reason: collision with root package name */
        public static final b f35690W;

        /* renamed from: X, reason: collision with root package name */
        public static final b f35691X;

        /* renamed from: Y, reason: collision with root package name */
        public static final b f35692Y;

        /* renamed from: Z, reason: collision with root package name */
        public static final b f35693Z;

        /* renamed from: a0, reason: collision with root package name */
        public static final b f35694a0;

        /* renamed from: b0, reason: collision with root package name */
        public static final b f35695b0;

        /* renamed from: c, reason: collision with root package name */
        public static final b f35696c;

        /* renamed from: c0, reason: collision with root package name */
        public static final b f35697c0;

        /* renamed from: d, reason: collision with root package name */
        public static final b f35698d;

        /* renamed from: d0, reason: collision with root package name */
        public static final b f35699d0;

        /* renamed from: e, reason: collision with root package name */
        public static final b f35700e;

        /* renamed from: e0, reason: collision with root package name */
        public static final b f35701e0;

        /* renamed from: f, reason: collision with root package name */
        public static final b f35702f;

        /* renamed from: f0, reason: collision with root package name */
        public static final b f35703f0;

        /* renamed from: g, reason: collision with root package name */
        public static final b f35704g;

        /* renamed from: g0, reason: collision with root package name */
        public static final b f35705g0;

        /* renamed from: h, reason: collision with root package name */
        public static final b f35706h;

        /* renamed from: h0, reason: collision with root package name */
        public static final b f35707h0;

        /* renamed from: i, reason: collision with root package name */
        public static final b f35708i;

        /* renamed from: i0, reason: collision with root package name */
        public static final b f35709i0;

        /* renamed from: j, reason: collision with root package name */
        public static final b f35710j;

        /* renamed from: j0, reason: collision with root package name */
        public static final b f35711j0;

        /* renamed from: k, reason: collision with root package name */
        public static final b f35712k;

        /* renamed from: k0, reason: collision with root package name */
        public static final b f35713k0;

        /* renamed from: l, reason: collision with root package name */
        public static final b f35714l;

        /* renamed from: l0, reason: collision with root package name */
        public static final b f35715l0;

        /* renamed from: m, reason: collision with root package name */
        public static final b f35716m;

        /* renamed from: m0, reason: collision with root package name */
        public static final b f35717m0;

        /* renamed from: n, reason: collision with root package name */
        public static final b f35718n;

        /* renamed from: n0, reason: collision with root package name */
        public static final b f35719n0;

        /* renamed from: o, reason: collision with root package name */
        public static final b f35720o;

        /* renamed from: o0, reason: collision with root package name */
        public static final b f35721o0;

        /* renamed from: p, reason: collision with root package name */
        public static final b f35722p;

        /* renamed from: p0, reason: collision with root package name */
        public static final b f35723p0;

        /* renamed from: q, reason: collision with root package name */
        public static final b f35724q;

        /* renamed from: q0, reason: collision with root package name */
        public static final b f35725q0;

        /* renamed from: r, reason: collision with root package name */
        public static final b f35726r;

        /* renamed from: r0, reason: collision with root package name */
        public static final b f35727r0;

        /* renamed from: s, reason: collision with root package name */
        public static final b f35728s;

        /* renamed from: s0, reason: collision with root package name */
        public static final b f35729s0;

        /* renamed from: t, reason: collision with root package name */
        public static final b f35730t;

        /* renamed from: t0, reason: collision with root package name */
        public static final b f35731t0;

        /* renamed from: u, reason: collision with root package name */
        public static final b f35732u;

        /* renamed from: u0, reason: collision with root package name */
        public static final b f35733u0;

        /* renamed from: v, reason: collision with root package name */
        public static final b f35734v;

        /* renamed from: v0, reason: collision with root package name */
        public static final b f35735v0;

        /* renamed from: w, reason: collision with root package name */
        public static final b f35736w;

        /* renamed from: w0, reason: collision with root package name */
        public static final b f35737w0;

        /* renamed from: x, reason: collision with root package name */
        public static final b f35738x;

        /* renamed from: x0, reason: collision with root package name */
        public static final b f35739x0;

        /* renamed from: y, reason: collision with root package name */
        public static final b f35740y;

        /* renamed from: y0, reason: collision with root package name */
        public static final b f35741y0;

        /* renamed from: z, reason: collision with root package name */
        public static final b f35742z;

        /* renamed from: z0, reason: collision with root package name */
        public static final b f35743z0;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f35744b;

        static {
            b bVar = new b(0, "AD_PREFERENCE_EXPIRED_DATE", "SdkConfigurationExpiredDate");
            f35696c = bVar;
            b bVar2 = new b(1, "AD_PREFERENCE_MRAID_URL", "SdkConfigurationMraidUrl");
            f35698d = bVar2;
            b bVar3 = new b(2, "AD_PREFERENCE_OM_SDK_JS_CONTROLLER_URL", "SdkConfigurationOmSdkControllerUrl");
            f35700e = bVar3;
            b bVar4 = new b(3, "AD_PREFERENCE_CUSTOM_CLICK_HANDLING_ENABLED", "CustomClickHandlingEnabled");
            f35702f = bVar4;
            b bVar5 = new b(4, "AD_PREFERENCE_AD_IDS_STORAGE_SIZE", "AdIdsStorageSize");
            f35704g = bVar5;
            b bVar6 = new b(5, "VISIBILITY_ERROR_INDICATOR_ENABLED", "SdkConfigurationVisibilityErrorIndicatorEnabled");
            f35706h = bVar6;
            b bVar7 = new b(6, "LIBRARY_VERSION", "SdkConfigurationLibraryVersion");
            f35708i = bVar7;
            b bVar8 = new b(7, "MEDIATION_SENSITIVE_MODE_DISABLED", "SdkConfigurationMediationSensitiveModeDisabled");
            f35710j = bVar8;
            b bVar9 = new b(8, "SENSITIVE_MODE_DISABLED", "SdkConfigurationSensitiveModeDisabled");
            f35712k = bVar9;
            b bVar10 = new b(9, "FUSED_LOCATION_PROVIDER_DISABLED", "SdkConfigurationFusedLocationProviderDisabled");
            f35714l = bVar10;
            b bVar11 = new b(10, "LOCK_SCREEN_ENABLED", "SdkConfigurationLockScreenEnabled");
            f35716m = bVar11;
            b bVar12 = new b(11, "USER_CONSENT", "SdkConfigurationUserConsent");
            f35718n = bVar12;
            b bVar13 = new b(12, "LEGACY_VISIBILITY_LOGIC_ENABLED", "SdkConfigurationLegacyVisibilityLogicEnabled");
            f35720o = bVar13;
            b bVar14 = new b(13, "LEGACY_VAST_TRACKING_ENABLED", "SdkConfigurationLegacyVastTrackingEnabled");
            f35722p = bVar14;
            b bVar15 = new b(14, "OVERLAPPING_VISIBILITY_TRACKING_ENABLED", "SdkConfigurationOverlappingVisibilityTrackingEnabled");
            f35724q = bVar15;
            b bVar16 = new b(15, "OVERLAPPING_WINDOW_TRACKING_ENABLED", "SdkConfigurationOverlappingWindowTrackingEnabled");
            f35726r = bVar16;
            b bVar17 = new b(16, "AD_REQUEST_MAX_RETRIES", "SdkConfigurationAdRequestMaxRetries");
            f35728s = bVar17;
            b bVar18 = new b(17, "PING_REQUEST_MAX_RETRIES", "SdkConfigurationPingRequestMaxRetries");
            f35730t = bVar18;
            b bVar19 = new b(18, "IMPRESSION_VALIDATION_ON_CLICK_ENABLED", "SdkConfigurationImpressionValidationOnClickEnabled");
            f35732u = bVar19;
            b bVar20 = new b(19, "REQUIRED_ASSET_VALIDATION_ON_CLICK_DISABLED", "SdkConfigurationRequiredAssetValidationOnClickDisabled");
            f35734v = bVar20;
            b bVar21 = new b(20, "IMPRESSION_ANY_VALIDATION_ON_CLICK_DISABLED", "SdkConfigurationAnyImpressionValidationOnClickDisabled");
            f35736w = bVar21;
            b bVar22 = new b(21, "LEGACY_SLIDER_IMPRESSION_ENABLED", "SdkConfigurationLegacySliderImpressionEnabled");
            f35738x = bVar22;
            b bVar23 = new b(22, "SHOW_VERSION_VALIDATION_ERROR_LOG", "SdkConfigurationShowVersionValidationErrorLog");
            f35740y = bVar23;
            b bVar24 = new b(23, "SHOW_VERSION_VALIDATION_ERROR_INDICATOR", "SdkConfigurationShowVersionValidationErrorIndicator");
            f35742z = bVar24;
            b bVar25 = new b(24, "INSTREAM_DESIGN", "SdkConfigurationInstreamDesign");
            f35661A = bVar25;
            b bVar26 = new b(25, "FULL_SCREEN_BACK_BUTTON_ENABLED", "SdkConfigurationFullScreenBackButtonEnabled");
            f35663B = bVar26;
            b bVar27 = new b(26, "OPEN_MEASUREMENT_SDK_DISABLED", "SdkConfigurationOpenMeasurementSdkDisabled");
            f35665C = bVar27;
            b bVar28 = new b(27, "NATIVE_WEB_VIEW_POOL_SIZE", "SdkConfigurationNativeWebViewPoolSize");
            f35667D = bVar28;
            b bVar29 = new b(28, "MAX_DISK_CACHE_SIZE_BYTES_FOR_VIDEO", "SdkConfigurationMaxDiskCacheSizeBytesForVideo");
            f35669E = bVar29;
            b bVar30 = new b(29, "MAX_DISK_CACHE_SIZE_BYTES_FOR_REQUEST_QUEUE", "SdkConfigurationMaxDiskCacheSizeBytesForRequestQueue");
            f35671F = bVar30;
            b bVar31 = new b(30, "PUBLIC_ENCRYPTION_KEY", "SdkConfigurationPublicEncryptionKey");
            f35673G = bVar31;
            b bVar32 = new b(31, "PUBLIC_ENCRYPTION_VERSION", "SdkConfigurationPublicEncryptionVersion");
            f35675H = bVar32;
            b bVar33 = new b(32, "ECPM_IMPRESSION_CALLBACK_DISABLED", "SdkConfigurationEcpmImpressionCallbackDisabled");
            f35676I = bVar33;
            b bVar34 = new b(33, "CLOSE_FULLSCREEN_WITH_ADTUNE_DISABLED", "SdkConfigurationCloseFullscreenWithAdtuneDisabled");
            f35677J = bVar34;
            b bVar35 = new b(34, "DIVKIT_DISABLED", "SdkConfigurationDivkitisabled");
            f35678K = bVar35;
            b bVar36 = new b(35, "USE_OKHTTP_NETWORK_STACK", "SdkConfigurationUseOkHttpNetworkStack");
            f35679L = bVar36;
            b bVar37 = new b(36, "LOCATION_CONSENT", "SdkConfigurationLocationConsent");
            f35680M = bVar37;
            b bVar38 = new b(37, "CLIENT_BIDDING_STARTUP_INITIALIZATION_ENABLED", "SdkConfigurationClientBiddingStartupInitializationEnabled");
            f35681N = bVar38;
            b bVar39 = new b(38, "LIBSSL_ENABLED", "SdkConfigurationLibSSLEnabled");
            f35682O = bVar39;
            b bVar40 = new b(39, "ENCRYPTED_REQUESTS_ENABLED", "SdkConfigurationEncryptedRequestsEnabled");
            f35683P = bVar40;
            b bVar41 = new b(40, "RENDER_ASSET_VALIDATION_ENABLED", "SdkConfigurationRenderAssetValidationEnabled");
            f35684Q = bVar41;
            b bVar42 = new b(41, "CLICK_HANDLER_TYPE", "SdkConfigurationClickHandlerType");
            f35685R = bVar42;
            b bVar43 = new b(42, "HARD_SENSITIVE_MODE_ENABLED", "SdkConfigurationHardSensitiveModeEnabled");
            f35686S = bVar43;
            b bVar44 = new b(43, "AGE_RESTRICTED_USER", "SdkConfigurationAgeRestrictedUser");
            f35687T = bVar44;
            b bVar45 = new b(44, "HOST", "SdkConfigurationHost");
            f35688U = bVar45;
            b bVar46 = new b(45, "DIVKIT_FONT", "DivkitFont");
            f35689V = bVar46;
            b bVar47 = new b(46, "AUTOMATIC_SDK_INITIALIZATION_DELAY_ENABLED", "SdkConfigurationAutomaticSdkInitializationDelayEnabled");
            f35690W = bVar47;
            b bVar48 = new b(47, "NATIVE_BANNER_ENABLED", "NativeBannerEnabled");
            f35691X = bVar48;
            b bVar49 = new b(48, "USE_NEW_BINDING_API_FOR_DIVKIT", "UseNewBindingApiForDivkit");
            b bVar50 = new b(49, "USE_DIVKIT_CLOSE_ACTION_INSTEAD_SYSTEM_CLICK", "UseDivkitCloseActionInsteadSystemClick");
            f35692Y = bVar50;
            b bVar51 = new b(50, "BANNER_SIZE_CALCULATION_TYPE", "BannerSizeCalculationType");
            f35693Z = bVar51;
            b bVar52 = new b(51, "STARTUP_VERSION", "StartupVersion");
            f35694a0 = bVar52;
            b bVar53 = new b(52, "APP_OPEN_AD_PRELOADING_ENABLED", "AppOpenAdPreloadingEnabled");
            f35695b0 = bVar53;
            b bVar54 = new b(53, "INTERSTITIAL_PRELOADING_ENABLED", "InterstitialPreloadingEnabled");
            f35697c0 = bVar54;
            b bVar55 = new b(54, "REWARDED_PRELOADING_ENABLED", "RewardedPreloadingEnabled");
            f35699d0 = bVar55;
            b bVar56 = new b(55, "NEW_FALSE_CLICK_TRACKING_ENABLED", "NewFalseClickTrackingEnabled");
            f35701e0 = bVar56;
            b bVar57 = new b(56, "VARIOQUB_ENABLED", "VarioqubEnabled");
            f35703f0 = bVar57;
            b bVar58 = new b(57, "CRASH_TRACKER_ENABLED", "CrashTrackerEnabled");
            f35705g0 = bVar58;
            b bVar59 = new b(58, "ERROR_TRACKER_ENABLED", "ErrorTrackerEnabled");
            f35707h0 = bVar59;
            b bVar60 = new b(59, "ANR_TRACKER_ENABLED", "AnrTrackerEnabled");
            f35709i0 = bVar60;
            b bVar61 = new b(60, "ANR_TRACKER_INTERVAL", "AnrTrackerInterval");
            f35711j0 = bVar61;
            b bVar62 = new b(61, "ANR_TRACKER_THRESHOLD", "AnrTrackerThreshold");
            f35713k0 = bVar62;
            b bVar63 = new b(62, "CRASH_IGNORE_ENABLED", "CrashIgnoreEnabled");
            f35715l0 = bVar63;
            b bVar64 = new b(63, "CRASH_STACK_TRACE_EXCLUSION_RULES", "CrashStackTraceExclusionRules");
            f35717m0 = bVar64;
            b bVar65 = new b(64, "ADAPTIVE_VALIDATION_RULES", "AdaptiveValidationRules");
            f35719n0 = bVar65;
            b bVar66 = new b(65, "DISABLE_BASE64_FOR_READY_RESPONSE", "DisableBase64ForReadyResponse");
            f35721o0 = bVar66;
            b bVar67 = new b(66, "TIME_STAMPING_TRACKING_URLS_ENABLED", "TimeStampingTrackingUrlsEnabled");
            f35723p0 = bVar67;
            b bVar68 = new b(67, "APP_AD_ANALYTICS_REPORTING_ENABLED", "AppAdAnalyticsReportingEnabled");
            f35725q0 = bVar68;
            b bVar69 = new b(68, "APP_METRICA_EASY_INTEGRATION_AUTO_ACTIVATION_DISABLED", "AppMetricaEasyIntegrationAutoActivationDisabled");
            f35727r0 = bVar69;
            b bVar70 = new b(69, "NETWORK_THREAD_POOL_SIZE", "SdkConfigurationNetworkThreadPoolSize");
            f35729s0 = bVar70;
            b bVar71 = new b(70, "IMAGE_LOADING_THREAD_POOL_SIZE", "SdkConfigurationImageLoadingThreadPoolSize");
            f35731t0 = bVar71;
            b bVar72 = new b(71, "TIMEOUT_INTERVAL_FOR_REQUEST", "SdkConfigurationTimeoutIntervalForRequest");
            f35733u0 = bVar72;
            b bVar73 = new b(72, "TIMEOUT_INTERVAL_FOR_PING_REQUEST", "SdkConfigurationTimeoutIntervalForPingRequest");
            f35735v0 = bVar73;
            b bVar74 = new b(73, "AD_QUALITY_CONFIGURATION_KEY", "QualityAdVerificationConfiguration");
            f35737w0 = bVar74;
            b bVar75 = new b(74, "SDK_TRACKING_REPORTER_ENABLED", "SdkTrackingReporterEnabled");
            f35739x0 = bVar75;
            b bVar76 = new b(75, "FALLBACK_HOSTS", "SdkConfigurationFallbackHosts");
            f35741y0 = bVar76;
            b bVar77 = new b(76, "SHOULD_PREFETCH_DNS", "ShouldPrefetchDns");
            f35743z0 = bVar77;
            b bVar78 = new b(77, "SHOULD_USE_AD_RENDERED_WEB_VIEW_CALLBACK", "ShouldUseAdRenderedWebViewCallback");
            f35662A0 = bVar78;
            b bVar79 = new b(78, "OUTSTREAM_WRAPPER_VIDEO_SUPPORTED", "OutstreamWrapperVideoSupported");
            f35664B0 = bVar79;
            b bVar80 = new b(79, "VALIDATE_CLICK_IN_WEB_VIEW", "ValidateClickInWebView");
            f35666C0 = bVar80;
            b bVar81 = new b(80, "PASS_FULL_SCREEN_HEIGHT_FROM_SDK_ENABLED", "PassFullScreenHeightFromSdkEnabled");
            f35668D0 = bVar81;
            b bVar82 = new b(81, "INSTREAM_QRCODE_SIZE_IN_PX", "SdkConfigurationInstreamQrcodeSizeInPx");
            f35670E0 = bVar82;
            b bVar83 = new b(82, "HIDE_BOTTOM_NAVIGATION_BAR", "HideBottomNavigationBar");
            f35672F0 = bVar83;
            b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14, bVar15, bVar16, bVar17, bVar18, bVar19, bVar20, bVar21, bVar22, bVar23, bVar24, bVar25, bVar26, bVar27, bVar28, bVar29, bVar30, bVar31, bVar32, bVar33, bVar34, bVar35, bVar36, bVar37, bVar38, bVar39, bVar40, bVar41, bVar42, bVar43, bVar44, bVar45, bVar46, bVar47, bVar48, bVar49, bVar50, bVar51, bVar52, bVar53, bVar54, bVar55, bVar56, bVar57, bVar58, bVar59, bVar60, bVar61, bVar62, bVar63, bVar64, bVar65, bVar66, bVar67, bVar68, bVar69, bVar70, bVar71, bVar72, bVar73, bVar74, bVar75, bVar76, bVar77, bVar78, bVar79, bVar80, bVar81, bVar82, bVar83};
            f35674G0 = bVarArr;
            AbstractC1372b.a(bVarArr);
        }

        private b(int i4, String str, String str2) {
            this.f35744b = str2;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f35674G0.clone();
        }

        @NotNull
        public final String a() {
            return this.f35744b;
        }
    }

    public zq(@NotNull xr0 localStorage, @NotNull w50 exclusionRulesJsonConverter, @NotNull C2111na adaptiveValidationRulesConverter, @NotNull C1821b6 adVerificationConfigurationJsonConverter) {
        Intrinsics.checkNotNullParameter(localStorage, "localStorage");
        Intrinsics.checkNotNullParameter(exclusionRulesJsonConverter, "exclusionRulesJsonConverter");
        Intrinsics.checkNotNullParameter(adaptiveValidationRulesConverter, "adaptiveValidationRulesConverter");
        Intrinsics.checkNotNullParameter(adVerificationConfigurationJsonConverter, "adVerificationConfigurationJsonConverter");
        this.f35657b = localStorage;
        this.f35658c = exclusionRulesJsonConverter;
        this.f35659d = adaptiveValidationRulesConverter;
        this.f35660e = adVerificationConfigurationJsonConverter;
    }

    @Override // com.yandex.mobile.ads.impl.yq
    @Nullable
    public final du1 a() {
        du1 du1Var;
        Set<u50> set;
        Map<gs, ? extends Set<String>> map;
        C1989i6 c1989i6;
        List<String> list;
        synchronized (f35656g) {
            try {
                long b4 = this.f35657b.b(b.f35696c.a());
                a aVar = f35655f;
                Boolean a4 = a.a(aVar, this.f35657b, b.f35706h.a());
                if (b4 != 0) {
                    Integer b5 = a.b(aVar, this.f35657b, b.f35728s.a());
                    Integer b6 = a.b(aVar, this.f35657b, b.f35730t.a());
                    int b7 = this.f35657b.b(0, b.f35704g.a());
                    int b8 = this.f35657b.b(0, b.f35667D.a());
                    long b9 = this.f35657b.b(b.f35669E.a());
                    long b10 = this.f35657b.b(b.f35671F.a());
                    Boolean a5 = a.a(aVar, this.f35657b, b.f35710j.a());
                    boolean a6 = this.f35657b.a(b.f35714l.a(), false);
                    boolean a7 = this.f35657b.a(b.f35716m.a(), false);
                    Boolean a8 = a.a(aVar, this.f35657b, b.f35718n.a());
                    String d4 = this.f35657b.d(b.f35708i.a());
                    String d5 = this.f35657b.d(b.f35688U.a());
                    String d6 = this.f35657b.d(b.f35689V.a());
                    String d7 = this.f35657b.d(b.f35685R.a());
                    String d8 = this.f35657b.d(b.f35698d.a());
                    String d9 = this.f35657b.d(b.f35700e.a());
                    boolean a9 = this.f35657b.a(b.f35702f.a(), false);
                    boolean a10 = this.f35657b.a(b.f35712k.a(), false);
                    boolean a11 = this.f35657b.a(b.f35686S.a(), false);
                    boolean a12 = this.f35657b.a(b.f35722p.a(), false);
                    boolean a13 = this.f35657b.a(b.f35720o.a(), false);
                    boolean a14 = this.f35657b.a(b.f35724q.a(), false);
                    boolean a15 = this.f35657b.a(b.f35726r.a(), false);
                    boolean a16 = this.f35657b.a(b.f35740y.a(), false);
                    boolean a17 = this.f35657b.a(b.f35742z.a(), false);
                    boolean a18 = this.f35657b.a(b.f35732u.a(), false);
                    boolean a19 = this.f35657b.a(b.f35734v.a(), false);
                    boolean a20 = this.f35657b.a(b.f35736w.a(), false);
                    boolean a21 = this.f35657b.a(b.f35738x.a(), false);
                    boolean a22 = this.f35657b.a(b.f35663B.a(), false);
                    boolean a23 = this.f35657b.a(b.f35665C.a(), false);
                    boolean a24 = this.f35657b.a(b.f35680M.a(), false);
                    boolean a25 = this.f35657b.a(b.f35681N.a(), false);
                    int i4 = C2190qk.f30827b;
                    C2144ok a26 = C2190qk.a(this.f35657b);
                    String d10 = this.f35657b.d(b.f35673G.a());
                    String d11 = this.f35657b.d(b.f35661A.a());
                    Integer b11 = a.b(aVar, this.f35657b, b.f35675H.a());
                    boolean a27 = this.f35657b.a(b.f35676I.a(), false);
                    boolean a28 = this.f35657b.a(b.f35678K.a(), false);
                    boolean a29 = this.f35657b.a(b.f35679L.a(), false);
                    boolean a30 = this.f35657b.a(b.f35682O.a(), false);
                    boolean a31 = this.f35657b.a(b.f35677J.a(), false);
                    boolean a32 = this.f35657b.a(b.f35683P.a(), false);
                    boolean a33 = this.f35657b.a(b.f35684Q.a(), false);
                    boolean a34 = this.f35657b.a(b.f35690W.a(), false);
                    Boolean a35 = a.a(aVar, this.f35657b, b.f35687T.a());
                    boolean a36 = this.f35657b.a(b.f35691X.a(), false);
                    boolean a37 = this.f35657b.a(b.f35692Y.a(), false);
                    String d12 = this.f35657b.d(b.f35693Z.a());
                    String d13 = this.f35657b.d(b.f35694a0.a());
                    boolean a38 = this.f35657b.a(b.f35695b0.a(), false);
                    boolean a39 = this.f35657b.a(b.f35697c0.a(), false);
                    boolean a40 = this.f35657b.a(b.f35699d0.a(), false);
                    boolean a41 = this.f35657b.a(b.f35701e0.a(), false);
                    boolean a42 = this.f35657b.a(b.f35703f0.a(), false);
                    boolean a43 = this.f35657b.a(b.f35705g0.a(), false);
                    boolean a44 = this.f35657b.a(b.f35707h0.a(), false);
                    boolean a45 = this.f35657b.a(b.f35709i0.a(), false);
                    a aVar2 = f35655f;
                    xr0 xr0Var = this.f35657b;
                    String a46 = b.f35711j0.a();
                    if (!xr0Var.c(a46)) {
                        xr0Var = null;
                    }
                    Long valueOf = xr0Var != null ? Long.valueOf(xr0Var.b(a46)) : null;
                    xr0 xr0Var2 = this.f35657b;
                    Long l4 = valueOf;
                    String a47 = b.f35713k0.a();
                    if (!xr0Var2.c(a47)) {
                        xr0Var2 = null;
                    }
                    Long valueOf2 = xr0Var2 != null ? Long.valueOf(xr0Var2.b(a47)) : null;
                    boolean a48 = this.f35657b.a(b.f35715l0.a(), false);
                    String d14 = this.f35657b.d(b.f35717m0.a());
                    if (d14 != null) {
                        this.f35658c.getClass();
                        set = w50.a(d14);
                    } else {
                        set = null;
                    }
                    Set<u50> set2 = set;
                    String jsonData = this.f35657b.d(b.f35719n0.a());
                    if (jsonData != null) {
                        this.f35659d.getClass();
                        Intrinsics.checkNotNullParameter(jsonData, "jsonData");
                        map = C2111na.a(new JSONObject(jsonData));
                    } else {
                        map = null;
                    }
                    Map<gs, ? extends Set<String>> map2 = map;
                    boolean a49 = this.f35657b.a(b.f35721o0.a(), false);
                    boolean a50 = this.f35657b.a(b.f35723p0.a(), false);
                    boolean a51 = this.f35657b.a(b.f35725q0.a(), true);
                    boolean a52 = this.f35657b.a(b.f35727r0.a(), false);
                    Integer b12 = a.b(aVar2, this.f35657b, b.f35729s0.a());
                    Integer b13 = a.b(aVar2, this.f35657b, b.f35731t0.a());
                    Integer b14 = a.b(aVar2, this.f35657b, b.f35733u0.a());
                    Integer b15 = a.b(aVar2, this.f35657b, b.f35735v0.a());
                    String d15 = this.f35657b.d(b.f35737w0.a());
                    if (d15 != null) {
                        this.f35660e.getClass();
                        c1989i6 = C1821b6.a(d15);
                    } else {
                        c1989i6 = null;
                    }
                    C1989i6 c1989i62 = c1989i6;
                    boolean a53 = this.f35657b.a(b.f35739x0.a(), false);
                    xr0 xr0Var3 = this.f35657b;
                    String key = b.f35741y0.a();
                    Intrinsics.checkNotNullParameter(xr0Var3, "<this>");
                    Intrinsics.checkNotNullParameter(key, "key");
                    String d16 = xr0Var3.d(key);
                    if (d16 == null || (list = StringsKt.split$default(d16, new String[]{StringUtils.COMMA}, false, 0, 6, null)) == null) {
                        list = null;
                    }
                    if (list == null) {
                        list = CollectionsKt.emptyList();
                    }
                    boolean a54 = this.f35657b.a(b.f35743z0.a(), false);
                    boolean a55 = this.f35657b.a(b.f35662A0.a(), false);
                    boolean a56 = this.f35657b.a(b.f35664B0.a(), false);
                    boolean a57 = this.f35657b.a(b.f35666C0.a(), false);
                    boolean a58 = this.f35657b.a(b.f35668D0.a(), false);
                    du1.a t4 = new du1.a().h(d4).c(a8).a(b4).a(b5).e(b6).a(b7).b(b8).c(b9).b(b10).b(a5).r(a6).B(a7).N(a10).s(a11).f(d8).g(d9).k(a9).d(a4).x(a12).y(a13).G(a14).H(a15).Q(a16).P(a17).u(a18).K(a19).b(a20).h(a31).w(a21).e(d11).q(a22).g(a25).a(a26).n(a27).m(a28).U(a29).E(a23).A(a24).a(a35).z(a30).o(a32).a(d5).d(d6).J(a33).c(d7).f(a34).C(a36).T(a37).b(d12).i(d13).e(a38).v(a39).L(a40).D(a41).W(a42).j(a43).p(a44).a(a45).a(l4).b(valueOf2).i(a48).a(set2).a(map2).l(a49).S(a50).c(a51).d(a52).d(b12).b(b13).g(b14).f(b15).a(c1989i62).M(a53).a(list).O(a54).R(a55).F(a56).V(a57).I(a58).c(a.b(aVar2, this.f35657b, b.f35670E0.a())).t(this.f35657b.a(b.f35672F0.a(), false));
                    if (d10 != null && b11 != null) {
                        t4.a(new a50(b11.intValue(), d10));
                    }
                    du1Var = t4.a();
                } else {
                    du1Var = null;
                }
                Unit unit = Unit.f41027a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return du1Var;
    }

    @Override // com.yandex.mobile.ads.impl.yq
    public final void a(@NotNull du1 sdkConfiguration) {
        C2144ok c2144ok;
        Intrinsics.checkNotNullParameter(sdkConfiguration, "sdkConfiguration");
        synchronized (f35656g) {
            try {
                this.f35657b.a(b.f35708i.a(), sdkConfiguration.M());
                this.f35657b.a(b.f35685R.a(), sdkConfiguration.m());
                this.f35657b.b(b.f35712k.a(), sdkConfiguration.y0());
                this.f35657b.b(b.f35686S.a(), sdkConfiguration.h0());
                this.f35657b.a(b.f35696c.a(), sdkConfiguration.v());
                this.f35657b.a(b.f35698d.a(), sdkConfiguration.D());
                this.f35657b.a(b.f35700e.a(), sdkConfiguration.G());
                this.f35657b.a(b.f35661A.a(), sdkConfiguration.z());
                this.f35657b.b(b.f35702f.a(), sdkConfiguration.q());
                this.f35657b.b(b.f35740y.a(), sdkConfiguration.P());
                this.f35657b.b(b.f35742z.a(), sdkConfiguration.O());
                this.f35657b.a(sdkConfiguration.b(), b.f35704g.a());
                this.f35657b.b(b.f35732u.a(), sdkConfiguration.i0());
                this.f35657b.b(b.f35734v.a(), sdkConfiguration.K());
                this.f35657b.b(b.f35736w.a(), sdkConfiguration.X());
                this.f35657b.b(b.f35738x.a(), sdkConfiguration.k0());
                this.f35657b.b(b.f35676I.a(), sdkConfiguration.d0());
                this.f35657b.b(b.f35678K.a(), sdkConfiguration.c0());
                xr0 xr0Var = this.f35657b;
                b bVar = b.f35677J;
                xr0Var.b(bVar.a(), sdkConfiguration.b0());
                this.f35657b.b(b.f35679L.a(), sdkConfiguration.A0());
                this.f35657b.b(b.f35680M.a(), sdkConfiguration.o0());
                this.f35657b.b(b.f35682O.a(), sdkConfiguration.n0());
                this.f35657b.b(b.f35683P.a(), sdkConfiguration.e0());
                xr0 xr0Var2 = this.f35657b;
                b bVar2 = b.f35684Q;
                xr0Var2.b(bVar2.a(), sdkConfiguration.w0());
                this.f35657b.a(sdkConfiguration.E(), b.f35667D.a());
                this.f35657b.a(b.f35669E.a(), sdkConfiguration.C());
                this.f35657b.a(b.f35671F.a(), sdkConfiguration.B());
                this.f35657b.a(b.f35688U.a(), sdkConfiguration.a());
                this.f35657b.a(b.f35689V.a(), sdkConfiguration.s());
                this.f35657b.a(b.f35693Z.a(), sdkConfiguration.k());
                Boolean D02 = sdkConfiguration.D0();
                Boolean q02 = sdkConfiguration.q0();
                boolean g02 = sdkConfiguration.g0();
                boolean p02 = sdkConfiguration.p0();
                Boolean B02 = sdkConfiguration.B0();
                boolean l02 = sdkConfiguration.l0();
                boolean m02 = sdkConfiguration.m0();
                boolean u02 = sdkConfiguration.u0();
                boolean v02 = sdkConfiguration.v0();
                boolean f02 = sdkConfiguration.f0();
                boolean t02 = sdkConfiguration.t0();
                boolean a02 = sdkConfiguration.a0();
                Integer d4 = sdkConfiguration.d();
                Integer J3 = sdkConfiguration.J();
                C2144ok l4 = sdkConfiguration.l();
                boolean b02 = sdkConfiguration.b0();
                boolean w02 = sdkConfiguration.w0();
                Boolean W3 = sdkConfiguration.W();
                boolean Z3 = sdkConfiguration.Z();
                boolean r02 = sdkConfiguration.r0();
                boolean z02 = sdkConfiguration.z0();
                xr0 xr0Var3 = this.f35657b;
                String a4 = b.f35706h.a();
                if (D02 != null) {
                    c2144ok = l4;
                    xr0Var3.b(a4, D02.booleanValue());
                } else {
                    c2144ok = l4;
                    xr0Var3.a(a4);
                }
                xr0 xr0Var4 = this.f35657b;
                String a5 = b.f35710j.a();
                if (q02 != null) {
                    xr0Var4.b(a5, q02.booleanValue());
                } else {
                    xr0Var4.a(a5);
                }
                this.f35657b.b(b.f35714l.a(), g02);
                this.f35657b.b(b.f35716m.a(), p02);
                xr0 xr0Var5 = this.f35657b;
                String a6 = b.f35718n.a();
                if (B02 != null) {
                    xr0Var5.b(a6, B02.booleanValue());
                } else {
                    xr0Var5.a(a6);
                }
                this.f35657b.b(b.f35722p.a(), l02);
                this.f35657b.b(b.f35720o.a(), m02);
                this.f35657b.b(b.f35724q.a(), u02);
                this.f35657b.b(b.f35726r.a(), v02);
                this.f35657b.b(bVar.a(), b02);
                this.f35657b.b(b.f35663B.a(), f02);
                this.f35657b.b(b.f35665C.a(), t02);
                xr0 xr0Var6 = this.f35657b;
                String a7 = b.f35687T.a();
                if (W3 != null) {
                    xr0Var6.b(a7, W3.booleanValue());
                } else {
                    xr0Var6.a(a7);
                }
                this.f35657b.b(b.f35690W.a(), Z3);
                this.f35657b.b(b.f35681N.a(), a02);
                xr0 xr0Var7 = this.f35657b;
                String a8 = b.f35728s.a();
                if (d4 != null) {
                    xr0Var7.a(d4.intValue(), a8);
                } else {
                    xr0Var7.a(a8);
                }
                xr0 xr0Var8 = this.f35657b;
                String a9 = b.f35730t.a();
                if (J3 != null) {
                    xr0Var8.a(J3.intValue(), a9);
                } else {
                    xr0Var8.a(a9);
                }
                if (c2144ok != null) {
                    int i4 = C2190qk.f30827b;
                    C2190qk.a(this.f35657b, c2144ok);
                } else {
                    int i5 = C2190qk.f30827b;
                    C2190qk.b(this.f35657b);
                }
                a50 t4 = sdkConfiguration.t();
                if (t4 != null) {
                    this.f35657b.a(b.f35673G.a(), t4.d());
                    this.f35657b.a(t4.e(), b.f35675H.a());
                }
                this.f35657b.b(bVar2.a(), w02);
                this.f35657b.b(b.f35691X.a(), r02);
                this.f35657b.b(b.f35692Y.a(), z02);
                this.f35657b.a(b.f35694a0.a(), sdkConfiguration.R());
                this.f35657b.b(b.f35695b0.a(), sdkConfiguration.Y());
                this.f35657b.b(b.f35697c0.a(), sdkConfiguration.j0());
                this.f35657b.b(b.f35699d0.a(), sdkConfiguration.x0());
                this.f35657b.b(b.f35701e0.a(), sdkConfiguration.s0());
                this.f35657b.b(b.f35703f0.a(), sdkConfiguration.C0());
                this.f35657b.b(b.f35705g0.a(), sdkConfiguration.p());
                this.f35657b.b(b.f35707h0.a(), sdkConfiguration.u());
                this.f35657b.b(b.f35709i0.a(), sdkConfiguration.f());
                xr0 xr0Var9 = this.f35657b;
                String a10 = b.f35711j0.a();
                Long g4 = sdkConfiguration.g();
                if (g4 != null) {
                    xr0Var9.a(a10, g4.longValue());
                } else {
                    xr0Var9.a(a10);
                }
                xr0 xr0Var10 = this.f35657b;
                String a11 = b.f35713k0.a();
                Long h4 = sdkConfiguration.h();
                if (h4 != null) {
                    xr0Var10.a(a11, h4.longValue());
                } else {
                    xr0Var10.a(a11);
                }
                this.f35657b.b(b.f35715l0.a(), sdkConfiguration.n());
                xr0 xr0Var11 = this.f35657b;
                String a12 = b.f35717m0.a();
                w50 w50Var = this.f35658c;
                Set<u50> o4 = sdkConfiguration.o();
                w50Var.getClass();
                xr0Var11.a(a12, w50.a(o4));
                xr0 xr0Var12 = this.f35657b;
                String a13 = b.f35719n0.a();
                C2111na c2111na = this.f35659d;
                Map<gs, Set<String>> e4 = sdkConfiguration.e();
                c2111na.getClass();
                xr0Var12.a(a13, C2111na.a(e4));
                this.f35657b.b(b.f35721o0.a(), sdkConfiguration.r());
                this.f35657b.b(b.f35723p0.a(), sdkConfiguration.S());
                this.f35657b.b(b.f35725q0.a(), sdkConfiguration.i());
                this.f35657b.b(b.f35727r0.a(), sdkConfiguration.j());
                xr0 xr0Var13 = this.f35657b;
                String a14 = b.f35729s0.a();
                Integer F4 = sdkConfiguration.F();
                if (F4 != null) {
                    xr0Var13.a(F4.intValue(), a14);
                } else {
                    xr0Var13.a(a14);
                }
                xr0 xr0Var14 = this.f35657b;
                String a15 = b.f35731t0.a();
                Integer y4 = sdkConfiguration.y();
                if (y4 != null) {
                    xr0Var14.a(y4.intValue(), a15);
                } else {
                    xr0Var14.a(a15);
                }
                xr0 xr0Var15 = this.f35657b;
                String a16 = b.f35733u0.a();
                Integer U3 = sdkConfiguration.U();
                if (U3 != null) {
                    xr0Var15.a(U3.intValue(), a16);
                } else {
                    xr0Var15.a(a16);
                }
                xr0 xr0Var16 = this.f35657b;
                String a17 = b.f35735v0.a();
                Integer T3 = sdkConfiguration.T();
                if (T3 != null) {
                    xr0Var16.a(T3.intValue(), a17);
                } else {
                    xr0Var16.a(a17);
                }
                xr0 xr0Var17 = this.f35657b;
                String a18 = b.f35737w0.a();
                C1821b6 c1821b6 = this.f35660e;
                C1989i6 c4 = sdkConfiguration.c();
                c1821b6.getClass();
                xr0Var17.a(a18, C1821b6.a(c4));
                this.f35657b.b(b.f35739x0.a(), sdkConfiguration.L());
                as0.a(this.f35657b, b.f35741y0.a(), sdkConfiguration.w());
                this.f35657b.b(b.f35743z0.a(), sdkConfiguration.N());
                this.f35657b.b(b.f35662A0.a(), sdkConfiguration.Q());
                this.f35657b.b(b.f35664B0.a(), sdkConfiguration.H());
                this.f35657b.b(b.f35666C0.a(), sdkConfiguration.V());
                this.f35657b.b(b.f35668D0.a(), sdkConfiguration.I());
                xr0 xr0Var18 = this.f35657b;
                String a19 = b.f35670E0.a();
                Integer A4 = sdkConfiguration.A();
                if (A4 != null) {
                    xr0Var18.a(A4.intValue(), a19);
                } else {
                    xr0Var18.a(a19);
                }
                this.f35657b.b(b.f35672F0.a(), sdkConfiguration.x());
                Unit unit = Unit.f41027a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
