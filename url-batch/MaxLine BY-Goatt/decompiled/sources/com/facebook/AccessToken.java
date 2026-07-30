package com.facebook;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.AccessToken;
import com.facebook.LegacyTokenHelper;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import defpackage.ah0;
import defpackage.ey;
import defpackage.in1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class AccessToken implements Parcelable {
    public static final String ACCESS_TOKEN_KEY = "access_token";
    private static final String APPLICATION_ID_KEY = "application_id";
    public static final Parcelable.Creator<AccessToken> CREATOR;
    private static final int CURRENT_JSON_FORMAT = 1;
    public static final Companion Companion = new Companion(null);
    public static final String DATA_ACCESS_EXPIRATION_TIME = "data_access_expiration_time";
    private static final String DECLINED_PERMISSIONS_KEY = "declined_permissions";
    private static final AccessTokenSource DEFAULT_ACCESS_TOKEN_SOURCE;
    private static final Date DEFAULT_EXPIRATION_TIME;
    public static final String DEFAULT_GRAPH_DOMAIN = "facebook";
    private static final Date DEFAULT_LAST_REFRESH_TIME;
    private static final String EXPIRED_PERMISSIONS_KEY = "expired_permissions";
    private static final String EXPIRES_AT_KEY = "expires_at";
    public static final String EXPIRES_IN_KEY = "expires_in";
    public static final String GRAPH_DOMAIN = "graph_domain";
    private static final String LAST_REFRESH_KEY = "last_refresh";
    private static final Date MAX_DATE;
    private static final String PERMISSIONS_KEY = "permissions";
    private static final String SOURCE_KEY = "source";
    private static final String TOKEN_KEY = "token";
    public static final String USER_ID_KEY = "user_id";
    private static final String VERSION_KEY = "version";
    private final String applicationId;
    private final Date dataAccessExpirationTime;
    private final Set<String> declinedPermissions;
    private final Set<String> expiredPermissions;
    private final Date expires;
    private final String graphDomain;
    private final Date lastRefresh;
    private final Set<String> permissions;
    private final AccessTokenSource source;
    private final String token;
    private final String userId;

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public interface AccessTokenCreationCallback {
        void onError(FacebookException facebookException);

        void onSuccess(AccessToken accessToken);
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public interface AccessTokenRefreshCallback {
        void OnTokenRefreshFailed(FacebookException facebookException);

        void OnTokenRefreshed(AccessToken accessToken);
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AccessTokenSource.values().length];
            try {
                iArr[AccessTokenSource.FACEBOOK_APPLICATION_WEB.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AccessTokenSource.CHROME_CUSTOM_TAB.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AccessTokenSource.WEB_VIEW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        Date date = new Date(Long.MAX_VALUE);
        MAX_DATE = date;
        DEFAULT_EXPIRATION_TIME = date;
        DEFAULT_LAST_REFRESH_TIME = new Date();
        DEFAULT_ACCESS_TOKEN_SOURCE = AccessTokenSource.FACEBOOK_APPLICATION_WEB;
        CREATOR = new Parcelable.Creator<AccessToken>() { // from class: com.facebook.AccessToken$Companion$CREATOR$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public AccessToken createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new AccessToken(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public AccessToken[] newArray(int i) {
                return new AccessToken[i];
            }
        };
    }

    public AccessToken(Parcel parcel) {
        parcel.getClass();
        this.expires = new Date(parcel.readLong());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        Set<String> unmodifiableSet = Collections.unmodifiableSet(new HashSet(arrayList));
        unmodifiableSet.getClass();
        this.permissions = unmodifiableSet;
        arrayList.clear();
        parcel.readStringList(arrayList);
        Set<String> unmodifiableSet2 = Collections.unmodifiableSet(new HashSet(arrayList));
        unmodifiableSet2.getClass();
        this.declinedPermissions = unmodifiableSet2;
        arrayList.clear();
        parcel.readStringList(arrayList);
        Set<String> unmodifiableSet3 = Collections.unmodifiableSet(new HashSet(arrayList));
        unmodifiableSet3.getClass();
        this.expiredPermissions = unmodifiableSet3;
        this.token = Validate.notNullOrEmpty(parcel.readString(), TOKEN_KEY);
        String readString = parcel.readString();
        this.source = readString != null ? AccessTokenSource.valueOf(readString) : DEFAULT_ACCESS_TOKEN_SOURCE;
        this.lastRefresh = new Date(parcel.readLong());
        this.applicationId = Validate.notNullOrEmpty(parcel.readString(), "applicationId");
        this.userId = Validate.notNullOrEmpty(parcel.readString(), "userId");
        this.dataAccessExpirationTime = new Date(parcel.readLong());
        this.graphDomain = parcel.readString();
    }

    private final void appendPermissions(StringBuilder sb) {
        sb.append(" permissions:");
        sb.append("[");
        sb.append(TextUtils.join(", ", this.permissions));
        sb.append("]");
    }

    private final AccessTokenSource convertTokenSourceForGraphDomain(AccessTokenSource accessTokenSource, String str) {
        if (str == null || !str.equals(FacebookSdk.INSTAGRAM)) {
            return accessTokenSource;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[accessTokenSource.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? accessTokenSource : AccessTokenSource.INSTAGRAM_WEB_VIEW : AccessTokenSource.INSTAGRAM_CUSTOM_CHROME_TAB : AccessTokenSource.INSTAGRAM_APPLICATION_WEB;
    }

    public static final void createFromNativeLinkingIntent(Intent intent, String str, AccessTokenCreationCallback accessTokenCreationCallback) {
        Companion.createFromNativeLinkingIntent(intent, str, accessTokenCreationCallback);
    }

    public static final void expireCurrentAccessToken() {
        Companion.expireCurrentAccessToken();
    }

    public static final AccessToken getCurrentAccessToken() {
        return Companion.getCurrentAccessToken();
    }

    public static final boolean isCurrentAccessTokenActive() {
        return Companion.isCurrentAccessTokenActive();
    }

    public static final boolean isDataAccessActive() {
        return Companion.isDataAccessActive();
    }

    public static final boolean isLoggedInWithInstagram() {
        return Companion.isLoggedInWithInstagram();
    }

    public static final void refreshCurrentAccessTokenAsync() {
        Companion.refreshCurrentAccessTokenAsync();
    }

    public static final void setCurrentAccessToken(AccessToken accessToken) {
        Companion.setCurrentAccessToken(accessToken);
    }

    private final String tokenToString() {
        return FacebookSdk.isLoggingBehaviorEnabled(LoggingBehavior.INCLUDE_ACCESS_TOKENS) ? this.token : "ACCESS_TOKEN_REMOVED";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccessToken)) {
            return false;
        }
        AccessToken accessToken = (AccessToken) obj;
        if (Intrinsics.b(this.expires, accessToken.expires) && Intrinsics.b(this.permissions, accessToken.permissions) && Intrinsics.b(this.declinedPermissions, accessToken.declinedPermissions) && Intrinsics.b(this.expiredPermissions, accessToken.expiredPermissions) && Intrinsics.b(this.token, accessToken.token) && this.source == accessToken.source && Intrinsics.b(this.lastRefresh, accessToken.lastRefresh) && Intrinsics.b(this.applicationId, accessToken.applicationId) && Intrinsics.b(this.userId, accessToken.userId) && Intrinsics.b(this.dataAccessExpirationTime, accessToken.dataAccessExpirationTime)) {
            String str = this.graphDomain;
            String str2 = accessToken.graphDomain;
            if (str == null ? str2 == null : Intrinsics.b(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public final String getApplicationId() {
        return this.applicationId;
    }

    public final Date getDataAccessExpirationTime() {
        return this.dataAccessExpirationTime;
    }

    public final Set<String> getDeclinedPermissions() {
        return this.declinedPermissions;
    }

    public final Set<String> getExpiredPermissions() {
        return this.expiredPermissions;
    }

    public final Date getExpires() {
        return this.expires;
    }

    public final String getGraphDomain() {
        return this.graphDomain;
    }

    public final Date getLastRefresh() {
        return this.lastRefresh;
    }

    public final Set<String> getPermissions() {
        return this.permissions;
    }

    public final AccessTokenSource getSource() {
        return this.source;
    }

    public final String getToken() {
        return this.token;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int hashCode = (this.dataAccessExpirationTime.hashCode() + in1.j(this.userId, in1.j(this.applicationId, (this.lastRefresh.hashCode() + ((this.source.hashCode() + in1.j(this.token, (this.expiredPermissions.hashCode() + ((this.declinedPermissions.hashCode() + ((this.permissions.hashCode() + ((this.expires.hashCode() + 527) * 31)) * 31)) * 31)) * 31, 31)) * 31)) * 31, 31), 31)) * 31;
        String str = this.graphDomain;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final boolean isDataAccessExpired() {
        return new Date().after(this.dataAccessExpirationTime);
    }

    public final boolean isExpired() {
        return new Date().after(this.expires);
    }

    public final boolean isInstagramToken() {
        String str = this.graphDomain;
        return str != null && str.equals(FacebookSdk.INSTAGRAM);
    }

    public final JSONObject toJSONObject$facebook_core_release() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", 1);
        jSONObject.put(TOKEN_KEY, this.token);
        jSONObject.put(EXPIRES_AT_KEY, this.expires.getTime());
        jSONObject.put("permissions", new JSONArray((Collection) this.permissions));
        jSONObject.put(DECLINED_PERMISSIONS_KEY, new JSONArray((Collection) this.declinedPermissions));
        jSONObject.put(EXPIRED_PERMISSIONS_KEY, new JSONArray((Collection) this.expiredPermissions));
        jSONObject.put(LAST_REFRESH_KEY, this.lastRefresh.getTime());
        jSONObject.put("source", this.source.name());
        jSONObject.put(APPLICATION_ID_KEY, this.applicationId);
        jSONObject.put("user_id", this.userId);
        jSONObject.put(DATA_ACCESS_EXPIRATION_TIME, this.dataAccessExpirationTime.getTime());
        String str = this.graphDomain;
        if (str != null) {
            jSONObject.put("graph_domain", str);
        }
        return jSONObject;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{AccessToken token:");
        sb.append(tokenToString());
        appendPermissions(sb);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.expires.getTime());
        parcel.writeStringList(new ArrayList(this.permissions));
        parcel.writeStringList(new ArrayList(this.declinedPermissions));
        parcel.writeStringList(new ArrayList(this.expiredPermissions));
        parcel.writeString(this.token);
        parcel.writeString(this.source.name());
        parcel.writeLong(this.lastRefresh.getTime());
        parcel.writeString(this.applicationId);
        parcel.writeString(this.userId);
        parcel.writeLong(this.dataAccessExpirationTime.getTime());
        parcel.writeString(this.graphDomain);
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final AccessToken createFromBundle(List<String> list, Bundle bundle, AccessTokenSource accessTokenSource, Date date, String str) {
            Date bundleLongAsDate;
            String string;
            String string2 = bundle.getString("access_token");
            if (string2 == null || (bundleLongAsDate = Utility.getBundleLongAsDate(bundle, AccessToken.EXPIRES_IN_KEY, date)) == null || (string = bundle.getString("user_id")) == null) {
                return null;
            }
            return new AccessToken(string2, str, string, list, null, null, accessTokenSource, bundleLongAsDate, new Date(), Utility.getBundleLongAsDate(bundle, AccessToken.DATA_ACCESS_EXPIRATION_TIME, new Date(0L)), null, 1024, null);
        }

        public final AccessToken createExpired$facebook_core_release(AccessToken accessToken) {
            accessToken.getClass();
            return new AccessToken(accessToken.getToken(), accessToken.getApplicationId(), accessToken.getUserId(), accessToken.getPermissions(), accessToken.getDeclinedPermissions(), accessToken.getExpiredPermissions(), accessToken.getSource(), new Date(), new Date(), accessToken.getDataAccessExpirationTime(), null, 1024, null);
        }

        public final AccessToken createFromJSONObject$facebook_core_release(JSONObject jSONObject) {
            jSONObject.getClass();
            if (jSONObject.getInt("version") > 1) {
                ey.i("Unknown AccessToken serialization format.");
                return null;
            }
            String string = jSONObject.getString(AccessToken.TOKEN_KEY);
            Date date = new Date(jSONObject.getLong(AccessToken.EXPIRES_AT_KEY));
            JSONArray jSONArray = jSONObject.getJSONArray("permissions");
            JSONArray jSONArray2 = jSONObject.getJSONArray(AccessToken.DECLINED_PERMISSIONS_KEY);
            JSONArray optJSONArray = jSONObject.optJSONArray(AccessToken.EXPIRED_PERMISSIONS_KEY);
            Date date2 = new Date(jSONObject.getLong(AccessToken.LAST_REFRESH_KEY));
            String string2 = jSONObject.getString("source");
            string2.getClass();
            AccessTokenSource valueOf = AccessTokenSource.valueOf(string2);
            String string3 = jSONObject.getString(AccessToken.APPLICATION_ID_KEY);
            String string4 = jSONObject.getString("user_id");
            Date date3 = new Date(jSONObject.optLong(AccessToken.DATA_ACCESS_EXPIRATION_TIME, 0L));
            String optString = jSONObject.optString("graph_domain", null);
            string.getClass();
            string3.getClass();
            string4.getClass();
            jSONArray.getClass();
            List<String> jsonArrayToStringList = Utility.jsonArrayToStringList(jSONArray);
            jSONArray2.getClass();
            return new AccessToken(string, string3, string4, jsonArrayToStringList, Utility.jsonArrayToStringList(jSONArray2), optJSONArray == null ? new ArrayList() : Utility.jsonArrayToStringList(optJSONArray), valueOf, date, date2, date3, optString);
        }

        public final AccessToken createFromLegacyCache$facebook_core_release(Bundle bundle) {
            String string;
            bundle.getClass();
            List<String> permissionsFromBundle$facebook_core_release = getPermissionsFromBundle$facebook_core_release(bundle, LegacyTokenHelper.PERMISSIONS_KEY);
            List<String> permissionsFromBundle$facebook_core_release2 = getPermissionsFromBundle$facebook_core_release(bundle, LegacyTokenHelper.DECLINED_PERMISSIONS_KEY);
            List<String> permissionsFromBundle$facebook_core_release3 = getPermissionsFromBundle$facebook_core_release(bundle, LegacyTokenHelper.EXPIRED_PERMISSIONS_KEY);
            LegacyTokenHelper.Companion companion = LegacyTokenHelper.Companion;
            String applicationId = companion.getApplicationId(bundle);
            if (Utility.isNullOrEmpty(applicationId)) {
                applicationId = FacebookSdk.getApplicationId();
            }
            String str = applicationId;
            String token = companion.getToken(bundle);
            if (token == null) {
                return null;
            }
            JSONObject awaitGetGraphMeRequestWithCache = Utility.awaitGetGraphMeRequestWithCache(token);
            if (awaitGetGraphMeRequestWithCache != null) {
                try {
                    string = awaitGetGraphMeRequestWithCache.getString("id");
                } catch (JSONException unused) {
                    return null;
                }
            } else {
                string = null;
            }
            if (str == null || string == null) {
                return null;
            }
            return new AccessToken(token, str, string, permissionsFromBundle$facebook_core_release, permissionsFromBundle$facebook_core_release2, permissionsFromBundle$facebook_core_release3, companion.getSource(bundle), companion.getExpirationDate(bundle), companion.getLastRefreshDate(bundle), null, null, 1024, null);
        }

        public final void createFromNativeLinkingIntent(Intent intent, final String str, final AccessTokenCreationCallback accessTokenCreationCallback) {
            intent.getClass();
            str.getClass();
            accessTokenCreationCallback.getClass();
            if (intent.getExtras() == null) {
                accessTokenCreationCallback.onError(new FacebookException("No extras found on intent"));
                return;
            }
            final Bundle bundle = new Bundle(intent.getExtras());
            String string = bundle.getString("access_token");
            if (string == null || string.length() == 0) {
                accessTokenCreationCallback.onError(new FacebookException("No access token found on intent"));
                return;
            }
            String string2 = bundle.getString("user_id");
            if (string2 == null || string2.length() == 0) {
                Utility.getGraphMeRequestWithCacheAsync(string, new Utility.GraphMeRequestWithCacheCallback() { // from class: com.facebook.AccessToken$Companion$createFromNativeLinkingIntent$1
                    @Override // com.facebook.internal.Utility.GraphMeRequestWithCacheCallback
                    public void onFailure(FacebookException facebookException) {
                        accessTokenCreationCallback.onError(facebookException);
                    }

                    @Override // com.facebook.internal.Utility.GraphMeRequestWithCacheCallback
                    public void onSuccess(JSONObject jSONObject) {
                        String string3;
                        AccessToken createFromBundle;
                        if (jSONObject != null) {
                            try {
                                string3 = jSONObject.getString("id");
                            } catch (Exception unused) {
                                accessTokenCreationCallback.onError(new FacebookException("Unable to generate access token due to missing user id"));
                                return;
                            }
                        } else {
                            string3 = null;
                        }
                        if (string3 == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        bundle.putString("user_id", string3);
                        AccessToken.AccessTokenCreationCallback accessTokenCreationCallback2 = accessTokenCreationCallback;
                        createFromBundle = AccessToken.Companion.createFromBundle(null, bundle, AccessTokenSource.FACEBOOK_APPLICATION_WEB, new Date(), str);
                        accessTokenCreationCallback2.onSuccess(createFromBundle);
                    }
                });
            } else {
                accessTokenCreationCallback.onSuccess(createFromBundle(null, bundle, AccessTokenSource.FACEBOOK_APPLICATION_WEB, new Date(), str));
            }
        }

        public final AccessToken createFromRefresh$facebook_core_release(AccessToken accessToken, Bundle bundle) {
            accessToken.getClass();
            bundle.getClass();
            if (accessToken.getSource() != AccessTokenSource.FACEBOOK_APPLICATION_WEB && accessToken.getSource() != AccessTokenSource.FACEBOOK_APPLICATION_NATIVE && accessToken.getSource() != AccessTokenSource.FACEBOOK_APPLICATION_SERVICE) {
                throw new FacebookException("Invalid token source: " + accessToken.getSource());
            }
            Date bundleLongAsDate = Utility.getBundleLongAsDate(bundle, AccessToken.EXPIRES_IN_KEY, new Date(0L));
            String string = bundle.getString("access_token");
            if (string == null) {
                return null;
            }
            String string2 = bundle.getString("graph_domain");
            Date bundleLongAsDate2 = Utility.getBundleLongAsDate(bundle, AccessToken.DATA_ACCESS_EXPIRATION_TIME, new Date(0L));
            if (Utility.isNullOrEmpty(string)) {
                return null;
            }
            return new AccessToken(string, accessToken.getApplicationId(), accessToken.getUserId(), accessToken.getPermissions(), accessToken.getDeclinedPermissions(), accessToken.getExpiredPermissions(), accessToken.getSource(), bundleLongAsDate, new Date(), bundleLongAsDate2, string2);
        }

        public final void expireCurrentAccessToken() {
            AccessToken currentAccessToken = AccessTokenManager.Companion.getInstance().getCurrentAccessToken();
            if (currentAccessToken != null) {
                setCurrentAccessToken(createExpired$facebook_core_release(currentAccessToken));
            }
        }

        public final AccessToken getCurrentAccessToken() {
            return AccessTokenManager.Companion.getInstance().getCurrentAccessToken();
        }

        public final List<String> getPermissionsFromBundle$facebook_core_release(Bundle bundle, String str) {
            bundle.getClass();
            ArrayList<String> stringArrayList = bundle.getStringArrayList(str);
            if (stringArrayList == null) {
                return ah0.m;
            }
            List<String> unmodifiableList = Collections.unmodifiableList(new ArrayList(stringArrayList));
            unmodifiableList.getClass();
            return unmodifiableList;
        }

        public final boolean isCurrentAccessTokenActive() {
            AccessToken currentAccessToken = AccessTokenManager.Companion.getInstance().getCurrentAccessToken();
            return (currentAccessToken == null || currentAccessToken.isExpired()) ? false : true;
        }

        public final boolean isDataAccessActive() {
            AccessToken currentAccessToken = AccessTokenManager.Companion.getInstance().getCurrentAccessToken();
            return (currentAccessToken == null || currentAccessToken.isDataAccessExpired()) ? false : true;
        }

        public final boolean isLoggedInWithInstagram() {
            AccessToken currentAccessToken = AccessTokenManager.Companion.getInstance().getCurrentAccessToken();
            return (currentAccessToken == null || currentAccessToken.isExpired() || !currentAccessToken.isInstagramToken()) ? false : true;
        }

        public final void refreshCurrentAccessTokenAsync() {
            AccessTokenManager.Companion.getInstance().refreshCurrentAccessToken(null);
        }

        public final void setCurrentAccessToken(AccessToken accessToken) {
            AccessTokenManager.Companion.getInstance().setCurrentAccessToken(accessToken);
        }

        private Companion() {
        }

        public final void refreshCurrentAccessTokenAsync(AccessTokenRefreshCallback accessTokenRefreshCallback) {
            AccessTokenManager.Companion.getInstance().refreshCurrentAccessToken(accessTokenRefreshCallback);
        }
    }

    public static final void refreshCurrentAccessTokenAsync(AccessTokenRefreshCallback accessTokenRefreshCallback) {
        Companion.refreshCurrentAccessTokenAsync(accessTokenRefreshCallback);
    }

    public /* synthetic */ AccessToken(String str, String str2, String str3, Collection collection, Collection collection2, Collection collection3, AccessTokenSource accessTokenSource, Date date, Date date2, Date date3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, collection, collection2, collection3, accessTokenSource, date, date2, date3, (i & 1024) != 0 ? DEFAULT_GRAPH_DOMAIN : str4);
    }

    public AccessToken(String str, String str2, String str3, Collection<String> collection, Collection<String> collection2, Collection<String> collection3, AccessTokenSource accessTokenSource, Date date, Date date2, Date date3, String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        Validate.notEmpty(str, SDKConstants.PARAM_ACCESS_TOKEN);
        Validate.notEmpty(str2, "applicationId");
        Validate.notEmpty(str3, "userId");
        this.expires = date == null ? DEFAULT_EXPIRATION_TIME : date;
        Set<String> unmodifiableSet = Collections.unmodifiableSet(collection != null ? new HashSet(collection) : new HashSet());
        unmodifiableSet.getClass();
        this.permissions = unmodifiableSet;
        Set<String> unmodifiableSet2 = Collections.unmodifiableSet(collection2 != null ? new HashSet(collection2) : new HashSet());
        unmodifiableSet2.getClass();
        this.declinedPermissions = unmodifiableSet2;
        Set<String> unmodifiableSet3 = Collections.unmodifiableSet(collection3 != null ? new HashSet(collection3) : new HashSet());
        unmodifiableSet3.getClass();
        this.expiredPermissions = unmodifiableSet3;
        this.token = str;
        this.source = convertTokenSourceForGraphDomain(accessTokenSource == null ? DEFAULT_ACCESS_TOKEN_SOURCE : accessTokenSource, str4);
        this.lastRefresh = date2 == null ? DEFAULT_LAST_REFRESH_TIME : date2;
        this.applicationId = str2;
        this.userId = str3;
        this.dataAccessExpirationTime = (date3 == null || date3.getTime() == 0) ? DEFAULT_EXPIRATION_TIME : date3;
        this.graphDomain = str4 == null ? DEFAULT_GRAPH_DOMAIN : str4;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AccessToken(String str, String str2, String str3, Collection<String> collection, Collection<String> collection2, Collection<String> collection3, AccessTokenSource accessTokenSource, Date date, Date date2, Date date3) {
        this(str, str2, str3, collection, collection2, collection3, accessTokenSource, date, date2, date3, null, 1024, null);
        str.getClass();
        str2.getClass();
        str3.getClass();
    }
}
