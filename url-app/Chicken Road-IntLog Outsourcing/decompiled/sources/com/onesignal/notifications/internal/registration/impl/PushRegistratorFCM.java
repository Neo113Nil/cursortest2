package com.onesignal.notifications.internal.registration.impl;

import B0.f;
import B3.c;
import I1.h;
import I1.o;
import K1.g;
import android.util.Base64;
import com.google.firebase.messaging.FirebaseMessaging;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.core.internal.config.ConfigModelStore;
import com.onesignal.core.internal.config.FCMConfigModel;
import com.onesignal.core.internal.device.IDeviceService;
import java.util.concurrent.ExecutionException;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import o1.u;

/* loaded from: classes.dex */
public final class PushRegistratorFCM extends PushRegistratorAbstractGoogle {
    public static final Companion Companion = new Companion(null);
    private static final String FCM_APP_NAME = "ONESIGNAL_SDK_FCM_APP_NAME";
    private static final String FCM_DEFAULT_API_KEY_BASE64 = "QUl6YVN5QW5UTG41LV80TWMyYTJQLWRLVWVFLWFCdGd5Q3JqbFlV";
    private static final String FCM_DEFAULT_APP_ID = "1:754795614042:android:c682b8144a8dd52bc1ad63";
    private static final String FCM_DEFAULT_PROJECT_ID = "onesignal-shared-public";
    private final IApplicationService _applicationService;
    private ConfigModelStore _configModelStore;
    private final String apiKey;
    private final String appId;
    private g firebaseApp;
    private final String projectId;

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PushRegistratorFCM(ConfigModelStore _configModelStore, IApplicationService _applicationService, GooglePlayServicesUpgradePrompt upgradePrompt, IDeviceService deviceService) {
        super(deviceService, _configModelStore, upgradePrompt);
        i.e(_configModelStore, "_configModelStore");
        i.e(_applicationService, "_applicationService");
        i.e(upgradePrompt, "upgradePrompt");
        i.e(deviceService, "deviceService");
        this._configModelStore = _configModelStore;
        this._applicationService = _applicationService;
        FCMConfigModel fcmParams = _configModelStore.getModel().getFcmParams();
        String projectId = fcmParams.getProjectId();
        this.projectId = projectId == null ? FCM_DEFAULT_PROJECT_ID : projectId;
        String appId = fcmParams.getAppId();
        this.appId = appId == null ? FCM_DEFAULT_APP_ID : appId;
        byte[] decode = Base64.decode(FCM_DEFAULT_API_KEY_BASE64, 0);
        i.d(decode, "decode(...)");
        String str = new String(decode, B4.a.f287a);
        String apiKey = fcmParams.getApiKey();
        this.apiKey = apiKey != null ? apiKey : str;
    }

    private final String getTokenWithClassFirebaseMessaging() {
        g gVar = this.firebaseApp;
        i.b(gVar);
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) gVar.b(FirebaseMessaging.class);
        firebaseMessaging.getClass();
        h hVar = new h();
        firebaseMessaging.f5327f.execute(new c(firebaseMessaging, 13, hVar));
        o oVar = hVar.f1248a;
        i.d(oVar, "getToken(...)");
        try {
            Object b6 = f.b(oVar);
            i.d(b6, "await(...)");
            return (String) b6;
        } catch (ExecutionException e3) {
            Exception b7 = oVar.b();
            if (b7 == null) {
                throw e3;
            }
            throw b7;
        }
    }

    private final void initFirebaseApp(String str) {
        if (this.firebaseApp != null) {
            return;
        }
        String str2 = this.appId;
        u.d(str2, "ApplicationId must be set.");
        String str3 = this.apiKey;
        u.d(str3, "ApiKey must be set.");
        this.firebaseApp = g.f(new K1.i(str2, str3, null, null, str, null, this.projectId), this._applicationService.getAppContext(), FCM_APP_NAME);
    }

    @Override // com.onesignal.notifications.internal.registration.impl.PushRegistratorAbstractGoogle
    public String getProviderName() {
        return "FCM";
    }

    @Override // com.onesignal.notifications.internal.registration.impl.PushRegistratorAbstractGoogle
    public Object getToken(String str, InterfaceC1218d interfaceC1218d) {
        initFirebaseApp(str);
        return getTokenWithClassFirebaseMessaging();
    }

    public final IApplicationService get_applicationService() {
        return this._applicationService;
    }

    public final ConfigModelStore get_configModelStore() {
        return this._configModelStore;
    }

    public final void set_configModelStore(ConfigModelStore configModelStore) {
        i.e(configModelStore, "<set-?>");
        this._configModelStore = configModelStore;
    }
}
