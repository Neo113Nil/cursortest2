package com.facebook.gamingservices.cloudgaming;

import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.AccessToken;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookException;
import com.facebook.GraphResponse;
import com.facebook.Profile;
import com.facebook.gamingservices.GamingPayload;
import com.facebook.gamingservices.cloudgaming.DaemonRequest;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKLogger;
import com.facebook.gamingservices.cloudgaming.internal.SDKMessageEnum;
import defpackage.ey;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class CloudGameLoginHandler {
    private static final int DEFAULT_TIMEOUT_IN_SEC = 5;
    private static boolean IS_RUNNING_IN_CLOUD = false;
    private static SDKLogger mLogger;

    private static List<String> convertPermissionsStringIntoPermissionsList(String str) {
        ArrayList arrayList = new ArrayList();
        if (!str.isEmpty()) {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.get(i).toString());
            }
        }
        return arrayList;
    }

    public static void gameLoadComplete(Context context, DaemonRequest.Callback callback) {
        DaemonRequest.executeAsync(context, (JSONObject) null, callback, SDKMessageEnum.MARK_GAME_LOADED);
    }

    public static synchronized AccessToken init(Context context, int i) {
        AccessToken currentAccessToken;
        synchronized (CloudGameLoginHandler.class) {
            if (i <= 0) {
                i = 5;
            }
            if (!isCloudEnvReady(context, i)) {
                throw new FacebookException("Not running in Cloud environment.");
            }
            mLogger = SDKLogger.getInstance(context);
            GraphResponse executeAndWait = DaemonRequest.executeAndWait(context, null, SDKMessageEnum.GET_ACCESS_TOKEN, i);
            if (executeAndWait == null || executeAndWait.getJSONObject() == null) {
                throw new FacebookException("Cannot receive response.");
            }
            if (executeAndWait.getError() != null) {
                throw new FacebookException(executeAndWait.getError().getErrorMessage());
            }
            setPackageName(executeAndWait.getJSONObject(), context);
            try {
                currentAccessToken = setCurrentAccessToken(executeAndWait.getJSONObject());
                GamingPayload.loadPayloadFromCloudGame(executeAndWait.getJSONObject().optString("payload"));
                Profile.fetchProfileForCurrentAccessToken();
                IS_RUNNING_IN_CLOUD = true;
                mLogger.logLoginSuccess();
            } catch (JSONException e) {
                throw new FacebookException("Cannot properly handle response.", e);
            }
        }
        return currentAccessToken;
    }

    private static boolean isCloudEnvReady(Context context, int i) {
        GraphResponse executeAndWait = DaemonRequest.executeAndWait(context, null, SDKMessageEnum.IS_ENV_READY, i);
        return (executeAndWait == null || executeAndWait.getJSONObject() == null || executeAndWait.getError() != null) ? false : true;
    }

    public static boolean isRunningInCloud() {
        return IS_RUNNING_IN_CLOUD;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.util.Date] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.util.Date] */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v9 */
    private static AccessToken setCurrentAccessToken(JSONObject jSONObject) {
        String str;
        long j;
        Date date;
        String str2;
        List<String> list;
        String str3;
        Date date2;
        ?? r11;
        ?? r12;
        List<String> list2;
        AccessTokenSource accessTokenSource;
        String optString = jSONObject.optString(SDKConstants.PARAM_ACCESS_TOKEN);
        String optString2 = jSONObject.optString(SDKConstants.PARAM_ACCESS_TOKEN_SOURCE);
        String optString3 = jSONObject.optString(SDKConstants.PARAM_APP_ID);
        String optString4 = jSONObject.optString(SDKConstants.PARAM_DECLINED_PERMISSIONS);
        String optString5 = jSONObject.optString(SDKConstants.PARAM_EXPIRED_PERMISSIONS);
        String optString6 = jSONObject.optString(SDKConstants.PARAM_EXPIRATION_TIME);
        String optString7 = jSONObject.optString(SDKConstants.PARAM_DATA_ACCESS_EXPIRATION_TIME);
        String optString8 = jSONObject.optString(SDKConstants.PARAM_GRAPH_DOMAIN);
        String optString9 = jSONObject.optString(SDKConstants.PARAM_LAST_REFRESH_TIME);
        String optString10 = jSONObject.optString("permissions");
        String optString11 = jSONObject.optString(SDKConstants.PARAM_USER_ID);
        String optString12 = jSONObject.optString(SDKConstants.PARAM_SESSION_ID);
        if (optString.isEmpty() || optString3.isEmpty() || optString11.isEmpty()) {
            return null;
        }
        SDKLogger sDKLogger = mLogger;
        if (sDKLogger != null) {
            sDKLogger.setAppID(optString3);
            mLogger.setUserID(optString11);
            mLogger.setSessionID(optString12);
        }
        List<String> convertPermissionsStringIntoPermissionsList = convertPermissionsStringIntoPermissionsList(optString10);
        List<String> convertPermissionsStringIntoPermissionsList2 = convertPermissionsStringIntoPermissionsList(optString4);
        List<String> convertPermissionsStringIntoPermissionsList3 = convertPermissionsStringIntoPermissionsList(optString5);
        AccessTokenSource valueOf = !optString2.isEmpty() ? AccessTokenSource.valueOf(optString2) : null;
        if (optString6.isEmpty()) {
            str = null;
            j = 1000;
            date = null;
        } else {
            str = null;
            j = 1000;
            date = new Date(Integer.parseInt(optString6) * 1000);
        }
        Object date3 = !optString9.isEmpty() ? new Date(Integer.parseInt(optString9) * j) : str;
        Object date4 = !optString7.isEmpty() ? new Date(Integer.parseInt(optString7) * j) : str;
        if (optString8.isEmpty()) {
            str2 = str;
            list = convertPermissionsStringIntoPermissionsList3;
            str3 = optString11;
            date2 = date;
            r11 = date3;
            r12 = date4;
            list2 = convertPermissionsStringIntoPermissionsList;
            accessTokenSource = valueOf;
        } else {
            str2 = optString8;
            date2 = date;
            list = convertPermissionsStringIntoPermissionsList3;
            r12 = date4;
            str3 = optString11;
            accessTokenSource = valueOf;
            r11 = date3;
            list2 = convertPermissionsStringIntoPermissionsList;
        }
        AccessToken accessToken = new AccessToken(optString, optString3, str3, list2, convertPermissionsStringIntoPermissionsList2, list, accessTokenSource, date2, r11, r12, str2);
        AccessToken.setCurrentAccessToken(accessToken);
        return accessToken;
    }

    private static void setPackageName(JSONObject jSONObject, Context context) {
        String optString = jSONObject.optString(SDKConstants.PARAM_DAEMON_PACKAGE_NAME);
        if (optString.isEmpty()) {
            ey.i("Could not establish a secure connection.");
            return;
        }
        SharedPreferences.Editor edit = context.getSharedPreferences(SDKConstants.PREF_DAEMON_PACKAGE_NAME, 0).edit();
        edit.putString(SDKConstants.PARAM_DAEMON_PACKAGE_NAME, optString);
        edit.commit();
    }

    public static synchronized AccessToken init(Context context) {
        AccessToken init;
        synchronized (CloudGameLoginHandler.class) {
            init = init(context, 5);
        }
        return init;
    }
}
