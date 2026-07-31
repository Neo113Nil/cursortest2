package com.onesignal.inAppMessages.internal.display.impl;

import android.app.Activity;
import android.util.Base64;
import com.facebook.common.util.UriUtil;
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
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* compiled from: InAppDisplayer.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 (2\u00020\u0001:\u0001(BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0096@¢\u0006\u0002\u0010\u001bJ\u0016\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001eH\u0096@¢\u0006\u0002\u0010\u001fJ&\u0010 \u001a\u00020\u00162\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020$H\u0082@¢\u0006\u0002\u0010%J\u001e\u0010&\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020$H\u0082@¢\u0006\u0002\u0010'R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/onesignal/inAppMessages/internal/display/impl/InAppDisplayer;", "Lcom/onesignal/inAppMessages/internal/display/IInAppDisplayer;", "_applicationService", "Lcom/onesignal/core/internal/application/IApplicationService;", "_lifecycle", "Lcom/onesignal/inAppMessages/internal/lifecycle/IInAppLifecycleService;", "_promptFactory", "Lcom/onesignal/inAppMessages/internal/prompt/IInAppMessagePromptFactory;", "_backend", "Lcom/onesignal/inAppMessages/internal/backend/IInAppBackendService;", "_influenceManager", "Lcom/onesignal/session/internal/influence/IInfluenceManager;", "_configModelStore", "Lcom/onesignal/core/internal/config/ConfigModelStore;", "_languageContext", "Lcom/onesignal/core/internal/language/ILanguageContext;", "_time", "Lcom/onesignal/core/internal/time/ITime;", "(Lcom/onesignal/core/internal/application/IApplicationService;Lcom/onesignal/inAppMessages/internal/lifecycle/IInAppLifecycleService;Lcom/onesignal/inAppMessages/internal/prompt/IInAppMessagePromptFactory;Lcom/onesignal/inAppMessages/internal/backend/IInAppBackendService;Lcom/onesignal/session/internal/influence/IInfluenceManager;Lcom/onesignal/core/internal/config/ConfigModelStore;Lcom/onesignal/core/internal/language/ILanguageContext;Lcom/onesignal/core/internal/time/ITime;)V", "lastInstance", "Lcom/onesignal/inAppMessages/internal/display/impl/WebViewManager;", "dismissCurrentInAppMessage", "", "displayMessage", "", "message", "Lcom/onesignal/inAppMessages/internal/InAppMessage;", "(Lcom/onesignal/inAppMessages/internal/InAppMessage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "displayPreviewMessage", "previewUUID", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initInAppMessage", "currentActivity", "Landroid/app/Activity;", UriUtil.LOCAL_CONTENT_SCHEME, "Lcom/onesignal/inAppMessages/internal/InAppMessageContent;", "(Landroid/app/Activity;Lcom/onesignal/inAppMessages/internal/InAppMessage;Lcom/onesignal/inAppMessages/internal/InAppMessageContent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "showMessageContent", "(Lcom/onesignal/inAppMessages/internal/InAppMessage;Lcom/onesignal/inAppMessages/internal/InAppMessageContent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "com.onesignal.inAppMessages"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InAppDisplayer implements IInAppDisplayer {
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

    public InAppDisplayer(IApplicationService _applicationService, IInAppLifecycleService _lifecycle, IInAppMessagePromptFactory _promptFactory, IInAppBackendService _backend, IInfluenceManager _influenceManager, ConfigModelStore _configModelStore, ILanguageContext _languageContext, ITime _time) {
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

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a5, code lost:
    
        if (r2.showMessageContent(r10, r11, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.onesignal.inAppMessages.internal.display.IInAppDisplayer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object displayMessage(InAppMessage inAppMessage, Continuation<? super Boolean> continuation) {
        InAppDisplayer$displayMessage$1 inAppDisplayer$displayMessage$1;
        int i;
        InAppDisplayer inAppDisplayer;
        GetIAMDataResponse getIAMDataResponse;
        if (continuation instanceof InAppDisplayer$displayMessage$1) {
            inAppDisplayer$displayMessage$1 = (InAppDisplayer$displayMessage$1) continuation;
            if ((inAppDisplayer$displayMessage$1.label & Integer.MIN_VALUE) != 0) {
                inAppDisplayer$displayMessage$1.label -= Integer.MIN_VALUE;
                Object obj = inAppDisplayer$displayMessage$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = inAppDisplayer$displayMessage$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    IInAppBackendService iInAppBackendService = this._backend;
                    String appId = this._configModelStore.getModel().getAppId();
                    String messageId = inAppMessage.getMessageId();
                    String variantIdForMessage = InAppHelper.INSTANCE.variantIdForMessage(inAppMessage, this._languageContext);
                    inAppDisplayer$displayMessage$1.L$0 = this;
                    inAppDisplayer$displayMessage$1.L$1 = inAppMessage;
                    inAppDisplayer$displayMessage$1.label = 1;
                    obj = iInAppBackendService.getIAMData(appId, messageId, variantIdForMessage, inAppDisplayer$displayMessage$1);
                    if (obj != coroutine_suspended) {
                        inAppDisplayer = this;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Boxing.boxBoolean(true);
                }
                inAppMessage = (InAppMessage) inAppDisplayer$displayMessage$1.L$1;
                inAppDisplayer = (InAppDisplayer) inAppDisplayer$displayMessage$1.L$0;
                ResultKt.throwOnFailure(obj);
                getIAMDataResponse = (GetIAMDataResponse) obj;
                if (getIAMDataResponse.getContent() == null) {
                    InAppMessageContent content = getIAMDataResponse.getContent();
                    Intrinsics.checkNotNull(content);
                    Double displayDuration = content.getDisplayDuration();
                    Intrinsics.checkNotNull(displayDuration);
                    inAppMessage.setDisplayDuration(displayDuration.doubleValue());
                    inAppDisplayer._influenceManager.onInAppMessageDisplayed(inAppMessage.getMessageId());
                    InAppMessageContent content2 = getIAMDataResponse.getContent();
                    Intrinsics.checkNotNull(content2);
                    inAppDisplayer$displayMessage$1.L$0 = null;
                    inAppDisplayer$displayMessage$1.L$1 = null;
                    inAppDisplayer$displayMessage$1.label = 2;
                } else {
                    if (getIAMDataResponse.getShouldRetry()) {
                        return null;
                    }
                    return Boxing.boxBoolean(false);
                }
            }
        }
        inAppDisplayer$displayMessage$1 = new InAppDisplayer$displayMessage$1(this, continuation);
        Object obj2 = inAppDisplayer$displayMessage$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = inAppDisplayer$displayMessage$1.label;
        if (i != 0) {
        }
        getIAMDataResponse = (GetIAMDataResponse) obj2;
        if (getIAMDataResponse.getContent() == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0089, code lost:
    
        if (r2.showMessageContent(r8, r9, r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.onesignal.inAppMessages.internal.display.IInAppDisplayer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object displayPreviewMessage(String str, Continuation<? super Boolean> continuation) {
        InAppDisplayer$displayPreviewMessage$1 inAppDisplayer$displayPreviewMessage$1;
        int i;
        InAppMessage inAppMessage;
        InAppDisplayer inAppDisplayer;
        InAppMessageContent inAppMessageContent;
        if (continuation instanceof InAppDisplayer$displayPreviewMessage$1) {
            inAppDisplayer$displayPreviewMessage$1 = (InAppDisplayer$displayPreviewMessage$1) continuation;
            if ((inAppDisplayer$displayPreviewMessage$1.label & Integer.MIN_VALUE) != 0) {
                inAppDisplayer$displayPreviewMessage$1.label -= Integer.MIN_VALUE;
                Object obj = inAppDisplayer$displayPreviewMessage$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = inAppDisplayer$displayPreviewMessage$1.label;
                boolean z = true;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    InAppMessage inAppMessage2 = new InAppMessage(true, this._time);
                    IInAppBackendService iInAppBackendService = this._backend;
                    String appId = this._configModelStore.getModel().getAppId();
                    inAppDisplayer$displayPreviewMessage$1.L$0 = this;
                    inAppDisplayer$displayPreviewMessage$1.L$1 = inAppMessage2;
                    inAppDisplayer$displayPreviewMessage$1.label = 1;
                    Object iAMPreviewData = iInAppBackendService.getIAMPreviewData(appId, str, inAppDisplayer$displayPreviewMessage$1);
                    if (iAMPreviewData != coroutine_suspended) {
                        obj = iAMPreviewData;
                        inAppMessage = inAppMessage2;
                        inAppDisplayer = this;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Boxing.boxBoolean(z);
                }
                inAppMessage = (InAppMessage) inAppDisplayer$displayPreviewMessage$1.L$1;
                inAppDisplayer = (InAppDisplayer) inAppDisplayer$displayPreviewMessage$1.L$0;
                ResultKt.throwOnFailure(obj);
                inAppMessageContent = (InAppMessageContent) obj;
                if (inAppMessageContent != null) {
                    z = false;
                } else {
                    Double displayDuration = inAppMessageContent.getDisplayDuration();
                    Intrinsics.checkNotNull(displayDuration);
                    inAppMessage.setDisplayDuration(displayDuration.doubleValue());
                    inAppDisplayer$displayPreviewMessage$1.L$0 = null;
                    inAppDisplayer$displayPreviewMessage$1.L$1 = null;
                    inAppDisplayer$displayPreviewMessage$1.label = 2;
                }
                return Boxing.boxBoolean(z);
            }
        }
        inAppDisplayer$displayPreviewMessage$1 = new InAppDisplayer$displayPreviewMessage$1(this, continuation);
        Object obj2 = inAppDisplayer$displayPreviewMessage$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = inAppDisplayer$displayPreviewMessage$1.label;
        boolean z2 = true;
        if (i != 0) {
        }
        inAppMessageContent = (InAppMessageContent) obj2;
        if (inAppMessageContent != null) {
        }
        return Boxing.boxBoolean(z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00e8, code lost:
    
        if (r2.showMessageContent(r11, r12, r0) != r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00bb, code lost:
    
        if (r3.initInAppMessage(r11, r2, r12, r0) != r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c4, code lost:
    
        if (initInAppMessage(r13, r11, r12, r0) == r1) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object showMessageContent(InAppMessage inAppMessage, InAppMessageContent inAppMessageContent, Continuation<? super Unit> continuation) {
        InAppDisplayer$showMessageContent$1 inAppDisplayer$showMessageContent$1;
        int i;
        InAppDisplayer inAppDisplayer;
        InAppDisplayer inAppDisplayer2;
        InAppMessage inAppMessage2;
        Activity activity;
        if (continuation instanceof InAppDisplayer$showMessageContent$1) {
            inAppDisplayer$showMessageContent$1 = (InAppDisplayer$showMessageContent$1) continuation;
            if ((inAppDisplayer$showMessageContent$1.label & Integer.MIN_VALUE) != 0) {
                inAppDisplayer$showMessageContent$1.label -= Integer.MIN_VALUE;
                Object obj = inAppDisplayer$showMessageContent$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = inAppDisplayer$showMessageContent$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Activity current = this._applicationService.getCurrent();
                    Logging.debug$default("InAppDisplayer.showMessageContent: in app message on currentActivity: " + current, null, 2, null);
                    if (current != null) {
                        if (this.lastInstance != null && inAppMessage.getIsPreview()) {
                            WebViewManager webViewManager = this.lastInstance;
                            Intrinsics.checkNotNull(webViewManager);
                            inAppDisplayer$showMessageContent$1.L$0 = this;
                            inAppDisplayer$showMessageContent$1.L$1 = inAppMessage;
                            inAppDisplayer$showMessageContent$1.L$2 = inAppMessageContent;
                            inAppDisplayer$showMessageContent$1.L$3 = current;
                            inAppDisplayer$showMessageContent$1.label = 1;
                            if (webViewManager.dismissAndAwaitNextMessage(inAppDisplayer$showMessageContent$1) != coroutine_suspended) {
                                inAppDisplayer2 = this;
                                inAppMessage2 = inAppMessage;
                                activity = current;
                                inAppDisplayer2.lastInstance = null;
                                inAppDisplayer$showMessageContent$1.L$0 = null;
                                inAppDisplayer$showMessageContent$1.L$1 = null;
                                inAppDisplayer$showMessageContent$1.L$2 = null;
                                inAppDisplayer$showMessageContent$1.L$3 = null;
                                inAppDisplayer$showMessageContent$1.label = 2;
                            }
                        } else {
                            inAppDisplayer$showMessageContent$1.label = 3;
                        }
                    } else {
                        inAppDisplayer$showMessageContent$1.L$0 = this;
                        inAppDisplayer$showMessageContent$1.L$1 = inAppMessage;
                        inAppDisplayer$showMessageContent$1.L$2 = inAppMessageContent;
                        inAppDisplayer$showMessageContent$1.label = 4;
                        if (DelayKt.delay(200L, inAppDisplayer$showMessageContent$1) != coroutine_suspended) {
                            inAppDisplayer = this;
                            inAppDisplayer$showMessageContent$1.L$0 = null;
                            inAppDisplayer$showMessageContent$1.L$1 = null;
                            inAppDisplayer$showMessageContent$1.L$2 = null;
                            inAppDisplayer$showMessageContent$1.label = 5;
                        }
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    activity = (Activity) inAppDisplayer$showMessageContent$1.L$3;
                    inAppMessageContent = (InAppMessageContent) inAppDisplayer$showMessageContent$1.L$2;
                    inAppMessage2 = (InAppMessage) inAppDisplayer$showMessageContent$1.L$1;
                    inAppDisplayer2 = (InAppDisplayer) inAppDisplayer$showMessageContent$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    inAppDisplayer2.lastInstance = null;
                    inAppDisplayer$showMessageContent$1.L$0 = null;
                    inAppDisplayer$showMessageContent$1.L$1 = null;
                    inAppDisplayer$showMessageContent$1.L$2 = null;
                    inAppDisplayer$showMessageContent$1.L$3 = null;
                    inAppDisplayer$showMessageContent$1.label = 2;
                } else {
                    if (i == 2 || i == 3) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    if (i != 4) {
                        if (i != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    inAppMessageContent = (InAppMessageContent) inAppDisplayer$showMessageContent$1.L$2;
                    inAppMessage = (InAppMessage) inAppDisplayer$showMessageContent$1.L$1;
                    inAppDisplayer = (InAppDisplayer) inAppDisplayer$showMessageContent$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    inAppDisplayer$showMessageContent$1.L$0 = null;
                    inAppDisplayer$showMessageContent$1.L$1 = null;
                    inAppDisplayer$showMessageContent$1.L$2 = null;
                    inAppDisplayer$showMessageContent$1.label = 5;
                }
            }
        }
        inAppDisplayer$showMessageContent$1 = new InAppDisplayer$showMessageContent$1(this, continuation);
        Object obj2 = inAppDisplayer$showMessageContent$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = inAppDisplayer$showMessageContent$1.label;
        if (i != 0) {
        }
    }

    @Override // com.onesignal.inAppMessages.internal.display.IInAppDisplayer
    public void dismissCurrentInAppMessage() {
        Logging.debug$default("WebViewManager IAM dismissAndAwaitNextMessage lastInstance: " + this.lastInstance, null, 2, null);
        WebViewManager webViewManager = this.lastInstance;
        if (webViewManager != null) {
            Intrinsics.checkNotNull(webViewManager);
            webViewManager.backgroundDismissAndAwaitNextMessage();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(1:(1:10)(2:14|15))(5:16|17|(1:19)(1:23)|20|(1:22))|11|12))|26|6|7|(0)(0)|11|12) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x002f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009f, code lost:
    
        com.onesignal.debug.internal.logging.Logging.error("Catch on initInAppMessage: ", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object initInAppMessage(Activity activity, InAppMessage inAppMessage, InAppMessageContent inAppMessageContent, Continuation<? super Unit> continuation) {
        InAppDisplayer$initInAppMessage$1 inAppDisplayer$initInAppMessage$1;
        int i;
        Activity activity2;
        InAppMessageContent inAppMessageContent2;
        if (continuation instanceof InAppDisplayer$initInAppMessage$1) {
            inAppDisplayer$initInAppMessage$1 = (InAppDisplayer$initInAppMessage$1) continuation;
            if ((inAppDisplayer$initInAppMessage$1.label & Integer.MIN_VALUE) != 0) {
                inAppDisplayer$initInAppMessage$1.label -= Integer.MIN_VALUE;
                Object obj = inAppDisplayer$initInAppMessage$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = inAppDisplayer$initInAppMessage$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    String contentHtml = inAppMessageContent.getContentHtml();
                    Intrinsics.checkNotNull(contentHtml);
                    Charset forName = Charset.forName(CharEncoding.UTF_8);
                    Intrinsics.checkNotNullExpressionValue(forName, "forName(...)");
                    byte[] bytes = contentHtml.getBytes(forName);
                    Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                    String encodeToString = Base64.encodeToString(bytes, 2);
                    WebViewManager webViewManager = new WebViewManager(inAppMessage, activity, inAppMessageContent, this._lifecycle, this._applicationService, this._promptFactory);
                    this.lastInstance = webViewManager;
                    if (inAppMessageContent.getIsFullBleed()) {
                        activity2 = activity;
                        inAppMessageContent2 = inAppMessageContent;
                        webViewManager.setContentSafeAreaInsets(inAppMessageContent2, activity2);
                    } else {
                        activity2 = activity;
                        inAppMessageContent2 = inAppMessageContent;
                    }
                    MainCoroutineDispatcher main = Dispatchers.getMain();
                    InAppDisplayer$initInAppMessage$2 inAppDisplayer$initInAppMessage$2 = new InAppDisplayer$initInAppMessage$2(webViewManager, activity2, encodeToString, inAppMessageContent2, null);
                    inAppDisplayer$initInAppMessage$1.label = 1;
                    if (BuildersKt.withContext(main, inAppDisplayer$initInAppMessage$2, inAppDisplayer$initInAppMessage$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }
        inAppDisplayer$initInAppMessage$1 = new InAppDisplayer$initInAppMessage$1(this, continuation);
        Object obj2 = inAppDisplayer$initInAppMessage$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = inAppDisplayer$initInAppMessage$1.label;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }
}
