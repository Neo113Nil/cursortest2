package com.onesignal;

import android.content.Context;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.onesignal.core.BuildConfig;
import com.onesignal.debug.IDebugManager;
import com.onesignal.inAppMessages.IInAppMessagesManager;
import com.onesignal.inAppMessages.internal.prompt.InAppMessagePromptTypes;
import com.onesignal.location.ILocationManager;
import com.onesignal.notifications.INotificationsManager;
import com.onesignal.session.ISessionManager;
import com.onesignal.session.internal.outcomes.impl.OutcomeEventsTable;
import com.onesignal.user.IUserManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IOneSignal.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\bf\u0018\u00002\u00020\u0001J\u0010\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H&J\u000e\u0010\u0004\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010/J\u000e\u0010\t\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010/J\u000e\u0010\u0010\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010/J\u000e\u0010\u0014\u001a\u00020\u0013H¦@¢\u0006\u0002\u0010/J\u000e\u0010\u0019\u001a\u00020\u0018H¦@¢\u0006\u0002\u0010/J\u000e\u0010\u001d\u001a\u00020\u001cH¦@¢\u0006\u0002\u0010/J\u000e\u0010%\u001a\u00020$H¦@¢\u0006\u0002\u0010/J\u000e\u0010)\u001a\u00020(H¦@¢\u0006\u0002\u0010/J\u0016\u00100\u001a\u00020\u00032\u0006\u00101\u001a\u000202H¦@¢\u0006\u0002\u00103J\u0018\u00100\u001a\u00020\u00032\u0006\u00101\u001a\u0002022\u0006\u00104\u001a\u00020 H&J\"\u00105\u001a\u00020\u00032\u0006\u00101\u001a\u0002022\n\b\u0002\u00104\u001a\u0004\u0018\u00010 H¦@¢\u0006\u0002\u00106J\u0010\u00107\u001a\u00020,2\u0006\u00108\u001a\u00020 H\u0016J\u001c\u00107\u001a\u00020,2\u0006\u00108\u001a\u00020 2\n\b\u0002\u00109\u001a\u0004\u0018\u00010 H&J\"\u0010:\u001a\u00020,2\u0006\u00108\u001a\u00020 2\n\b\u0002\u00109\u001a\u0004\u0018\u00010 H¦@¢\u0006\u0002\u0010;J\b\u0010<\u001a\u00020,H&J\u000e\u0010=\u001a\u00020,H¦@¢\u0006\u0002\u0010/J\u0010\u0010>\u001a\u00020,2\u0006\u0010-\u001a\u00020.H&J\u0016\u0010\u0006\u001a\u00020,2\u0006\u0010?\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010@J\u0016\u0010\n\u001a\u00020,2\u0006\u0010A\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010@J\u0016\u0010\u0011\u001a\u00020,2\u0006\u0010?\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010@J\u0018\u0010B\u001a\u00020,2\u0006\u00108\u001a\u00020 2\u0006\u0010C\u001a\u00020 H&J\u001e\u0010D\u001a\u00020,2\u0006\u00108\u001a\u00020 2\u0006\u0010C\u001a\u00020 H¦@¢\u0006\u0002\u0010;R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\u0005\"\u0004\b\n\u0010\u0007R\u0012\u0010\u000b\u001a\u00020\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u000f\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0005\"\u0004\b\u0011\u0010\u0007R\u0012\u0010\u0012\u001a\u00020\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0012\u0010\u0016\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0005R\u0012\u0010\u0017\u001a\u00020\u0018X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0012\u0010\u001b\u001a\u00020\u001cX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0012\u0010\u001f\u001a\u00020 X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0012\u0010#\u001a\u00020$X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0012\u0010'\u001a\u00020(X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006E"}, d2 = {"Lcom/onesignal/IOneSignal;", "", "consentGiven", "", "getConsentGiven", "()Z", "setConsentGiven", "(Z)V", "consentRequired", "getConsentRequired", "setConsentRequired", "debug", "Lcom/onesignal/debug/IDebugManager;", "getDebug", "()Lcom/onesignal/debug/IDebugManager;", "disableGMSMissingPrompt", "getDisableGMSMissingPrompt", "setDisableGMSMissingPrompt", "inAppMessages", "Lcom/onesignal/inAppMessages/IInAppMessagesManager;", "getInAppMessages", "()Lcom/onesignal/inAppMessages/IInAppMessagesManager;", "isInitialized", InAppMessagePromptTypes.LOCATION_PROMPT_KEY, "Lcom/onesignal/location/ILocationManager;", "getLocation", "()Lcom/onesignal/location/ILocationManager;", "notifications", "Lcom/onesignal/notifications/INotificationsManager;", "getNotifications", "()Lcom/onesignal/notifications/INotificationsManager;", "sdkVersion", "", "getSdkVersion", "()Ljava/lang/String;", OutcomeEventsTable.COLUMN_NAME_SESSION, "Lcom/onesignal/session/ISessionManager;", "getSession", "()Lcom/onesignal/session/ISessionManager;", "user", "Lcom/onesignal/user/IUserManager;", "getUser", "()Lcom/onesignal/user/IUserManager;", "addUserJwtInvalidatedListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/onesignal/IUserJwtInvalidatedListener;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initWithContext", "context", "Landroid/content/Context;", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "appId", "initWithContextSuspend", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "login", "externalId", "jwtBearerToken", "loginSuspend", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logout", "logoutSuspend", "removeUserJwtInvalidatedListener", "value", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "required", "updateUserJwt", "token", "updateUserJwtSuspend", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface IOneSignal {
    void addUserJwtInvalidatedListener(IUserJwtInvalidatedListener listener);

    Object getConsentGiven(Continuation<? super Boolean> continuation);

    boolean getConsentGiven();

    Object getConsentRequired(Continuation<? super Boolean> continuation);

    boolean getConsentRequired();

    IDebugManager getDebug();

    Object getDisableGMSMissingPrompt(Continuation<? super Boolean> continuation);

    boolean getDisableGMSMissingPrompt();

    IInAppMessagesManager getInAppMessages();

    Object getInAppMessages(Continuation<? super IInAppMessagesManager> continuation);

    ILocationManager getLocation();

    Object getLocation(Continuation<? super ILocationManager> continuation);

    INotificationsManager getNotifications();

    Object getNotifications(Continuation<? super INotificationsManager> continuation);

    String getSdkVersion();

    ISessionManager getSession();

    Object getSession(Continuation<? super ISessionManager> continuation);

    IUserManager getUser();

    Object getUser(Continuation<? super IUserManager> continuation);

    Object initWithContext(Context context, Continuation<? super Boolean> continuation);

    boolean initWithContext(Context context, String appId);

    Object initWithContextSuspend(Context context, String str, Continuation<? super Boolean> continuation);

    boolean isInitialized();

    void login(String externalId);

    void login(String externalId, String jwtBearerToken);

    Object loginSuspend(String str, String str2, Continuation<? super Unit> continuation);

    void logout();

    Object logoutSuspend(Continuation<? super Unit> continuation);

    void removeUserJwtInvalidatedListener(IUserJwtInvalidatedListener listener);

    Object setConsentGiven(boolean z, Continuation<? super Unit> continuation);

    void setConsentGiven(boolean z);

    Object setConsentRequired(boolean z, Continuation<? super Unit> continuation);

    void setConsentRequired(boolean z);

    Object setDisableGMSMissingPrompt(boolean z, Continuation<? super Unit> continuation);

    void setDisableGMSMissingPrompt(boolean z);

    void updateUserJwt(String externalId, String token);

    Object updateUserJwtSuspend(String str, String str2, Continuation<? super Unit> continuation);

    /* compiled from: IOneSignal.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void login$default(IOneSignal iOneSignal, String str, String str2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: login");
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            iOneSignal.login(str, str2);
        }

        public static void login(IOneSignal iOneSignal, String externalId) {
            Intrinsics.checkNotNullParameter(externalId, "externalId");
            iOneSignal.login(externalId, null);
        }

        public static /* synthetic */ Object initWithContextSuspend$default(IOneSignal iOneSignal, Context context, String str, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initWithContextSuspend");
            }
            if ((i & 2) != 0) {
                str = null;
            }
            return iOneSignal.initWithContextSuspend(context, str, continuation);
        }

        public static /* synthetic */ Object loginSuspend$default(IOneSignal iOneSignal, String str, String str2, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loginSuspend");
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            return iOneSignal.loginSuspend(str, str2, continuation);
        }
    }
}
