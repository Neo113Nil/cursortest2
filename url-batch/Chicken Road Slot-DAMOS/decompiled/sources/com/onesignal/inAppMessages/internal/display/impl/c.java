package com.onesignal.inAppMessages.internal.display.impl;

import android.app.Activity;
import android.util.Base64;
import ge.a0;
import ge.k0;
import ge.x;
import java.nio.charset.Charset;
import kotlin.Unit;
import kotlin.collections.i0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c implements za.a {
    public static final a Companion = new a(null);
    private static final int IN_APP_MESSAGE_INIT_DELAY = 200;
    private final ea.f _applicationService;
    private final xa.b _backend;
    private final com.onesignal.core.internal.config.b _configModelStore;
    private final oc.a _influenceManager;
    private final la.a _languageContext;
    private final bb.b _lifecycle;
    private final eb.a _promptFactory;
    private final sa.a _time;
    private n lastInstance;

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class b extends nd.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public b(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.displayMessage(null, this);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    /* renamed from: com.onesignal.inAppMessages.internal.display.impl.c$c, reason: collision with other inner class name */
    public static final class C0027c extends nd.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C0027c(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.displayPreviewMessage(null, this);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class d extends nd.c {
        int label;
        /* synthetic */ Object result;

        public d(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.initInAppMessage(null, null, null, this);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class e extends nd.i implements Function2 {
        final /* synthetic */ String $base64Str;
        final /* synthetic */ com.onesignal.inAppMessages.internal.d $content;
        final /* synthetic */ Activity $currentActivity;
        final /* synthetic */ n $webViewManager;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(n nVar, Activity activity, String str, com.onesignal.inAppMessages.internal.d dVar, ld.a aVar) {
            super(2, aVar);
            this.$webViewManager = nVar;
            this.$currentActivity = activity;
            this.$base64Str = str;
            this.$content = dVar;
        }

        @Override // nd.a
        public final ld.a create(Object obj, ld.a aVar) {
            return new e(this.$webViewManager, this.$currentActivity, this.$base64Str, this.$content, aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, ld.a aVar) {
            return ((e) create(xVar, aVar)).invokeSuspend(Unit.f5554a);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            md.a aVar = md.a.f6622d;
            int i3 = this.label;
            try {
                if (i3 == 0) {
                    cf.c.M(obj);
                    n nVar = this.$webViewManager;
                    Activity activity = this.$currentActivity;
                    String str = this.$base64Str;
                    str.getClass();
                    boolean isFullBleed = this.$content.isFullBleed();
                    this.label = 1;
                    if (nVar.setupWebView(activity, str, isFullBleed, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i3 != 1) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cf.c.M(obj);
                }
            } catch (Exception e2) {
                if (e2.getMessage() != null) {
                    String message = e2.getMessage();
                    message.getClass();
                    if (StringsKt.n(message, "No WebView installed")) {
                        com.onesignal.debug.internal.logging.b.error("Error setting up WebView: ", e2);
                    }
                }
                throw e2;
            }
            return Unit.f5554a;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class f extends nd.c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public f(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.showMessageContent(null, null, this);
        }
    }

    public c(ea.f fVar, bb.b bVar, eb.a aVar, xa.b bVar2, oc.a aVar2, com.onesignal.core.internal.config.b bVar3, la.a aVar3, sa.a aVar4) {
        fVar.getClass();
        bVar.getClass();
        aVar.getClass();
        bVar2.getClass();
        aVar2.getClass();
        bVar3.getClass();
        aVar3.getClass();
        aVar4.getClass();
        this._applicationService = fVar;
        this._lifecycle = bVar;
        this._promptFactory = aVar;
        this._backend = bVar2;
        this._influenceManager = aVar2;
        this._configModelStore = bVar3;
        this._languageContext = aVar3;
        this._time = aVar4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(1:(1:10)(2:14|15))(5:16|17|(1:19)(1:23)|20|(1:22))|11|12))|26|6|7|(0)(0)|11|12) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x002c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0092, code lost:
    
        com.onesignal.debug.internal.logging.b.error("Catch on initInAppMessage: ", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object initInAppMessage(Activity activity, com.onesignal.inAppMessages.internal.a aVar, com.onesignal.inAppMessages.internal.d dVar, ld.a aVar2) {
        d dVar2;
        int i3;
        Activity activity2;
        com.onesignal.inAppMessages.internal.d dVar3;
        if (aVar2 instanceof d) {
            dVar2 = (d) aVar2;
            int i10 = dVar2.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar2.label = i10 - Integer.MIN_VALUE;
                Object obj = dVar2.result;
                md.a aVar3 = md.a.f6622d;
                i3 = dVar2.label;
                if (i3 != 0) {
                    cf.c.M(obj);
                    String contentHtml = dVar.getContentHtml();
                    contentHtml.getClass();
                    Charset forName = Charset.forName("UTF-8");
                    forName.getClass();
                    byte[] bytes = contentHtml.getBytes(forName);
                    bytes.getClass();
                    String encodeToString = Base64.encodeToString(bytes, 2);
                    n nVar = new n(aVar, activity, dVar, this._lifecycle, this._applicationService, this._promptFactory);
                    this.lastInstance = nVar;
                    if (dVar.isFullBleed()) {
                        activity2 = activity;
                        dVar3 = dVar;
                        nVar.setContentSafeAreaInsets(dVar3, activity2);
                    } else {
                        activity2 = activity;
                        dVar3 = dVar;
                    }
                    ne.e eVar = k0.f4372a;
                    he.d dVar4 = le.o.f5995a;
                    e eVar2 = new e(nVar, activity2, encodeToString, dVar3, null);
                    dVar2.label = 1;
                    if (a0.B(dVar4, eVar2, dVar2) == aVar3) {
                        return aVar3;
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
        dVar2 = new d(aVar2);
        Object obj2 = dVar2.result;
        md.a aVar32 = md.a.f6622d;
        i3 = dVar2.label;
        if (i3 != 0) {
        }
        return Unit.f5554a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00e3, code lost:
    
        if (r2.showMessageContent(r11, r12, r0) != r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b6, code lost:
    
        if (r3.initInAppMessage(r11, r2, r12, r0) != r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bf, code lost:
    
        if (initInAppMessage(r13, r11, r12, r0) == r1) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object showMessageContent(com.onesignal.inAppMessages.internal.a aVar, com.onesignal.inAppMessages.internal.d dVar, ld.a aVar2) {
        f fVar;
        int i3;
        c cVar;
        c cVar2;
        com.onesignal.inAppMessages.internal.a aVar3;
        Activity activity;
        if (aVar2 instanceof f) {
            fVar = (f) aVar2;
            int i10 = fVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar.label = i10 - Integer.MIN_VALUE;
                Object obj = fVar.result;
                md.a aVar4 = md.a.f6622d;
                i3 = fVar.label;
                if (i3 != 0) {
                    cf.c.M(obj);
                    Activity current = this._applicationService.getCurrent();
                    com.onesignal.debug.internal.logging.b.debug$default("InAppDisplayer.showMessageContent: in app message on currentActivity: " + current, null, 2, null);
                    if (current == null) {
                        fVar.L$0 = this;
                        fVar.L$1 = aVar;
                        fVar.L$2 = dVar;
                        fVar.label = 4;
                        if (a0.i(200L, fVar) != aVar4) {
                            cVar = this;
                            fVar.L$0 = null;
                            fVar.L$1 = null;
                            fVar.L$2 = null;
                            fVar.label = 5;
                        }
                    } else if (this.lastInstance == null || !aVar.isPreview()) {
                        fVar.label = 3;
                    } else {
                        n nVar = this.lastInstance;
                        nVar.getClass();
                        fVar.L$0 = this;
                        fVar.L$1 = aVar;
                        fVar.L$2 = dVar;
                        fVar.L$3 = current;
                        fVar.label = 1;
                        if (nVar.dismissAndAwaitNextMessage(fVar) != aVar4) {
                            cVar2 = this;
                            aVar3 = aVar;
                            activity = current;
                            cVar2.lastInstance = null;
                            fVar.L$0 = null;
                            fVar.L$1 = null;
                            fVar.L$2 = null;
                            fVar.L$3 = null;
                            fVar.label = 2;
                        }
                    }
                    return aVar4;
                }
                if (i3 == 1) {
                    activity = (Activity) fVar.L$3;
                    dVar = (com.onesignal.inAppMessages.internal.d) fVar.L$2;
                    aVar3 = (com.onesignal.inAppMessages.internal.a) fVar.L$1;
                    cVar2 = (c) fVar.L$0;
                    cf.c.M(obj);
                    cVar2.lastInstance = null;
                    fVar.L$0 = null;
                    fVar.L$1 = null;
                    fVar.L$2 = null;
                    fVar.L$3 = null;
                    fVar.label = 2;
                } else {
                    if (i3 == 2 || i3 == 3) {
                        cf.c.M(obj);
                        return Unit.f5554a;
                    }
                    if (i3 != 4) {
                        if (i3 == 5) {
                            cf.c.M(obj);
                            return Unit.f5554a;
                        }
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    dVar = (com.onesignal.inAppMessages.internal.d) fVar.L$2;
                    aVar = (com.onesignal.inAppMessages.internal.a) fVar.L$1;
                    cVar = (c) fVar.L$0;
                    cf.c.M(obj);
                    fVar.L$0 = null;
                    fVar.L$1 = null;
                    fVar.L$2 = null;
                    fVar.label = 5;
                }
            }
        }
        fVar = new f(aVar2);
        Object obj2 = fVar.result;
        md.a aVar42 = md.a.f6622d;
        i3 = fVar.label;
        if (i3 != 0) {
        }
    }

    @Override // za.a
    public void dismissCurrentInAppMessage() {
        com.onesignal.debug.internal.logging.b.debug$default("WebViewManager IAM dismissAndAwaitNextMessage lastInstance: " + this.lastInstance, null, 2, null);
        n nVar = this.lastInstance;
        if (nVar != null) {
            nVar.getClass();
            nVar.backgroundDismissAndAwaitNextMessage();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a1, code lost:
    
        if (r2.showMessageContent(r9, r10, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // za.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object displayMessage(com.onesignal.inAppMessages.internal.a aVar, ld.a aVar2) {
        b bVar;
        int i3;
        c cVar;
        xa.a aVar3;
        if (aVar2 instanceof b) {
            bVar = (b) aVar2;
            int i10 = bVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.label = i10 - Integer.MIN_VALUE;
                Object obj = bVar.result;
                md.a aVar4 = md.a.f6622d;
                i3 = bVar.label;
                if (i3 != 0) {
                    cf.c.M(obj);
                    xa.b bVar2 = this._backend;
                    String appId = ((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getAppId();
                    String messageId = aVar.getMessageId();
                    String variantIdForMessage = ya.a.INSTANCE.variantIdForMessage(aVar, this._languageContext);
                    bVar.L$0 = this;
                    bVar.L$1 = aVar;
                    bVar.label = 1;
                    obj = bVar2.getIAMData(appId, messageId, variantIdForMessage, bVar);
                    if (obj != aVar4) {
                        cVar = this;
                    }
                    return aVar4;
                }
                if (i3 != 1) {
                    if (i3 == 2) {
                        cf.c.M(obj);
                        return Boolean.TRUE;
                    }
                    i0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aVar = (com.onesignal.inAppMessages.internal.a) bVar.L$1;
                cVar = (c) bVar.L$0;
                cf.c.M(obj);
                aVar3 = (xa.a) obj;
                if (aVar3.getContent() != null) {
                    if (aVar3.getShouldRetry()) {
                        return null;
                    }
                    return Boolean.FALSE;
                }
                com.onesignal.inAppMessages.internal.d content = aVar3.getContent();
                content.getClass();
                Double displayDuration = content.getDisplayDuration();
                displayDuration.getClass();
                aVar.setDisplayDuration(displayDuration.doubleValue());
                cVar._influenceManager.onInAppMessageDisplayed(aVar.getMessageId());
                com.onesignal.inAppMessages.internal.d content2 = aVar3.getContent();
                content2.getClass();
                bVar.L$0 = null;
                bVar.L$1 = null;
                bVar.label = 2;
            }
        }
        bVar = new b(aVar2);
        Object obj2 = bVar.result;
        md.a aVar42 = md.a.f6622d;
        i3 = bVar.label;
        if (i3 != 0) {
        }
        aVar3 = (xa.a) obj2;
        if (aVar3.getContent() != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0085, code lost:
    
        if (r2.showMessageContent(r8, r9, r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // za.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object displayPreviewMessage(String str, ld.a aVar) {
        C0027c c0027c;
        int i3;
        com.onesignal.inAppMessages.internal.a aVar2;
        c cVar;
        com.onesignal.inAppMessages.internal.d dVar;
        if (aVar instanceof C0027c) {
            c0027c = (C0027c) aVar;
            int i10 = c0027c.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0027c.label = i10 - Integer.MIN_VALUE;
                Object obj = c0027c.result;
                md.a aVar3 = md.a.f6622d;
                i3 = c0027c.label;
                boolean z10 = true;
                if (i3 != 0) {
                    cf.c.M(obj);
                    com.onesignal.inAppMessages.internal.a aVar4 = new com.onesignal.inAppMessages.internal.a(true, this._time);
                    xa.b bVar = this._backend;
                    String appId = ((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getAppId();
                    c0027c.L$0 = this;
                    c0027c.L$1 = aVar4;
                    c0027c.label = 1;
                    Object iAMPreviewData = bVar.getIAMPreviewData(appId, str, c0027c);
                    if (iAMPreviewData != aVar3) {
                        obj = iAMPreviewData;
                        aVar2 = aVar4;
                        cVar = this;
                    }
                    return aVar3;
                }
                if (i3 != 1) {
                    if (i3 == 2) {
                        cf.c.M(obj);
                        return Boolean.valueOf(z10);
                    }
                    i0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aVar2 = (com.onesignal.inAppMessages.internal.a) c0027c.L$1;
                cVar = (c) c0027c.L$0;
                cf.c.M(obj);
                dVar = (com.onesignal.inAppMessages.internal.d) obj;
                if (dVar != null) {
                    z10 = false;
                } else {
                    Double displayDuration = dVar.getDisplayDuration();
                    displayDuration.getClass();
                    aVar2.setDisplayDuration(displayDuration.doubleValue());
                    c0027c.L$0 = null;
                    c0027c.L$1 = null;
                    c0027c.label = 2;
                }
                return Boolean.valueOf(z10);
            }
        }
        c0027c = new C0027c(aVar);
        Object obj2 = c0027c.result;
        md.a aVar32 = md.a.f6622d;
        i3 = c0027c.label;
        boolean z102 = true;
        if (i3 != 0) {
        }
        dVar = (com.onesignal.inAppMessages.internal.d) obj2;
        if (dVar != null) {
        }
        return Boolean.valueOf(z102);
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
