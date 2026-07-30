package com.onesignal.inAppMessages.internal.display.impl;

import android.app.Activity;
import android.os.Build;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.onesignal.common.AndroidUtils;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.p;
import kotlin.text.t;
import n6.AbstractC0792z;
import n6.F;
import n6.InterfaceC0789w;
import org.json.JSONException;
import org.json.JSONObject;
import u6.C0953e;
import v6.InterfaceC0979a;

/* loaded from: classes.dex */
public final class m implements v2.d {
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
    private final v2.f _applicationService;
    private final S2.b _lifecycle;
    private final V2.a _promptFactory;
    private Activity activity;
    private boolean closing;
    private String currentActivityName;
    private boolean dismissFired;
    private Integer lastPageHeight;
    private final com.onesignal.inAppMessages.internal.a message;
    private final com.onesignal.inAppMessages.internal.d messageContent;
    private com.onesignal.inAppMessages.internal.display.impl.d messageView;
    private final InterfaceC0979a messageViewMutex;
    private com.onesignal.inAppMessages.internal.display.impl.i webView;
    public static final a Companion = new a(null);
    private static final int MARGIN_PX_SIZE = com.onesignal.common.m.INSTANCE.dpToPx(24);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public final class b {
        public b() {
        }

        private final c getDisplayLocation(JSONObject jSONObject) {
            c cVar = c.FULL_SCREEN;
            try {
                if (jSONObject.has(m.IAM_DISPLAY_LOCATION_KEY) && !Intrinsics.a(jSONObject.get(m.IAM_DISPLAY_LOCATION_KEY), "")) {
                    String optString = jSONObject.optString(m.IAM_DISPLAY_LOCATION_KEY, "FULL_SCREEN");
                    Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
                    Locale locale = Locale.getDefault();
                    Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
                    String upperCase = optString.toUpperCase(locale);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                    return c.valueOf(upperCase);
                }
            } catch (JSONException e7) {
                e7.printStackTrace();
            }
            return cVar;
        }

        private final boolean getDragToDismissDisabled(JSONObject jSONObject) {
            try {
                return jSONObject.getBoolean(m.IAM_DRAG_TO_DISMISS_DISABLED_KEY);
            } catch (JSONException unused) {
                return false;
            }
        }

        private final int getPageHeightData(JSONObject jSONObject) {
            try {
                m mVar = m.this;
                Activity activity = mVar.activity;
                JSONObject jSONObject2 = jSONObject.getJSONObject(m.IAM_PAGE_META_DATA_KEY);
                Intrinsics.checkNotNullExpressionValue(jSONObject2, "getJSONObject(...)");
                return mVar.pageRectToViewHeight(activity, jSONObject2);
            } catch (JSONException unused) {
                return -1;
            }
        }

        private final void handleActionTaken(JSONObject jSONObject) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("body");
            Intrinsics.b(jSONObject2);
            String safeString = com.onesignal.common.e.safeString(jSONObject2, "id");
            m.this.closing = jSONObject2.getBoolean("close");
            if (m.this.message.isPreview()) {
                m.this._lifecycle.messageActionOccurredOnPreview(m.this.message, new com.onesignal.inAppMessages.internal.c(jSONObject2, m.this._promptFactory));
            } else if (safeString != null) {
                m.this._lifecycle.messageActionOccurredOnMessage(m.this.message, new com.onesignal.inAppMessages.internal.c(jSONObject2, m.this._promptFactory));
            }
            if (m.this.closing) {
                m.this.backgroundDismissAndAwaitNextMessage();
            }
        }

        private final void handlePageChange(JSONObject jSONObject) {
            m.this._lifecycle.messagePageChanged(m.this.message, new com.onesignal.inAppMessages.internal.g(jSONObject));
        }

        private final void handleRenderComplete(JSONObject jSONObject) {
            c displayLocation = getDisplayLocation(jSONObject);
            int pageHeightData = displayLocation == c.FULL_SCREEN ? -1 : getPageHeightData(jSONObject);
            boolean dragToDismissDisabled = getDragToDismissDisabled(jSONObject);
            m.this.messageContent.setDisplayLocation(displayLocation);
            m.this.messageContent.setPageHeight(pageHeightData);
            m.this.createNewInAppMessageView(dragToDismissDisabled);
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @JavascriptInterface
        public final void postMessage(String message) {
            com.onesignal.inAppMessages.internal.display.impl.d dVar;
            Intrinsics.checkNotNullParameter(message, "message");
            try {
                com.onesignal.debug.internal.logging.b.debug$default("OSJavaScriptInterface:postMessage: " + message, null, 2, null);
                JSONObject jSONObject = new JSONObject(message);
                String string = jSONObject.getString(m.EVENT_TYPE_KEY);
                if (string != null) {
                    switch (string.hashCode()) {
                        case -1484226720:
                            if (!string.equals(m.EVENT_TYPE_PAGE_CHANGE)) {
                                break;
                            } else {
                                handlePageChange(jSONObject);
                                break;
                            }
                        case -934437708:
                            string.equals(m.EVENT_TYPE_RESIZE);
                            break;
                        case 42998156:
                            if (string.equals(m.EVENT_TYPE_RENDERING_COMPLETE)) {
                                handleRenderComplete(jSONObject);
                                break;
                            }
                            break;
                        case 1851145598:
                            if (string.equals(m.EVENT_TYPE_ACTION_TAKEN) && (dVar = m.this.messageView) != null && !dVar.isDragging()) {
                                handleActionTaken(jSONObject);
                                break;
                            }
                            break;
                    }
                }
            } catch (JSONException e7) {
                e7.printStackTrace();
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c {
        private static final /* synthetic */ Y5.a $ENTRIES;
        private static final /* synthetic */ c[] $VALUES;
        public static final c TOP_BANNER = new c("TOP_BANNER", 0);
        public static final c BOTTOM_BANNER = new c("BOTTOM_BANNER", 1);
        public static final c CENTER_MODAL = new c("CENTER_MODAL", 2);
        public static final c FULL_SCREEN = new c("FULL_SCREEN", 3);

        private static final /* synthetic */ c[] $values() {
            return new c[]{TOP_BANNER, BOTTOM_BANNER, CENTER_MODAL, FULL_SCREEN};
        }

        static {
            c[] $values = $values();
            $VALUES = $values;
            $ENTRIES = d4.c.o($values);
        }

        private c(String str, int i2) {
        }

        public static Y5.a getEntries() {
            return $ENTRIES;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }

        public final boolean isBanner() {
            int i2 = n.$EnumSwitchMapping$0[ordinal()];
            return i2 == 1 || i2 == 2;
        }
    }

    public static final class d extends X5.j implements Function1 {
        int label;

        public d(V5.b bVar) {
            super(1, bVar);
        }

        @Override // X5.a
        public final V5.b create(V5.b bVar) {
            return m.this.new d(bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(V5.b bVar) {
            return ((d) create(bVar)).invokeSuspend(Unit.f6114a);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            int i2 = this.label;
            if (i2 == 0) {
                V6.b.P(obj);
                m mVar = m.this;
                this.label = 1;
                if (mVar.dismissAndAwaitNextMessage(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                V6.b.P(obj);
            }
            return Unit.f6114a;
        }
    }

    public static final class e extends X5.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public e(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return m.this.calculateHeightAndShowWebViewAfterNewActivity(this);
        }
    }

    public static final class f extends X5.j implements Function1 {
        final /* synthetic */ int $pagePxHeight;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(int i2, V5.b bVar) {
            super(1, bVar);
            this.$pagePxHeight = i2;
        }

        @Override // X5.a
        public final V5.b create(V5.b bVar) {
            return m.this.new f(this.$pagePxHeight, bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(V5.b bVar) {
            return ((f) create(bVar)).invokeSuspend(Unit.f6114a);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            int i2 = this.label;
            if (i2 == 0) {
                V6.b.P(obj);
                m mVar = m.this;
                Integer num = new Integer(this.$pagePxHeight);
                this.label = 1;
                if (mVar.showMessageView(num, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                V6.b.P(obj);
            }
            return Unit.f6114a;
        }
    }

    public static final class g implements com.onesignal.inAppMessages.internal.display.impl.e {
        final /* synthetic */ m $self;

        public g(m mVar) {
            this.$self = mVar;
        }

        @Override // com.onesignal.inAppMessages.internal.display.impl.e
        public void onMessageWasDismissed() {
            m.this._lifecycle.messageWasDismissed(m.this.message);
            m.this._applicationService.removeActivityLifecycleHandler(this.$self);
        }

        @Override // com.onesignal.inAppMessages.internal.display.impl.e
        public void onMessageWasDisplayed() {
            m.this._lifecycle.messageWasDisplayed(m.this.message);
        }

        @Override // com.onesignal.inAppMessages.internal.display.impl.e
        public void onMessageWillDismiss() {
            m.this._lifecycle.messageWillDismiss(m.this.message);
        }
    }

    public static final class h extends X5.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public h(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return m.this.dismissAndAwaitNextMessage(this);
        }
    }

    public static final class i extends X5.j implements Function1 {
        final /* synthetic */ String $lastActivityName;
        int label;
        final /* synthetic */ m this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, m mVar, V5.b bVar) {
            super(1, bVar);
            this.$lastActivityName = str;
            this.this$0 = mVar;
        }

        @Override // X5.a
        public final V5.b create(V5.b bVar) {
            return new i(this.$lastActivityName, this.this$0, bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(V5.b bVar) {
            return ((i) create(bVar)).invokeSuspend(Unit.f6114a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
        
            if (r6.showMessageView(null, r5) == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0070, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
        
            if (r6.showMessageView(r1, r5) == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x006e, code lost:
        
            if (r6.calculateHeightAndShowWebViewAfterNewActivity(r5) == r0) goto L28;
         */
        @Override // X5.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            int i2 = this.label;
            if (i2 == 0) {
                V6.b.P(obj);
                String str = this.$lastActivityName;
                if (str == null) {
                    m mVar = this.this$0;
                    this.label = 1;
                } else if (Intrinsics.a(str, this.this$0.currentActivityName)) {
                    m mVar2 = this.this$0;
                    this.label = 3;
                } else if (!this.this$0.closing) {
                    if (this.this$0.messageView != null) {
                        com.onesignal.inAppMessages.internal.display.impl.d dVar = this.this$0.messageView;
                        Intrinsics.b(dVar);
                        dVar.removeAllViews();
                    }
                    m mVar3 = this.this$0;
                    Integer num = mVar3.lastPageHeight;
                    this.label = 2;
                }
            } else {
                if (i2 != 1 && i2 != 2 && i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                V6.b.P(obj);
            }
            return Unit.f6114a;
        }
    }

    public static final class j extends X5.c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public j(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return m.this.setupWebView(null, null, false, this);
        }
    }

    public static final class k extends X5.c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public k(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return m.this.showMessageView(null, this);
        }
    }

    public static final class l extends X5.j implements Function2 {
        int label;

        public l(V5.b bVar) {
            super(2, bVar);
        }

        @Override // X5.a
        public final V5.b create(Object obj, V5.b bVar) {
            return m.this.new l(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V6.b.P(obj);
            int[] cutoutAndStatusBarInsets = com.onesignal.common.m.INSTANCE.getCutoutAndStatusBarInsets(m.this.activity);
            String format = String.format(m.SAFE_AREA_JS_OBJECT, Arrays.copyOf(new Object[]{new Integer(cutoutAndStatusBarInsets[0]), new Integer(cutoutAndStatusBarInsets[1]), new Integer(cutoutAndStatusBarInsets[2]), new Integer(cutoutAndStatusBarInsets[3])}, 4));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            String format2 = String.format(m.SET_SAFE_AREA_INSETS_JS_FUNCTION, Arrays.copyOf(new Object[]{format}, 1));
            Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
            com.onesignal.inAppMessages.internal.display.impl.i iVar = m.this.webView;
            Intrinsics.b(iVar);
            iVar.evaluateJavascript(format2, null);
            return Unit.f6114a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0789w interfaceC0789w, V5.b bVar) {
            return ((l) create(interfaceC0789w, bVar)).invokeSuspend(Unit.f6114a);
        }
    }

    public m(com.onesignal.inAppMessages.internal.a message, Activity activity, com.onesignal.inAppMessages.internal.d messageContent, S2.b _lifecycle, v2.f _applicationService, V2.a _promptFactory) {
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
        this.messageViewMutex = new v6.c();
    }

    private final String bodySnippet(String str) {
        if (str == null || str.length() == 0) {
            return "<empty>";
        }
        String i2 = p.i(p.i(str, '\n', ' '), '\r', ' ');
        if (i2.length() <= LOG_BODY_SNIPPET_MAX_CHARS) {
            return i2;
        }
        return t.s(LOG_BODY_SNIPPET_MAX_CHARS, i2) + (char) 8230;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0066, code lost:
    
        if (showMessageView(null, r0) == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object calculateHeightAndShowWebViewAfterNewActivity(V5.b bVar) {
        e eVar;
        int i2;
        final m mVar;
        m mVar2;
        if (bVar instanceof e) {
            eVar = (e) bVar;
            int i5 = eVar.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                eVar.label = i5 - Integer.MIN_VALUE;
                Object obj = eVar.result;
                W5.a aVar = W5.a.f2787d;
                i2 = eVar.label;
                if (i2 != 0) {
                    V6.b.P(obj);
                    com.onesignal.inAppMessages.internal.display.impl.d dVar = this.messageView;
                    if (dVar == null) {
                        return Unit.f6114a;
                    }
                    if (dVar.getDisplayPosition() != c.FULL_SCREEN || this.messageContent.isFullBleed()) {
                        com.onesignal.debug.internal.logging.b.debug$default("In app message new activity, calculate height and show ", null, 2, null);
                        v2.f fVar = this._applicationService;
                        eVar.L$0 = this;
                        eVar.label = 2;
                        if (fVar.waitUntilActivityReady(eVar) != aVar) {
                            mVar = this;
                            mVar.setWebViewToMaxSize(mVar.activity);
                            if (mVar.messageContent.isFullBleed()) {
                            }
                            com.onesignal.inAppMessages.internal.display.impl.i iVar = mVar.webView;
                            Intrinsics.b(iVar);
                            iVar.evaluateJavascript(GET_PAGE_META_DATA_JS_FUNCTION, new ValueCallback() { // from class: com.onesignal.inAppMessages.internal.display.impl.l
                                @Override // android.webkit.ValueCallback
                                public final void onReceiveValue(Object obj2) {
                                    m.calculateHeightAndShowWebViewAfterNewActivity$lambda$0(m.this, (String) obj2);
                                }
                            });
                            return Unit.f6114a;
                        }
                    } else {
                        eVar.label = 1;
                    }
                    return aVar;
                }
                if (i2 == 1) {
                    V6.b.P(obj);
                    return Unit.f6114a;
                }
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mVar2 = (m) eVar.L$0;
                    V6.b.P(obj);
                    mVar = mVar2;
                    com.onesignal.inAppMessages.internal.display.impl.i iVar2 = mVar.webView;
                    Intrinsics.b(iVar2);
                    iVar2.evaluateJavascript(GET_PAGE_META_DATA_JS_FUNCTION, new ValueCallback() { // from class: com.onesignal.inAppMessages.internal.display.impl.l
                        @Override // android.webkit.ValueCallback
                        public final void onReceiveValue(Object obj2) {
                            m.calculateHeightAndShowWebViewAfterNewActivity$lambda$0(m.this, (String) obj2);
                        }
                    });
                    return Unit.f6114a;
                }
                mVar = (m) eVar.L$0;
                V6.b.P(obj);
                mVar.setWebViewToMaxSize(mVar.activity);
                if (mVar.messageContent.isFullBleed()) {
                    eVar.L$0 = mVar;
                    eVar.label = 3;
                    if (mVar.updateSafeAreaInsets(eVar) != aVar) {
                        mVar2 = mVar;
                        mVar = mVar2;
                    }
                    return aVar;
                }
                com.onesignal.inAppMessages.internal.display.impl.i iVar22 = mVar.webView;
                Intrinsics.b(iVar22);
                iVar22.evaluateJavascript(GET_PAGE_META_DATA_JS_FUNCTION, new ValueCallback() { // from class: com.onesignal.inAppMessages.internal.display.impl.l
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(Object obj2) {
                        m.calculateHeightAndShowWebViewAfterNewActivity$lambda$0(m.this, (String) obj2);
                    }
                });
                return Unit.f6114a;
            }
        }
        eVar = new e(bVar);
        Object obj2 = eVar.result;
        W5.a aVar2 = W5.a.f2787d;
        i2 = eVar.label;
        if (i2 != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void calculateHeightAndShowWebViewAfterNewActivity$lambda$0(m this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (str == null || StringsKt.z(str) || Intrinsics.a(str, "null")) {
            com.onesignal.debug.internal.logging.b.warn$default("calculateHeightAndShowWebViewAfterNewActivity: empty/null page metadata from WebView; skipping height update", null, 2, null);
            return;
        }
        try {
            com.onesignal.common.threading.b.suspendifyOnIO(this$0.new f(this$0.pageRectToViewHeight(this$0.activity, new JSONObject(str)), null));
        } catch (JSONException e7) {
            com.onesignal.debug.internal.logging.b.warn("calculateHeightAndShowWebViewAfterNewActivity: could not parse page metadata; snippet=" + this$0.bodySnippet(str), e7);
        }
    }

    private final void enableWebViewRemoteDebugging() {
        if (com.onesignal.debug.internal.logging.b.atLogLevel(K2.c.DEBUG)) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
    }

    private final int getWebViewMaxSizeX(Activity activity) {
        if (this.messageContent.isFullBleed()) {
            return com.onesignal.common.m.INSTANCE.getFullbleedWindowWidth(activity);
        }
        return com.onesignal.common.m.INSTANCE.getWindowWidth(activity) - (MARGIN_PX_SIZE * 2);
    }

    private final int getWebViewMaxSizeY(Activity activity) {
        return com.onesignal.common.m.INSTANCE.getWindowHeight(activity) - (this.messageContent.isFullBleed() ? 0 : MARGIN_PX_SIZE * 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int pageRectToViewHeight(Activity activity, JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("rect");
        int optInt = optJSONObject != null ? optJSONObject.optInt("height", -1) : -1;
        if (optInt < 0) {
            com.onesignal.debug.internal.logging.b.warn$default("pageRectToViewHeight could not get page height (missing/invalid 'rect.height'); snippet=" + bodySnippet(jSONObject.toString()), null, 2, null);
            return -1;
        }
        int dpToPx = com.onesignal.common.m.INSTANCE.dpToPx(optInt);
        com.onesignal.debug.internal.logging.b.debug$default("getPageHeightData:pxHeight: " + dpToPx, null, 2, null);
        int webViewMaxSizeY = getWebViewMaxSizeY(activity);
        if (dpToPx <= webViewMaxSizeY) {
            return dpToPx;
        }
        com.onesignal.debug.internal.logging.b.debug$default("getPageHeightData:pxHeight is over screen max: " + webViewMaxSizeY, null, 2, null);
        return webViewMaxSizeY;
    }

    private final void setMessageView(com.onesignal.inAppMessages.internal.display.impl.d dVar) {
        this.messageView = dVar;
    }

    private final void setWebViewToMaxSize(Activity activity) {
        com.onesignal.inAppMessages.internal.display.impl.i iVar = this.webView;
        Intrinsics.b(iVar);
        iVar.layout(0, 0, getWebViewMaxSizeX(activity), getWebViewMaxSizeY(activity));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00f4, code lost:
    
        if (r11.checkIfShouldDismiss(r1) == r2) goto L56;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e8 A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:14:0x0033, B:15:0x00f7, B:22:0x004b, B:23:0x00e4, B:25:0x00e8, B:29:0x0058, B:30:0x00cf, B:32:0x00d3, B:36:0x0087, B:38:0x008b, B:41:0x0098, B:43:0x00ab, B:45:0x00b5, B:47:0x00bb), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d3 A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:14:0x0033, B:15:0x00f7, B:22:0x004b, B:23:0x00e4, B:25:0x00e8, B:29:0x0058, B:30:0x00cf, B:32:0x00d3, B:36:0x0087, B:38:0x008b, B:41:0x0098, B:43:0x00ab, B:45:0x00b5, B:47:0x00bb), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008b A[Catch: all -> 0x0038, TRY_LEAVE, TryCatch #0 {all -> 0x0038, blocks: (B:14:0x0033, B:15:0x00f7, B:22:0x004b, B:23:0x00e4, B:25:0x00e8, B:29:0x0058, B:30:0x00cf, B:32:0x00d3, B:36:0x0087, B:38:0x008b, B:41:0x0098, B:43:0x00ab, B:45:0x00b5, B:47:0x00bb), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0098 A[Catch: all -> 0x0038, TRY_ENTER, TryCatch #0 {all -> 0x0038, blocks: (B:14:0x0033, B:15:0x00f7, B:22:0x004b, B:23:0x00e4, B:25:0x00e8, B:29:0x0058, B:30:0x00cf, B:32:0x00d3, B:36:0x0087, B:38:0x008b, B:41:0x0098, B:43:0x00ab, B:45:0x00b5, B:47:0x00bb), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object showMessageView(Integer num, V5.b bVar) {
        k kVar;
        int i2;
        m mVar;
        Integer num2;
        InterfaceC0979a interfaceC0979a;
        m mVar2;
        com.onesignal.inAppMessages.internal.display.impl.d dVar;
        com.onesignal.inAppMessages.internal.display.impl.d dVar2;
        try {
            if (bVar instanceof k) {
                kVar = (k) bVar;
                int i5 = kVar.label;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    kVar.label = i5 - Integer.MIN_VALUE;
                    Object obj = kVar.result;
                    W5.a aVar = W5.a.f2787d;
                    i2 = kVar.label;
                    if (i2 != 0) {
                        V6.b.P(obj);
                        InterfaceC0979a interfaceC0979a2 = this.messageViewMutex;
                        kVar.L$0 = this;
                        kVar.L$1 = num;
                        kVar.L$2 = interfaceC0979a2;
                        kVar.label = 1;
                        v6.c cVar = (v6.c) interfaceC0979a2;
                        if (cVar.c(kVar) != aVar) {
                            mVar = this;
                            num2 = num;
                            interfaceC0979a = cVar;
                        }
                        return aVar;
                    }
                    if (i2 != 1) {
                        if (i2 == 2) {
                            interfaceC0979a = (InterfaceC0979a) kVar.L$1;
                            mVar2 = (m) kVar.L$0;
                            V6.b.P(obj);
                            dVar = mVar2.messageView;
                            if (dVar != null) {
                                Activity activity = mVar2.activity;
                                kVar.L$0 = mVar2;
                                kVar.L$1 = interfaceC0979a;
                                kVar.L$2 = null;
                                kVar.label = 3;
                                if (dVar.showView(activity, kVar) == aVar) {
                                    return aVar;
                                }
                            }
                            dVar2 = mVar2.messageView;
                            if (dVar2 != null) {
                            }
                            ((v6.c) interfaceC0979a).e(null);
                            return Unit.f6114a;
                        }
                        if (i2 != 3) {
                            if (i2 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            interfaceC0979a = (InterfaceC0979a) kVar.L$0;
                            V6.b.P(obj);
                            Unit unit = Unit.f6114a;
                            ((v6.c) interfaceC0979a).e(null);
                            return Unit.f6114a;
                        }
                        interfaceC0979a = (InterfaceC0979a) kVar.L$1;
                        mVar2 = (m) kVar.L$0;
                        V6.b.P(obj);
                        dVar2 = mVar2.messageView;
                        if (dVar2 != null) {
                            kVar.L$0 = interfaceC0979a;
                            kVar.L$1 = null;
                            kVar.L$2 = null;
                            kVar.label = 4;
                        }
                        ((v6.c) interfaceC0979a).e(null);
                        return Unit.f6114a;
                    }
                    interfaceC0979a = (InterfaceC0979a) kVar.L$2;
                    num2 = (Integer) kVar.L$1;
                    mVar = (m) kVar.L$0;
                    V6.b.P(obj);
                    if (mVar.messageView != null) {
                        com.onesignal.debug.internal.logging.b.warn$default("No messageView found to update a with a new height.", null, 2, null);
                        Unit unit2 = Unit.f6114a;
                        ((v6.c) interfaceC0979a).e(null);
                        return unit2;
                    }
                    com.onesignal.debug.internal.logging.b.debug$default("In app message, showing first one with height: " + num2, null, 2, null);
                    com.onesignal.inAppMessages.internal.display.impl.d dVar3 = mVar.messageView;
                    if (dVar3 != null) {
                        com.onesignal.inAppMessages.internal.display.impl.i iVar = mVar.webView;
                        Intrinsics.b(iVar);
                        dVar3.setWebView(iVar);
                    }
                    if (num2 != null) {
                        mVar.lastPageHeight = num2;
                        com.onesignal.inAppMessages.internal.display.impl.d dVar4 = mVar.messageView;
                        if (dVar4 != null) {
                            int intValue = num2.intValue();
                            kVar.L$0 = mVar;
                            kVar.L$1 = interfaceC0979a;
                            kVar.L$2 = null;
                            kVar.label = 2;
                            if (dVar4.updateHeight(intValue, kVar) == aVar) {
                                return aVar;
                            }
                        }
                    }
                    mVar2 = mVar;
                    dVar = mVar2.messageView;
                    if (dVar != null) {
                    }
                    dVar2 = mVar2.messageView;
                    if (dVar2 != null) {
                    }
                    ((v6.c) interfaceC0979a).e(null);
                    return Unit.f6114a;
                }
            }
            if (i2 != 0) {
            }
            if (mVar.messageView != null) {
            }
        } catch (Throwable th) {
            ((v6.c) num).e(null);
            throw th;
        }
        kVar = new k(bVar);
        Object obj2 = kVar.result;
        W5.a aVar2 = W5.a.f2787d;
        i2 = kVar.label;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object updateSafeAreaInsets(V5.b bVar) {
        C0953e c0953e = F.f7011a;
        Object t6 = AbstractC0792z.t(s6.n.f7850a, new l(null), bVar);
        return t6 == W5.a.f2787d ? t6 : Unit.f6114a;
    }

    public final void backgroundDismissAndAwaitNextMessage() {
        com.onesignal.common.threading.b.suspendifyOnDefault(new d(null));
    }

    public final void createNewInAppMessageView(boolean z7) {
        this.lastPageHeight = Integer.valueOf(this.messageContent.getPageHeight());
        boolean manifestMetaBoolean = AndroidUtils.INSTANCE.getManifestMetaBoolean(this._applicationService.getAppContext(), "com.onesignal.inAppMessageHideGrayOverlay");
        com.onesignal.inAppMessages.internal.display.impl.i iVar = this.webView;
        Intrinsics.b(iVar);
        setMessageView(new com.onesignal.inAppMessages.internal.display.impl.d(iVar, this.messageContent, z7, manifestMetaBoolean));
        com.onesignal.inAppMessages.internal.display.impl.d dVar = this.messageView;
        Intrinsics.b(dVar);
        dVar.setMessageController(new g(this));
        this._applicationService.addActivityLifecycleHandler(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object dismissAndAwaitNextMessage(V5.b bVar) {
        h hVar;
        int i2;
        m mVar;
        if (bVar instanceof h) {
            hVar = (h) bVar;
            int i5 = hVar.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                hVar.label = i5 - Integer.MIN_VALUE;
                Object obj = hVar.result;
                W5.a aVar = W5.a.f2787d;
                i2 = hVar.label;
                if (i2 != 0) {
                    V6.b.P(obj);
                    com.onesignal.inAppMessages.internal.display.impl.d dVar = this.messageView;
                    if (dVar == null || this.dismissFired) {
                        return Unit.f6114a;
                    }
                    this.dismissFired = true;
                    this._lifecycle.messageWillDismiss(this.message);
                    hVar.L$0 = this;
                    hVar.label = 1;
                    if (dVar.dismissAndAwaitNextMessage(hVar) == aVar) {
                        return aVar;
                    }
                    mVar = this;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mVar = (m) hVar.L$0;
                    V6.b.P(obj);
                }
                mVar.dismissFired = false;
                mVar.setMessageView(null);
                return Unit.f6114a;
            }
        }
        hVar = new h(bVar);
        Object obj2 = hVar.result;
        W5.a aVar2 = W5.a.f2787d;
        i2 = hVar.label;
        if (i2 != 0) {
        }
        mVar.dismissFired = false;
        mVar.setMessageView(null);
        return Unit.f6114a;
    }

    @Override // v2.d
    public void onActivityAvailable(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        String str = this.currentActivityName;
        this.activity = activity;
        this.currentActivityName = activity.getLocalClassName();
        com.onesignal.debug.internal.logging.b.debug$default("In app message activity available currentActivityName: " + this.currentActivityName + " lastActivityName: " + str, null, 2, null);
        com.onesignal.common.threading.b.suspendifyOnMain(new i(str, this, null));
    }

    @Override // v2.d
    public void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        com.onesignal.debug.internal.logging.b.debug$default(kotlin.text.j.b("\n            In app message activity stopped, cleaning views, currentActivityName: " + this.currentActivityName + "\n            activity: " + this.activity + "\n            messageView: " + this.messageView + "\n            "), null, 2, null);
        if (this.messageView == null || !Intrinsics.a(activity.getLocalClassName(), this.currentActivityName)) {
            return;
        }
        com.onesignal.inAppMessages.internal.display.impl.d dVar = this.messageView;
        Intrinsics.b(dVar);
        dVar.removeAllViews();
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

    public final void setContentSafeAreaInsets(com.onesignal.inAppMessages.internal.d content, Activity activity) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(activity, "activity");
        String contentHtml = content.getContentHtml();
        int[] cutoutAndStatusBarInsets = com.onesignal.common.m.INSTANCE.getCutoutAndStatusBarInsets(activity);
        String format = String.format(SAFE_AREA_JS_OBJECT, Arrays.copyOf(new Object[]{Integer.valueOf(cutoutAndStatusBarInsets[0]), Integer.valueOf(cutoutAndStatusBarInsets[1]), Integer.valueOf(cutoutAndStatusBarInsets[2]), Integer.valueOf(cutoutAndStatusBarInsets[3])}, 4));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        String format2 = String.format(SET_SAFE_AREA_INSETS_SCRIPT, Arrays.copyOf(new Object[]{format}, 1));
        Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
        content.setContentHtml(contentHtml + format2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object setupWebView(Activity activity, String str, boolean z7, V5.b bVar) {
        j jVar;
        int i2;
        m mVar;
        if (bVar instanceof j) {
            jVar = (j) bVar;
            int i5 = jVar.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                jVar.label = i5 - Integer.MIN_VALUE;
                Object obj = jVar.result;
                W5.a aVar = W5.a.f2787d;
                i2 = jVar.label;
                if (i2 != 0) {
                    V6.b.P(obj);
                    enableWebViewRemoteDebugging();
                    com.onesignal.inAppMessages.internal.display.impl.i iVar = new com.onesignal.inAppMessages.internal.display.impl.i(activity);
                    this.webView = iVar;
                    iVar.setOverScrollMode(2);
                    com.onesignal.inAppMessages.internal.display.impl.i iVar2 = this.webView;
                    Intrinsics.b(iVar2);
                    iVar2.setVerticalScrollBarEnabled(false);
                    com.onesignal.inAppMessages.internal.display.impl.i iVar3 = this.webView;
                    Intrinsics.b(iVar3);
                    iVar3.setHorizontalScrollBarEnabled(false);
                    com.onesignal.inAppMessages.internal.display.impl.i iVar4 = this.webView;
                    Intrinsics.b(iVar4);
                    secureSetup(iVar4);
                    com.onesignal.inAppMessages.internal.display.impl.i iVar5 = this.webView;
                    Intrinsics.b(iVar5);
                    iVar5.addJavascriptInterface(new b(), JS_OBJ_NAME);
                    if (z7) {
                        com.onesignal.inAppMessages.internal.display.impl.i iVar6 = this.webView;
                        Intrinsics.b(iVar6);
                        iVar6.setSystemUiVisibility(3074);
                        if (Build.VERSION.SDK_INT >= 30) {
                            com.onesignal.inAppMessages.internal.display.impl.i iVar7 = this.webView;
                            Intrinsics.b(iVar7);
                            iVar7.setFitsSystemWindows(false);
                        }
                    }
                    this._lifecycle.messageWillDisplay(this.message);
                    v2.f fVar = this._applicationService;
                    jVar.L$0 = this;
                    jVar.L$1 = activity;
                    jVar.L$2 = str;
                    jVar.label = 1;
                    if (fVar.waitUntilActivityReady(jVar) == aVar) {
                        return aVar;
                    }
                    mVar = this;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) jVar.L$2;
                    activity = (Activity) jVar.L$1;
                    mVar = (m) jVar.L$0;
                    V6.b.P(obj);
                }
                mVar.setWebViewToMaxSize(activity);
                com.onesignal.inAppMessages.internal.display.impl.i iVar8 = mVar.webView;
                Intrinsics.b(iVar8);
                iVar8.loadData(str, "text/html; charset=utf-8", "base64");
                return Unit.f6114a;
            }
        }
        jVar = new j(bVar);
        Object obj2 = jVar.result;
        W5.a aVar2 = W5.a.f2787d;
        i2 = jVar.label;
        if (i2 != 0) {
        }
        mVar.setWebViewToMaxSize(activity);
        com.onesignal.inAppMessages.internal.display.impl.i iVar82 = mVar.webView;
        Intrinsics.b(iVar82);
        iVar82.loadData(str, "text/html; charset=utf-8", "base64");
        return Unit.f6114a;
    }
}
