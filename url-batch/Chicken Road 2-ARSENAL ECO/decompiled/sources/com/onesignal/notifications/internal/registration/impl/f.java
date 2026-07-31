package com.onesignal.notifications.internal.registration.impl;

import U0.t;
import a.AbstractC0219a;
import android.util.Base64;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.concurrent.ExecutionException;
import k1.n;
import kotlin.jvm.internal.i;
import o5.InterfaceC0564d;

/* loaded from: classes.dex */
public final class f extends e {
    public static final a Companion = new a(null);
    private static final String FCM_APP_NAME = "ONESIGNAL_SDK_FCM_APP_NAME";
    private static final String FCM_DEFAULT_API_KEY_BASE64 = "QUl6YVN5QW5UTG41LV80TWMyYTJQLWRLVWVFLWFCdGd5Q3JqbFlV";
    private static final String FCM_DEFAULT_APP_ID = "1:754795614042:android:c682b8144a8dd52bc1ad63";
    private static final String FCM_DEFAULT_PROJECT_ID = "onesignal-shared-public";
    private final T1.f _applicationService;
    private com.onesignal.core.internal.config.c _configModelStore;
    private final String apiKey;
    private final String appId;
    private m1.g firebaseApp;
    private final String projectId;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.onesignal.core.internal.config.c _configModelStore, T1.f _applicationService, com.onesignal.notifications.internal.registration.impl.a upgradePrompt, Y1.c deviceService) {
        super(deviceService, _configModelStore, upgradePrompt);
        i.e(_configModelStore, "_configModelStore");
        i.e(_applicationService, "_applicationService");
        i.e(upgradePrompt, "upgradePrompt");
        i.e(deviceService, "deviceService");
        this._configModelStore = _configModelStore;
        this._applicationService = _applicationService;
        com.onesignal.core.internal.config.d fcmParams = ((com.onesignal.core.internal.config.b) _configModelStore.getModel()).getFcmParams();
        String projectId = fcmParams.getProjectId();
        this.projectId = projectId == null ? FCM_DEFAULT_PROJECT_ID : projectId;
        String appId = fcmParams.getAppId();
        this.appId = appId == null ? FCM_DEFAULT_APP_ID : appId;
        byte[] decode = Base64.decode(FCM_DEFAULT_API_KEY_BASE64, 0);
        i.d(decode, "decode(...)");
        String str = new String(decode, F5.a.f785a);
        String apiKey = fcmParams.getApiKey();
        this.apiKey = apiKey != null ? apiKey : str;
    }

    private final String getTokenWithClassFirebaseMessaging() {
        m1.g gVar = this.firebaseApp;
        i.b(gVar);
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) gVar.b(FirebaseMessaging.class);
        firebaseMessaging.getClass();
        k1.h hVar = new k1.h();
        firebaseMessaging.f3906f.execute(new G4.c(firebaseMessaging, 1, hVar));
        n nVar = hVar.f5157a;
        i.d(nVar, "getToken(...)");
        try {
            Object c7 = AbstractC0219a.c(nVar);
            i.d(c7, "await(...)");
            return (String) c7;
        } catch (ExecutionException e4) {
            Exception e7 = nVar.e();
            if (e7 == null) {
                throw e4;
            }
            throw e7;
        }
    }

    private final void initFirebaseApp(String str) {
        if (this.firebaseApp != null) {
            return;
        }
        String str2 = this.appId;
        t.d(str2, "ApplicationId must be set.");
        String str3 = this.apiKey;
        t.d(str3, "ApiKey must be set.");
        this.firebaseApp = m1.g.g(this._applicationService.getAppContext(), FCM_APP_NAME, new m1.i(str2, str3, null, null, str, null, this.projectId));
    }

    @Override // com.onesignal.notifications.internal.registration.impl.e
    public String getProviderName() {
        return "FCM";
    }

    @Override // com.onesignal.notifications.internal.registration.impl.e
    public Object getToken(String str, InterfaceC0564d interfaceC0564d) {
        initFirebaseApp(str);
        return getTokenWithClassFirebaseMessaging();
    }

    public final T1.f get_applicationService() {
        return this._applicationService;
    }

    public final com.onesignal.core.internal.config.c get_configModelStore() {
        return this._configModelStore;
    }

    public final void set_configModelStore(com.onesignal.core.internal.config.c cVar) {
        i.e(cVar, "<set-?>");
        this._configModelStore = cVar;
    }
}
