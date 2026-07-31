package com.onesignal.notifications.internal.registration.impl;

import com.onesignal.common.AndroidUtils;
import com.onesignal.core.internal.config.ConfigModelStore;
import com.onesignal.core.internal.device.IDeviceService;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.notifications.internal.registration.IPushRegistrator;
import com.onesignal.user.internal.subscriptions.SubscriptionStatus;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PushRegistratorAbstractGoogle.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\b \u0018\u0000 #2\u00020\u00012\u00020\u0002:\u0001#B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ \u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0082@¢\u0006\u0002\u0010\u0013J\u0018\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u000bH\u0096@¢\u0006\u0002\u0010\u0017J\u0016\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bH¦@¢\u0006\u0002\u0010\u0017J\u0016\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000bH\u0082@¢\u0006\u0002\u0010\u0017J\u0012\u0010\u001a\u001a\u00020\u001b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000bH\u0002J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u000e\u0010 \u001a\u00020\u000fH\u0096@¢\u0006\u0002\u0010!J\u0016\u0010\"\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000bH\u0082@¢\u0006\u0002\u0010\u0017R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006$"}, d2 = {"Lcom/onesignal/notifications/internal/registration/impl/PushRegistratorAbstractGoogle;", "Lcom/onesignal/notifications/internal/registration/IPushRegistrator;", "Lcom/onesignal/notifications/internal/registration/impl/IPushRegistratorCallback;", "_deviceService", "Lcom/onesignal/core/internal/device/IDeviceService;", "_configModelStore", "Lcom/onesignal/core/internal/config/ConfigModelStore;", "_upgradePrompt", "Lcom/onesignal/notifications/internal/registration/impl/GooglePlayServicesUpgradePrompt;", "(Lcom/onesignal/core/internal/device/IDeviceService;Lcom/onesignal/core/internal/config/ConfigModelStore;Lcom/onesignal/notifications/internal/registration/impl/GooglePlayServicesUpgradePrompt;)V", "providerName", "", "getProviderName", "()Ljava/lang/String;", "attemptRegistration", "Lcom/onesignal/notifications/internal/registration/IPushRegistrator$RegisterResult;", "senderId", "currentRetry", "", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fireCallback", "", "id", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getToken", "internalRegisterForPush", "isValidProjectNumber", "", "pushStatusFromThrowable", "Lcom/onesignal/user/internal/subscriptions/SubscriptionStatus;", "throwable", "", "registerForPush", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerInBackground", "Companion", "com.onesignal.notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class PushRegistratorAbstractGoogle implements IPushRegistrator, IPushRegistratorCallback {
    private static final int REGISTRATION_RETRY_BACKOFF_MS = 10000;
    private static final int REGISTRATION_RETRY_COUNT = 5;
    private ConfigModelStore _configModelStore;
    private final IDeviceService _deviceService;
    private final GooglePlayServicesUpgradePrompt _upgradePrompt;

    @Override // com.onesignal.notifications.internal.registration.impl.IPushRegistratorCallback
    public Object fireCallback(String str, Continuation<? super Unit> continuation) {
        return fireCallback$suspendImpl(this, str, continuation);
    }

    public abstract String getProviderName();

    public abstract Object getToken(String str, Continuation<? super String> continuation) throws ExecutionException, InterruptedException, IOException;

    @Override // com.onesignal.notifications.internal.registration.IPushRegistrator
    public Object registerForPush(Continuation<? super IPushRegistrator.RegisterResult> continuation) {
        return registerForPush$suspendImpl(this, continuation);
    }

    public PushRegistratorAbstractGoogle(IDeviceService _deviceService, ConfigModelStore _configModelStore, GooglePlayServicesUpgradePrompt _upgradePrompt) {
        Intrinsics.checkNotNullParameter(_deviceService, "_deviceService");
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        Intrinsics.checkNotNullParameter(_upgradePrompt, "_upgradePrompt");
        this._deviceService = _deviceService;
        this._configModelStore = _configModelStore;
        this._upgradePrompt = _upgradePrompt;
    }

    static /* synthetic */ Object registerForPush$suspendImpl(PushRegistratorAbstractGoogle pushRegistratorAbstractGoogle, Continuation<? super IPushRegistrator.RegisterResult> continuation) {
        if (!pushRegistratorAbstractGoogle._configModelStore.getModel().isInitializedWithRemote()) {
            return new IPushRegistrator.RegisterResult(null, SubscriptionStatus.FIREBASE_FCM_INIT_ERROR);
        }
        if (!pushRegistratorAbstractGoogle._deviceService.getHasFCMLibrary()) {
            Logging.warn$default("The Firebase FCM library is missing! Please make sure to include it in your project.", null, 2, null);
            return new IPushRegistrator.RegisterResult(null, SubscriptionStatus.MISSING_FIREBASE_FCM_LIBRARY);
        }
        if (!pushRegistratorAbstractGoogle.isValidProjectNumber(pushRegistratorAbstractGoogle._configModelStore.getModel().getGoogleProjectNumber())) {
            Logging.warn$default("Missing Google Project number!\nPlease enter a Google Project number / Sender ID on under App Settings > Android > Configuration on the OneSignal dashboard.", null, 2, null);
            return new IPushRegistrator.RegisterResult(null, SubscriptionStatus.INVALID_FCM_SENDER_ID);
        }
        String googleProjectNumber = pushRegistratorAbstractGoogle._configModelStore.getModel().getGoogleProjectNumber();
        Intrinsics.checkNotNull(googleProjectNumber);
        return pushRegistratorAbstractGoogle.internalRegisterForPush(googleProjectNumber, continuation);
    }

    static /* synthetic */ Object fireCallback$suspendImpl(PushRegistratorAbstractGoogle pushRegistratorAbstractGoogle, String str, Continuation<? super Unit> continuation) {
        throw new Exception("Google has no callback mechanism for push registration!");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.onesignal.notifications.internal.registration.impl.PushRegistratorAbstractGoogle, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v1, types: [com.onesignal.notifications.internal.registration.impl.PushRegistratorAbstractGoogle] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object internalRegisterForPush(String str, Continuation<? super IPushRegistrator.RegisterResult> continuation) {
        PushRegistratorAbstractGoogle$internalRegisterForPush$1 pushRegistratorAbstractGoogle$internalRegisterForPush$1;
        int i;
        try {
            if (continuation instanceof PushRegistratorAbstractGoogle$internalRegisterForPush$1) {
                pushRegistratorAbstractGoogle$internalRegisterForPush$1 = (PushRegistratorAbstractGoogle$internalRegisterForPush$1) continuation;
                if ((pushRegistratorAbstractGoogle$internalRegisterForPush$1.label & Integer.MIN_VALUE) != 0) {
                    pushRegistratorAbstractGoogle$internalRegisterForPush$1.label -= Integer.MIN_VALUE;
                    Object obj = pushRegistratorAbstractGoogle$internalRegisterForPush$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = pushRegistratorAbstractGoogle$internalRegisterForPush$1.label;
                    if (i == 0) {
                        if (i == 1) {
                            ResultKt.throwOnFailure(obj);
                            return (IPushRegistrator.RegisterResult) obj;
                        }
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        Logging.warn$default("'Google Play services' app not installed or disabled on the device.", null, 2, null);
                        return new IPushRegistrator.RegisterResult(null, SubscriptionStatus.OUTDATED_GOOGLE_PLAY_SERVICES_APP);
                    }
                    ResultKt.throwOnFailure(obj);
                    try {
                        if (this._deviceService.isGMSInstalledAndEnabled()) {
                            pushRegistratorAbstractGoogle$internalRegisterForPush$1.L$0 = this;
                            pushRegistratorAbstractGoogle$internalRegisterForPush$1.label = 1;
                            obj = registerInBackground(str, pushRegistratorAbstractGoogle$internalRegisterForPush$1);
                            if (obj != coroutine_suspended) {
                                return (IPushRegistrator.RegisterResult) obj;
                            }
                        } else {
                            GooglePlayServicesUpgradePrompt googlePlayServicesUpgradePrompt = this._upgradePrompt;
                            pushRegistratorAbstractGoogle$internalRegisterForPush$1.L$0 = this;
                            pushRegistratorAbstractGoogle$internalRegisterForPush$1.label = 2;
                            if (googlePlayServicesUpgradePrompt.showUpdateGPSDialog(pushRegistratorAbstractGoogle$internalRegisterForPush$1) != coroutine_suspended) {
                                Logging.warn$default("'Google Play services' app not installed or disabled on the device.", null, 2, null);
                                return new IPushRegistrator.RegisterResult(null, SubscriptionStatus.OUTDATED_GOOGLE_PLAY_SERVICES_APP);
                            }
                        }
                        return coroutine_suspended;
                    } catch (Throwable th) {
                        th = th;
                        str = this;
                        Logging.warn("Could not register with " + str.getProviderName() + " due to an issue with your AndroidManifest.xml or with 'Google Play services'.", th);
                        return new IPushRegistrator.RegisterResult(null, SubscriptionStatus.FIREBASE_FCM_INIT_ERROR);
                    }
                }
            }
            if (i == 0) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
        pushRegistratorAbstractGoogle$internalRegisterForPush$1 = new PushRegistratorAbstractGoogle$internalRegisterForPush$1(this, continuation);
        Object obj2 = pushRegistratorAbstractGoogle$internalRegisterForPush$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = pushRegistratorAbstractGoogle$internalRegisterForPush$1.label;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007f, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay((r10 + 1) * 10000, r0) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x007f -> B:11:0x0082). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object registerInBackground(String str, Continuation<? super IPushRegistrator.RegisterResult> continuation) {
        PushRegistratorAbstractGoogle$registerInBackground$1 pushRegistratorAbstractGoogle$registerInBackground$1;
        int i;
        int i2;
        PushRegistratorAbstractGoogle pushRegistratorAbstractGoogle;
        int i3;
        PushRegistratorAbstractGoogle pushRegistratorAbstractGoogle2;
        String str2;
        IPushRegistrator.RegisterResult registerResult;
        if (continuation instanceof PushRegistratorAbstractGoogle$registerInBackground$1) {
            pushRegistratorAbstractGoogle$registerInBackground$1 = (PushRegistratorAbstractGoogle$registerInBackground$1) continuation;
            if ((pushRegistratorAbstractGoogle$registerInBackground$1.label & Integer.MIN_VALUE) != 0) {
                pushRegistratorAbstractGoogle$registerInBackground$1.label -= Integer.MIN_VALUE;
                Object obj = pushRegistratorAbstractGoogle$registerInBackground$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = pushRegistratorAbstractGoogle$registerInBackground$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    i2 = 0;
                    pushRegistratorAbstractGoogle = this;
                    if (i2 >= 5) {
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i3 = pushRegistratorAbstractGoogle$registerInBackground$1.I$0;
                        str2 = (String) pushRegistratorAbstractGoogle$registerInBackground$1.L$1;
                        pushRegistratorAbstractGoogle2 = (PushRegistratorAbstractGoogle) pushRegistratorAbstractGoogle$registerInBackground$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        i2 = i3 + 1;
                        str = str2;
                        pushRegistratorAbstractGoogle = pushRegistratorAbstractGoogle2;
                        if (i2 >= 5) {
                            pushRegistratorAbstractGoogle$registerInBackground$1.L$0 = pushRegistratorAbstractGoogle;
                            pushRegistratorAbstractGoogle$registerInBackground$1.L$1 = str;
                            pushRegistratorAbstractGoogle$registerInBackground$1.I$0 = i2;
                            pushRegistratorAbstractGoogle$registerInBackground$1.label = 1;
                            Object attemptRegistration = pushRegistratorAbstractGoogle.attemptRegistration(str, i2, pushRegistratorAbstractGoogle$registerInBackground$1);
                            if (attemptRegistration != coroutine_suspended) {
                                PushRegistratorAbstractGoogle pushRegistratorAbstractGoogle3 = pushRegistratorAbstractGoogle;
                                str2 = str;
                                i3 = i2;
                                obj = attemptRegistration;
                                pushRegistratorAbstractGoogle2 = pushRegistratorAbstractGoogle3;
                                registerResult = (IPushRegistrator.RegisterResult) obj;
                                if (registerResult == null) {
                                    return registerResult;
                                }
                                pushRegistratorAbstractGoogle$registerInBackground$1.L$0 = pushRegistratorAbstractGoogle2;
                                pushRegistratorAbstractGoogle$registerInBackground$1.L$1 = str2;
                                pushRegistratorAbstractGoogle$registerInBackground$1.I$0 = i3;
                                pushRegistratorAbstractGoogle$registerInBackground$1.label = 2;
                            }
                            return coroutine_suspended;
                        }
                        return new IPushRegistrator.RegisterResult(null, SubscriptionStatus.FIREBASE_FCM_INIT_ERROR);
                    }
                    i3 = pushRegistratorAbstractGoogle$registerInBackground$1.I$0;
                    str2 = (String) pushRegistratorAbstractGoogle$registerInBackground$1.L$1;
                    pushRegistratorAbstractGoogle2 = (PushRegistratorAbstractGoogle) pushRegistratorAbstractGoogle$registerInBackground$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    registerResult = (IPushRegistrator.RegisterResult) obj;
                    if (registerResult == null) {
                    }
                }
            }
        }
        pushRegistratorAbstractGoogle$registerInBackground$1 = new PushRegistratorAbstractGoogle$registerInBackground$1(this, continuation);
        Object obj2 = pushRegistratorAbstractGoogle$registerInBackground$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = pushRegistratorAbstractGoogle$registerInBackground$1.label;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object attemptRegistration(String str, int i, Continuation<? super IPushRegistrator.RegisterResult> continuation) {
        PushRegistratorAbstractGoogle$attemptRegistration$1 pushRegistratorAbstractGoogle$attemptRegistration$1;
        int i2;
        PushRegistratorAbstractGoogle pushRegistratorAbstractGoogle;
        IOException iOException;
        String rootCauseMessage;
        if (continuation instanceof PushRegistratorAbstractGoogle$attemptRegistration$1) {
            pushRegistratorAbstractGoogle$attemptRegistration$1 = (PushRegistratorAbstractGoogle$attemptRegistration$1) continuation;
            if ((pushRegistratorAbstractGoogle$attemptRegistration$1.label & Integer.MIN_VALUE) != 0) {
                pushRegistratorAbstractGoogle$attemptRegistration$1.label -= Integer.MIN_VALUE;
                Object obj = pushRegistratorAbstractGoogle$attemptRegistration$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = pushRegistratorAbstractGoogle$attemptRegistration$1.label;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        pushRegistratorAbstractGoogle$attemptRegistration$1.L$0 = this;
                        pushRegistratorAbstractGoogle$attemptRegistration$1.I$0 = i;
                        pushRegistratorAbstractGoogle$attemptRegistration$1.label = 1;
                        obj = getToken(str, pushRegistratorAbstractGoogle$attemptRegistration$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        pushRegistratorAbstractGoogle = this;
                    } catch (IOException e) {
                        e = e;
                        pushRegistratorAbstractGoogle = this;
                        iOException = e;
                        SubscriptionStatus pushStatusFromThrowable = pushRegistratorAbstractGoogle.pushStatusFromThrowable(iOException);
                        rootCauseMessage = AndroidUtils.INSTANCE.getRootCauseMessage(iOException);
                        if (!Intrinsics.areEqual("SERVICE_NOT_AVAILABLE", rootCauseMessage)) {
                        }
                        Exception exc = new Exception(iOException);
                        if (i < 4) {
                        }
                        return null;
                    } catch (Throwable th) {
                        th = th;
                        pushRegistratorAbstractGoogle = this;
                        Logging.warn("Unknown error getting " + pushRegistratorAbstractGoogle.getProviderName() + " Token", th);
                        return new IPushRegistrator.RegisterResult(null, SubscriptionStatus.FIREBASE_FCM_ERROR_MISC_EXCEPTION);
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i = pushRegistratorAbstractGoogle$attemptRegistration$1.I$0;
                    pushRegistratorAbstractGoogle = (PushRegistratorAbstractGoogle) pushRegistratorAbstractGoogle$attemptRegistration$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (IOException e2) {
                        e = e2;
                        iOException = e;
                        SubscriptionStatus pushStatusFromThrowable2 = pushRegistratorAbstractGoogle.pushStatusFromThrowable(iOException);
                        rootCauseMessage = AndroidUtils.INSTANCE.getRootCauseMessage(iOException);
                        if (!Intrinsics.areEqual("SERVICE_NOT_AVAILABLE", rootCauseMessage) || Intrinsics.areEqual("AUTHENTICATION_FAILED", rootCauseMessage)) {
                            Exception exc2 = new Exception(iOException);
                            if (i < 4) {
                                Logging.info("Retry count of 5 exceed! Could not get a " + pushRegistratorAbstractGoogle.getProviderName() + " Token.", exc2);
                            } else {
                                Logging.info("'Google Play services' returned " + rootCauseMessage + " error. Current retry count: " + i, exc2);
                                if (i == 2) {
                                    return new IPushRegistrator.RegisterResult(null, pushStatusFromThrowable2);
                                }
                            }
                            return null;
                        }
                        Logging.warn("Error Getting " + pushRegistratorAbstractGoogle.getProviderName() + " Token", new Exception(iOException));
                        return new IPushRegistrator.RegisterResult(null, pushStatusFromThrowable2);
                    } catch (Throwable th2) {
                        th = th2;
                        Logging.warn("Unknown error getting " + pushRegistratorAbstractGoogle.getProviderName() + " Token", th);
                        return new IPushRegistrator.RegisterResult(null, SubscriptionStatus.FIREBASE_FCM_ERROR_MISC_EXCEPTION);
                    }
                }
                String str2 = (String) obj;
                Logging.info$default("Device registered, push token = " + str2, null, 2, null);
                return new IPushRegistrator.RegisterResult(str2, SubscriptionStatus.SUBSCRIBED);
            }
        }
        pushRegistratorAbstractGoogle$attemptRegistration$1 = new PushRegistratorAbstractGoogle$attemptRegistration$1(this, continuation);
        Object obj2 = pushRegistratorAbstractGoogle$attemptRegistration$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = pushRegistratorAbstractGoogle$attemptRegistration$1.label;
        if (i2 != 0) {
        }
        String str22 = (String) obj2;
        Logging.info$default("Device registered, push token = " + str22, null, 2, null);
        return new IPushRegistrator.RegisterResult(str22, SubscriptionStatus.SUBSCRIBED);
    }

    private final SubscriptionStatus pushStatusFromThrowable(Throwable throwable) {
        String rootCauseMessage = AndroidUtils.INSTANCE.getRootCauseMessage(throwable);
        if (throwable instanceof IOException) {
            return Intrinsics.areEqual(rootCauseMessage, "SERVICE_NOT_AVAILABLE") ? SubscriptionStatus.FIREBASE_FCM_ERROR_IOEXCEPTION_SERVICE_NOT_AVAILABLE : Intrinsics.areEqual(rootCauseMessage, "AUTHENTICATION_FAILED") ? SubscriptionStatus.FIREBASE_FCM_ERROR_IOEXCEPTION_AUTHENTICATION_FAILED : SubscriptionStatus.FIREBASE_FCM_ERROR_IOEXCEPTION_OTHER;
        }
        return SubscriptionStatus.FIREBASE_FCM_ERROR_MISC_EXCEPTION;
    }

    private final boolean isValidProjectNumber(String senderId) {
        try {
            Intrinsics.checkNotNull(senderId);
            Float.parseFloat(senderId);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
