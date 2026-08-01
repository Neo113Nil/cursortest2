package com.onesignal.inAppMessages.internal.display.impl;

import android.app.Activity;
import android.os.Build;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.onesignal.common.AndroidUtils;
import ge.a0;
import ge.k0;
import ge.x;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.i0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class n implements ea.d {
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
    public static final String SAFE_AREA_JS_OBJECT = "{\n   top: %d,\n   bottom: %d,\n   right: %d,\n   left: %d,\n}";
    public static final String SET_SAFE_AREA_INSETS_JS_FUNCTION = "setSafeAreaInsets(%s)";
    public static final String SET_SAFE_AREA_INSETS_SCRIPT = "\n\n<script>\n    setSafeAreaInsets(%s);\n</script>";
    private final ea.f _applicationService;
    private final bb.b _lifecycle;
    private final eb.a _promptFactory;
    private Activity activity;
    private boolean closing;
    private String currentActivityName;
    private boolean dismissFired;
    private Integer lastPageHeight;
    private final com.onesignal.inAppMessages.internal.a message;
    private final com.onesignal.inAppMessages.internal.d messageContent;
    private com.onesignal.inAppMessages.internal.display.impl.d messageView;
    private final oe.a messageViewMutex;
    private com.onesignal.inAppMessages.internal.display.impl.i webView;
    public static final a Companion = new a(null);
    private static final int MARGIN_PX_SIZE = com.onesignal.common.m.INSTANCE.dpToPx(24);

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public final class b {
        public b() {
        }

        private final c getDisplayLocation(JSONObject jSONObject) {
            c cVar = c.FULL_SCREEN;
            try {
                if (jSONObject.has(n.IAM_DISPLAY_LOCATION_KEY) && !Intrinsics.a(jSONObject.get(n.IAM_DISPLAY_LOCATION_KEY), "")) {
                    String optString = jSONObject.optString(n.IAM_DISPLAY_LOCATION_KEY, "FULL_SCREEN");
                    optString.getClass();
                    Locale locale = Locale.getDefault();
                    locale.getClass();
                    String upperCase = optString.toUpperCase(locale);
                    upperCase.getClass();
                    return c.valueOf(upperCase);
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            return cVar;
        }

        private final boolean getDragToDismissDisabled(JSONObject jSONObject) {
            try {
                return jSONObject.getBoolean(n.IAM_DRAG_TO_DISMISS_DISABLED_KEY);
            } catch (JSONException unused) {
                return false;
            }
        }

        private final int getPageHeightData(JSONObject jSONObject) {
            try {
                n nVar = n.this;
                Activity activity = nVar.activity;
                JSONObject jSONObject2 = jSONObject.getJSONObject(n.IAM_PAGE_META_DATA_KEY);
                jSONObject2.getClass();
                return nVar.pageRectToViewHeight(activity, jSONObject2);
            } catch (JSONException unused) {
                return -1;
            }
        }

        private final void handleActionTaken(JSONObject jSONObject) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("body");
            jSONObject2.getClass();
            String safeString = com.onesignal.common.e.safeString(jSONObject2, "id");
            n.this.closing = jSONObject2.getBoolean("close");
            if (n.this.message.isPreview()) {
                n.this._lifecycle.messageActionOccurredOnPreview(n.this.message, new com.onesignal.inAppMessages.internal.c(jSONObject2, n.this._promptFactory));
            } else if (safeString != null) {
                n.this._lifecycle.messageActionOccurredOnMessage(n.this.message, new com.onesignal.inAppMessages.internal.c(jSONObject2, n.this._promptFactory));
            }
            if (n.this.closing) {
                n.this.backgroundDismissAndAwaitNextMessage();
            }
        }

        private final void handlePageChange(JSONObject jSONObject) {
            n.this._lifecycle.messagePageChanged(n.this.message, new com.onesignal.inAppMessages.internal.g(jSONObject));
        }

        private final void handleRenderComplete(JSONObject jSONObject) {
            c displayLocation = getDisplayLocation(jSONObject);
            int pageHeightData = displayLocation == c.FULL_SCREEN ? -1 : getPageHeightData(jSONObject);
            boolean dragToDismissDisabled = getDragToDismissDisabled(jSONObject);
            n.this.messageContent.setDisplayLocation(displayLocation);
            n.this.messageContent.setPageHeight(pageHeightData);
            n.this.createNewInAppMessageView(dragToDismissDisabled);
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @JavascriptInterface
        public final void postMessage(String str) {
            com.onesignal.inAppMessages.internal.display.impl.d dVar;
            str.getClass();
            try {
                com.onesignal.debug.internal.logging.b.debug$default("OSJavaScriptInterface:postMessage: " + str, null, 2, null);
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString(n.EVENT_TYPE_KEY);
                if (string != null) {
                    switch (string.hashCode()) {
                        case -1484226720:
                            if (!string.equals(n.EVENT_TYPE_PAGE_CHANGE)) {
                                break;
                            } else {
                                handlePageChange(jSONObject);
                                break;
                            }
                        case -934437708:
                            string.equals(n.EVENT_TYPE_RESIZE);
                            break;
                        case 42998156:
                            if (string.equals(n.EVENT_TYPE_RENDERING_COMPLETE)) {
                                handleRenderComplete(jSONObject);
                                break;
                            }
                            break;
                        case 1851145598:
                            if (string.equals(n.EVENT_TYPE_ACTION_TAKEN) && (dVar = n.this.messageView) != null && !dVar.isDragging()) {
                                handleActionTaken(jSONObject);
                                break;
                            }
                            break;
                    }
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class c {
        private static final /* synthetic */ od.a $ENTRIES;
        private static final /* synthetic */ c[] $VALUES;
        public static final c TOP_BANNER = new c("TOP_BANNER", n.MARGIN_PX_SIZE);
        public static final c BOTTOM_BANNER = new c("BOTTOM_BANNER", 1);
        public static final c CENTER_MODAL = new c("CENTER_MODAL", 2);
        public static final c FULL_SCREEN = new c("FULL_SCREEN", 3);

        private static final /* synthetic */ c[] $values() {
            return new c[]{TOP_BANNER, BOTTOM_BANNER, CENTER_MODAL, FULL_SCREEN};
        }

        static {
            c[] $values = $values();
            $VALUES = $values;
            $ENTRIES = i7.a.J($values);
        }

        private c(String str, int i3) {
        }

        public static od.a getEntries() {
            return $ENTRIES;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }

        public final boolean isBanner() {
            int i3 = o.$EnumSwitchMapping$0[ordinal()];
            return i3 == 1 || i3 == 2;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class d extends nd.i implements Function1 {
        int label;

        public d(ld.a aVar) {
            super(1, aVar);
        }

        @Override // nd.a
        public final ld.a create(ld.a aVar) {
            return n.this.new d(aVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(ld.a aVar) {
            return ((d) create(aVar)).invokeSuspend(Unit.f5554a);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            md.a aVar = md.a.f6622d;
            int i3 = this.label;
            if (i3 == 0) {
                cf.c.M(obj);
                n nVar = n.this;
                this.label = 1;
                if (nVar.dismissAndAwaitNextMessage(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i3 != 1) {
                    i0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                cf.c.M(obj);
            }
            return Unit.f5554a;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class e extends nd.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public e(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return n.this.calculateHeightAndShowWebViewAfterNewActivity(this);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class f extends nd.i implements Function1 {
        final /* synthetic */ int $pagePxHeight;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(int i3, ld.a aVar) {
            super(1, aVar);
            this.$pagePxHeight = i3;
        }

        @Override // nd.a
        public final ld.a create(ld.a aVar) {
            return n.this.new f(this.$pagePxHeight, aVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(ld.a aVar) {
            return ((f) create(aVar)).invokeSuspend(Unit.f5554a);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            md.a aVar = md.a.f6622d;
            int i3 = this.label;
            if (i3 == 0) {
                cf.c.M(obj);
                n nVar = n.this;
                Integer num = new Integer(this.$pagePxHeight);
                this.label = 1;
                if (nVar.showMessageView(num, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i3 != 1) {
                    i0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                cf.c.M(obj);
            }
            return Unit.f5554a;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class g implements com.onesignal.inAppMessages.internal.display.impl.e {
        final /* synthetic */ n $self;

        public g(n nVar) {
            this.$self = nVar;
        }

        @Override // com.onesignal.inAppMessages.internal.display.impl.e
        public void onMessageWasDismissed() {
            n.this._lifecycle.messageWasDismissed(n.this.message);
            n.this._applicationService.removeActivityLifecycleHandler(this.$self);
        }

        @Override // com.onesignal.inAppMessages.internal.display.impl.e
        public void onMessageWasDisplayed() {
            n.this._lifecycle.messageWasDisplayed(n.this.message);
        }

        @Override // com.onesignal.inAppMessages.internal.display.impl.e
        public void onMessageWillDismiss() {
            n.this._lifecycle.messageWillDismiss(n.this.message);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class h extends nd.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public h(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return n.this.dismissAndAwaitNextMessage(this);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class i extends nd.i implements Function1 {
        final /* synthetic */ String $lastActivityName;
        int label;
        final /* synthetic */ n this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, n nVar, ld.a aVar) {
            super(1, aVar);
            this.$lastActivityName = str;
            this.this$0 = nVar;
        }

        @Override // nd.a
        public final ld.a create(ld.a aVar) {
            return new i(this.$lastActivityName, this.this$0, aVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(ld.a aVar) {
            return ((i) create(aVar)).invokeSuspend(Unit.f5554a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
        
            if (r1.showMessageView(null, r5) == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0060, code lost:
        
            if (r6.showMessageView(r1, r5) == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0069, code lost:
        
            if (r1.calculateHeightAndShowWebViewAfterNewActivity(r5) == r0) goto L28;
         */
        @Override // nd.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            md.a aVar = md.a.f6622d;
            int i3 = this.label;
            if (i3 == 0) {
                cf.c.M(obj);
                String str = this.$lastActivityName;
                n nVar = this.this$0;
                if (str == null) {
                    this.label = 1;
                } else {
                    boolean a9 = Intrinsics.a(str, nVar.currentActivityName);
                    n nVar2 = this.this$0;
                    if (a9) {
                        this.label = 3;
                    } else if (!nVar2.closing) {
                        if (this.this$0.messageView != null) {
                            com.onesignal.inAppMessages.internal.display.impl.d dVar = this.this$0.messageView;
                            dVar.getClass();
                            dVar.removeAllViews();
                        }
                        n nVar3 = this.this$0;
                        Integer num = nVar3.lastPageHeight;
                        this.label = 2;
                    }
                }
            } else {
                if (i3 != 1 && i3 != 2 && i3 != 3) {
                    i0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                cf.c.M(obj);
            }
            return Unit.f5554a;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class j extends nd.c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public j(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return n.this.setupWebView(null, null, false, this);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class k extends nd.c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public k(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return n.this.showMessageView(null, this);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class l extends nd.i implements Function2 {
        int label;

        public l(ld.a aVar) {
            super(2, aVar);
        }

        @Override // nd.a
        public final ld.a create(Object obj, ld.a aVar) {
            return n.this.new l(aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, ld.a aVar) {
            return ((l) create(xVar, aVar)).invokeSuspend(Unit.f5554a);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            md.a aVar = md.a.f6622d;
            if (this.label != 0) {
                i0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            cf.c.M(obj);
            int[] cutoutAndStatusBarInsets = com.onesignal.common.m.INSTANCE.getCutoutAndStatusBarInsets(n.this.activity);
            String format = String.format(n.SET_SAFE_AREA_INSETS_JS_FUNCTION, Arrays.copyOf(new Object[]{String.format(n.SAFE_AREA_JS_OBJECT, Arrays.copyOf(new Object[]{new Integer(cutoutAndStatusBarInsets[n.MARGIN_PX_SIZE]), new Integer(cutoutAndStatusBarInsets[1]), new Integer(cutoutAndStatusBarInsets[2]), new Integer(cutoutAndStatusBarInsets[3])}, 4))}, 1));
            com.onesignal.inAppMessages.internal.display.impl.i iVar = n.this.webView;
            iVar.getClass();
            iVar.evaluateJavascript(format, null);
            return Unit.f5554a;
        }
    }

    public n(com.onesignal.inAppMessages.internal.a aVar, Activity activity, com.onesignal.inAppMessages.internal.d dVar, bb.b bVar, ea.f fVar, eb.a aVar2) {
        aVar.getClass();
        activity.getClass();
        dVar.getClass();
        bVar.getClass();
        fVar.getClass();
        aVar2.getClass();
        this.message = aVar;
        this.activity = activity;
        this.messageContent = dVar;
        this._lifecycle = bVar;
        this._applicationService = fVar;
        this._promptFactory = aVar2;
        this.messageViewMutex = new oe.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0065, code lost:
    
        if (showMessageView(null, r0) == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object calculateHeightAndShowWebViewAfterNewActivity(ld.a aVar) {
        e eVar;
        int i3;
        final n nVar;
        n nVar2;
        if (aVar instanceof e) {
            eVar = (e) aVar;
            int i10 = eVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.label = i10 - Integer.MIN_VALUE;
                Object obj = eVar.result;
                md.a aVar2 = md.a.f6622d;
                i3 = eVar.label;
                if (i3 != 0) {
                    cf.c.M(obj);
                    com.onesignal.inAppMessages.internal.display.impl.d dVar = this.messageView;
                    if (dVar == null) {
                        return Unit.f5554a;
                    }
                    if (dVar.getDisplayPosition() != c.FULL_SCREEN || this.messageContent.isFullBleed()) {
                        com.onesignal.debug.internal.logging.b.debug$default("In app message new activity, calculate height and show ", null, 2, null);
                        ea.f fVar = this._applicationService;
                        eVar.L$0 = this;
                        eVar.label = 2;
                        if (fVar.waitUntilActivityReady(eVar) != aVar2) {
                            nVar = this;
                            nVar.setWebViewToMaxSize(nVar.activity);
                            if (nVar.messageContent.isFullBleed()) {
                            }
                            com.onesignal.inAppMessages.internal.display.impl.i iVar = nVar.webView;
                            iVar.getClass();
                            iVar.evaluateJavascript(GET_PAGE_META_DATA_JS_FUNCTION, new ValueCallback() { // from class: com.onesignal.inAppMessages.internal.display.impl.m
                                @Override // android.webkit.ValueCallback
                                public final void onReceiveValue(Object obj2) {
                                    n.calculateHeightAndShowWebViewAfterNewActivity$lambda$0(n.this, (String) obj2);
                                }
                            });
                            return Unit.f5554a;
                        }
                    } else {
                        eVar.label = 1;
                    }
                    return aVar2;
                }
                if (i3 == 1) {
                    cf.c.M(obj);
                    return Unit.f5554a;
                }
                if (i3 != 2) {
                    if (i3 != 3) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    nVar2 = (n) eVar.L$0;
                    cf.c.M(obj);
                    nVar = nVar2;
                    com.onesignal.inAppMessages.internal.display.impl.i iVar2 = nVar.webView;
                    iVar2.getClass();
                    iVar2.evaluateJavascript(GET_PAGE_META_DATA_JS_FUNCTION, new ValueCallback() { // from class: com.onesignal.inAppMessages.internal.display.impl.m
                        @Override // android.webkit.ValueCallback
                        public final void onReceiveValue(Object obj2) {
                            n.calculateHeightAndShowWebViewAfterNewActivity$lambda$0(n.this, (String) obj2);
                        }
                    });
                    return Unit.f5554a;
                }
                nVar = (n) eVar.L$0;
                cf.c.M(obj);
                nVar.setWebViewToMaxSize(nVar.activity);
                if (nVar.messageContent.isFullBleed()) {
                    eVar.L$0 = nVar;
                    eVar.label = 3;
                    if (nVar.updateSafeAreaInsets(eVar) != aVar2) {
                        nVar2 = nVar;
                        nVar = nVar2;
                    }
                    return aVar2;
                }
                com.onesignal.inAppMessages.internal.display.impl.i iVar22 = nVar.webView;
                iVar22.getClass();
                iVar22.evaluateJavascript(GET_PAGE_META_DATA_JS_FUNCTION, new ValueCallback() { // from class: com.onesignal.inAppMessages.internal.display.impl.m
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(Object obj2) {
                        n.calculateHeightAndShowWebViewAfterNewActivity$lambda$0(n.this, (String) obj2);
                    }
                });
                return Unit.f5554a;
            }
        }
        eVar = new e(aVar);
        Object obj2 = eVar.result;
        md.a aVar22 = md.a.f6622d;
        i3 = eVar.label;
        if (i3 != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void calculateHeightAndShowWebViewAfterNewActivity$lambda$0(n nVar, String str) {
        nVar.getClass();
        try {
            com.onesignal.common.threading.b.suspendifyOnThread$default(MARGIN_PX_SIZE, nVar.new f(nVar.pageRectToViewHeight(nVar.activity, new JSONObject(str)), null), 1, null);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    private final void enableWebViewRemoteDebugging() {
        if (com.onesignal.debug.internal.logging.b.atLogLevel(ua.c.DEBUG)) {
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
        return com.onesignal.common.m.INSTANCE.getWindowHeight(activity) - (this.messageContent.isFullBleed() ? MARGIN_PX_SIZE : MARGIN_PX_SIZE * 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int pageRectToViewHeight(Activity activity, JSONObject jSONObject) {
        try {
            int dpToPx = com.onesignal.common.m.INSTANCE.dpToPx(jSONObject.getJSONObject("rect").getInt("height"));
            com.onesignal.debug.internal.logging.b.debug$default("getPageHeightData:pxHeight: " + dpToPx, null, 2, null);
            int webViewMaxSizeY = getWebViewMaxSizeY(activity);
            if (dpToPx <= webViewMaxSizeY) {
                return dpToPx;
            }
            com.onesignal.debug.internal.logging.b.debug$default("getPageHeightData:pxHeight is over screen max: " + webViewMaxSizeY, null, 2, null);
            return webViewMaxSizeY;
        } catch (JSONException e2) {
            com.onesignal.debug.internal.logging.b.error("pageRectToViewHeight could not get page height", e2);
            return -1;
        }
    }

    private final void setMessageView(com.onesignal.inAppMessages.internal.display.impl.d dVar) {
        this.messageView = dVar;
    }

    private final void setWebViewToMaxSize(Activity activity) {
        com.onesignal.inAppMessages.internal.display.impl.i iVar = this.webView;
        iVar.getClass();
        iVar.layout(MARGIN_PX_SIZE, MARGIN_PX_SIZE, getWebViewMaxSizeX(activity), getWebViewMaxSizeY(activity));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ef, code lost:
    
        if (r11.checkIfShouldDismiss(r1) == r2) goto L56;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e3 A[Catch: all -> 0x0038, TRY_LEAVE, TryCatch #0 {all -> 0x0038, blocks: (B:14:0x0033, B:21:0x004a, B:22:0x00df, B:24:0x00e3, B:28:0x0057, B:29:0x00ca, B:31:0x00ce, B:35:0x0084, B:37:0x0088, B:40:0x0093, B:42:0x00a6, B:44:0x00b0, B:46:0x00b6), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ce A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:14:0x0033, B:21:0x004a, B:22:0x00df, B:24:0x00e3, B:28:0x0057, B:29:0x00ca, B:31:0x00ce, B:35:0x0084, B:37:0x0088, B:40:0x0093, B:42:0x00a6, B:44:0x00b0, B:46:0x00b6), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0088 A[Catch: all -> 0x0038, TRY_LEAVE, TryCatch #0 {all -> 0x0038, blocks: (B:14:0x0033, B:21:0x004a, B:22:0x00df, B:24:0x00e3, B:28:0x0057, B:29:0x00ca, B:31:0x00ce, B:35:0x0084, B:37:0x0088, B:40:0x0093, B:42:0x00a6, B:44:0x00b0, B:46:0x00b6), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0093 A[Catch: all -> 0x0038, TRY_ENTER, TryCatch #0 {all -> 0x0038, blocks: (B:14:0x0033, B:21:0x004a, B:22:0x00df, B:24:0x00e3, B:28:0x0057, B:29:0x00ca, B:31:0x00ce, B:35:0x0084, B:37:0x0088, B:40:0x0093, B:42:0x00a6, B:44:0x00b0, B:46:0x00b6), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object showMessageView(Integer num, ld.a aVar) {
        k kVar;
        int i3;
        n nVar;
        Integer num2;
        oe.a aVar2;
        n nVar2;
        com.onesignal.inAppMessages.internal.display.impl.d dVar;
        com.onesignal.inAppMessages.internal.display.impl.d dVar2;
        try {
            if (aVar instanceof k) {
                kVar = (k) aVar;
                int i10 = kVar.label;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    kVar.label = i10 - Integer.MIN_VALUE;
                    Object obj = kVar.result;
                    md.a aVar3 = md.a.f6622d;
                    i3 = kVar.label;
                    if (i3 != 0) {
                        cf.c.M(obj);
                        oe.a aVar4 = this.messageViewMutex;
                        kVar.L$0 = this;
                        kVar.L$1 = num;
                        kVar.L$2 = aVar4;
                        kVar.label = 1;
                        if (aVar4.a(kVar) != aVar3) {
                            nVar = this;
                            num2 = num;
                            aVar2 = aVar4;
                        }
                        return aVar3;
                    }
                    if (i3 != 1) {
                        if (i3 == 2) {
                            aVar2 = (oe.a) kVar.L$1;
                            nVar2 = (n) kVar.L$0;
                            cf.c.M(obj);
                            dVar = nVar2.messageView;
                            if (dVar != null) {
                                Activity activity = nVar2.activity;
                                kVar.L$0 = nVar2;
                                kVar.L$1 = aVar2;
                                kVar.L$2 = null;
                                kVar.label = 3;
                                if (dVar.showView(activity, kVar) == aVar3) {
                                    return aVar3;
                                }
                            }
                            dVar2 = nVar2.messageView;
                            if (dVar2 != null) {
                            }
                            aVar2.d(null);
                            return Unit.f5554a;
                        }
                        if (i3 != 3) {
                            if (i3 != 4) {
                                i0.l("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            aVar2 = (oe.a) kVar.L$0;
                            cf.c.M(obj);
                            aVar2.d(null);
                            return Unit.f5554a;
                        }
                        aVar2 = (oe.a) kVar.L$1;
                        nVar2 = (n) kVar.L$0;
                        cf.c.M(obj);
                        dVar2 = nVar2.messageView;
                        if (dVar2 != null) {
                            kVar.L$0 = aVar2;
                            kVar.L$1 = null;
                            kVar.L$2 = null;
                            kVar.label = 4;
                        }
                        aVar2.d(null);
                        return Unit.f5554a;
                    }
                    aVar2 = (oe.a) kVar.L$2;
                    num2 = (Integer) kVar.L$1;
                    nVar = (n) kVar.L$0;
                    cf.c.M(obj);
                    if (nVar.messageView != null) {
                        com.onesignal.debug.internal.logging.b.warn$default("No messageView found to update a with a new height.", null, 2, null);
                        Unit unit = Unit.f5554a;
                        aVar2.d(null);
                        return unit;
                    }
                    com.onesignal.debug.internal.logging.b.debug$default("In app message, showing first one with height: " + num2, null, 2, null);
                    com.onesignal.inAppMessages.internal.display.impl.d dVar3 = nVar.messageView;
                    if (dVar3 != null) {
                        com.onesignal.inAppMessages.internal.display.impl.i iVar = nVar.webView;
                        iVar.getClass();
                        dVar3.setWebView(iVar);
                    }
                    if (num2 != null) {
                        nVar.lastPageHeight = num2;
                        com.onesignal.inAppMessages.internal.display.impl.d dVar4 = nVar.messageView;
                        if (dVar4 != null) {
                            int intValue = num2.intValue();
                            kVar.L$0 = nVar;
                            kVar.L$1 = aVar2;
                            kVar.L$2 = null;
                            kVar.label = 2;
                            if (dVar4.updateHeight(intValue, kVar) == aVar3) {
                                return aVar3;
                            }
                        }
                    }
                    nVar2 = nVar;
                    dVar = nVar2.messageView;
                    if (dVar != null) {
                    }
                    dVar2 = nVar2.messageView;
                    if (dVar2 != null) {
                    }
                    aVar2.d(null);
                    return Unit.f5554a;
                }
            }
            if (i3 != 0) {
            }
            if (nVar.messageView != null) {
            }
        } catch (Throwable th) {
            num.d(null);
            throw th;
        }
        kVar = new k(aVar);
        Object obj2 = kVar.result;
        md.a aVar32 = md.a.f6622d;
        i3 = kVar.label;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object updateSafeAreaInsets(ld.a aVar) {
        ne.e eVar = k0.f4372a;
        Object B = a0.B(le.o.f5995a, new l(null), aVar);
        return B == md.a.f6622d ? B : Unit.f5554a;
    }

    public final void backgroundDismissAndAwaitNextMessage() {
        com.onesignal.common.threading.b.suspendifyOnThread$default(MARGIN_PX_SIZE, new d(null), 1, null);
    }

    public final void createNewInAppMessageView(boolean z10) {
        this.lastPageHeight = Integer.valueOf(this.messageContent.getPageHeight());
        boolean manifestMetaBoolean = AndroidUtils.INSTANCE.getManifestMetaBoolean(this._applicationService.getAppContext(), "com.onesignal.inAppMessageHideGrayOverlay");
        com.onesignal.inAppMessages.internal.display.impl.i iVar = this.webView;
        iVar.getClass();
        setMessageView(new com.onesignal.inAppMessages.internal.display.impl.d(iVar, this.messageContent, z10, manifestMetaBoolean));
        com.onesignal.inAppMessages.internal.display.impl.d dVar = this.messageView;
        dVar.getClass();
        dVar.setMessageController(new g(this));
        this._applicationService.addActivityLifecycleHandler(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object dismissAndAwaitNextMessage(ld.a aVar) {
        h hVar;
        int i3;
        n nVar;
        if (aVar instanceof h) {
            hVar = (h) aVar;
            int i10 = hVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                hVar.label = i10 - Integer.MIN_VALUE;
                Object obj = hVar.result;
                md.a aVar2 = md.a.f6622d;
                i3 = hVar.label;
                if (i3 != 0) {
                    cf.c.M(obj);
                    com.onesignal.inAppMessages.internal.display.impl.d dVar = this.messageView;
                    if (dVar == null || this.dismissFired) {
                        return Unit.f5554a;
                    }
                    this.dismissFired = true;
                    this._lifecycle.messageWillDismiss(this.message);
                    hVar.L$0 = this;
                    hVar.label = 1;
                    if (dVar.dismissAndAwaitNextMessage(hVar) == aVar2) {
                        return aVar2;
                    }
                    nVar = this;
                } else {
                    if (i3 != 1) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    nVar = (n) hVar.L$0;
                    cf.c.M(obj);
                }
                nVar.dismissFired = false;
                nVar.setMessageView(null);
                return Unit.f5554a;
            }
        }
        hVar = new h(aVar);
        Object obj2 = hVar.result;
        md.a aVar22 = md.a.f6622d;
        i3 = hVar.label;
        if (i3 != 0) {
        }
        nVar.dismissFired = false;
        nVar.setMessageView(null);
        return Unit.f5554a;
    }

    @Override // ea.d
    public void onActivityAvailable(Activity activity) {
        activity.getClass();
        String str = this.currentActivityName;
        this.activity = activity;
        this.currentActivityName = activity.getLocalClassName();
        com.onesignal.debug.internal.logging.b.debug$default(v4.a.p(new StringBuilder("In app message activity available currentActivityName: "), this.currentActivityName, " lastActivityName: ", str), null, 2, null);
        com.onesignal.common.threading.b.suspendifyOnMain(new i(str, this, null));
    }

    @Override // ea.d
    public void onActivityStopped(Activity activity) {
        activity.getClass();
        com.onesignal.debug.internal.logging.b.debug$default(kotlin.text.i.c("\n            In app message activity stopped, cleaning views, currentActivityName: " + this.currentActivityName + "\n            activity: " + this.activity + "\n            messageView: " + this.messageView + "\n            "), null, 2, null);
        if (this.messageView == null || !Intrinsics.a(activity.getLocalClassName(), this.currentActivityName)) {
            return;
        }
        com.onesignal.inAppMessages.internal.display.impl.d dVar = this.messageView;
        dVar.getClass();
        dVar.removeAllViews();
    }

    public final void secureSetup(WebView webView) {
        webView.getClass();
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setMixedContentMode(1);
    }

    public final void setContentSafeAreaInsets(com.onesignal.inAppMessages.internal.d dVar, Activity activity) {
        dVar.getClass();
        activity.getClass();
        String contentHtml = dVar.getContentHtml();
        int[] cutoutAndStatusBarInsets = com.onesignal.common.m.INSTANCE.getCutoutAndStatusBarInsets(activity);
        dVar.setContentHtml(contentHtml + String.format(SET_SAFE_AREA_INSETS_SCRIPT, Arrays.copyOf(new Object[]{String.format(SAFE_AREA_JS_OBJECT, Arrays.copyOf(new Object[]{Integer.valueOf(cutoutAndStatusBarInsets[MARGIN_PX_SIZE]), Integer.valueOf(cutoutAndStatusBarInsets[1]), Integer.valueOf(cutoutAndStatusBarInsets[2]), Integer.valueOf(cutoutAndStatusBarInsets[3])}, 4))}, 1)));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object setupWebView(Activity activity, String str, boolean z10, ld.a aVar) {
        j jVar;
        int i3;
        n nVar;
        if (aVar instanceof j) {
            jVar = (j) aVar;
            int i10 = jVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                jVar.label = i10 - Integer.MIN_VALUE;
                Object obj = jVar.result;
                md.a aVar2 = md.a.f6622d;
                i3 = jVar.label;
                if (i3 != 0) {
                    cf.c.M(obj);
                    enableWebViewRemoteDebugging();
                    com.onesignal.inAppMessages.internal.display.impl.i iVar = new com.onesignal.inAppMessages.internal.display.impl.i(activity);
                    this.webView = iVar;
                    iVar.setOverScrollMode(2);
                    com.onesignal.inAppMessages.internal.display.impl.i iVar2 = this.webView;
                    iVar2.getClass();
                    iVar2.setVerticalScrollBarEnabled(false);
                    com.onesignal.inAppMessages.internal.display.impl.i iVar3 = this.webView;
                    iVar3.getClass();
                    iVar3.setHorizontalScrollBarEnabled(false);
                    com.onesignal.inAppMessages.internal.display.impl.i iVar4 = this.webView;
                    iVar4.getClass();
                    secureSetup(iVar4);
                    com.onesignal.inAppMessages.internal.display.impl.i iVar5 = this.webView;
                    iVar5.getClass();
                    iVar5.addJavascriptInterface(new b(), JS_OBJ_NAME);
                    if (z10) {
                        com.onesignal.inAppMessages.internal.display.impl.i iVar6 = this.webView;
                        iVar6.getClass();
                        iVar6.setSystemUiVisibility(3074);
                        if (Build.VERSION.SDK_INT >= 30) {
                            com.onesignal.inAppMessages.internal.display.impl.i iVar7 = this.webView;
                            iVar7.getClass();
                            iVar7.setFitsSystemWindows(false);
                        }
                    }
                    this._lifecycle.messageWillDisplay(this.message);
                    ea.f fVar = this._applicationService;
                    jVar.L$0 = this;
                    jVar.L$1 = activity;
                    jVar.L$2 = str;
                    jVar.label = 1;
                    if (fVar.waitUntilActivityReady(jVar) == aVar2) {
                        return aVar2;
                    }
                    nVar = this;
                } else {
                    if (i3 != 1) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) jVar.L$2;
                    activity = (Activity) jVar.L$1;
                    nVar = (n) jVar.L$0;
                    cf.c.M(obj);
                }
                nVar.setWebViewToMaxSize(activity);
                com.onesignal.inAppMessages.internal.display.impl.i iVar8 = nVar.webView;
                iVar8.getClass();
                iVar8.loadData(str, "text/html; charset=utf-8", "base64");
                return Unit.f5554a;
            }
        }
        jVar = new j(aVar);
        Object obj2 = jVar.result;
        md.a aVar22 = md.a.f6622d;
        i3 = jVar.label;
        if (i3 != 0) {
        }
        nVar.setWebViewToMaxSize(activity);
        com.onesignal.inAppMessages.internal.display.impl.i iVar82 = nVar.webView;
        iVar82.getClass();
        iVar82.loadData(str, "text/html; charset=utf-8", "base64");
        return Unit.f5554a;
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
