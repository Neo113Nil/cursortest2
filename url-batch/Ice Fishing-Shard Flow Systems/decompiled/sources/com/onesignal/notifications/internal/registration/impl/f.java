package com.onesignal.notifications.internal.registration.impl;

import A.j;
import K1.p;
import android.util.Base64;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import t1.u;
import z1.AbstractC1053a;

/* loaded from: classes.dex */
public final class f extends e {
    public static final a Companion = new a(null);
    private static final String FCM_APP_NAME = "ONESIGNAL_SDK_FCM_APP_NAME";
    private static final String FCM_DEFAULT_API_KEY_BASE64 = "QUl6YVN5QW5UTG41LV80TWMyYTJQLWRLVWVFLWFCdGd5Q3JqbFlV";
    private static final String FCM_DEFAULT_APP_ID = "1:754795614042:android:c682b8144a8dd52bc1ad63";
    private static final String FCM_DEFAULT_PROJECT_ID = "onesignal-shared-public";
    private final v2.f _applicationService;
    private com.onesignal.core.internal.config.c _configModelStore;
    private final String apiKey;
    private final String appId;
    private P1.g firebaseApp;
    private final String projectId;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.onesignal.core.internal.config.c _configModelStore, v2.f _applicationService, com.onesignal.notifications.internal.registration.impl.a upgradePrompt, A2.c deviceService) {
        super(deviceService, _configModelStore, upgradePrompt);
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(upgradePrompt, "upgradePrompt");
        Intrinsics.checkNotNullParameter(deviceService, "deviceService");
        this._configModelStore = _configModelStore;
        this._applicationService = _applicationService;
        com.onesignal.core.internal.config.d fcmParams = ((com.onesignal.core.internal.config.b) _configModelStore.getModel()).getFcmParams();
        String projectId = fcmParams.getProjectId();
        this.projectId = projectId == null ? FCM_DEFAULT_PROJECT_ID : projectId;
        String appId = fcmParams.getAppId();
        this.appId = appId == null ? FCM_DEFAULT_APP_ID : appId;
        byte[] decode = Base64.decode(FCM_DEFAULT_API_KEY_BASE64, 0);
        Intrinsics.checkNotNullExpressionValue(decode, "decode(...)");
        String str = new String(decode, Charsets.UTF_8);
        String apiKey = fcmParams.getApiKey();
        this.apiKey = apiKey != null ? apiKey : str;
    }

    private final String getTokenWithClassFirebaseMessaging() {
        p pVar;
        P1.g gVar = this.firebaseApp;
        Intrinsics.b(gVar);
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) gVar.c(FirebaseMessaging.class);
        if (firebaseMessaging.f4441d.c()) {
            pVar = AbstractC1053a.v(new IllegalStateException("API disabled. Please use {@link #register()} instead or enable this API by removing {@code <meta-data android:name=\"firebase_messaging_installation_id_enabled\" android:value=\"true\" />} from your app's manifest."));
        } else {
            K1.h hVar = new K1.h();
            firebaseMessaging.f4444g.execute(new j(firebaseMessaging, 16, hVar));
            pVar = hVar.f1428a;
        }
        Intrinsics.checkNotNullExpressionValue(pVar, "getToken(...)");
        try {
            Object e7 = AbstractC1053a.e(pVar);
            Intrinsics.checkNotNullExpressionValue(e7, "await(...)");
            return (String) e7;
        } catch (ExecutionException e8) {
            Exception exception = pVar.getException();
            if (exception == null) {
                throw e8;
            }
            throw exception;
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
        P1.h hVar = new P1.h(str2, str3, null, null, str, null, null, this.projectId);
        Intrinsics.checkNotNullExpressionValue(hVar, "build(...)");
        this.firebaseApp = P1.g.i(hVar, this._applicationService.getAppContext(), FCM_APP_NAME);
    }

    @Override // com.onesignal.notifications.internal.registration.impl.e
    public String getProviderName() {
        return "FCM";
    }

    @Override // com.onesignal.notifications.internal.registration.impl.e
    public Object getToken(String str, V5.b bVar) {
        initFirebaseApp(str);
        return getTokenWithClassFirebaseMessaging();
    }

    public final v2.f get_applicationService() {
        return this._applicationService;
    }

    public final com.onesignal.core.internal.config.c get_configModelStore() {
        return this._configModelStore;
    }

    public final void set_configModelStore(com.onesignal.core.internal.config.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this._configModelStore = cVar;
    }
}
