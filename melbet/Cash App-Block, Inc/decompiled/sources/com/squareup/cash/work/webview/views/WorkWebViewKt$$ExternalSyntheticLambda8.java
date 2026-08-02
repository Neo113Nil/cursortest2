package com.squareup.cash.work.webview.views;

import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.URLUtil;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.compose.runtime.MutableState;
import app.cash.sqldelight.driver.android.AndroidStatement;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.braze.ui.UserJavascriptInterfaceBase$$ExternalSyntheticLambda25;
import com.fillr.n;
import com.squareup.cash.db2.ExpressivePaymentsStickerConfig;
import com.squareup.cash.db2.InstrumentQueries;
import com.squareup.cash.mosaic.resources.api.v2.ReleaseState;
import com.squareup.cash.webview.android.WebViewProvider;
import com.squareup.cash.webview.android.WebViewUseCase;
import com.squareup.cash.work.webview.viewmodels.WorkWebViewEvent;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.builders.MapBuilder;
import kotlin.collections.builders.MapBuilderEntries;
import kotlin.jvm.functions.Function1;
import timber.log.Timber;

/* loaded from: classes7.dex */
public final /* synthetic */ class WorkWebViewKt$$ExternalSyntheticLambda8 implements Function1 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ String f$3;
    public final /* synthetic */ String f$4;
    public final /* synthetic */ boolean f$5;
    public final /* synthetic */ Object f$6;
    public final /* synthetic */ Object f$7;
    public final /* synthetic */ Object f$8;
    public final /* synthetic */ Object f$9;

    public /* synthetic */ WorkWebViewKt$$ExternalSyntheticLambda8(WebViewProvider webViewProvider, Context context, Function1 function1, String str, String str2, boolean z, Function1 function12, Function1 function13, WorkWebViewDownloadHandler workWebViewDownloadHandler, MutableState mutableState) {
        this.f$0 = webViewProvider;
        this.f$1 = context;
        this.f$2 = function1;
        this.f$3 = str;
        this.f$4 = str2;
        this.f$5 = z;
        this.f$6 = function12;
        this.f$7 = function13;
        this.f$8 = workWebViewDownloadHandler;
        this.f$9 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Long l;
        int i = this.$r8$classId;
        Object obj2 = this.f$9;
        Object obj3 = this.f$8;
        Object obj4 = this.f$7;
        Object obj5 = this.f$6;
        Object obj6 = this.f$2;
        Object obj7 = this.f$1;
        Object obj8 = this.f$0;
        String str = this.f$4;
        String str2 = this.f$3;
        switch (i) {
            case 0:
                Context context = (Context) obj7;
                Function1 function1 = (Function1) obj6;
                Function1 function12 = (Function1) obj5;
                Function1 function13 = (Function1) obj4;
                final WorkWebViewDownloadHandler workWebViewDownloadHandler = (WorkWebViewDownloadHandler) obj3;
                MutableState mutableState = (MutableState) obj2;
                ((Context) obj).getClass();
                WebView webView = ((WebViewProvider) obj8).getWebView(WebViewUseCase.WORK, context);
                if (webView == null) {
                    function1.invoke(new WorkWebViewEvent.PageError(false));
                }
                if (webView != null) {
                    webView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                    WebSettings settings = webView.getSettings();
                    settings.setJavaScriptEnabled(true);
                    settings.setDomStorageEnabled(true);
                    settings.setSupportZoom(true);
                    settings.setBuiltInZoomControls(true);
                    settings.setDisplayZoomControls(false);
                    settings.setUserAgentString(str);
                    webView.setWebViewClient(new WorkWebViewClient(new UserJavascriptInterfaceBase$$ExternalSyntheticLambda25(function1, this.f$5, function12, function13, 19)));
                    webView.setDownloadListener(new DownloadListener() { // from class: com.squareup.cash.work.webview.views.WorkWebViewKt$$ExternalSyntheticLambda12
                        @Override // android.webkit.DownloadListener
                        public final void onDownloadStart(String str3, String str4, String str5, String str6, long j) {
                            WorkWebViewDownloadHandler workWebViewDownloadHandler2 = WorkWebViewDownloadHandler.this;
                            workWebViewDownloadHandler2.getClass();
                            if (str3 == null) {
                                return;
                            }
                            String guessFileName = URLUtil.guessFileName(str3, str5, str6);
                            workWebViewDownloadHandler2.cookieProvider.getClass();
                            String cookie = CookieManager.getInstance().getCookie(str3);
                            guessFileName.getClass();
                            if (str6 == null) {
                                str6 = "application/octet-stream";
                            }
                            MapBuilder mapBuilder = new MapBuilder();
                            if (cookie != null) {
                                mapBuilder.put("Cookie", cookie);
                            }
                            MapBuilder build = mapBuilder.build();
                            n nVar = workWebViewDownloadHandler2.downloadManager;
                            nVar.getClass();
                            DownloadManager downloadManager = (DownloadManager) nVar.c;
                            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str3));
                            request.setMimeType(str6);
                            Object it = ((MapBuilderEntries) build.entrySet()).iterator();
                            while (((MapBuilder.Itr) it).hasNext()) {
                                Map.Entry entry = (Map.Entry) ((MapBuilder.KeysItr) it).next();
                                request.addRequestHeader((String) entry.getKey(), (String) entry.getValue());
                            }
                            request.setNotificationVisibility(1);
                            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                            long enqueue = downloadManager.enqueue(request);
                            Timber.Forest forest = Timber.Forest;
                            StringBuilder m = re$$ExternalSyntheticOutline0.m("Download started: ", guessFileName, " (id=", enqueue);
                            m.append(")");
                            forest.d(m.toString(), new Object[0]);
                        }
                    });
                    webView.loadUrl(str2);
                    mutableState.setValue(webView);
                }
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                if (webView != null) {
                    frameLayout.addView(webView);
                }
                return frameLayout;
            default:
                List list = (List) obj7;
                Integer num = (Integer) obj6;
                InstrumentQueries instrumentQueries = (InstrumentQueries) obj5;
                ReleaseState releaseState = (ReleaseState) obj4;
                List list2 = (List) obj3;
                String str3 = (String) obj2;
                AndroidStatement androidStatement = (AndroidStatement) obj;
                Request$Priority$EnumUnboxingLocalUtility.m(androidStatement, 0, str2, 1, str);
                androidStatement.bindString(2, (String) obj8);
                androidStatement.bindBytes(3, list != null ? (byte[]) ((ExpressivePaymentsStickerConfig.Adapter) instrumentQueries.instrumentAdapter).effectsAdapter.encode(list) : null);
                if (num != null) {
                    int intValue = num.intValue();
                    ((ExpressivePaymentsStickerConfig.Adapter) instrumentQueries.instrumentAdapter).getClass();
                    l = Long.valueOf(intValue);
                } else {
                    l = null;
                }
                androidStatement.bindLong(4, l);
                androidStatement.bindString(5, (String) ((ExpressivePaymentsStickerConfig.Adapter) instrumentQueries.instrumentAdapter).release_stateAdapter.encode(releaseState));
                androidStatement.bindBytes(6, list2 != null ? (byte[]) ((ExpressivePaymentsStickerConfig.Adapter) instrumentQueries.instrumentAdapter).tagsAdapter.encode(list2) : null);
                androidStatement.bindBoolean(7, Boolean.valueOf(this.f$5));
                androidStatement.bindString(8, str3);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ WorkWebViewKt$$ExternalSyntheticLambda8(String str, String str2, String str3, List list, Integer num, InstrumentQueries instrumentQueries, ReleaseState releaseState, List list2, boolean z, String str4) {
        this.f$3 = str;
        this.f$4 = str2;
        this.f$0 = str3;
        this.f$1 = list;
        this.f$2 = num;
        this.f$6 = instrumentQueries;
        this.f$7 = releaseState;
        this.f$8 = list2;
        this.f$5 = z;
        this.f$9 = str4;
    }
}
