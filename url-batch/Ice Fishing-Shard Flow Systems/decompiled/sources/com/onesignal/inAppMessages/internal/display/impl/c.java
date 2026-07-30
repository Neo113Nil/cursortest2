package com.onesignal.inAppMessages.internal.display.impl;

import android.app.Activity;
import android.util.Base64;
import java.nio.charset.Charset;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import n6.AbstractC0792z;
import n6.F;
import n6.InterfaceC0789w;
import o6.C0809e;
import u6.C0953e;

/* loaded from: classes.dex */
public final class c implements Q2.a {
    public static final a Companion = new a(null);
    private static final int IN_APP_MESSAGE_INIT_DELAY = 200;
    private final v2.f _applicationService;
    private final O2.b _backend;
    private final com.onesignal.core.internal.config.c _configModelStore;
    private final J3.a _influenceManager;
    private final D2.a _languageContext;
    private final S2.b _lifecycle;
    private final V2.a _promptFactory;
    private final I2.a _time;
    private m lastInstance;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends X5.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public b(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.displayMessage(null, this);
        }
    }

    /* renamed from: com.onesignal.inAppMessages.internal.display.impl.c$c, reason: collision with other inner class name */
    public static final class C0034c extends X5.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C0034c(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.displayPreviewMessage(null, this);
        }
    }

    public static final class d extends X5.c {
        int label;
        /* synthetic */ Object result;

        public d(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.initInAppMessage(null, null, null, this);
        }
    }

    public static final class e extends X5.j implements Function2 {
        final /* synthetic */ String $base64Str;
        final /* synthetic */ com.onesignal.inAppMessages.internal.d $content;
        final /* synthetic */ Activity $currentActivity;
        final /* synthetic */ m $webViewManager;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(m mVar, Activity activity, String str, com.onesignal.inAppMessages.internal.d dVar, V5.b bVar) {
            super(2, bVar);
            this.$webViewManager = mVar;
            this.$currentActivity = activity;
            this.$base64Str = str;
            this.$content = dVar;
        }

        @Override // X5.a
        public final V5.b create(Object obj, V5.b bVar) {
            return new e(this.$webViewManager, this.$currentActivity, this.$base64Str, this.$content, bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            int i2 = this.label;
            try {
                if (i2 == 0) {
                    V6.b.P(obj);
                    m mVar = this.$webViewManager;
                    Activity activity = this.$currentActivity;
                    String base64Str = this.$base64Str;
                    Intrinsics.checkNotNullExpressionValue(base64Str, "$base64Str");
                    boolean isFullBleed = this.$content.isFullBleed();
                    this.label = 1;
                    if (mVar.setupWebView(activity, base64Str, isFullBleed, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    V6.b.P(obj);
                }
            } catch (Exception e7) {
                if (e7.getMessage() != null) {
                    String message = e7.getMessage();
                    Intrinsics.b(message);
                    if (StringsKt.u(message, "No WebView installed", false)) {
                        com.onesignal.debug.internal.logging.b.info("Error setting up WebView: ", e7);
                    }
                }
                throw e7;
            }
            return Unit.f6114a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0789w interfaceC0789w, V5.b bVar) {
            return ((e) create(interfaceC0789w, bVar)).invokeSuspend(Unit.f6114a);
        }
    }

    public static final class f extends X5.c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public f(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.showMessageContent(null, null, this);
        }
    }

    public c(v2.f _applicationService, S2.b _lifecycle, V2.a _promptFactory, O2.b _backend, J3.a _influenceManager, com.onesignal.core.internal.config.c _configModelStore, D2.a _languageContext, I2.a _time) {
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_lifecycle, "_lifecycle");
        Intrinsics.checkNotNullParameter(_promptFactory, "_promptFactory");
        Intrinsics.checkNotNullParameter(_backend, "_backend");
        Intrinsics.checkNotNullParameter(_influenceManager, "_influenceManager");
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        Intrinsics.checkNotNullParameter(_languageContext, "_languageContext");
        Intrinsics.checkNotNullParameter(_time, "_time");
        this._applicationService = _applicationService;
        this._lifecycle = _lifecycle;
        this._promptFactory = _promptFactory;
        this._backend = _backend;
        this._influenceManager = _influenceManager;
        this._configModelStore = _configModelStore;
        this._languageContext = _languageContext;
        this._time = _time;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(1:(1:10)(2:14|15))(5:16|17|(1:19)(1:23)|20|(1:22))|11|12))|26|6|7|(0)(0)|11|12) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x002c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0098, code lost:
    
        com.onesignal.debug.internal.logging.b.error("Catch on initInAppMessage: ", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object initInAppMessage(Activity activity, com.onesignal.inAppMessages.internal.a aVar, com.onesignal.inAppMessages.internal.d dVar, V5.b bVar) {
        d dVar2;
        int i2;
        Activity activity2;
        com.onesignal.inAppMessages.internal.d dVar3;
        if (bVar instanceof d) {
            dVar2 = (d) bVar;
            int i5 = dVar2.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                dVar2.label = i5 - Integer.MIN_VALUE;
                Object obj = dVar2.result;
                W5.a aVar2 = W5.a.f2787d;
                i2 = dVar2.label;
                if (i2 != 0) {
                    V6.b.P(obj);
                    String contentHtml = dVar.getContentHtml();
                    Intrinsics.b(contentHtml);
                    Charset forName = Charset.forName("UTF-8");
                    Intrinsics.checkNotNullExpressionValue(forName, "forName(...)");
                    byte[] bytes = contentHtml.getBytes(forName);
                    Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                    String encodeToString = Base64.encodeToString(bytes, 2);
                    m mVar = new m(aVar, activity, dVar, this._lifecycle, this._applicationService, this._promptFactory);
                    this.lastInstance = mVar;
                    if (dVar.isFullBleed()) {
                        activity2 = activity;
                        dVar3 = dVar;
                        mVar.setContentSafeAreaInsets(dVar3, activity2);
                    } else {
                        activity2 = activity;
                        dVar3 = dVar;
                    }
                    C0953e c0953e = F.f7011a;
                    C0809e c0809e = s6.n.f7850a;
                    e eVar = new e(mVar, activity2, encodeToString, dVar3, null);
                    dVar2.label = 1;
                    if (AbstractC0792z.t(c0809e, eVar, dVar2) == aVar2) {
                        return aVar2;
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
        dVar2 = new d(bVar);
        Object obj2 = dVar2.result;
        W5.a aVar22 = W5.a.f2787d;
        i2 = dVar2.label;
        if (i2 != 0) {
        }
        return Unit.f6114a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00e4, code lost:
    
        if (r2.showMessageContent(r11, r12, r0) != r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b7, code lost:
    
        if (r3.initInAppMessage(r11, r2, r12, r0) != r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c0, code lost:
    
        if (initInAppMessage(r13, r11, r12, r0) == r1) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object showMessageContent(com.onesignal.inAppMessages.internal.a aVar, com.onesignal.inAppMessages.internal.d dVar, V5.b bVar) {
        f fVar;
        int i2;
        c cVar;
        c cVar2;
        com.onesignal.inAppMessages.internal.a aVar2;
        Activity activity;
        if (bVar instanceof f) {
            fVar = (f) bVar;
            int i5 = fVar.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                fVar.label = i5 - Integer.MIN_VALUE;
                Object obj = fVar.result;
                W5.a aVar3 = W5.a.f2787d;
                i2 = fVar.label;
                if (i2 != 0) {
                    V6.b.P(obj);
                    Activity current = this._applicationService.getCurrent();
                    com.onesignal.debug.internal.logging.b.debug$default("InAppDisplayer.showMessageContent: in app message on currentActivity: " + current, null, 2, null);
                    if (current == null) {
                        fVar.L$0 = this;
                        fVar.L$1 = aVar;
                        fVar.L$2 = dVar;
                        fVar.label = 4;
                        if (AbstractC0792z.d(200L, fVar) != aVar3) {
                            cVar = this;
                            fVar.L$0 = null;
                            fVar.L$1 = null;
                            fVar.L$2 = null;
                            fVar.label = 5;
                        }
                    } else if (this.lastInstance == null || !aVar.isPreview()) {
                        fVar.label = 3;
                    } else {
                        m mVar = this.lastInstance;
                        Intrinsics.b(mVar);
                        fVar.L$0 = this;
                        fVar.L$1 = aVar;
                        fVar.L$2 = dVar;
                        fVar.L$3 = current;
                        fVar.label = 1;
                        if (mVar.dismissAndAwaitNextMessage(fVar) != aVar3) {
                            cVar2 = this;
                            aVar2 = aVar;
                            activity = current;
                            cVar2.lastInstance = null;
                            fVar.L$0 = null;
                            fVar.L$1 = null;
                            fVar.L$2 = null;
                            fVar.L$3 = null;
                            fVar.label = 2;
                        }
                    }
                    return aVar3;
                }
                if (i2 == 1) {
                    activity = (Activity) fVar.L$3;
                    dVar = (com.onesignal.inAppMessages.internal.d) fVar.L$2;
                    aVar2 = (com.onesignal.inAppMessages.internal.a) fVar.L$1;
                    cVar2 = (c) fVar.L$0;
                    V6.b.P(obj);
                    cVar2.lastInstance = null;
                    fVar.L$0 = null;
                    fVar.L$1 = null;
                    fVar.L$2 = null;
                    fVar.L$3 = null;
                    fVar.label = 2;
                } else {
                    if (i2 == 2 || i2 == 3) {
                        V6.b.P(obj);
                        return Unit.f6114a;
                    }
                    if (i2 != 4) {
                        if (i2 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        V6.b.P(obj);
                        return Unit.f6114a;
                    }
                    dVar = (com.onesignal.inAppMessages.internal.d) fVar.L$2;
                    aVar = (com.onesignal.inAppMessages.internal.a) fVar.L$1;
                    cVar = (c) fVar.L$0;
                    V6.b.P(obj);
                    fVar.L$0 = null;
                    fVar.L$1 = null;
                    fVar.L$2 = null;
                    fVar.label = 5;
                }
            }
        }
        fVar = new f(bVar);
        Object obj2 = fVar.result;
        W5.a aVar32 = W5.a.f2787d;
        i2 = fVar.label;
        if (i2 != 0) {
        }
    }

    @Override // Q2.a
    public void dismissCurrentInAppMessage() {
        com.onesignal.debug.internal.logging.b.debug$default("WebViewManager IAM dismissAndAwaitNextMessage lastInstance: " + this.lastInstance, null, 2, null);
        m mVar = this.lastInstance;
        if (mVar != null) {
            Intrinsics.b(mVar);
            mVar.backgroundDismissAndAwaitNextMessage();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a2, code lost:
    
        if (r2.showMessageContent(r9, r10, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // Q2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object displayMessage(com.onesignal.inAppMessages.internal.a aVar, V5.b bVar) {
        b bVar2;
        int i2;
        c cVar;
        O2.a aVar2;
        if (bVar instanceof b) {
            bVar2 = (b) bVar;
            int i5 = bVar2.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                bVar2.label = i5 - Integer.MIN_VALUE;
                Object obj = bVar2.result;
                W5.a aVar3 = W5.a.f2787d;
                i2 = bVar2.label;
                if (i2 != 0) {
                    V6.b.P(obj);
                    O2.b bVar3 = this._backend;
                    String appId = ((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getAppId();
                    String messageId = aVar.getMessageId();
                    String variantIdForMessage = P2.a.INSTANCE.variantIdForMessage(aVar, this._languageContext);
                    bVar2.L$0 = this;
                    bVar2.L$1 = aVar;
                    bVar2.label = 1;
                    obj = bVar3.getIAMData(appId, messageId, variantIdForMessage, bVar2);
                    if (obj != aVar3) {
                        cVar = this;
                    }
                    return aVar3;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    V6.b.P(obj);
                    return Boolean.TRUE;
                }
                aVar = (com.onesignal.inAppMessages.internal.a) bVar2.L$1;
                cVar = (c) bVar2.L$0;
                V6.b.P(obj);
                aVar2 = (O2.a) obj;
                if (aVar2.getContent() != null) {
                    if (aVar2.getShouldRetry()) {
                        return null;
                    }
                    return Boolean.FALSE;
                }
                com.onesignal.inAppMessages.internal.d content = aVar2.getContent();
                Intrinsics.b(content);
                Double displayDuration = content.getDisplayDuration();
                Intrinsics.b(displayDuration);
                aVar.setDisplayDuration(displayDuration.doubleValue());
                cVar._influenceManager.onInAppMessageDisplayed(aVar.getMessageId());
                com.onesignal.inAppMessages.internal.d content2 = aVar2.getContent();
                Intrinsics.b(content2);
                bVar2.L$0 = null;
                bVar2.L$1 = null;
                bVar2.label = 2;
            }
        }
        bVar2 = new b(bVar);
        Object obj2 = bVar2.result;
        W5.a aVar32 = W5.a.f2787d;
        i2 = bVar2.label;
        if (i2 != 0) {
        }
        aVar2 = (O2.a) obj2;
        if (aVar2.getContent() != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0086, code lost:
    
        if (r2.showMessageContent(r8, r9, r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // Q2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object displayPreviewMessage(String str, V5.b bVar) {
        C0034c c0034c;
        int i2;
        com.onesignal.inAppMessages.internal.a aVar;
        c cVar;
        com.onesignal.inAppMessages.internal.d dVar;
        if (bVar instanceof C0034c) {
            c0034c = (C0034c) bVar;
            int i5 = c0034c.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c0034c.label = i5 - Integer.MIN_VALUE;
                Object obj = c0034c.result;
                W5.a aVar2 = W5.a.f2787d;
                i2 = c0034c.label;
                boolean z7 = true;
                if (i2 != 0) {
                    V6.b.P(obj);
                    com.onesignal.inAppMessages.internal.a aVar3 = new com.onesignal.inAppMessages.internal.a(true, this._time);
                    O2.b bVar2 = this._backend;
                    String appId = ((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getAppId();
                    c0034c.L$0 = this;
                    c0034c.L$1 = aVar3;
                    c0034c.label = 1;
                    Object iAMPreviewData = bVar2.getIAMPreviewData(appId, str, c0034c);
                    if (iAMPreviewData != aVar2) {
                        obj = iAMPreviewData;
                        aVar = aVar3;
                        cVar = this;
                    }
                    return aVar2;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    V6.b.P(obj);
                    return Boolean.valueOf(z7);
                }
                aVar = (com.onesignal.inAppMessages.internal.a) c0034c.L$1;
                cVar = (c) c0034c.L$0;
                V6.b.P(obj);
                dVar = (com.onesignal.inAppMessages.internal.d) obj;
                if (dVar != null) {
                    z7 = false;
                } else {
                    Double displayDuration = dVar.getDisplayDuration();
                    Intrinsics.b(displayDuration);
                    aVar.setDisplayDuration(displayDuration.doubleValue());
                    c0034c.L$0 = null;
                    c0034c.L$1 = null;
                    c0034c.label = 2;
                }
                return Boolean.valueOf(z7);
            }
        }
        c0034c = new C0034c(bVar);
        Object obj2 = c0034c.result;
        W5.a aVar22 = W5.a.f2787d;
        i2 = c0034c.label;
        boolean z72 = true;
        if (i2 != 0) {
        }
        dVar = (com.onesignal.inAppMessages.internal.d) obj2;
        if (dVar != null) {
        }
        return Boolean.valueOf(z72);
    }
}
