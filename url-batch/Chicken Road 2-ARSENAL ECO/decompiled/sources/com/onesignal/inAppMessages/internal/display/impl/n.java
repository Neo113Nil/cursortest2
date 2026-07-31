package com.onesignal.inAppMessages.internal.display.impl;

import F5.q;
import H5.AbstractC0165z;
import H5.F;
import H5.InterfaceC0163x;
import a.AbstractC0219a;
import android.app.Activity;
import android.os.Build;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.onesignal.common.AndroidUtils;
import java.util.Arrays;
import java.util.Locale;
import k5.v;
import o5.InterfaceC0564d;
import org.json.JSONException;
import org.json.JSONObject;
import p5.EnumC0580a;
import q2.InterfaceC0598b;
import q5.AbstractC0607c;
import r5.InterfaceC0620a;
import t2.InterfaceC0661a;
import u0.AbstractC0676f;
import x5.InterfaceC0743l;
import x5.InterfaceC0747p;

/* loaded from: classes.dex */
public final class n implements T1.d {
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
    private final T1.f _applicationService;
    private final InterfaceC0598b _lifecycle;
    private final InterfaceC0661a _promptFactory;
    private Activity activity;
    private boolean closing;
    private String currentActivityName;
    private boolean dismissFired;
    private Integer lastPageHeight;
    private final com.onesignal.inAppMessages.internal.a message;
    private final com.onesignal.inAppMessages.internal.d messageContent;
    private com.onesignal.inAppMessages.internal.display.impl.d messageView;
    private final P5.a messageViewMutex;
    private com.onesignal.inAppMessages.internal.display.impl.i webView;
    public static final a Companion = new a(null);
    private static final int MARGIN_PX_SIZE = com.onesignal.common.m.INSTANCE.dpToPx(24);

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
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
                if (jSONObject.has(n.IAM_DISPLAY_LOCATION_KEY) && !kotlin.jvm.internal.i.a(jSONObject.get(n.IAM_DISPLAY_LOCATION_KEY), "")) {
                    String optString = jSONObject.optString(n.IAM_DISPLAY_LOCATION_KEY, "FULL_SCREEN");
                    kotlin.jvm.internal.i.d(optString, "optString(...)");
                    Locale locale = Locale.getDefault();
                    kotlin.jvm.internal.i.d(locale, "getDefault(...)");
                    String upperCase = optString.toUpperCase(locale);
                    kotlin.jvm.internal.i.d(upperCase, "toUpperCase(...)");
                    return c.valueOf(upperCase);
                }
            } catch (JSONException e4) {
                e4.printStackTrace();
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
                kotlin.jvm.internal.i.d(jSONObject2, "getJSONObject(...)");
                return nVar.pageRectToViewHeight(activity, jSONObject2);
            } catch (JSONException unused) {
                return -1;
            }
        }

        private final void handleActionTaken(JSONObject jSONObject) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("body");
            kotlin.jvm.internal.i.b(jSONObject2);
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
        public final void postMessage(String message) {
            com.onesignal.inAppMessages.internal.display.impl.d dVar;
            kotlin.jvm.internal.i.e(message, "message");
            try {
                com.onesignal.debug.internal.logging.b.debug$default("OSJavaScriptInterface:postMessage: ".concat(message), null, 2, null);
                JSONObject jSONObject = new JSONObject(message);
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
            } catch (JSONException e4) {
                e4.printStackTrace();
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c {
        private static final /* synthetic */ InterfaceC0620a $ENTRIES;
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
            $ENTRIES = AbstractC0219a.n($values);
        }

        private c(String str, int i7) {
        }

        public static InterfaceC0620a getEntries() {
            return $ENTRIES;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }

        public final boolean isBanner() {
            int i7 = o.$EnumSwitchMapping$0[ordinal()];
            return i7 == 1 || i7 == 2;
        }
    }

    public static final class d extends q5.g implements InterfaceC0743l {
        int label;

        public d(InterfaceC0564d interfaceC0564d) {
            super(1, interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(InterfaceC0564d interfaceC0564d) {
            return n.this.new d(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            int i7 = this.label;
            if (i7 == 0) {
                AbstractC0676f.w(obj);
                n nVar = n.this;
                this.label = 1;
                if (nVar.dismissAndAwaitNextMessage(this) == enumC0580a) {
                    return enumC0580a;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0676f.w(obj);
            }
            return v.f5219a;
        }

        @Override // x5.InterfaceC0743l
        public final Object invoke(InterfaceC0564d interfaceC0564d) {
            return ((d) create(interfaceC0564d)).invokeSuspend(v.f5219a);
        }
    }

    public static final class e extends AbstractC0607c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public e(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return n.this.calculateHeightAndShowWebViewAfterNewActivity(this);
        }
    }

    public static final class f extends q5.g implements InterfaceC0743l {
        final /* synthetic */ int $pagePxHeight;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(int i7, InterfaceC0564d interfaceC0564d) {
            super(1, interfaceC0564d);
            this.$pagePxHeight = i7;
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(InterfaceC0564d interfaceC0564d) {
            return n.this.new f(this.$pagePxHeight, interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            int i7 = this.label;
            if (i7 == 0) {
                AbstractC0676f.w(obj);
                n nVar = n.this;
                Integer num = new Integer(this.$pagePxHeight);
                this.label = 1;
                if (nVar.showMessageView(num, this) == enumC0580a) {
                    return enumC0580a;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0676f.w(obj);
            }
            return v.f5219a;
        }

        @Override // x5.InterfaceC0743l
        public final Object invoke(InterfaceC0564d interfaceC0564d) {
            return ((f) create(interfaceC0564d)).invokeSuspend(v.f5219a);
        }
    }

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

    public static final class h extends AbstractC0607c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public h(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return n.this.dismissAndAwaitNextMessage(this);
        }
    }

    public static final class i extends q5.g implements InterfaceC0743l {
        final /* synthetic */ String $lastActivityName;
        int label;
        final /* synthetic */ n this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, n nVar, InterfaceC0564d interfaceC0564d) {
            super(1, interfaceC0564d);
            this.$lastActivityName = str;
            this.this$0 = nVar;
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(InterfaceC0564d interfaceC0564d) {
            return new i(this.$lastActivityName, this.this$0, interfaceC0564d);
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
        @Override // q5.AbstractC0605a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            int i7 = this.label;
            if (i7 == 0) {
                AbstractC0676f.w(obj);
                String str = this.$lastActivityName;
                if (str == null) {
                    n nVar = this.this$0;
                    this.label = 1;
                } else if (kotlin.jvm.internal.i.a(str, this.this$0.currentActivityName)) {
                    n nVar2 = this.this$0;
                    this.label = 3;
                } else if (!this.this$0.closing) {
                    if (this.this$0.messageView != null) {
                        com.onesignal.inAppMessages.internal.display.impl.d dVar = this.this$0.messageView;
                        kotlin.jvm.internal.i.b(dVar);
                        dVar.removeAllViews();
                    }
                    n nVar3 = this.this$0;
                    Integer num = nVar3.lastPageHeight;
                    this.label = 2;
                }
            } else {
                if (i7 != 1 && i7 != 2 && i7 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0676f.w(obj);
            }
            return v.f5219a;
        }

        @Override // x5.InterfaceC0743l
        public final Object invoke(InterfaceC0564d interfaceC0564d) {
            return ((i) create(interfaceC0564d)).invokeSuspend(v.f5219a);
        }
    }

    public static final class j extends AbstractC0607c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public j(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return n.this.setupWebView(null, null, false, this);
        }
    }

    public static final class k extends AbstractC0607c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public k(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return n.this.showMessageView(null, this);
        }
    }

    public static final class l extends q5.g implements InterfaceC0747p {
        int label;

        public l(InterfaceC0564d interfaceC0564d) {
            super(2, interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(Object obj, InterfaceC0564d interfaceC0564d) {
            return n.this.new l(interfaceC0564d);
        }

        @Override // x5.InterfaceC0747p
        public final Object invoke(InterfaceC0163x interfaceC0163x, InterfaceC0564d interfaceC0564d) {
            return ((l) create(interfaceC0163x, interfaceC0564d)).invokeSuspend(v.f5219a);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0676f.w(obj);
            int[] cutoutAndStatusBarInsets = com.onesignal.common.m.INSTANCE.getCutoutAndStatusBarInsets(n.this.activity);
            String format = String.format(n.SET_SAFE_AREA_INSETS_JS_FUNCTION, Arrays.copyOf(new Object[]{String.format(n.SAFE_AREA_JS_OBJECT, Arrays.copyOf(new Object[]{new Integer(cutoutAndStatusBarInsets[n.MARGIN_PX_SIZE]), new Integer(cutoutAndStatusBarInsets[1]), new Integer(cutoutAndStatusBarInsets[2]), new Integer(cutoutAndStatusBarInsets[3])}, 4))}, 1));
            com.onesignal.inAppMessages.internal.display.impl.i iVar = n.this.webView;
            kotlin.jvm.internal.i.b(iVar);
            iVar.evaluateJavascript(format, null);
            return v.f5219a;
        }
    }

    public n(com.onesignal.inAppMessages.internal.a message, Activity activity, com.onesignal.inAppMessages.internal.d messageContent, InterfaceC0598b _lifecycle, T1.f _applicationService, InterfaceC0661a _promptFactory) {
        kotlin.jvm.internal.i.e(message, "message");
        kotlin.jvm.internal.i.e(activity, "activity");
        kotlin.jvm.internal.i.e(messageContent, "messageContent");
        kotlin.jvm.internal.i.e(_lifecycle, "_lifecycle");
        kotlin.jvm.internal.i.e(_applicationService, "_applicationService");
        kotlin.jvm.internal.i.e(_promptFactory, "_promptFactory");
        this.message = message;
        this.activity = activity;
        this.messageContent = messageContent;
        this._lifecycle = _lifecycle;
        this._applicationService = _applicationService;
        this._promptFactory = _promptFactory;
        this.messageViewMutex = new P5.d();
    }

    private final String bodySnippet(String str) {
        if (str == null || str.length() == 0) {
            return "<empty>";
        }
        String F6 = q.F(q.F(str, '\n', ' '), '\r', ' ');
        return F6.length() <= LOG_BODY_SNIPPET_MAX_CHARS ? F6 : F5.j.f0(F6, LOG_BODY_SNIPPET_MAX_CHARS).concat("…");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object calculateHeightAndShowWebViewAfterNewActivity(InterfaceC0564d interfaceC0564d) {
        e eVar;
        int i7;
        final n nVar;
        n nVar2;
        if (interfaceC0564d instanceof e) {
            eVar = (e) interfaceC0564d;
            int i8 = eVar.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                eVar.label = i8 - Integer.MIN_VALUE;
                Object obj = eVar.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = eVar.label;
                v vVar = v.f5219a;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    com.onesignal.inAppMessages.internal.display.impl.d dVar = this.messageView;
                    if (dVar != null) {
                        if (dVar.getDisplayPosition() != c.FULL_SCREEN || this.messageContent.isFullBleed()) {
                            com.onesignal.debug.internal.logging.b.debug$default("In app message new activity, calculate height and show ", null, 2, null);
                            T1.f fVar = this._applicationService;
                            eVar.L$0 = this;
                            eVar.label = 2;
                            if (fVar.waitUntilActivityReady(eVar) != enumC0580a) {
                                nVar = this;
                            }
                        } else {
                            eVar.label = 1;
                            if (showMessageView(null, eVar) == enumC0580a) {
                            }
                        }
                        return enumC0580a;
                    }
                    return vVar;
                }
                if (i7 == 1) {
                    AbstractC0676f.w(obj);
                    return vVar;
                }
                if (i7 != 2) {
                    if (i7 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    nVar2 = (n) eVar.L$0;
                    AbstractC0676f.w(obj);
                    nVar = nVar2;
                    com.onesignal.inAppMessages.internal.display.impl.i iVar = nVar.webView;
                    kotlin.jvm.internal.i.b(iVar);
                    iVar.evaluateJavascript(GET_PAGE_META_DATA_JS_FUNCTION, new ValueCallback() { // from class: com.onesignal.inAppMessages.internal.display.impl.m
                        @Override // android.webkit.ValueCallback
                        public final void onReceiveValue(Object obj2) {
                            n.calculateHeightAndShowWebViewAfterNewActivity$lambda$0(n.this, (String) obj2);
                        }
                    });
                    return vVar;
                }
                nVar = (n) eVar.L$0;
                AbstractC0676f.w(obj);
                nVar.setWebViewToMaxSize(nVar.activity);
                if (nVar.messageContent.isFullBleed()) {
                    eVar.L$0 = nVar;
                    eVar.label = 3;
                    if (nVar.updateSafeAreaInsets(eVar) != enumC0580a) {
                        nVar2 = nVar;
                        nVar = nVar2;
                    }
                    return enumC0580a;
                }
                com.onesignal.inAppMessages.internal.display.impl.i iVar2 = nVar.webView;
                kotlin.jvm.internal.i.b(iVar2);
                iVar2.evaluateJavascript(GET_PAGE_META_DATA_JS_FUNCTION, new ValueCallback() { // from class: com.onesignal.inAppMessages.internal.display.impl.m
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(Object obj2) {
                        n.calculateHeightAndShowWebViewAfterNewActivity$lambda$0(n.this, (String) obj2);
                    }
                });
                return vVar;
            }
        }
        eVar = new e(interfaceC0564d);
        Object obj2 = eVar.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = eVar.label;
        v vVar2 = v.f5219a;
        if (i7 != 0) {
        }
        nVar.setWebViewToMaxSize(nVar.activity);
        if (nVar.messageContent.isFullBleed()) {
        }
        com.onesignal.inAppMessages.internal.display.impl.i iVar22 = nVar.webView;
        kotlin.jvm.internal.i.b(iVar22);
        iVar22.evaluateJavascript(GET_PAGE_META_DATA_JS_FUNCTION, new ValueCallback() { // from class: com.onesignal.inAppMessages.internal.display.impl.m
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj22) {
                n.calculateHeightAndShowWebViewAfterNewActivity$lambda$0(n.this, (String) obj22);
            }
        });
        return vVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void calculateHeightAndShowWebViewAfterNewActivity$lambda$0(n this$0, String str) {
        kotlin.jvm.internal.i.e(this$0, "this$0");
        if (str == null || F5.j.T(str) || kotlin.jvm.internal.i.a(str, "null")) {
            com.onesignal.debug.internal.logging.b.warn$default("calculateHeightAndShowWebViewAfterNewActivity: empty/null page metadata from WebView; skipping height update", null, 2, null);
            return;
        }
        try {
            com.onesignal.common.threading.b.suspendifyOnIO(this$0.new f(this$0.pageRectToViewHeight(this$0.activity, new JSONObject(str)), null));
        } catch (JSONException e4) {
            com.onesignal.debug.internal.logging.b.warn("calculateHeightAndShowWebViewAfterNewActivity: could not parse page metadata; snippet=" + this$0.bodySnippet(str), e4);
        }
    }

    private final void enableWebViewRemoteDebugging() {
        if (com.onesignal.debug.internal.logging.b.atLogLevel(i2.c.DEBUG)) {
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
        kotlin.jvm.internal.i.b(iVar);
        iVar.layout(MARGIN_PX_SIZE, MARGIN_PX_SIZE, getWebViewMaxSizeX(activity), getWebViewMaxSizeY(activity));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00f3, code lost:
    
        if (r12.checkIfShouldDismiss(r1) == r2) goto L56;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e7 A[Catch: all -> 0x0039, TRY_LEAVE, TryCatch #0 {all -> 0x0039, blocks: (B:14:0x0035, B:21:0x004c, B:22:0x00e3, B:24:0x00e7, B:28:0x0059, B:29:0x00ce, B:31:0x00d2, B:35:0x0088, B:37:0x008c, B:38:0x0097, B:40:0x00aa, B:42:0x00b4, B:44:0x00ba), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d2 A[Catch: all -> 0x0039, TryCatch #0 {all -> 0x0039, blocks: (B:14:0x0035, B:21:0x004c, B:22:0x00e3, B:24:0x00e7, B:28:0x0059, B:29:0x00ce, B:31:0x00d2, B:35:0x0088, B:37:0x008c, B:38:0x0097, B:40:0x00aa, B:42:0x00b4, B:44:0x00ba), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008c A[Catch: all -> 0x0039, TRY_LEAVE, TryCatch #0 {all -> 0x0039, blocks: (B:14:0x0035, B:21:0x004c, B:22:0x00e3, B:24:0x00e7, B:28:0x0059, B:29:0x00ce, B:31:0x00d2, B:35:0x0088, B:37:0x008c, B:38:0x0097, B:40:0x00aa, B:42:0x00b4, B:44:0x00ba), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0097 A[Catch: all -> 0x0039, TRY_ENTER, TryCatch #0 {all -> 0x0039, blocks: (B:14:0x0035, B:21:0x004c, B:22:0x00e3, B:24:0x00e7, B:28:0x0059, B:29:0x00ce, B:31:0x00d2, B:35:0x0088, B:37:0x008c, B:38:0x0097, B:40:0x00aa, B:42:0x00b4, B:44:0x00ba), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object showMessageView(Integer num, InterfaceC0564d interfaceC0564d) {
        k kVar;
        int i7;
        n nVar;
        Integer num2;
        P5.a aVar;
        n nVar2;
        com.onesignal.inAppMessages.internal.display.impl.d dVar;
        com.onesignal.inAppMessages.internal.display.impl.d dVar2;
        try {
            if (interfaceC0564d instanceof k) {
                kVar = (k) interfaceC0564d;
                int i8 = kVar.label;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    kVar.label = i8 - Integer.MIN_VALUE;
                    Object obj = kVar.result;
                    EnumC0580a enumC0580a = EnumC0580a.f5697f;
                    i7 = kVar.label;
                    v vVar = v.f5219a;
                    if (i7 != 0) {
                        AbstractC0676f.w(obj);
                        P5.a aVar2 = this.messageViewMutex;
                        kVar.L$0 = this;
                        kVar.L$1 = num;
                        kVar.L$2 = aVar2;
                        kVar.label = 1;
                        P5.d dVar3 = (P5.d) aVar2;
                        if (dVar3.c(kVar) != enumC0580a) {
                            nVar = this;
                            num2 = num;
                            aVar = dVar3;
                        }
                        return enumC0580a;
                    }
                    if (i7 != 1) {
                        if (i7 == 2) {
                            aVar = (P5.a) kVar.L$1;
                            nVar2 = (n) kVar.L$0;
                            AbstractC0676f.w(obj);
                            dVar = nVar2.messageView;
                            if (dVar != null) {
                                Activity activity = nVar2.activity;
                                kVar.L$0 = nVar2;
                                kVar.L$1 = aVar;
                                kVar.L$2 = null;
                                kVar.label = 3;
                                if (dVar.showView(activity, kVar) == enumC0580a) {
                                    return enumC0580a;
                                }
                            }
                            dVar2 = nVar2.messageView;
                            if (dVar2 != null) {
                            }
                            ((P5.d) aVar).d(null);
                            return vVar;
                        }
                        if (i7 != 3) {
                            if (i7 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            aVar = (P5.a) kVar.L$0;
                            AbstractC0676f.w(obj);
                            ((P5.d) aVar).d(null);
                            return vVar;
                        }
                        aVar = (P5.a) kVar.L$1;
                        nVar2 = (n) kVar.L$0;
                        AbstractC0676f.w(obj);
                        dVar2 = nVar2.messageView;
                        if (dVar2 != null) {
                            kVar.L$0 = aVar;
                            kVar.L$1 = null;
                            kVar.L$2 = null;
                            kVar.label = 4;
                        }
                        ((P5.d) aVar).d(null);
                        return vVar;
                    }
                    aVar = (P5.a) kVar.L$2;
                    num2 = (Integer) kVar.L$1;
                    nVar = (n) kVar.L$0;
                    AbstractC0676f.w(obj);
                    if (nVar.messageView != null) {
                        com.onesignal.debug.internal.logging.b.warn$default("No messageView found to update a with a new height.", null, 2, null);
                        ((P5.d) aVar).d(null);
                        return vVar;
                    }
                    com.onesignal.debug.internal.logging.b.debug$default("In app message, showing first one with height: " + num2, null, 2, null);
                    com.onesignal.inAppMessages.internal.display.impl.d dVar4 = nVar.messageView;
                    if (dVar4 != null) {
                        com.onesignal.inAppMessages.internal.display.impl.i iVar = nVar.webView;
                        kotlin.jvm.internal.i.b(iVar);
                        dVar4.setWebView(iVar);
                    }
                    if (num2 != null) {
                        nVar.lastPageHeight = num2;
                        com.onesignal.inAppMessages.internal.display.impl.d dVar5 = nVar.messageView;
                        if (dVar5 != null) {
                            int intValue = num2.intValue();
                            kVar.L$0 = nVar;
                            kVar.L$1 = aVar;
                            kVar.L$2 = null;
                            kVar.label = 2;
                            if (dVar5.updateHeight(intValue, kVar) == enumC0580a) {
                                return enumC0580a;
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
                    ((P5.d) aVar).d(null);
                    return vVar;
                }
            }
            if (i7 != 0) {
            }
            if (nVar.messageView != null) {
            }
        } catch (Throwable th) {
            ((P5.d) num).d(null);
            throw th;
        }
        kVar = new k(interfaceC0564d);
        Object obj2 = kVar.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = kVar.label;
        v vVar2 = v.f5219a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object updateSafeAreaInsets(InterfaceC0564d interfaceC0564d) {
        O5.d dVar = F.f1027a;
        Object t6 = AbstractC0165z.t(M5.o.f1618a, new l(null), interfaceC0564d);
        return t6 == EnumC0580a.f5697f ? t6 : v.f5219a;
    }

    public final void backgroundDismissAndAwaitNextMessage() {
        com.onesignal.common.threading.b.suspendifyOnDefault(new d(null));
    }

    public final void createNewInAppMessageView(boolean z5) {
        this.lastPageHeight = Integer.valueOf(this.messageContent.getPageHeight());
        boolean manifestMetaBoolean = AndroidUtils.INSTANCE.getManifestMetaBoolean(this._applicationService.getAppContext(), "com.onesignal.inAppMessageHideGrayOverlay");
        com.onesignal.inAppMessages.internal.display.impl.i iVar = this.webView;
        kotlin.jvm.internal.i.b(iVar);
        setMessageView(new com.onesignal.inAppMessages.internal.display.impl.d(iVar, this.messageContent, z5, manifestMetaBoolean));
        com.onesignal.inAppMessages.internal.display.impl.d dVar = this.messageView;
        kotlin.jvm.internal.i.b(dVar);
        dVar.setMessageController(new g(this));
        this._applicationService.addActivityLifecycleHandler(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object dismissAndAwaitNextMessage(InterfaceC0564d interfaceC0564d) {
        h hVar;
        int i7;
        n nVar;
        if (interfaceC0564d instanceof h) {
            hVar = (h) interfaceC0564d;
            int i8 = hVar.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                hVar.label = i8 - Integer.MIN_VALUE;
                Object obj = hVar.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = hVar.label;
                v vVar = v.f5219a;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    com.onesignal.inAppMessages.internal.display.impl.d dVar = this.messageView;
                    if (dVar != null && !this.dismissFired) {
                        this.dismissFired = true;
                        this._lifecycle.messageWillDismiss(this.message);
                        hVar.L$0 = this;
                        hVar.label = 1;
                        if (dVar.dismissAndAwaitNextMessage(hVar) == enumC0580a) {
                            return enumC0580a;
                        }
                        nVar = this;
                    }
                    return vVar;
                }
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                nVar = (n) hVar.L$0;
                AbstractC0676f.w(obj);
                nVar.dismissFired = false;
                nVar.setMessageView(null);
                return vVar;
            }
        }
        hVar = new h(interfaceC0564d);
        Object obj2 = hVar.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = hVar.label;
        v vVar2 = v.f5219a;
        if (i7 != 0) {
        }
        nVar.dismissFired = false;
        nVar.setMessageView(null);
        return vVar2;
    }

    @Override // T1.d
    public void onActivityAvailable(Activity activity) {
        kotlin.jvm.internal.i.e(activity, "activity");
        String str = this.currentActivityName;
        this.activity = activity;
        this.currentActivityName = activity.getLocalClassName();
        com.onesignal.debug.internal.logging.b.debug$default("In app message activity available currentActivityName: " + this.currentActivityName + " lastActivityName: " + str, null, 2, null);
        com.onesignal.common.threading.b.suspendifyOnMain(new i(str, this, null));
    }

    @Override // T1.d
    public void onActivityStopped(Activity activity) {
        kotlin.jvm.internal.i.e(activity, "activity");
        com.onesignal.debug.internal.logging.b.debug$default(F5.k.y("\n            In app message activity stopped, cleaning views, currentActivityName: " + this.currentActivityName + "\n            activity: " + this.activity + "\n            messageView: " + this.messageView + "\n            "), null, 2, null);
        if (this.messageView == null || !kotlin.jvm.internal.i.a(activity.getLocalClassName(), this.currentActivityName)) {
            return;
        }
        com.onesignal.inAppMessages.internal.display.impl.d dVar = this.messageView;
        kotlin.jvm.internal.i.b(dVar);
        dVar.removeAllViews();
    }

    public final void secureSetup(WebView webView) {
        kotlin.jvm.internal.i.e(webView, "webView");
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setMixedContentMode(1);
    }

    public final void setContentSafeAreaInsets(com.onesignal.inAppMessages.internal.d content, Activity activity) {
        kotlin.jvm.internal.i.e(content, "content");
        kotlin.jvm.internal.i.e(activity, "activity");
        String contentHtml = content.getContentHtml();
        int[] cutoutAndStatusBarInsets = com.onesignal.common.m.INSTANCE.getCutoutAndStatusBarInsets(activity);
        content.setContentHtml(contentHtml + String.format(SET_SAFE_AREA_INSETS_SCRIPT, Arrays.copyOf(new Object[]{String.format(SAFE_AREA_JS_OBJECT, Arrays.copyOf(new Object[]{Integer.valueOf(cutoutAndStatusBarInsets[MARGIN_PX_SIZE]), Integer.valueOf(cutoutAndStatusBarInsets[1]), Integer.valueOf(cutoutAndStatusBarInsets[2]), Integer.valueOf(cutoutAndStatusBarInsets[3])}, 4))}, 1)));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object setupWebView(Activity activity, String str, boolean z5, InterfaceC0564d interfaceC0564d) {
        j jVar;
        int i7;
        n nVar;
        if (interfaceC0564d instanceof j) {
            jVar = (j) interfaceC0564d;
            int i8 = jVar.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                jVar.label = i8 - Integer.MIN_VALUE;
                Object obj = jVar.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = jVar.label;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    enableWebViewRemoteDebugging();
                    com.onesignal.inAppMessages.internal.display.impl.i iVar = new com.onesignal.inAppMessages.internal.display.impl.i(activity);
                    this.webView = iVar;
                    iVar.setOverScrollMode(2);
                    com.onesignal.inAppMessages.internal.display.impl.i iVar2 = this.webView;
                    kotlin.jvm.internal.i.b(iVar2);
                    iVar2.setVerticalScrollBarEnabled(false);
                    com.onesignal.inAppMessages.internal.display.impl.i iVar3 = this.webView;
                    kotlin.jvm.internal.i.b(iVar3);
                    iVar3.setHorizontalScrollBarEnabled(false);
                    com.onesignal.inAppMessages.internal.display.impl.i iVar4 = this.webView;
                    kotlin.jvm.internal.i.b(iVar4);
                    secureSetup(iVar4);
                    com.onesignal.inAppMessages.internal.display.impl.i iVar5 = this.webView;
                    kotlin.jvm.internal.i.b(iVar5);
                    iVar5.addJavascriptInterface(new b(), JS_OBJ_NAME);
                    if (z5) {
                        com.onesignal.inAppMessages.internal.display.impl.i iVar6 = this.webView;
                        kotlin.jvm.internal.i.b(iVar6);
                        iVar6.setSystemUiVisibility(3074);
                        if (Build.VERSION.SDK_INT >= 30) {
                            com.onesignal.inAppMessages.internal.display.impl.i iVar7 = this.webView;
                            kotlin.jvm.internal.i.b(iVar7);
                            iVar7.setFitsSystemWindows(false);
                        }
                    }
                    this._lifecycle.messageWillDisplay(this.message);
                    T1.f fVar = this._applicationService;
                    jVar.L$0 = this;
                    jVar.L$1 = activity;
                    jVar.L$2 = str;
                    jVar.label = 1;
                    if (fVar.waitUntilActivityReady(jVar) == enumC0580a) {
                        return enumC0580a;
                    }
                    nVar = this;
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) jVar.L$2;
                    activity = (Activity) jVar.L$1;
                    nVar = (n) jVar.L$0;
                    AbstractC0676f.w(obj);
                }
                nVar.setWebViewToMaxSize(activity);
                com.onesignal.inAppMessages.internal.display.impl.i iVar8 = nVar.webView;
                kotlin.jvm.internal.i.b(iVar8);
                iVar8.loadData(str, "text/html; charset=utf-8", "base64");
                return v.f5219a;
            }
        }
        jVar = new j(interfaceC0564d);
        Object obj2 = jVar.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = jVar.label;
        if (i7 != 0) {
        }
        nVar.setWebViewToMaxSize(activity);
        com.onesignal.inAppMessages.internal.display.impl.i iVar82 = nVar.webView;
        kotlin.jvm.internal.i.b(iVar82);
        iVar82.loadData(str, "text/html; charset=utf-8", "base64");
        return v.f5219a;
    }
}
