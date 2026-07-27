package com.onesignal.inAppMessages.internal.display.impl;

import D4.AbstractC0024y;
import D4.E;
import I4.o;
import K4.d;
import android.app.Activity;
import android.util.Base64;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.core.internal.config.ConfigModelStore;
import com.onesignal.core.internal.language.ILanguageContext;
import com.onesignal.core.internal.time.ITime;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.inAppMessages.internal.InAppMessage;
import com.onesignal.inAppMessages.internal.InAppMessageContent;
import com.onesignal.inAppMessages.internal.backend.GetIAMDataResponse;
import com.onesignal.inAppMessages.internal.backend.IInAppBackendService;
import com.onesignal.inAppMessages.internal.common.InAppHelper;
import com.onesignal.inAppMessages.internal.display.IInAppDisplayer;
import com.onesignal.inAppMessages.internal.lifecycle.IInAppLifecycleService;
import com.onesignal.inAppMessages.internal.prompt.IInAppMessagePromptFactory;
import com.onesignal.session.internal.influence.IInfluenceManager;
import e5.g;
import f4.v;
import java.nio.charset.Charset;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import l4.EnumC1260a;

/* loaded from: classes.dex */
public final class InAppDisplayer implements IInAppDisplayer {
    public static final Companion Companion = new Companion(null);
    private static final int IN_APP_MESSAGE_INIT_DELAY = 200;
    private final IApplicationService _applicationService;
    private final IInAppBackendService _backend;
    private final ConfigModelStore _configModelStore;
    private final IInfluenceManager _influenceManager;
    private final ILanguageContext _languageContext;
    private final IInAppLifecycleService _lifecycle;
    private final IInAppMessagePromptFactory _promptFactory;
    private final ITime _time;
    private WebViewManager lastInstance;

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        private Companion() {
        }
    }

    public InAppDisplayer(IApplicationService _applicationService, IInAppLifecycleService _lifecycle, IInAppMessagePromptFactory _promptFactory, IInAppBackendService _backend, IInfluenceManager _influenceManager, ConfigModelStore _configModelStore, ILanguageContext _languageContext, ITime _time) {
        i.e(_applicationService, "_applicationService");
        i.e(_lifecycle, "_lifecycle");
        i.e(_promptFactory, "_promptFactory");
        i.e(_backend, "_backend");
        i.e(_influenceManager, "_influenceManager");
        i.e(_configModelStore, "_configModelStore");
        i.e(_languageContext, "_languageContext");
        i.e(_time, "_time");
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
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009a, code lost:
    
        com.onesignal.debug.internal.logging.Logging.error("Catch on initInAppMessage: ", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object initInAppMessage(Activity activity, InAppMessage inAppMessage, InAppMessageContent inAppMessageContent, InterfaceC1218d interfaceC1218d) {
        InAppDisplayer$initInAppMessage$1 inAppDisplayer$initInAppMessage$1;
        int i2;
        if (interfaceC1218d instanceof InAppDisplayer$initInAppMessage$1) {
            inAppDisplayer$initInAppMessage$1 = (InAppDisplayer$initInAppMessage$1) interfaceC1218d;
            int i3 = inAppDisplayer$initInAppMessage$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                inAppDisplayer$initInAppMessage$1.label = i3 - Integer.MIN_VALUE;
                Object obj = inAppDisplayer$initInAppMessage$1.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = inAppDisplayer$initInAppMessage$1.label;
                if (i2 != 0) {
                    g.y(obj);
                    String contentHtml = inAppMessageContent.getContentHtml();
                    i.b(contentHtml);
                    Charset forName = Charset.forName("UTF-8");
                    i.d(forName, "forName(...)");
                    byte[] bytes = contentHtml.getBytes(forName);
                    i.d(bytes, "getBytes(...)");
                    String encodeToString = Base64.encodeToString(bytes, 2);
                    WebViewManager webViewManager = new WebViewManager(inAppMessage, activity, inAppMessageContent, this._lifecycle, this._applicationService, this._promptFactory);
                    this.lastInstance = webViewManager;
                    if (inAppMessageContent.isFullBleed()) {
                        webViewManager.setContentSafeAreaInsets(inAppMessageContent, activity);
                    }
                    d dVar = E.f459a;
                    E4.e eVar = o.f1316a;
                    InAppDisplayer$initInAppMessage$2 inAppDisplayer$initInAppMessage$2 = new InAppDisplayer$initInAppMessage$2(webViewManager, activity, encodeToString, inAppMessageContent, null);
                    inAppDisplayer$initInAppMessage$1.label = 1;
                    if (AbstractC0024y.w(eVar, inAppDisplayer$initInAppMessage$2, inAppDisplayer$initInAppMessage$1) == enumC1260a) {
                        return enumC1260a;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    g.y(obj);
                }
                return v.f5689a;
            }
        }
        inAppDisplayer$initInAppMessage$1 = new InAppDisplayer$initInAppMessage$1(this, interfaceC1218d);
        Object obj2 = inAppDisplayer$initInAppMessage$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = inAppDisplayer$initInAppMessage$1.label;
        if (i2 != 0) {
        }
        return v.f5689a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00e7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object showMessageContent(InAppMessage inAppMessage, InAppMessageContent inAppMessageContent, InterfaceC1218d interfaceC1218d) {
        InAppDisplayer$showMessageContent$1 inAppDisplayer$showMessageContent$1;
        int i2;
        InAppDisplayer inAppDisplayer;
        InAppDisplayer inAppDisplayer2;
        InAppMessage inAppMessage2;
        Activity activity;
        if (interfaceC1218d instanceof InAppDisplayer$showMessageContent$1) {
            inAppDisplayer$showMessageContent$1 = (InAppDisplayer$showMessageContent$1) interfaceC1218d;
            int i3 = inAppDisplayer$showMessageContent$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                inAppDisplayer$showMessageContent$1.label = i3 - Integer.MIN_VALUE;
                Object obj = inAppDisplayer$showMessageContent$1.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = inAppDisplayer$showMessageContent$1.label;
                v vVar = v.f5689a;
                if (i2 == 0) {
                    if (i2 == 1) {
                        activity = (Activity) inAppDisplayer$showMessageContent$1.L$3;
                        inAppMessageContent = (InAppMessageContent) inAppDisplayer$showMessageContent$1.L$2;
                        inAppMessage2 = (InAppMessage) inAppDisplayer$showMessageContent$1.L$1;
                        inAppDisplayer2 = (InAppDisplayer) inAppDisplayer$showMessageContent$1.L$0;
                        g.y(obj);
                        inAppDisplayer2.lastInstance = null;
                        inAppDisplayer$showMessageContent$1.L$0 = null;
                        inAppDisplayer$showMessageContent$1.L$1 = null;
                        inAppDisplayer$showMessageContent$1.L$2 = null;
                        inAppDisplayer$showMessageContent$1.L$3 = null;
                        inAppDisplayer$showMessageContent$1.label = 2;
                        return inAppDisplayer2.initInAppMessage(activity, inAppMessage2, inAppMessageContent, inAppDisplayer$showMessageContent$1) != enumC1260a ? enumC1260a : vVar;
                    }
                    if (i2 == 2 || i2 == 3) {
                        g.y(obj);
                    }
                    if (i2 != 4) {
                        if (i2 == 5) {
                            g.y(obj);
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    inAppMessageContent = (InAppMessageContent) inAppDisplayer$showMessageContent$1.L$2;
                    inAppMessage = (InAppMessage) inAppDisplayer$showMessageContent$1.L$1;
                    inAppDisplayer = (InAppDisplayer) inAppDisplayer$showMessageContent$1.L$0;
                    g.y(obj);
                    inAppDisplayer$showMessageContent$1.L$0 = null;
                    inAppDisplayer$showMessageContent$1.L$1 = null;
                    inAppDisplayer$showMessageContent$1.L$2 = null;
                    inAppDisplayer$showMessageContent$1.label = 5;
                    return inAppDisplayer.showMessageContent(inAppMessage, inAppMessageContent, inAppDisplayer$showMessageContent$1) != enumC1260a ? enumC1260a : vVar;
                }
                g.y(obj);
                Activity current = this._applicationService.getCurrent();
                Logging.debug$default("InAppDisplayer.showMessageContent: in app message on currentActivity: " + current, null, 2, null);
                if (current == null) {
                    inAppDisplayer$showMessageContent$1.L$0 = this;
                    inAppDisplayer$showMessageContent$1.L$1 = inAppMessage;
                    inAppDisplayer$showMessageContent$1.L$2 = inAppMessageContent;
                    inAppDisplayer$showMessageContent$1.label = 4;
                    if (AbstractC0024y.d(200L, inAppDisplayer$showMessageContent$1) == enumC1260a) {
                        return enumC1260a;
                    }
                    inAppDisplayer = this;
                    inAppDisplayer$showMessageContent$1.L$0 = null;
                    inAppDisplayer$showMessageContent$1.L$1 = null;
                    inAppDisplayer$showMessageContent$1.L$2 = null;
                    inAppDisplayer$showMessageContent$1.label = 5;
                    if (inAppDisplayer.showMessageContent(inAppMessage, inAppMessageContent, inAppDisplayer$showMessageContent$1) != enumC1260a) {
                    }
                } else if (this.lastInstance == null || !inAppMessage.isPreview()) {
                    inAppDisplayer$showMessageContent$1.label = 3;
                    if (initInAppMessage(current, inAppMessage, inAppMessageContent, inAppDisplayer$showMessageContent$1) == enumC1260a) {
                        return enumC1260a;
                    }
                } else {
                    WebViewManager webViewManager = this.lastInstance;
                    i.b(webViewManager);
                    inAppDisplayer$showMessageContent$1.L$0 = this;
                    inAppDisplayer$showMessageContent$1.L$1 = inAppMessage;
                    inAppDisplayer$showMessageContent$1.L$2 = inAppMessageContent;
                    inAppDisplayer$showMessageContent$1.L$3 = current;
                    inAppDisplayer$showMessageContent$1.label = 1;
                    if (webViewManager.dismissAndAwaitNextMessage(inAppDisplayer$showMessageContent$1) == enumC1260a) {
                        return enumC1260a;
                    }
                    inAppDisplayer2 = this;
                    inAppMessage2 = inAppMessage;
                    activity = current;
                    inAppDisplayer2.lastInstance = null;
                    inAppDisplayer$showMessageContent$1.L$0 = null;
                    inAppDisplayer$showMessageContent$1.L$1 = null;
                    inAppDisplayer$showMessageContent$1.L$2 = null;
                    inAppDisplayer$showMessageContent$1.L$3 = null;
                    inAppDisplayer$showMessageContent$1.label = 2;
                    if (inAppDisplayer2.initInAppMessage(activity, inAppMessage2, inAppMessageContent, inAppDisplayer$showMessageContent$1) != enumC1260a) {
                    }
                }
            }
        }
        inAppDisplayer$showMessageContent$1 = new InAppDisplayer$showMessageContent$1(this, interfaceC1218d);
        Object obj2 = inAppDisplayer$showMessageContent$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = inAppDisplayer$showMessageContent$1.label;
        v vVar2 = v.f5689a;
        if (i2 == 0) {
        }
    }

    @Override // com.onesignal.inAppMessages.internal.display.IInAppDisplayer
    public void dismissCurrentInAppMessage() {
        Logging.debug$default("WebViewManager IAM dismissAndAwaitNextMessage lastInstance: " + this.lastInstance, null, 2, null);
        WebViewManager webViewManager = this.lastInstance;
        if (webViewManager != null) {
            i.b(webViewManager);
            webViewManager.backgroundDismissAndAwaitNextMessage();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.onesignal.inAppMessages.internal.display.IInAppDisplayer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object displayMessage(InAppMessage inAppMessage, InterfaceC1218d interfaceC1218d) {
        InAppDisplayer$displayMessage$1 inAppDisplayer$displayMessage$1;
        int i2;
        InAppDisplayer inAppDisplayer;
        GetIAMDataResponse getIAMDataResponse;
        if (interfaceC1218d instanceof InAppDisplayer$displayMessage$1) {
            inAppDisplayer$displayMessage$1 = (InAppDisplayer$displayMessage$1) interfaceC1218d;
            int i3 = inAppDisplayer$displayMessage$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                inAppDisplayer$displayMessage$1.label = i3 - Integer.MIN_VALUE;
                Object obj = inAppDisplayer$displayMessage$1.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = inAppDisplayer$displayMessage$1.label;
                if (i2 != 0) {
                    g.y(obj);
                    IInAppBackendService iInAppBackendService = this._backend;
                    String appId = this._configModelStore.getModel().getAppId();
                    String messageId = inAppMessage.getMessageId();
                    String variantIdForMessage = InAppHelper.INSTANCE.variantIdForMessage(inAppMessage, this._languageContext);
                    inAppDisplayer$displayMessage$1.L$0 = this;
                    inAppDisplayer$displayMessage$1.L$1 = inAppMessage;
                    inAppDisplayer$displayMessage$1.label = 1;
                    obj = iInAppBackendService.getIAMData(appId, messageId, variantIdForMessage, inAppDisplayer$displayMessage$1);
                    if (obj == enumC1260a) {
                        return enumC1260a;
                    }
                    inAppDisplayer = this;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        g.y(obj);
                        return Boolean.TRUE;
                    }
                    inAppMessage = (InAppMessage) inAppDisplayer$displayMessage$1.L$1;
                    inAppDisplayer = (InAppDisplayer) inAppDisplayer$displayMessage$1.L$0;
                    g.y(obj);
                }
                getIAMDataResponse = (GetIAMDataResponse) obj;
                if (getIAMDataResponse.getContent() != null) {
                    if (getIAMDataResponse.getShouldRetry()) {
                        return null;
                    }
                    return Boolean.FALSE;
                }
                InAppMessageContent content = getIAMDataResponse.getContent();
                i.b(content);
                Double displayDuration = content.getDisplayDuration();
                i.b(displayDuration);
                inAppMessage.setDisplayDuration(displayDuration.doubleValue());
                inAppDisplayer._influenceManager.onInAppMessageDisplayed(inAppMessage.getMessageId());
                InAppMessageContent content2 = getIAMDataResponse.getContent();
                i.b(content2);
                inAppDisplayer$displayMessage$1.L$0 = null;
                inAppDisplayer$displayMessage$1.L$1 = null;
                inAppDisplayer$displayMessage$1.label = 2;
                if (inAppDisplayer.showMessageContent(inAppMessage, content2, inAppDisplayer$displayMessage$1) == enumC1260a) {
                    return enumC1260a;
                }
                return Boolean.TRUE;
            }
        }
        inAppDisplayer$displayMessage$1 = new InAppDisplayer$displayMessage$1(this, interfaceC1218d);
        Object obj2 = inAppDisplayer$displayMessage$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = inAppDisplayer$displayMessage$1.label;
        if (i2 != 0) {
        }
        getIAMDataResponse = (GetIAMDataResponse) obj2;
        if (getIAMDataResponse.getContent() != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.onesignal.inAppMessages.internal.display.IInAppDisplayer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object displayPreviewMessage(String str, InterfaceC1218d interfaceC1218d) {
        InAppDisplayer$displayPreviewMessage$1 inAppDisplayer$displayPreviewMessage$1;
        int i2;
        InAppDisplayer inAppDisplayer;
        InAppMessage inAppMessage;
        InAppMessageContent inAppMessageContent;
        if (interfaceC1218d instanceof InAppDisplayer$displayPreviewMessage$1) {
            inAppDisplayer$displayPreviewMessage$1 = (InAppDisplayer$displayPreviewMessage$1) interfaceC1218d;
            int i3 = inAppDisplayer$displayPreviewMessage$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                inAppDisplayer$displayPreviewMessage$1.label = i3 - Integer.MIN_VALUE;
                Object obj = inAppDisplayer$displayPreviewMessage$1.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = inAppDisplayer$displayPreviewMessage$1.label;
                boolean z = true;
                if (i2 != 0) {
                    g.y(obj);
                    InAppMessage inAppMessage2 = new InAppMessage(true, this._time);
                    IInAppBackendService iInAppBackendService = this._backend;
                    String appId = this._configModelStore.getModel().getAppId();
                    inAppDisplayer$displayPreviewMessage$1.L$0 = this;
                    inAppDisplayer$displayPreviewMessage$1.L$1 = inAppMessage2;
                    inAppDisplayer$displayPreviewMessage$1.label = 1;
                    Object iAMPreviewData = iInAppBackendService.getIAMPreviewData(appId, str, inAppDisplayer$displayPreviewMessage$1);
                    if (iAMPreviewData == enumC1260a) {
                        return enumC1260a;
                    }
                    inAppDisplayer = this;
                    obj = iAMPreviewData;
                    inAppMessage = inAppMessage2;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        g.y(obj);
                        return Boolean.valueOf(z);
                    }
                    inAppMessage = (InAppMessage) inAppDisplayer$displayPreviewMessage$1.L$1;
                    inAppDisplayer = (InAppDisplayer) inAppDisplayer$displayPreviewMessage$1.L$0;
                    g.y(obj);
                }
                inAppMessageContent = (InAppMessageContent) obj;
                if (inAppMessageContent != null) {
                    z = false;
                } else {
                    Double displayDuration = inAppMessageContent.getDisplayDuration();
                    i.b(displayDuration);
                    inAppMessage.setDisplayDuration(displayDuration.doubleValue());
                    inAppDisplayer$displayPreviewMessage$1.L$0 = null;
                    inAppDisplayer$displayPreviewMessage$1.L$1 = null;
                    inAppDisplayer$displayPreviewMessage$1.label = 2;
                    if (inAppDisplayer.showMessageContent(inAppMessage, inAppMessageContent, inAppDisplayer$displayPreviewMessage$1) == enumC1260a) {
                        return enumC1260a;
                    }
                }
                return Boolean.valueOf(z);
            }
        }
        inAppDisplayer$displayPreviewMessage$1 = new InAppDisplayer$displayPreviewMessage$1(this, interfaceC1218d);
        Object obj2 = inAppDisplayer$displayPreviewMessage$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = inAppDisplayer$displayPreviewMessage$1.label;
        boolean z5 = true;
        if (i2 != 0) {
        }
        inAppMessageContent = (InAppMessageContent) obj2;
        if (inAppMessageContent != null) {
        }
        return Boolean.valueOf(z5);
    }
}
