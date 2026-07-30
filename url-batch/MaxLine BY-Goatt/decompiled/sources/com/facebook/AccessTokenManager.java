package com.facebook;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.facebook.AccessToken;
import com.facebook.AccessTokenManager;
import com.facebook.GraphRequest;
import com.facebook.GraphRequestBatch;
import com.facebook.GraphResponse;
import com.facebook.a;
import com.facebook.appevents.AppEventQueue;
import com.facebook.appevents.FlushReason;
import com.facebook.b;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.internal.Utility;
import defpackage.kf1;
import defpackage.m;
import defpackage.n1;
import defpackage.q1;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class AccessTokenManager {
    public static final String ACTION_CURRENT_ACCESS_TOKEN_CHANGED = "com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED";
    public static final Companion Companion = new Companion(null);
    public static final String EXTRA_NEW_ACCESS_TOKEN = "com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN";
    public static final String EXTRA_OLD_ACCESS_TOKEN = "com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN";
    private static final String ME_PERMISSIONS_GRAPH_PATH = "me/permissions";
    public static final String SHARED_PREFERENCES_NAME = "com.facebook.AccessTokenManager.SharedPreferences";
    public static final String TAG = "AccessTokenManager";
    private static final int TOKEN_EXTEND_RETRY_SECONDS = 3600;
    private static final int TOKEN_EXTEND_THRESHOLD_SECONDS = 86400;
    private static AccessTokenManager instanceField;
    private final AccessTokenCache accessTokenCache;
    private AccessToken currentAccessTokenField;
    private Date lastAttemptedTokenExtendDate;
    private final kf1 localBroadcastManager;
    private final AtomicBoolean tokenRefreshInProgress;

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class FacebookRefreshTokenInfo implements RefreshTokenInfo {
        private final String graphPath = "oauth/access_token";
        private final String grantType = "fb_extend_sso_token";

        @Override // com.facebook.AccessTokenManager.RefreshTokenInfo
        public String getGrantType() {
            return this.grantType;
        }

        @Override // com.facebook.AccessTokenManager.RefreshTokenInfo
        public String getGraphPath() {
            return this.graphPath;
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class InstagramRefreshTokenInfo implements RefreshTokenInfo {
        private final String graphPath = "refresh_access_token";
        private final String grantType = "ig_refresh_token";

        @Override // com.facebook.AccessTokenManager.RefreshTokenInfo
        public String getGrantType() {
            return this.grantType;
        }

        @Override // com.facebook.AccessTokenManager.RefreshTokenInfo
        public String getGraphPath() {
            return this.graphPath;
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class RefreshResult {
        private String accessToken;
        private Long dataAccessExpirationTime;
        private int expiresAt;
        private int expiresIn;
        private String graphDomain;

        public final String getAccessToken() {
            return this.accessToken;
        }

        public final Long getDataAccessExpirationTime() {
            return this.dataAccessExpirationTime;
        }

        public final int getExpiresAt() {
            return this.expiresAt;
        }

        public final int getExpiresIn() {
            return this.expiresIn;
        }

        public final String getGraphDomain() {
            return this.graphDomain;
        }

        public final void setAccessToken(String str) {
            this.accessToken = str;
        }

        public final void setDataAccessExpirationTime(Long l) {
            this.dataAccessExpirationTime = l;
        }

        public final void setExpiresAt(int i) {
            this.expiresAt = i;
        }

        public final void setExpiresIn(int i) {
            this.expiresIn = i;
        }

        public final void setGraphDomain(String str) {
            this.graphDomain = str;
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public interface RefreshTokenInfo {
        String getGrantType();

        String getGraphPath();
    }

    public AccessTokenManager(kf1 kf1Var, AccessTokenCache accessTokenCache) {
        kf1Var.getClass();
        accessTokenCache.getClass();
        this.localBroadcastManager = kf1Var;
        this.accessTokenCache = accessTokenCache;
        this.tokenRefreshInProgress = new AtomicBoolean(false);
        this.lastAttemptedTokenExtendDate = new Date(0L);
    }

    public static final AccessTokenManager getInstance() {
        return Companion.getInstance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void refreshCurrentAccessToken$lambda$1(AccessTokenManager accessTokenManager, AccessToken.AccessTokenRefreshCallback accessTokenRefreshCallback) {
        accessTokenManager.getClass();
        accessTokenManager.refreshCurrentAccessTokenImpl(accessTokenRefreshCallback);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.facebook.b] */
    private final void refreshCurrentAccessTokenImpl(final AccessToken.AccessTokenRefreshCallback accessTokenRefreshCallback) {
        final AccessToken currentAccessToken = getCurrentAccessToken();
        if (currentAccessToken == null) {
            if (accessTokenRefreshCallback != null) {
                accessTokenRefreshCallback.OnTokenRefreshFailed(new FacebookException("No current access token to refresh"));
                return;
            }
            return;
        }
        final int i = 0;
        final int i2 = 1;
        if (!this.tokenRefreshInProgress.compareAndSet(false, true)) {
            if (accessTokenRefreshCallback != null) {
                accessTokenRefreshCallback.OnTokenRefreshFailed(new FacebookException("Refresh already in progress"));
                return;
            }
            return;
        }
        this.lastAttemptedTokenExtendDate = new Date();
        final HashSet hashSet = new HashSet();
        final HashSet hashSet2 = new HashSet();
        final HashSet hashSet3 = new HashSet();
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final RefreshResult refreshResult = new RefreshResult();
        final n1 n1Var = new n1(atomicBoolean, hashSet, hashSet2, hashSet3, 0);
        final GraphRequest.Callback callback = new GraphRequest.Callback() { // from class: com.facebook.a
            @Override // com.facebook.GraphRequest.Callback
            public final void onCompleted(GraphResponse graphResponse) {
                AccessTokenManager.refreshCurrentAccessTokenImpl$lambda$3(AccessTokenManager.RefreshResult.this, graphResponse);
            }
        };
        final ?? r0 = new Runnable() { // from class: com.facebook.b
            @Override // java.lang.Runnable
            public final void run() {
                AccessTokenManager.refreshCurrentAccessTokenImpl$lambda$4(AccessTokenManager.RefreshResult.this, currentAccessToken, accessTokenRefreshCallback, atomicBoolean, hashSet, hashSet2, hashSet3, this);
            }
        };
        Companion companion = Companion;
        GraphRequest createGrantedPermissionsRequest = companion.createGrantedPermissionsRequest(currentAccessToken, n1Var);
        GraphRequest createExtendAccessTokenRequest = companion.createExtendAccessTokenRequest(currentAccessToken, callback);
        if (!Intrinsics.b(currentAccessToken.getGraphDomain(), FacebookSdk.GAMING)) {
            GraphRequestBatch graphRequestBatch = new GraphRequestBatch(createGrantedPermissionsRequest, createExtendAccessTokenRequest);
            graphRequestBatch.addCallback(new GraphRequestBatch.Callback() { // from class: p1
                @Override // com.facebook.GraphRequestBatch.Callback
                public final void onBatchCompleted(GraphRequestBatch graphRequestBatch2) {
                    AccessTokenManager.refreshCurrentAccessTokenImpl$lambda$7(b.this, graphRequestBatch2);
                }
            });
            graphRequestBatch.executeAsync();
            return;
        }
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        GraphRequest.Callback callback2 = new GraphRequest.Callback() { // from class: o1
            @Override // com.facebook.GraphRequest.Callback
            public final void onCompleted(GraphResponse graphResponse) {
                int i3 = i;
                b bVar = r0;
                AtomicInteger atomicInteger2 = atomicInteger;
                GraphRequest.Callback callback3 = n1Var;
                switch (i3) {
                    case 0:
                        AccessTokenManager.refreshCurrentAccessTokenImpl$lambda$5((n1) callback3, atomicInteger2, bVar, graphResponse);
                        break;
                    default:
                        AccessTokenManager.refreshCurrentAccessTokenImpl$lambda$6((a) callback3, atomicInteger2, bVar, graphResponse);
                        break;
                }
            }
        };
        GraphRequest.Callback callback3 = new GraphRequest.Callback() { // from class: o1
            @Override // com.facebook.GraphRequest.Callback
            public final void onCompleted(GraphResponse graphResponse) {
                int i3 = i2;
                b bVar = r0;
                AtomicInteger atomicInteger2 = atomicInteger;
                GraphRequest.Callback callback32 = callback;
                switch (i3) {
                    case 0:
                        AccessTokenManager.refreshCurrentAccessTokenImpl$lambda$5((n1) callback32, atomicInteger2, bVar, graphResponse);
                        break;
                    default:
                        AccessTokenManager.refreshCurrentAccessTokenImpl$lambda$6((a) callback32, atomicInteger2, bVar, graphResponse);
                        break;
                }
            }
        };
        createGrantedPermissionsRequest.setCallback(callback2);
        createExtendAccessTokenRequest.setCallback(callback3);
        createGrantedPermissionsRequest.executeAsync();
        createExtendAccessTokenRequest.executeAsync();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void refreshCurrentAccessTokenImpl$lambda$2(AtomicBoolean atomicBoolean, Set set, Set set2, Set set3, GraphResponse graphResponse) {
        JSONArray optJSONArray;
        atomicBoolean.getClass();
        set.getClass();
        set2.getClass();
        set3.getClass();
        graphResponse.getClass();
        JSONObject jsonObject = graphResponse.getJsonObject();
        if (jsonObject == null || (optJSONArray = jsonObject.optJSONArray("data")) == null) {
            return;
        }
        atomicBoolean.set(true);
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                String optString = optJSONObject.optString("permission");
                String optString2 = optJSONObject.optString(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS);
                if (!Utility.isNullOrEmpty(optString) && !Utility.isNullOrEmpty(optString2)) {
                    optString2.getClass();
                    Locale locale = Locale.US;
                    locale.getClass();
                    String lowerCase = optString2.toLowerCase(locale);
                    lowerCase.getClass();
                    lowerCase.getClass();
                    int hashCode = lowerCase.hashCode();
                    if (hashCode == -1309235419) {
                        if (lowerCase.equals("expired")) {
                            set3.add(optString);
                        }
                        Log.w(TAG, "Unexpected status: ".concat(lowerCase));
                    } else if (hashCode != 280295099) {
                        if (hashCode == 568196142 && lowerCase.equals("declined")) {
                            set2.add(optString);
                        }
                        Log.w(TAG, "Unexpected status: ".concat(lowerCase));
                    } else {
                        if (lowerCase.equals("granted")) {
                            set.add(optString);
                        }
                        Log.w(TAG, "Unexpected status: ".concat(lowerCase));
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void refreshCurrentAccessTokenImpl$lambda$3(RefreshResult refreshResult, GraphResponse graphResponse) {
        refreshResult.getClass();
        graphResponse.getClass();
        JSONObject jsonObject = graphResponse.getJsonObject();
        if (jsonObject == null) {
            return;
        }
        refreshResult.setAccessToken(jsonObject.optString("access_token"));
        refreshResult.setExpiresAt(jsonObject.optInt("expires_at"));
        refreshResult.setExpiresIn(jsonObject.optInt(AccessToken.EXPIRES_IN_KEY));
        refreshResult.setDataAccessExpirationTime(Long.valueOf(jsonObject.optLong(AccessToken.DATA_ACCESS_EXPIRATION_TIME)));
        refreshResult.setGraphDomain(jsonObject.optString("graph_domain", null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void refreshCurrentAccessTokenImpl$lambda$4(RefreshResult refreshResult, AccessToken accessToken, AccessToken.AccessTokenRefreshCallback accessTokenRefreshCallback, AtomicBoolean atomicBoolean, Set set, Set set2, Set set3, AccessTokenManager accessTokenManager) {
        AccessToken accessToken2;
        refreshResult.getClass();
        atomicBoolean.getClass();
        set.getClass();
        set2.getClass();
        set3.getClass();
        accessTokenManager.getClass();
        String accessToken3 = refreshResult.getAccessToken();
        int expiresAt = refreshResult.getExpiresAt();
        Long dataAccessExpirationTime = refreshResult.getDataAccessExpirationTime();
        String graphDomain = refreshResult.getGraphDomain();
        try {
            Companion companion = Companion;
            if (companion.getInstance().getCurrentAccessToken() != null) {
                AccessToken currentAccessToken = companion.getInstance().getCurrentAccessToken();
                if ((currentAccessToken != null ? currentAccessToken.getUserId() : null) == accessToken.getUserId()) {
                    if (!atomicBoolean.get() && accessToken3 == null && expiresAt == 0) {
                        if (accessTokenRefreshCallback != null) {
                            accessTokenRefreshCallback.OnTokenRefreshFailed(new FacebookException("Failed to refresh access token"));
                        }
                        accessTokenManager.tokenRefreshInProgress.set(false);
                    }
                    Date expires = accessToken.getExpires();
                    if (refreshResult.getExpiresAt() != 0) {
                        expires = new Date(refreshResult.getExpiresAt() * 1000);
                    } else if (refreshResult.getExpiresIn() != 0) {
                        expires = new Date((refreshResult.getExpiresIn() * 1000) + new Date().getTime());
                    }
                    Date date = expires;
                    if (accessToken3 == null) {
                        accessToken3 = accessToken.getToken();
                    }
                    String applicationId = accessToken.getApplicationId();
                    String userId = accessToken.getUserId();
                    Set permissions = atomicBoolean.get() ? set : accessToken.getPermissions();
                    Set declinedPermissions = atomicBoolean.get() ? set2 : accessToken.getDeclinedPermissions();
                    Set expiredPermissions = atomicBoolean.get() ? set3 : accessToken.getExpiredPermissions();
                    AccessTokenSource source = accessToken.getSource();
                    Date date2 = new Date();
                    Date date3 = dataAccessExpirationTime != null ? new Date(1000 * dataAccessExpirationTime.longValue()) : accessToken.getDataAccessExpirationTime();
                    if (graphDomain == null) {
                        graphDomain = accessToken.getGraphDomain();
                    }
                    AccessToken accessToken4 = new AccessToken(accessToken3, applicationId, userId, permissions, declinedPermissions, expiredPermissions, source, date, date2, date3, graphDomain);
                    try {
                        companion.getInstance().setCurrentAccessToken(accessToken4);
                        accessTokenManager.tokenRefreshInProgress.set(false);
                        if (accessTokenRefreshCallback != null) {
                            accessTokenRefreshCallback.OnTokenRefreshed(accessToken4);
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        th = th;
                        accessToken2 = accessToken4;
                        accessTokenManager.tokenRefreshInProgress.set(false);
                        if (accessTokenRefreshCallback != null && accessToken2 != null) {
                            accessTokenRefreshCallback.OnTokenRefreshed(accessToken2);
                        }
                        throw th;
                    }
                }
            }
            if (accessTokenRefreshCallback != null) {
                accessTokenRefreshCallback.OnTokenRefreshFailed(new FacebookException("No current access token to refresh"));
            }
            accessTokenManager.tokenRefreshInProgress.set(false);
        } catch (Throwable th2) {
            th = th2;
            accessToken2 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void refreshCurrentAccessTokenImpl$lambda$5(GraphRequest.Callback callback, AtomicInteger atomicInteger, Runnable runnable, GraphResponse graphResponse) {
        callback.getClass();
        atomicInteger.getClass();
        runnable.getClass();
        graphResponse.getClass();
        callback.onCompleted(graphResponse);
        if (atomicInteger.incrementAndGet() == 2) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void refreshCurrentAccessTokenImpl$lambda$6(GraphRequest.Callback callback, AtomicInteger atomicInteger, Runnable runnable, GraphResponse graphResponse) {
        callback.getClass();
        atomicInteger.getClass();
        runnable.getClass();
        graphResponse.getClass();
        callback.onCompleted(graphResponse);
        if (atomicInteger.incrementAndGet() == 2) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void refreshCurrentAccessTokenImpl$lambda$7(Runnable runnable, GraphRequestBatch graphRequestBatch) {
        runnable.getClass();
        graphRequestBatch.getClass();
        runnable.run();
    }

    private final void sendCurrentAccessTokenChangedBroadcastIntent(AccessToken accessToken, AccessToken accessToken2) {
        Intent intent = new Intent(FacebookSdk.getApplicationContext(), (Class<?>) CurrentAccessTokenExpirationBroadcastReceiver.class);
        intent.setAction(ACTION_CURRENT_ACCESS_TOKEN_CHANGED);
        intent.putExtra(EXTRA_OLD_ACCESS_TOKEN, accessToken);
        intent.putExtra(EXTRA_NEW_ACCESS_TOKEN, accessToken2);
        this.localBroadcastManager.c(intent);
    }

    private final void setCurrentAccessToken(AccessToken accessToken, boolean z) {
        AccessToken accessToken2 = this.currentAccessTokenField;
        String userId = accessToken2 != null ? accessToken2.getUserId() : null;
        String userId2 = accessToken != null ? accessToken.getUserId() : null;
        if (userId != null && !userId.equals(userId2)) {
            FacebookSdk.getExecutor().execute(new m(1));
        }
        this.currentAccessTokenField = accessToken;
        this.tokenRefreshInProgress.set(false);
        this.lastAttemptedTokenExtendDate = new Date(0L);
        if (z) {
            AccessTokenCache accessTokenCache = this.accessTokenCache;
            if (accessToken != null) {
                accessTokenCache.save(accessToken);
            } else {
                accessTokenCache.clear();
                Utility.clearFacebookCookies(FacebookSdk.getApplicationContext());
            }
        }
        if (Utility.areObjectsEqual(accessToken2, accessToken)) {
            return;
        }
        sendCurrentAccessTokenChangedBroadcastIntent(accessToken2, accessToken);
        setTokenExpirationBroadcastAlarm();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setCurrentAccessToken$lambda$0() {
        AppEventQueue.flushAndWait(FlushReason.EAGER_FLUSHING_EVENT);
    }

    private final void setTokenExpirationBroadcastAlarm() {
        Context applicationContext = FacebookSdk.getApplicationContext();
        AccessToken.Companion companion = AccessToken.Companion;
        AccessToken currentAccessToken = companion.getCurrentAccessToken();
        AlarmManager alarmManager = (AlarmManager) applicationContext.getSystemService("alarm");
        if (companion.isCurrentAccessTokenActive()) {
            if ((currentAccessToken != null ? currentAccessToken.getExpires() : null) == null || alarmManager == null) {
                return;
            }
            Intent intent = new Intent(applicationContext, (Class<?>) CurrentAccessTokenExpirationBroadcastReceiver.class);
            intent.setAction(ACTION_CURRENT_ACCESS_TOKEN_CHANGED);
            try {
                alarmManager.set(1, currentAccessToken.getExpires().getTime(), PendingIntent.getBroadcast(applicationContext, 0, intent, 67108864));
            } catch (Exception unused) {
            }
        }
    }

    private final boolean shouldExtendAccessToken() {
        AccessToken currentAccessToken = getCurrentAccessToken();
        if (currentAccessToken == null) {
            return false;
        }
        long time = new Date().getTime();
        return currentAccessToken.getSource().canExtendToken() && time - this.lastAttemptedTokenExtendDate.getTime() > 3600000 && time - currentAccessToken.getLastRefresh().getTime() > 86400000;
    }

    public final void currentAccessTokenChanged() {
        sendCurrentAccessTokenChangedBroadcastIntent(getCurrentAccessToken(), getCurrentAccessToken());
    }

    public final void extendAccessTokenIfNeeded() {
        if (shouldExtendAccessToken()) {
            refreshCurrentAccessToken(null);
        }
    }

    public final AccessToken getCurrentAccessToken() {
        return this.currentAccessTokenField;
    }

    public final boolean loadCurrentAccessToken() {
        AccessToken load = this.accessTokenCache.load();
        if (load == null) {
            return false;
        }
        setCurrentAccessToken(load, false);
        return true;
    }

    public final void refreshCurrentAccessToken(AccessToken.AccessTokenRefreshCallback accessTokenRefreshCallback) {
        if (Intrinsics.b(Looper.getMainLooper(), Looper.myLooper())) {
            refreshCurrentAccessTokenImpl(accessTokenRefreshCallback);
        } else {
            new Handler(Looper.getMainLooper()).post(new q1(0, this, accessTokenRefreshCallback));
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final GraphRequest createExtendAccessTokenRequest(AccessToken accessToken, GraphRequest.Callback callback) {
            RefreshTokenInfo refreshTokenInfoForToken = getRefreshTokenInfoForToken(accessToken);
            Bundle bundle = new Bundle();
            bundle.putString("grant_type", refreshTokenInfoForToken.getGrantType());
            bundle.putString("client_id", accessToken.getApplicationId());
            bundle.putString(GraphRequest.FIELDS_PARAM, "access_token,expires_at,expires_in,data_access_expiration_time,graph_domain");
            GraphRequest newGraphPathRequest = GraphRequest.Companion.newGraphPathRequest(accessToken, refreshTokenInfoForToken.getGraphPath(), callback);
            newGraphPathRequest.setParameters(bundle);
            newGraphPathRequest.setHttpMethod(HttpMethod.GET);
            return newGraphPathRequest;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final GraphRequest createGrantedPermissionsRequest(AccessToken accessToken, GraphRequest.Callback callback) {
            Bundle bundle = new Bundle();
            bundle.putString(GraphRequest.FIELDS_PARAM, "permission,status");
            GraphRequest newGraphPathRequest = GraphRequest.Companion.newGraphPathRequest(accessToken, AccessTokenManager.ME_PERMISSIONS_GRAPH_PATH, callback);
            newGraphPathRequest.setParameters(bundle);
            newGraphPathRequest.setHttpMethod(HttpMethod.GET);
            return newGraphPathRequest;
        }

        private final RefreshTokenInfo getRefreshTokenInfoForToken(AccessToken accessToken) {
            String graphDomain = accessToken.getGraphDomain();
            if (graphDomain == null) {
                graphDomain = AccessToken.DEFAULT_GRAPH_DOMAIN;
            }
            return graphDomain.equals(FacebookSdk.INSTAGRAM) ? new InstagramRefreshTokenInfo() : new FacebookRefreshTokenInfo();
        }

        public final AccessTokenManager getInstance() {
            AccessTokenManager accessTokenManager;
            AccessTokenManager accessTokenManager2 = AccessTokenManager.instanceField;
            if (accessTokenManager2 != null) {
                return accessTokenManager2;
            }
            synchronized (this) {
                accessTokenManager = AccessTokenManager.instanceField;
                if (accessTokenManager == null) {
                    kf1 a = kf1.a(FacebookSdk.getApplicationContext());
                    a.getClass();
                    AccessTokenManager accessTokenManager3 = new AccessTokenManager(a, new AccessTokenCache());
                    AccessTokenManager.instanceField = accessTokenManager3;
                    accessTokenManager = accessTokenManager3;
                }
            }
            return accessTokenManager;
        }

        private Companion() {
        }
    }

    public final void setCurrentAccessToken(AccessToken accessToken) {
        setCurrentAccessToken(accessToken, true);
    }
}
