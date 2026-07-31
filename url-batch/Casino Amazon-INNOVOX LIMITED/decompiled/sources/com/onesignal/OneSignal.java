package com.onesignal;

import android.content.Context;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.onesignal.common.services.IServiceProvider;
import com.onesignal.core.BuildConfig;
import com.onesignal.debug.IDebugManager;
import com.onesignal.inAppMessages.IInAppMessagesManager;
import com.onesignal.internal.OneSignalImp;
import com.onesignal.location.ILocationManager;
import com.onesignal.notifications.INotificationsManager;
import com.onesignal.session.ISessionManager;
import com.onesignal.user.IUserManager;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OneSignal.kt */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0015\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020EH\u0007J\u000e\u0010F\u001a\u00020\"H\u0087@¢\u0006\u0002\u0010GJ\u000e\u0010H\u001a\u00020\"H\u0087@¢\u0006\u0002\u0010GJ\u000e\u0010I\u001a\u00020\"H\u0087@¢\u0006\u0002\u0010GJ\u000e\u0010J\u001a\u00020\tH\u0087@¢\u0006\u0002\u0010GJ\u000e\u0010K\u001a\u00020\u000eH\u0087@¢\u0006\u0002\u0010GJ\u000e\u0010L\u001a\u00020\u0013H\u0087@¢\u0006\u0002\u0010GJ\u001a\u0010M\u001a\u0002HN\"\n\b\u0000\u0010N\u0018\u0001*\u00020\u0001H\u0086\b¢\u0006\u0002\u0010OJ\u001c\u0010P\u001a\u0004\u0018\u0001HN\"\n\b\u0000\u0010N\u0018\u0001*\u00020\u0001H\u0086\b¢\u0006\u0002\u0010OJ\u000e\u0010Q\u001a\u00020\u0018H\u0087@¢\u0006\u0002\u0010GJ\u000e\u0010R\u001a\u00020\u001dH\u0087@¢\u0006\u0002\u0010GJ\u0016\u0010S\u001a\u00020\"2\u0006\u0010T\u001a\u00020UH\u0087@¢\u0006\u0002\u0010VJ\u0018\u0010S\u001a\u00020C2\u0006\u0010T\u001a\u00020U2\u0006\u0010W\u001a\u00020:H\u0007J\"\u0010X\u001a\u00020\"2\u0006\u0010T\u001a\u00020U2\n\b\u0002\u0010W\u001a\u0004\u0018\u00010:H\u0087@¢\u0006\u0002\u0010YJ\u0010\u0010Z\u001a\u00020C2\u0006\u0010[\u001a\u00020:H\u0007J\u001c\u0010Z\u001a\u00020C2\u0006\u0010[\u001a\u00020:2\n\b\u0002\u0010\\\u001a\u0004\u0018\u00010:H\u0007J\"\u0010]\u001a\u00020C2\u0006\u0010[\u001a\u00020:2\n\b\u0002\u0010\\\u001a\u0004\u0018\u00010:H\u0087@¢\u0006\u0002\u0010^J\b\u0010_\u001a\u00020CH\u0007J\u000e\u0010`\u001a\u00020CH\u0087@¢\u0006\u0002\u0010GJ\u0010\u0010a\u001a\u00020C2\u0006\u0010D\u001a\u00020EH\u0007J\u0016\u0010b\u001a\u00020C2\u0006\u0010!\u001a\u00020\"H\u0087@¢\u0006\u0002\u0010cJ\u0016\u0010d\u001a\u00020C2\u0006\u0010e\u001a\u00020\"H\u0087@¢\u0006\u0002\u0010cJ\u0016\u0010f\u001a\u00020C2\u0006\u0010!\u001a\u00020\"H\u0087@¢\u0006\u0002\u0010cJ\u0018\u0010g\u001a\u00020C2\u0006\u0010[\u001a\u00020:2\u0006\u0010h\u001a\u00020:H\u0007J\u001e\u0010i\u001a\u00020C2\u0006\u0010[\u001a\u00020:2\u0006\u0010h\u001a\u00020:H\u0087@¢\u0006\u0002\u0010^R\u001a\u0010\u0003\u001a\u00020\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\t8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u0002\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000e8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000f\u0010\u0002\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u00138FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u0002\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u00188FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0019\u0010\u0002\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u001d8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001e\u0010\u0002\u001a\u0004\b\u001f\u0010 R*\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020\"8F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\b$\u0010\u0002\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R*\u0010)\u001a\u00020\"2\u0006\u0010!\u001a\u00020\"8F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\b*\u0010\u0002\u001a\u0004\b+\u0010&\"\u0004\b,\u0010(R*\u0010-\u001a\u00020\"2\u0006\u0010!\u001a\u00020\"8F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\b.\u0010\u0002\u001a\u0004\b/\u0010&\"\u0004\b0\u0010(R\u001a\u00101\u001a\u00020\"8FX\u0087\u0004¢\u0006\f\u0012\u0004\b2\u0010\u0002\u001a\u0004\b1\u0010&R\u001b\u00103\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b5\u00106R\u001a\u00109\u001a\u00020:8FX\u0087\u0004¢\u0006\f\u0012\u0004\b;\u0010\u0002\u001a\u0004\b<\u0010=R\u0011\u0010>\u001a\u00020?8F¢\u0006\u0006\u001a\u0004\b@\u0010A¨\u0006j"}, d2 = {"Lcom/onesignal/OneSignal;", "", "()V", "Debug", "Lcom/onesignal/debug/IDebugManager;", "getDebug$annotations", "getDebug", "()Lcom/onesignal/debug/IDebugManager;", "InAppMessages", "Lcom/onesignal/inAppMessages/IInAppMessagesManager;", "getInAppMessages$annotations", "getInAppMessages", "()Lcom/onesignal/inAppMessages/IInAppMessagesManager;", "Location", "Lcom/onesignal/location/ILocationManager;", "getLocation$annotations", "getLocation", "()Lcom/onesignal/location/ILocationManager;", "Notifications", "Lcom/onesignal/notifications/INotificationsManager;", "getNotifications$annotations", "getNotifications", "()Lcom/onesignal/notifications/INotificationsManager;", "Session", "Lcom/onesignal/session/ISessionManager;", "getSession$annotations", "getSession", "()Lcom/onesignal/session/ISessionManager;", "User", "Lcom/onesignal/user/IUserManager;", "getUser$annotations", "getUser", "()Lcom/onesignal/user/IUserManager;", "value", "", "consentGiven", "getConsentGiven$annotations", "getConsentGiven", "()Z", "setConsentGiven", "(Z)V", "consentRequired", "getConsentRequired$annotations", "getConsentRequired", "setConsentRequired", "disableGMSMissingPrompt", "getDisableGMSMissingPrompt$annotations", "getDisableGMSMissingPrompt", "setDisableGMSMissingPrompt", "isInitialized", "isInitialized$annotations", "oneSignal", "Lcom/onesignal/IOneSignal;", "getOneSignal", "()Lcom/onesignal/IOneSignal;", "oneSignal$delegate", "Lkotlin/Lazy;", "sdkVersion", "", "getSdkVersion$annotations", "getSdkVersion", "()Ljava/lang/String;", "services", "Lcom/onesignal/common/services/IServiceProvider;", "getServices", "()Lcom/onesignal/common/services/IServiceProvider;", "addUserJwtInvalidatedListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/onesignal/IUserJwtInvalidatedListener;", "getConsentGivenSuspend", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getConsentRequiredSuspend", "getDisableGMSMissingPromptSuspend", "getInAppMessagesSuspend", "getLocationSuspend", "getNotificationsSuspend", "getService", "T", "()Ljava/lang/Object;", "getServiceOrNull", "getSessionSuspend", "getUserSuspend", "initWithContext", "context", "Landroid/content/Context;", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "appId", "initWithContextSuspend", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "login", "externalId", "jwtBearerToken", "loginSuspend", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logout", "logoutSuspend", "removeUserJwtInvalidatedListener", "setConsentGivenSuspend", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setConsentRequiredSuspend", "required", "setDisableGMSMissingPromptSuspend", "updateUserJwt", "token", "updateUserJwtSuspend", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OneSignal {
    public static final OneSignal INSTANCE = new OneSignal();

    /* renamed from: oneSignal$delegate, reason: from kotlin metadata */
    private static final Lazy oneSignal = LazyKt.lazy(new Function0<OneSignalImp>() { // from class: com.onesignal.OneSignal$oneSignal$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final OneSignalImp invoke() {
            return new OneSignalImp();
        }
    });

    @JvmStatic
    public static /* synthetic */ void getConsentGiven$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getConsentRequired$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getDebug$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getDisableGMSMissingPrompt$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getInAppMessages$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getLocation$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getNotifications$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getSdkVersion$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getSession$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getUser$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void isInitialized$annotations() {
    }

    private OneSignal() {
    }

    public static final boolean isInitialized() {
        return INSTANCE.getOneSignal().isInitialized();
    }

    public static final String getSdkVersion() {
        return INSTANCE.getOneSignal().getSdkVersion();
    }

    public static final IUserManager getUser() {
        return INSTANCE.getOneSignal().getUser();
    }

    public static final ISessionManager getSession() {
        return INSTANCE.getOneSignal().getSession();
    }

    public static final INotificationsManager getNotifications() {
        return INSTANCE.getOneSignal().getNotifications();
    }

    public static final ILocationManager getLocation() {
        return INSTANCE.getOneSignal().getLocation();
    }

    public static final IInAppMessagesManager getInAppMessages() {
        return INSTANCE.getOneSignal().getInAppMessages();
    }

    public static final IDebugManager getDebug() {
        return INSTANCE.getOneSignal().getDebug();
    }

    public static final boolean getConsentRequired() {
        return INSTANCE.getOneSignal().getConsentRequired();
    }

    public static final void setConsentRequired(boolean z) {
        INSTANCE.getOneSignal().setConsentRequired(z);
    }

    public static final boolean getConsentGiven() {
        return INSTANCE.getOneSignal().getConsentGiven();
    }

    public static final void setConsentGiven(boolean z) {
        INSTANCE.getOneSignal().setConsentGiven(z);
    }

    public static final boolean getDisableGMSMissingPrompt() {
        return INSTANCE.getOneSignal().getDisableGMSMissingPrompt();
    }

    public static final void setDisableGMSMissingPrompt(boolean z) {
        INSTANCE.getOneSignal().setDisableGMSMissingPrompt(z);
    }

    @JvmStatic
    public static final void initWithContext(Context context, String appId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appId, "appId");
        INSTANCE.getOneSignal().initWithContext(context, appId);
    }

    public static /* synthetic */ Object initWithContextSuspend$default(Context context, String str, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        return initWithContextSuspend(context, str, continuation);
    }

    @JvmStatic
    public static final Object initWithContextSuspend(Context context, String str, Continuation<? super Boolean> continuation) {
        return INSTANCE.getOneSignal().initWithContextSuspend(context, str, continuation);
    }

    @JvmStatic
    public static final Object getUserSuspend(Continuation<? super IUserManager> continuation) {
        return INSTANCE.getOneSignal().getUser(continuation);
    }

    @JvmStatic
    public static final Object getSessionSuspend(Continuation<? super ISessionManager> continuation) {
        return INSTANCE.getOneSignal().getSession(continuation);
    }

    @JvmStatic
    public static final Object getNotificationsSuspend(Continuation<? super INotificationsManager> continuation) {
        return INSTANCE.getOneSignal().getNotifications(continuation);
    }

    @JvmStatic
    public static final Object getLocationSuspend(Continuation<? super ILocationManager> continuation) {
        return INSTANCE.getOneSignal().getLocation(continuation);
    }

    @JvmStatic
    public static final Object getInAppMessagesSuspend(Continuation<? super IInAppMessagesManager> continuation) {
        return INSTANCE.getOneSignal().getInAppMessages(continuation);
    }

    @JvmStatic
    public static final Object getConsentRequiredSuspend(Continuation<? super Boolean> continuation) {
        return INSTANCE.getOneSignal().getConsentRequired(continuation);
    }

    @JvmStatic
    public static final Object setConsentRequiredSuspend(boolean z, Continuation<? super Unit> continuation) {
        Object consentRequired = INSTANCE.getOneSignal().setConsentRequired(z, continuation);
        return consentRequired == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? consentRequired : Unit.INSTANCE;
    }

    @JvmStatic
    public static final Object getConsentGivenSuspend(Continuation<? super Boolean> continuation) {
        return INSTANCE.getOneSignal().getConsentGiven(continuation);
    }

    @JvmStatic
    public static final Object setConsentGivenSuspend(boolean z, Continuation<? super Unit> continuation) {
        Object consentGiven = INSTANCE.getOneSignal().setConsentGiven(z, continuation);
        return consentGiven == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? consentGiven : Unit.INSTANCE;
    }

    @JvmStatic
    public static final Object getDisableGMSMissingPromptSuspend(Continuation<? super Boolean> continuation) {
        return INSTANCE.getOneSignal().getDisableGMSMissingPrompt(continuation);
    }

    @JvmStatic
    public static final Object setDisableGMSMissingPromptSuspend(boolean z, Continuation<? super Unit> continuation) {
        Object disableGMSMissingPrompt = INSTANCE.getOneSignal().setDisableGMSMissingPrompt(z, continuation);
        return disableGMSMissingPrompt == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? disableGMSMissingPrompt : Unit.INSTANCE;
    }

    @JvmStatic
    public static final void login(String externalId) {
        Intrinsics.checkNotNullParameter(externalId, "externalId");
        INSTANCE.getOneSignal().login(externalId);
    }

    public static /* synthetic */ void login$default(String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        login(str, str2);
    }

    @JvmStatic
    public static final void login(String externalId, String jwtBearerToken) {
        Intrinsics.checkNotNullParameter(externalId, "externalId");
        INSTANCE.getOneSignal().login(externalId, jwtBearerToken);
    }

    @JvmStatic
    public static final void logout() {
        INSTANCE.getOneSignal().logout();
    }

    @JvmStatic
    public static final void updateUserJwt(String externalId, String token) {
        Intrinsics.checkNotNullParameter(externalId, "externalId");
        Intrinsics.checkNotNullParameter(token, "token");
        INSTANCE.getOneSignal().updateUserJwt(externalId, token);
    }

    @JvmStatic
    public static final void addUserJwtInvalidatedListener(IUserJwtInvalidatedListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        INSTANCE.getOneSignal().addUserJwtInvalidatedListener(listener);
    }

    @JvmStatic
    public static final void removeUserJwtInvalidatedListener(IUserJwtInvalidatedListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        INSTANCE.getOneSignal().removeUserJwtInvalidatedListener(listener);
    }

    private final IOneSignal getOneSignal() {
        return (IOneSignal) oneSignal.getValue();
    }

    @JvmStatic
    public static final Object initWithContext(Context context, Continuation<? super Boolean> continuation) {
        return INSTANCE.getOneSignal().initWithContext(context, continuation);
    }

    public static /* synthetic */ Object loginSuspend$default(String str, String str2, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return loginSuspend(str, str2, continuation);
    }

    @JvmStatic
    public static final Object loginSuspend(String str, String str2, Continuation<? super Unit> continuation) {
        Object loginSuspend = INSTANCE.getOneSignal().loginSuspend(str, str2, continuation);
        return loginSuspend == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? loginSuspend : Unit.INSTANCE;
    }

    @JvmStatic
    public static final Object logoutSuspend(Continuation<? super Unit> continuation) {
        Object logoutSuspend = INSTANCE.getOneSignal().logoutSuspend(continuation);
        return logoutSuspend == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? logoutSuspend : Unit.INSTANCE;
    }

    @JvmStatic
    public static final Object updateUserJwtSuspend(String str, String str2, Continuation<? super Unit> continuation) {
        Object updateUserJwtSuspend = INSTANCE.getOneSignal().updateUserJwtSuspend(str, str2, continuation);
        return updateUserJwtSuspend == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? updateUserJwtSuspend : Unit.INSTANCE;
    }

    public final IServiceProvider getServices() {
        IOneSignal oneSignal2 = getOneSignal();
        Intrinsics.checkNotNull(oneSignal2, "null cannot be cast to non-null type com.onesignal.common.services.IServiceProvider");
        return (IServiceProvider) oneSignal2;
    }

    public final /* synthetic */ <T> T getService() {
        IServiceProvider services = getServices();
        Intrinsics.reifiedOperationMarker(4, "T");
        return (T) services.getService(Object.class);
    }

    public final /* synthetic */ <T> T getServiceOrNull() {
        IServiceProvider services = getServices();
        Intrinsics.reifiedOperationMarker(4, "T");
        return (T) services.getServiceOrNull(Object.class);
    }
}
