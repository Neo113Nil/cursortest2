package com.facebook.login;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import com.facebook.AccessToken;
import com.facebook.AccessTokenSource;
import com.facebook.AuthenticationToken;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.FacebookServiceException;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.Utility;
import com.facebook.login.LoginClient;
import defpackage.ey;
import defpackage.qv;
import defpackage.up2;
import defpackage.yt;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class LoginMethodHandler implements Parcelable {
    public static final Companion Companion = new Companion(null);
    public static final String NO_SIGNED_REQUEST_ERROR_MESSAGE = "Authorization response does not contain the signed_request";
    public static final String NO_USER_ID_ERROR_MESSAGE = "Failed to retrieve user_id from signed_request";
    public static final String USER_CANCELED_LOG_IN_ERROR_MESSAGE = "User canceled log in.";
    public LoginClient loginClient;
    private Map<String, String> methodLoggingExtras;

    public LoginMethodHandler(Parcel parcel) {
        parcel.getClass();
        Map<String, String> readStringMapFromParcel = Utility.readStringMapFromParcel(parcel);
        this.methodLoggingExtras = readStringMapFromParcel != null ? new LinkedHashMap(readStringMapFromParcel) : null;
    }

    public static final AccessToken createAccessTokenFromNativeLogin(Bundle bundle, AccessTokenSource accessTokenSource, String str) {
        return Companion.createAccessTokenFromNativeLogin(bundle, accessTokenSource, str);
    }

    public static final AccessToken createAccessTokenFromWebBundle(Collection<String> collection, Bundle bundle, AccessTokenSource accessTokenSource, String str) {
        return Companion.createAccessTokenFromWebBundle(collection, bundle, accessTokenSource, str);
    }

    public static final AuthenticationToken createAuthenticationTokenFromNativeLogin(Bundle bundle, String str) {
        return Companion.createAuthenticationTokenFromNativeLogin(bundle, str);
    }

    public static final AuthenticationToken createAuthenticationTokenFromWebBundle(Bundle bundle, String str) {
        return Companion.createAuthenticationTokenFromWebBundle(bundle, str);
    }

    public static final String getUserIDFromSignedRequest(String str) {
        return Companion.getUserIDFromSignedRequest(str);
    }

    public void addLoggingExtra(String str, Object obj) {
        if (this.methodLoggingExtras == null) {
            this.methodLoggingExtras = new HashMap();
        }
        Map<String, String> map = this.methodLoggingExtras;
        if (map != null) {
            map.put(str, obj != null ? obj.toString() : null);
        }
    }

    public String getClientState(String str) {
        str.getClass();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(LoginLogger.EVENT_PARAM_AUTH_LOGGER_ID, str);
            jSONObject.put(LoginLogger.EVENT_PARAM_METHOD, getNameForLogging());
            putChallengeParam(jSONObject);
        } catch (JSONException e) {
            Log.w("LoginMethodHandler", "Error creating client state json: " + e.getMessage());
        }
        String jSONObject2 = jSONObject.toString();
        jSONObject2.getClass();
        return jSONObject2;
    }

    public final LoginClient getLoginClient() {
        LoginClient loginClient = this.loginClient;
        if (loginClient != null) {
            return loginClient;
        }
        Intrinsics.f("loginClient");
        throw null;
    }

    public final Map<String, String> getMethodLoggingExtras() {
        return this.methodLoggingExtras;
    }

    public abstract String getNameForLogging();

    public String getRedirectUrl() {
        return "fb" + FacebookSdk.getApplicationId() + "://authorize/";
    }

    public void logWebLoginCompleted(String str) {
        String applicationId;
        LoginClient.Request pendingRequest = getLoginClient().getPendingRequest();
        if (pendingRequest == null || (applicationId = pendingRequest.getApplicationId()) == null) {
            applicationId = FacebookSdk.getApplicationId();
        }
        InternalAppEventsLogger internalAppEventsLogger = new InternalAppEventsLogger(getLoginClient().getActivity(), applicationId);
        Bundle bundle = new Bundle();
        bundle.putString(AnalyticsEvents.PARAMETER_WEB_LOGIN_E2E, str);
        bundle.putLong(AnalyticsEvents.PARAMETER_WEB_LOGIN_SWITCHBACK_TIME, System.currentTimeMillis());
        bundle.putString("app_id", applicationId);
        internalAppEventsLogger.logEventImplicitly(AnalyticsEvents.EVENT_WEB_LOGIN_COMPLETE, null, bundle);
    }

    public boolean needsInternetPermission() {
        return false;
    }

    public boolean onActivityResult(int i, int i2, Intent intent) {
        return false;
    }

    public Bundle processCodeExchange(LoginClient.Request request, Bundle bundle) {
        request.getClass();
        bundle.getClass();
        String string = bundle.getString("code");
        if (Utility.isNullOrEmpty(string)) {
            ey.i("No code param found from the request");
            return null;
        }
        if (string != null) {
            String redirectUrl = getRedirectUrl();
            String codeVerifier = request.getCodeVerifier();
            if (codeVerifier == null) {
                codeVerifier = com.google.firebase.encoders.json.BuildConfig.FLAVOR;
            }
            GraphRequest createCodeExchangeRequest = PKCEUtil.createCodeExchangeRequest(string, redirectUrl, codeVerifier);
            if (createCodeExchangeRequest != null) {
                GraphResponse executeAndWait = createCodeExchangeRequest.executeAndWait();
                FacebookRequestError error = executeAndWait.getError();
                if (error != null) {
                    throw new FacebookServiceException(error, error.getErrorMessage());
                }
                try {
                    JSONObject jSONObject = executeAndWait.getJSONObject();
                    String string2 = jSONObject != null ? jSONObject.getString("access_token") : null;
                    if (jSONObject == null || Utility.isNullOrEmpty(string2)) {
                        throw new FacebookException("No access token found from result");
                    }
                    bundle.putString("access_token", string2);
                    if (jSONObject.has("id_token")) {
                        bundle.putString("id_token", jSONObject.getString("id_token"));
                    }
                    return bundle;
                } catch (JSONException e) {
                    throw new FacebookException("Fail to process code exchange response: " + e.getMessage());
                }
            }
        }
        ey.i("Failed to create code exchange request");
        return null;
    }

    public void putChallengeParam(JSONObject jSONObject) {
        jSONObject.getClass();
    }

    public final void setLoginClient(LoginClient loginClient) {
        loginClient.getClass();
        this.loginClient = loginClient;
    }

    public final void setMethodLoggingExtras(Map<String, String> map) {
        this.methodLoggingExtras = map;
    }

    public boolean shouldKeepTrackOfMultipleIntents() {
        return false;
    }

    public abstract int tryAuthorize(LoginClient.Request request);

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        Utility.writeStringMapToParcel(parcel, this.methodLoggingExtras);
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AccessToken createAccessTokenFromNativeLogin(Bundle bundle, AccessTokenSource accessTokenSource, String str) {
            String string;
            bundle.getClass();
            str.getClass();
            Date bundleLongAsDate = Utility.getBundleLongAsDate(bundle, NativeProtocol.EXTRA_EXPIRES_SECONDS_SINCE_EPOCH, new Date(0L));
            ArrayList<String> stringArrayList = bundle.getStringArrayList(NativeProtocol.EXTRA_PERMISSIONS);
            String string2 = bundle.getString(NativeProtocol.EXTRA_ACCESS_TOKEN);
            Date bundleLongAsDate2 = Utility.getBundleLongAsDate(bundle, NativeProtocol.EXTRA_DATA_ACCESS_EXPIRATION_TIME, new Date(0L));
            if (string2 == null || string2.length() == 0 || (string = bundle.getString(NativeProtocol.EXTRA_USER_ID)) == null || string.length() == 0) {
                return null;
            }
            return new AccessToken(string2, str, string, stringArrayList, null, null, accessTokenSource, bundleLongAsDate, new Date(), bundleLongAsDate2, bundle.getString("graph_domain"));
        }

        public final AccessToken createAccessTokenFromWebBundle(Collection<String> collection, Bundle bundle, AccessTokenSource accessTokenSource, String str) {
            Collection<String> collection2;
            ArrayList arrayList;
            ArrayList arrayList2;
            bundle.getClass();
            str.getClass();
            Date bundleLongAsDate = Utility.getBundleLongAsDate(bundle, AccessToken.EXPIRES_IN_KEY, new Date());
            String string = bundle.getString("access_token");
            if (string != null) {
                Date bundleLongAsDate2 = Utility.getBundleLongAsDate(bundle, AccessToken.DATA_ACCESS_EXPIRATION_TIME, new Date(0L));
                String string2 = bundle.getString("granted_scopes");
                if (string2 == null || string2.length() <= 0) {
                    collection2 = collection;
                } else {
                    String[] strArr = (String[]) up2.F(0, 6, string2, new String[]{","}).toArray(new String[0]);
                    collection2 = qv.d(Arrays.copyOf(strArr, strArr.length));
                }
                String string3 = bundle.getString("denied_scopes");
                if (string3 == null || string3.length() <= 0) {
                    arrayList = null;
                } else {
                    String[] strArr2 = (String[]) up2.F(0, 6, string3, new String[]{","}).toArray(new String[0]);
                    arrayList = qv.d(Arrays.copyOf(strArr2, strArr2.length));
                }
                String string4 = bundle.getString("expired_scopes");
                if (string4 == null || string4.length() <= 0) {
                    arrayList2 = null;
                } else {
                    String[] strArr3 = (String[]) up2.F(0, 6, string4, new String[]{","}).toArray(new String[0]);
                    arrayList2 = qv.d(Arrays.copyOf(strArr3, strArr3.length));
                }
                if (!Utility.isNullOrEmpty(string)) {
                    return new AccessToken(string, str, getUserIDFromSignedRequest(bundle.getString("signed_request")), collection2, arrayList, arrayList2, accessTokenSource, bundleLongAsDate, new Date(), bundleLongAsDate2, bundle.getString("graph_domain"));
                }
            }
            return null;
        }

        public final AuthenticationToken createAuthenticationTokenFromNativeLogin(Bundle bundle, String str) {
            bundle.getClass();
            String string = bundle.getString(NativeProtocol.EXTRA_AUTHENTICATION_TOKEN);
            if (string == null || string.length() == 0 || str == null || str.length() == 0) {
                return null;
            }
            try {
                return new AuthenticationToken(string, str);
            } catch (Exception e) {
                throw new FacebookException(e.getMessage());
            }
        }

        public final AuthenticationToken createAuthenticationTokenFromWebBundle(Bundle bundle, String str) {
            bundle.getClass();
            String string = bundle.getString("id_token");
            if (string == null || string.length() == 0 || str == null || str.length() == 0) {
                return null;
            }
            try {
                return new AuthenticationToken(string, str);
            } catch (Exception e) {
                throw new FacebookException(e.getMessage(), e);
            }
        }

        public final String getUserIDFromSignedRequest(String str) {
            if (str == null || str.length() == 0) {
                ey.i(LoginMethodHandler.NO_SIGNED_REQUEST_ERROR_MESSAGE);
                return null;
            }
            try {
                String[] strArr = (String[]) up2.F(0, 6, str, new String[]{"."}).toArray(new String[0]);
                if (strArr.length == 2) {
                    byte[] decode = Base64.decode(strArr[1], 0);
                    decode.getClass();
                    String string = new JSONObject(new String(decode, yt.b)).getString("user_id");
                    string.getClass();
                    return string;
                }
            } catch (UnsupportedEncodingException | JSONException unused) {
            }
            ey.i(LoginMethodHandler.NO_USER_ID_ERROR_MESSAGE);
            return null;
        }

        private Companion() {
        }
    }

    public LoginMethodHandler(LoginClient loginClient) {
        loginClient.getClass();
        setLoginClient(loginClient);
    }

    public void cancel() {
    }
}
