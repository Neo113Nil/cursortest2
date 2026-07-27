package com.onesignal;

import android.content.Context;
import com.onesignal.debug.IDebugManager;
import com.onesignal.inAppMessages.IInAppMessagesManager;
import com.onesignal.location.ILocationManager;
import com.onesignal.notifications.INotificationsManager;
import com.onesignal.session.ISessionManager;
import com.onesignal.user.IUserManager;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public interface IOneSignal {

    public static final class DefaultImpls {
        public static /* synthetic */ Object initWithContextSuspend$default(IOneSignal iOneSignal, Context context, String str, InterfaceC1218d interfaceC1218d, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initWithContextSuspend");
            }
            if ((i2 & 2) != 0) {
                str = null;
            }
            return iOneSignal.initWithContextSuspend(context, str, interfaceC1218d);
        }

        public static void login(IOneSignal iOneSignal, String externalId) {
            i.e(externalId, "externalId");
            iOneSignal.login(externalId, null);
        }

        public static /* synthetic */ void login$default(IOneSignal iOneSignal, String str, String str2, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: login");
            }
            if ((i2 & 2) != 0) {
                str2 = null;
            }
            iOneSignal.login(str, str2);
        }

        public static /* synthetic */ Object loginSuspend$default(IOneSignal iOneSignal, String str, String str2, InterfaceC1218d interfaceC1218d, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loginSuspend");
            }
            if ((i2 & 2) != 0) {
                str2 = null;
            }
            return iOneSignal.loginSuspend(str, str2, interfaceC1218d);
        }
    }

    void addUserJwtInvalidatedListener(IUserJwtInvalidatedListener iUserJwtInvalidatedListener);

    Object getConsentGiven(InterfaceC1218d interfaceC1218d);

    boolean getConsentGiven();

    Object getConsentRequired(InterfaceC1218d interfaceC1218d);

    boolean getConsentRequired();

    IDebugManager getDebug();

    Object getDisableGMSMissingPrompt(InterfaceC1218d interfaceC1218d);

    boolean getDisableGMSMissingPrompt();

    IInAppMessagesManager getInAppMessages();

    Object getInAppMessages(InterfaceC1218d interfaceC1218d);

    ILocationManager getLocation();

    Object getLocation(InterfaceC1218d interfaceC1218d);

    INotificationsManager getNotifications();

    Object getNotifications(InterfaceC1218d interfaceC1218d);

    String getSdkVersion();

    ISessionManager getSession();

    Object getSession(InterfaceC1218d interfaceC1218d);

    IUserManager getUser();

    Object getUser(InterfaceC1218d interfaceC1218d);

    Object initWithContext(Context context, InterfaceC1218d interfaceC1218d);

    boolean initWithContext(Context context, String str);

    Object initWithContextSuspend(Context context, String str, InterfaceC1218d interfaceC1218d);

    boolean isInitialized();

    void login(String str);

    void login(String str, String str2);

    Object loginSuspend(String str, String str2, InterfaceC1218d interfaceC1218d);

    void logout();

    Object logoutSuspend(InterfaceC1218d interfaceC1218d);

    void removeUserJwtInvalidatedListener(IUserJwtInvalidatedListener iUserJwtInvalidatedListener);

    Object setConsentGiven(boolean z, InterfaceC1218d interfaceC1218d);

    void setConsentGiven(boolean z);

    Object setConsentRequired(boolean z, InterfaceC1218d interfaceC1218d);

    void setConsentRequired(boolean z);

    Object setDisableGMSMissingPrompt(boolean z, InterfaceC1218d interfaceC1218d);

    void setDisableGMSMissingPrompt(boolean z);

    void updateUserJwt(String str, String str2);

    Object updateUserJwtSuspend(String str, String str2, InterfaceC1218d interfaceC1218d);
}
