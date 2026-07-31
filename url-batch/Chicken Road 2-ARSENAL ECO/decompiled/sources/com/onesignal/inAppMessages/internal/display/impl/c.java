package com.onesignal.inAppMessages.internal.display.impl;

import H5.AbstractC0165z;
import H5.F;
import H5.InterfaceC0163x;
import android.app.Activity;
import android.util.Base64;
import b2.InterfaceC0265a;
import g2.InterfaceC0391a;
import h3.InterfaceC0405a;
import java.nio.charset.Charset;
import k5.v;
import m2.C0522a;
import m2.InterfaceC0523b;
import n2.C0542a;
import o2.InterfaceC0558a;
import o5.InterfaceC0564d;
import p5.EnumC0580a;
import q2.InterfaceC0598b;
import q5.AbstractC0607c;
import t2.InterfaceC0661a;
import u0.AbstractC0676f;
import x5.InterfaceC0747p;

/* loaded from: classes.dex */
public final class c implements InterfaceC0558a {
    public static final a Companion = new a(null);
    private static final int IN_APP_MESSAGE_INIT_DELAY = 200;
    private final T1.f _applicationService;
    private final InterfaceC0523b _backend;
    private final com.onesignal.core.internal.config.c _configModelStore;
    private final InterfaceC0405a _influenceManager;
    private final InterfaceC0265a _languageContext;
    private final InterfaceC0598b _lifecycle;
    private final InterfaceC0661a _promptFactory;
    private final InterfaceC0391a _time;
    private n lastInstance;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends AbstractC0607c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public b(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.displayMessage(null, this);
        }
    }

    /* renamed from: com.onesignal.inAppMessages.internal.display.impl.c$c, reason: collision with other inner class name */
    public static final class C0034c extends AbstractC0607c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C0034c(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.displayPreviewMessage(null, this);
        }
    }

    public static final class d extends AbstractC0607c {
        int label;
        /* synthetic */ Object result;

        public d(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.initInAppMessage(null, null, null, this);
        }
    }

    public static final class e extends q5.g implements InterfaceC0747p {
        final /* synthetic */ String $base64Str;
        final /* synthetic */ com.onesignal.inAppMessages.internal.d $content;
        final /* synthetic */ Activity $currentActivity;
        final /* synthetic */ n $webViewManager;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(n nVar, Activity activity, String str, com.onesignal.inAppMessages.internal.d dVar, InterfaceC0564d interfaceC0564d) {
            super(2, interfaceC0564d);
            this.$webViewManager = nVar;
            this.$currentActivity = activity;
            this.$base64Str = str;
            this.$content = dVar;
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(Object obj, InterfaceC0564d interfaceC0564d) {
            return new e(this.$webViewManager, this.$currentActivity, this.$base64Str, this.$content, interfaceC0564d);
        }

        @Override // x5.InterfaceC0747p
        public final Object invoke(InterfaceC0163x interfaceC0163x, InterfaceC0564d interfaceC0564d) {
            return ((e) create(interfaceC0163x, interfaceC0564d)).invokeSuspend(v.f5219a);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            int i7 = this.label;
            try {
                if (i7 == 0) {
                    AbstractC0676f.w(obj);
                    n nVar = this.$webViewManager;
                    Activity activity = this.$currentActivity;
                    String base64Str = this.$base64Str;
                    kotlin.jvm.internal.i.d(base64Str, "$base64Str");
                    boolean isFullBleed = this.$content.isFullBleed();
                    this.label = 1;
                    if (nVar.setupWebView(activity, base64Str, isFullBleed, this) == enumC0580a) {
                        return enumC0580a;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0676f.w(obj);
                }
            } catch (Exception e4) {
                if (e4.getMessage() != null) {
                    String message = e4.getMessage();
                    kotlin.jvm.internal.i.b(message);
                    if (F5.j.L(message, "No WebView installed", false)) {
                        com.onesignal.debug.internal.logging.b.info("Error setting up WebView: ", e4);
                    }
                }
                throw e4;
            }
            return v.f5219a;
        }
    }

    public static final class f extends AbstractC0607c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public f(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.showMessageContent(null, null, this);
        }
    }

    public c(T1.f _applicationService, InterfaceC0598b _lifecycle, InterfaceC0661a _promptFactory, InterfaceC0523b _backend, InterfaceC0405a _influenceManager, com.onesignal.core.internal.config.c _configModelStore, InterfaceC0265a _languageContext, InterfaceC0391a _time) {
        kotlin.jvm.internal.i.e(_applicationService, "_applicationService");
        kotlin.jvm.internal.i.e(_lifecycle, "_lifecycle");
        kotlin.jvm.internal.i.e(_promptFactory, "_promptFactory");
        kotlin.jvm.internal.i.e(_backend, "_backend");
        kotlin.jvm.internal.i.e(_influenceManager, "_influenceManager");
        kotlin.jvm.internal.i.e(_configModelStore, "_configModelStore");
        kotlin.jvm.internal.i.e(_languageContext, "_languageContext");
        kotlin.jvm.internal.i.e(_time, "_time");
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
    public final Object initInAppMessage(Activity activity, com.onesignal.inAppMessages.internal.a aVar, com.onesignal.inAppMessages.internal.d dVar, InterfaceC0564d interfaceC0564d) {
        d dVar2;
        int i7;
        Activity activity2;
        com.onesignal.inAppMessages.internal.d dVar3;
        if (interfaceC0564d instanceof d) {
            dVar2 = (d) interfaceC0564d;
            int i8 = dVar2.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                dVar2.label = i8 - Integer.MIN_VALUE;
                Object obj = dVar2.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = dVar2.label;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    String contentHtml = dVar.getContentHtml();
                    kotlin.jvm.internal.i.b(contentHtml);
                    Charset forName = Charset.forName("UTF-8");
                    kotlin.jvm.internal.i.d(forName, "forName(...)");
                    byte[] bytes = contentHtml.getBytes(forName);
                    kotlin.jvm.internal.i.d(bytes, "getBytes(...)");
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
                    O5.d dVar4 = F.f1027a;
                    I5.e eVar = M5.o.f1618a;
                    e eVar2 = new e(nVar, activity2, encodeToString, dVar3, null);
                    dVar2.label = 1;
                    if (AbstractC0165z.t(eVar, eVar2, dVar2) == enumC0580a) {
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
        }
        dVar2 = new d(interfaceC0564d);
        Object obj2 = dVar2.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = dVar2.label;
        if (i7 != 0) {
        }
        return v.f5219a;
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
    public final Object showMessageContent(com.onesignal.inAppMessages.internal.a aVar, com.onesignal.inAppMessages.internal.d dVar, InterfaceC0564d interfaceC0564d) {
        f fVar;
        int i7;
        c cVar;
        c cVar2;
        com.onesignal.inAppMessages.internal.a aVar2;
        Activity activity;
        if (interfaceC0564d instanceof f) {
            fVar = (f) interfaceC0564d;
            int i8 = fVar.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                fVar.label = i8 - Integer.MIN_VALUE;
                Object obj = fVar.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = fVar.label;
                v vVar = v.f5219a;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    Activity current = this._applicationService.getCurrent();
                    com.onesignal.debug.internal.logging.b.debug$default("InAppDisplayer.showMessageContent: in app message on currentActivity: " + current, null, 2, null);
                    if (current == null) {
                        fVar.L$0 = this;
                        fVar.L$1 = aVar;
                        fVar.L$2 = dVar;
                        fVar.label = 4;
                        if (AbstractC0165z.d(200L, fVar) != enumC0580a) {
                            cVar = this;
                            fVar.L$0 = null;
                            fVar.L$1 = null;
                            fVar.L$2 = null;
                            fVar.label = 5;
                            if (cVar.showMessageContent(aVar, dVar, fVar) != enumC0580a) {
                            }
                        }
                    } else if (this.lastInstance == null || !aVar.isPreview()) {
                        fVar.label = 3;
                        if (initInAppMessage(current, aVar, dVar, fVar) == enumC0580a) {
                        }
                    } else {
                        n nVar = this.lastInstance;
                        kotlin.jvm.internal.i.b(nVar);
                        fVar.L$0 = this;
                        fVar.L$1 = aVar;
                        fVar.L$2 = dVar;
                        fVar.L$3 = current;
                        fVar.label = 1;
                        if (nVar.dismissAndAwaitNextMessage(fVar) != enumC0580a) {
                            cVar2 = this;
                            aVar2 = aVar;
                            activity = current;
                            cVar2.lastInstance = null;
                            fVar.L$0 = null;
                            fVar.L$1 = null;
                            fVar.L$2 = null;
                            fVar.L$3 = null;
                            fVar.label = 2;
                            if (cVar2.initInAppMessage(activity, aVar2, dVar, fVar) == enumC0580a) {
                            }
                        }
                    }
                }
                if (i7 != 1) {
                    if (i7 == 2 || i7 == 3) {
                        AbstractC0676f.w(obj);
                        return vVar;
                    }
                    if (i7 != 4) {
                        if (i7 == 5) {
                            AbstractC0676f.w(obj);
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    dVar = (com.onesignal.inAppMessages.internal.d) fVar.L$2;
                    aVar = (com.onesignal.inAppMessages.internal.a) fVar.L$1;
                    cVar = (c) fVar.L$0;
                    AbstractC0676f.w(obj);
                    fVar.L$0 = null;
                    fVar.L$1 = null;
                    fVar.L$2 = null;
                    fVar.label = 5;
                    return cVar.showMessageContent(aVar, dVar, fVar) != enumC0580a ? enumC0580a : vVar;
                }
                activity = (Activity) fVar.L$3;
                dVar = (com.onesignal.inAppMessages.internal.d) fVar.L$2;
                aVar2 = (com.onesignal.inAppMessages.internal.a) fVar.L$1;
                cVar2 = (c) fVar.L$0;
                AbstractC0676f.w(obj);
                cVar2.lastInstance = null;
                fVar.L$0 = null;
                fVar.L$1 = null;
                fVar.L$2 = null;
                fVar.L$3 = null;
                fVar.label = 2;
                if (cVar2.initInAppMessage(activity, aVar2, dVar, fVar) == enumC0580a) {
                    return vVar;
                }
            }
        }
        fVar = new f(interfaceC0564d);
        Object obj2 = fVar.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = fVar.label;
        v vVar2 = v.f5219a;
        if (i7 != 0) {
        }
    }

    @Override // o2.InterfaceC0558a
    public void dismissCurrentInAppMessage() {
        com.onesignal.debug.internal.logging.b.debug$default("WebViewManager IAM dismissAndAwaitNextMessage lastInstance: " + this.lastInstance, null, 2, null);
        n nVar = this.lastInstance;
        if (nVar != null) {
            kotlin.jvm.internal.i.b(nVar);
            nVar.backgroundDismissAndAwaitNextMessage();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a2, code lost:
    
        if (r2.showMessageContent(r9, r10, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // o2.InterfaceC0558a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object displayMessage(com.onesignal.inAppMessages.internal.a aVar, InterfaceC0564d interfaceC0564d) {
        b bVar;
        int i7;
        c cVar;
        C0522a c0522a;
        if (interfaceC0564d instanceof b) {
            bVar = (b) interfaceC0564d;
            int i8 = bVar.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                bVar.label = i8 - Integer.MIN_VALUE;
                Object obj = bVar.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = bVar.label;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    InterfaceC0523b interfaceC0523b = this._backend;
                    String appId = ((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getAppId();
                    String messageId = aVar.getMessageId();
                    String variantIdForMessage = C0542a.INSTANCE.variantIdForMessage(aVar, this._languageContext);
                    bVar.L$0 = this;
                    bVar.L$1 = aVar;
                    bVar.label = 1;
                    obj = interfaceC0523b.getIAMData(appId, messageId, variantIdForMessage, bVar);
                    if (obj != enumC0580a) {
                        cVar = this;
                    }
                    return enumC0580a;
                }
                if (i7 != 1) {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0676f.w(obj);
                    return Boolean.TRUE;
                }
                aVar = (com.onesignal.inAppMessages.internal.a) bVar.L$1;
                cVar = (c) bVar.L$0;
                AbstractC0676f.w(obj);
                c0522a = (C0522a) obj;
                if (c0522a.getContent() != null) {
                    if (c0522a.getShouldRetry()) {
                        return null;
                    }
                    return Boolean.FALSE;
                }
                com.onesignal.inAppMessages.internal.d content = c0522a.getContent();
                kotlin.jvm.internal.i.b(content);
                Double displayDuration = content.getDisplayDuration();
                kotlin.jvm.internal.i.b(displayDuration);
                aVar.setDisplayDuration(displayDuration.doubleValue());
                cVar._influenceManager.onInAppMessageDisplayed(aVar.getMessageId());
                com.onesignal.inAppMessages.internal.d content2 = c0522a.getContent();
                kotlin.jvm.internal.i.b(content2);
                bVar.L$0 = null;
                bVar.L$1 = null;
                bVar.label = 2;
            }
        }
        bVar = new b(interfaceC0564d);
        Object obj2 = bVar.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = bVar.label;
        if (i7 != 0) {
        }
        c0522a = (C0522a) obj2;
        if (c0522a.getContent() != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0086, code lost:
    
        if (r2.showMessageContent(r8, r9, r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // o2.InterfaceC0558a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object displayPreviewMessage(String str, InterfaceC0564d interfaceC0564d) {
        C0034c c0034c;
        int i7;
        com.onesignal.inAppMessages.internal.a aVar;
        c cVar;
        com.onesignal.inAppMessages.internal.d dVar;
        if (interfaceC0564d instanceof C0034c) {
            c0034c = (C0034c) interfaceC0564d;
            int i8 = c0034c.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c0034c.label = i8 - Integer.MIN_VALUE;
                Object obj = c0034c.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = c0034c.label;
                boolean z5 = true;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    com.onesignal.inAppMessages.internal.a aVar2 = new com.onesignal.inAppMessages.internal.a(true, this._time);
                    InterfaceC0523b interfaceC0523b = this._backend;
                    String appId = ((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getAppId();
                    c0034c.L$0 = this;
                    c0034c.L$1 = aVar2;
                    c0034c.label = 1;
                    Object iAMPreviewData = interfaceC0523b.getIAMPreviewData(appId, str, c0034c);
                    if (iAMPreviewData != enumC0580a) {
                        obj = iAMPreviewData;
                        aVar = aVar2;
                        cVar = this;
                    }
                    return enumC0580a;
                }
                if (i7 != 1) {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0676f.w(obj);
                    return Boolean.valueOf(z5);
                }
                aVar = (com.onesignal.inAppMessages.internal.a) c0034c.L$1;
                cVar = (c) c0034c.L$0;
                AbstractC0676f.w(obj);
                dVar = (com.onesignal.inAppMessages.internal.d) obj;
                if (dVar != null) {
                    z5 = false;
                } else {
                    Double displayDuration = dVar.getDisplayDuration();
                    kotlin.jvm.internal.i.b(displayDuration);
                    aVar.setDisplayDuration(displayDuration.doubleValue());
                    c0034c.L$0 = null;
                    c0034c.L$1 = null;
                    c0034c.label = 2;
                }
                return Boolean.valueOf(z5);
            }
        }
        c0034c = new C0034c(interfaceC0564d);
        Object obj2 = c0034c.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = c0034c.label;
        boolean z52 = true;
        if (i7 != 0) {
        }
        dVar = (com.onesignal.inAppMessages.internal.d) obj2;
        if (dVar != null) {
        }
        return Boolean.valueOf(z52);
    }
}
