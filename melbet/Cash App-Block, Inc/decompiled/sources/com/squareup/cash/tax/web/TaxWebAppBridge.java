package com.squareup.cash.tax.web;

import android.app.Activity;
import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.emoji2.text.MetadataRepo;
import androidx.media3.extractor.ChunkIndexMerger;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.webkit.WebViewClientCompat;
import androidx.webkit.WebViewFeature;
import androidx.webkit.internal.WebSettingsNoOpAdapter;
import androidx.webkit.internal.WebViewFeatureInternal;
import androidx.webkit.internal.WebViewGlueCommunicator;
import app.cash.api.ApiResult;
import app.cash.broadway.presenter.Presenter;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.screen.Screen;
import app.cash.redwood.treehouse.TreehouseAppContent;
import app.cash.zipline.ZiplineManifest;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.c7$$ExternalSyntheticLambda6;
import com.fillr.n;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.firebase.messaging.RemoteMessage;
import com.nimbusds.jose.util.X509CertUtils;
import com.squareup.cash.R;
import com.squareup.cash.VariantSandboxedComponent;
import com.squareup.cash.common.web.WebAppBridge;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.js.ZiplineHistoryDataJavaScripter;
import com.squareup.cash.data.transfers.RealTransferManager;
import com.squareup.cash.data.transfers.TransferManager;
import com.squareup.cash.db2.activity.CashActivity;
import com.squareup.cash.downloadmanager.android.AndroidDownloadManager$Factory$Impl;
import com.squareup.cash.google.pay.payments.api.GooglePayPaymentsClient;
import com.squareup.cash.google.pay.payments.real.RealGooglePayPaymentsClient;
import com.squareup.cash.history.views.PaymentPasscodeDialogView;
import com.squareup.cash.invitations.InviteErrorPresenter;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.nearby.views.PulsingState$$ExternalSyntheticLambda1;
import com.squareup.cash.permissions.AndroidPermissionManager;
import com.squareup.cash.profile.presenters.ErrorPresenter;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.sharesheet.ShareSheetPresenter;
import com.squareup.cash.shopping.web.ShoppingWebChromeClient;
import com.squareup.cash.storage.AndroidFileProvider;
import com.squareup.cash.storage.RealStorage;
import com.squareup.cash.storage.Storage;
import com.squareup.cash.support.chat.views.ChatInputView$Content$1$1$1;
import com.squareup.cash.support.chat.views.ChatView$30$1;
import com.squareup.cash.tabs.views.ToolbarTuckTargets;
import com.squareup.cash.taptopay.backend.real.RealTagCommunication;
import com.squareup.cash.tax.applets.presenters.RealTaxesAppletTileRepository;
import com.squareup.cash.tax.presenters.RealTaxDesktopTooltipPreference;
import com.squareup.cash.tax.presenters.TaxAuthorizationPresenter;
import com.squareup.cash.tax.presenters.TaxReturnsPresenter;
import com.squareup.cash.tax.presenters.TaxWebAppPresenter;
import com.squareup.cash.tax.primitives.Id;
import com.squareup.cash.tax.primitives.TaxDialogDataModel;
import com.squareup.cash.tax.primitives.TaxToolbarConfig;
import com.squareup.cash.tax.screens.TaxTooltipScreen;
import com.squareup.cash.tax.service.TaxExperienceService;
import com.squareup.cash.tax.viewmodels.TaxBridgeCommand;
import com.squareup.cash.tax.viewmodels.TaxWebAppBridgeEvent;
import com.squareup.cash.tax.viewmodels.TaxWebAppViewEvent;
import com.squareup.cash.tax.viewmodels.TaxWebAppViewModel$PresenterHandledCommandResponse$NativeDeepLinkResult;
import com.squareup.cash.tax.viewmodels.WebViewState;
import com.squareup.cash.threedsdataonly.presenters.ThreeDsPresenter;
import com.squareup.cash.transactionpicker.blocker.presenters.UnifiedActivityPickerBlockerPresenter;
import com.squareup.cash.transactionpicker.presenters.RealTransactionLoader$getTransactions$1$1$1;
import com.squareup.cash.transfers.presenters.AddMoneyPresenter;
import com.squareup.cash.transfers.presenters.InstrumentDetailsPresenter;
import com.squareup.cash.transfers.presenters.SetDefaultInstrumentPresenter;
import com.squareup.cash.transfers.views.BalanceBasedAutoReloadConfirmationView;
import com.squareup.cash.treehouse.activity.ActivityDataBridge;
import com.squareup.cash.treehouse.activity.SerializableActivityItem;
import com.squareup.cash.treehouse.android.platform.CashTreehouseLayout;
import com.squareup.cash.treehouse.discover.HostDiscoverDataBridge;
import com.squareup.cash.treehouse.network.HttpClient;
import com.squareup.cash.ui.MainContainerDelegate;
import com.squareup.cash.ui.gcm.SuspendingFirebaseMessagingService;
import com.squareup.cash.ui.widget.amount.AnimatedDigitState;
import com.squareup.cash.util.RealDrawerOpener$getDrawerScreen$$inlined$map$1;
import com.squareup.cash.wallet.presenters.CardSchemePresenter;
import com.squareup.cash.work.presenters.WorkHomePresenter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.squareup.protos.cash.cashtes.app.v1beta1.UserData2Request;
import com.squareup.protos.cash.cashtes.app.v1beta1.UserData2Response;
import com.squareup.protos.cash.tax.TaxWebBridgeBackButtonTapEventRequest;
import com.squareup.protos.cash.tax.TaxWebBridgeCloseButtonTapEventRequest;
import com.squareup.protos.cash.tax.TaxWebBridgeConfigureToolbarEventRequest;
import com.squareup.protos.cash.tax.TaxWebBridgeConfigureToolbarEventResponse;
import com.squareup.protos.cash.tax.TaxWebBridgeDesktopButtonTapEventRequest;
import com.squareup.protos.cash.tax.TaxWebBridgeDialog;
import com.squareup.protos.cash.tax.TaxWebBridgeDialogButtonTapEventRequest;
import com.squareup.protos.cash.tax.TaxWebBridgeEvent;
import com.squareup.protos.cash.tax.TaxWebBridgeExitEventResponse;
import com.squareup.protos.cash.tax.TaxWebBridgeHelpButtonTapEventRequest;
import com.squareup.protos.cash.tax.TaxWebBridgeMenuButtonTapEventRequest;
import com.squareup.protos.cash.tax.TaxWebBridgeMenuButtonTapEventResponse;
import com.squareup.protos.cash.tax.TaxWebBridgeMenuItemTapEventRequest;
import com.squareup.protos.cash.tax.TaxWebBridgeNativeDeepLinkEventRequest;
import com.squareup.protos.cash.tax.TaxWebBridgeNativeDeepLinkEventResponse;
import com.squareup.protos.cash.tax.TaxWebBridgeOpenTaxEventRequest;
import com.squareup.protos.cash.tax.TaxWebBridgeOpenTaxEventResponse;
import com.squareup.protos.cash.tax.TaxWebBridgeRequest;
import com.squareup.protos.cash.tax.TaxWebBridgeResponse;
import com.squareup.protos.cash.tax.TaxWebBridgeShowDialogEventRequest;
import com.squareup.protos.cash.tax.TaxWebBridgeShowDialogEventResponse;
import com.squareup.protos.cash.tax.TaxWebBridgeWebClientReadyEventRequest;
import com.squareup.protos.cash.tax.TaxWebBridgeWebClientReadyEventResponse;
import com.squareup.thing.Thing;
import com.squareup.util.android.ActivityResult;
import com.squareup.util.android.Intents;
import com.squareup.util.coroutines.BufferCountKt$bufferSkip$1;
import com.squareup.wire.WireJsonAdapterFactory;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import io.noties.markwon.MarkwonConfiguration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatcherMatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.ReadonlySharedFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.internal.ContextScope;
import okio.ByteString;
import okio.Path;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import papa.Handlers$$ExternalSyntheticBUOutline0;
import papa.PapaEvent;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes7.dex */
public final class TaxWebAppBridge implements WebAppBridge {
    public final Activity activity;
    public final String cashUserAgent;
    public Path currentTakePhotoPath;
    public final ArrayList downloadIds;
    public final n downloadManager;
    public final AndroidFileProvider fileProvider;
    public final Map headers;
    public boolean isWebBridgeLoaded;
    public final ChunkIndexMerger javascriptBridgeIdStore;
    public WebMessagePort javascriptEventPort;
    public String lastUrlLoaded;
    public final IntentLauncher launcher;
    public final AndroidPermissionManager permissionManager;
    public final Lazy scope$delegate;
    public final Storage storage;
    public final AndroidStringManager stringManager;
    public final List supportedImageMimes;
    public final TaxUrlsAllowlistMatcher taxUrlsAllowlistMatcher;
    public final JsonAdapter taxWebBridgeEventAdapter;
    public TaxToolbarConfig toolbarConfig;
    public final BufferedChannel webEvents;
    public final WebView webview;
    public ValueCallback webviewUploadCallback;
    public final List wildcardMime;

    public final class TaxDownloadListener implements DownloadListener {
        public TaxDownloadListener() {
        }

        @Override // android.webkit.DownloadListener
        public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
            MatcherMatchResult find;
            String value;
            if (str != null) {
                if (str4 == null) {
                    str4 = "*/*";
                }
                TaxWebAppBridge taxWebAppBridge = TaxWebAppBridge.this;
                String m1148m = (str3 == null || (find = new Regex("filename=\"(.+)\"").find(str3)) == null || (value = find.getValue()) == null) ? taxWebAppBridge.stringManager.get(R.string.tax_web_default_pdf_filename) : Boxes$$ExternalSyntheticOutline1.m1148m(1, 10, value);
                Map mapOf = MapsKt__MapsJVMKt.mapOf(new Pair("Cookie", CookieManager.getInstance().getCookie(str)));
                m1148m.getClass();
                mapOf.getClass();
                n nVar = taxWebAppBridge.downloadManager;
                nVar.getClass();
                DownloadManager downloadManager = (DownloadManager) nVar.c;
                DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
                request.setMimeType(str4);
                for (Map.Entry entry : mapOf.entrySet()) {
                    request.addRequestHeader((String) entry.getKey(), (String) entry.getValue());
                }
                request.setNotificationVisibility(1);
                request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, m1148m);
                taxWebAppBridge.downloadIds.add(Long.valueOf(downloadManager.enqueue(request)));
            }
        }
    }

    public final class TaxJavascriptBridgeListener extends WebMessagePort.WebMessageCallback {
        public TaxJavascriptBridgeListener() {
        }

        @Override // android.webkit.WebMessagePort.WebMessageCallback
        public final void onMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
            TaxWebAppBridge taxWebAppBridge = TaxWebAppBridge.this;
            super.onMessage(webMessagePort, webMessage);
            String data = webMessage != null ? webMessage.getData() : null;
            if (data == null || StringsKt.isBlank(data)) {
                return;
            }
            try {
                TaxWebBridgeEvent taxWebBridgeEvent = (TaxWebBridgeEvent) taxWebAppBridge.taxWebBridgeEventAdapter.fromJson(data);
                if (taxWebBridgeEvent != null) {
                    TaxWebAppBridge.access$handleTaxWebBridgeEventFromWebPage(taxWebAppBridge, taxWebBridgeEvent);
                }
            } catch (JsonDataException e) {
                Timber.Forest.e(e);
            }
        }
    }

    public final class TaxWebViewClient extends WebViewClientCompat {
        public TaxWebViewClient() {
        }

        @Override // android.webkit.WebViewClient
        public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
            super.doUpdateVisitedHistory(webView, str, z);
            Timber.Forest.d(Recorder$$ExternalSyntheticOutline2.m("React Page Loaded via doUpdateVisitedHistory: ", str), new Object[0]);
            TaxWebAppBridge taxWebAppBridge = TaxWebAppBridge.this;
            taxWebAppBridge.lastUrlLoaded = str;
            TaxToolbarConfig taxToolbarConfig = taxWebAppBridge.toolbarConfig;
            if (taxToolbarConfig != null) {
                JobKt.launch$default(taxWebAppBridge.getScope(), null, null, new AnonymousClass3(taxWebAppBridge, (Object) taxToolbarConfig, (Continuation) null, 6), 3);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            Timber.Forest.d(Recorder$$ExternalSyntheticOutline2.m("Page load finished: ", str), new Object[0]);
            TaxWebAppBridge taxWebAppBridge = TaxWebAppBridge.this;
            taxWebAppBridge.lastUrlLoaded = str;
            WebView webView2 = taxWebAppBridge.webview;
            WebMessagePort[] createWebMessageChannel = webView2.createWebMessageChannel();
            createWebMessageChannel.getClass();
            WebMessagePort webMessagePort = createWebMessageChannel[0];
            taxWebAppBridge.javascriptEventPort = webMessagePort;
            if (webMessagePort != null) {
                webMessagePort.setWebMessageCallback(taxWebAppBridge.new TaxJavascriptBridgeListener());
            }
            webView2.postWebMessage(new WebMessage(taxWebAppBridge.cashUserAgent, new WebMessagePort[]{createWebMessageChannel[1]}), Uri.EMPTY);
            JobKt.launch$default(taxWebAppBridge.getScope(), null, null, new AnonymousClass2(taxWebAppBridge, null, 2), 3);
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            Timber.Forest.d(Recorder$$ExternalSyntheticOutline2.m("Page load started: ", str), new Object[0]);
            TaxWebAppBridge taxWebAppBridge = TaxWebAppBridge.this;
            taxWebAppBridge.isWebBridgeLoaded = false;
            JobKt.launch$default(taxWebAppBridge.getScope(), null, null, new AnonymousClass2(taxWebAppBridge, null, 3), 3);
        }

        @Override // android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
        public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            webView.getClass();
            webResourceRequest.getClass();
            TaxWebAppBridge taxWebAppBridge = TaxWebAppBridge.this;
            TaxUrlsAllowlistMatcher taxUrlsAllowlistMatcher = taxWebAppBridge.taxUrlsAllowlistMatcher;
            String uri = webResourceRequest.getUrl().toString();
            taxUrlsAllowlistMatcher.getClass();
            if (uri != null) {
                List list = TaxUrlsAllowlist.allowedPatterns;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (((Regex) it.next()).matches(uri)) {
                            return false;
                        }
                    }
                }
                ArrayList arrayList = taxUrlsAllowlistMatcher.serverSentPatterns;
                if (arrayList == null || !arrayList.isEmpty()) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        if (((Regex) it2.next()).matches(uri)) {
                            return false;
                        }
                    }
                }
            }
            JobKt.launch$default(taxWebAppBridge.getScope(), null, null, new AnonymousClass3(taxWebAppBridge, (Object) webResourceRequest, (Continuation) null, 7), 3);
            return true;
        }
    }

    /* loaded from: classes8.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TaxWebBridgeResponse.Status.values().length];
            try {
                iArr[TaxWebBridgeResponse.Status.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TaxWebBridgeResponse.Status.INVALID_REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public TaxWebAppBridge(String str, Map map, WebView webView, IntentLauncher intentLauncher, Activity activity, AndroidStringManager androidStringManager, AndroidPermissionManager androidPermissionManager, Storage storage, AndroidFileProvider androidFileProvider, AndroidDownloadManager$Factory$Impl androidDownloadManager$Factory$Impl, Flow flow, Flow flow2, ContextScope contextScope) {
        Configuration configuration;
        n.b webSettingsNoOpAdapter;
        map.getClass();
        this.cashUserAgent = str;
        this.headers = map;
        this.webview = webView;
        this.launcher = intentLauncher;
        this.activity = activity;
        this.stringManager = androidStringManager;
        this.permissionManager = androidPermissionManager;
        this.storage = storage;
        this.fileProvider = androidFileProvider;
        this.downloadManager = androidDownloadManager$Factory$Impl.create$1(contextScope);
        this.taxUrlsAllowlistMatcher = new TaxUrlsAllowlistMatcher();
        int i = 0;
        this.scope$delegate = LazyKt.lazy(new TaxWebAppBridge$$ExternalSyntheticLambda0(i, contextScope, this));
        this.javascriptBridgeIdStore = new ChunkIndexMerger(2);
        Continuation continuation = null;
        BufferedChannel Channel$default = PapaEvent.Channel$default(-1, null, null, 6);
        this.downloadIds = new ArrayList();
        Moshi.Builder builder = new Moshi.Builder();
        builder.add((JsonAdapter.Factory) new WireJsonAdapterFactory());
        this.taxWebBridgeEventAdapter = new Moshi(builder).adapter(TaxWebBridgeEvent.class, Util.NO_ANNOTATIONS, null);
        this.supportedImageMimes = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"image/jpeg", "image/jpg", "image/png"});
        this.wildcardMime = CollectionsKt__CollectionsJVMKt.listOf("*/*");
        WebSettings settings = webView.getSettings();
        int i2 = 1;
        settings.setUseWideViewPort(true);
        settings.setJavaScriptEnabled(true);
        settings.setAllowFileAccess(true);
        settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.TEXT_AUTOSIZING);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setUserAgentString(str);
        if (WebViewFeature.isFeatureSupported("FORCE_DARK_STRATEGY")) {
            if (!WebViewFeatureInternal.FORCE_DARK_STRATEGY.isSupportedByWebView()) {
                throw WebViewFeatureInternal.getUnsupportedOperationException();
            }
            try {
                webSettingsNoOpAdapter = new n.b((WebSettingsBoundaryInterface) X509CertUtils.castToSuppLibClass(WebSettingsBoundaryInterface.class, ((WebkitToCompatConverterBoundaryInterface) WebViewGlueCommunicator.LAZY_COMPAT_CONVERTER_HOLDER.INSTANCE.a).convertSettings(settings)), i2);
            } catch (ClassCastException e) {
                if (Build.VERSION.SDK_INT != 30 || !"android.webkit.WebSettingsWrapper".equals(settings.getClass().getCanonicalName())) {
                    throw e;
                }
                Log.e("WebSettingsCompat", "Error converting WebSettings to Chrome implementation. All AndroidX method calls on this WebSettings instance will be no-op calls. See https://crbug.com/388824130 for more info.", e);
                webSettingsNoOpAdapter = new WebSettingsNoOpAdapter(continuation, i2);
            }
            webSettingsNoOpAdapter.setForceDarkStrategy();
        }
        if (WebViewFeature.isFeatureSupported("FORCE_DARK")) {
            Resources resources = webView.getContext().getResources();
            Integer valueOf = (resources == null || (configuration = resources.getConfiguration()) == null) ? null : Integer.valueOf(configuration.uiMode & 48);
            if (valueOf != null && valueOf.intValue() == 32) {
                WebViewFeatureInternal.FORCE_DARK.getClass();
                settings.setForceDark(2);
            } else if (valueOf != null && valueOf.intValue() == 16) {
                WebViewFeatureInternal.FORCE_DARK.getClass();
                settings.setForceDark(0);
            } else if (valueOf != null && valueOf.intValue() == 0) {
                WebViewFeatureInternal.FORCE_DARK.getClass();
                settings.setForceDark(0);
            }
        }
        webView.setWebViewClient(new TaxWebViewClient());
        webView.setWebChromeClient(new ShoppingWebChromeClient(this, i2));
        webView.setDownloadListener(new TaxDownloadListener());
        webView.setOverScrollMode(2);
        JobKt.launch$default(contextScope, null, null, new AnonymousClass2(this, continuation, i), 3);
        JobKt.launch$default(contextScope, null, null, new AnonymousClass3(flow2, this, continuation, i), 3);
        JobKt.launch$default(contextScope, null, null, new AnonymousClass4(flow, this, continuation, i), 3);
        JobKt.launch$default(contextScope, null, null, new AnonymousClass2(this, continuation, i2), 3);
        this.webEvents = Channel$default;
    }

    public static final void access$handleTaxWebBridgeEventFromWebPage(TaxWebAppBridge taxWebAppBridge, TaxWebBridgeEvent taxWebBridgeEvent) {
        TaxWebBridgeConfigureToolbarEventRequest.ToolbarItemType toolbarItemType;
        TaxWebBridgeEvent taxWebBridgeResponseEvent;
        Object obj;
        String str = taxWebBridgeEvent.id;
        if (str == null) {
            Handlers$$ExternalSyntheticBUOutline0.m(taxWebBridgeEvent, "TaxWebBridgeEvent is missing the id: ");
            return;
        }
        TaxWebBridgeEvent.Event event = taxWebBridgeEvent.event;
        Continuation continuation = null;
        if (event != null) {
            TaxWebBridgeEvent.Event.Request request = event instanceof TaxWebBridgeEvent.Event.Request ? (TaxWebBridgeEvent.Event.Request) event : null;
            TaxWebBridgeRequest value = request != null ? request.getValue() : null;
            if (value != null) {
                TaxWebBridgeRequest.Request request2 = value.request;
                int i = 4;
                if (request2 != null) {
                    TaxWebBridgeRequest.Request.ExitEventRequest exitEventRequest = request2 instanceof TaxWebBridgeRequest.Request.ExitEventRequest ? (TaxWebBridgeRequest.Request.ExitEventRequest) request2 : null;
                    if ((exitEventRequest != null ? exitEventRequest.getValue() : null) != null) {
                        CoroutineScope scope = taxWebAppBridge.getScope();
                        scope.getClass();
                        JobKt.launch$default(scope, null, null, new AnonymousClass2(taxWebAppBridge, continuation, i), 3);
                        taxWebAppBridge.sendTaxWebViewBridgeEvent(TaxWebBridgeOneofsKt.taxWebBridgeResponseEvent(str, TaxWebBridgeOneofsKt.taxWebBridgeResponse(TaxWebBridgeResponse.Status.SUCCESS, new TaxWebBridgeResponse.Response.ExitEventResponse(new TaxWebBridgeExitEventResponse(ByteString.EMPTY)))));
                        return;
                    }
                }
                TaxWebBridgeRequest.Request request3 = value.request;
                if (request3 != null) {
                    TaxWebBridgeRequest.Request.WebClientReadyEventRequest webClientReadyEventRequest = request3 instanceof TaxWebBridgeRequest.Request.WebClientReadyEventRequest ? (TaxWebBridgeRequest.Request.WebClientReadyEventRequest) request3 : null;
                    TaxWebBridgeWebClientReadyEventRequest value2 = webClientReadyEventRequest != null ? webClientReadyEventRequest.getValue() : null;
                    if (value2 != null) {
                        for (String str2 : value2.allowlist_regex_patterns) {
                            TaxUrlsAllowlistMatcher taxUrlsAllowlistMatcher = taxWebAppBridge.taxUrlsAllowlistMatcher;
                            taxUrlsAllowlistMatcher.getClass();
                            str2.getClass();
                            ArrayList arrayList = taxUrlsAllowlistMatcher.serverSentPatterns;
                            Iterator it = arrayList.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    obj = null;
                                    break;
                                }
                                obj = it.next();
                                String pattern = ((Regex) obj).nativePattern.pattern();
                                pattern.getClass();
                                if (pattern.equals(str2)) {
                                    break;
                                }
                            }
                            if (obj == null) {
                                arrayList.add(new Regex(str2));
                            }
                        }
                        taxWebAppBridge.isWebBridgeLoaded = true;
                        taxWebAppBridge.sendTaxWebViewBridgeEvent(TaxWebBridgeOneofsKt.taxWebBridgeResponseEvent(str, TaxWebBridgeOneofsKt.taxWebBridgeResponse(TaxWebBridgeResponse.Status.SUCCESS, new TaxWebBridgeResponse.Response.WebClientReadyEventResponse(new TaxWebBridgeWebClientReadyEventResponse(null, ByteString.EMPTY)))));
                        return;
                    }
                }
                TaxWebBridgeRequest.Request request4 = value.request;
                if (request4 != null) {
                    TaxWebBridgeRequest.Request.ShowDialogEventRequest showDialogEventRequest = request4 instanceof TaxWebBridgeRequest.Request.ShowDialogEventRequest ? (TaxWebBridgeRequest.Request.ShowDialogEventRequest) request4 : null;
                    TaxWebBridgeShowDialogEventRequest value3 = showDialogEventRequest != null ? showDialogEventRequest.getValue() : null;
                    if (value3 != null) {
                        CoroutineScope scope2 = taxWebAppBridge.getScope();
                        scope2.getClass();
                        TaxWebBridgeDialog taxWebBridgeDialog = value3.dialog;
                        if (taxWebBridgeDialog != null) {
                            JobKt.launch$default(scope2, null, null, new AnonymousClass3(taxWebAppBridge, (Object) taxWebBridgeDialog, continuation, 11), 3);
                            taxWebBridgeResponseEvent = TaxWebBridgeOneofsKt.taxWebBridgeResponseEvent(str, TaxWebBridgeOneofsKt.taxWebBridgeResponse(TaxWebBridgeResponse.Status.SUCCESS, new TaxWebBridgeResponse.Response.ShowDialogEventResponse(new TaxWebBridgeShowDialogEventResponse(ByteString.EMPTY))));
                        } else {
                            taxWebBridgeResponseEvent = TaxWebBridgeOneofsKt.taxWebBridgeResponseEvent(str, TaxWebBridgeOneofsKt.taxWebBridgeResponse(TaxWebBridgeResponse.Status.INVALID_REQUEST, null));
                        }
                        taxWebAppBridge.sendTaxWebViewBridgeEvent(taxWebBridgeResponseEvent);
                        return;
                    }
                }
                TaxWebBridgeRequest.Request request5 = value.request;
                if (request5 != null) {
                    TaxWebBridgeRequest.Request.OpenTaxEventRequest openTaxEventRequest = request5 instanceof TaxWebBridgeRequest.Request.OpenTaxEventRequest ? (TaxWebBridgeRequest.Request.OpenTaxEventRequest) request5 : null;
                    TaxWebBridgeOpenTaxEventRequest value4 = openTaxEventRequest != null ? openTaxEventRequest.getValue() : null;
                    if (value4 != null) {
                        TaxWebBridgeEvent taxWebBridgeResponseEvent2 = TaxWebBridgeOneofsKt.taxWebBridgeResponseEvent(str, TaxWebBridgeOneofsKt.taxWebBridgeResponse(TaxWebBridgeResponse.Status.SUCCESS, new TaxWebBridgeResponse.Response.OpenTaxEventResponse(new TaxWebBridgeOpenTaxEventResponse(ByteString.EMPTY))));
                        Pair pair = new Pair(taxWebBridgeResponseEvent2, new TaxWebAppBridgeEvent.OpenTaxesFlowLoadingScreen(value4.deep_link_url));
                        taxWebAppBridge.sendTaxWebViewBridgeEvent(taxWebBridgeResponseEvent2);
                        JobKt.launch$default(taxWebAppBridge.getScope(), null, null, new AnonymousClass3(taxWebAppBridge, (Object) pair, continuation, 9), 3);
                        return;
                    }
                }
                TaxWebBridgeRequest.Request request6 = value.request;
                if (request6 != null) {
                    TaxWebBridgeRequest.Request.ConfigureToolbarEventRequest configureToolbarEventRequest = request6 instanceof TaxWebBridgeRequest.Request.ConfigureToolbarEventRequest ? (TaxWebBridgeRequest.Request.ConfigureToolbarEventRequest) request6 : null;
                    TaxWebBridgeConfigureToolbarEventRequest value5 = configureToolbarEventRequest != null ? configureToolbarEventRequest.getValue() : null;
                    if (value5 != null) {
                        CoroutineScope scope3 = taxWebAppBridge.getScope();
                        scope3.getClass();
                        JobKt.launch$default(scope3, null, null, new AnonymousClass3(value5, taxWebAppBridge, continuation, 12), 3);
                        TaxWebBridgeResponse.Status status = TaxWebBridgeResponse.Status.SUCCESS;
                        TaxToolbarConfig.ToolbarItem[] values = TaxToolbarConfig.ToolbarItem.values();
                        ArrayList arrayList2 = new ArrayList(values.length);
                        for (TaxToolbarConfig.ToolbarItem toolbarItem : values) {
                            int ordinal = toolbarItem.ordinal();
                            if (ordinal == 0) {
                                toolbarItemType = TaxWebBridgeConfigureToolbarEventRequest.ToolbarItemType.BACK;
                            } else if (ordinal == 1) {
                                toolbarItemType = TaxWebBridgeConfigureToolbarEventRequest.ToolbarItemType.HELP;
                            } else if (ordinal == 2) {
                                toolbarItemType = TaxWebBridgeConfigureToolbarEventRequest.ToolbarItemType.MENU;
                            } else if (ordinal == 3) {
                                toolbarItemType = TaxWebBridgeConfigureToolbarEventRequest.ToolbarItemType.CLOSE;
                            } else {
                                if (ordinal != 4) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return;
                                }
                                toolbarItemType = TaxWebBridgeConfigureToolbarEventRequest.ToolbarItemType.DESKTOP;
                            }
                            arrayList2.add(toolbarItemType);
                        }
                        taxWebAppBridge.sendTaxWebViewBridgeEvent(TaxWebBridgeOneofsKt.taxWebBridgeResponseEvent(str, TaxWebBridgeOneofsKt.taxWebBridgeResponse(status, new TaxWebBridgeResponse.Response.ConfigureToolbarEventResponse(new TaxWebBridgeConfigureToolbarEventResponse(arrayList2, ByteString.EMPTY)))));
                        return;
                    }
                }
                TaxWebBridgeRequest.Request request7 = value.request;
                if (request7 != null) {
                    TaxWebBridgeRequest.Request.NativeDeepLinkEventRequest nativeDeepLinkEventRequest = request7 instanceof TaxWebBridgeRequest.Request.NativeDeepLinkEventRequest ? (TaxWebBridgeRequest.Request.NativeDeepLinkEventRequest) request7 : null;
                    TaxWebBridgeNativeDeepLinkEventRequest value6 = nativeDeepLinkEventRequest != null ? nativeDeepLinkEventRequest.getValue() : null;
                    if (value6 != null) {
                        JobKt.launch$default(taxWebAppBridge.getScope(), null, null, new AnonymousClass4(taxWebAppBridge, value6, str, (Continuation) null), 3);
                        return;
                    }
                }
                taxWebAppBridge.sendTaxWebViewBridgeEvent(TaxWebBridgeOneofsKt.taxWebBridgeResponseEvent(str, TaxWebBridgeOneofsKt.taxWebBridgeResponse(TaxWebBridgeResponse.Status.INVALID_REQUEST, null)));
                return;
            }
        }
        TaxWebBridgeEvent.Event event2 = taxWebBridgeEvent.event;
        if (event2 != null) {
            TaxWebBridgeEvent.Event.Response response = event2 instanceof TaxWebBridgeEvent.Event.Response ? (TaxWebBridgeEvent.Event.Response) event2 : null;
            TaxWebBridgeResponse value7 = response != null ? response.getValue() : null;
            if (value7 != null) {
                ChunkIndexMerger chunkIndexMerger = taxWebAppBridge.javascriptBridgeIdStore;
                chunkIndexMerger.getClass();
                String str3 = taxWebBridgeEvent.id;
                if (str3 == null || chunkIndexMerger.chunkMap.remove(str3) == null) {
                    Timber.Forest.e("Invalid TaxWebBridgeEvent ID when handling the web page response", new Object[0]);
                    return;
                }
                TaxWebBridgeResponse.Status status2 = value7.status;
                int i2 = status2 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[status2.ordinal()];
                if (i2 != -1) {
                    if (i2 == 1) {
                        TaxWebBridgeResponse.Response response2 = value7.response;
                        if (response2 != null) {
                            TaxWebBridgeResponse.Response.MenuButtonTapEventResponse menuButtonTapEventResponse = response2 instanceof TaxWebBridgeResponse.Response.MenuButtonTapEventResponse ? (TaxWebBridgeResponse.Response.MenuButtonTapEventResponse) response2 : null;
                            TaxWebBridgeMenuButtonTapEventResponse value8 = menuButtonTapEventResponse != null ? menuButtonTapEventResponse.getValue() : null;
                            if (value8 != null) {
                                JobKt.launch$default(taxWebAppBridge.getScope(), null, null, new AnonymousClass3(taxWebAppBridge, (Object) value8, continuation, 8), 3);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (i2 != 2) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                }
                Timber.Forest.w(new IllegalStateException("Cash App Android sent something wrong over the tax bridge. " + value7));
                return;
            }
        }
        OptionalProvider$$ExternalSyntheticLambda0.m$1(taxWebBridgeEvent, "TaxWebBridgeEvent sent incorrect data: ");
    }

    public final CoroutineScope getScope() {
        return (CoroutineScope) this.scope$delegate.getValue();
    }

    @Override // com.squareup.cash.common.web.WebAppBridge
    public final ReceiveChannel getWebEvents() {
        return this.webEvents;
    }

    @Override // com.squareup.cash.common.web.WebAppBridge
    public final void loadUrl(String str) {
        str.getClass();
        Timber.Forest.d("Load Tax url: ".concat(str), new Object[0]);
        this.webview.loadUrl(str, this.headers);
    }

    public final void openPhotoGallery(List list) {
        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
        intent.setType("*/*");
        intent.putExtra("android.intent.extra.MIME_TYPES", (String[]) list.toArray(new String[0]));
        intent.addCategory("android.intent.category.OPENABLE");
        intent.addFlags(1);
        if (Intents.maybeStartActivityForResult(this.activity, intent, 7)) {
            return;
        }
        ValueCallback valueCallback = this.webviewUploadCallback;
        if (valueCallback != null) {
            valueCallback.onReceiveValue(null);
        }
        this.webviewUploadCallback = null;
    }

    public final void sendTaxWebViewBridgeEvent(TaxWebBridgeEvent taxWebBridgeEvent) {
        try {
            String json = this.taxWebBridgeEventAdapter.toJson(taxWebBridgeEvent);
            Timber.Forest.d(json, new Object[0]);
            WebMessagePort webMessagePort = this.javascriptEventPort;
            if (webMessagePort != null) {
                webMessagePort.postMessage(new WebMessage(json));
            }
        } catch (Exception e) {
            Timber.Forest.e(e);
        }
    }

    public final void sendTaxWebViewBridgeRequest(TaxWebBridgeRequest taxWebBridgeRequest) {
        ChunkIndexMerger chunkIndexMerger = this.javascriptBridgeIdStore;
        chunkIndexMerger.getClass();
        String uuid = UUID.randomUUID().toString();
        uuid.getClass();
        chunkIndexMerger.chunkMap.put(uuid, taxWebBridgeRequest);
        sendTaxWebViewBridgeEvent(new TaxWebBridgeEvent(uuid, new TaxWebBridgeEvent.Event.Request(taxWebBridgeRequest)));
    }

    @Override // com.squareup.cash.common.web.WebAppBridge
    public final void sendWebCommand(TaxBridgeCommand taxBridgeCommand) {
        TaxWebBridgeRequest taxWebBridgeRequest;
        ValueCallback valueCallback;
        taxBridgeCommand.getClass();
        if (taxBridgeCommand instanceof TaxBridgeCommand.MenuItemTapCommand) {
            Id id = ((TaxBridgeCommand.MenuItemTapCommand) taxBridgeCommand).taxMenuItem;
            if (id instanceof Id.JavascriptMenuItem) {
                String str = ((Id.JavascriptMenuItem) id).id;
                ByteString byteString = ByteString.EMPTY;
                sendTaxWebViewBridgeRequest(new TaxWebBridgeRequest(new TaxWebBridgeRequest.Request.MenuItemTapEventRequest(new TaxWebBridgeMenuItemTapEventRequest(str, byteString)), byteString));
                return;
            }
            if (Intrinsics.areEqual(id, Id.PhotoGallery.INSTANCE)) {
                openPhotoGallery(this.supportedImageMimes);
                return;
            }
            if (Intrinsics.areEqual(id, Id.BrowseWildcard.INSTANCE)) {
                openPhotoGallery(this.wildcardMime);
                return;
            }
            Continuation continuation = null;
            if (Intrinsics.areEqual(id, Id.TakePhoto.INSTANCE)) {
                JobKt.launch$default(getScope(), null, null, new AnonymousClass3(this, (Object) new String[]{"android.permission.CAMERA"}, continuation, 10), 3);
                return;
            } else {
                if (!Intrinsics.areEqual(id, Id.Close.INSTANCE) || (valueCallback = this.webviewUploadCallback) == null) {
                    return;
                }
                valueCallback.onReceiveValue(null);
                this.webviewUploadCallback = null;
                return;
            }
        }
        if (taxBridgeCommand instanceof TaxWebAppViewModel$PresenterHandledCommandResponse$NativeDeepLinkResult) {
            TaxWebAppViewModel$PresenterHandledCommandResponse$NativeDeepLinkResult taxWebAppViewModel$PresenterHandledCommandResponse$NativeDeepLinkResult = (TaxWebAppViewModel$PresenterHandledCommandResponse$NativeDeepLinkResult) taxBridgeCommand;
            sendTaxWebViewBridgeEvent(TaxWebBridgeOneofsKt.taxWebBridgeResponseEvent(taxWebAppViewModel$PresenterHandledCommandResponse$NativeDeepLinkResult.eventId, TaxWebBridgeOneofsKt.taxWebBridgeResponse(TaxWebBridgeResponse.Status.SUCCESS, new TaxWebBridgeResponse.Response.NativeDeepLinkEventResponse(new TaxWebBridgeNativeDeepLinkEventResponse(taxWebAppViewModel$PresenterHandledCommandResponse$NativeDeepLinkResult.isHandled ? TaxWebBridgeNativeDeepLinkEventResponse.Status.HANDLED : TaxWebBridgeNativeDeepLinkEventResponse.Status.UNSUPPORTED, ByteString.EMPTY)))));
            return;
        }
        if (!(taxBridgeCommand instanceof TaxBridgeCommand.TaxWebAppCommand)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        TaxBridgeCommand.TaxWebAppCommand taxWebAppCommand = (TaxBridgeCommand.TaxWebAppCommand) taxBridgeCommand;
        if (taxWebAppCommand.equals(TaxBridgeCommand.TaxWebAppCommand.MenuButtonTapCommand.INSTANCE)) {
            ByteString byteString2 = ByteString.EMPTY;
            taxWebBridgeRequest = new TaxWebBridgeRequest(new TaxWebBridgeRequest.Request.MenuButtonTapEventRequest(new TaxWebBridgeMenuButtonTapEventRequest(byteString2)), byteString2);
        } else if (taxWebAppCommand instanceof TaxBridgeCommand.TaxWebAppCommand.DialogSubmitRequest) {
            String str2 = ((TaxBridgeCommand.TaxWebAppCommand.DialogSubmitRequest) taxWebAppCommand).id;
            ByteString byteString3 = ByteString.EMPTY;
            taxWebBridgeRequest = new TaxWebBridgeRequest(new TaxWebBridgeRequest.Request.DialogButtonTapEventRequest(new TaxWebBridgeDialogButtonTapEventRequest(str2, byteString3)), byteString3);
        } else if (taxWebAppCommand.equals(TaxBridgeCommand.TaxWebAppCommand.BackButtonTapCommand.INSTANCE)) {
            ByteString byteString4 = ByteString.EMPTY;
            taxWebBridgeRequest = new TaxWebBridgeRequest(new TaxWebBridgeRequest.Request.BackButtonTapEventRequest(new TaxWebBridgeBackButtonTapEventRequest(byteString4)), byteString4);
        } else if (taxWebAppCommand.equals(TaxBridgeCommand.TaxWebAppCommand.CloseButtonTapCommand.INSTANCE)) {
            ByteString byteString5 = ByteString.EMPTY;
            taxWebBridgeRequest = new TaxWebBridgeRequest(new TaxWebBridgeRequest.Request.CloseButtonTapEventRequest(new TaxWebBridgeCloseButtonTapEventRequest(byteString5)), byteString5);
        } else if (taxWebAppCommand.equals(TaxBridgeCommand.TaxWebAppCommand.HelpButtonTapCommand.INSTANCE)) {
            ByteString byteString6 = ByteString.EMPTY;
            taxWebBridgeRequest = new TaxWebBridgeRequest(new TaxWebBridgeRequest.Request.HelpButtonTapEventRequest(new TaxWebBridgeHelpButtonTapEventRequest(byteString6)), byteString6);
        } else if (!taxWebAppCommand.equals(TaxBridgeCommand.TaxWebAppCommand.DesktopButtonTapCommand.INSTANCE)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        } else {
            ByteString byteString7 = ByteString.EMPTY;
            taxWebBridgeRequest = new TaxWebBridgeRequest(new TaxWebBridgeRequest.Request.DesktopButtonTapEventRequest(new TaxWebBridgeDesktopButtonTapEventRequest(byteString7)), byteString7);
        }
        sendTaxWebViewBridgeRequest(taxWebBridgeRequest);
    }

    /* renamed from: com.squareup.cash.tax.web.TaxWebAppBridge$2, reason: invalid class name */
    public final class AnonymousClass2 extends SuspendLambda implements Function2 {
        public final /* synthetic */ int $r8$classId;
        public int label;
        public final /* synthetic */ TaxWebAppBridge this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass2(TaxWebAppBridge taxWebAppBridge, Continuation continuation, int i) {
            super(2, continuation);
            this.$r8$classId = i;
            this.this$0 = taxWebAppBridge;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            int i = this.$r8$classId;
            TaxWebAppBridge taxWebAppBridge = this.this$0;
            switch (i) {
                case 0:
                    return new AnonymousClass2(taxWebAppBridge, continuation, 0);
                case 1:
                    return new AnonymousClass2(taxWebAppBridge, continuation, 1);
                case 2:
                    return new AnonymousClass2(taxWebAppBridge, continuation, 2);
                case 3:
                    return new AnonymousClass2(taxWebAppBridge, continuation, 3);
                default:
                    return new AnonymousClass2(taxWebAppBridge, continuation, 4);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            CoroutineScope coroutineScope = (CoroutineScope) obj;
            Continuation continuation = (Continuation) obj2;
            switch (this.$r8$classId) {
            }
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x0065, code lost:
        
            if (r0.send(com.squareup.cash.tax.viewmodels.TaxWebAppBridgeEvent.NewPageLoad.INSTANCE, r8) == r5) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x005a, code lost:
        
            if (r0.send(r1, r8) == r5) goto L28;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i = this.$r8$classId;
            final TaxWebAppBridge taxWebAppBridge = this.this$0;
            switch (i) {
                case 0:
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = this.label;
                    if (i2 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        ReadonlySharedFlow readonlySharedFlow = (ReadonlySharedFlow) taxWebAppBridge.downloadManager.d;
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(taxWebAppBridge, 0);
                        this.label = 1;
                        if (readonlySharedFlow.$$delegate_0.collect(anonymousClass1, this) == coroutineSingletons) {
                            break;
                        }
                    } else if (i2 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 1:
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i3 = this.label;
                    if (i3 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Flow denials = taxWebAppBridge.permissionManager.permissionChecker.denials();
                        FlowCollector flowCollector = new FlowCollector() { // from class: com.squareup.cash.tax.web.TaxWebAppBridge$5$1
                            /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
                            
                                if (r10.equals("android.permission.WRITE_EXTERNAL_STORAGE") == false) goto L34;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:16:0x0070, code lost:
                            
                                r10 = r7.get(com.squareup.cash.R.string.tax_web_permission_denial_description_storage);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
                            
                                if (r10.equals("android.permission.READ_EXTERNAL_STORAGE") == false) goto L34;
                             */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj2, Continuation continuation) {
                                String str;
                                String str2 = (String) obj2;
                                int hashCode = str2.hashCode();
                                if (hashCode == -406040016 ? !str2.equals("android.permission.READ_EXTERNAL_STORAGE") : !(hashCode == 463403621 ? str2.equals("android.permission.CAMERA") : hashCode == 1365911975 && str2.equals("android.permission.WRITE_EXTERNAL_STORAGE"))) {
                                    return Unit.INSTANCE;
                                }
                                TaxWebAppBridge taxWebAppBridge2 = TaxWebAppBridge.this;
                                ValueCallback valueCallback = taxWebAppBridge2.webviewUploadCallback;
                                AndroidStringManager androidStringManager = taxWebAppBridge2.stringManager;
                                if (valueCallback != null) {
                                    valueCallback.onReceiveValue(null);
                                }
                                taxWebAppBridge2.webviewUploadCallback = null;
                                int hashCode2 = str2.hashCode();
                                if (hashCode2 != -406040016) {
                                    if (hashCode2 != 463403621) {
                                        if (hashCode2 == 1365911975) {
                                        }
                                    } else if (str2.equals("android.permission.CAMERA")) {
                                        str = androidStringManager.get(R.string.tax_web_permission_denial_description_camera);
                                    }
                                    str = androidStringManager.get(R.string.tax_web_permission_denial_description_generic);
                                }
                                Object send = taxWebAppBridge2.webEvents.send(new TaxWebAppBridgeEvent.OpenTaxDialog(new TaxDialogDataModel(androidStringManager.get(R.string.tax_web_permission_denial_title), str, new TaxDialogDataModel.Button("permission-denial", androidStringManager.get(R.string.tax_web_permission_denial_action_button_title), TaxDialogDataModel.Style.Default, new TaxDialogDataModel.Action(TaxWebBridgeDialog.Button.Action.CLOSE_DIALOG.getValue())), null)), continuation);
                                return send == CoroutineSingletons.COROUTINE_SUSPENDED ? send : Unit.INSTANCE;
                            }
                        };
                        this.label = 1;
                        if (denials.collect(flowCollector, this) == coroutineSingletons2) {
                            break;
                        }
                    } else if (i3 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 2:
                    CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i4 = this.label;
                    if (i4 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        BufferedChannel bufferedChannel = taxWebAppBridge.webEvents;
                        this.label = 1;
                        if (bufferedChannel.send(TaxWebAppBridgeEvent.FinishedPageLoad.INSTANCE, this) == coroutineSingletons3) {
                            break;
                        }
                    } else if (i4 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 3:
                    BufferedChannel bufferedChannel2 = taxWebAppBridge.webEvents;
                    CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i5 = this.label;
                    if (i5 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        TaxToolbarConfig taxToolbarConfig = taxWebAppBridge.toolbarConfig;
                        if (taxToolbarConfig != null) {
                            TaxWebAppBridgeEvent.ToolbarUpdate toolbarUpdate = new TaxWebAppBridgeEvent.ToolbarUpdate(taxToolbarConfig);
                            this.label = 1;
                            break;
                        }
                    } else if (i5 == 1) {
                        SafeTrace.throwOnFailure(obj);
                    } else if (i5 != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                        break;
                    }
                    this.label = 2;
                    break;
                default:
                    CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i6 = this.label;
                    if (i6 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        BufferedChannel bufferedChannel3 = taxWebAppBridge.webEvents;
                        this.label = 1;
                        if (bufferedChannel3.send(TaxWebAppBridgeEvent.FinishCashAppTaxes.INSTANCE, this) == coroutineSingletons5) {
                            break;
                        }
                    } else if (i6 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
            }
            return Unit.INSTANCE;
        }

        /* renamed from: com.squareup.cash.tax.web.TaxWebAppBridge$2$1, reason: invalid class name */
        public final class AnonymousClass1 implements FlowCollector {
            public final /* synthetic */ int $r8$classId;
            public final /* synthetic */ TaxWebAppBridge this$0;

            public AnonymousClass1(TaxWebAppBridge taxWebAppBridge, CoroutineScope coroutineScope) {
                this.$r8$classId = 2;
                this.this$0 = taxWebAppBridge;
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
            
                if (r7 == null) goto L18;
             */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                Unit unit;
                int i = this.$r8$classId;
                TaxWebAppBridge taxWebAppBridge = this.this$0;
                switch (i) {
                    case 0:
                        long longValue = ((Number) obj).longValue();
                        if (taxWebAppBridge.downloadIds.removeIf(new PulsingState$$ExternalSyntheticLambda1(2, new c7$$ExternalSyntheticLambda6(longValue, 23)))) {
                            Cursor query = ((DownloadManager) taxWebAppBridge.downloadManager.c).query(new DownloadManager.Query().setFilterById(longValue));
                            try {
                                String string2 = query.moveToFirst() ? query.getString(query.getColumnIndex("local_uri")) : null;
                                query.close();
                                if (string2 != null) {
                                    taxWebAppBridge.launcher.viewData(string2, true);
                                }
                            } finally {
                            }
                        }
                        return Unit.INSTANCE;
                    case 1:
                        ValueCallback valueCallback = taxWebAppBridge.webviewUploadCallback;
                        if (valueCallback != null) {
                            valueCallback.onReceiveValue(null);
                        }
                        taxWebAppBridge.webviewUploadCallback = null;
                        return Unit.INSTANCE;
                    default:
                        ActivityResult activityResult = (ActivityResult) obj;
                        int i2 = activityResult.resultCode;
                        if (i2 == -1) {
                            int i3 = activityResult.requestCode;
                            if (i3 == 7) {
                                ValueCallback valueCallback2 = taxWebAppBridge.webviewUploadCallback;
                                if (valueCallback2 != null) {
                                    valueCallback2.onReceiveValue(WebChromeClient.FileChooserParams.parseResult(i2, activityResult.intent));
                                }
                            } else if (i3 == 8) {
                                Path path = taxWebAppBridge.currentTakePhotoPath;
                                if (path != null) {
                                    Uri contentUriForFileUri = taxWebAppBridge.fileProvider.contentUriForFileUri(((RealStorage) taxWebAppBridge.storage).getFileUri(path, TaxWebAppBridge$4$2$1$uri$1.INSTANCE));
                                    ValueCallback valueCallback3 = taxWebAppBridge.webviewUploadCallback;
                                    if (valueCallback3 == null) {
                                        unit = null;
                                        break;
                                    } else {
                                        valueCallback3.onReceiveValue(new Uri[]{contentUriForFileUri});
                                        unit = Unit.INSTANCE;
                                        break;
                                    }
                                }
                                ValueCallback valueCallback4 = taxWebAppBridge.webviewUploadCallback;
                                if (valueCallback4 != null) {
                                    valueCallback4.onReceiveValue(null);
                                }
                            }
                        } else {
                            ValueCallback valueCallback5 = taxWebAppBridge.webviewUploadCallback;
                            if (valueCallback5 != null) {
                                valueCallback5.onReceiveValue(null);
                            }
                        }
                        taxWebAppBridge.webviewUploadCallback = null;
                        return Unit.INSTANCE;
                }
            }

            public /* synthetic */ AnonymousClass1(TaxWebAppBridge taxWebAppBridge, int i) {
                this.$r8$classId = i;
                this.this$0 = taxWebAppBridge;
            }
        }
    }

    /* renamed from: com.squareup.cash.tax.web.TaxWebAppBridge$3, reason: invalid class name */
    public final class AnonymousClass3 extends SuspendLambda implements Function2 {
        public final /* synthetic */ int $r8$classId;
        public /* synthetic */ Object $unhandledIntents;
        public int label;
        public final /* synthetic */ Object this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass3(TaxWebAppBridge taxWebAppBridge, Object obj, Continuation continuation, int i) {
            super(2, continuation);
            this.$r8$classId = i;
            this.this$0 = taxWebAppBridge;
            this.$unhandledIntents = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            int i = this.$r8$classId;
            Object obj2 = this.this$0;
            switch (i) {
                case 0:
                    return new AnonymousClass3((Flow) this.$unhandledIntents, (TaxWebAppBridge) obj2, continuation, 0);
                case 1:
                    return new AnonymousClass3((RealTagCommunication) this.$unhandledIntents, (FlowCollector) obj2, continuation, 1);
                case 2:
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3((RealTagCommunication) obj2, continuation, 2);
                    anonymousClass3.$unhandledIntents = obj;
                    return anonymousClass3;
                case 3:
                    return new AnonymousClass3((WorkHomePresenter) this.$unhandledIntents, (MutableState) obj2, continuation, 3);
                case 4:
                    AnonymousClass3 anonymousClass32 = new AnonymousClass3((RealTaxesAppletTileRepository) obj2, continuation, 4);
                    anonymousClass32.$unhandledIntents = obj;
                    return anonymousClass32;
                case 5:
                    return new AnonymousClass3((TaxWebAppBridge) obj2, this.$unhandledIntents, continuation, 5);
                case 6:
                    return new AnonymousClass3((TaxWebAppBridge) obj2, this.$unhandledIntents, continuation, 6);
                case 7:
                    return new AnonymousClass3((TaxWebAppBridge) obj2, this.$unhandledIntents, continuation, 7);
                case 8:
                    return new AnonymousClass3((TaxWebAppBridge) obj2, this.$unhandledIntents, continuation, 8);
                case 9:
                    return new AnonymousClass3((TaxWebAppBridge) obj2, this.$unhandledIntents, continuation, 9);
                case 10:
                    return new AnonymousClass3((TaxWebAppBridge) obj2, this.$unhandledIntents, continuation, 10);
                case 11:
                    return new AnonymousClass3((TaxWebAppBridge) obj2, this.$unhandledIntents, continuation, 11);
                case 12:
                    return new AnonymousClass3((TaxWebBridgeConfigureToolbarEventRequest) this.$unhandledIntents, (TaxWebAppBridge) obj2, continuation, 12);
                case 13:
                    return new AnonymousClass3((ThreeDsPresenter) this.$unhandledIntents, (MutableState) obj2, continuation, 13);
                case 14:
                    return new AnonymousClass3((UnifiedActivityPickerBlockerPresenter) this.$unhandledIntents, (MutableState) obj2, continuation, 14);
                case 15:
                    return new AnonymousClass3((BalanceBasedAutoReloadConfirmationView) this.$unhandledIntents, (Function1) obj2, continuation, 15);
                case 16:
                    return new AnonymousClass3((Function1) this.$unhandledIntents, (Function0) obj2, continuation, 16);
                case 17:
                    AnonymousClass3 anonymousClass33 = new AnonymousClass3((ByteString) obj2, continuation, 17);
                    anonymousClass33.$unhandledIntents = obj;
                    return anonymousClass33;
                case 18:
                    return new AnonymousClass3((Function2) this.$unhandledIntents, (ActivityDataBridge) obj2, continuation, 18);
                case 19:
                    return new AnonymousClass3((TreehouseAppContent) this.$unhandledIntents, (CashTreehouseLayout) obj2, continuation, 19);
                case 20:
                    return new AnonymousClass3((HostDiscoverDataBridge) this.$unhandledIntents, (String) obj2, continuation, 20);
                case 21:
                    return new AnonymousClass3((HttpClient) this.$unhandledIntents, (String) obj2, continuation, 21);
                case 22:
                    return new AnonymousClass3((MetadataRepo) this.$unhandledIntents, (ZiplineManifest) obj2, continuation, 22);
                case 23:
                    return new AnonymousClass3((MainContainerDelegate) this.$unhandledIntents, (Thing.ThingContextThemeWrapper) obj2, continuation, 23);
                case 24:
                    return new AnonymousClass3((PaymentPasscodeDialogView) this.$unhandledIntents, (Presenter.Binding) obj2, continuation, 24);
                case 25:
                    return new AnonymousClass3((SuspendingFirebaseMessagingService) this.$unhandledIntents, (RemoteMessage) obj2, continuation, 25);
                case 26:
                    return new AnonymousClass3((VariantSandboxedComponent) this.$unhandledIntents, (ProducerScope) obj2, continuation, 26);
                case 27:
                    AnonymousClass3 anonymousClass34 = new AnonymousClass3((Context) obj2, continuation, 27);
                    anonymousClass34.$unhandledIntents = obj;
                    return anonymousClass34;
                case 28:
                    return new AnonymousClass3((AnimatedDigitState) this.$unhandledIntents, (AnimatedDigitState) obj2, continuation, 28);
                default:
                    return new AnonymousClass3((ParcelableSnapshotMutableIntState) this.$unhandledIntents, (CardSchemePresenter) obj2, continuation, 29);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            switch (this.$r8$classId) {
                case 4:
                    ((AnonymousClass3) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                    break;
                case 23:
                    ((AnonymousClass3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                    break;
                case 24:
                    ((AnonymousClass3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                    break;
            }
            return ((AnonymousClass3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:89:0x01b2  */
        /* JADX WARN: Type inference failed for: r13v0, types: [kotlin.coroutines.Continuation] */
        /* JADX WARN: Type inference failed for: r13v42, types: [android.graphics.Bitmap, java.lang.String] */
        /* JADX WARN: Type inference failed for: r13v44, types: [java.lang.Object, kotlin.Unit] */
        /* JADX WARN: Type inference failed for: r13v51 */
        /* JADX WARN: Type inference failed for: r13v52 */
        /* JADX WARN: Type inference failed for: r13v53 */
        /* JADX WARN: Type inference failed for: r13v54 */
        /* JADX WARN: Type inference failed for: r13v55 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x01b0 -> B:74:0x01b4). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r16) {
            /*
                Method dump skipped, instructions count: 2106
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.cash.tax.web.TaxWebAppBridge.AnonymousClass3.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass3(Object obj, Object obj2, Continuation continuation, int i) {
            super(2, continuation);
            this.$r8$classId = i;
            this.$unhandledIntents = obj;
            this.this$0 = obj2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass3(Object obj, Continuation continuation, int i) {
            super(2, continuation);
            this.$r8$classId = i;
            this.this$0 = obj;
        }
    }

    /* renamed from: com.squareup.cash.tax.web.TaxWebAppBridge$4, reason: invalid class name */
    public final class AnonymousClass4 extends SuspendLambda implements Function2 {
        public Object $activityResults;
        public final /* synthetic */ int $r8$classId;
        public Object L$0;
        public int label;
        public final /* synthetic */ Object this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(TaxWebAppBridge taxWebAppBridge, TaxWebBridgeNativeDeepLinkEventRequest taxWebBridgeNativeDeepLinkEventRequest, String str, Continuation continuation) {
            super(2, continuation);
            this.$r8$classId = 12;
            this.this$0 = taxWebAppBridge;
            this.L$0 = taxWebBridgeNativeDeepLinkEventRequest;
            this.$activityResults = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            int i = this.$r8$classId;
            Object obj2 = this.this$0;
            switch (i) {
                case 0:
                    AnonymousClass4 anonymousClass4 = new AnonymousClass4((Flow) this.$activityResults, (TaxWebAppBridge) obj2, continuation, 0);
                    anonymousClass4.L$0 = obj;
                    return anonymousClass4;
                case 1:
                    AnonymousClass4 anonymousClass42 = new AnonymousClass4((Flow) this.$activityResults, continuation, (InviteErrorPresenter) obj2, 1);
                    anonymousClass42.L$0 = obj;
                    return anonymousClass42;
                case 2:
                    AnonymousClass4 anonymousClass43 = new AnonymousClass4((Flow) this.$activityResults, continuation, (TaxReturnsPresenter) obj2, 2);
                    anonymousClass43.L$0 = obj;
                    return anonymousClass43;
                case 3:
                    AnonymousClass4 anonymousClass44 = new AnonymousClass4((Flow) this.$activityResults, continuation, (ErrorPresenter) obj2, 3);
                    anonymousClass44.L$0 = obj;
                    return anonymousClass44;
                case 4:
                    AnonymousClass4 anonymousClass45 = new AnonymousClass4((Flow) this.$activityResults, continuation, (ShareSheetPresenter) obj2, 4);
                    anonymousClass45.L$0 = obj;
                    return anonymousClass45;
                case 5:
                    AnonymousClass4 anonymousClass46 = new AnonymousClass4((ToolbarTuckTargets) obj2, continuation);
                    anonymousClass46.L$0 = obj;
                    return anonymousClass46;
                case 6:
                    AnonymousClass4 anonymousClass47 = new AnonymousClass4((Flow) this.$activityResults, continuation, (TaxAuthorizationPresenter) obj2, 6);
                    anonymousClass47.L$0 = obj;
                    return anonymousClass47;
                case 7:
                    AnonymousClass4 anonymousClass48 = new AnonymousClass4((Flow) this.$activityResults, continuation, (ErrorPresenter) obj2, 7);
                    anonymousClass48.L$0 = obj;
                    return anonymousClass48;
                case 8:
                    AnonymousClass4 anonymousClass49 = new AnonymousClass4((Flow) this.$activityResults, continuation, (TaxReturnsPresenter) obj2, 8);
                    anonymousClass49.L$0 = obj;
                    return anonymousClass49;
                case 9:
                    AnonymousClass4 anonymousClass410 = new AnonymousClass4((Flow) this.$activityResults, continuation, (TaxReturnsPresenter) obj2, 9);
                    anonymousClass410.L$0 = obj;
                    return anonymousClass410;
                case 10:
                    return new AnonymousClass4((TaxWebAppPresenter) this.L$0, (TaxWebAppViewEvent) this.$activityResults, (MutableState) obj2, continuation, 10);
                case 11:
                    AnonymousClass4 anonymousClass411 = new AnonymousClass4((Flow) this.$activityResults, continuation, (ErrorPresenter) obj2, 11);
                    anonymousClass411.L$0 = obj;
                    return anonymousClass411;
                case 12:
                    return new AnonymousClass4((TaxWebAppBridge) obj2, (TaxWebBridgeNativeDeepLinkEventRequest) this.L$0, (String) this.$activityResults, continuation);
                case 13:
                    AnonymousClass4 anonymousClass412 = new AnonymousClass4((Flow) this.$activityResults, continuation, (ThreeDsPresenter) obj2, 13);
                    anonymousClass412.L$0 = obj;
                    return anonymousClass412;
                case 14:
                    AnonymousClass4 anonymousClass413 = new AnonymousClass4((Flow) this.$activityResults, continuation, (UnifiedActivityPickerBlockerPresenter) obj2, 14);
                    anonymousClass413.L$0 = obj;
                    return anonymousClass413;
                case 15:
                    AnonymousClass4 anonymousClass414 = new AnonymousClass4((MarkwonConfiguration) this.$activityResults, (ZiplineHistoryDataJavaScripter) obj2, continuation, 15);
                    anonymousClass414.L$0 = obj;
                    return anonymousClass414;
                case 16:
                    return new AnonymousClass4((AddMoneyPresenter) this.$activityResults, (MutableState) obj2, continuation, 16);
                case 17:
                    AnonymousClass4 anonymousClass415 = new AnonymousClass4((Flow) this.$activityResults, continuation, (ErrorPresenter) obj2, 17);
                    anonymousClass415.L$0 = obj;
                    return anonymousClass415;
                case 18:
                    AnonymousClass4 anonymousClass416 = new AnonymousClass4((Flow) this.$activityResults, continuation, (InstrumentDetailsPresenter) obj2, 18);
                    anonymousClass416.L$0 = obj;
                    return anonymousClass416;
                case 19:
                    AnonymousClass4 anonymousClass417 = new AnonymousClass4((Flow) this.$activityResults, continuation, (WorkHomePresenter) obj2, 19);
                    anonymousClass417.L$0 = obj;
                    return anonymousClass417;
                case 20:
                    AnonymousClass4 anonymousClass418 = new AnonymousClass4((Flow) this.$activityResults, continuation, (ShareSheetPresenter) obj2, 20);
                    anonymousClass418.L$0 = obj;
                    return anonymousClass418;
                case 21:
                    AnonymousClass4 anonymousClass419 = new AnonymousClass4((Flow) this.$activityResults, continuation, (InviteErrorPresenter) obj2, 21);
                    anonymousClass419.L$0 = obj;
                    return anonymousClass419;
                case 22:
                    AnonymousClass4 anonymousClass420 = new AnonymousClass4((Flow) this.$activityResults, continuation, (ShareSheetPresenter) obj2, 22);
                    anonymousClass420.L$0 = obj;
                    return anonymousClass420;
                case 23:
                    AnonymousClass4 anonymousClass421 = new AnonymousClass4((Flow) this.$activityResults, continuation, (InviteErrorPresenter) obj2, 23);
                    anonymousClass421.L$0 = obj;
                    return anonymousClass421;
                case 24:
                    AnonymousClass4 anonymousClass422 = new AnonymousClass4((Flow) this.$activityResults, continuation, (WorkHomePresenter) obj2, 24);
                    anonymousClass422.L$0 = obj;
                    return anonymousClass422;
                case 25:
                    AnonymousClass4 anonymousClass423 = new AnonymousClass4((Flow) this.$activityResults, continuation, (SetDefaultInstrumentPresenter) obj2, 25);
                    anonymousClass423.L$0 = obj;
                    return anonymousClass423;
                case 26:
                    return new AnonymousClass4((n) this.L$0, (Screen) this.$activityResults, (BetterNavigator.ScreenNavigator) obj2, continuation, 26);
                case 27:
                    AnonymousClass4 anonymousClass424 = new AnonymousClass4((SerializableActivityItem) this.$activityResults, (String) obj2, continuation, 27);
                    anonymousClass424.L$0 = obj;
                    return anonymousClass424;
                case 28:
                    AnonymousClass4 anonymousClass425 = new AnonymousClass4((List) this.$activityResults, (String) obj2, continuation, 28);
                    anonymousClass425.L$0 = obj;
                    return anonymousClass425;
                default:
                    return new AnonymousClass4((SuspendingFirebaseMessagingService) this.L$0, (String) this.$activityResults, (Exception) obj2, continuation, 29);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            switch (this.$r8$classId) {
                case 0:
                    return ((AnonymousClass4) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 1:
                    return ((AnonymousClass4) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 2:
                    return ((AnonymousClass4) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 3:
                    return ((AnonymousClass4) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 4:
                    return ((AnonymousClass4) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 5:
                    return ((AnonymousClass4) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 6:
                    return ((AnonymousClass4) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 7:
                    return ((AnonymousClass4) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 8:
                    return ((AnonymousClass4) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 9:
                    return ((AnonymousClass4) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 10:
                    return ((AnonymousClass4) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 11:
                    return ((AnonymousClass4) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 12:
                    return ((AnonymousClass4) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 13:
                    return ((AnonymousClass4) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 14:
                    return ((AnonymousClass4) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 15:
                    return ((AnonymousClass4) create((CashActivity) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 16:
                    return ((AnonymousClass4) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 17:
                    return ((AnonymousClass4) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 18:
                    return ((AnonymousClass4) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 19:
                    return ((AnonymousClass4) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 20:
                    return ((AnonymousClass4) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 21:
                    return ((AnonymousClass4) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 22:
                    return ((AnonymousClass4) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 23:
                    return ((AnonymousClass4) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 24:
                    return ((AnonymousClass4) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 25:
                    return ((AnonymousClass4) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 26:
                    return ((AnonymousClass4) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 27:
                    return ((AnonymousClass4) create((ActivityDataBridge) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 28:
                    return ((AnonymousClass4) create((ActivityDataBridge) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                default:
                    return ((AnonymousClass4) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:321:0x0573, code lost:
        
            if (r0.emit(r1, r13) == r2) goto L282;
         */
        /* JADX WARN: Code restructure failed: missing block: B:334:0x0538, code lost:
        
            if (r14 == r2) goto L282;
         */
        /* JADX WARN: Removed duplicated region for block: B:320:0x0567  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            ApiResult apiResult;
            ApiResult apiResult2;
            MutableState mutableState;
            int i = this.$r8$classId;
            int i2 = 2;
            int i3 = 16;
            int i4 = 21;
            int i5 = 19;
            int i6 = 20;
            int i7 = 22;
            int i8 = 15;
            Object obj2 = this.this$0;
            Continuation continuation = null;
            switch (i) {
                case 0:
                    CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i9 = this.label;
                    if (i9 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Flow flow = (Flow) this.$activityResults;
                        AnonymousClass2.AnonymousClass1 anonymousClass1 = new AnonymousClass2.AnonymousClass1((TaxWebAppBridge) obj2, coroutineScope);
                        this.L$0 = null;
                        this.label = 1;
                        Object collect = flow.collect(new RealDrawerOpener$getDrawerScreen$$inlined$map$1.AnonymousClass2(anonymousClass1, i2), this);
                        if (collect != coroutineSingletons) {
                            collect = Unit.INSTANCE;
                        }
                        if (collect == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i9 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 1:
                    CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i10 = this.label;
                    if (i10 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Flow flow2 = (Flow) this.$activityResults;
                        ChatView$30$1 chatView$30$1 = new ChatView$30$1(coroutineScope2, (InviteErrorPresenter) obj2, i8);
                        this.L$0 = null;
                        this.label = 1;
                        if (flow2.collect(chatView$30$1, this) == coroutineSingletons2) {
                            return coroutineSingletons2;
                        }
                    } else {
                        if (i10 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 2:
                    CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
                    CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i11 = this.label;
                    if (i11 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Flow flow3 = (Flow) this.$activityResults;
                        ChatView$30$1 chatView$30$12 = new ChatView$30$1(coroutineScope3, (TaxReturnsPresenter) obj2, i3);
                        this.L$0 = null;
                        this.label = 1;
                        if (flow3.collect(chatView$30$12, this) == coroutineSingletons3) {
                            return coroutineSingletons3;
                        }
                    } else {
                        if (i11 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 3:
                    CoroutineScope coroutineScope4 = (CoroutineScope) this.L$0;
                    CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i12 = this.label;
                    if (i12 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Flow flow4 = (Flow) this.$activityResults;
                        TaxWebAppBridge$openTakePhoto$1$1 taxWebAppBridge$openTakePhoto$1$1 = new TaxWebAppBridge$openTakePhoto$1$1(13, coroutineScope4, (ErrorPresenter) obj2);
                        this.L$0 = null;
                        this.label = 1;
                        if (flow4.collect(taxWebAppBridge$openTakePhoto$1$1, this) == coroutineSingletons4) {
                            return coroutineSingletons4;
                        }
                    } else {
                        if (i12 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 4:
                    CoroutineScope coroutineScope5 = (CoroutineScope) this.L$0;
                    CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i13 = this.label;
                    if (i13 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Flow flow5 = (Flow) this.$activityResults;
                        ChatView$30$1 chatView$30$13 = new ChatView$30$1(coroutineScope5, (ShareSheetPresenter) obj2, 17);
                        this.L$0 = null;
                        this.label = 1;
                        if (flow5.collect(chatView$30$13, this) == coroutineSingletons5) {
                            return coroutineSingletons5;
                        }
                    } else {
                        if (i13 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 5:
                    FlowCollector flowCollector = (FlowCollector) this.L$0;
                    CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i14 = this.label;
                    if (i14 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        TaxExperienceService taxExperienceService = (TaxExperienceService) ((ToolbarTuckTargets) obj2).startCornerCenterX$delegate;
                        UserData2Request userData2Request = new UserData2Request();
                        this.L$0 = flowCollector;
                        this.label = 1;
                        obj = taxExperienceService.retrieveEntryPointData2(userData2Request, this);
                        break;
                    } else {
                        if (i14 != 1) {
                            if (i14 != 2) {
                                if (i14 == 3) {
                                    SafeTrace.throwOnFailure(obj);
                                    return Unit.INSTANCE;
                                }
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            apiResult2 = (ApiResult) this.$activityResults;
                            SafeTrace.throwOnFailure(obj);
                            apiResult = apiResult2;
                            if (apiResult instanceof ApiResult.Failure) {
                                Boolean bool = Boolean.FALSE;
                                this.L$0 = null;
                                this.$activityResults = apiResult;
                                this.label = 3;
                                break;
                            }
                            return Unit.INSTANCE;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    apiResult = (ApiResult) obj;
                    if (apiResult instanceof ApiResult.Success) {
                        Boolean bool2 = ((UserData2Response) ((ApiResult.Success) apiResult).response).has_bitcoin_availability;
                        Boolean valueOf = Boolean.valueOf(bool2 != null ? bool2.booleanValue() : false);
                        this.L$0 = flowCollector;
                        this.$activityResults = apiResult;
                        this.label = 2;
                        if (flowCollector.emit(valueOf, this) != coroutineSingletons6) {
                            apiResult2 = apiResult;
                            apiResult = apiResult2;
                        }
                        return coroutineSingletons6;
                    }
                    if (apiResult instanceof ApiResult.Failure) {
                    }
                    return Unit.INSTANCE;
                case 6:
                    CoroutineScope coroutineScope6 = (CoroutineScope) this.L$0;
                    CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i15 = this.label;
                    if (i15 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Flow flow6 = (Flow) this.$activityResults;
                        TaxWebAppBridge$openTakePhoto$1$1 taxWebAppBridge$openTakePhoto$1$12 = new TaxWebAppBridge$openTakePhoto$1$1(i3, coroutineScope6, (TaxAuthorizationPresenter) obj2);
                        this.L$0 = null;
                        this.label = 1;
                        if (flow6.collect(taxWebAppBridge$openTakePhoto$1$12, this) == coroutineSingletons7) {
                            return coroutineSingletons7;
                        }
                    } else {
                        if (i15 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 7:
                    CoroutineScope coroutineScope7 = (CoroutineScope) this.L$0;
                    CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i16 = this.label;
                    if (i16 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Flow flow7 = (Flow) this.$activityResults;
                        ChatView$30$1 chatView$30$14 = new ChatView$30$1(coroutineScope7, (ErrorPresenter) obj2, 18);
                        this.L$0 = null;
                        this.label = 1;
                        if (flow7.collect(chatView$30$14, this) == coroutineSingletons8) {
                            return coroutineSingletons8;
                        }
                    } else {
                        if (i16 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 8:
                    CoroutineScope coroutineScope8 = (CoroutineScope) this.L$0;
                    CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i17 = this.label;
                    if (i17 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Flow flow8 = (Flow) this.$activityResults;
                        ChatView$30$1 chatView$30$15 = new ChatView$30$1(coroutineScope8, (TaxReturnsPresenter) obj2, i5);
                        this.L$0 = null;
                        this.label = 1;
                        if (flow8.collect(chatView$30$15, this) == coroutineSingletons9) {
                            return coroutineSingletons9;
                        }
                    } else {
                        if (i17 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 9:
                    CoroutineScope coroutineScope9 = (CoroutineScope) this.L$0;
                    CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i18 = this.label;
                    if (i18 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Flow flow9 = (Flow) this.$activityResults;
                        ChatView$30$1 chatView$30$16 = new ChatView$30$1(coroutineScope9, (TaxReturnsPresenter) obj2, i6);
                        this.L$0 = null;
                        this.label = 1;
                        if (flow9.collect(chatView$30$16, this) == coroutineSingletons10) {
                            return coroutineSingletons10;
                        }
                    } else {
                        if (i18 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 10:
                    MutableState mutableState2 = (MutableState) obj2;
                    TaxWebAppPresenter taxWebAppPresenter = (TaxWebAppPresenter) this.L$0;
                    CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i19 = this.label;
                    if (i19 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        RealTaxDesktopTooltipPreference realTaxDesktopTooltipPreference = taxWebAppPresenter.taxDesktopTooltipPreference;
                        this.label = 1;
                        obj = JobKt.withContext(realTaxDesktopTooltipPreference.ioDispatcher, new ChatInputView$Content$1$1$1(realTaxDesktopTooltipPreference, continuation, i4), this);
                        if (obj == coroutineSingletons11) {
                            return coroutineSingletons11;
                        }
                    } else {
                        if (i19 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    if (((Boolean) obj).booleanValue()) {
                        Set set = TaxWebAppPresenter.X_DOMAINS;
                        if (!((Boolean) mutableState2.getValue()).booleanValue()) {
                            mutableState2.setValue(Boolean.TRUE);
                            BetterNavigator.ScreenNavigator screenNavigator = taxWebAppPresenter.navigator;
                            TaxWebAppViewEvent.OpenTooltipEvent openTooltipEvent = (TaxWebAppViewEvent.OpenTooltipEvent) ((TaxWebAppViewEvent) this.$activityResults);
                            screenNavigator.goTo(new TaxTooltipScreen(openTooltipEvent.anchorBottom, openTooltipEvent.anchorLeft, openTooltipEvent.anchorWidth));
                        }
                    }
                    return Unit.INSTANCE;
                case 11:
                    CoroutineScope coroutineScope10 = (CoroutineScope) this.L$0;
                    CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i20 = this.label;
                    if (i20 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Flow flow10 = (Flow) this.$activityResults;
                        ChatView$30$1 chatView$30$17 = new ChatView$30$1(coroutineScope10, (ErrorPresenter) obj2, i4);
                        this.L$0 = null;
                        this.label = 1;
                        if (flow10.collect(chatView$30$17, this) == coroutineSingletons12) {
                            return coroutineSingletons12;
                        }
                    } else {
                        if (i20 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 12:
                    CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i21 = this.label;
                    if (i21 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        TaxWebAppBridge taxWebAppBridge = (TaxWebAppBridge) obj2;
                        TaxWebBridgeNativeDeepLinkEventRequest taxWebBridgeNativeDeepLinkEventRequest = (TaxWebBridgeNativeDeepLinkEventRequest) this.L$0;
                        String str = (String) this.$activityResults;
                        this.label = 1;
                        BufferedChannel bufferedChannel = taxWebAppBridge.webEvents;
                        String str2 = taxWebBridgeNativeDeepLinkEventRequest.native_deep_link;
                        Boolean bool3 = taxWebBridgeNativeDeepLinkEventRequest.is_deep_link_candidate;
                        boolean booleanValue = bool3 != null ? bool3.booleanValue() : false;
                        String str3 = taxWebAppBridge.lastUrlLoaded;
                        if (str3 == null) {
                            str3 = "";
                        }
                        Object send = bufferedChannel.send(new TaxWebAppBridgeEvent.OpenNativeDeepLink(str, str2, booleanValue, new WebViewState(str3)), this);
                        if (send != coroutineSingletons13) {
                            send = Unit.INSTANCE;
                        }
                        if (send == coroutineSingletons13) {
                            return coroutineSingletons13;
                        }
                    } else {
                        if (i21 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 13:
                    CoroutineScope coroutineScope11 = (CoroutineScope) this.L$0;
                    CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i22 = this.label;
                    if (i22 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Flow flow11 = (Flow) this.$activityResults;
                        ChatView$30$1 chatView$30$18 = new ChatView$30$1(coroutineScope11, (ThreeDsPresenter) obj2, i7);
                        this.L$0 = null;
                        this.label = 1;
                        if (flow11.collect(chatView$30$18, this) == coroutineSingletons14) {
                            return coroutineSingletons14;
                        }
                    } else {
                        if (i22 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 14:
                    CoroutineScope coroutineScope12 = (CoroutineScope) this.L$0;
                    CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i23 = this.label;
                    if (i23 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Flow flow12 = (Flow) this.$activityResults;
                        ChatView$30$1 chatView$30$19 = new ChatView$30$1(coroutineScope12, (UnifiedActivityPickerBlockerPresenter) obj2, 23);
                        this.L$0 = null;
                        this.label = 1;
                        if (flow12.collect(chatView$30$19, this) == coroutineSingletons15) {
                            return coroutineSingletons15;
                        }
                    } else {
                        if (i23 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 15:
                    CashActivity cashActivity = (CashActivity) this.L$0;
                    CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i24 = this.label;
                    if (i24 != 0) {
                        if (i24 == 1) {
                            SafeTrace.throwOnFailure(obj);
                            return obj;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    CoroutineContext coroutineContext = (CoroutineContext) ((MarkwonConfiguration) this.$activityResults).linkResolver;
                    RealTransactionLoader$getTransactions$1$1$1 realTransactionLoader$getTransactions$1$1$1 = new RealTransactionLoader$getTransactions$1$1$1(cashActivity, (ZiplineHistoryDataJavaScripter) obj2, (Continuation) null);
                    this.L$0 = null;
                    this.label = 1;
                    Object withContext = JobKt.withContext(coroutineContext, realTransactionLoader$getTransactions$1$1$1, this);
                    return withContext == coroutineSingletons16 ? coroutineSingletons16 : withContext;
                case 16:
                    CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i25 = this.label;
                    if (i25 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        AddMoneyPresenter addMoneyPresenter = (AddMoneyPresenter) this.$activityResults;
                        if (addMoneyPresenter.googlePayEnabled) {
                            MutableState mutableState3 = (MutableState) obj2;
                            GooglePayPaymentsClient googlePayPaymentsClient = addMoneyPresenter.googlePayPaymentsClient;
                            this.L$0 = mutableState3;
                            this.label = 1;
                            obj = ((RealGooglePayPaymentsClient) googlePayPaymentsClient).isReadyToPay(this);
                            if (obj == coroutineSingletons17) {
                                return coroutineSingletons17;
                            }
                            mutableState = mutableState3;
                        }
                        return Unit.INSTANCE;
                    }
                    if (i25 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mutableState = (MutableState) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    Boolean bool4 = (Boolean) obj;
                    bool4.getClass();
                    List list = AddMoneyPresenter.PRESET_AMOUNTS;
                    mutableState.setValue(bool4);
                    return Unit.INSTANCE;
                case 17:
                    CoroutineScope coroutineScope13 = (CoroutineScope) this.L$0;
                    CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i26 = this.label;
                    if (i26 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Flow flow13 = (Flow) this.$activityResults;
                        ChatView$30$1 chatView$30$110 = new ChatView$30$1(coroutineScope13, (ErrorPresenter) obj2, 24);
                        this.L$0 = null;
                        this.label = 1;
                        if (flow13.collect(chatView$30$110, this) == coroutineSingletons18) {
                            return coroutineSingletons18;
                        }
                    } else {
                        if (i26 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 18:
                    CoroutineScope coroutineScope14 = (CoroutineScope) this.L$0;
                    CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i27 = this.label;
                    if (i27 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Flow flow14 = (Flow) this.$activityResults;
                        ChatView$30$1 chatView$30$111 = new ChatView$30$1(coroutineScope14, (InstrumentDetailsPresenter) obj2, 25);
                        this.L$0 = null;
                        this.label = 1;
                        if (flow14.collect(chatView$30$111, this) == coroutineSingletons19) {
                            return coroutineSingletons19;
                        }
                    } else {
                        if (i27 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 19:
                    CoroutineScope coroutineScope15 = (CoroutineScope) this.L$0;
                    CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i28 = this.label;
                    if (i28 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Flow flow15 = (Flow) this.$activityResults;
                        ChatView$30$1 chatView$30$112 = new ChatView$30$1(coroutineScope15, (WorkHomePresenter) obj2, 26);
                        this.L$0 = null;
                        this.label = 1;
                        if (flow15.collect(chatView$30$112, this) == coroutineSingletons20) {
                            return coroutineSingletons20;
                        }
                    } else {
                        if (i28 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 20:
                    CoroutineScope coroutineScope16 = (CoroutineScope) this.L$0;
                    CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i29 = this.label;
                    if (i29 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Flow flow16 = (Flow) this.$activityResults;
                        TaxWebAppBridge$openTakePhoto$1$1 taxWebAppBridge$openTakePhoto$1$13 = new TaxWebAppBridge$openTakePhoto$1$1(i5, coroutineScope16, (ShareSheetPresenter) obj2);
                        this.L$0 = null;
                        this.label = 1;
                        if (flow16.collect(taxWebAppBridge$openTakePhoto$1$13, this) == coroutineSingletons21) {
                            return coroutineSingletons21;
                        }
                    } else {
                        if (i29 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 21:
                    CoroutineScope coroutineScope17 = (CoroutineScope) this.L$0;
                    CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i30 = this.label;
                    if (i30 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Flow flow17 = (Flow) this.$activityResults;
                        ChatView$30$1 chatView$30$113 = new ChatView$30$1(coroutineScope17, (InviteErrorPresenter) obj2, 27);
                        this.L$0 = null;
                        this.label = 1;
                        if (flow17.collect(chatView$30$113, this) == coroutineSingletons22) {
                            return coroutineSingletons22;
                        }
                    } else {
                        if (i30 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 22:
                    CoroutineScope coroutineScope18 = (CoroutineScope) this.L$0;
                    CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i31 = this.label;
                    if (i31 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Flow flow18 = (Flow) this.$activityResults;
                        TaxWebAppBridge$openTakePhoto$1$1 taxWebAppBridge$openTakePhoto$1$14 = new TaxWebAppBridge$openTakePhoto$1$1(i6, coroutineScope18, (ShareSheetPresenter) obj2);
                        this.L$0 = null;
                        this.label = 1;
                        if (flow18.collect(taxWebAppBridge$openTakePhoto$1$14, this) == coroutineSingletons23) {
                            return coroutineSingletons23;
                        }
                    } else {
                        if (i31 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 23:
                    CoroutineScope coroutineScope19 = (CoroutineScope) this.L$0;
                    CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i32 = this.label;
                    if (i32 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Flow flow19 = (Flow) this.$activityResults;
                        TaxWebAppBridge$openTakePhoto$1$1 taxWebAppBridge$openTakePhoto$1$15 = new TaxWebAppBridge$openTakePhoto$1$1(i7, coroutineScope19, (InviteErrorPresenter) obj2);
                        this.L$0 = null;
                        this.label = 1;
                        if (flow19.collect(taxWebAppBridge$openTakePhoto$1$15, this) == coroutineSingletons24) {
                            return coroutineSingletons24;
                        }
                    } else {
                        if (i32 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 24:
                    CoroutineScope coroutineScope20 = (CoroutineScope) this.L$0;
                    CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i33 = this.label;
                    if (i33 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Flow flow20 = (Flow) this.$activityResults;
                        ChatView$30$1 chatView$30$114 = new ChatView$30$1(coroutineScope20, (WorkHomePresenter) obj2, 28);
                        this.L$0 = null;
                        this.label = 1;
                        if (flow20.collect(chatView$30$114, this) == coroutineSingletons25) {
                            return coroutineSingletons25;
                        }
                    } else {
                        if (i33 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 25:
                    CoroutineScope coroutineScope21 = (CoroutineScope) this.L$0;
                    CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i34 = this.label;
                    if (i34 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Flow flow21 = (Flow) this.$activityResults;
                        ChatView$30$1 chatView$30$115 = new ChatView$30$1(coroutineScope21, (SetDefaultInstrumentPresenter) obj2, 29);
                        this.L$0 = null;
                        this.label = 1;
                        if (flow21.collect(chatView$30$115, this) == coroutineSingletons26) {
                            return coroutineSingletons26;
                        }
                    } else {
                        if (i34 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 26:
                    CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i35 = this.label;
                    if (i35 != 0) {
                        if (i35 == 1) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    n nVar = (n) this.L$0;
                    SharedFlowImpl sharedFlowImpl = ((RealTransferManager) ((TransferManager) nVar.a)).actions;
                    BufferCountKt$bufferSkip$1.AnonymousClass1 anonymousClass12 = new BufferCountKt$bufferSkip$1.AnonymousClass1(i8, nVar, (Screen) this.$activityResults, (BetterNavigator.ScreenNavigator) obj2);
                    this.label = 1;
                    sharedFlowImpl.collect(anonymousClass12, this);
                    return coroutineSingletons27;
                case 27:
                    ActivityDataBridge activityDataBridge = (ActivityDataBridge) this.L$0;
                    CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i36 = this.label;
                    if (i36 != 0) {
                        if (i36 == 1) {
                            SafeTrace.throwOnFailure(obj);
                            return obj;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    this.L$0 = null;
                    this.label = 1;
                    Object format2 = activityDataBridge.format((SerializableActivityItem) this.$activityResults, (String) obj2, this);
                    return format2 == coroutineSingletons28 ? coroutineSingletons28 : format2;
                case 28:
                    ActivityDataBridge activityDataBridge2 = (ActivityDataBridge) this.L$0;
                    CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i37 = this.label;
                    if (i37 != 0) {
                        if (i37 == 1) {
                            SafeTrace.throwOnFailure(obj);
                            return obj;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    List list2 = (List) this.$activityResults;
                    this.L$0 = null;
                    this.label = 1;
                    Object format3 = activityDataBridge2.format((String) obj2, list2, this);
                    return format3 == coroutineSingletons29 ? coroutineSingletons29 : format3;
                default:
                    CoroutineSingletons coroutineSingletons30 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i38 = this.label;
                    if (i38 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        this.label = 1;
                        if (Unit.INSTANCE == coroutineSingletons30) {
                            return coroutineSingletons30;
                        }
                    } else {
                        if (i38 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(ToolbarTuckTargets toolbarTuckTargets, Continuation continuation) {
            super(2, continuation);
            this.$r8$classId = 5;
            this.this$0 = toolbarTuckTargets;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass4(Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
            super(2, continuation);
            this.$r8$classId = i;
            this.L$0 = obj;
            this.$activityResults = obj2;
            this.this$0 = obj3;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass4(Object obj, Object obj2, Continuation continuation, int i) {
            super(2, continuation);
            this.$r8$classId = i;
            this.$activityResults = obj;
            this.this$0 = obj2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass4(Flow flow, Continuation continuation, MoleculePresenter moleculePresenter, int i) {
            super(2, continuation);
            this.$r8$classId = i;
            this.$activityResults = flow;
            this.this$0 = moleculePresenter;
        }
    }
}
