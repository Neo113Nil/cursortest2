package com.onesignal.notifications.internal.registration.impl;

import android.util.Base64;
import c7.c0;
import com.google.firebase.messaging.FirebaseMessaging;
import g8.i;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.Charsets;
import w7.n;
import z4.w;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class f extends e {
    public static final a Companion = new a(null);
    private static final String FCM_APP_NAME = "ONESIGNAL_SDK_FCM_APP_NAME";
    private static final String FCM_DEFAULT_API_KEY_BASE64 = "QUl6YVN5QW5UTG41LV80TWMyYTJQLWRLVWVFLWFCdGd5Q3JqbFlV";
    private static final String FCM_DEFAULT_APP_ID = "1:754795614042:android:c682b8144a8dd52bc1ad63";
    private static final String FCM_DEFAULT_PROJECT_ID = "onesignal-shared-public";
    private final ea.f _applicationService;
    private com.onesignal.core.internal.config.b _configModelStore;
    private final String apiKey;
    private final String appId;
    private g8.g firebaseApp;
    private final String projectId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.onesignal.core.internal.config.b bVar, ea.f fVar, com.onesignal.notifications.internal.registration.impl.a aVar, ja.c cVar) {
        super(cVar, bVar, aVar);
        bVar.getClass();
        fVar.getClass();
        aVar.getClass();
        cVar.getClass();
        this._configModelStore = bVar;
        this._applicationService = fVar;
        com.onesignal.core.internal.config.c fcmParams = ((com.onesignal.core.internal.config.a) bVar.getModel()).getFcmParams();
        String projectId = fcmParams.getProjectId();
        this.projectId = projectId == null ? FCM_DEFAULT_PROJECT_ID : projectId;
        String appId = fcmParams.getAppId();
        this.appId = appId == null ? FCM_DEFAULT_APP_ID : appId;
        byte[] decode = Base64.decode(FCM_DEFAULT_API_KEY_BASE64, 0);
        decode.getClass();
        String str = new String(decode, Charsets.UTF_8);
        String apiKey = fcmParams.getApiKey();
        this.apiKey = apiKey != null ? apiKey : str;
    }

    private final String getTokenWithClassFirebaseMessaging() {
        n nVar;
        g8.g gVar = this.firebaseApp;
        gVar.getClass();
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) gVar.b(FirebaseMessaging.class);
        if (firebaseMessaging.f3081d.o()) {
            nVar = w.p(new IllegalStateException("API disabled. Please use {@link #register()} instead or enable this API by removing {@code <meta-data android:name=\"firebase_messaging_installation_id_enabled\" android:value=\"true\" />} from your app's manifest."));
        } else {
            w7.g gVar2 = new w7.g();
            firebaseMessaging.g.execute(new a6.f(2, firebaseMessaging, gVar2));
            nVar = gVar2.f10117a;
        }
        nVar.getClass();
        try {
            Object f3 = w.f(nVar);
            f3.getClass();
            return (String) f3;
        } catch (ExecutionException e2) {
            Exception exception = nVar.getException();
            if (exception == null) {
                throw e2;
            }
            throw exception;
        }
    }

    private final void initFirebaseApp(String str) {
        if (this.firebaseApp != null) {
            return;
        }
        String str2 = this.appId;
        c0.e(str2, "ApplicationId must be set.");
        String str3 = this.apiKey;
        c0.e(str3, "ApiKey must be set.");
        this.firebaseApp = g8.g.g(this._applicationService.getAppContext(), new i(str2, str3, null, null, str, null, null, this.projectId), FCM_APP_NAME);
    }

    @Override // com.onesignal.notifications.internal.registration.impl.e
    public String getProviderName() {
        return "FCM";
    }

    @Override // com.onesignal.notifications.internal.registration.impl.e
    public Object getToken(String str, ld.a aVar) {
        initFirebaseApp(str);
        return getTokenWithClassFirebaseMessaging();
    }

    public final ea.f get_applicationService() {
        return this._applicationService;
    }

    public final com.onesignal.core.internal.config.b get_configModelStore() {
        return this._configModelStore;
    }

    public final void set_configModelStore(com.onesignal.core.internal.config.b bVar) {
        bVar.getClass();
        this._configModelStore = bVar;
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
