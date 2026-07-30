package com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview;

import android.os.Build;
import android.webkit.WebSettings;
import com.pichillilorenzo.flutter_inappwebview_android.ISettings;
import com.pichillilorenzo.flutter_inappwebview_android.types.PreferredContentModeOptionType;
import com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import u0.d;
import u0.r;
import v0.AbstractC0962f;
import v0.AbstractC0963g;
import v0.AbstractC0964h;
import v0.AbstractC0968l;
import v0.C0958b;
import v0.F;

/* loaded from: classes.dex */
public class InAppWebViewSettings implements ISettings<InAppWebViewInterface> {
    public static final String LOG_TAG = "InAppWebViewSettings";
    public Boolean algorithmicDarkeningAllowed;
    public Boolean allowBackgroundAudioPlaying;
    public Boolean allowContentAccess;
    public Boolean allowFileAccess;
    public Boolean allowFileAccessFromFileURLs;
    public Boolean allowUniversalAccessFromFileURLs;
    public String appCachePath;
    public String applicationNameForUserAgent;
    public Boolean blockNetworkImage;
    public Boolean blockNetworkLoads;
    public Boolean builtInZoomControls;
    public Boolean cacheEnabled;
    public Integer cacheMode;

    @Deprecated
    public Boolean clearCache;

    @Deprecated
    public Boolean clearSessionCache;
    public List<Map<String, Map<String, Object>>> contentBlockers;
    public String cursiveFontFamily;
    public Boolean databaseEnabled;
    public Integer defaultFixedFontSize;
    public Integer defaultFontSize;
    public String defaultTextEncodingName;
    public byte[] defaultVideoPoster;
    public Boolean disableContextMenu;
    public Boolean disableDefaultErrorPage;
    public Boolean disableHorizontalScroll;
    public Boolean disableVerticalScroll;
    public Integer disabledActionModeMenuItems;
    public Boolean displayZoomControls;
    public Boolean domStorageEnabled;
    public Boolean enterpriseAuthenticationAppLinkPolicyEnabled;
    public String fantasyFontFamily;
    public String fixedFontFamily;
    public Integer forceDark;
    public Integer forceDarkStrategy;
    public Boolean geolocationEnabled;
    public Boolean hardwareAcceleration;
    public Boolean horizontalScrollBarEnabled;
    public String horizontalScrollbarThumbColor;
    public String horizontalScrollbarTrackColor;
    public Boolean incognito;
    public Integer initialScale;
    public Boolean interceptOnlyAsyncAjaxRequests;
    public Boolean javaScriptCanOpenWindowsAutomatically;
    public Boolean javaScriptEnabled;
    public WebSettings.LayoutAlgorithm layoutAlgorithm;
    public Boolean loadWithOverviewMode;
    public Boolean loadsImagesAutomatically;
    public Boolean mediaPlaybackRequiresUserGesture;
    public Integer minimumFontSize;
    public Integer minimumLogicalFontSize;
    public Integer mixedContentMode;
    public Boolean needInitialFocus;
    public Boolean networkAvailable;
    public Boolean offscreenPreRaster;
    public Integer overScrollMode;
    public Integer preferredContentMode;
    public String regexToCancelSubFramesLoading;
    public Map<String, Object> rendererPriorityPolicy;
    public Set<String> requestedWithHeaderOriginAllowList;
    public List<String> resourceCustomSchemes;
    public Boolean safeBrowsingEnabled;
    public String sansSerifFontFamily;
    public Boolean saveFormData;
    public Integer scrollBarDefaultDelayBeforeFade;
    public Integer scrollBarFadeDuration;
    public Integer scrollBarStyle;
    public Boolean scrollbarFadingEnabled;
    public String serifFontFamily;
    public String standardFontFamily;
    public Boolean supportMultipleWindows;
    public Boolean supportZoom;
    public Integer textZoom;
    public Boolean thirdPartyCookiesEnabled;
    public Boolean transparentBackground;
    public Boolean useHybridComposition;
    public Boolean useOnDownloadStart;
    public Boolean useOnLoadResource;
    public Boolean useOnRenderProcessGone;
    public Boolean useShouldInterceptAjaxRequest;
    public Boolean useShouldInterceptFetchRequest;
    public Boolean useShouldInterceptRequest;
    public Boolean useShouldOverrideUrlLoading;
    public Boolean useWideViewPort;
    public String userAgent;
    public Boolean verticalScrollBarEnabled;
    public Integer verticalScrollbarPosition;
    public String verticalScrollbarThumbColor;
    public String verticalScrollbarTrackColor;
    public Map<String, Object> webViewAssetLoader;

    /* renamed from: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewSettings$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$android$webkit$WebSettings$LayoutAlgorithm;

        static {
            int[] iArr = new int[WebSettings.LayoutAlgorithm.values().length];
            $SwitchMap$android$webkit$WebSettings$LayoutAlgorithm = iArr;
            try {
                iArr[WebSettings.LayoutAlgorithm.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$android$webkit$WebSettings$LayoutAlgorithm[WebSettings.LayoutAlgorithm.TEXT_AUTOSIZING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$android$webkit$WebSettings$LayoutAlgorithm[WebSettings.LayoutAlgorithm.NARROW_COLUMNS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public InAppWebViewSettings() {
        Boolean bool = Boolean.FALSE;
        this.useShouldOverrideUrlLoading = bool;
        this.useOnLoadResource = bool;
        this.useOnDownloadStart = bool;
        this.clearCache = bool;
        this.userAgent = "";
        this.applicationNameForUserAgent = "";
        Boolean bool2 = Boolean.TRUE;
        this.javaScriptEnabled = bool2;
        this.javaScriptCanOpenWindowsAutomatically = bool;
        this.mediaPlaybackRequiresUserGesture = bool2;
        this.minimumFontSize = 8;
        this.verticalScrollBarEnabled = bool2;
        this.horizontalScrollBarEnabled = bool2;
        this.resourceCustomSchemes = new ArrayList();
        this.contentBlockers = new ArrayList();
        this.preferredContentMode = Integer.valueOf(PreferredContentModeOptionType.RECOMMENDED.toValue());
        this.useShouldInterceptAjaxRequest = bool;
        this.interceptOnlyAsyncAjaxRequests = bool2;
        this.useShouldInterceptFetchRequest = bool;
        this.incognito = bool;
        this.cacheEnabled = bool2;
        this.transparentBackground = bool;
        this.disableVerticalScroll = bool;
        this.disableHorizontalScroll = bool;
        this.disableContextMenu = bool;
        this.supportZoom = bool2;
        this.allowFileAccessFromFileURLs = bool;
        this.allowUniversalAccessFromFileURLs = bool;
        this.allowBackgroundAudioPlaying = bool;
        this.textZoom = 100;
        this.clearSessionCache = bool;
        this.builtInZoomControls = bool2;
        this.displayZoomControls = bool;
        this.databaseEnabled = bool;
        this.domStorageEnabled = bool2;
        this.useWideViewPort = bool2;
        this.safeBrowsingEnabled = bool2;
        this.allowContentAccess = bool2;
        this.allowFileAccess = bool2;
        this.blockNetworkImage = bool;
        this.blockNetworkLoads = bool;
        this.cacheMode = -1;
        this.cursiveFontFamily = "cursive";
        this.defaultFixedFontSize = 16;
        this.defaultFontSize = 16;
        this.defaultTextEncodingName = "UTF-8";
        this.fantasyFontFamily = "fantasy";
        this.fixedFontFamily = "monospace";
        this.forceDark = 0;
        this.forceDarkStrategy = 2;
        this.geolocationEnabled = bool2;
        this.loadWithOverviewMode = bool2;
        this.loadsImagesAutomatically = bool2;
        this.minimumLogicalFontSize = 8;
        this.initialScale = 0;
        this.needInitialFocus = bool2;
        this.offscreenPreRaster = bool;
        this.sansSerifFontFamily = "sans-serif";
        this.serifFontFamily = "sans-serif";
        this.standardFontFamily = "sans-serif";
        this.saveFormData = bool2;
        this.thirdPartyCookiesEnabled = bool2;
        this.hardwareAcceleration = bool2;
        this.supportMultipleWindows = bool;
        this.overScrollMode = 1;
        this.networkAvailable = null;
        this.scrollBarStyle = 0;
        this.verticalScrollbarPosition = 0;
        this.scrollBarDefaultDelayBeforeFade = null;
        this.scrollbarFadingEnabled = bool2;
        this.scrollBarFadeDuration = null;
        this.rendererPriorityPolicy = null;
        this.useShouldInterceptRequest = bool;
        this.useOnRenderProcessGone = bool;
        this.disableDefaultErrorPage = bool;
        this.useHybridComposition = bool2;
        this.algorithmicDarkeningAllowed = bool;
        this.enterpriseAuthenticationAppLinkPolicyEnabled = bool2;
    }

    private String getLayoutAlgorithm() {
        WebSettings.LayoutAlgorithm layoutAlgorithm = this.layoutAlgorithm;
        if (layoutAlgorithm == null) {
            return null;
        }
        int i2 = AnonymousClass1.$SwitchMap$android$webkit$WebSettings$LayoutAlgorithm[layoutAlgorithm.ordinal()];
        if (i2 == 1) {
            return "NORMAL";
        }
        if (i2 == 2) {
            return "TEXT_AUTOSIZING";
        }
        if (i2 != 3) {
            return null;
        }
        return "NARROW_COLUMNS";
    }

    private void setLayoutAlgorithm(String str) {
        if (str != null) {
            switch (str) {
                case "NARROW_COLUMNS":
                    this.layoutAlgorithm = WebSettings.LayoutAlgorithm.NARROW_COLUMNS;
                case "NORMAL":
                    this.layoutAlgorithm = WebSettings.LayoutAlgorithm.NORMAL;
                case "TEXT_AUTOSIZING":
                    this.layoutAlgorithm = WebSettings.LayoutAlgorithm.TEXT_AUTOSIZING;
                    break;
            }
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.ISettings
    public /* bridge */ /* synthetic */ ISettings<InAppWebViewInterface> parse(Map map) {
        return parse2((Map<String, Object>) map);
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.ISettings
    public Map<String, Object> toMap() {
        HashMap hashMap = new HashMap();
        hashMap.put("useShouldOverrideUrlLoading", this.useShouldOverrideUrlLoading);
        hashMap.put("useOnLoadResource", this.useOnLoadResource);
        hashMap.put("useOnDownloadStart", this.useOnDownloadStart);
        hashMap.put("clearCache", this.clearCache);
        hashMap.put("userAgent", this.userAgent);
        hashMap.put("applicationNameForUserAgent", this.applicationNameForUserAgent);
        hashMap.put("javaScriptEnabled", this.javaScriptEnabled);
        hashMap.put("javaScriptCanOpenWindowsAutomatically", this.javaScriptCanOpenWindowsAutomatically);
        hashMap.put("mediaPlaybackRequiresUserGesture", this.mediaPlaybackRequiresUserGesture);
        hashMap.put("minimumFontSize", this.minimumFontSize);
        hashMap.put("verticalScrollBarEnabled", this.verticalScrollBarEnabled);
        hashMap.put("horizontalScrollBarEnabled", this.horizontalScrollBarEnabled);
        hashMap.put("resourceCustomSchemes", this.resourceCustomSchemes);
        hashMap.put("contentBlockers", this.contentBlockers);
        hashMap.put("preferredContentMode", this.preferredContentMode);
        hashMap.put("useShouldInterceptAjaxRequest", this.useShouldInterceptAjaxRequest);
        hashMap.put("interceptOnlyAsyncAjaxRequests", this.interceptOnlyAsyncAjaxRequests);
        hashMap.put("useShouldInterceptFetchRequest", this.useShouldInterceptFetchRequest);
        hashMap.put("incognito", this.incognito);
        hashMap.put("cacheEnabled", this.cacheEnabled);
        hashMap.put("transparentBackground", this.transparentBackground);
        hashMap.put("disableVerticalScroll", this.disableVerticalScroll);
        hashMap.put("disableHorizontalScroll", this.disableHorizontalScroll);
        hashMap.put("disableContextMenu", this.disableContextMenu);
        hashMap.put("textZoom", this.textZoom);
        hashMap.put("clearSessionCache", this.clearSessionCache);
        hashMap.put("builtInZoomControls", this.builtInZoomControls);
        hashMap.put("displayZoomControls", this.displayZoomControls);
        hashMap.put("supportZoom", this.supportZoom);
        hashMap.put("databaseEnabled", this.databaseEnabled);
        hashMap.put("domStorageEnabled", this.domStorageEnabled);
        hashMap.put("useWideViewPort", this.useWideViewPort);
        hashMap.put("safeBrowsingEnabled", this.safeBrowsingEnabled);
        hashMap.put("mixedContentMode", this.mixedContentMode);
        hashMap.put("allowContentAccess", this.allowContentAccess);
        hashMap.put("allowFileAccess", this.allowFileAccess);
        hashMap.put("allowFileAccessFromFileURLs", this.allowFileAccessFromFileURLs);
        hashMap.put("allowUniversalAccessFromFileURLs", this.allowUniversalAccessFromFileURLs);
        hashMap.put("appCachePath", this.appCachePath);
        hashMap.put("blockNetworkImage", this.blockNetworkImage);
        hashMap.put("blockNetworkLoads", this.blockNetworkLoads);
        hashMap.put("cacheMode", this.cacheMode);
        hashMap.put("cursiveFontFamily", this.cursiveFontFamily);
        hashMap.put("defaultFixedFontSize", this.defaultFixedFontSize);
        hashMap.put("defaultFontSize", this.defaultFontSize);
        hashMap.put("defaultTextEncodingName", this.defaultTextEncodingName);
        hashMap.put("disabledActionModeMenuItems", this.disabledActionModeMenuItems);
        hashMap.put("fantasyFontFamily", this.fantasyFontFamily);
        hashMap.put("fixedFontFamily", this.fixedFontFamily);
        hashMap.put("forceDark", this.forceDark);
        hashMap.put("forceDarkStrategy", this.forceDarkStrategy);
        hashMap.put("geolocationEnabled", this.geolocationEnabled);
        hashMap.put("layoutAlgorithm", getLayoutAlgorithm());
        hashMap.put("loadWithOverviewMode", this.loadWithOverviewMode);
        hashMap.put("loadsImagesAutomatically", this.loadsImagesAutomatically);
        hashMap.put("minimumLogicalFontSize", this.minimumLogicalFontSize);
        hashMap.put("initialScale", this.initialScale);
        hashMap.put("needInitialFocus", this.needInitialFocus);
        hashMap.put("offscreenPreRaster", this.offscreenPreRaster);
        hashMap.put("sansSerifFontFamily", this.sansSerifFontFamily);
        hashMap.put("serifFontFamily", this.serifFontFamily);
        hashMap.put("standardFontFamily", this.standardFontFamily);
        hashMap.put("saveFormData", this.saveFormData);
        hashMap.put("thirdPartyCookiesEnabled", this.thirdPartyCookiesEnabled);
        hashMap.put("hardwareAcceleration", this.hardwareAcceleration);
        hashMap.put("supportMultipleWindows", this.supportMultipleWindows);
        hashMap.put("regexToCancelSubFramesLoading", this.regexToCancelSubFramesLoading);
        hashMap.put("overScrollMode", this.overScrollMode);
        hashMap.put("networkAvailable", this.networkAvailable);
        hashMap.put("scrollBarStyle", this.scrollBarStyle);
        hashMap.put("verticalScrollbarPosition", this.verticalScrollbarPosition);
        hashMap.put("scrollBarDefaultDelayBeforeFade", this.scrollBarDefaultDelayBeforeFade);
        hashMap.put("scrollbarFadingEnabled", this.scrollbarFadingEnabled);
        hashMap.put("scrollBarFadeDuration", this.scrollBarFadeDuration);
        hashMap.put("rendererPriorityPolicy", this.rendererPriorityPolicy);
        hashMap.put("useShouldInterceptRequest", this.useShouldInterceptRequest);
        hashMap.put("useOnRenderProcessGone", this.useOnRenderProcessGone);
        hashMap.put("disableDefaultErrorPage", this.disableDefaultErrorPage);
        hashMap.put("useHybridComposition", this.useHybridComposition);
        hashMap.put("verticalScrollbarThumbColor", this.verticalScrollbarThumbColor);
        hashMap.put("verticalScrollbarTrackColor", this.verticalScrollbarTrackColor);
        hashMap.put("horizontalScrollbarThumbColor", this.horizontalScrollbarThumbColor);
        hashMap.put("horizontalScrollbarTrackColor", this.horizontalScrollbarTrackColor);
        hashMap.put("algorithmicDarkeningAllowed", this.algorithmicDarkeningAllowed);
        hashMap.put("enterpriseAuthenticationAppLinkPolicyEnabled", this.enterpriseAuthenticationAppLinkPolicyEnabled);
        hashMap.put("allowBackgroundAudioPlaying", this.allowBackgroundAudioPlaying);
        hashMap.put("defaultVideoPoster", this.defaultVideoPoster);
        hashMap.put("requestedWithHeaderOriginAllowList", this.requestedWithHeaderOriginAllowList != null ? new ArrayList(this.requestedWithHeaderOriginAllowList) : null);
        return hashMap;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.ISettings
    public Map<String, Object> getRealSettings(InAppWebViewInterface inAppWebViewInterface) {
        boolean safeBrowsingEnabled;
        int forceDark;
        int rendererRequestedPriority;
        boolean rendererPriorityWaivedWhenNotVisible;
        int forceDark2;
        boolean safeBrowsingEnabled2;
        Map<String, Object> map = toMap();
        if (inAppWebViewInterface instanceof InAppWebView) {
            InAppWebView inAppWebView = (InAppWebView) inAppWebViewInterface;
            WebSettings settings = inAppWebView.getSettings();
            map.put("userAgent", settings.getUserAgentString());
            map.put("javaScriptEnabled", Boolean.valueOf(settings.getJavaScriptEnabled()));
            map.put("javaScriptCanOpenWindowsAutomatically", Boolean.valueOf(settings.getJavaScriptCanOpenWindowsAutomatically()));
            map.put("mediaPlaybackRequiresUserGesture", Boolean.valueOf(settings.getMediaPlaybackRequiresUserGesture()));
            map.put("minimumFontSize", Integer.valueOf(settings.getMinimumFontSize()));
            map.put("verticalScrollBarEnabled", Boolean.valueOf(inAppWebView.isVerticalScrollBarEnabled()));
            map.put("horizontalScrollBarEnabled", Boolean.valueOf(inAppWebView.isHorizontalScrollBarEnabled()));
            map.put("textZoom", Integer.valueOf(settings.getTextZoom()));
            map.put("builtInZoomControls", Boolean.valueOf(settings.getBuiltInZoomControls()));
            map.put("supportZoom", Boolean.valueOf(settings.supportZoom()));
            map.put("displayZoomControls", Boolean.valueOf(settings.getDisplayZoomControls()));
            map.put("databaseEnabled", Boolean.valueOf(settings.getDatabaseEnabled()));
            map.put("domStorageEnabled", Boolean.valueOf(settings.getDomStorageEnabled()));
            map.put("useWideViewPort", Boolean.valueOf(settings.getUseWideViewPort()));
            if (d.a("SAFE_BROWSING_ENABLE")) {
                C0958b c0958b = F.f8152b;
                if (c0958b.a()) {
                    safeBrowsingEnabled2 = AbstractC0964h.b(settings);
                } else {
                    if (!c0958b.b()) {
                        throw F.a();
                    }
                    safeBrowsingEnabled2 = ((WebSettingsBoundaryInterface) r.a(settings).f8180b).getSafeBrowsingEnabled();
                }
                map.put("safeBrowsingEnabled", Boolean.valueOf(safeBrowsingEnabled2));
            } else if (Build.VERSION.SDK_INT >= 26) {
                safeBrowsingEnabled = settings.getSafeBrowsingEnabled();
                map.put("safeBrowsingEnabled", Boolean.valueOf(safeBrowsingEnabled));
            }
            int i2 = Build.VERSION.SDK_INT;
            map.put("mixedContentMode", Integer.valueOf(settings.getMixedContentMode()));
            map.put("allowContentAccess", Boolean.valueOf(settings.getAllowContentAccess()));
            map.put("allowFileAccess", Boolean.valueOf(settings.getAllowFileAccess()));
            map.put("allowFileAccessFromFileURLs", Boolean.valueOf(settings.getAllowFileAccessFromFileURLs()));
            map.put("allowUniversalAccessFromFileURLs", Boolean.valueOf(settings.getAllowUniversalAccessFromFileURLs()));
            map.put("blockNetworkImage", Boolean.valueOf(settings.getBlockNetworkImage()));
            map.put("blockNetworkLoads", Boolean.valueOf(settings.getBlockNetworkLoads()));
            map.put("cacheMode", Integer.valueOf(settings.getCacheMode()));
            map.put("cursiveFontFamily", settings.getCursiveFontFamily());
            map.put("defaultFixedFontSize", Integer.valueOf(settings.getDefaultFixedFontSize()));
            map.put("defaultFontSize", Integer.valueOf(settings.getDefaultFontSize()));
            map.put("defaultTextEncodingName", settings.getDefaultTextEncodingName());
            if (d.a("DISABLED_ACTION_MODE_MENU_ITEMS")) {
                F.f8153c.getClass();
                map.put("disabledActionModeMenuItems", Integer.valueOf(AbstractC0963g.f(settings)));
            }
            map.put("disabledActionModeMenuItems", Integer.valueOf(settings.getDisabledActionModeMenuItems()));
            map.put("fantasyFontFamily", settings.getFantasyFontFamily());
            map.put("fixedFontFamily", settings.getFixedFontFamily());
            if (d.a("FORCE_DARK")) {
                C0958b c0958b2 = F.f8142G;
                if (c0958b2.a()) {
                    forceDark2 = AbstractC0968l.a(settings);
                } else {
                    if (!c0958b2.b()) {
                        throw F.a();
                    }
                    forceDark2 = ((WebSettingsBoundaryInterface) r.a(settings).f8180b).getForceDark();
                }
                map.put("forceDark", Integer.valueOf(forceDark2));
            } else if (i2 >= 29) {
                forceDark = settings.getForceDark();
                map.put("forceDark", Integer.valueOf(forceDark));
            }
            if (d.a("FORCE_DARK_STRATEGY")) {
                if (!F.f8143H.b()) {
                    throw F.a();
                }
                map.put("forceDarkStrategy", Integer.valueOf(((WebSettingsBoundaryInterface) r.a(settings).f8180b).getForceDark()));
            }
            map.put("layoutAlgorithm", settings.getLayoutAlgorithm().name());
            map.put("loadWithOverviewMode", Boolean.valueOf(settings.getLoadWithOverviewMode()));
            map.put("loadsImagesAutomatically", Boolean.valueOf(settings.getLoadsImagesAutomatically()));
            map.put("minimumLogicalFontSize", Integer.valueOf(settings.getMinimumLogicalFontSize()));
            if (d.a("OFF_SCREEN_PRERASTER")) {
                F.f8151a.getClass();
                map.put("offscreenPreRaster", Boolean.valueOf(AbstractC0962f.g(settings)));
            } else {
                map.put("offscreenPreRaster", Boolean.valueOf(settings.getOffscreenPreRaster()));
            }
            map.put("sansSerifFontFamily", settings.getSansSerifFontFamily());
            map.put("serifFontFamily", settings.getSerifFontFamily());
            map.put("standardFontFamily", settings.getStandardFontFamily());
            map.put("saveFormData", Boolean.valueOf(settings.getSaveFormData()));
            map.put("supportMultipleWindows", Boolean.valueOf(settings.supportMultipleWindows()));
            map.put("overScrollMode", Integer.valueOf(inAppWebView.getOverScrollMode()));
            map.put("scrollBarStyle", Integer.valueOf(inAppWebView.getScrollBarStyle()));
            map.put("verticalScrollbarPosition", Integer.valueOf(inAppWebView.getVerticalScrollbarPosition()));
            map.put("scrollBarDefaultDelayBeforeFade", Integer.valueOf(inAppWebView.getScrollBarDefaultDelayBeforeFade()));
            map.put("scrollbarFadingEnabled", Boolean.valueOf(inAppWebView.isScrollbarFadingEnabled()));
            map.put("scrollBarFadeDuration", Integer.valueOf(inAppWebView.getScrollBarFadeDuration()));
            if (i2 >= 26) {
                HashMap hashMap = new HashMap();
                rendererRequestedPriority = inAppWebView.getRendererRequestedPriority();
                hashMap.put("rendererRequestedPriority", Integer.valueOf(rendererRequestedPriority));
                rendererPriorityWaivedWhenNotVisible = inAppWebView.getRendererPriorityWaivedWhenNotVisible();
                hashMap.put("waivedWhenNotVisible", Boolean.valueOf(rendererPriorityWaivedWhenNotVisible));
                map.put("rendererPriorityPolicy", hashMap);
            }
            if (d.a("ALGORITHMIC_DARKENING") && i2 >= 29) {
                if (!F.f8139D.b()) {
                    throw F.a();
                }
                map.put("algorithmicDarkeningAllowed", Boolean.valueOf(((WebSettingsBoundaryInterface) r.a(settings).f8180b).isAlgorithmicDarkeningAllowed()));
            }
            if (d.a("ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY")) {
                if (!F.f8148M.b()) {
                    throw F.a();
                }
                map.put("enterpriseAuthenticationAppLinkPolicyEnabled", Boolean.valueOf(((WebSettingsBoundaryInterface) r.a(settings).f8180b).getEnterpriseAuthenticationAppLinkPolicyEnabled()));
            }
            if (d.a("REQUESTED_WITH_HEADER_ALLOW_LIST")) {
                if (!F.f8150O.b()) {
                    throw F.a();
                }
                map.put("requestedWithHeaderOriginAllowList", new ArrayList(((WebSettingsBoundaryInterface) r.a(settings).f8180b).getRequestedWithHeaderOriginAllowList()));
                return map;
            }
        }
        return map;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.ISettings
    /* renamed from: parse, reason: avoid collision after fix types in other method */
    public ISettings<InAppWebViewInterface> parse2(Map<String, Object> map) {
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                key.getClass();
                switch (key) {
                    case "disableHorizontalScroll":
                        this.disableHorizontalScroll = (Boolean) value;
                        break;
                    case "scrollBarDefaultDelayBeforeFade":
                        this.scrollBarDefaultDelayBeforeFade = (Integer) value;
                        break;
                    case "useWideViewPort":
                        this.useWideViewPort = (Boolean) value;
                        break;
                    case "allowFileAccessFromFileURLs":
                        this.allowFileAccessFromFileURLs = (Boolean) value;
                        break;
                    case "defaultFontSize":
                        this.defaultFontSize = (Integer) value;
                        break;
                    case "supportZoom":
                        this.supportZoom = (Boolean) value;
                        break;
                    case "scrollbarFadingEnabled":
                        this.scrollbarFadingEnabled = (Boolean) value;
                        break;
                    case "defaultTextEncodingName":
                        this.defaultTextEncodingName = (String) value;
                        break;
                    case "needInitialFocus":
                        this.needInitialFocus = (Boolean) value;
                        break;
                    case "useShouldOverrideUrlLoading":
                        this.useShouldOverrideUrlLoading = (Boolean) value;
                        break;
                    case "preferredContentMode":
                        this.preferredContentMode = (Integer) value;
                        break;
                    case "allowContentAccess":
                        this.allowContentAccess = (Boolean) value;
                        break;
                    case "fixedFontFamily":
                        this.fixedFontFamily = (String) value;
                        break;
                    case "builtInZoomControls":
                        this.builtInZoomControls = (Boolean) value;
                        break;
                    case "javaScriptEnabled":
                        this.javaScriptEnabled = (Boolean) value;
                        break;
                    case "hardwareAcceleration":
                        this.hardwareAcceleration = (Boolean) value;
                        break;
                    case "networkAvailable":
                        this.networkAvailable = (Boolean) value;
                        break;
                    case "useShouldInterceptFetchRequest":
                        this.useShouldInterceptFetchRequest = (Boolean) value;
                        break;
                    case "loadsImagesAutomatically":
                        this.loadsImagesAutomatically = (Boolean) value;
                        break;
                    case "resourceCustomSchemes":
                        this.resourceCustomSchemes = (List) value;
                        break;
                    case "disabledActionModeMenuItems":
                        this.disabledActionModeMenuItems = (Integer) value;
                        break;
                    case "incognito":
                        this.incognito = (Boolean) value;
                        break;
                    case "allowBackgroundAudioPlaying":
                        this.allowBackgroundAudioPlaying = (Boolean) value;
                        break;
                    case "webViewAssetLoader":
                        this.webViewAssetLoader = (Map) value;
                        break;
                    case "overScrollMode":
                        this.overScrollMode = (Integer) value;
                        break;
                    case "domStorageEnabled":
                        this.domStorageEnabled = (Boolean) value;
                        break;
                    case "disableContextMenu":
                        this.disableContextMenu = (Boolean) value;
                        break;
                    case "useShouldInterceptAjaxRequest":
                        this.useShouldInterceptAjaxRequest = (Boolean) value;
                        break;
                    case "textZoom":
                        this.textZoom = (Integer) value;
                        break;
                    case "interceptOnlyAsyncAjaxRequests":
                        this.interceptOnlyAsyncAjaxRequests = (Boolean) value;
                        break;
                    case "minimumFontSize":
                        this.minimumFontSize = (Integer) value;
                        break;
                    case "layoutAlgorithm":
                        setLayoutAlgorithm((String) value);
                        break;
                    case "clearCache":
                        this.clearCache = (Boolean) value;
                        break;
                    case "transparentBackground":
                        this.transparentBackground = (Boolean) value;
                        break;
                    case "enterpriseAuthenticationAppLinkPolicyEnabled":
                        this.enterpriseAuthenticationAppLinkPolicyEnabled = (Boolean) value;
                        break;
                    case "allowUniversalAccessFromFileURLs":
                        this.allowUniversalAccessFromFileURLs = (Boolean) value;
                        break;
                    case "databaseEnabled":
                        this.databaseEnabled = (Boolean) value;
                        break;
                    case "useShouldInterceptRequest":
                        this.useShouldInterceptRequest = (Boolean) value;
                        break;
                    case "cacheMode":
                        this.cacheMode = (Integer) value;
                        break;
                    case "horizontalScrollBarEnabled":
                        this.horizontalScrollBarEnabled = (Boolean) value;
                        break;
                    case "scrollBarStyle":
                        this.scrollBarStyle = (Integer) value;
                        break;
                    case "initialScale":
                        this.initialScale = (Integer) value;
                        break;
                    case "verticalScrollbarPosition":
                        this.verticalScrollbarPosition = (Integer) value;
                        break;
                    case "disableVerticalScroll":
                        this.disableVerticalScroll = (Boolean) value;
                        break;
                    case "javaScriptCanOpenWindowsAutomatically":
                        this.javaScriptCanOpenWindowsAutomatically = (Boolean) value;
                        break;
                    case "horizontalScrollbarTrackColor":
                        this.horizontalScrollbarTrackColor = (String) value;
                        break;
                    case "offscreenPreRaster":
                        this.offscreenPreRaster = (Boolean) value;
                        break;
                    case "fantasyFontFamily":
                        this.fantasyFontFamily = (String) value;
                        break;
                    case "rendererPriorityPolicy":
                        this.rendererPriorityPolicy = (Map) value;
                        break;
                    case "sansSerifFontFamily":
                        this.sansSerifFontFamily = (String) value;
                        break;
                    case "regexToCancelSubFramesLoading":
                        this.regexToCancelSubFramesLoading = (String) value;
                        break;
                    case "verticalScrollbarTrackColor":
                        this.verticalScrollbarTrackColor = (String) value;
                        break;
                    case "useOnDownloadStart":
                        this.useOnDownloadStart = (Boolean) value;
                        break;
                    case "forceDarkStrategy":
                        this.forceDarkStrategy = (Integer) value;
                        break;
                    case "cursiveFontFamily":
                        this.cursiveFontFamily = (String) value;
                        break;
                    case "mediaPlaybackRequiresUserGesture":
                        this.mediaPlaybackRequiresUserGesture = (Boolean) value;
                        break;
                    case "blockNetworkImage":
                        this.blockNetworkImage = (Boolean) value;
                        break;
                    case "blockNetworkLoads":
                        this.blockNetworkLoads = (Boolean) value;
                        break;
                    case "userAgent":
                        this.userAgent = (String) value;
                        break;
                    case "useOnRenderProcessGone":
                        this.useOnRenderProcessGone = (Boolean) value;
                        break;
                    case "useOnLoadResource":
                        this.useOnLoadResource = (Boolean) value;
                        break;
                    case "cacheEnabled":
                        this.cacheEnabled = (Boolean) value;
                        break;
                    case "saveFormData":
                        this.saveFormData = (Boolean) value;
                        break;
                    case "requestedWithHeaderOriginAllowList":
                        this.requestedWithHeaderOriginAllowList = new HashSet((List) value);
                        break;
                    case "useHybridComposition":
                        this.useHybridComposition = (Boolean) value;
                        break;
                    case "applicationNameForUserAgent":
                        this.applicationNameForUserAgent = (String) value;
                        break;
                    case "mixedContentMode":
                        this.mixedContentMode = (Integer) value;
                        break;
                    case "scrollBarFadeDuration":
                        this.scrollBarFadeDuration = (Integer) value;
                        break;
                    case "allowFileAccess":
                        this.allowFileAccess = (Boolean) value;
                        break;
                    case "appCachePath":
                        this.appCachePath = (String) value;
                        break;
                    case "horizontalScrollbarThumbColor":
                        this.horizontalScrollbarThumbColor = (String) value;
                        break;
                    case "standardFontFamily":
                        this.standardFontFamily = (String) value;
                        break;
                    case "displayZoomControls":
                        this.displayZoomControls = (Boolean) value;
                        break;
                    case "geolocationEnabled":
                        this.geolocationEnabled = (Boolean) value;
                        break;
                    case "loadWithOverviewMode":
                        this.loadWithOverviewMode = (Boolean) value;
                        break;
                    case "safeBrowsingEnabled":
                        this.safeBrowsingEnabled = (Boolean) value;
                        break;
                    case "serifFontFamily":
                        this.serifFontFamily = (String) value;
                        break;
                    case "verticalScrollbarThumbColor":
                        this.verticalScrollbarThumbColor = (String) value;
                        break;
                    case "forceDark":
                        this.forceDark = (Integer) value;
                        break;
                    case "disableDefaultErrorPage":
                        this.disableDefaultErrorPage = (Boolean) value;
                        break;
                    case "contentBlockers":
                        this.contentBlockers = (List) value;
                        break;
                    case "supportMultipleWindows":
                        this.supportMultipleWindows = (Boolean) value;
                        break;
                    case "defaultFixedFontSize":
                        this.defaultFixedFontSize = (Integer) value;
                        break;
                    case "thirdPartyCookiesEnabled":
                        this.thirdPartyCookiesEnabled = (Boolean) value;
                        break;
                    case "minimumLogicalFontSize":
                        this.minimumLogicalFontSize = (Integer) value;
                        break;
                    case "verticalScrollBarEnabled":
                        this.verticalScrollBarEnabled = (Boolean) value;
                        break;
                    case "clearSessionCache":
                        this.clearSessionCache = (Boolean) value;
                        break;
                    case "defaultVideoPoster":
                        this.defaultVideoPoster = (byte[]) value;
                        break;
                    case "algorithmicDarkeningAllowed":
                        this.algorithmicDarkeningAllowed = (Boolean) value;
                        break;
                }
            }
        }
        return this;
    }
}
