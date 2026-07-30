package com.google.firebase;

import android.content.Context;
import android.text.TextUtils;
import defpackage.ll3;
import defpackage.lp2;
import defpackage.tt1;
import java.util.Arrays;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class FirebaseOptions {
    private static final String API_KEY_RESOURCE_NAME = "google_api_key";
    private static final String APP_ID_RESOURCE_NAME = "google_app_id";
    private static final String DATABASE_URL_RESOURCE_NAME = "firebase_database_url";
    private static final String GA_TRACKING_ID_RESOURCE_NAME = "ga_trackingId";
    private static final String GCM_SENDER_ID_RESOURCE_NAME = "gcm_defaultSenderId";
    private static final String PROJECT_ID_RESOURCE_NAME = "project_id";
    private static final String STORAGE_BUCKET_RESOURCE_NAME = "google_storage_bucket";
    private final String apiKey;
    private final String applicationId;
    private final String databaseUrl;
    private final String gaTrackingId;
    private final String gcmSenderId;
    private final String projectId;
    private final String storageBucket;

    private FirebaseOptions(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        int i = lp2.a;
        ll3.x(true ^ (str == null || str.trim().isEmpty()), "ApplicationId must be set.");
        this.applicationId = str;
        this.apiKey = str2;
        this.databaseUrl = str3;
        this.gaTrackingId = str4;
        this.gcmSenderId = str5;
        this.storageBucket = str6;
        this.projectId = str7;
    }

    public static FirebaseOptions fromResource(Context context) {
        tt1 tt1Var = new tt1(context);
        String o = tt1Var.o(APP_ID_RESOURCE_NAME);
        if (TextUtils.isEmpty(o)) {
            return null;
        }
        return new FirebaseOptions(o, tt1Var.o(API_KEY_RESOURCE_NAME), tt1Var.o(DATABASE_URL_RESOURCE_NAME), tt1Var.o(GA_TRACKING_ID_RESOURCE_NAME), tt1Var.o(GCM_SENDER_ID_RESOURCE_NAME), tt1Var.o(STORAGE_BUCKET_RESOURCE_NAME), tt1Var.o(PROJECT_ID_RESOURCE_NAME));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof FirebaseOptions)) {
            return false;
        }
        FirebaseOptions firebaseOptions = (FirebaseOptions) obj;
        return ll3.C(this.applicationId, firebaseOptions.applicationId) && ll3.C(this.apiKey, firebaseOptions.apiKey) && ll3.C(this.databaseUrl, firebaseOptions.databaseUrl) && ll3.C(this.gaTrackingId, firebaseOptions.gaTrackingId) && ll3.C(this.gcmSenderId, firebaseOptions.gcmSenderId) && ll3.C(this.storageBucket, firebaseOptions.storageBucket) && ll3.C(this.projectId, firebaseOptions.projectId);
    }

    public String getApiKey() {
        return this.apiKey;
    }

    public String getApplicationId() {
        return this.applicationId;
    }

    public String getDatabaseUrl() {
        return this.databaseUrl;
    }

    public String getGaTrackingId() {
        return this.gaTrackingId;
    }

    public String getGcmSenderId() {
        return this.gcmSenderId;
    }

    public String getProjectId() {
        return this.projectId;
    }

    public String getStorageBucket() {
        return this.storageBucket;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.applicationId, this.apiKey, this.databaseUrl, this.gaTrackingId, this.gcmSenderId, this.storageBucket, this.projectId});
    }

    public String toString() {
        tt1 tt1Var = new tt1(this);
        tt1Var.k(this.applicationId, "applicationId");
        tt1Var.k(this.apiKey, "apiKey");
        tt1Var.k(this.databaseUrl, "databaseUrl");
        tt1Var.k(this.gcmSenderId, "gcmSenderId");
        tt1Var.k(this.storageBucket, "storageBucket");
        tt1Var.k(this.projectId, "projectId");
        return tt1Var.toString();
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Builder {
        private String apiKey;
        private String applicationId;
        private String databaseUrl;
        private String gaTrackingId;
        private String gcmSenderId;
        private String projectId;
        private String storageBucket;

        public Builder(FirebaseOptions firebaseOptions) {
            this.applicationId = firebaseOptions.applicationId;
            this.apiKey = firebaseOptions.apiKey;
            this.databaseUrl = firebaseOptions.databaseUrl;
            this.gaTrackingId = firebaseOptions.gaTrackingId;
            this.gcmSenderId = firebaseOptions.gcmSenderId;
            this.storageBucket = firebaseOptions.storageBucket;
            this.projectId = firebaseOptions.projectId;
        }

        public FirebaseOptions build() {
            return new FirebaseOptions(this.applicationId, this.apiKey, this.databaseUrl, this.gaTrackingId, this.gcmSenderId, this.storageBucket, this.projectId);
        }

        public Builder setApiKey(String str) {
            ll3.t(str, "ApiKey must be set.");
            this.apiKey = str;
            return this;
        }

        public Builder setApplicationId(String str) {
            ll3.t(str, "ApplicationId must be set.");
            this.applicationId = str;
            return this;
        }

        public Builder setDatabaseUrl(String str) {
            this.databaseUrl = str;
            return this;
        }

        public Builder setGaTrackingId(String str) {
            this.gaTrackingId = str;
            return this;
        }

        public Builder setGcmSenderId(String str) {
            this.gcmSenderId = str;
            return this;
        }

        public Builder setProjectId(String str) {
            this.projectId = str;
            return this;
        }

        public Builder setStorageBucket(String str) {
            this.storageBucket = str;
            return this;
        }

        public Builder() {
        }
    }
}
