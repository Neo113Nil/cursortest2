package com.facebook.login;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import com.facebook.AccessToken;
import com.facebook.internal.ab;
import com.facebook.j;
import com.facebook.login.LoginClient;
import com.tapjoy.TapjoyConstants;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
abstract class LoginMethodHandler implements Parcelable {
    protected LoginClient loginClient;
    Map<String, String> methodLoggingExtras;

    void cancel() {
    }

    abstract String getNameForLogging();

    boolean needsInternetPermission() {
        return false;
    }

    boolean onActivityResult(int i, int i2, Intent intent) {
        return false;
    }

    void putChallengeParam(JSONObject jSONObject) throws JSONException {
    }

    abstract boolean tryAuthorize(LoginClient.Request request);

    LoginMethodHandler(LoginClient loginClient) {
        this.loginClient = loginClient;
    }

    LoginMethodHandler(Parcel parcel) {
        this.methodLoggingExtras = ab.a(parcel);
    }

    void setLoginClient(LoginClient loginClient) {
        if (this.loginClient != null) {
            throw new j("Can't set LoginClient if it is already set.");
        }
        this.loginClient = loginClient;
    }

    protected String getClientState(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("0_auth_logger_id", str);
            jSONObject.put("3_method", getNameForLogging());
            putChallengeParam(jSONObject);
        } catch (JSONException e) {
            Log.w("LoginMethodHandler", "Error creating client state json: " + e.getMessage());
        }
        return jSONObject.toString();
    }

    protected void addLoggingExtra(String str, Object obj) {
        if (this.methodLoggingExtras == null) {
            this.methodLoggingExtras = new HashMap();
        }
        this.methodLoggingExtras.put(str, obj == null ? null : obj.toString());
    }

    protected void logWebLoginCompleted(String str) {
        String applicationId = this.loginClient.getPendingRequest().getApplicationId();
        com.facebook.appevents.f c2 = com.facebook.appevents.f.c(this.loginClient.getActivity(), applicationId);
        Bundle bundle = new Bundle();
        bundle.putString("fb_web_login_e2e", str);
        bundle.putLong("fb_web_login_switchback_time", System.currentTimeMillis());
        bundle.putString(TapjoyConstants.TJC_APP_ID, applicationId);
        c2.a("fb_dialogs_web_login_dialog_complete", (Double) null, bundle);
    }

    static AccessToken createAccessTokenFromNativeLogin(Bundle bundle, com.facebook.c cVar, String str) {
        Date a2 = ab.a(bundle, "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH", new Date(0L));
        ArrayList<String> stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
        String string = bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN");
        if (ab.a(string)) {
            return null;
        }
        return new AccessToken(string, str, bundle.getString("com.facebook.platform.extra.USER_ID"), stringArrayList, null, cVar, a2, new Date());
    }

    public static AccessToken createAccessTokenFromWebBundle(Collection<String> collection, Bundle bundle, com.facebook.c cVar, String str) throws j {
        Date a2 = ab.a(bundle, "expires_in", new Date());
        String string = bundle.getString("access_token");
        String string2 = bundle.getString("granted_scopes");
        if (!ab.a(string2)) {
            collection = new ArrayList<>(Arrays.asList(string2.split(",")));
        }
        Collection<String> collection2 = collection;
        String string3 = bundle.getString("denied_scopes");
        ArrayList arrayList = !ab.a(string3) ? new ArrayList(Arrays.asList(string3.split(","))) : null;
        if (ab.a(string)) {
            return null;
        }
        return new AccessToken(string, str, getUserIDFromSignedRequest(bundle.getString("signed_request")), collection2, arrayList, cVar, a2, new Date());
    }

    private static String getUserIDFromSignedRequest(String str) throws j {
        if (str == null || str.isEmpty()) {
            throw new j("Authorization response does not contain the signed_request");
        }
        try {
            String[] split = str.split("\\.");
            if (split.length == 2) {
                return new JSONObject(new String(Base64.decode(split[1], 0), "UTF-8")).getString("user_id");
            }
        } catch (UnsupportedEncodingException | JSONException unused) {
        }
        throw new j("Failed to retrieve user_id from signed_request");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ab.a(parcel, this.methodLoggingExtras);
    }
}
