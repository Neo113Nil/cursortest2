package com.onesignal.inAppMessages.internal.display.impl;

import android.app.Activity;
import android.os.Build;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.facebook.common.util.UriUtil;
import com.facebook.react.uimanager.ViewProps;
import com.onesignal.common.AndroidUtils;
import com.onesignal.common.JSONObjectExtensionsKt;
import com.onesignal.common.ViewUtils;
import com.onesignal.common.threading.ThreadUtilsKt;
import com.onesignal.core.internal.application.IActivityLifecycleHandler;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.debug.LogLevel;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.inAppMessages.internal.InAppMessage;
import com.onesignal.inAppMessages.internal.InAppMessageClickResult;
import com.onesignal.inAppMessages.internal.InAppMessageContent;
import com.onesignal.inAppMessages.internal.InAppMessagePage;
import com.onesignal.inAppMessages.internal.display.impl.InAppMessageView;
import com.onesignal.inAppMessages.internal.lifecycle.IInAppLifecycleService;
import com.onesignal.inAppMessages.internal.prompt.IInAppMessagePromptFactory;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import kotlin.text.Typography;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: WebViewManager.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0000\u0018\u0000 >2\u00020\u0001:\u0003>?@B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u0006\u0010\u001d\u001a\u00020\u001eJ\u0012\u0010\u001f\u001a\u00020\u00122\b\u0010 \u001a\u0004\u0018\u00010\u0012H\u0002J\u000e\u0010!\u001a\u00020\u001eH\u0082@¢\u0006\u0002\u0010\"J\u000e\u0010#\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020\u0010J\u000e\u0010%\u001a\u00020\u001eH\u0086@¢\u0006\u0002\u0010\"J\b\u0010&\u001a\u00020\u001eH\u0002J\u0010\u0010'\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\u0010\u0010(\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\u0010\u0010)\u001a\u00020\u001e2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010*\u001a\u00020\u001e2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010+\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010,\u001a\u00020-H\u0002J\u0010\u0010.\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020/H\u0007J\u0016\u00100\u001a\u00020\u001e2\u0006\u00101\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005J\u0012\u00102\u001a\u00020\u001e2\b\u00103\u001a\u0004\u0018\u00010\u0018H\u0002J\u0010\u00104\u001a\u00020\u001e2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J&\u00105\u001a\u00020\u001e2\u0006\u00106\u001a\u00020\u00052\u0006\u00107\u001a\u00020\u00122\u0006\u00108\u001a\u00020\u0010H\u0086@¢\u0006\u0002\u00109J\u0018\u0010:\u001a\u00020\u001e2\b\u0010;\u001a\u0004\u0018\u00010\u0015H\u0082@¢\u0006\u0002\u0010<J\u000e\u0010=\u001a\u00020\u001eH\u0082@¢\u0006\u0002\u0010\"R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006A"}, d2 = {"Lcom/onesignal/inAppMessages/internal/display/impl/WebViewManager;", "Lcom/onesignal/core/internal/application/IActivityLifecycleHandler;", "message", "Lcom/onesignal/inAppMessages/internal/InAppMessage;", "activity", "Landroid/app/Activity;", "messageContent", "Lcom/onesignal/inAppMessages/internal/InAppMessageContent;", "_lifecycle", "Lcom/onesignal/inAppMessages/internal/lifecycle/IInAppLifecycleService;", "_applicationService", "Lcom/onesignal/core/internal/application/IApplicationService;", "_promptFactory", "Lcom/onesignal/inAppMessages/internal/prompt/IInAppMessagePromptFactory;", "(Lcom/onesignal/inAppMessages/internal/InAppMessage;Landroid/app/Activity;Lcom/onesignal/inAppMessages/internal/InAppMessageContent;Lcom/onesignal/inAppMessages/internal/lifecycle/IInAppLifecycleService;Lcom/onesignal/core/internal/application/IApplicationService;Lcom/onesignal/inAppMessages/internal/prompt/IInAppMessagePromptFactory;)V", "closing", "", "currentActivityName", "", "dismissFired", "lastPageHeight", "", "Ljava/lang/Integer;", "messageView", "Lcom/onesignal/inAppMessages/internal/display/impl/InAppMessageView;", "messageViewMutex", "Lkotlinx/coroutines/sync/Mutex;", "webView", "Lcom/onesignal/inAppMessages/internal/display/impl/OSWebView;", "backgroundDismissAndAwaitNextMessage", "", "bodySnippet", "body", "calculateHeightAndShowWebViewAfterNewActivity", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createNewInAppMessageView", WebViewManager.IAM_DRAG_TO_DISMISS_DISABLED_KEY, "dismissAndAwaitNextMessage", "enableWebViewRemoteDebugging", "getWebViewMaxSizeX", "getWebViewMaxSizeY", "onActivityAvailable", "onActivityStopped", "pageRectToViewHeight", "jsonObject", "Lorg/json/JSONObject;", "secureSetup", "Landroid/webkit/WebView;", "setContentSafeAreaInsets", UriUtil.LOCAL_CONTENT_SCHEME, "setMessageView", "view", "setWebViewToMaxSize", "setupWebView", "currentActivity", "base64Message", "isFullScreen", "(Landroid/app/Activity;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "showMessageView", "newHeight", "(Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateSafeAreaInsets", "Companion", "OSJavaScriptInterface", "Position", "com.onesignal.inAppMessages"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WebViewManager implements IActivityLifecycleHandler {
    public static final String EVENT_TYPE_ACTION_TAKEN = "action_taken";
    public static final String EVENT_TYPE_KEY = "type";
    public static final String EVENT_TYPE_PAGE_CHANGE = "page_change";
    public static final String EVENT_TYPE_RENDERING_COMPLETE = "rendering_complete";
    public static final String EVENT_TYPE_RESIZE = "resize";
    public static final String GET_PAGE_META_DATA_JS_FUNCTION = "getPageMetaData()";
    public static final String IAM_DISPLAY_LOCATION_KEY = "displayLocation";
    public static final String IAM_DRAG_TO_DISMISS_DISABLED_KEY = "dragToDismissDisabled";
    public static final String IAM_PAGE_META_DATA_KEY = "pageMetaData";
    public static final String JS_OBJ_NAME = "OSAndroid";
    private static final int LOG_BODY_SNIPPET_MAX_CHARS = 200;
    public static final String SAFE_AREA_JS_OBJECT = "{\n   top: %d,\n   bottom: %d,\n   right: %d,\n   left: %d,\n}";
    public static final String SET_SAFE_AREA_INSETS_JS_FUNCTION = "setSafeAreaInsets(%s)";
    public static final String SET_SAFE_AREA_INSETS_SCRIPT = "\n\n<script>\n    setSafeAreaInsets(%s);\n</script>";
    private final IApplicationService _applicationService;
    private final IInAppLifecycleService _lifecycle;
    private final IInAppMessagePromptFactory _promptFactory;
    private Activity activity;
    private boolean closing;
    private String currentActivityName;
    private boolean dismissFired;
    private Integer lastPageHeight;
    private final InAppMessage message;
    private final InAppMessageContent messageContent;
    private InAppMessageView messageView;
    private final Mutex messageViewMutex;
    private OSWebView webView;
    private static final int MARGIN_PX_SIZE = ViewUtils.INSTANCE.dpToPx(24);

    public WebViewManager(InAppMessage message, Activity activity, InAppMessageContent messageContent, IInAppLifecycleService _lifecycle, IApplicationService _applicationService, IInAppMessagePromptFactory _promptFactory) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(messageContent, "messageContent");
        Intrinsics.checkNotNullParameter(_lifecycle, "_lifecycle");
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_promptFactory, "_promptFactory");
        this.message = message;
        this.activity = activity;
        this.messageContent = messageContent;
        this._lifecycle = _lifecycle;
        this._applicationService = _applicationService;
        this._promptFactory = _promptFactory;
        this.messageViewMutex = MutexKt.Mutex$default(false, 1, null);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WebViewManager.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/onesignal/inAppMessages/internal/display/impl/WebViewManager$Position;", "", "(Ljava/lang/String;I)V", "isBanner", "", "()Z", "TOP_BANNER", "BOTTOM_BANNER", "CENTER_MODAL", "FULL_SCREEN", "com.onesignal.inAppMessages"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Position {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Position[] $VALUES;
        public static final Position TOP_BANNER = new Position("TOP_BANNER", 0);
        public static final Position BOTTOM_BANNER = new Position("BOTTOM_BANNER", 1);
        public static final Position CENTER_MODAL = new Position("CENTER_MODAL", 2);
        public static final Position FULL_SCREEN = new Position("FULL_SCREEN", 3);

        /* compiled from: WebViewManager.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Position.values().length];
                try {
                    iArr[Position.TOP_BANNER.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Position.BOTTOM_BANNER.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private static final /* synthetic */ Position[] $values() {
            return new Position[]{TOP_BANNER, BOTTOM_BANNER, CENTER_MODAL, FULL_SCREEN};
        }

        public static EnumEntries<Position> getEntries() {
            return $ENTRIES;
        }

        public static Position valueOf(String str) {
            return (Position) Enum.valueOf(Position.class, str);
        }

        public static Position[] values() {
            return (Position[]) $VALUES.clone();
        }

        private Position(String str, int i) {
        }

        static {
            Position[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        public final boolean isBanner() {
            int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
            return i == 1 || i == 2;
        }
    }

    /* compiled from: WebViewManager.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007¨\u0006\u0012"}, d2 = {"Lcom/onesignal/inAppMessages/internal/display/impl/WebViewManager$OSJavaScriptInterface;", "", "(Lcom/onesignal/inAppMessages/internal/display/impl/WebViewManager;)V", "getDisplayLocation", "Lcom/onesignal/inAppMessages/internal/display/impl/WebViewManager$Position;", "jsonObject", "Lorg/json/JSONObject;", "getDragToDismissDisabled", "", "getPageHeightData", "", "handleActionTaken", "", "handlePageChange", "handleRenderComplete", "postMessage", "message", "", "com.onesignal.inAppMessages"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class OSJavaScriptInterface {
        public OSJavaScriptInterface() {
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @JavascriptInterface
        public final void postMessage(String message) {
            InAppMessageView inAppMessageView;
            Intrinsics.checkNotNullParameter(message, "message");
            try {
                Logging.debug$default("OSJavaScriptInterface:postMessage: " + message, null, 2, null);
                JSONObject jSONObject = new JSONObject(message);
                String string = jSONObject.getString(WebViewManager.EVENT_TYPE_KEY);
                if (string != null) {
                    switch (string.hashCode()) {
                        case -1484226720:
                            if (!string.equals(WebViewManager.EVENT_TYPE_PAGE_CHANGE)) {
                                break;
                            } else {
                                handlePageChange(jSONObject);
                                break;
                            }
                        case -934437708:
                            string.equals(WebViewManager.EVENT_TYPE_RESIZE);
                            break;
                        case 42998156:
                            if (string.equals(WebViewManager.EVENT_TYPE_RENDERING_COMPLETE)) {
                                handleRenderComplete(jSONObject);
                                break;
                            }
                            break;
                        case 1851145598:
                            if (string.equals(WebViewManager.EVENT_TYPE_ACTION_TAKEN) && (inAppMessageView = WebViewManager.this.messageView) != null && !inAppMessageView.getIsDragging()) {
                                handleActionTaken(jSONObject);
                                break;
                            }
                            break;
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        private final void handleRenderComplete(JSONObject jsonObject) {
            Position displayLocation = getDisplayLocation(jsonObject);
            int pageHeightData = displayLocation == Position.FULL_SCREEN ? -1 : getPageHeightData(jsonObject);
            boolean dragToDismissDisabled = getDragToDismissDisabled(jsonObject);
            WebViewManager.this.messageContent.setDisplayLocation(displayLocation);
            WebViewManager.this.messageContent.setPageHeight(pageHeightData);
            WebViewManager.this.createNewInAppMessageView(dragToDismissDisabled);
        }

        private final int getPageHeightData(JSONObject jsonObject) {
            try {
                WebViewManager webViewManager = WebViewManager.this;
                Activity activity = webViewManager.activity;
                JSONObject jSONObject = jsonObject.getJSONObject(WebViewManager.IAM_PAGE_META_DATA_KEY);
                Intrinsics.checkNotNullExpressionValue(jSONObject, "getJSONObject(...)");
                return webViewManager.pageRectToViewHeight(activity, jSONObject);
            } catch (JSONException unused) {
                return -1;
            }
        }

        private final Position getDisplayLocation(JSONObject jsonObject) {
            Position position = Position.FULL_SCREEN;
            try {
                if (jsonObject.has(WebViewManager.IAM_DISPLAY_LOCATION_KEY) && !Intrinsics.areEqual(jsonObject.get(WebViewManager.IAM_DISPLAY_LOCATION_KEY), "")) {
                    String optString = jsonObject.optString(WebViewManager.IAM_DISPLAY_LOCATION_KEY, "FULL_SCREEN");
                    Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
                    Locale locale = Locale.getDefault();
                    Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
                    String upperCase = optString.toUpperCase(locale);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                    return Position.valueOf(upperCase);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return position;
        }

        private final boolean getDragToDismissDisabled(JSONObject jsonObject) {
            try {
                return jsonObject.getBoolean(WebViewManager.IAM_DRAG_TO_DISMISS_DISABLED_KEY);
            } catch (JSONException unused) {
                return false;
            }
        }

        private final void handleActionTaken(JSONObject jsonObject) throws JSONException {
            JSONObject jSONObject = jsonObject.getJSONObject("body");
            Intrinsics.checkNotNull(jSONObject);
            String safeString = JSONObjectExtensionsKt.safeString(jSONObject, "id");
            WebViewManager.this.closing = jSONObject.getBoolean("close");
            if (WebViewManager.this.message.getIsPreview()) {
                WebViewManager.this._lifecycle.messageActionOccurredOnPreview(WebViewManager.this.message, new InAppMessageClickResult(jSONObject, WebViewManager.this._promptFactory));
            } else if (safeString != null) {
                WebViewManager.this._lifecycle.messageActionOccurredOnMessage(WebViewManager.this.message, new InAppMessageClickResult(jSONObject, WebViewManager.this._promptFactory));
            }
            if (WebViewManager.this.closing) {
                WebViewManager.this.backgroundDismissAndAwaitNextMessage();
            }
        }

        private final void handlePageChange(JSONObject jsonObject) throws JSONException {
            WebViewManager.this._lifecycle.messagePageChanged(WebViewManager.this.message, new InAppMessagePage(jsonObject));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int pageRectToViewHeight(Activity activity, JSONObject jsonObject) {
        JSONObject optJSONObject = jsonObject.optJSONObject("rect");
        int optInt = optJSONObject != null ? optJSONObject.optInt(ViewProps.HEIGHT, -1) : -1;
        if (optInt < 0) {
            Logging.warn$default("pageRectToViewHeight could not get page height (missing/invalid 'rect.height'); snippet=" + bodySnippet(jsonObject.toString()), null, 2, null);
            return -1;
        }
        int dpToPx = ViewUtils.INSTANCE.dpToPx(optInt);
        Logging.debug$default("getPageHeightData:pxHeight: " + dpToPx, null, 2, null);
        int webViewMaxSizeY = getWebViewMaxSizeY(activity);
        if (dpToPx <= webViewMaxSizeY) {
            return dpToPx;
        }
        Logging.debug$default("getPageHeightData:pxHeight is over screen max: " + webViewMaxSizeY, null, 2, null);
        return webViewMaxSizeY;
    }

    private final String bodySnippet(String body) {
        String str = body;
        if (str == null || str.length() == 0) {
            return "<empty>";
        }
        String replace$default = StringsKt.replace$default(StringsKt.replace$default(body, '\n', ' ', false, 4, (Object) null), '\r', ' ', false, 4, (Object) null);
        return replace$default.length() <= 200 ? replace$default : StringsKt.take(replace$default, 200) + Typography.ellipsis;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object updateSafeAreaInsets(Continuation<? super Unit> continuation) {
        Object withContext = BuildersKt.withContext(Dispatchers.getMain(), new WebViewManager$updateSafeAreaInsets$2(this, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006d, code lost:
    
        if (showMessageView(null, r0) == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object calculateHeightAndShowWebViewAfterNewActivity(Continuation<? super Unit> continuation) {
        WebViewManager$calculateHeightAndShowWebViewAfterNewActivity$1 webViewManager$calculateHeightAndShowWebViewAfterNewActivity$1;
        int i;
        final WebViewManager webViewManager;
        WebViewManager webViewManager2;
        if (continuation instanceof WebViewManager$calculateHeightAndShowWebViewAfterNewActivity$1) {
            webViewManager$calculateHeightAndShowWebViewAfterNewActivity$1 = (WebViewManager$calculateHeightAndShowWebViewAfterNewActivity$1) continuation;
            if ((webViewManager$calculateHeightAndShowWebViewAfterNewActivity$1.label & Integer.MIN_VALUE) != 0) {
                webViewManager$calculateHeightAndShowWebViewAfterNewActivity$1.label -= Integer.MIN_VALUE;
                Object obj = webViewManager$calculateHeightAndShowWebViewAfterNewActivity$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = webViewManager$calculateHeightAndShowWebViewAfterNewActivity$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    InAppMessageView inAppMessageView = this.messageView;
                    if (inAppMessageView == null) {
                        return Unit.INSTANCE;
                    }
                    Intrinsics.checkNotNull(inAppMessageView);
                    if (inAppMessageView.getDisplayPosition() == Position.FULL_SCREEN && !this.messageContent.getIsFullBleed()) {
                        webViewManager$calculateHeightAndShowWebViewAfterNewActivity$1.label = 1;
                    } else {
                        Logging.debug$default("In app message new activity, calculate height and show ", null, 2, null);
                        IApplicationService iApplicationService = this._applicationService;
                        webViewManager$calculateHeightAndShowWebViewAfterNewActivity$1.L$0 = this;
                        webViewManager$calculateHeightAndShowWebViewAfterNewActivity$1.label = 2;
                        if (iApplicationService.waitUntilActivityReady(webViewManager$calculateHeightAndShowWebViewAfterNewActivity$1) != coroutine_suspended) {
                            webViewManager = this;
                            webViewManager.setWebViewToMaxSize(webViewManager.activity);
                            if (webViewManager.messageContent.getIsFullBleed()) {
                            }
                            OSWebView oSWebView = webViewManager.webView;
                            Intrinsics.checkNotNull(oSWebView);
                            oSWebView.evaluateJavascript(GET_PAGE_META_DATA_JS_FUNCTION, new ValueCallback() { // from class: com.onesignal.inAppMessages.internal.display.impl.WebViewManager$$ExternalSyntheticLambda0
                                @Override // android.webkit.ValueCallback
                                public final void onReceiveValue(Object obj2) {
                                    WebViewManager.calculateHeightAndShowWebViewAfterNewActivity$lambda$0(WebViewManager.this, (String) obj2);
                                }
                            });
                            return Unit.INSTANCE;
                        }
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    webViewManager2 = (WebViewManager) webViewManager$calculateHeightAndShowWebViewAfterNewActivity$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    webViewManager = webViewManager2;
                    OSWebView oSWebView2 = webViewManager.webView;
                    Intrinsics.checkNotNull(oSWebView2);
                    oSWebView2.evaluateJavascript(GET_PAGE_META_DATA_JS_FUNCTION, new ValueCallback() { // from class: com.onesignal.inAppMessages.internal.display.impl.WebViewManager$$ExternalSyntheticLambda0
                        @Override // android.webkit.ValueCallback
                        public final void onReceiveValue(Object obj2) {
                            WebViewManager.calculateHeightAndShowWebViewAfterNewActivity$lambda$0(WebViewManager.this, (String) obj2);
                        }
                    });
                    return Unit.INSTANCE;
                }
                webViewManager = (WebViewManager) webViewManager$calculateHeightAndShowWebViewAfterNewActivity$1.L$0;
                ResultKt.throwOnFailure(obj);
                webViewManager.setWebViewToMaxSize(webViewManager.activity);
                if (webViewManager.messageContent.getIsFullBleed()) {
                    webViewManager$calculateHeightAndShowWebViewAfterNewActivity$1.L$0 = webViewManager;
                    webViewManager$calculateHeightAndShowWebViewAfterNewActivity$1.label = 3;
                    if (webViewManager.updateSafeAreaInsets(webViewManager$calculateHeightAndShowWebViewAfterNewActivity$1) != coroutine_suspended) {
                        webViewManager2 = webViewManager;
                        webViewManager = webViewManager2;
                    }
                    return coroutine_suspended;
                }
                OSWebView oSWebView22 = webViewManager.webView;
                Intrinsics.checkNotNull(oSWebView22);
                oSWebView22.evaluateJavascript(GET_PAGE_META_DATA_JS_FUNCTION, new ValueCallback() { // from class: com.onesignal.inAppMessages.internal.display.impl.WebViewManager$$ExternalSyntheticLambda0
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(Object obj2) {
                        WebViewManager.calculateHeightAndShowWebViewAfterNewActivity$lambda$0(WebViewManager.this, (String) obj2);
                    }
                });
                return Unit.INSTANCE;
            }
        }
        webViewManager$calculateHeightAndShowWebViewAfterNewActivity$1 = new WebViewManager$calculateHeightAndShowWebViewAfterNewActivity$1(this, continuation);
        Object obj2 = webViewManager$calculateHeightAndShowWebViewAfterNewActivity$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = webViewManager$calculateHeightAndShowWebViewAfterNewActivity$1.label;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void calculateHeightAndShowWebViewAfterNewActivity$lambda$0(WebViewManager this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String str2 = str;
        if (str2 == null || StringsKt.isBlank(str2) || Intrinsics.areEqual(str, AbstractJsonLexerKt.NULL)) {
            Logging.warn$default("calculateHeightAndShowWebViewAfterNewActivity: empty/null page metadata from WebView; skipping height update", null, 2, null);
            return;
        }
        try {
            ThreadUtilsKt.suspendifyOnIO(new WebViewManager$calculateHeightAndShowWebViewAfterNewActivity$2$1(this$0, this$0.pageRectToViewHeight(this$0.activity, new JSONObject(str)), null));
        } catch (JSONException e) {
            Logging.warn("calculateHeightAndShowWebViewAfterNewActivity: could not parse page metadata; snippet=" + this$0.bodySnippet(str), e);
        }
    }

    @Override // com.onesignal.core.internal.application.IActivityLifecycleHandler
    public void onActivityAvailable(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        String str = this.currentActivityName;
        this.activity = activity;
        this.currentActivityName = activity.getLocalClassName();
        Logging.debug$default("In app message activity available currentActivityName: " + this.currentActivityName + " lastActivityName: " + str, null, 2, null);
        ThreadUtilsKt.suspendifyOnMain(new WebViewManager$onActivityAvailable$1(str, this, null));
    }

    @Override // com.onesignal.core.internal.application.IActivityLifecycleHandler
    public void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Logging.debug$default(StringsKt.trimIndent("\n            In app message activity stopped, cleaning views, currentActivityName: " + this.currentActivityName + "\n            activity: " + this.activity + "\n            messageView: " + this.messageView + "\n            "), null, 2, null);
        if (this.messageView == null || !Intrinsics.areEqual(activity.getLocalClassName(), this.currentActivityName)) {
            return;
        }
        InAppMessageView inAppMessageView = this.messageView;
        Intrinsics.checkNotNull(inAppMessageView);
        inAppMessageView.removeAllViews();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00f6, code lost:
    
        if (r11.checkIfShouldDismiss(r1) == r2) goto L56;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ea A[Catch: all -> 0x005d, TryCatch #0 {all -> 0x005d, blocks: (B:14:0x0036, B:15:0x00f9, B:22:0x004b, B:23:0x00e6, B:25:0x00ea, B:29:0x0058, B:30:0x00d1, B:32:0x00d5, B:36:0x0088, B:38:0x008c, B:41:0x0097, B:43:0x00ab, B:45:0x00b7, B:47:0x00bd), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d5 A[Catch: all -> 0x005d, TryCatch #0 {all -> 0x005d, blocks: (B:14:0x0036, B:15:0x00f9, B:22:0x004b, B:23:0x00e6, B:25:0x00ea, B:29:0x0058, B:30:0x00d1, B:32:0x00d5, B:36:0x0088, B:38:0x008c, B:41:0x0097, B:43:0x00ab, B:45:0x00b7, B:47:0x00bd), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008c A[Catch: all -> 0x005d, TRY_LEAVE, TryCatch #0 {all -> 0x005d, blocks: (B:14:0x0036, B:15:0x00f9, B:22:0x004b, B:23:0x00e6, B:25:0x00ea, B:29:0x0058, B:30:0x00d1, B:32:0x00d5, B:36:0x0088, B:38:0x008c, B:41:0x0097, B:43:0x00ab, B:45:0x00b7, B:47:0x00bd), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0097 A[Catch: all -> 0x005d, TRY_ENTER, TryCatch #0 {all -> 0x005d, blocks: (B:14:0x0036, B:15:0x00f9, B:22:0x004b, B:23:0x00e6, B:25:0x00ea, B:29:0x0058, B:30:0x00d1, B:32:0x00d5, B:36:0x0088, B:38:0x008c, B:41:0x0097, B:43:0x00ab, B:45:0x00b7, B:47:0x00bd), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object showMessageView(Integer num, Continuation<? super Unit> continuation) {
        WebViewManager$showMessageView$1 webViewManager$showMessageView$1;
        int i;
        WebViewManager webViewManager;
        Integer num2;
        Mutex mutex;
        WebViewManager webViewManager2;
        InAppMessageView inAppMessageView;
        InAppMessageView inAppMessageView2;
        try {
            if (continuation instanceof WebViewManager$showMessageView$1) {
                webViewManager$showMessageView$1 = (WebViewManager$showMessageView$1) continuation;
                if ((webViewManager$showMessageView$1.label & Integer.MIN_VALUE) != 0) {
                    webViewManager$showMessageView$1.label -= Integer.MIN_VALUE;
                    Object obj = webViewManager$showMessageView$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = webViewManager$showMessageView$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        Mutex mutex2 = this.messageViewMutex;
                        webViewManager$showMessageView$1.L$0 = this;
                        webViewManager$showMessageView$1.L$1 = num;
                        webViewManager$showMessageView$1.L$2 = mutex2;
                        webViewManager$showMessageView$1.label = 1;
                        if (mutex2.lock(null, webViewManager$showMessageView$1) != coroutine_suspended) {
                            webViewManager = this;
                            num2 = num;
                            mutex = mutex2;
                        }
                        return coroutine_suspended;
                    }
                    if (i != 1) {
                        if (i == 2) {
                            mutex = (Mutex) webViewManager$showMessageView$1.L$1;
                            webViewManager2 = (WebViewManager) webViewManager$showMessageView$1.L$0;
                            ResultKt.throwOnFailure(obj);
                            inAppMessageView = webViewManager2.messageView;
                            if (inAppMessageView != null) {
                                Activity activity = webViewManager2.activity;
                                webViewManager$showMessageView$1.L$0 = webViewManager2;
                                webViewManager$showMessageView$1.L$1 = mutex;
                                webViewManager$showMessageView$1.L$2 = null;
                                webViewManager$showMessageView$1.label = 3;
                                if (inAppMessageView.showView(activity, webViewManager$showMessageView$1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            inAppMessageView2 = webViewManager2.messageView;
                            if (inAppMessageView2 != null) {
                            }
                            mutex.unlock(null);
                            return Unit.INSTANCE;
                        }
                        if (i != 3) {
                            if (i != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            mutex = (Mutex) webViewManager$showMessageView$1.L$0;
                            ResultKt.throwOnFailure(obj);
                            Unit unit = Unit.INSTANCE;
                            mutex.unlock(null);
                            return Unit.INSTANCE;
                        }
                        mutex = (Mutex) webViewManager$showMessageView$1.L$1;
                        webViewManager2 = (WebViewManager) webViewManager$showMessageView$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        inAppMessageView2 = webViewManager2.messageView;
                        if (inAppMessageView2 != null) {
                            webViewManager$showMessageView$1.L$0 = mutex;
                            webViewManager$showMessageView$1.L$1 = null;
                            webViewManager$showMessageView$1.L$2 = null;
                            webViewManager$showMessageView$1.label = 4;
                        }
                        mutex.unlock(null);
                        return Unit.INSTANCE;
                    }
                    mutex = (Mutex) webViewManager$showMessageView$1.L$2;
                    num2 = (Integer) webViewManager$showMessageView$1.L$1;
                    webViewManager = (WebViewManager) webViewManager$showMessageView$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    if (webViewManager.messageView != null) {
                        Logging.warn$default("No messageView found to update a with a new height.", null, 2, null);
                        Unit unit2 = Unit.INSTANCE;
                        mutex.unlock(null);
                        return unit2;
                    }
                    Logging.debug$default("In app message, showing first one with height: " + num2, null, 2, null);
                    InAppMessageView inAppMessageView3 = webViewManager.messageView;
                    if (inAppMessageView3 != null) {
                        OSWebView oSWebView = webViewManager.webView;
                        Intrinsics.checkNotNull(oSWebView);
                        inAppMessageView3.setWebView(oSWebView);
                    }
                    if (num2 != null) {
                        webViewManager.lastPageHeight = num2;
                        InAppMessageView inAppMessageView4 = webViewManager.messageView;
                        if (inAppMessageView4 != null) {
                            int intValue = num2.intValue();
                            webViewManager$showMessageView$1.L$0 = webViewManager;
                            webViewManager$showMessageView$1.L$1 = mutex;
                            webViewManager$showMessageView$1.L$2 = null;
                            webViewManager$showMessageView$1.label = 2;
                            if (inAppMessageView4.updateHeight(intValue, webViewManager$showMessageView$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    }
                    webViewManager2 = webViewManager;
                    inAppMessageView = webViewManager2.messageView;
                    if (inAppMessageView != null) {
                    }
                    inAppMessageView2 = webViewManager2.messageView;
                    if (inAppMessageView2 != null) {
                    }
                    mutex.unlock(null);
                    return Unit.INSTANCE;
                }
            }
            if (i != 0) {
            }
            if (webViewManager.messageView != null) {
            }
        } catch (Throwable th) {
            num.unlock(null);
            throw th;
        }
        webViewManager$showMessageView$1 = new WebViewManager$showMessageView$1(this, continuation);
        Object obj2 = webViewManager$showMessageView$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = webViewManager$showMessageView$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object setupWebView(Activity activity, String str, boolean z, Continuation<? super Unit> continuation) {
        WebViewManager$setupWebView$1 webViewManager$setupWebView$1;
        int i;
        WebViewManager webViewManager;
        if (continuation instanceof WebViewManager$setupWebView$1) {
            webViewManager$setupWebView$1 = (WebViewManager$setupWebView$1) continuation;
            if ((webViewManager$setupWebView$1.label & Integer.MIN_VALUE) != 0) {
                webViewManager$setupWebView$1.label -= Integer.MIN_VALUE;
                Object obj = webViewManager$setupWebView$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = webViewManager$setupWebView$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    enableWebViewRemoteDebugging();
                    OSWebView oSWebView = new OSWebView(activity);
                    this.webView = oSWebView;
                    Intrinsics.checkNotNull(oSWebView);
                    oSWebView.setOverScrollMode(2);
                    OSWebView oSWebView2 = this.webView;
                    Intrinsics.checkNotNull(oSWebView2);
                    oSWebView2.setVerticalScrollBarEnabled(false);
                    OSWebView oSWebView3 = this.webView;
                    Intrinsics.checkNotNull(oSWebView3);
                    oSWebView3.setHorizontalScrollBarEnabled(false);
                    OSWebView oSWebView4 = this.webView;
                    Intrinsics.checkNotNull(oSWebView4);
                    secureSetup(oSWebView4);
                    OSWebView oSWebView5 = this.webView;
                    Intrinsics.checkNotNull(oSWebView5);
                    oSWebView5.addJavascriptInterface(new OSJavaScriptInterface(), JS_OBJ_NAME);
                    if (z) {
                        OSWebView oSWebView6 = this.webView;
                        Intrinsics.checkNotNull(oSWebView6);
                        oSWebView6.setSystemUiVisibility(3074);
                        if (Build.VERSION.SDK_INT >= 30) {
                            OSWebView oSWebView7 = this.webView;
                            Intrinsics.checkNotNull(oSWebView7);
                            oSWebView7.setFitsSystemWindows(false);
                        }
                    }
                    this._lifecycle.messageWillDisplay(this.message);
                    IApplicationService iApplicationService = this._applicationService;
                    webViewManager$setupWebView$1.L$0 = this;
                    webViewManager$setupWebView$1.L$1 = activity;
                    webViewManager$setupWebView$1.L$2 = str;
                    webViewManager$setupWebView$1.label = 1;
                    if (iApplicationService.waitUntilActivityReady(webViewManager$setupWebView$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    webViewManager = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) webViewManager$setupWebView$1.L$2;
                    activity = (Activity) webViewManager$setupWebView$1.L$1;
                    webViewManager = (WebViewManager) webViewManager$setupWebView$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                webViewManager.setWebViewToMaxSize(activity);
                OSWebView oSWebView8 = webViewManager.webView;
                Intrinsics.checkNotNull(oSWebView8);
                oSWebView8.loadData(str, "text/html; charset=utf-8", "base64");
                return Unit.INSTANCE;
            }
        }
        webViewManager$setupWebView$1 = new WebViewManager$setupWebView$1(this, continuation);
        Object obj2 = webViewManager$setupWebView$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = webViewManager$setupWebView$1.label;
        if (i != 0) {
        }
        webViewManager.setWebViewToMaxSize(activity);
        OSWebView oSWebView82 = webViewManager.webView;
        Intrinsics.checkNotNull(oSWebView82);
        oSWebView82.loadData(str, "text/html; charset=utf-8", "base64");
        return Unit.INSTANCE;
    }

    public final void secureSetup(WebView webView) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setMixedContentMode(1);
    }

    private final void setWebViewToMaxSize(Activity activity) {
        OSWebView oSWebView = this.webView;
        Intrinsics.checkNotNull(oSWebView);
        oSWebView.layout(0, 0, getWebViewMaxSizeX(activity), getWebViewMaxSizeY(activity));
    }

    private final void setMessageView(InAppMessageView view) {
        this.messageView = view;
    }

    public final void createNewInAppMessageView(boolean dragToDismissDisabled) {
        this.lastPageHeight = Integer.valueOf(this.messageContent.getPageHeight());
        boolean manifestMetaBoolean = AndroidUtils.INSTANCE.getManifestMetaBoolean(this._applicationService.getAppContext(), "com.onesignal.inAppMessageHideGrayOverlay");
        OSWebView oSWebView = this.webView;
        Intrinsics.checkNotNull(oSWebView);
        setMessageView(new InAppMessageView(oSWebView, this.messageContent, dragToDismissDisabled, manifestMetaBoolean));
        InAppMessageView inAppMessageView = this.messageView;
        Intrinsics.checkNotNull(inAppMessageView);
        inAppMessageView.setMessageController(new InAppMessageView.InAppMessageViewListener() { // from class: com.onesignal.inAppMessages.internal.display.impl.WebViewManager$createNewInAppMessageView$1
            @Override // com.onesignal.inAppMessages.internal.display.impl.InAppMessageView.InAppMessageViewListener
            public void onMessageWasDisplayed() {
                WebViewManager.this._lifecycle.messageWasDisplayed(WebViewManager.this.message);
            }

            @Override // com.onesignal.inAppMessages.internal.display.impl.InAppMessageView.InAppMessageViewListener
            public void onMessageWillDismiss() {
                WebViewManager.this._lifecycle.messageWillDismiss(WebViewManager.this.message);
            }

            @Override // com.onesignal.inAppMessages.internal.display.impl.InAppMessageView.InAppMessageViewListener
            public void onMessageWasDismissed() {
                IApplicationService iApplicationService;
                WebViewManager.this._lifecycle.messageWasDismissed(WebViewManager.this.message);
                iApplicationService = WebViewManager.this._applicationService;
                iApplicationService.removeActivityLifecycleHandler(this);
            }
        });
        this._applicationService.addActivityLifecycleHandler(this);
    }

    private final int getWebViewMaxSizeX(Activity activity) {
        if (this.messageContent.getIsFullBleed()) {
            return ViewUtils.INSTANCE.getFullbleedWindowWidth(activity);
        }
        return ViewUtils.INSTANCE.getWindowWidth(activity) - (MARGIN_PX_SIZE * 2);
    }

    private final int getWebViewMaxSizeY(Activity activity) {
        return ViewUtils.INSTANCE.getWindowHeight(activity) - (this.messageContent.getIsFullBleed() ? 0 : MARGIN_PX_SIZE * 2);
    }

    public final void backgroundDismissAndAwaitNextMessage() {
        ThreadUtilsKt.suspendifyOnDefault(new WebViewManager$backgroundDismissAndAwaitNextMessage$1(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object dismissAndAwaitNextMessage(Continuation<? super Unit> continuation) {
        WebViewManager$dismissAndAwaitNextMessage$1 webViewManager$dismissAndAwaitNextMessage$1;
        int i;
        WebViewManager webViewManager;
        if (continuation instanceof WebViewManager$dismissAndAwaitNextMessage$1) {
            webViewManager$dismissAndAwaitNextMessage$1 = (WebViewManager$dismissAndAwaitNextMessage$1) continuation;
            if ((webViewManager$dismissAndAwaitNextMessage$1.label & Integer.MIN_VALUE) != 0) {
                webViewManager$dismissAndAwaitNextMessage$1.label -= Integer.MIN_VALUE;
                Object obj = webViewManager$dismissAndAwaitNextMessage$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = webViewManager$dismissAndAwaitNextMessage$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    InAppMessageView inAppMessageView = this.messageView;
                    if (inAppMessageView == null || this.dismissFired) {
                        return Unit.INSTANCE;
                    }
                    this.dismissFired = true;
                    this._lifecycle.messageWillDismiss(this.message);
                    webViewManager$dismissAndAwaitNextMessage$1.L$0 = this;
                    webViewManager$dismissAndAwaitNextMessage$1.label = 1;
                    if (inAppMessageView.dismissAndAwaitNextMessage(webViewManager$dismissAndAwaitNextMessage$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    webViewManager = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    webViewManager = (WebViewManager) webViewManager$dismissAndAwaitNextMessage$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                webViewManager.dismissFired = false;
                webViewManager.setMessageView(null);
                return Unit.INSTANCE;
            }
        }
        webViewManager$dismissAndAwaitNextMessage$1 = new WebViewManager$dismissAndAwaitNextMessage$1(this, continuation);
        Object obj2 = webViewManager$dismissAndAwaitNextMessage$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = webViewManager$dismissAndAwaitNextMessage$1.label;
        if (i != 0) {
        }
        webViewManager.dismissFired = false;
        webViewManager.setMessageView(null);
        return Unit.INSTANCE;
    }

    public final void setContentSafeAreaInsets(InAppMessageContent content, Activity activity) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(activity, "activity");
        String contentHtml = content.getContentHtml();
        int[] cutoutAndStatusBarInsets = ViewUtils.INSTANCE.getCutoutAndStatusBarInsets(activity);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(SAFE_AREA_JS_OBJECT, Arrays.copyOf(new Object[]{Integer.valueOf(cutoutAndStatusBarInsets[0]), Integer.valueOf(cutoutAndStatusBarInsets[1]), Integer.valueOf(cutoutAndStatusBarInsets[2]), Integer.valueOf(cutoutAndStatusBarInsets[3])}, 4));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
        String format2 = String.format(SET_SAFE_AREA_INSETS_SCRIPT, Arrays.copyOf(new Object[]{format}, 1));
        Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
        content.setContentHtml(contentHtml + format2);
    }

    private final void enableWebViewRemoteDebugging() {
        if (Logging.atLogLevel(LogLevel.DEBUG)) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
    }
}
