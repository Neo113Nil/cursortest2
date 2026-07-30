package com.onesignal.inAppMessages.internal.display.impl;

import E7.p;
import O7.AbstractC0399y;
import O7.F;
import O7.InterfaceC0397w;
import T7.o;
import android.app.Activity;
import android.util.Base64;
import java.nio.charset.Charset;
import q7.v;
import v7.InterfaceC5133d;
import w7.EnumC5179a;
import x7.AbstractC5219c;

/* loaded from: classes2.dex */
public final class c implements N4.a {
    public static final a Companion = new a(null);
    private static final int IN_APP_MESSAGE_INIT_DELAY = 200;
    private final t4.f _applicationService;
    private final L4.b _backend;
    private final com.onesignal.core.internal.config.c _configModelStore;
    private final G5.a _influenceManager;
    private final B4.a _languageContext;
    private final P4.b _lifecycle;
    private final S4.a _promptFactory;
    private final G4.a _time;
    private m lastInstance;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends AbstractC5219c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public b(InterfaceC5133d interfaceC5133d) {
            super(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.displayMessage(null, this);
        }
    }

    /* renamed from: com.onesignal.inAppMessages.internal.display.impl.c$c, reason: collision with other inner class name */
    public static final class C0203c extends AbstractC5219c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C0203c(InterfaceC5133d interfaceC5133d) {
            super(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.displayPreviewMessage(null, this);
        }
    }

    public static final class d extends AbstractC5219c {
        int label;
        /* synthetic */ Object result;

        public d(InterfaceC5133d interfaceC5133d) {
            super(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.initInAppMessage(null, null, null, this);
        }
    }

    public static final class e extends x7.h implements p {
        final /* synthetic */ String $base64Str;
        final /* synthetic */ com.onesignal.inAppMessages.internal.d $content;
        final /* synthetic */ Activity $currentActivity;
        final /* synthetic */ m $webViewManager;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(m mVar, Activity activity, String str, com.onesignal.inAppMessages.internal.d dVar, InterfaceC5133d interfaceC5133d) {
            super(2, interfaceC5133d);
            this.$webViewManager = mVar;
            this.$currentActivity = activity;
            this.$base64Str = str;
            this.$content = dVar;
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
            return new e(this.$webViewManager, this.$currentActivity, this.$base64Str, this.$content, interfaceC5133d);
        }

        @Override // E7.p
        public final Object invoke(InterfaceC0397w interfaceC0397w, InterfaceC5133d interfaceC5133d) {
            return ((e) create(interfaceC0397w, interfaceC5133d)).invokeSuspend(v.f40183a);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            int i = this.label;
            try {
                if (i == 0) {
                    com.bumptech.glide.f.r(obj);
                    m mVar = this.$webViewManager;
                    Activity activity = this.$currentActivity;
                    String base64Str = this.$base64Str;
                    kotlin.jvm.internal.h.d(base64Str, "$base64Str");
                    boolean isFullBleed = this.$content.isFullBleed();
                    this.label = 1;
                    if (mVar.setupWebView(activity, base64Str, isFullBleed, this) == enumC5179a) {
                        return enumC5179a;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.f.r(obj);
                }
            } catch (Exception e6) {
                if (e6.getMessage() != null) {
                    String message = e6.getMessage();
                    kotlin.jvm.internal.h.b(message);
                    if (M7.j.L(message, "No WebView installed", false)) {
                        com.onesignal.debug.internal.logging.b.info("Error setting up WebView: ", e6);
                    }
                }
                throw e6;
            }
            return v.f40183a;
        }
    }

    public static final class f extends AbstractC5219c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public f(InterfaceC5133d interfaceC5133d) {
            super(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.showMessageContent(null, null, this);
        }
    }

    public c(t4.f _applicationService, P4.b _lifecycle, S4.a _promptFactory, L4.b _backend, G5.a _influenceManager, com.onesignal.core.internal.config.c _configModelStore, B4.a _languageContext, G4.a _time) {
        kotlin.jvm.internal.h.e(_applicationService, "_applicationService");
        kotlin.jvm.internal.h.e(_lifecycle, "_lifecycle");
        kotlin.jvm.internal.h.e(_promptFactory, "_promptFactory");
        kotlin.jvm.internal.h.e(_backend, "_backend");
        kotlin.jvm.internal.h.e(_influenceManager, "_influenceManager");
        kotlin.jvm.internal.h.e(_configModelStore, "_configModelStore");
        kotlin.jvm.internal.h.e(_languageContext, "_languageContext");
        kotlin.jvm.internal.h.e(_time, "_time");
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
    public final Object initInAppMessage(Activity activity, com.onesignal.inAppMessages.internal.a aVar, com.onesignal.inAppMessages.internal.d dVar, InterfaceC5133d interfaceC5133d) {
        d dVar2;
        int i;
        Activity activity2;
        com.onesignal.inAppMessages.internal.d dVar3;
        if (interfaceC5133d instanceof d) {
            dVar2 = (d) interfaceC5133d;
            int i4 = dVar2.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                dVar2.label = i4 - Integer.MIN_VALUE;
                Object obj = dVar2.result;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                i = dVar2.label;
                if (i != 0) {
                    com.bumptech.glide.f.r(obj);
                    String contentHtml = dVar.getContentHtml();
                    kotlin.jvm.internal.h.b(contentHtml);
                    Charset forName = Charset.forName("UTF-8");
                    kotlin.jvm.internal.h.d(forName, "forName(...)");
                    byte[] bytes = contentHtml.getBytes(forName);
                    kotlin.jvm.internal.h.d(bytes, "getBytes(...)");
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
                    V7.e eVar = F.f2551a;
                    P7.e eVar2 = o.f3162a;
                    e eVar3 = new e(mVar, activity2, encodeToString, dVar3, null);
                    dVar2.label = 1;
                    if (AbstractC0399y.y(eVar2, eVar3, dVar2) == enumC5179a) {
                        return enumC5179a;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.f.r(obj);
                }
                return v.f40183a;
            }
        }
        dVar2 = new d(interfaceC5133d);
        Object obj2 = dVar2.result;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i = dVar2.label;
        if (i != 0) {
        }
        return v.f40183a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00e7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object showMessageContent(com.onesignal.inAppMessages.internal.a aVar, com.onesignal.inAppMessages.internal.d dVar, InterfaceC5133d interfaceC5133d) {
        f fVar;
        int i;
        c cVar;
        c cVar2;
        com.onesignal.inAppMessages.internal.a aVar2;
        Activity activity;
        if (interfaceC5133d instanceof f) {
            fVar = (f) interfaceC5133d;
            int i4 = fVar.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                fVar.label = i4 - Integer.MIN_VALUE;
                Object obj = fVar.result;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                i = fVar.label;
                v vVar = v.f40183a;
                if (i != 0) {
                    com.bumptech.glide.f.r(obj);
                    Activity current = this._applicationService.getCurrent();
                    com.onesignal.debug.internal.logging.b.debug$default("InAppDisplayer.showMessageContent: in app message on currentActivity: " + current, null, 2, null);
                    if (current == null) {
                        fVar.L$0 = this;
                        fVar.L$1 = aVar;
                        fVar.L$2 = dVar;
                        fVar.label = 4;
                        if (AbstractC0399y.f(200L, fVar) != enumC5179a) {
                            cVar = this;
                            fVar.L$0 = null;
                            fVar.L$1 = null;
                            fVar.L$2 = null;
                            fVar.label = 5;
                            if (cVar.showMessageContent(aVar, dVar, fVar) != enumC5179a) {
                            }
                        }
                    } else if (this.lastInstance == null || !aVar.isPreview()) {
                        fVar.label = 3;
                        if (initInAppMessage(current, aVar, dVar, fVar) == enumC5179a) {
                        }
                    } else {
                        m mVar = this.lastInstance;
                        kotlin.jvm.internal.h.b(mVar);
                        fVar.L$0 = this;
                        fVar.L$1 = aVar;
                        fVar.L$2 = dVar;
                        fVar.L$3 = current;
                        fVar.label = 1;
                        if (mVar.dismissAndAwaitNextMessage(fVar) != enumC5179a) {
                            cVar2 = this;
                            aVar2 = aVar;
                            activity = current;
                            cVar2.lastInstance = null;
                            fVar.L$0 = null;
                            fVar.L$1 = null;
                            fVar.L$2 = null;
                            fVar.L$3 = null;
                            fVar.label = 2;
                            if (cVar2.initInAppMessage(activity, aVar2, dVar, fVar) == enumC5179a) {
                            }
                        }
                    }
                }
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        com.bumptech.glide.f.r(obj);
                        return vVar;
                    }
                    if (i != 4) {
                        if (i == 5) {
                            com.bumptech.glide.f.r(obj);
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    dVar = (com.onesignal.inAppMessages.internal.d) fVar.L$2;
                    aVar = (com.onesignal.inAppMessages.internal.a) fVar.L$1;
                    cVar = (c) fVar.L$0;
                    com.bumptech.glide.f.r(obj);
                    fVar.L$0 = null;
                    fVar.L$1 = null;
                    fVar.L$2 = null;
                    fVar.label = 5;
                    return cVar.showMessageContent(aVar, dVar, fVar) != enumC5179a ? enumC5179a : vVar;
                }
                activity = (Activity) fVar.L$3;
                dVar = (com.onesignal.inAppMessages.internal.d) fVar.L$2;
                aVar2 = (com.onesignal.inAppMessages.internal.a) fVar.L$1;
                cVar2 = (c) fVar.L$0;
                com.bumptech.glide.f.r(obj);
                cVar2.lastInstance = null;
                fVar.L$0 = null;
                fVar.L$1 = null;
                fVar.L$2 = null;
                fVar.L$3 = null;
                fVar.label = 2;
                if (cVar2.initInAppMessage(activity, aVar2, dVar, fVar) == enumC5179a) {
                    return vVar;
                }
            }
        }
        fVar = new f(interfaceC5133d);
        Object obj2 = fVar.result;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i = fVar.label;
        v vVar2 = v.f40183a;
        if (i != 0) {
        }
    }

    @Override // N4.a
    public void dismissCurrentInAppMessage() {
        com.onesignal.debug.internal.logging.b.debug$default("WebViewManager IAM dismissAndAwaitNextMessage lastInstance: " + this.lastInstance, null, 2, null);
        m mVar = this.lastInstance;
        if (mVar != null) {
            kotlin.jvm.internal.h.b(mVar);
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
    @Override // N4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object displayMessage(com.onesignal.inAppMessages.internal.a aVar, InterfaceC5133d interfaceC5133d) {
        b bVar;
        int i;
        c cVar;
        L4.a aVar2;
        if (interfaceC5133d instanceof b) {
            bVar = (b) interfaceC5133d;
            int i4 = bVar.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                bVar.label = i4 - Integer.MIN_VALUE;
                Object obj = bVar.result;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                i = bVar.label;
                if (i != 0) {
                    com.bumptech.glide.f.r(obj);
                    L4.b bVar2 = this._backend;
                    String appId = ((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getAppId();
                    String messageId = aVar.getMessageId();
                    String variantIdForMessage = M4.a.INSTANCE.variantIdForMessage(aVar, this._languageContext);
                    bVar.L$0 = this;
                    bVar.L$1 = aVar;
                    bVar.label = 1;
                    obj = bVar2.getIAMData(appId, messageId, variantIdForMessage, bVar);
                    if (obj != enumC5179a) {
                        cVar = this;
                    }
                    return enumC5179a;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.f.r(obj);
                    return Boolean.TRUE;
                }
                aVar = (com.onesignal.inAppMessages.internal.a) bVar.L$1;
                cVar = (c) bVar.L$0;
                com.bumptech.glide.f.r(obj);
                aVar2 = (L4.a) obj;
                if (aVar2.getContent() != null) {
                    if (aVar2.getShouldRetry()) {
                        return null;
                    }
                    return Boolean.FALSE;
                }
                com.onesignal.inAppMessages.internal.d content = aVar2.getContent();
                kotlin.jvm.internal.h.b(content);
                Double displayDuration = content.getDisplayDuration();
                kotlin.jvm.internal.h.b(displayDuration);
                aVar.setDisplayDuration(displayDuration.doubleValue());
                cVar._influenceManager.onInAppMessageDisplayed(aVar.getMessageId());
                com.onesignal.inAppMessages.internal.d content2 = aVar2.getContent();
                kotlin.jvm.internal.h.b(content2);
                bVar.L$0 = null;
                bVar.L$1 = null;
                bVar.label = 2;
            }
        }
        bVar = new b(interfaceC5133d);
        Object obj2 = bVar.result;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i = bVar.label;
        if (i != 0) {
        }
        aVar2 = (L4.a) obj2;
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
    @Override // N4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object displayPreviewMessage(String str, InterfaceC5133d interfaceC5133d) {
        C0203c c0203c;
        int i;
        com.onesignal.inAppMessages.internal.a aVar;
        c cVar;
        com.onesignal.inAppMessages.internal.d dVar;
        if (interfaceC5133d instanceof C0203c) {
            c0203c = (C0203c) interfaceC5133d;
            int i4 = c0203c.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c0203c.label = i4 - Integer.MIN_VALUE;
                Object obj = c0203c.result;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                i = c0203c.label;
                boolean z8 = true;
                if (i != 0) {
                    com.bumptech.glide.f.r(obj);
                    com.onesignal.inAppMessages.internal.a aVar2 = new com.onesignal.inAppMessages.internal.a(true, this._time);
                    L4.b bVar = this._backend;
                    String appId = ((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getAppId();
                    c0203c.L$0 = this;
                    c0203c.L$1 = aVar2;
                    c0203c.label = 1;
                    Object iAMPreviewData = bVar.getIAMPreviewData(appId, str, c0203c);
                    if (iAMPreviewData != enumC5179a) {
                        obj = iAMPreviewData;
                        aVar = aVar2;
                        cVar = this;
                    }
                    return enumC5179a;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.f.r(obj);
                    return Boolean.valueOf(z8);
                }
                aVar = (com.onesignal.inAppMessages.internal.a) c0203c.L$1;
                cVar = (c) c0203c.L$0;
                com.bumptech.glide.f.r(obj);
                dVar = (com.onesignal.inAppMessages.internal.d) obj;
                if (dVar != null) {
                    z8 = false;
                } else {
                    Double displayDuration = dVar.getDisplayDuration();
                    kotlin.jvm.internal.h.b(displayDuration);
                    aVar.setDisplayDuration(displayDuration.doubleValue());
                    c0203c.L$0 = null;
                    c0203c.L$1 = null;
                    c0203c.label = 2;
                }
                return Boolean.valueOf(z8);
            }
        }
        c0203c = new C0203c(interfaceC5133d);
        Object obj2 = c0203c.result;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i = c0203c.label;
        boolean z82 = true;
        if (i != 0) {
        }
        dVar = (com.onesignal.inAppMessages.internal.d) obj2;
        if (dVar != null) {
        }
        return Boolean.valueOf(z82);
    }
}
